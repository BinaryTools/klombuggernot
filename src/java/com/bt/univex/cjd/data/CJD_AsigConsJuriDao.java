package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.crg.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_AsigConsJuriDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_AsigConsJuri";
        PkeyName = "PkeyAsigCons";
        DescName = "null";
        CodeName = "null";
        AliasName = "AsigCons";
        deepLevel = 2;
        setXPracPkeyEnti(129803);
        loadInfoEntity();
    }

    public CJD_AsigConsJuriDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_AsigConsJuriDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_AsigConsJuriDto getDefaultDto()  {
     CJD_AsigConsJuriDto dto = new CJD_AsigConsJuriDto(); 
     dto.setPkeyAsigCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_AsigConsJuriDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAsigCons", "PkeyAsigCons", "N",2),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_AsigConsJuriDto newDto = (CJD_AsigConsJuriDto) dto;
    if (getDeepLevel() != 0) {
      CRGVGrupo_AsignaDao fkeyGrupAsigDao = new CRGVGrupo_AsignaDao(); 
      newDto.setFkeyGrupAsigDto((CRGVGrupo_AsignaDto)fkeyGrupAsigDao.findDtoByPkey(new Integer(rs.getInt("fkeyGrupAsig")), getDeepLevel()-1));
    }
    return newDto;
  }
}

