package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.def.data.* ;
import com.bt.univex.cjd.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_PeritaConsulDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_PeritaConsul";
        PkeyName = "PkeyPeriCons";
        DescName = "null";
        CodeName = "null";
        AliasName = "PeriCosu";
        deepLevel = 2;
        setXPracPkeyEnti(185703);
        loadInfoEntity();
    }

    public CJD_PeritaConsulDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_PeritaConsulDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_PeritaConsulDto getDefaultDto()  {
     CJD_PeritaConsulDto dto = new CJD_PeritaConsulDto(); 
     dto.setPkeyPeriCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_PeritaConsulDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPeriCons", "PkeyPeriCons", "N",2),
        new InfoPack("NombPeritaje", "Nombre Peritaje", "S",1),
        new InfoPack("AreaPeritaje", "ÁreaPeritaje", "S",6),
        new InfoPack("DescPeritaje", "Descripción Peritaje", "S",4),
        new InfoPack("NumePeritaje", "Número Fiscalía", "S",1),
        new InfoPack("EstaPeritaje", "Estado Peritaje", "S",6),
        new InfoPack("FkeyDoceEspe", "FkeyDoceEspe", "N",3),
        new InfoPack("OrigPeriCons", "OrigPeriCons", "S",6),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_PeritaConsulDto newDto = (CJD_PeritaConsulDto) dto;
    if (getDeepLevel() != 0) {
      DEFVPeriPlanProgDao fkeyPeriPlanDao = new DEFVPeriPlanProgDao(); 
      newDto.setFkeyPeriPlanDto((DEFVPeriPlanProgDto)fkeyPeriPlanDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriPlan")), getDeepLevel()-1));
      CJDVDocentEspeciDao fkeyDoceEspeDao = new CJDVDocentEspeciDao(); 
      newDto.setFkeyDoceEspeDto((CJDVDocentEspeciDto)fkeyDoceEspeDao.findDtoByPkey(new Integer(rs.getInt("fkeyDoceEspe")), getDeepLevel()-1));
    }
    return newDto;
  }
}

