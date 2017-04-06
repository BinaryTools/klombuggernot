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

public class ADS_DepartamentoDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_Departamento";
        PkeyName = "PkeyDepartam";
        DescName = "NombDepartam";
        CodeName = "CodiDepartam";
        AliasName = "Departam";
        deepLevel = 2;
        setXPracPkeyEnti(4403);
        loadInfoEntity();
    }

    public ADS_DepartamentoDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_DepartamentoDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_DepartamentoDto getDefaultDto()  {
     ADS_DepartamentoDto dto = new ADS_DepartamentoDto(); 
     dto.setPkeyDepartam(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_DepartamentoDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyDepartam", "PkeyDepartam", "N",2),
        new InfoPack("CodiDepartam", "Código del Departamento", "S",13),
        new InfoPack("NombDepartam", "Nombre del Departamento", "S",1),
        new InfoPack("IndiPaisDepa", "País o Departamento", "S",6),
        new InfoPack("Nacionalidad", "Nacionalidad", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_DepartamentoDto newDto = (ADS_DepartamentoDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

