package com.bt.univex.def.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.bt.univex.def.data.*;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class DEF_PlanesEstudiDao extends BaseDao {

    private void initializeDao() { 
        TableName = "DEF_PlanesEstudi";
        PkeyName = "PkeyPlanEstu";
        DescName = "DescPlanEstu";
        CodeName = "null";
        AliasName = "PlanEstu";
        deepLevel = 2;
        setXPracPkeyEnti(1503);
        loadInfoEntity();
    }

    public DEF_PlanesEstudiDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public DEF_PlanesEstudiDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static DEF_PlanesEstudiDto getDefaultDto()  {
     DEF_PlanesEstudiDto dto = new DEF_PlanesEstudiDto(); 
     dto.setPkeyPlanEstu(0);
     dto.setEstaActiPlan("S");
     dto.setModaPlanEstu("S");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new DEF_PlanesEstudiDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPlanEstu", "PkeyPlanEstu", "N",2),
        new InfoPack("FkeyProgAcad", "FkeyProgAcad", "N",3),
        new InfoPack("CodiPlanEstu", "Código", "N",5),
        new InfoPack("DescPlanEstu", "Descripción", "S",4),
        new InfoPack("EstaActiPlan", "¿Está Activo?", "S",6),
        new InfoPack("FkeyBloqTiem", "FkeyBloqTiem", "N",3),
        new InfoPack("ModaPlanEstu", "Modalidad", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    DEF_PlanesEstudiDto newDto = (DEF_PlanesEstudiDto) dto;
    if (getDeepLevel() != 0) {
      ADS_PrograAcademDao fkeyProgAcadDao = new ADS_PrograAcademDao(); 
      newDto.setFkeyProgAcadDto((ADS_PrograAcademDto)fkeyProgAcadDao.findDtoByPkey(new Integer(rs.getInt("fkeyProgAcad")), getDeepLevel()-1));
////      ADS_BloqueTiempoDao fkeyBloqTiemDao = new ADS_BloqueTiempoDao(); 
////      newDto.setFkeyBloqTiemDto((ADS_BloqueTiempoDto)fkeyBloqTiemDao.findDtoByPkey(new Integer(rs.getInt("fkeyBloqTiem")), getDeepLevel()-1));
    }
    return newDto;
  }
}

