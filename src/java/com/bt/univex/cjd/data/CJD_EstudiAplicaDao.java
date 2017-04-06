package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_EstudiAplicaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_EstudiAplica";
        PkeyName = "PkeyEstuApli";
        DescName = "null";
        CodeName = "null";
        AliasName = "EstuApli";
        deepLevel = 2;
        setXPracPkeyEnti(129603);
        loadInfoEntity();
    }

    public CJD_EstudiAplicaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_EstudiAplicaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_EstudiAplicaDto getDefaultDto()  {
     CJD_EstudiAplicaDto dto = new CJD_EstudiAplicaDto(); 
     dto.setPkeyEstuApli(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_EstudiAplicaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyEstuApli", "PkeyEstuApli", "N",2),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FechCertEstu", "Fecha del Certificado", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_EstudiAplicaDto newDto = (CJD_EstudiAplicaDto) dto;
    if (getDeepLevel() != 0) {
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
    }
    return newDto;
  }
}

