package com.bt.univex.ads.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class ADS_DivisiMomentDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_DivisiMoment";
        PkeyName = "PkeyDiviMome";
        DescName = "NombMomento_";
        CodeName = "null";
        AliasName = "DiviMome";
        deepLevel = 2;
        setXPracPkeyEnti(5903);
        loadInfoEntity();
    }

    public ADS_DivisiMomentDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_DivisiMomentDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_DivisiMomentDto getDefaultDto()  {
     ADS_DivisiMomentDto dto = new ADS_DivisiMomentDto(); 
     dto.setPkeyDiviMome(0);
     dto.setOrdeDebeReci( new Integer(1));
     dto.setTipoMomento_("N");
     dto.setPorcAplicaci( new Integer(100));
     dto.setNumeNotaReem( new Integer(0));
     dto.setNumeCortNota( new Integer(1));
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_DivisiMomentDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyDiviMome", "PkeyDiviMome", "N",2),
        new InfoPack("FkeyDiviCali", "FkeyDiviCali", "N",3),
        new InfoPack("NombMomento_", "Nombre del Momento", "S",1),
        new InfoPack("OrdeDebeReci", "Orden en que se Debe Recibir", "N",5),
        new InfoPack("TipoMomento_", "Tipo de Momento", "S",6),
        new InfoPack("PorcAplicaci", "Porcentaje de Aplicación", "N",5),
        new InfoPack("NumeNotaReem", "Número de la Nota que Reemplaza", "N",5),
        new InfoPack("NumeCortNota", "No. Corte", "N",5)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_DivisiMomentDto newDto = (ADS_DivisiMomentDto) dto;
    if (getDeepLevel() != 0) {
//      ADS_DivisiCalifiDao fkeyDiviCaliDao = new ADS_DivisiCalifiDao(); 
//      newDto.setFkeyDiviCaliDto((ADS_DivisiCalifiDto)fkeyDiviCaliDao.findDtoByPkey(new Integer(rs.getInt("fkeyDiviCali")), getDeepLevel()-1));
    }
    return newDto;
  }
}

