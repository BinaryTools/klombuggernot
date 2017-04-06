package com.bt.univex.ads.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class ADS_FacultUniverDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_FacultUniver";
        PkeyName = "PkeyFacuUniv";
        DescName = "NombFacuUniv";
        CodeName = "null";
        AliasName = "Facultad";
        deepLevel = 2;
        setXPracPkeyEnti(5403);
        loadInfoEntity();
    }

    public ADS_FacultUniverDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_FacultUniverDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_FacultUniverDto getDefaultDto()  {
     ADS_FacultUniverDto dto = new ADS_FacultUniverDto(); 
     dto.setPkeyFacuUniv(0);
     dto.setEstaActiFacu("S");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_FacultUniverDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyFacuUniv", "PkeyFacuUniv", "N",2),
        new InfoPack("FkeyRegiUniv", "FkeyRegiUniv", "N",3),
        new InfoPack("CodiFacuUniv", "Codigo de la Facultad", "N",5),
        new InfoPack("NombFacuUniv", "Nombre de la Facultad", "S",1),
        new InfoPack("EstaActiFacu", "¿Está Activa?", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_FacultUniverDto newDto = (ADS_FacultUniverDto) dto;
    if (getDeepLevel() != 0) {
//      ADS_Regiona_UnivDao fkeyRegiUnivDao = new ADS_Regiona_UnivDao(); 
//      newDto.setFkeyRegiUnivDto((ADS_Regiona_UnivDto)fkeyRegiUnivDao.findDtoByPkey(new Integer(rs.getInt("fkeyRegiUniv")), getDeepLevel()-1));
    }
    return newDto;
  }
}

