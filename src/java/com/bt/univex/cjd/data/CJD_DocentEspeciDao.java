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

public class CJD_DocentEspeciDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_DocentEspeci";
        PkeyName = "PkeyDoceEspe";
        DescName = "null";
        CodeName = "null";
        AliasName = "DoceEspe";
        deepLevel = 2;
        setXPracPkeyEnti(131703);
        loadInfoEntity();
    }

    public CJD_DocentEspeciDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_DocentEspeciDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_DocentEspeciDto getDefaultDto()  {
     CJD_DocentEspeciDto dto = new CJD_DocentEspeciDto(); 
     dto.setPkeyDoceEspe(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_DocentEspeciDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyDoceEspe", "PkeyDoceEspe", "N",2),
        new InfoPack("FkeyProfesor", "FkeyProfesor", "N",3),
        new InfoPack("DoceEspecial", "Especialidad", "S",6),
        new InfoPack("EstaDoceActi", "¿Está activo?", "S",6),
        new InfoPack("CantProcDoce", "Cantidad procesos", "N",5),
        new InfoPack("CantConsDoce", "Cantidad consultas", "N",5),
        new InfoPack("DocentCoordi", "¿Es docente coordinador?", "S",6),
        new InfoPack("CantPeriDoce", "Cantidad peritajes", "N",5)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_DocentEspeciDto newDto = (CJD_DocentEspeciDto) dto;
    if (getDeepLevel() != 0) {
      CRG_DocentUniverDao fkeyProfesorDao = new CRG_DocentUniverDao(); 
      newDto.setFkeyProfesorDto((CRG_DocentUniverDto)fkeyProfesorDao.findDtoByPkey(new Integer(rs.getInt("fkeyProfesor")), getDeepLevel()-1));
    }
    return newDto;
  }
}

