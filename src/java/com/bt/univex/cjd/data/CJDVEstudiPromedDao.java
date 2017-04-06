package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class CJDVEstudiPromedDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVEstudiPromed";
        PkeyName = "FkeyEstudian";
        DescName = "null";
        CodeName = "null";
        AliasName = "EstuPromV";
        deepLevel = 2;
        setXPracPkeyEnti(133603);
        loadInfoEntity();
    }

    public CJDVEstudiPromedDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVEstudiPromedDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVEstudiPromedDto getDefaultDto()  {
     CJDVEstudiPromedDto dto = new CJDVEstudiPromedDto(); 
     dto.setFkeyEstudian(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVEstudiPromedDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("PromCarrEstu", "PromCarrEstu", "S",1),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVEstudiPromedDto newDto = (CJDVEstudiPromedDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

