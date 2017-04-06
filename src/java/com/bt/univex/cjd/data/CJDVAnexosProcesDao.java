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

public class CJDVAnexosProcesDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVAnexosProces";
        PkeyName = "PkeyAnexProc";
        DescName = "NombClasObse";
        CodeName = "null";
        AliasName = "AnexProcV";
        deepLevel = 2;
        setXPracPkeyEnti(130303);
        loadInfoEntity();
    }

    public CJDVAnexosProcesDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVAnexosProcesDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVAnexosProcesDto getDefaultDto()  {
     CJDVAnexosProcesDto dto = new CJDVAnexosProcesDto(); 
     dto.setPkeyAnexProc(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVAnexosProcesDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAnexProc", "PkeyAnexProc", "N",2),
        new InfoPack("FkeyClasObse", "FkeyClasObse", "N",3),
        new InfoPack("FkeyProcCons", "FkeyProcCons", "N",3),
        new InfoPack("NombClasObse", "Nombre Clase Observación", "S",1),
        new InfoPack("OrdeClasObse", "Orden clase observación", "N",5),
        new InfoPack("EstaClasObse", "Estado", "S",6),
        new InfoPack("TipoAnexObse", "Tipo Anexo Observación", "S",6),
        new InfoPack("InfoAnexProc", "Información", "S",4),
        new InfoPack("FechModiAnex", "Fecha modificación", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVAnexosProcesDto newDto = (CJDVAnexosProcesDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

