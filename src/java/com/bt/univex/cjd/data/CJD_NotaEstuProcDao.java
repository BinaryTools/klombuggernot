package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_NotaEstuProcDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_NotaEstuProc";
        PkeyName = "PkeyNotaEstu";
        DescName = "null";
        CodeName = "null";
        AliasName = "NotEstPr";
        deepLevel = 2;
        setXPracPkeyEnti(216703);
        loadInfoEntity();
    }

    public CJD_NotaEstuProcDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_NotaEstuProcDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_NotaEstuProcDto getDefaultDto()  {
     CJD_NotaEstuProcDto dto = new CJD_NotaEstuProcDto(); 
     dto.setPkeyNotaEstu(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_NotaEstuProcDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyNotaEstu", "PkeyNotaEstu", "N",2),
        new InfoPack("FkeyEstuProc", "FkeyEstuProc", "N",3),
        new InfoPack("FkeyPeriAcad", "FkeyPeriAcad", "N",3),
        new InfoPack("NotaEstuProc", "Nota", "F",12),
        new InfoPack("FechRegiNota", "Fecha de registro", "D",7),
        new InfoPack("FechActuNota", "Fecha de actualización", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_NotaEstuProcDto newDto = (CJD_NotaEstuProcDto) dto;
    if (getDeepLevel() != 0) {
      ADS_PeriodAcademDao fkeyPeriAcadDao = new ADS_PeriodAcademDao(); 
      newDto.setFkeyPeriAcadDto((ADS_PeriodAcademDto)fkeyPeriAcadDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriAcad")), getDeepLevel()-1));
      CJD_EstudiProcesDao fkeyEstuProcDao = new CJD_EstudiProcesDao(); 
      newDto.setFkeyEstuProcDto((CJD_EstudiProcesDto)fkeyEstuProcDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstuProc")), getDeepLevel()-1));
    }
    return newDto;
  }
}

