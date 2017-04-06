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

public class ADSVMuniciDocumeDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADSVMuniciDocume";
        PkeyName = "PkeyMunicipi";
        DescName = "NombMunicipi";
        CodeName = "CodiMunicipi";
        AliasName = "MuniDocu";
        deepLevel = 2;
        setXPracPkeyEnti(14303);
        loadInfoEntity();
    }

    public ADSVMuniciDocumeDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADSVMuniciDocumeDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADSVMuniciDocumeDto getDefaultDto()  {
     ADSVMuniciDocumeDto dto = new ADSVMuniciDocumeDto(); 
     dto.setPkeyMunicipi(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADSVMuniciDocumeDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyMunicipi", "PkeyMunicipi", "N",2),
        new InfoPack("FkeyDepartam", "FkeyDepartam", "N",3),
        new InfoPack("CodiMunicipi", "Código del Municipio", "S",13),
        new InfoPack("NombMunicipi", "Nombre del Municipio", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADSVMuniciDocumeDto newDto = (ADSVMuniciDocumeDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

