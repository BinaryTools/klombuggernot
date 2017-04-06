package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class CJDVEstudiAplicaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVEstudiAplica";
        PkeyName = "PkeyEstuApli";
        DescName = "null";
        CodeName = "null";
        AliasName = "EstuApliV";
        deepLevel = 2;
        setXPracPkeyEnti(130703);
        loadInfoEntity();
    }

    public CJDVEstudiAplicaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVEstudiAplicaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVEstudiAplicaDto getDefaultDto()  {
     CJDVEstudiAplicaDto dto = new CJDVEstudiAplicaDto(); 
     dto.setPkeyEstuApli(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVEstudiAplicaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyEstuApli", "PkeyEstuApli", "N",2),
        new InfoPack("FkeyEstuDian", "FkeyEstuDian", "N",3),
        new InfoPack("FechCertEstu", "FechCertEstu", "D",7),
        new InfoPack("FkeyProgAcad", "FkeyProgAcad", "N",3),
        new InfoPack("FkeyHojaVida", "FkeyHojaVida", "N",3),
        new InfoPack("FkeyInscRipc", "FkeyInscRipc", "N",3),
        new InfoPack("CodiEstudian", "Codigo Estudian", "S",13),
        new InfoPack("EstaActiEstu", "EstaActiEstu", "S",6),
        new InfoPack("EstaAcadEstu", "EstaAcadEstu", "S",6),
        new InfoPack("NombEstuDian", "NombEstuDian", "S",1),
        new InfoPack("ApelEstuDian", "ApelEstuDian", "S",1),
        new InfoPack("SeguApelEstu", "Segundo Apellido Estudiante", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVEstudiAplicaDto newDto = (CJDVEstudiAplicaDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

