package com.bt.inicio.login;

import com.bt.univex.ads.data.ADS_EstudiUniverDao;
import com.bt.univex.ads.data.ADS_EstudiUniverDto;
import com.bt.univex.def.data.DEFVPeriPlanProgDao;
import com.bt.univex.def.data.DEFVPeriPlanProgDto;
import com.xpc.base.BaseDto;
import com.xpc.base.TWebPage;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDao;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDto; 
import com.xpc.connect.BaseConnection;

public class EstuAcceLogic extends GenericAccessLogic {

    public final static String ID_ESTUDIANTE="ESTUDIANTE";
    public final static String ID_PERIODO="PERIODO";    
    
    private ADS_EstudiUniverDto estuDto;
    
    public EstuAcceLogic(BaseConnection bCon) {
        super(bCon);
    }
    
    @Override
    public BaseDto getUser(String user, String pass) {
        // Verifica si los textos son validos
        if (!"".equals(getInvalidChars(user))) {
            error("Uso de caracteres invalidos ",10,false);
            return null;
        }
        if (!"".equals(getInvalidChars(pass))) {
            error("Uso de caracteres invalidos ",20,false);
            return null;
        }
//        String decode = encrypt(pass);
        
        ADS_EstudiUniverDao estuDao = new ADS_EstudiUniverDao();
        // Busca el docente a ver si existe
        estuDao.setConditions("logiAcceSist = '"+user.trim()+"'");
        estuDto = (ADS_EstudiUniverDto) estuDao.findFirst();
        // Si no existe sale
        if (estuDto == null) {
            error("Usuario / Clave invalidos",30,false);
            return null;
        }
        // Compara la clave
                // Clave ok y Si esta inactivo lo notifica

        if (estuDto.getClavAcceSistNn().equals(pass)) {
            if (!estuDto.getEstaActiEstuBool()) {
                error("El Usuario esta inactivo",40,false);
                return null;
            }
            return estuDto;
        } else {
            error("Usuario/Clave invalidos",35,false);
            return null;            
        }
    }    

    void saveInfo(TWebPage wp) {
        // Salva el User y lo demas
        SEG_UsuariSistemDao usuaDao = new SEG_UsuariSistemDao();
        // Amarra el usuario docente
//        wp.getBSession().setUser((SEG_UsuariSistemDto) usuaDao.findDtoByPkey(7, 2));
        wp.getBSession().setUser((new SEG_UsuariSistemDao()).userConvert((SEG_UsuariSistemDto) usuaDao.findDtoByPkey(7, 2)));
        // Toma al docente y lo guarda en los parametros
        wp.getBSession().setParameter(ID_ESTUDIANTE,""+estuDto.getPkeyEstudianNn());
        // Ubica el periodo activo ... Ummmm... 
        DEFVPeriPlanProgDao pppDao = new DEFVPeriPlanProgDao();
        pppDao.setConditions("FkeyProgAcad=2 And IndiActiNota='S' ");
        pppDao.setOrderBy("FkeyPeriAcad desc");
        DEFVPeriPlanProgDto pppDto = (DEFVPeriPlanProgDto) pppDao.findFirst();
        if (pppDto == null) {
            // se enruta una pantalla de error
            return;
        }        
        wp.getBSession().setParameter(ID_PERIODO,""+pppDto.getFkeyPeriAcadNn());
        
    }
    
    
}
