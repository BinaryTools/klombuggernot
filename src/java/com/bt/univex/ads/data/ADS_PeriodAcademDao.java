package com.bt.univex.ads.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class ADS_PeriodAcademDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_PeriodAcadem";
        PkeyName = "PkeyPeriAcad";
        DescName = "NombPeriAcad";
        CodeName = "null";
        AliasName = "PeriAcad";
        deepLevel = 2;
        setXPracPkeyEnti(6103);
        loadInfoEntity();
    }

    public ADS_PeriodAcademDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_PeriodAcademDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_PeriodAcademDto getDefaultDto()  {
     ADS_PeriodAcademDto dto = new ADS_PeriodAcademDto(); 
     dto.setPkeyPeriAcad(0);
     dto.setOrdePeriAcad( new Integer(1));
     dto.setAnnoPeriAcad( new Integer(2003));
     dto.setNumePeriAcad( new Integer(1));
     dto.setNumeMeseAbar( new Integer(6));
     dto.setNumeSemaPeri( new Integer(16));
     dto.setEstaActiPeri("S");
     dto.setEsunVacacion("N");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_PeriodAcademDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPeriAcad", "PkeyPeriAcad", "N",2),
        new InfoPack("NombPeriAcad", "Identificación del Período", "S",1),
        new InfoPack("OrdePeriAcad", "Orden en el Año", "N",5),
        new InfoPack("AnnoPeriAcad", "Año del Período", "N",5),
        new InfoPack("NumePeriAcad", "Período Académico", "N",5),
        new InfoPack("NumeMeseAbar", "Meses que Abarca", "N",5),
        new InfoPack("DescPeriAcad", "Descripción del Período", "S",4),
        new InfoPack("NumeSemaPeri", "Semanas", "N",5),
        new InfoPack("EstaActiPeri", "¿Está Activo?", "S",6),
        new InfoPack("EsunVacacion", "¿Es Intersemestral?", "S",6),
        new InfoPack("FechInicPeri", "Fecha de inicio del periodo", "D",7),
        new InfoPack("FechFiniPeri", "Fecha final del periodo", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_PeriodAcademDto newDto = (ADS_PeriodAcademDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

