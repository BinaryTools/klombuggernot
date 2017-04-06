package com.bt.univex.ads.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class ADS_Clase_CalifiDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_Clase_Califi";
        PkeyName = "PkeyClasCali";
        DescName = "NombClasCali";
        CodeName = "null";
        AliasName = "ClasCali";
        deepLevel = 2;
        setXPracPkeyEnti(5703);
        loadInfoEntity();
    }

    public ADS_Clase_CalifiDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_Clase_CalifiDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_Clase_CalifiDto getDefaultDto()  {
     ADS_Clase_CalifiDto dto = new ADS_Clase_CalifiDto(); 
     dto.setPkeyClasCali(0);
     dto.setEsdeTipoRang("N");
     dto.setDebeRedoNota("S");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_Clase_CalifiDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyClasCali", "PkeyClasCali", "N",2),
        new InfoPack("NombClasCali", "Nombre de la Clase de Calificación", "S",1),
        new InfoPack("EsdeTipoRang", "¿Es de tipo Rango?", "S",6),
        new InfoPack("ValoInfeRang", "Valor Inferior", "N",8),
        new InfoPack("ValoSupeRang", "Valor Superior", "N",8),
        new InfoPack("CantDecimale", "Cantidad de Decimales", "N",5),
        new InfoPack("NotaMiniApro", "Mínima Aprobatoria", "N",8),
        new InfoPack("InteEntrNota", "Intervalo entre Notas", "F",11),
        new InfoPack("DebeRedoNota", "¿Debe Redondear?", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_Clase_CalifiDto newDto = (ADS_Clase_CalifiDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

