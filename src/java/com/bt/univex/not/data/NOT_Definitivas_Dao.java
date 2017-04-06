package com.bt.univex.not.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.bt.univex.def.data.* ;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class NOT_Definitivas_Dao extends BaseDao {

    private void initializeDao() { 
        TableName = "NOT_Definitivas_";
        PkeyName = "PkeyDefiniti";
        DescName = "NotaNumerica";
        CodeName = "null";
        AliasName = "Definiti";
        deepLevel = 2;
        setXPracPkeyEnti(22703);
        loadInfoEntity();
    }

    public NOT_Definitivas_Dao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public NOT_Definitivas_Dao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static NOT_Definitivas_Dto getDefaultDto()  {
     NOT_Definitivas_Dto dto = new NOT_Definitivas_Dto(); 
     dto.setPkeyDefiniti(0);
     dto.setNotaNumerica( new Double(0));
     dto.setEstaAproDefi("N");
     dto.setCompCursAsig("S");
     dto.setTipoOrigNota("N");
     dto.setFue_ReviDefi("V");
     dto.setCredDefiniti( new Integer(1));
     dto.setPondPromDefi( new Double(1));
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new NOT_Definitivas_Dto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyDefiniti", "PkeyDefiniti", "N",2),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FkeyAsigEstu", "FkeyAsigEstu", "N",3),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("FkeyClasCali", "FkeyClasCali", "N",3),
        new InfoPack("NotaNumerica", "Nota", "F",12),
        new InfoPack("FkeyNotaRang", "FkeyNotaRang", "N",3),
        new InfoPack("NotaValoRang", "NotaValoRang", "S",1),
        new InfoPack("EstaAproDefi", "¿Aprobada?", "S",6),
        new InfoPack("CompCursAsig", "¿Completó?", "S",6),
        new InfoPack("TipoOrigNota", "Tipo de Origen", "S",6),
        new InfoPack("NiveDondCurs", "Nivel", "N",5),
        new InfoPack("Fue_ReviDefi", "Estado", "S",6),
        new InfoPack("FechReviDefi", "Fecha de Revisión", "D",7),
        new InfoPack("CredDefiniti", "Creditos", "N",5),
        new InfoPack("PondPromDefi", "Ponderación", "F",12)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    NOT_Definitivas_Dto newDto = (NOT_Definitivas_Dto) dto;
    if (getDeepLevel() != 0) {
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
//      DEF_AsignaEstudiDao fkeyAsigEstuDao = new DEF_AsignaEstudiDao(); 
//      newDto.setFkeyAsigEstuDto((DEF_AsignaEstudiDto)fkeyAsigEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyAsigEstu")), getDeepLevel()-1));
      DEFVPeriPlanProgDao fkeyPeriPlanDao = new DEFVPeriPlanProgDao(); 
      newDto.setFkeyPeriPlanDto((DEFVPeriPlanProgDto)fkeyPeriPlanDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriPlan")), getDeepLevel()-1));
      ADS_Clase_CalifiDao fkeyClasCaliDao = new ADS_Clase_CalifiDao(); 
      newDto.setFkeyClasCaliDto((ADS_Clase_CalifiDto)fkeyClasCaliDao.findDtoByPkey(new Integer(rs.getInt("fkeyClasCali")), getDeepLevel()-1));
    }
    return newDto;
  }
}

