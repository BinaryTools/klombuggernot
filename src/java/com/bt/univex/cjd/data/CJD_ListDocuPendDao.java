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

public class CJD_ListDocuPendDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_ListDocuPend";
        PkeyName = "PkeyListDocu";
        DescName = "null";
        CodeName = "null";
        AliasName = "ListDocu";
        deepLevel = 2;
        setXPracPkeyEnti(132003);
        loadInfoEntity();
    }

    public CJD_ListDocuPendDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_ListDocuPendDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_ListDocuPendDto getDefaultDto()  {
     CJD_ListDocuPendDto dto = new CJD_ListDocuPendDto(); 
     dto.setPkeyListDocu(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_ListDocuPendDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyListDocu", "PkeyListDocu", "N",2),
        new InfoPack("FkeyConsSist", "FkeyConsSist", "N",3),
        new InfoPack("NombDocuPend", "Nombre", "S",1),
        new InfoPack("EstaPendEntr", "¿Se entregó?", "S",6),
        new InfoPack("FechEntrDocu", "Fecha de Entrega", "D",7),
        new InfoPack("ObseListDocu", "Observaciones", "S",4)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_ListDocuPendDto newDto = (CJD_ListDocuPendDto) dto;
    if (getDeepLevel() != 0) {
      CJD_ConsulSistemDao fkeyConsSistDao = new CJD_ConsulSistemDao(); 
      newDto.setFkeyConsSistDto((CJD_ConsulSistemDto)fkeyConsSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyConsSist")), getDeepLevel()-1));
    }
    return newDto;
  }
}

