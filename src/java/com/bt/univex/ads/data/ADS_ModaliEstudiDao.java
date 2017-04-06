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

public class ADS_ModaliEstudiDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_ModaliEstudi";
        PkeyName = "PkeyModaEstu";
        DescName = "NombModaEstu";
        CodeName = "null";
        AliasName = "ModaEstu";
        deepLevel = 2;
        setXPracPkeyEnti(5003);
        loadInfoEntity();
    }

    public ADS_ModaliEstudiDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_ModaliEstudiDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_ModaliEstudiDto getDefaultDto()  {
     ADS_ModaliEstudiDto dto = new ADS_ModaliEstudiDto(); 
     dto.setPkeyModaEstu(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_ModaliEstudiDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyModaEstu", "PkeyModaEstu", "N",2),
        new InfoPack("NombModaEstu", "Nombre de la Modalidad", "S",1),
        new InfoPack("TipoBasiModa", "Tipo Básico", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_ModaliEstudiDto newDto = (ADS_ModaliEstudiDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

