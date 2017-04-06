package com.bt.univex.ads.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class ADS_MensajAdminiDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_MensajAdmini";
        PkeyName = "PkeyMensAdmi";
        DescName = "null";
        CodeName = "null";
        AliasName = "Mensajes";
        deepLevel = 2;
        setXPracPkeyEnti(132803);
        loadInfoEntity();
    }

    public ADS_MensajAdminiDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_MensajAdminiDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_MensajAdminiDto getDefaultDto()  {
     ADS_MensajAdminiDto dto = new ADS_MensajAdminiDto(); 
     dto.setPkeyMensAdmi(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_MensajAdminiDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyMensAdmi", "PkeyMensAdmi", "N",2),
        new InfoPack("FechMensAdmi", "Fecha", "D",7),
        new InfoPack("TextMensAdmi", "Mensaje", "S",4),
        new InfoPack("LinkMensAdmi", "Vinculo Interno", "S",1),
        new InfoPack("TipoPortModu", "Portal en el cual aparecer", "S",6),
        new InfoPack("EstaActiMens", "Estado", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_MensajAdminiDto newDto = (ADS_MensajAdminiDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

