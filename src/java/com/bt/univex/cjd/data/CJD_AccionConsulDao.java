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

public class CJD_AccionConsulDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_AccionConsul";
        PkeyName = "PkeyAcciCons";
        DescName = "null";
        CodeName = "null";
        AliasName = "AcciCons";
        deepLevel = 2;
        setXPracPkeyEnti(169303);
        loadInfoEntity();
    }

    public CJD_AccionConsulDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_AccionConsulDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_AccionConsulDto getDefaultDto()  {
     CJD_AccionConsulDto dto = new CJD_AccionConsulDto(); 
     dto.setPkeyAcciCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_AccionConsulDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAcciCons", "PkeyAcciCons", "N",2),
        new InfoPack("FkeyConsSist", "FkeyConsSist", "N",3),
        new InfoPack("FechAcciCons", "Fecha Creado", "D",7),
        new InfoPack("FechLimiAcci", "Fecha Límite", "D",7),
        new InfoPack("FechEntrAcci", "Fecha de entrega", "D",7),
        new InfoPack("CaliDoceAcci", "Calificación", "F",12),
        new InfoPack("ObseDoceAcci", "Observaciones", "S",4),
        new InfoPack("CreaEstuDoce", "Creada por", "S",6),
        new InfoPack("TareAcciCons", "TareAcciCons", "S",4),
        new InfoPack("ObseDoceCoor", "Observaciones", "S",4)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_AccionConsulDto newDto = (CJD_AccionConsulDto) dto;
    if (getDeepLevel() != 0) {
      CJD_ConsulSistemDao fkeyConsSistDao = new CJD_ConsulSistemDao(); 
      newDto.setFkeyConsSistDto((CJD_ConsulSistemDto)fkeyConsSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyConsSist")), getDeepLevel()-1));
    }
    return newDto;
  }
}

