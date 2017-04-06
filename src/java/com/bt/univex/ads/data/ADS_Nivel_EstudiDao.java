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

public class ADS_Nivel_EstudiDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_Nivel_Estudi";
        PkeyName = "PkeyNiveEstu";
        DescName = "NombNiveEstu";
        CodeName = "null";
        AliasName = "NiveEstu";
        deepLevel = 2;
        setXPracPkeyEnti(4903);
        loadInfoEntity();
    }

    public ADS_Nivel_EstudiDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_Nivel_EstudiDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_Nivel_EstudiDto getDefaultDto()  {
     ADS_Nivel_EstudiDto dto = new ADS_Nivel_EstudiDto(); 
     dto.setPkeyNiveEstu(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_Nivel_EstudiDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyNiveEstu", "PkeyNiveEstu", "N",2),
        new InfoPack("NombNiveEstu", "Nombre del Nivel de Estudio", "S",1),
        new InfoPack("TipoBasiEstu", "Tipo Básico", "S",6),
        new InfoPack("EstaActiNive", "Nivel Calificación", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_Nivel_EstudiDto newDto = (ADS_Nivel_EstudiDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

