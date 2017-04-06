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

public class CJD_PersonConsulDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_PersonConsul";
        PkeyName = "PkeyPersCons";
        DescName = "null";
        CodeName = "null";
        AliasName = "PersCons";
        deepLevel = 2;
        setXPracPkeyEnti(129103);
        loadInfoEntity();
    }

    public CJD_PersonConsulDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_PersonConsulDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_PersonConsulDto getDefaultDto()  {
     CJD_PersonConsulDto dto = new CJD_PersonConsulDto(); 
     dto.setPkeyPersCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_PersonConsulDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPersCons", "PkeyPersCons", "N",2),
        new InfoPack("FkeyPersSist", "FkeyPersSist", "N",3),
        new InfoPack("FkeyConsSist", "FkeyConsSist", "N",3)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_PersonConsulDto newDto = (CJD_PersonConsulDto) dto;
    if (getDeepLevel() != 0) {
      CJD_ConsulSistemDao fkeyConsSistDao = new CJD_ConsulSistemDao(); 
      newDto.setFkeyConsSistDto((CJD_ConsulSistemDto)fkeyConsSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyConsSist")), getDeepLevel()-1));
      CJD_PersonSistemDao fkeyPersSistDao = new CJD_PersonSistemDao(); 
      newDto.setFkeyPersSistDto((CJD_PersonSistemDto)fkeyPersSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyPersSist")), getDeepLevel()-1));
    }
    return newDto;
  }
}

