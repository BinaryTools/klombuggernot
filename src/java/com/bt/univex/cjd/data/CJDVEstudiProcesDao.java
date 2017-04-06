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

public class CJDVEstudiProcesDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVEstudiProces";
        PkeyName = "PkeyEstuProc";
        DescName = "NombEstudian";
        CodeName = "null";
        AliasName = "EstuProcV";
        deepLevel = 2;
        setXPracPkeyEnti(130603);
        loadInfoEntity();
    }

    public CJDVEstudiProcesDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVEstudiProcesDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVEstudiProcesDto getDefaultDto()  {
     CJDVEstudiProcesDto dto = new CJDVEstudiProcesDto(); 
     dto.setPkeyEstuProc(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVEstudiProcesDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyEstuProc", "PkeyEstuProc", "N",2),
        new InfoPack("FkeyProcCons", "FkeyProcCons", "N",3),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FechAsigProc", "FechAsigProc", "D",7),
        new InfoPack("FechEntrProc", "FechEntrProc", "D",7),
        new InfoPack("FkeyProgAcad", "FkeyProgAcad", "N",3),
        new InfoPack("FkeyHojaVida", "FkeyHojaVida", "N",3),
        new InfoPack("FkeyInscripc", "FkeyInscripc", "N",3),
        new InfoPack("CodiEstudian", "CodiEstudian", "S",13),
        new InfoPack("EstaActiEstu", "EstaAcadEstu", "S",6),
        new InfoPack("NombEstudian", "NombEstudian", "S",1),
        new InfoPack("ApelEstudian", "Apellido Estudiante", "S",1),
        new InfoPack("SeguApelEstu", "Segundo Apellido Estudiante", "S",1),
        new InfoPack("NotaProcCons", "Nota proceso", "F",12),
        new InfoPack("EstaMuesRepo", "Se muestra en reporte?", "S",6),
        new InfoPack("FechNotaProc", "Fecha Calificación", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVEstudiProcesDto newDto = (CJDVEstudiProcesDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

