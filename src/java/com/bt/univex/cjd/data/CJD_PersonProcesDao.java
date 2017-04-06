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

public class CJD_PersonProcesDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_PersonProces";
        PkeyName = "PkeyPersProc";
        DescName = "null";
        CodeName = "null";
        AliasName = "PersProc";
        deepLevel = 2;
        setXPracPkeyEnti(128903);
        loadInfoEntity();
    }

    public CJD_PersonProcesDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_PersonProcesDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_PersonProcesDto getDefaultDto()  {
     CJD_PersonProcesDto dto = new CJD_PersonProcesDto(); 
     dto.setPkeyPersProc(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_PersonProcesDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPersProc", "PkeyPersProc", "N",2),
        new InfoPack("FkeyPersSist", "FkeyPersSist", "N",3),
        new InfoPack("FkeyProcCons", "FkeyProcCons", "N",3),
        new InfoPack("FechRelaProc", "Fecha Relación", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_PersonProcesDto newDto = (CJD_PersonProcesDto) dto;
    if (getDeepLevel() != 0) {
      CJD_ProcesConsulDao fkeyProcConsDao = new CJD_ProcesConsulDao(); 
      newDto.setFkeyProcConsDto((CJD_ProcesConsulDto)fkeyProcConsDao.findDtoByPkey(new Integer(rs.getInt("fkeyProcCons")), getDeepLevel()-1));
      CJD_PersonSistemDao fkeyPersSistDao = new CJD_PersonSistemDao(); 
      newDto.setFkeyPersSistDto((CJD_PersonSistemDto)fkeyPersSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyPersSist")), getDeepLevel()-1));
    }
    return newDto;
  }
}

