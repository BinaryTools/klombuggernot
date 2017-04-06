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

public class CJD_Clase_ObservDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_Clase_Observ";
        PkeyName = "PkeyClasObse";
        DescName = "NombClasObse";
        CodeName = "null";
        AliasName = "ClasObse";
        deepLevel = 2;
        setXPracPkeyEnti(128703);
        loadInfoEntity();
    }

    public CJD_Clase_ObservDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_Clase_ObservDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_Clase_ObservDto getDefaultDto()  {
     CJD_Clase_ObservDto dto = new CJD_Clase_ObservDto(); 
     dto.setPkeyClasObse(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_Clase_ObservDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyClasObse", "PkeyClasObse", "N",2),
        new InfoPack("NombClasObse", "Nombre", "S",1),
        new InfoPack("OrdeClasObse", "Orden", "N",5),
        new InfoPack("EstaClasObse", "Estado", "S",6),
        new InfoPack("TipoAnexObse", "Tipo Anexo", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_Clase_ObservDto newDto = (CJD_Clase_ObservDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

