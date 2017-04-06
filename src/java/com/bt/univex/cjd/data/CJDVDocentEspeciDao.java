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

public class CJDVDocentEspeciDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVDocentEspeci";
        PkeyName = "PkeyDoceEspe";
        DescName = "null";
        CodeName = "null";
        AliasName = "DoceEspeV";
        deepLevel = 2;
        setXPracPkeyEnti(131803);
        loadInfoEntity();
    }

    public CJDVDocentEspeciDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVDocentEspeciDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVDocentEspeciDto getDefaultDto()  {
     CJDVDocentEspeciDto dto = new CJDVDocentEspeciDto(); 
     dto.setPkeyDoceEspe(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVDocentEspeciDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyDoceEspe", "PkeyDoceEspe", "N",2),
        new InfoPack("FkeyProfesor", "FkeyProfesor", "N",3),
        new InfoPack("DoceEspecial", "Especialidad", "S",6),
        new InfoPack("EstaDoceActi", "¿Está activo?", "S",6),
        new InfoPack("NombCompProf", "Nombre", "S",1),
        new InfoPack("CodiDoceUniv", "Código", "S",13),
        new InfoPack("CantProcDoce", "Cantidad Procesos", "N",5),
        new InfoPack("CantConsDoce", "Cantidad consultas", "N",5),
        new InfoPack("DocentCoordi", "¿Es docente coordinador?", "S",6),
        new InfoPack("CantPeriDoce", "Cantidad peritajes", "N",5)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVDocentEspeciDto newDto = (CJDVDocentEspeciDto) dto;
    if (getDeepLevel() != 0) {
      CRG_DocentUniverDao fkeyProfesorDao = new CRG_DocentUniverDao(); 
      newDto.setFkeyProfesorDto((CRG_DocentUniverDto)fkeyProfesorDao.findDtoByPkey(new Integer(rs.getInt("fkeyProfesor")), getDeepLevel()-1));
    }
    return newDto;
  }
}

