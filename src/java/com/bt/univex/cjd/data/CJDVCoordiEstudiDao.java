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

public class CJDVCoordiEstudiDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVCoordiEstudi";
        PkeyName = "PkeyCoorEstu";
        DescName = "CodiEstuDian";
        CodeName = "null";
        AliasName = "CoorEstuV";
        deepLevel = 2;
        setXPracPkeyEnti(130403);
        loadInfoEntity();
    }

    public CJDVCoordiEstudiDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVCoordiEstudiDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVCoordiEstudiDto getDefaultDto()  {
     CJDVCoordiEstudiDto dto = new CJDVCoordiEstudiDto(); 
     dto.setPkeyCoorEstu(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVCoordiEstudiDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyCoorEstu", "PkeyCoorEstu", "N",2),
        new InfoPack("FkeyEstuDian", "FkeyEstuDian", "N",3),
        new InfoPack("EsunGrupComp", "¿Grupo compuesto?", "S",6),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("FkeyProgAcad", "FkeyProgAcad", "N",3),
        new InfoPack("FkeyHojaVida", "FkeyHojaVida", "N",3),
        new InfoPack("FkeyInscRipc", "FkeyInscRipc", "N",3),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("CodiEstuDian", "CodiEstuDian", "S",13),
        new InfoPack("EstaCoorEstu", "¿Está activo?", "S",6),
        new InfoPack("EstaActiEstu", "EstaActiEstu", "S",6),
        new InfoPack("EstaAcadEstu", "EstaAcadEstu", "S",6),
        new InfoPack("NombEstudian", "Nombre Estudiante", "S",1),
        new InfoPack("ApelEstuDian", "Apellido Estudiante", "S",1),
        new InfoPack("SeguApelEstu", "Segundo Apellido Estudiante", "S",1),
        new InfoPack("TipoGrupAsig", "Tipo de grupo", "S",6),
        new InfoPack("NombGrupNive", "NombGrupNive", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVCoordiEstudiDto newDto = (CJDVCoordiEstudiDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

