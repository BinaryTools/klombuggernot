package com.bt.univex.def.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class DEF_PlanAsignatuDao extends BaseDao {

    private void initializeDao() { 
        TableName = "DEF_PlanAsignatu";
        PkeyName = "PkeyAsigPlan";
        DescName = "null";
        CodeName = "null";
        AliasName = "PlanAsig";
        deepLevel = 2;
        setXPracPkeyEnti(7203);
        loadInfoEntity();
    }

    public DEF_PlanAsignatuDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public DEF_PlanAsignatuDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static DEF_PlanAsignatuDto getDefaultDto()  {
     DEF_PlanAsignatuDto dto = new DEF_PlanAsignatuDto(); 
     dto.setPkeyAsigPlan(0);
     dto.setFkeyTipoForm( new Integer(0));
     dto.setNumeCredPlan( new Integer(1));
     dto.setNiveDondImpa( new Integer(1));
     dto.setTipoPermPlan("N");
     dto.setTipoAsigPlan("T");
     dto.setEsunAsigObli("S");
     dto.setTotaHoraTeor( new Integer(0));
     dto.setTotaHoraPrac( new Integer(0));
     dto.setHoraTeorPrac( new Integer(0));
     dto.setEsunAsigVali("N");
     dto.setPesoEnelProm( new Integer(1));
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new DEF_PlanAsignatuDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAsigPlan", "PkeyAsigPlan", "N",2),
        new InfoPack("FkeyPlanEstu", "FkeyPlanEstu", "N",3),
        new InfoPack("FkeyDiviNota", "FkeyDiviNota", "N",3),
        new InfoPack("FkeyModuPlan", "FkeyModuPlan", "N",3),
        new InfoPack("FkeyClasCali", "FkeyClasCali", "N",3),
        new InfoPack("FkeyTipoForm", "FkeyTipoForm", "N",3),
        new InfoPack("FkeyAreaCono", "FkeyAreaCono", "N",3),
        new InfoPack("FkeyAsigEstu", "FkeyAsigEstu", "N",3),
        new InfoPack("FkeyNuclBasi", "FkeyNuclBasi", "N",3),
        new InfoPack("NumeCredPlan", "Número de Créditos", "N",5),
        new InfoPack("NiveDondImpa", "Nivel donde se Imparte", "N",5),
        new InfoPack("TipoPermPlan", "Tipo de Permanencia", "S",6),
        new InfoPack("TipoAsigPlan", "Tipo de Asignatura", "S",6),
        new InfoPack("EsunAsigObli", "¿Es una Asignatura Obligatoria?", "S",6),
        new InfoPack("TotaHoraTeor", "Horas Teóricas", "N",5),
        new InfoPack("TotaHoraPrac", "Horas Prácticas", "N",5),
        new InfoPack("HoraTeorPrac", "Horas Teórico-Prácticas", "N",5),
        new InfoPack("FkeyTipoAula", "FkeyTipoAula", "N",3),
        new InfoPack("EsunAsigVali", "¿Es Validable?", "S",6),
        new InfoPack("SemaTotaPeri", "Semanas en el periodo", "N",5),
        new InfoPack("PesoEnelProm", "Peso en el promedio", "N",5),
        new InfoPack("HoraExtrClas", "Horas extra clase", "N",5)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    DEF_PlanAsignatuDto newDto = (DEF_PlanAsignatuDto) dto;
    if (getDeepLevel() != 0) {
      DEF_NuclBasiConoDao fkeyNuclBasiDao = new DEF_NuclBasiConoDao(); 
      newDto.setFkeyNuclBasiDto((DEF_NuclBasiConoDto)fkeyNuclBasiDao.findDtoByPkey(new Integer(rs.getInt("fkeyNuclBasi")), getDeepLevel()-1));
//      DEF_PlanAreaConoDao fkeyAreaConoDao = new DEF_PlanAreaConoDao(); 
//      newDto.setFkeyAreaConoDto((DEF_PlanAreaConoDto)fkeyAreaConoDao.findDtoByPkey(new Integer(rs.getInt("fkeyAreaCono")), getDeepLevel()-1));
//      DEF_AsignaEstudiDao fkeyAsigEstuDao = new DEF_AsignaEstudiDao(); 
//      newDto.setFkeyAsigEstuDto((DEF_AsignaEstudiDto)fkeyAsigEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyAsigEstu")), getDeepLevel()-1));
      DEF_PlanesEstudiDao fkeyPlanEstuDao = new DEF_PlanesEstudiDao(); 
      newDto.setFkeyPlanEstuDto((DEF_PlanesEstudiDto)fkeyPlanEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyPlanEstu")), getDeepLevel()-1));
      ADS_Clase_CalifiDao fkeyClasCaliDao = new ADS_Clase_CalifiDao(); 
      newDto.setFkeyClasCaliDto((ADS_Clase_CalifiDto)fkeyClasCaliDao.findDtoByPkey(new Integer(rs.getInt("fkeyClasCali")), getDeepLevel()-1));
//      DEF_PlanEstuModuDao fkeyModuPlanDao = new DEF_PlanEstuModuDao(); 
//      newDto.setFkeyModuPlanDto((DEF_PlanEstuModuDto)fkeyModuPlanDao.findDtoByPkey(new Integer(rs.getInt("fkeyModuPlan")), getDeepLevel()-1));
//      ADS_DivisiCalifiDao fkeyDiviNotaDao = new ADS_DivisiCalifiDao(); 
//      newDto.setFkeyDiviNotaDto((ADS_DivisiCalifiDto)fkeyDiviNotaDao.findDtoByPkey(new Integer(rs.getInt("fkeyDiviNota")), getDeepLevel()-1));
//      CRG_TipoAulaClasDao fkeyTipoAulaDao = new CRG_TipoAulaClasDao(); 
//      newDto.setFkeyTipoAulaDto((CRG_TipoAulaClasDto)fkeyTipoAulaDao.findDtoByPkey(new Integer(rs.getInt("fkeyTipoAula")), getDeepLevel()-1));
    }
    return newDto;
  }
}

