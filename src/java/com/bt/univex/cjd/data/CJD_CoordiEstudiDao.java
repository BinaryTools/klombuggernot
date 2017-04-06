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
import com.bt.univex.crg.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_CoordiEstudiDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_CoordiEstudi";
        PkeyName = "PkeyCoorEstu";
        DescName = "null";
        CodeName = "null";
        AliasName = "CoorEstu";
        deepLevel = 2;
        setXPracPkeyEnti(129403);
        loadInfoEntity();
    }

    public CJD_CoordiEstudiDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_CoordiEstudiDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_CoordiEstudiDto getDefaultDto()  {
     CJD_CoordiEstudiDto dto = new CJD_CoordiEstudiDto(); 
     dto.setPkeyCoorEstu(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_CoordiEstudiDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyCoorEstu", "PkeyCoorEstu", "N",2),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("EstaCoorEstu", "¿Está activo?", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_CoordiEstudiDto newDto = (CJD_CoordiEstudiDto) dto;
    if (getDeepLevel() != 0) {
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
      CRG_Grupo_AsignaDao fkeyGrupAsigDao = new CRG_Grupo_AsignaDao(); 
      newDto.setFkeyGrupAsigDto((CRG_Grupo_AsignaDto)fkeyGrupAsigDao.findDtoByPkey(new Integer(rs.getInt("fkeyGrupAsig")), getDeepLevel()-1));
    }
    return newDto;
  }
}

