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
import com.bt.univex.def.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_AccionExpediDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_AccionExpedi";
        PkeyName = "PkeyAcciExpe";
        DescName = "null";
        CodeName = "null";
        AliasName = "AcciExpe";
        deepLevel = 2;
        setXPracPkeyEnti(129503);
        loadInfoEntity();
    }

    public CJD_AccionExpediDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_AccionExpediDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_AccionExpediDto getDefaultDto()  {
     CJD_AccionExpediDto dto = new CJD_AccionExpediDto(); 
     dto.setPkeyAcciExpe(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_AccionExpediDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAcciExpe", "PkeyAcciExpe", "N",2),
        new InfoPack("FkeyEstuProc", "FkeyEstuProc", "N",3),
        new InfoPack("FkeyProcCons", "FkeyProcCons", "N",3),
        new InfoPack("FechAcciExpe", "Fecha Creado", "D",7),
        new InfoPack("FechLimiAcci", "Fecha Límite", "D",7),
        new InfoPack("FechEntrAcci", "Fecha de Entrega", "D",7),
        new InfoPack("CaliDoceAcci", "Calificación", "F",12),
        new InfoPack("ObseDoceAcci", "Observaciones", "S",4),
        new InfoPack("CreaEstuDoce", "Creada por", "S",6),
        new InfoPack("TareAcciExpe", "Tareas", "S",4),
        new InfoPack("ObseDoceCoor", "Observaciones Docente Coordinador", "S",4),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("EstaAcciVali", "Es valida la acción", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_AccionExpediDto newDto = (CJD_AccionExpediDto) dto;
    if (getDeepLevel() != 0) {
      CJD_EstudiProcesDao fkeyEstuProcDao = new CJD_EstudiProcesDao(); 
      newDto.setFkeyEstuProcDto((CJD_EstudiProcesDto)fkeyEstuProcDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstuProc")), getDeepLevel()-1));
      CJD_ProcesConsulDao fkeyProcConsDao = new CJD_ProcesConsulDao(); 
      newDto.setFkeyProcConsDto((CJD_ProcesConsulDto)fkeyProcConsDao.findDtoByPkey(new Integer(rs.getInt("fkeyProcCons")), getDeepLevel()-1));
      DEFVPeriPlanProgDao fkeyPeriPlanDao = new DEFVPeriPlanProgDao(); 
      newDto.setFkeyPeriPlanDto((DEFVPeriPlanProgDto)fkeyPeriPlanDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriPlan")), getDeepLevel()-1));
    }
    return newDto;
  }
}

