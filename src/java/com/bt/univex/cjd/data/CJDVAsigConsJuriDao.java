package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.def.data.* ;
import com.bt.univex.crg.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJDVAsigConsJuriDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVAsigConsJuri";
        PkeyName = "PkeyAsigCons";
        DescName = "null";
        CodeName = "null";
        AliasName = "AsigConsV";
        deepLevel = 2;
        setXPracPkeyEnti(130503);
        loadInfoEntity();
    }

    public CJDVAsigConsJuriDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVAsigConsJuriDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVAsigConsJuriDto getDefaultDto()  {
     CJDVAsigConsJuriDto dto = new CJDVAsigConsJuriDto(); 
     dto.setPkeyAsigCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVAsigConsJuriDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAsigCons", "PkeyAsigCons", "N",2),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("CodiAsigEstu", "Código", "S",13),
        new InfoPack("NombAsigEstu", "Asignatura", "S",1),
        new InfoPack("NombGrupNive", "Grupo/Nivel", "S",1),
        new InfoPack("NiveDentPlan", "Nivel", "S",13),
        new InfoPack("Descripcion", "Descripción", "S",4)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVAsigConsJuriDto newDto = (CJDVAsigConsJuriDto) dto;
    if (getDeepLevel() != 0) {
      DEFVPeriPlanProgDao fkeyPeriPlanDao = new DEFVPeriPlanProgDao(); 
      newDto.setFkeyPeriPlanDto((DEFVPeriPlanProgDto)fkeyPeriPlanDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriPlan")), getDeepLevel()-1));
      CRG_Grupo_AsignaDao fkeyGrupAsigDao = new CRG_Grupo_AsignaDao(); 
      newDto.setFkeyGrupAsigDto((CRG_Grupo_AsignaDto)fkeyGrupAsigDao.findDtoByPkey(new Integer(rs.getInt("fkeyGrupAsig")), getDeepLevel()-1));
    }
    return newDto;
  }
}

