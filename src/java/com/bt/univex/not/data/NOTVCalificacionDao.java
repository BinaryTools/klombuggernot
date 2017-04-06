package com.bt.univex.not.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.not.data.*;
import com.bt.univex.ads.data.* ;
import com.bt.univex.crg.data.* ;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class NOTVCalificacionDao extends BaseDao {

    private void initializeDao() { 
        TableName = "NOTVCalificacion";
        PkeyName = "PkeyCalifica";
        DescName = "NombMomento_";
        CodeName = "null";
        AliasName = "Califica";
        deepLevel = 2;
        setXPracPkeyEnti(26803);
        loadInfoEntity();
    }

    public NOTVCalificacionDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public NOTVCalificacionDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static NOTVCalificacionDto getDefaultDto()  {
     NOTVCalificacionDto dto = new NOTVCalificacionDto(); 
     dto.setPkeyCalifica(0);
     dto.setNiveDentPlan( new Integer(1));
     dto.setEstaActiEstu("S");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new NOTVCalificacionDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyCalifica", "PkeyCalifica", "N",2),
        new InfoPack("NombMomento_", "Momento", "S",1),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("FkeyDiviMome", "FkeyDiviMome", "N",3),
        new InfoPack("FkeyClasCali", "FkeyClasCali", "N",3),
        new InfoPack("NotaNumerica", "Nota", "F",12),
        new InfoPack("CodiAsigEstu", "Código", "S",1),
        new InfoPack("FkeyNotaRang", "FkeyNotaRang", "N",3),
        new InfoPack("NotaValoRang", "NotaValoRang", "S",1),
        new InfoPack("NombAsigEstu", "Asignatura", "S",1),
        new InfoPack("EstaAproCali", "¿Aprobada?", "S",6),
        new InfoPack("NombGrupNive", "Identificación del Grupo", "S",1),
        new InfoPack("Fue_PresCali", "¿Presentada?", "S",6),
        new InfoPack("NiveDentPlan", "Nivel", "N",5),
        new InfoPack("Fue_Revisada", "¿Revisada?", "S",6),
        new InfoPack("FechModiCali", "Modificada", "D",7),
        new InfoPack("CodiEstudian", "Código", "S",1),
        new InfoPack("EstaActiEstu", "¿Está activo?", "S",6),
        new InfoPack("NombEstudian", "Nombres", "S",1),
        new InfoPack("ApelEstudian", "Apellido", "S",1),
        new InfoPack("SeguApelEstu", "Segundo Apellido", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    NOTVCalificacionDto newDto = (NOTVCalificacionDto) dto;
    if (getDeepLevel() != 0) {
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
      CRG_Grupo_AsignaDao fkeyGrupAsigDao = new CRG_Grupo_AsignaDao(); 
      newDto.setFkeyGrupAsigDto((CRG_Grupo_AsignaDto)fkeyGrupAsigDao.findDtoByPkey(new Integer(rs.getInt("fkeyGrupAsig")), getDeepLevel()-1));
      ADS_DivisiMomentDao fkeyDiviMomeDao = new ADS_DivisiMomentDao(); 
      newDto.setFkeyDiviMomeDto((ADS_DivisiMomentDto)fkeyDiviMomeDao.findDtoByPkey(new Integer(rs.getInt("fkeyDiviMome")), getDeepLevel()-1));
    }
    return newDto;
  }
}

