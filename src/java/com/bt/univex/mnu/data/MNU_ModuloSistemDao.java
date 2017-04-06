package com.bt.univex.mnu.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.mnu.data.*;
import com.bt.univex.xpc.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class MNU_ModuloSistemDao extends BaseDao {

    private void initializeDao() { 
        TableName = "MNU_ModuloSistem";
        PkeyName = "PkeyModuSist";
        DescName = "NombModuSist";
        CodeName = "OrdeModuSist";
        AliasName = "ModuloSistem";
        deepLevel = 2;
        setXPracPkeyEnti(73203);
        loadInfoEntity();
    }

    public MNU_ModuloSistemDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public MNU_ModuloSistemDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static MNU_ModuloSistemDto getDefaultDto()  {
     MNU_ModuloSistemDto dto = new MNU_ModuloSistemDto(); 
     dto.setPkeyModuSist(0);
     dto.setOrdeModuSist( new Integer(10));
     dto.setTipoPortModu("G");
     dto.setEstaActiModu("S");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new MNU_ModuloSistemDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyModuSist", "PkeyModuSist", "N",2),
        new InfoPack("FkeyProyInfo", "FkeyProyInfo", "N",3),
        new InfoPack("OrdeModuSist", "Orden", "N",5),
        new InfoPack("NombModuSist", "Nombre", "S",1),
        new InfoPack("AliaModuSist", "Alias", "S",1),
        new InfoPack("DescModuSist", "Descripción", "S",4),
        new InfoPack("TipoPortModu", "Portal", "S",6),
        new InfoPack("EstaActiModu", "¿Esta Activo?", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    MNU_ModuloSistemDto newDto = (MNU_ModuloSistemDto) dto;
    if (getDeepLevel() != 0) {
      XPC_ProyecInformDao fkeyProyInfoDao = new XPC_ProyecInformDao(); 
      newDto.setFkeyProyInfoDto((XPC_ProyecInformDto)fkeyProyInfoDao.findDtoByPkey(new Integer(rs.getInt("fkeyProyInfo")), getDeepLevel()-1));
    }
    return newDto;
  }
}

