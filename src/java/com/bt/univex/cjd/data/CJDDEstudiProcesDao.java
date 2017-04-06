package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class CJDDEstudiProcesDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDDEstudiProces";
        PkeyName = "PkeyEstuProc";
        DescName = "null";
        CodeName = "null";
        AliasName = "EstuProcD";
        deepLevel = 2;
        setXPracPkeyEnti(132503);
        loadInfoEntity();
    }

    public CJDDEstudiProcesDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDDEstudiProcesDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDDEstudiProcesDto getDefaultDto()  {
     CJDDEstudiProcesDto dto = new CJDDEstudiProcesDto(); 
     dto.setPkeyEstuProc(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDDEstudiProcesDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyEstuProc", "PkeyEstuProc", "N",2),
        new InfoPack("FkeyProcCons", "FkeyProcCons", "N",3),
        new InfoPack("FkeyDoceEspe", "FkeyDoceEspe", "N",3),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FechAsigProc", "Fecha de Asignación", "D",7),
        new InfoPack("FechEntrProc", "Fecha de Entrega", "D",7),
        new InfoPack("NombProcesos", "Nombre", "S",1),
        new InfoPack("AreaProcesos", "Área", "S",6),
        new InfoPack("NombCompProf", "Profesor", "S",1),
        new InfoPack("DescProcesos", "Descripción", "S",4),
        new InfoPack("NumeCasoProc", "Número del Caso", "S",1),
        new InfoPack("EstaProcesos", "Estado", "S",6),
        new InfoPack("NotaProcCons", "Nota procesos", "F",12),
        new InfoPack("EstaMuesRepo", "Se muestra en reporte?", "S",6),
        new InfoPack("FechNotaProc", "Fecha Calificación", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDDEstudiProcesDto newDto = (CJDDEstudiProcesDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

