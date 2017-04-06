package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_EstudiProcesDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_EstudiProces";
        PkeyName = "PkeyEstuProc";
        DescName = "null";
        CodeName = "null";
        AliasName = "EstuProc";
        deepLevel = 2;
        setXPracPkeyEnti(128503);
        loadInfoEntity();
    }

    public CJD_EstudiProcesDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_EstudiProcesDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_EstudiProcesDto getDefaultDto()  {
     CJD_EstudiProcesDto dto = new CJD_EstudiProcesDto(); 
     dto.setPkeyEstuProc(0);
     dto.setEstaMuesRepo("N");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_EstudiProcesDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyEstuProc", "PkeyEstuProc", "N",2),
        new InfoPack("FkeyProcCons", "FkeyProcCons", "N",3),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FechAsigProc", "Fecha Asignación", "D",7),
        new InfoPack("FechEntrProc", "Fecha Entrega", "D",7),
        new InfoPack("NotaProcCons", "Nota proceso", "F",12),
        new InfoPack("EstaMuesRepo", "Estado para reporte", "S",6),
        new InfoPack("FechNotaProc", "Fecha Calificación", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_EstudiProcesDto newDto = (CJD_EstudiProcesDto) dto;
    if (getDeepLevel() != 0) {
      CJD_ProcesConsulDao fkeyProcConsDao = new CJD_ProcesConsulDao(); 
      newDto.setFkeyProcConsDto((CJD_ProcesConsulDto)fkeyProcConsDao.findDtoByPkey(new Integer(rs.getInt("fkeyProcCons")), getDeepLevel()-1));
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
    }
    return newDto;
  }
}

