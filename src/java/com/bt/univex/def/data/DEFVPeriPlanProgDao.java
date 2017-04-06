package com.bt.univex.def.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.def.data.*;
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class DEFVPeriPlanProgDao extends BaseDao {

    private void initializeDao() { 
        TableName = "DEFVPeriPlanProg";
        PkeyName = "PkeyPeriPlan";
        DescName = "Descripcion";
        CodeName = "CodiProgAcad";
        AliasName = "PeriPlan";
        deepLevel = 2;
        setXPracPkeyEnti(13003);
        loadInfoEntity();
    }

    public DEFVPeriPlanProgDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public DEFVPeriPlanProgDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static DEFVPeriPlanProgDto getDefaultDto()  {
     DEFVPeriPlanProgDto dto = new DEFVPeriPlanProgDto(); 
     dto.setPkeyPeriPlan(0);
     dto.setAnnoPeriAcad( new Integer(2003));
     dto.setEsunPeriInfi("N");
     dto.setEstaActiPlan("S");
     dto.setDuraProgNive( new Integer(10));
     dto.setCredTotaProg( new Integer(0));
     dto.setProgJornada_("D");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new DEFVPeriPlanProgDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPeriPlan", "PkeyPeriPlan", "N",2),
        new InfoPack("FkeyPlanEstu", "FkeyPlanEstu", "N",3),
        new InfoPack("FkeyModaEstu", "FkeyModaEstu", "N",3),
        new InfoPack("FkeyNiveEstu", "FkeyNiveEstu", "N",3),
        new InfoPack("AnnoPeriAcad", "Año del Período", "N",5),
        new InfoPack("FkeyPeriAcad", "FkeyPeriAcad", "N",3),
        new InfoPack("PkeyPlanEstu", "PkeyPlanEstu", "N",2),
        new InfoPack("EsunPeriInfi", "¿Es un Período Infinito?", "S",6),
        new InfoPack("NombFacuUniv", "Nombre de la Facultad", "S",1),
        new InfoPack("FkeyProgAcad", "FkeyProgAcad", "N",3),
        new InfoPack("EstaActiPlan", "¿Está Activo?", "S",6),
        new InfoPack("PkeyPeriAcad", "PkeyPeriAcad", "N",2),
        new InfoPack("NombPeriAcad", "Identificación del Período", "S",1),
        new InfoPack("PkeyProgAcad", "PkeyProgAcad", "N",2),
        new InfoPack("EstaActiPeri", "¿Está Activo?", "S",6),
        new InfoPack("FkeyFacuUniv", "FkeyFacuUniv", "N",3),
        new InfoPack("NombProgAcad", "Nombre del Programa", "S",1),
        new InfoPack("CodiProgAcad", "Código del Programa", "N",5),
        new InfoPack("CodiPlanEstu", "Código del Plan de Estudios", "N",5),
        new InfoPack("DuraProgNive", "Duración del Programa (niveles)", "N",5),
        new InfoPack("CredTotaProg", "Créditos Totales", "N",5),
        new InfoPack("NumePeriAcad", "Número del Período", "N",5),
        new InfoPack("DescPlanEstu", "Descripción del Plan", "S",4),
        new InfoPack("Descripcion", "Descripción", "S",1),
        new InfoPack("FkeyBloqTiem", "FkeyBloqTiem", "N",3),
        new InfoPack("IndiActiCarg", "IndiActiCarg", "S",6),
        new InfoPack("IndiActiNota", "IndiActiNota", "S",6),
        new InfoPack("NumeroPromoc", "Numero promoción", "N",5),
        new InfoPack("SemestreCurs", "Semestre curso", "N",5),
        new InfoPack("ProgJornada_", "ProgJornada_", "S",6),
        new InfoPack("CodiCentCost", "Código Centro Costo", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    DEFVPeriPlanProgDto newDto = (DEFVPeriPlanProgDto) dto;
    if (getDeepLevel() != 0) {
      ADS_PrograAcademDao fkeyProgAcadDao = new ADS_PrograAcademDao(); 
      newDto.setFkeyProgAcadDto((ADS_PrograAcademDto)fkeyProgAcadDao.findDtoByPkey(new Integer(rs.getInt("fkeyProgAcad")), getDeepLevel()-1));
      ADS_PeriodAcademDao pkeyPeriAcadDao = new ADS_PeriodAcademDao(); 
      newDto.setPkeyPeriAcadDto((ADS_PeriodAcademDto)pkeyPeriAcadDao.findDtoByPkey(new Integer(rs.getInt("pkeyPeriAcad")), getDeepLevel()-1));
    }
    return newDto;
  }
}

