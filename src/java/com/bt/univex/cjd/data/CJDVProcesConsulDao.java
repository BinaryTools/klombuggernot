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

public class CJDVProcesConsulDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVProcesConsul";
        PkeyName = "PkeyProcCons";
        DescName = "NombProcesos";
        CodeName = "null";
        AliasName = "ProcConsV";
        deepLevel = 2;
        setXPracPkeyEnti(130103);
        loadInfoEntity();
    }

    public CJDVProcesConsulDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVProcesConsulDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVProcesConsulDto getDefaultDto()  {
     CJDVProcesConsulDto dto = new CJDVProcesConsulDto(); 
     dto.setPkeyProcCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVProcesConsulDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyProcCons", "PkeyProcCons", "N",2),
        new InfoPack("NombProcesos", "Nombre Proceso", "S",1),
        new InfoPack("AreaProcesos", "Area Proceso", "S",6),
        new InfoPack("DescProcesos", "Descripción Proceso", "S",4),
        new InfoPack("NumeCasoProc", "Número caso", "S",1),
        new InfoPack("EstaProcesos", "Estado Proceso", "S",6),
        new InfoPack("OrigProcCons", "Origen del proceso", "S",1),
        new InfoPack("FkeyDoceEspe", "Docente asignado", "N",3),
        new InfoPack("NombCompProf", "Docente Asignado", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVProcesConsulDto newDto = (CJDVProcesConsulDto) dto;
    if (getDeepLevel() != 0) {
      CJDVDocentEspeciDao fkeyDoceEspeDao = new CJDVDocentEspeciDao(); 
      newDto.setFkeyDoceEspeDto((CJDVDocentEspeciDto)fkeyDoceEspeDao.findDtoByPkey(new Integer(rs.getInt("fkeyDoceEspe")), getDeepLevel()-1));
    }
    return newDto;
  }
}

