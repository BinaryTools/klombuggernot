package com.bt.univex.ads.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.xpc.binarytool.univex.connect.Connect;

public class ADS_Munici_DeparDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_Munici_Depar";
        PkeyName = "PkeyMunicipi";
        DescName = "NombMunicipi";
        CodeName = "CodiMunicipi";
        AliasName = "Municipi";
        deepLevel = 2;
        setXPracPkeyEnti(4503);
        loadInfoEntity();
    }

    public ADS_Munici_DeparDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_Munici_DeparDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_Munici_DeparDto getDefaultDto()  {
     ADS_Munici_DeparDto dto = new ADS_Munici_DeparDto(); 
     dto.setPkeyMunicipi(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_Munici_DeparDto();
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
    ADS_Munici_DeparDto newDto = (ADS_Munici_DeparDto) dto;
    if (getDeepLevel() != 0) {
      ADS_DepartamentoDao fkeyDepartamDao = new ADS_DepartamentoDao(); 
      newDto.setFkeyDepartamDto((ADS_DepartamentoDto)fkeyDepartamDao.findDtoByPkey(new Integer(rs.getInt("fkeyDepartam")), getDeepLevel()-1));
    }
    return newDto;
  }
}

