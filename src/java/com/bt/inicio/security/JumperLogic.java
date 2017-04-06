/*
 * Code: XPC-SEG1000 
 */
package com.bt.inicio.security;

import com.xpc.base.BaseLogic;
import com.xpc.binarytool.univex.data.SEG_ContJumpWeb_Dao;
import com.xpc.binarytool.univex.data.SEG_ContJumpWeb_Dto;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDao;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDto;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;

/**
 *
 * @author alex
 */

public class JumperLogic extends BaseLogic {
    // 
    private SEG_UsuariSistemDto usuarioDto;
    private SEG_ContJumpWeb_Dto lastJumpDto;
    private PageParameters parametros;
    private String informacion; // Informaci�n adicional del salto, como la clase a la cual ejecutar 
    public JumperLogic() {
        usuarioDto=null;
        lastJumpDto=null;
        parametros = null;
        informacion = null;
    }
    // Inicializa los datos necesarios para realizar un salto
    public String iniciarSalto(SEG_UsuariSistemDto usuaDto, PageParameters pp) {
        // Crea registro y lo guarda en la bdd retorna 
        SEG_ContJumpWeb_Dao jumpDao = new SEG_ContJumpWeb_Dao();
        SEG_ContJumpWeb_Dto jumpDto = SEG_ContJumpWeb_Dao.getDefualtDto();
        int Pkey;
        try {
            Pkey = jumpDao.findNextSecuence("SEC_"+jumpDao.getTableName());
        } catch (SQLException ex) {
            error("XPC-SEG1001.No logro generar llave de salto.."+ex,1001,false);
            return "";
        }
        jumpDto.setPkeyContJump(new Integer(Pkey));
        jumpDto.setFkeyUsuaSist(usuaDto.getPkeyUsuaSist());
        jumpDto.setFechInicJump(new java.util.Date());
        jumpDto.setMiliSeguJump(new Double(System.currentTimeMillis()));
        jumpDto.setInfoAdicJump(tokenizarParams(pp)); //pp.values().toString()
        jumpDto.setEstaContJump("C");
        try {
            jumpDao.insert(jumpDto);
        } catch (SQLException ex) {
            error("XPC-SEG1002.No logro insertar datos del salto.. "+ex,1002,false);
            return "";
        }        
        return encriptaParametro(""+Pkey);
    }
//    com.bt.univex.tree.menus_seguridad.event.VinculSistemGridEvent,
    public String tokenizarParams(PageParameters pp) {
        String res = "";
//        Iterator it = pp.values().iterator();
        Iterator it = pp.getAllNamed().iterator();
        while (it.hasNext()) {
            String par = (String)it.next();
            res += !"".equals(res)?",":""; // Para el segundo en adelante agrega coma             
            res +=par;
        }
        return res;
    }
    // Recibe un salto y verifica si es autentico
    public boolean recibeSalto(String key) {
//        if (key.equals("cl0ud_VS_s3f1r0")) { // Llave para pruebas
//            return true;
//        }
        key = desencriptaParametro(key);
        int pkey = 0;
        try {
          pkey = Integer.parseInt(key);
        } catch (Exception ex){}
        if (pkey==0) {
            error("XPC-SEG1003. Llave erronea, no es entera",1000,false);
            return false;
        }
        // Busca el la bdd el pkey
        SEG_ContJumpWeb_Dao jumpDao = new SEG_ContJumpWeb_Dao();
        jumpDao.setConditions("PkeyContJump="+pkey);        
        lastJumpDto = (SEG_ContJumpWeb_Dto)jumpDao.findFirst();
        if (lastJumpDto==null) {
            error("XPC-SEG1004. Llave erronea, no ubicada en la base de datos",1000,false);
            return false;        
        }        
        // Obtiene la fecha y la verifica con la del sistema , con lapso de medio minuto
        if (System.currentTimeMillis() - lastJumpDto.getMiliSeguJump() > 30000) {
            error("XPC-SEG1005. El lapso del salto es superior a medio minuto.",1000,false);
            return false;
        }
        // El salto es correcto 
        return true;
    }
    
    // Por seguridad encriptacion simple de un parametro tipo texto
    public String encriptaParametro(String parametro) {
/*        String result = "";
        for (int i=0;i<parametro.length();i++) {
            int pos = parametro.charAt(i);
            result += D._N_.charAt(pos);
        }        
        return result; */
        return parametro;
    }
    
    public String desencriptaParametro(String cripto) {
        return cripto;
    }
    
    // Carga los valores del salto para el metodo que lo va a procesar
    public boolean completarSalto() {
      if (lastJumpDto==null) {
          error("XPC-SEG1006. No se ha verificado la autenticidad del salto.",1000,false);
          return false;
      }
      // Carga el usuario 
      usuarioDto = lastJumpDto.getSEG_UsuariSistemDto();
      if (usuarioDto==null) {
        SEG_UsuariSistemDao localDao = new SEG_UsuariSistemDao();
        usuarioDto = (SEG_UsuariSistemDto) localDao.findDtoByPkey(lastJumpDto.getFkeyUsuaSist() , 1);
        if (usuarioDto == null) {
          error("XPC-SEG1007.(completarSalto) El usuario del salto no fue ubicado en la bdd...",1000,false);
          return false;
        }          
      }
      // carga los parametros      
      String params = lastJumpDto.getInfoAdicJumpNn();
      StringTokenizer st = new StringTokenizer(params);
      if (st==null) {
          warning("XPC-SEG1008.Sin parametros");
          return true; 
      }
      // Siempre la classe debe ser el primer parametro y si no tiene viene en "none"
      parametros = new PageParameters();
      // Se nombran con numeros de 1 en adelante
      int i=1; 
      while (st.hasMoreElements()) {
          parametros.add(String.valueOf(i), st.nextToken());
          i++;                 
      }        
      return true;    
    }
    
    // procesa los datos del salto en caso de recibir una clase especifica a la cual ejecutar
    // como el logic debe ser independiente a la plataforma, no se verifica aqui si es de wicket
    // en caso de ser .net, php, jsp o servlet's comunes se implementa el llamado por cada uno
    public boolean verificarMetodo(){
        if (parametros == null ){
            // sale en falso sin error, por que no hay nada que invocar
            return false;
        }
        StringValue metodo = parametros.get("1");
        if (metodo.equals("none")) {
            return false;
        }
                
        Class forName;
        try {
            forName = (Class<WebPage>) Class.forName(metodo.toString());
        } catch (ClassNotFoundException ex) {
            error("XPC-SEG1009. Metodo invocado en el salto no fue encontrado:"+metodo,ex,1000,false);
            return false;        
        }

        return true;
    }

    public SEG_UsuariSistemDto getUsuarioDto() { return usuarioDto; }
    public SEG_ContJumpWeb_Dto getLastJumpDto() { return lastJumpDto; }
    public PageParameters getParametros() { return parametros; }
    public String getInformacion() {return informacion; }
        
}
