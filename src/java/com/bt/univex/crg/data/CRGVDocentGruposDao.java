package com.bt.univex.crg.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.crg.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class CRGVDocentGruposDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CRGVDocentGrupos";
        PkeyName = "PkeyDoceGrup";
        DescName = "NombCompProf";
        CodeName = "null";
        AliasName = "DoceGrup";
        deepLevel = 2;
        setXPracPkeyEnti(45903);
        loadInfoEntity();
    }

    public CRGVDocentGruposDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CRGVDocentGruposDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CRGVDocentGruposDto getDefaultDto()  {
     CRGVDocentGruposDto dto = new CRGVDocentGruposDto(); 
     dto.setPkeyDoceGrup(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CRGVDocentGruposDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyDoceGrup", "PkeyDoceGrup", "N",2),
        new InfoPack("PkeyProfesor", "PkeyProfesor", "N",3),
        new InfoPack("FkeyProfesor", "FkeyProfesor", "N",3),
        new InfoPack("FkeyUnidAcad", "FkeyUnidAcad", "N",3),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("NombCompProf", "Nombre", "S",1),
        new InfoPack("NombMomento_", "Momento", "S",1),
        new InfoPack("OrdeDebeReci", "Orden", "N",5),
        new InfoPack("TipoMomento_", "Tipo", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CRGVDocentGruposDto newDto = (CRGVDocentGruposDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

