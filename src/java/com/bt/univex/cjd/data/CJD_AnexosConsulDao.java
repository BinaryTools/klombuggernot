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

public class CJD_AnexosConsulDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_AnexosConsul";
        PkeyName = "PkeyAnexCons";
        DescName = "InfoAnexCons";
        CodeName = "null";
        AliasName = "AnexCons";
        deepLevel = 2;
        setXPracPkeyEnti(128803);
        loadInfoEntity();
    }

    public CJD_AnexosConsulDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_AnexosConsulDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_AnexosConsulDto getDefaultDto()  {
     CJD_AnexosConsulDto dto = new CJD_AnexosConsulDto(); 
     dto.setPkeyAnexCons(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_AnexosConsulDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAnexCons", "PkeyAnexCons", "N",2),
        new InfoPack("FkeyClasObse", "FkeyClasObse", "N",3),
        new InfoPack("FkeyConsSist", "FkeyConsSist", "N",3),
        new InfoPack("InfoAnexCons", "Información", "S",4),
        new InfoPack("FechModiAnex", "Fecha de modificado", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_AnexosConsulDto newDto = (CJD_AnexosConsulDto) dto;
    if (getDeepLevel() != 0) {
      CJD_Clase_ObservDao fkeyClasObseDao = new CJD_Clase_ObservDao(); 
      newDto.setFkeyClasObseDto((CJD_Clase_ObservDto)fkeyClasObseDao.findDtoByPkey(new Integer(rs.getInt("fkeyClasObse")), getDeepLevel()-1));
      CJD_ConsulSistemDao fkeyConsSistDao = new CJD_ConsulSistemDao(); 
      newDto.setFkeyConsSistDto((CJD_ConsulSistemDto)fkeyConsSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyConsSist")), getDeepLevel()-1));
    }
    return newDto;
  }
}

