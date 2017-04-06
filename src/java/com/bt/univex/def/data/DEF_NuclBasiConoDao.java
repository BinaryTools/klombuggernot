package com.bt.univex.def.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.def.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class DEF_NuclBasiConoDao extends BaseDao {

    private void initializeDao() { 
        TableName = "DEF_NuclBasiCono";
        PkeyName = "PkeyNuclBasi";
        DescName = "DescNuclBasi";
        CodeName = "CodiNuclBasi";
        AliasName = "NuclBasi";
        deepLevel = 2;
        setXPracPkeyEnti(53003);
        loadInfoEntity();
    }

    public DEF_NuclBasiConoDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public DEF_NuclBasiConoDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static DEF_NuclBasiConoDto getDefaultDto()  {
     DEF_NuclBasiConoDto dto = new DEF_NuclBasiConoDto(); 
     dto.setPkeyNuclBasi(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new DEF_NuclBasiConoDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyNuclBasi", "PkeyNuclBasi", "N",2),
        new InfoPack("CodiNuclBasi", "CodiNuclBasi", "S",13),
        new InfoPack("DescNuclBasi", "DescNuclBasi", "S",1),
        new InfoPack("AreaNuclBasi", "AreaNuclBasi", "S",13),
        new InfoPack("EspcNuclBasi", "EspcNuclBasi", "S",13)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    DEF_NuclBasiConoDto newDto = (DEF_NuclBasiConoDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

