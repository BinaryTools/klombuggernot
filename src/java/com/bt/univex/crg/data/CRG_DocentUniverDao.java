package com.bt.univex.crg.data;

import com.xpc.base.BaseDao;
import com.xpc.base.BaseDto;
import com.xpc.base.InfoPack;
import com.xpc.binarytool.univex.connect.Connect;
import com.xpc.connect.BaseConnection;
import java.util.ArrayList;
import java.util.Arrays;

public class CRG_DocentUniverDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CRG_DocentUniver";
        PkeyName = "PkeyProfesor";
        DescName = "NombCompProf";
        CodeName = "CodiDoceUniv";
        AliasName = "Profesor";
        deepLevel = 2;
        setXPracPkeyEnti(15603);
        loadInfoEntity();
    }

    public CRG_DocentUniverDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CRG_DocentUniverDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CRG_DocentUniverDto getDefaultDto()  {
     CRG_DocentUniverDto dto = new CRG_DocentUniverDto(); 
     dto.setPkeyProfesor(0);
     dto.setFkeyDoceUniv( new Integer(0));
     dto.setEstaActiProf("S");
     dto.setTipoDediDoce("P");
     dto.setLogiAcceSist("NO ASIGNADO");
     dto.setPassAcceSist("NO ASIGNADO");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CRG_DocentUniverDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyProfesor", "PkeyProfesor", "N",2),
        new InfoPack("FkeyUnidAcad", "FkeyUnidAcad", "N",3),
        new InfoPack("FkeyDoceUniv", "FkeyDoceUniv", "N",3),
        new InfoPack("CodiDoceUniv", "Cédula", "N",9),
        new InfoPack("EstaActiProf", "¿Está Activo?", "S",6),
        new InfoPack("NombCompProf", "Nombre completo", "S",1),
        new InfoPack("TipoDediDoce", "Tipo Dedicación", "S",6),
        new InfoPack("LogiAcceSist", "Login", "S",1),
        new InfoPack("PassAcceSist", "Password", "S",1),
        new InfoPack("MailProfesor", "eMail", "S",1),
        new InfoPack("PrimApelProf", "Primer Apellido", "S",1),
        new InfoPack("SeguApelProf", "Segundo Apellido", "S",1),
        new InfoPack("TipoDocuProf", "Tipo Documento", "S",6),
        new InfoPack("FkeyMuniDocu", "FkeyMuniDocu", "N",3),
        new InfoPack("FkeyEscaDoce", "FkeyEscaDoce", "N",3),
        new InfoPack("NombProfesor", "Nombre Profesor", "S",1),
        new InfoPack("TipoDoceHoja", "Tipo Docente", "S",6)      }
        ));
    }

//  @Override
//  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
//    CRG_DocentUniverDto newDto = (CRG_DocentUniverDto) dto;
//    if (getDeepLevel() != 0) {
//      PRF_EscalaDocentDao fkeyEscaDoceDao = new PRF_EscalaDocentDao(); 
//      newDto.setFkeyEscaDoceDto((PRF_EscalaDocentDto)fkeyEscaDoceDao.findDtoByPkey(new Integer(rs.getInt("fkeyEscaDoce")), getDeepLevel()-1));
//    }
//    return newDto;
//  }
}

