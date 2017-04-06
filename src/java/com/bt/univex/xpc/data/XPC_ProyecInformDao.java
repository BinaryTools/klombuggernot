package com.bt.univex.xpc.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.xpc.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class XPC_ProyecInformDao extends BaseDao {

    private void initializeDao() { 
        TableName = "XPC_ProyecInform";
        PkeyName = "PkeyProyInfo";
        DescName = "TituProyInfo";
        CodeName = "null";
        AliasName = "ProyecInform";
        deepLevel = 2;
        setXPracPkeyEnti(74903);
        loadInfoEntity();
    }

    public XPC_ProyecInformDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public XPC_ProyecInformDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static XPC_ProyecInformDto getDefaultDto()  {
     XPC_ProyecInformDto dto = new XPC_ProyecInformDto(); 
     dto.setPkeyProyInfo(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new XPC_ProyecInformDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyProyInfo", "PkeyProyInfo", "N",2),
        new InfoPack("NombProyInfo", "NombProyInfo", "S",1),
        new InfoPack("TituProyInfo", "TituProyInfo", "S",1),
        new InfoPack("DescProyInfo", "DescProyInfo", "S",1),
        new InfoPack("NombDataBase", "NombDataBase", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    XPC_ProyecInformDto newDto = (XPC_ProyecInformDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

