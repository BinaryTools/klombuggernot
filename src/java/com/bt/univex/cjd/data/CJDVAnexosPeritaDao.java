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

public class CJDVAnexosPeritaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVAnexosPerita";
        PkeyName = "PkeyAnexPeri";
        DescName = "null";
        CodeName = "null";
        AliasName = "AnexPeriV";
        deepLevel = 2;
        setXPracPkeyEnti(187903);
        loadInfoEntity();
    }

    public CJDVAnexosPeritaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVAnexosPeritaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVAnexosPeritaDto getDefaultDto()  {
     CJDVAnexosPeritaDto dto = new CJDVAnexosPeritaDto(); 
     dto.setPkeyAnexPeri(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVAnexosPeritaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAnexPeri", "PkeyAnexPeri", "N",2),
        new InfoPack("FkeyClasObse", "FkeyClasObse", "N",3),
        new InfoPack("FkeyPeriCons", "FkeyPeriCons", "N",3),
        new InfoPack("NombClasObse", "Nombre", "S",1),
        new InfoPack("OrdeClasObse", "OrdeClasObse", "S",1),
        new InfoPack("EstaClasObse", "Estado", "S",6),
        new InfoPack("TipoAnexObse", "Tipo de ", "S",6),
        new InfoPack("InfoAnexPeri", "Información", "S",4),
        new InfoPack("FechModiAnex", "Fecha", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVAnexosPeritaDto newDto = (CJDVAnexosPeritaDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

