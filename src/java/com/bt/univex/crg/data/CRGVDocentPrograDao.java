package com.bt.univex.crg.data;

import java.sql.*;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.crg.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class CRGVDocentPrograDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CRGVDocentProgra";
        PkeyName = "PkeyProfesor";
        DescName = "NombCompProf";
        CodeName = "CodiDoceUniv";
        AliasName = "DoceProg";
        deepLevel = 2;
        setXPracPkeyEnti(44903);
        loadInfoEntity();
    }

    public CRGVDocentPrograDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CRGVDocentPrograDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CRGVDocentPrograDto getDefualtDto()  {
     CRGVDocentPrograDto dto = new CRGVDocentPrograDto(); 
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
        return new CRGVDocentPrograDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyProfesor", "PkeyProfesor", "N",2),
        new InfoPack("PkeyDoceProg", "PkeyDoceProg", "N",2),
        new InfoPack("FkeyUnidAcad", "FkeyUnidAcad", "N",3),
        new InfoPack("FkeyProgAcad", "FkeyProgAcad", "N",3),
        new InfoPack("FkeyDoceUniv", "FkeyDoceUniv", "N",3),
        new InfoPack("FkeyProfesor", "FkeyProfesor", "N",3),
        new InfoPack("CodiDoceUniv", "Código/Cédula", "N",9),
        new InfoPack("EstaActiProf", "¿Está Activo?", "S",6),
        new InfoPack("EstaActiDoce", "EstaActiDoce", "S",6),
        new InfoPack("NombCompProf", "Nombre", "S",1),
        new InfoPack("TipoDediDoce", "Tipo Dedicación", "S",6),
        new InfoPack("LogiAcceSist", "Login", "S",1),
        new InfoPack("PassAcceSist", "Password", "S",1),
        new InfoPack("MailProfesor", "eMail", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CRGVDocentPrograDto newDto = (CRGVDocentPrograDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

