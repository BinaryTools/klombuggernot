package com.bt.univex.crg.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.bt.univex.def.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CRG_Grupo_Nivel_Dao extends BaseDao {

    private void initializeDao() { 
        TableName = "CRG_Grupo_Nivel_";
        PkeyName = "PkeyGrupNive";
        DescName = "null";
        CodeName = "null";
        AliasName = "GrupNive";
        deepLevel = 2;
        setXPracPkeyEnti(7703);
        loadInfoEntity();
    }

    public CRG_Grupo_Nivel_Dao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CRG_Grupo_Nivel_Dao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CRG_Grupo_Nivel_Dto getDefaultDto()  {
     CRG_Grupo_Nivel_Dto dto = new CRG_Grupo_Nivel_Dto(); 
     dto.setPkeyGrupNive(0);
     dto.setNiveDentPlan( new Integer(1));
     dto.setOrdeGrupNive( new Integer(2));
     dto.setTipoGrupNive("N");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CRG_Grupo_Nivel_Dto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyGrupNive", "PkeyGrupNive", "N",2),
        new InfoPack("FkeyBloqTiem", "FkeyBloqTiem", "N",3),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("NombGrupNive", "Identificación", "S",1),
        new InfoPack("NiveDentPlan", "Nivel", "N",5),
        new InfoPack("OrdeGrupNive", "Orden del Grupo", "N",5),
        new InfoPack("TipoGrupNive", "Tipo Grupo", "S",6),
        new InfoPack("CupoMiniGrup", "CupoMiniGrup", "N",5),
        new InfoPack("CupoMaxiGrup", "CupoMaxiGrup", "N",5)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CRG_Grupo_Nivel_Dto newDto = (CRG_Grupo_Nivel_Dto) dto;
    if (getDeepLevel() != 0) {
//      ADS_BloqueTiempoDao fkeyBloqTiemDao = new ADS_BloqueTiempoDao(); 
//      newDto.setFkeyBloqTiemDto((ADS_BloqueTiempoDto)fkeyBloqTiemDao.findDtoByPkey(new Integer(rs.getInt("fkeyBloqTiem")), getDeepLevel()-1));
      DEFVPeriPlanProgDao fkeyPeriPlanDao = new DEFVPeriPlanProgDao(); 
      newDto.setFkeyPeriPlanDto((DEFVPeriPlanProgDto)fkeyPeriPlanDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriPlan")), getDeepLevel()-1));
    }
    return newDto;
  }
}

