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

public class CJDVPeritaConsulDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVPeritaConsul";
        PkeyName = "PkeyPeriCons";
        DescName = "null";
        CodeName = "null";
        AliasName = "PeriConV";
        deepLevel = 2;
        setXPracPkeyEnti(186303);
        loadInfoEntity();
    }

    public CJDVPeritaConsulDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVPeritaConsulDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVPeritaConsulDto getDefaultDto()  {
     CJDVPeritaConsulDto dto = new CJDVPeritaConsulDto(); 
     dto.setPkeyPeriCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVPeritaConsulDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPeriCons", "PkeyPeriCons", "N",2),
        new InfoPack("NombPeritaje", "Nombre", "S",1),
        new InfoPack("AreaPeritaje", "AreaPeritaje", "S",1),
        new InfoPack("DescPeritaje", "Descripción", "S",4),
        new InfoPack("NumePeritaje", "Numero", "N",3),
        new InfoPack("EstaPeritaje", "Estado", "S",6),
        new InfoPack("OrigPeriCons", "OrigPeriCons", "S",1),
        new InfoPack("FkeyPeriPlan", "fkeyPeriPlan", "N",3),
        new InfoPack("FkeyDoceEspe", "FkeyDoceEspe", "N",3),
        new InfoPack("NombCompProf", "Nombre", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVPeritaConsulDto newDto = (CJDVPeritaConsulDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

