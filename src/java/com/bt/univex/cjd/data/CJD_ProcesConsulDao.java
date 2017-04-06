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
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_ProcesConsulDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_ProcesConsul";
        PkeyName = "PkeyProcCons";
        DescName = "NombProcesos";
        CodeName = "null";
        AliasName = "ProcCons";
        deepLevel = 2;
        setXPracPkeyEnti(128403);
        loadInfoEntity();
    }

    public CJD_ProcesConsulDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_ProcesConsulDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_ProcesConsulDto getDefaultDto()  {
     CJD_ProcesConsulDto dto = new CJD_ProcesConsulDto(); 
     dto.setPkeyProcCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_ProcesConsulDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyProcCons", "PkeyProcCons", "N",2),
        new InfoPack("NombProcesos", "Nombre", "S",1),
        new InfoPack("AreaProcesos", "Área", "S",6),
        new InfoPack("DescProcesos", "Descripción", "S",4),
        new InfoPack("NumeCasoProc", "Número Caso", "S",1),
        new InfoPack("EstaProcesos", "Estado", "S",6),
        new InfoPack("FkeyDoceEspe", "Docente asignado", "N",3),
        new InfoPack("OrigProcCons", "Origen del Proceso", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_ProcesConsulDto newDto = (CJD_ProcesConsulDto) dto;
    if (getDeepLevel() != 0) {
      CJDVDocentEspeciDao fkeyDoceEspeDao = new CJDVDocentEspeciDao(); 
      newDto.setFkeyDoceEspeDto((CJDVDocentEspeciDto)fkeyDoceEspeDao.findDtoByPkey(new Integer(rs.getInt("fkeyDoceEspe")), getDeepLevel()-1));
    }
    return newDto;
  }
}

