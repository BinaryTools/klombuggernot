package com.bt.univex.crg.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.bt.univex.def.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CRGVGrupo_AsignaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CRGVGrupo_Asigna";
        PkeyName = "PkeyGrupAsig";
        DescName = "Descripcion";
        CodeName = "CodiAsigEstu";
        AliasName = "GrupAsig";
        deepLevel = 2;
        setXPracPkeyEnti(18903);
        loadInfoEntity();
    }

    public CRGVGrupo_AsignaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CRGVGrupo_AsignaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CRGVGrupo_AsignaDto getDefaultDto()  {
     CRGVGrupo_AsignaDto dto = new CRGVGrupo_AsignaDto(); 
     dto.setPkeyGrupAsig(0);
     dto.setOrdeGrupNive( new Integer(2));
     dto.setEsunGrupComp("N");
     dto.setTipoGrupNive("N");
     dto.setCupoMaxiGrup( new Integer(10));
     dto.setCupoMiniGrup( new Integer(25));
     dto.setNiveDentPlan( new Integer(1));
     dto.setTipoGrupAsig("N");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CRGVGrupo_AsignaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyGrupAsig", "PkeyGrupAsig", "N",2),
        new InfoPack("FkeyAsigEstu", "FkeyAsigEstu", "N",3),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("FkeyDocentes", "FkeyDocentes", "N",3),
        new InfoPack("OrdeGrupNive", "Orden del Grupo", "N",5),
        new InfoPack("FkeyGrupAsigEqui", "FkeyGrupAsigEqui", "N",3),
        new InfoPack("FkeyGrupNive", "FkeyGrupNive", "N",3),
        new InfoPack("Descripcion", "Descripción", "S",1),
        new InfoPack("CodiAsigEstu", "Código de la Asignatura", "S",1),
        new InfoPack("EsunGrupComp", "¿Es un Horario para Compartir?", "S",6),
        new InfoPack("TipoGrupNive", "Tipo Grupo", "S",6),
        new InfoPack("NombAsigEstu", "Asignatura", "S",1),
        new InfoPack("CupoMaxiGrup", "Cupo Máximo", "N",5),
        new InfoPack("NombGrupNive", "Identificación del Grupo", "S",1),
        new InfoPack("CupoMiniGrup", "Cupo Mínimo", "N",5),
        new InfoPack("NiveDentPlan", "Nivel", "N",5),
        new InfoPack("TipoGrupAsig", "TipoGrupAsig", "S",6),
        new InfoPack("HoraAsigVist", "Horas vistas", "N",5),
        new InfoPack("HoraTotaAsig", "Horas totales de la asignatura", "N",5)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CRGVGrupo_AsignaDto newDto = (CRGVGrupo_AsignaDto) dto;
    if (getDeepLevel() != 0) {
//      CRG_Grupo_Nivel_Dao fkeyGrupNiveDao = new CRG_Grupo_Nivel_Dao(); 
//      newDto.setFkeyGrupNiveDto((CRG_Grupo_Nivel_Dto)fkeyGrupNiveDao.findDtoByPkey(new Integer(rs.getInt("fkeyGrupNive")), getDeepLevel()-1));
      DEFVPeriPlanProgDao fkeyPeriPlanDao = new DEFVPeriPlanProgDao(); 
      newDto.setFkeyPeriPlanDto((DEFVPeriPlanProgDto)fkeyPeriPlanDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriPlan")), getDeepLevel()-1));
    }
    return newDto;
  }
}

