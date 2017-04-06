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

public class CJDVEstudiPeritaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVEstudiPerita";
        PkeyName = "PkeyEstuPeri";
        DescName = "null";
        CodeName = "null";
        AliasName = "EstuPerV";
        deepLevel = 2;
        setXPracPkeyEnti(187103);
        loadInfoEntity();
    }

    public CJDVEstudiPeritaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVEstudiPeritaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVEstudiPeritaDto getDefaultDto()  {
     CJDVEstudiPeritaDto dto = new CJDVEstudiPeritaDto(); 
     dto.setPkeyEstuPeri(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVEstudiPeritaDto();
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
        new InfoPack("NotaPeritaje", "NotaPeritaje", "F",12),
        new InfoPack("FkeyProgAcad", "FkeyProgAcad", "N",3),
        new InfoPack("FkeyHojaVida", "FkeyHojaVida", "N",3),
        new InfoPack("FkeyInscRipc", "FkeyInscRipc", "N",3),
        new InfoPack("CodiEstudian", "Código", "S",13),
        new InfoPack("EstaActiEstu", "Estado", "S",6),
        new InfoPack("EstaAcadEstu", "Estado", "S",6),
        new InfoPack("NombEstudian", "Nombre", "S",1),
        new InfoPack("ApelEstudian", "ApelEstuDian", "S",1),
        new InfoPack("SeguApelEstu", "SeguApelEstu", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVEstudiPeritaDto newDto = (CJDVEstudiPeritaDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

