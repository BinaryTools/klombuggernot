package com.bt.univex.ads.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class ADSVLocaliMuniciDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADSVLocaliMunici";
        PkeyName = "PkeyLocaMuni";
        DescName = "null";
        CodeName = "null";
        AliasName = "LocaMuniV";
        deepLevel = 2;
        setXPracPkeyEnti(131603);
        loadInfoEntity();
    }

    public ADSVLocaliMuniciDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADSVLocaliMuniciDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADSVLocaliMuniciDto getDefaultDto()  {
     ADSVLocaliMuniciDto dto = new ADSVLocaliMuniciDto(); 
     dto.setPkeyLocaMuni(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADSVLocaliMuniciDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyLocaMuni", "PkeyLocaMuni", "N",2),
        new InfoPack("FkeyDepartam", "FkeyDepartam", "N",3),
        new InfoPack("CodiMunicipi", "Código", "S",13),
        new InfoPack("NombMunicipi", "Nombre", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADSVLocaliMuniciDto newDto = (ADSVLocaliMuniciDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

