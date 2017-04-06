package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_EstudiPeritaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_EstudiPerita";
        PkeyName = "PkeyEstuPeri";
        DescName = "null";
        CodeName = "null";
        AliasName = "EstuPeri";
        deepLevel = 2;
        setXPracPkeyEnti(186403);
        loadInfoEntity();
    }

    public CJD_EstudiPeritaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_EstudiPeritaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_EstudiPeritaDto getDefaultDto()  {
     CJD_EstudiPeritaDto dto = new CJD_EstudiPeritaDto(); 
     dto.setPkeyEstuPeri(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_EstudiPeritaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyEstuPeri", "PkeyEstuPeri", "N",2),
        new InfoPack("FkeyPeriCons", "FkeyPeriCons", "N",3),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FechAsigPeri", "Fecha", "D",7),
        new InfoPack("FechEntrPeri", "Fecha", "D",7),
        new InfoPack("NotaPeritaje", "NotaPeritaje", "F",12),
        new InfoPack("FechNotaPeri", "Fecha Calificación", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_EstudiPeritaDto newDto = (CJD_EstudiPeritaDto) dto;
    if (getDeepLevel() != 0) {
      CJD_PeritaConsulDao fkeyPeriConsDao = new CJD_PeritaConsulDao(); 
      newDto.setFkeyPeriConsDto((CJD_PeritaConsulDto)fkeyPeriConsDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriCons")), getDeepLevel()-1));
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
    }
    return newDto;
  }
}

