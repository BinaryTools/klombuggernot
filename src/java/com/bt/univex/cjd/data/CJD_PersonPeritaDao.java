package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.cjd.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_PersonPeritaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_PersonPerita";
        PkeyName = "PkeyPersPeri";
        DescName = "null";
        CodeName = "null";
        AliasName = "PersPeri";
        deepLevel = 2;
        setXPracPkeyEnti(188303);
        loadInfoEntity();
    }

    public CJD_PersonPeritaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_PersonPeritaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_PersonPeritaDto getDefaultDto()  {
     CJD_PersonPeritaDto dto = new CJD_PersonPeritaDto(); 
     dto.setPkeyPersPeri(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_PersonPeritaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPersPeri", "PkeyPersPeri", "N",2),
        new InfoPack("FkeyPersSist", "FkeyPersSist", "N",3),
        new InfoPack("FkeyPeriCons", "FkeyPeriCons", "N",3),
        new InfoPack("FechRelaPeri", "Fecha", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_PersonPeritaDto newDto = (CJD_PersonPeritaDto) dto;
    if (getDeepLevel() != 0) {
      CJDVPeritaConsulDao fkeyPeriConsDao = new CJDVPeritaConsulDao(); 
      newDto.setFkeyPeriConsDto((CJDVPeritaConsulDto)fkeyPeriConsDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriCons")), getDeepLevel()-1));
      CJD_PersonSistemDao fkeyPersSistDao = new CJD_PersonSistemDao(); 
      newDto.setFkeyPersSistDto((CJD_PersonSistemDto)fkeyPersSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyPersSist")), getDeepLevel()-1));
    }
    return newDto;
  }
}

