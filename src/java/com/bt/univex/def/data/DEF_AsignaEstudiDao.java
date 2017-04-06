package com.bt.univex.def.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.def.data.*;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class DEF_AsignaEstudiDao extends BaseDao {

    private void initializeDao() { 
        TableName = "DEF_AsignaEstudi";
        PkeyName = "PkeyAsigEstu";
        DescName = "NombAsigEstu";
        CodeName = "CodiAsigEstu";
        AliasName = "AsigEstu";
        deepLevel = 2;
        setXPracPkeyEnti(7103);
        loadInfoEntity();
    }

    public DEF_AsignaEstudiDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public DEF_AsignaEstudiDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static DEF_AsignaEstudiDto getDefaultDto()  {
     DEF_AsignaEstudiDto dto = new DEF_AsignaEstudiDto(); 
     dto.setPkeyAsigEstu(0);
     dto.setFkeyFacuUniv( new Integer(0));
     dto.setNumeCredBase( new Integer(1));
     dto.setNumeCredPres( new Integer(1));
     dto.setEstaActiAsig("S");
     dto.setTipoPracAsig("T");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new DEF_AsignaEstudiDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyAsigEstu", "PkeyAsigEstu", "N",2),
        new InfoPack("FkeyFacuUniv", "FkeyFacuUniv", "N",3),
        new InfoPack("CodiAsigEstu", "Código de la Asignatura", "S",13),
        new InfoPack("NombAsigEstu", "Nombre de la Asignatura", "S",1),
        new InfoPack("DescAsigEstu", "Descripción de la Asignatura", "S",4),
        new InfoPack("InfoAdicMate", "Información Adicional", "S",4),
        new InfoPack("NumeCredBase", "Número de Créditos Base", "N",5),
        new InfoPack("NumeCredPres", "Créditos para Préstamo", "N",5),
        new InfoPack("EstaActiAsig", "¿Está activa?", "S",6),
        new InfoPack("TipoPracAsig", "Tipo de Practicidad", "S",6),
        new InfoPack("FkeyProgAcad", "Programa Acad", "N",3)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    DEF_AsignaEstudiDto newDto = (DEF_AsignaEstudiDto) dto;
    if (getDeepLevel() != 0) {
      ADS_PrograAcademDao fkeyProgAcadDao = new ADS_PrograAcademDao(); 
      newDto.setFkeyProgAcadDto((ADS_PrograAcademDto)fkeyProgAcadDao.findDtoByPkey(new Integer(rs.getInt("fkeyProgAcad")), getDeepLevel()-1));
    }
    return newDto;
  }
}

