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

public class CJD_AnexosPeritaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_AnexosPerita";
        PkeyName = "PkeyAnexPeri";
        DescName = "null";
        CodeName = "null";
        AliasName = "AnexPeri";
        deepLevel = 2;
        setXPracPkeyEnti(186703);
        loadInfoEntity();
    }

    public CJD_AnexosPeritaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_AnexosPeritaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_AnexosPeritaDto getDefaultDto()  {
     CJD_AnexosPeritaDto dto = new CJD_AnexosPeritaDto(); 
     dto.setPkeyAnexPeri(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_AnexosPeritaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAnexPeri", "PkeyAnexPeri", "N",2),
        new InfoPack("FkeyClasObse", "FkeyClasObse", "N",3),
        new InfoPack("FkeyPeriCons", "FkeyPeriCons", "N",3),
        new InfoPack("InfoAnexPeri", "Información", "S",4),
        new InfoPack("FechModiAnex", "Fecha", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_AnexosPeritaDto newDto = (CJD_AnexosPeritaDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

