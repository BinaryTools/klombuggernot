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

public class CJDDEstudiPeritaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDDEstudiPerita";
        PkeyName = "PkeyEstuPeri";
        DescName = "null";
        CodeName = "null";
        AliasName = "EstuPeriD";
        deepLevel = 2;
        setXPracPkeyEnti(188703);
        loadInfoEntity();
    }

    public CJDDEstudiPeritaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDDEstudiPeritaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDDEstudiPeritaDto getDefaultDto()  {
     CJDDEstudiPeritaDto dto = new CJDDEstudiPeritaDto(); 
     dto.setPkeyEstuPeri(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDDEstudiPeritaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyEstuPeri", "PkeyEstuPeri", "N",2),
        new InfoPack("FkeyPeriCons", "FkeyPeriCons", "N",3),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FechAsigPeri", "Fecha", "D",7),
        new InfoPack("FechEntrPeri", "Fecha", "D",7),
        new InfoPack("NombPeritaje", "Nombre", "S",1),
        new InfoPack("AreaPeritaje", "AreaPeritaje", "S",1),
        new InfoPack("DescPeritaje", "Descripción", "S",4),
        new InfoPack("NumePeritaje", "Numero", "N",3),
        new InfoPack("EstaPeritaje", "Estado", "S",6),
        new InfoPack("FkeyDoceEspe", "fkeyDoceEspe", "N",3),
        new InfoPack("NombCompProf", "Nombre", "S",1),
        new InfoPack("NotaPeritaje", "Nota Peritaje", "F",12),
        new InfoPack("FechNotaPeri", "Fecha Calificación", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDDEstudiPeritaDto newDto = (CJDDEstudiPeritaDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

