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

public class CJDVPersonProcesDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVPersonProces";
        PkeyName = "PkeyPersProc";
        DescName = "null";
        CodeName = "null";
        AliasName = "PersProcV";
        deepLevel = 2;
        setXPracPkeyEnti(130803);
        loadInfoEntity();
    }

    public CJDVPersonProcesDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVPersonProcesDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVPersonProcesDto getDefaultDto()  {
     CJDVPersonProcesDto dto = new CJDVPersonProcesDto(); 
     dto.setPkeyPersProc(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVPersonProcesDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPersProc", "PkeyPersProc", "N",2),
        new InfoPack("FkeyPersSist", "FkeyPersSist", "N",3),
        new InfoPack("FkeyProcCons", "FkeyProcCons", "N",3),
        new InfoPack("FechRelaProc", "Fecha Relación", "D",7),
        new InfoPack("TipoUsuaSist", "Tipo Usuario", "S",6),
        new InfoPack("NombUsuaSist", "Nombre", "S",1),
        new InfoPack("TipoDocuUsua", "Tipo de Documento", "S",6),
        new InfoPack("NumeDocuUsua", "No. Documento", "N",5),
        new InfoPack("LugaExpeDocu", "Lugar de Expedición", "S",1),
        new InfoPack("TeleFijoUsua", "telefijousua", "S",1),
        new InfoPack("TeleCeluUsua", "TeleCeluUsua", "S",1),
        new InfoPack("CorrUsuaSist", "CorrUsuaSist", "S",1),
        new InfoPack("NombContacto", "Nombre", "S",1),
        new InfoPack("TeleFijoCont", "TeleFijoCont", "S",1),
        new InfoPack("TeleCeluCont", "telecelucont", "S",1),
        new InfoPack("CorrElecCont", "correleccont", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVPersonProcesDto newDto = (CJDVPersonProcesDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

