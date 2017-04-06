package com.bt.inicio.login;

import com.bt.univex.crg.data.CRG_DocentUniverDao;
import com.bt.univex.crg.data.CRG_DocentUniverDto;
import com.bt.univex.def.data.DEFVPeriPlanProgDao;
import com.bt.univex.def.data.DEFVPeriPlanProgDto;
import com.xpc.base.BaseDto;
import com.xpc.base.TWebPage;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDao;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDto; 
import com.xpc.connect.BaseConnection;

public class DoceAcceLogic extends GenericAccessLogic {

    public final static String ID_DOCENTE="DOCENTE";
    public final static String ID_PERIODO="PERIODO";
    
    
    private CRG_DocentUniverDto doceDto;
    
    public DoceAcceLogic(BaseConnection bCon) {
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
        String decodeNew = encryptNew(pass);
        String decodeOld = encryptOld(pass);
        
        CRG_DocentUniverDao doceDao = new CRG_DocentUniverDao();
        // Busca el docente a ver si existe
        doceDao.setConditions("logiAcceSist = '"+user.trim()+"'");
        doceDto = (CRG_DocentUniverDto) doceDao.findFirst();
        // Si no existe sale
        if (doceDto == null) {
            error("Usuario / Clave invalidos",30,false);
            return null;
        }
        // Compara la clave
                // Clave ok y Si esta inactivo lo notifica
        
        if (doceDto.getPassAcceSistNn().equals(decodeOld)) {            
            if (!doceDto.getEstaActiProfBool()) {
                error("El Usuario esta inactivo, por favor acercquese a la Div. de Registro Académico",40,false);
                return null;
            }
            return doceDto;
        } else {
            if (doceDto.getPassAcceSistNn().equals(decodeNew)) {
                if (!doceDto.getEstaActiProfBool()) {
                    error("El Usuario esta inactivo, por favor acercquese a la Div. de Registro Académico", 40, false);
                    return null;
                }
                return doceDto;
            }
            error("Usuario/Clave invalidos",35,false);
            return null;            
        }
    }    

    void saveInfo(TWebPage wp) {
        // Salva el User y lo demas
        SEG_UsuariSistemDao usuaDao = new SEG_UsuariSistemDao();
        // Amarra el usuario docente
        wp.getBSession().setUser((new SEG_UsuariSistemDao()).userConvert((SEG_UsuariSistemDto) usuaDao.findDtoByPkey(7, 2)));
        // Toma al docente y lo guarda en los parametros
        wp.getBSession().setParameter(ID_DOCENTE,""+doceDto.getPkeyProfesorNn());
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

    public CRG_DocentUniverDto getDoceDto() {
        return doceDto;
    }

    public void setDoceDto(CRG_DocentUniverDto doceDto) {
        this.doceDto = doceDto;
    }
    
    
}
