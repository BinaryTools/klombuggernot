package com.bt.univex.def.data;

import com.bt.univex.ads.data.*;
import com.xpc.base.*;
import com.xpc.binarytool.univex.connect.Connect;
import com.xpc.connect.BaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class DEF_PeriodPlanesDao extends BaseDao {

    private void initializeDao() { 
        TableName = "DEF_PeriodPlanes";
        PkeyName = "PkeyPeriPlan";
        DescName = "null";
        CodeName = "null";
        AliasName = "PeriPlan";
        deepLevel = 2;
        setXPracPkeyEnti(7003);
        loadInfoEntity();
    }

    public DEF_PeriodPlanesDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public DEF_PeriodPlanesDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static DEF_PeriodPlanesDto getDefaultDto()  {
     DEF_PeriodPlanesDto dto = new DEF_PeriodPlanesDto(); 
     dto.setPkeyPeriPlan(0);
     dto.setEsunPeriInfi("N");
     dto.setTipoDiviPeri("U");
     dto.setNumeDiviPeri( new Integer(0));
     dto.setIndiActiNota("N");
     dto.setIndiActiCarg("N");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new DEF_PeriodPlanesDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPeriPlan", "PkeyPeriPlan", "N",2),
        new InfoPack("FkeyPlanEstu", "FkeyPlanEstu", "N",3),
        new InfoPack("FkeyPeriAcad", "FkeyPeriAcad", "N",3),
        new InfoPack("EsunPeriInfi", "¿Es un Período Infinito?", "S",6),
        new InfoPack("TipoDiviPeri", "Tipo de División", "S",6),
        new InfoPack("NumeDiviPeri", "División", "N",5),
        new InfoPack("IndiActiNota", "¿Activo para Capturar Notas?", "S",6),
        new InfoPack("IndiActiCarg", "¿Activo para Modificar Carga?", "S",6),
        new InfoPack("FkeyProgAcad", "FkeyProgAcad", "N",3),
        new InfoPack("NumeroPromoc", "Numero Promoción", "N",5),
        new InfoPack("SemestreCurs", "Semestre curso", "N",5),
        new InfoPack("Usa_horafijo", "Usa horario fijo?", "S",6),
        new InfoPack("NumeTotaSema", "NumeTotaSema", "N",5),
        new InfoPack("TotaPuntCurs", "TotaPuntCurs", "F",12)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    DEF_PeriodPlanesDto newDto = (DEF_PeriodPlanesDto) dto;
    if (getDeepLevel() != 0) {
      ADS_PeriodAcademDao fkeyPeriAcadDao = new ADS_PeriodAcademDao(); 
      newDto.setFkeyPeriAcadDto((ADS_PeriodAcademDto)fkeyPeriAcadDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriAcad")), getDeepLevel()-1));
      DEF_PlanesEstudiDao fkeyPlanEstuDao = new DEF_PlanesEstudiDao(); 
      newDto.setFkeyPlanEstuDto((DEF_PlanesEstudiDto)fkeyPlanEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyPlanEstu")), getDeepLevel()-1));
    }
    return newDto;
  }
}

