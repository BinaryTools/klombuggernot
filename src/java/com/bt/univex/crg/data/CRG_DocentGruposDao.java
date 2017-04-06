package com.bt.univex.crg.data;

import com.bt.univex.ads.data.ADS_DivisiMomentDao;
import com.bt.univex.ads.data.ADS_DivisiMomentDto;
import com.xpc.base.BaseDao;
import com.xpc.base.BaseDto;
import com.xpc.base.InfoPack;
import com.xpc.binarytool.univex.connect.Connect;
import com.xpc.connect.BaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class CRG_DocentGruposDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CRG_DocentGrupos";
        PkeyName = "PkeyDoceGrup";
        DescName = "null";
        CodeName = "null";
        AliasName = "DoceGrup";
        deepLevel = 2;
        setXPracPkeyEnti(45403);
        loadInfoEntity();
    }

    public CRG_DocentGruposDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CRG_DocentGruposDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CRG_DocentGruposDto getDefaultDto()  {
     CRG_DocentGruposDto dto = new CRG_DocentGruposDto(); 
     dto.setPkeyDoceGrup(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CRG_DocentGruposDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyDoceGrup", "PkeyDoceGrup", "N",2),
        new InfoPack("FkeyProfesor", "FkeyProfesor", "N",3),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("FkeyDiviMome", "FkeyDiviMome", "N",3)      }
        ));
    }
  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CRG_DocentGruposDto newDto = (CRG_DocentGruposDto) dto;
    if (getDeepLevel() != 0) {
      ADS_DivisiMomentDao fkeyDiviMomeDao = new ADS_DivisiMomentDao(); 
      newDto.setFkeyDiviMomeDto((ADS_DivisiMomentDto)fkeyDiviMomeDao.findDtoByPkey(new Integer(rs.getInt("fkeyDiviMome")), getDeepLevel()-1));
      CRG_DocentUniverDao fkeyProfesorDao = new CRG_DocentUniverDao(); 
      newDto.setFkeyProfesorDto((CRG_DocentUniverDto)fkeyProfesorDao.findDtoByPkey(new Integer(rs.getInt("fkeyProfesor")), getDeepLevel()-1));
    }
    return newDto;
  }
}

