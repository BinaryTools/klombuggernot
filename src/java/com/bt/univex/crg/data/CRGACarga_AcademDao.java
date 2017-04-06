package com.bt.univex.crg.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.crg.data.*;
import com.bt.univex.def.data.* ;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CRGACarga_AcademDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CRGACarga_Academ";
        PkeyName = "PkeyCargAcad";
        DescName = "null";
        CodeName = "CodiEstudian";
        AliasName = "CargAsig";
        deepLevel = 2;
        setXPracPkeyEnti(44603);
        loadInfoEntity();
    }

    public CRGACarga_AcademDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CRGACarga_AcademDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CRGACarga_AcademDto getDefaultDto()  {
     CRGACarga_AcademDto dto = new CRGACarga_AcademDto(); 
     dto.setPkeyCargAcad(0);
     dto.setEstaActiEstu("S");
     dto.setNumeVecePerd( new Integer(0));
     dto.setDebeInscPeri("S");
     dto.setNumeCredCarg( new Integer(0));
     dto.setVeceCancAsig( new Integer(0));
     dto.setTipoIngrEstu("N");
     dto.setEstaCancMate("N");
     dto.setEstaAsigCarg("S");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CRGACarga_AcademDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyCargAcad", "PkeyCargAcad", "N",2),
        new InfoPack("FkeyAsigEstu", "FkeyAsigEstu", "N",3),
        new InfoPack("FkeyGrupNive", "FkeyGrupNive", "N",3),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("CodiEstudian", "Código", "S",1),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("EstaActiEstu", "¿Está Activo?", "S",6),
        new InfoPack("NumeVecePerd", "Repetición", "N",5),
        new InfoPack("DebeInscPeri", "¿Inscrita?", "S",6),
        new InfoPack("NombEstudian", "Nombres", "S",1),
        new InfoPack("NiveDelaAsig", "Nivel", "N",5),
        new InfoPack("ApelEstudian", "Apellido", "S",1),
        new InfoPack("SeguApelEstu", "Segundo Apellido", "S",1),
        new InfoPack("NumeCredCarg", "Créditos", "N",5),
        new InfoPack("VeceCancAsig", "Cancelada", "N",5),
        new InfoPack("TipoIngrEstu", "Tipo Ingreso", "S",6),
        new InfoPack("EstaCancMate", "Está Cancelada?", "S",6),
        new InfoPack("EstaAsigCarg", "¿En Carga?", "S",6),
        new InfoPack("Descripcion", "Descripcion", "S",1),
        new InfoPack("DescGrupAsig", "DescGrupAsig", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CRGACarga_AcademDto newDto = (CRGACarga_AcademDto) dto;
    if (getDeepLevel() != 0) {
      DEF_AsignaEstudiDao fkeyAsigEstuDao = new DEF_AsignaEstudiDao(); 
      newDto.setFkeyAsigEstuDto((DEF_AsignaEstudiDto)fkeyAsigEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyAsigEstu")), getDeepLevel()-1));
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
    }
    return newDto;
  }
}

