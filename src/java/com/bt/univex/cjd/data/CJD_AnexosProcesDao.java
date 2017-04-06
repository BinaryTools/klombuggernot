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

public class CJD_AnexosProcesDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_AnexosProces";
        PkeyName = "PkeyAnexProc";
        DescName = "InfoAnexProc";
        CodeName = "null";
        AliasName = "AnexProc";
        deepLevel = 2;
        setXPracPkeyEnti(128603);
        loadInfoEntity();
    }

    public CJD_AnexosProcesDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_AnexosProcesDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_AnexosProcesDto getDefaultDto()  {
     CJD_AnexosProcesDto dto = new CJD_AnexosProcesDto(); 
     dto.setPkeyAnexProc(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_AnexosProcesDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAnexProc", "PkeyAnexProc", "N",2),
        new InfoPack("FkeyClasObse", "FkeyClasObse", "N",3),
        new InfoPack("FkeyProcCons", "FkeyProcCons", "N",3),
        new InfoPack("InfoAnexProc", "Información", "S",4),
        new InfoPack("FechModiAnex", "Fecha Modificación", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_AnexosProcesDto newDto = (CJD_AnexosProcesDto) dto;
    if (getDeepLevel() != 0) {
      CJD_ProcesConsulDao fkeyProcConsDao = new CJD_ProcesConsulDao(); 
      newDto.setFkeyProcConsDto((CJD_ProcesConsulDto)fkeyProcConsDao.findDtoByPkey(new Integer(rs.getInt("fkeyProcCons")), getDeepLevel()-1));
      CJD_Clase_ObservDao fkeyClasObseDao = new CJD_Clase_ObservDao(); 
      newDto.setFkeyClasObseDto((CJD_Clase_ObservDto)fkeyClasObseDao.findDtoByPkey(new Integer(rs.getInt("fkeyClasObse")), getDeepLevel()-1));
    }
    return newDto;
  }
}

