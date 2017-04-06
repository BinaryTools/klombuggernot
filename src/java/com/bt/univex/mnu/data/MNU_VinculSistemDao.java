package com.bt.univex.mnu.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.mnu.data.*;
import com.bt.univex.mnu.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class MNU_VinculSistemDao extends BaseDao {

    private void initializeDao() { 
        TableName = "MNU_VinculSistem";
        PkeyName = "PkeyVinculo_";
        DescName = "NombVinculo_";
        CodeName = "null";
        AliasName = "VinculSistem";
        deepLevel = 2;
        setXPracPkeyEnti(74103);
        loadInfoEntity();
    }

    public MNU_VinculSistemDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public MNU_VinculSistemDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static MNU_VinculSistemDto getDefaultDto()  {
     MNU_VinculSistemDto dto = new MNU_VinculSistemDto(); 
     dto.setPkeyVinculo_(0);
     dto.setTipoVinculo_("I");
     dto.setEsunCargAuto("N");
     dto.setSub_TipoVinc("N");
     dto.setEsunVincArbo("N");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new MNU_VinculSistemDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyVinculo_", "PkeyVinculo_", "N",2),
        new InfoPack("FkeyModuSist", "FkeyModuSist", "N",3),
        new InfoPack("FkeyArbolNuevo", "FkeyArbolNuev", "N",3),
        new InfoPack("FkeyOrigDato", "FkeyOrigDato", "N",3),
        new InfoPack("OrdeVincSist", "Orden", "N",5),
        new InfoPack("TipoVinculo_", "Tipo Vínculo", "S",6),
        new InfoPack("NombMethExec", "Servicio del Servidor", "S",1),
        new InfoPack("NombVinculo_", "Nombre Vínculo", "S",1),
        new InfoPack("ClasPathExec", "Ruta de la Clase", "S",1),
        new InfoPack("AliaVinculo_", "Alias", "S",1),
        new InfoPack("LinkVinculo_", "Link Vínculo", "S",1),
        new InfoPack("EsunCargAuto", "Cargue automático", "S",6),
        new InfoPack("Sub_TipoVinc", "Sub tipo de vínculo", "S",6),
        new InfoPack("AliaArboEjec", "Alias árbol", "S",1),
        new InfoPack("EsunVincArbo", "Es un viculo de árbol", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    MNU_VinculSistemDto newDto = (MNU_VinculSistemDto) dto;
    if (getDeepLevel() != 0) {
      MNU_ModuloSistemDao fkeyModuSistDao = new MNU_ModuloSistemDao(); 
      newDto.setFkeyModuSistDto((MNU_ModuloSistemDto)fkeyModuSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyModuSist")), getDeepLevel()-1));
    }
    return newDto;
  }
}

