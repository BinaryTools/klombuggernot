package com.bt.univex.not.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.not.data.*;
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class NOT_CalificacionDao extends BaseDao {

    private void initializeDao() { 
        TableName = "NOT_Calificacion";
        PkeyName = "PkeyCalifica";
        DescName = "null";
        CodeName = "null";
        AliasName = "Califica";
        deepLevel = 2;
        setXPracPkeyEnti(22603);
        loadInfoEntity();
    }

    public NOT_CalificacionDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public NOT_CalificacionDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static NOT_CalificacionDto getDefaultDto()  {
     NOT_CalificacionDto dto = new NOT_CalificacionDto(); 
     dto.setPkeyCalifica(0);
     dto.setNotaNumerica( new Integer(0));
     dto.setEstaAproCali("N");
     dto.setFue_PresCali("N");
     dto.setFue_Revisada("N");
     dto.setNumeFallParc( new Integer(0));
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new NOT_CalificacionDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyCalifica", "PkeyCalifica", "N",2),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("FkeyDiviMome", "FkeyDiviMome", "N",3),
        new InfoPack("FkeyClasCali", "FkeyClasCali", "N",3),
        new InfoPack("NotaNumerica", "Nota", "N",8),
        new InfoPack("FkeyNotaRang", "FkeyNotaRang", "N",3),
        new InfoPack("NotaValoRang", "Nota Rango", "S",1),
        new InfoPack("EstaAproCali", "¿Aprobada?", "S",6),
        new InfoPack("Fue_PresCali", "¿Presentada?", "S",6),
        new InfoPack("Fue_Revisada", "¿Revisada?", "S",6),
        new InfoPack("FechModiCali", "Fecha Modificación", "D",7),
        new InfoPack("NumeFallParc", "Número de Fallas", "N",5)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    NOT_CalificacionDto newDto = (NOT_CalificacionDto) dto;
    if (getDeepLevel() != 0) {
      ADS_DivisiMomentDao fkeyDiviMomeDao = new ADS_DivisiMomentDao(); 
      newDto.setFkeyDiviMomeDto((ADS_DivisiMomentDto)fkeyDiviMomeDao.findDtoByPkey(new Integer(rs.getInt("fkeyDiviMome")), getDeepLevel()-1));
      ADS_Clase_CalifiDao fkeyClasCaliDao = new ADS_Clase_CalifiDao(); 
      newDto.setFkeyClasCaliDto((ADS_Clase_CalifiDto)fkeyClasCaliDao.findDtoByPkey(new Integer(rs.getInt("fkeyClasCali")), getDeepLevel()-1));
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
    }
    return newDto;
  }
}

