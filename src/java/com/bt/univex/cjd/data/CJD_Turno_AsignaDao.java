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

public class CJD_Turno_AsignaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_Turno_Asigna";
        PkeyName = "PkeyTurnAsig";
        DescName = "null";
        CodeName = "null";
        AliasName = "TurnAsig";
        deepLevel = 2;
        setXPracPkeyEnti(129303);
        loadInfoEntity();
    }

    public CJD_Turno_AsignaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_Turno_AsignaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_Turno_AsignaDto getDefaultDto()  {
     CJD_Turno_AsignaDto dto = new CJD_Turno_AsignaDto(); 
     dto.setPkeyTurnAsig(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_Turno_AsignaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyTurnAsig", "PkeyTurnAsig", "N",2),
        new InfoPack("FkeyConsSist", "FkeyConsSist", "N",3),
        new InfoPack("FechTurnAsig", "Fecha", "D",7),
        new InfoPack("HoraAtenTurn", "Hora de Atención", "N",5),
        new InfoPack("EfecTurnAsig", "¿Se efectuó el turno?", "S",6),
        new InfoPack("ObseTurnAsig", "Observaciones", "S",4)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_Turno_AsignaDto newDto = (CJD_Turno_AsignaDto) dto;
    if (getDeepLevel() != 0) {
      CJD_ConsulSistemDao fkeyConsSistDao = new CJD_ConsulSistemDao(); 
      newDto.setFkeyConsSistDto((CJD_ConsulSistemDto)fkeyConsSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyConsSist")), getDeepLevel()-1));
    }
    return newDto;
  }
}

