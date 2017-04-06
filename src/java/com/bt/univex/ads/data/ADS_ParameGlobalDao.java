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

public class ADS_ParameGlobalDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_ParameGlobal";
        PkeyName = "PkeyParaGlob";
        DescName = "null";
        CodeName = "null";
        AliasName = "ParaGlob";
        deepLevel = 2;
        setXPracPkeyEnti(77303);
        loadInfoEntity();
    }

    public ADS_ParameGlobalDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_ParameGlobalDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_ParameGlobalDto getDefaultDto()  {
     ADS_ParameGlobalDto dto = new ADS_ParameGlobalDto(); 
     dto.setPkeyParaGlob(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_ParameGlobalDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyParaGlob", "PkeyParaGlob", "N",2),
        new InfoPack("NombParaGlob", "NombParaGlob", "S",1),
        new InfoPack("CodiParaGlob", "CodiParaGlob", "S",13),
        new InfoPack("DescParaGlob", "DescParaGlob", "S",4),
        new InfoPack("ValoParaGlob", "ValoParaGlob", "S",4),
        new InfoPack("EstaActiPara", "EstaActiPara", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_ParameGlobalDto newDto = (ADS_ParameGlobalDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

