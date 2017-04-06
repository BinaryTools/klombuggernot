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

public class CJDVPersonPeritaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVPersonPerita";
        PkeyName = "PkeyPersPeri";
        DescName = "null";
        CodeName = "null";
        AliasName = "PersPeri";
        deepLevel = 2;
        setXPracPkeyEnti(188403);
        loadInfoEntity();
    }

    public CJDVPersonPeritaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVPersonPeritaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVPersonPeritaDto getDefaultDto()  {
     CJDVPersonPeritaDto dto = new CJDVPersonPeritaDto(); 
     dto.setPkeyPersPeri(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVPersonPeritaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPersPeri", "PkeyPersPeri", "N",2),
        new InfoPack("FkeyPersSist", "FkeyPersSist", "N",3),
        new InfoPack("FkeyPeriCons", "FkeyPeriCons", "N",3),
        new InfoPack("FechRelaPeri", "Fecha", "D",7),
        new InfoPack("TipoUsuaSist", "Tipo de ", "S",6),
        new InfoPack("NombUsuaSist", "Nombre", "S",1),
        new InfoPack("TipoDocuUsua", "Tipo de ", "S",6),
        new InfoPack("NumeDocuUsua", "Numero", "N",3),
        new InfoPack("LugaExpeDocu", "LugaExpeDocu", "S",1),
        new InfoPack("TeleFijoUsua", "TeleFijoUsua", "S",1),
        new InfoPack("TeleCeluUsua", "TeleCeluUsua", "S",1),
        new InfoPack("CorrUsuaSist", "CorrUsuaSist", "S",1),
        new InfoPack("NombContacto", "Nombre", "S",1),
        new InfoPack("TeleFijoCont", "TeleFijoCont", "S",1),
        new InfoPack("TeleCeluCont", "TeleCeluCont", "S",1),
        new InfoPack("CorrElecCont", "CorrElecCont", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVPersonPeritaDto newDto = (CJDVPersonPeritaDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

