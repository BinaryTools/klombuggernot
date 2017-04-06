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

public class CJDVAnexosConsulDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVAnexosConsul";
        PkeyName = "PkeyAnexCons";
        DescName = "null";
        CodeName = "null";
        AliasName = "AnexConsV";
        deepLevel = 2;
        setXPracPkeyEnti(130203);
        loadInfoEntity();
    }

    public CJDVAnexosConsulDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVAnexosConsulDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVAnexosConsulDto getDefaultDto()  {
     CJDVAnexosConsulDto dto = new CJDVAnexosConsulDto(); 
     dto.setPkeyAnexCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVAnexosConsulDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAnexCons", "PkeyAnexCons", "N",2),
        new InfoPack("FkeyClasObse", "FkeyClasObse", "N",3),
        new InfoPack("FkeyConsSist", "FkeyConsSist", "N",3),
        new InfoPack("NombClasObse", "Nombre Clase Observacion", "S",1),
        new InfoPack("OrdeClasObse", "Orden Clase Observación", "N",5),
        new InfoPack("EstaClasObse", "Estado Clase Observación", "S",6),
        new InfoPack("TipoAnexObse", "Tipo Anexo Observación", "S",6),
        new InfoPack("InfoAnexCons", "Información Anexo Consulta", "S",4),
        new InfoPack("FechModiAnex", "Fecha de modificado", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVAnexosConsulDto newDto = (CJDVAnexosConsulDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

