package com.bt.univex.crg.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.xpc.binarytool.univex.connect.Connect;

public class CRG_Grupo_AsignaDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CRG_Grupo_Asigna";
        PkeyName = "PkeyGrupAsig";
        DescName = "null";
        CodeName = "null";
        AliasName = "GrupAsignatu";
        deepLevel = 2;
        setXPracPkeyEnti(8003);
        loadInfoEntity();
    }

    public CRG_Grupo_AsignaDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CRG_Grupo_AsignaDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CRG_Grupo_AsignaDto getDefaultDto()  {
     CRG_Grupo_AsignaDto dto = new CRG_Grupo_AsignaDto(); 
     dto.setPkeyGrupAsig(0);
     dto.setEsunGrupComp("N");
     dto.setCupoMaxiGrup( new Integer(10));
     dto.setCupoMiniGrup( new Integer(25));
     dto.setTipoGrupAsig("N");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CRG_Grupo_AsignaDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyGrupAsig", "PkeyGrupAsig", "N",2),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("FkeyDocentes", "FkeyDocentes", "N",3),
        new InfoPack("FkeyGrupAsigEqui", "FkeyGrupAsigEqui", "N",3),
        new InfoPack("FkeyAsigEstu", "FkeyAsigEstu", "N",3),
        new InfoPack("FkeyGrupNive", "FkeyGrupNive", "N",3),
        new InfoPack("EsunGrupComp", "¿Es un Horario para Compartir?", "S",6),
        new InfoPack("CupoMaxiGrup", "Cupo Máximo", "N",5),
        new InfoPack("CupoMiniGrup", "Cupo Mínimo", "N",5),
        new InfoPack("TipoGrupAsig", "TipoGrupAsig", "S",6),
        new InfoPack("HoraAsigVist", "Horas vistas", "N",5),
        new InfoPack("HoraTotaAsig", "Horas totales de la materia", "N",5),
        new InfoPack("IntensHorari", "IntensHorari", "N",5),
        new InfoPack("HoraAsigRest", "HoraAsigRest", "N",5)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CRG_Grupo_AsignaDto newDto = (CRG_Grupo_AsignaDto) dto;
    if (getDeepLevel() != 0) {
//      DEFVPeriPlanProgDao fkeyPeriPlanDao = new DEFVPeriPlanProgDao(); 
//      newDto.setFkeyPeriPlanDto((DEFVPeriPlanProgDto)fkeyPeriPlanDao.findDtoByPkey(new Integer(rs.getInt("fkeyPeriPlan")), getDeepLevel()-1));
//      DEF_AsignaEstudiDao fkeyAsigEstuDao = new DEF_AsignaEstudiDao(); 
//      newDto.setFkeyAsigEstuDto((DEF_AsignaEstudiDto)fkeyAsigEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyAsigEstu")), getDeepLevel()-1));
//      CRG_DocentUniverDao fkeyDocentesDao = new CRG_DocentUniverDao(); 
//      newDto.setFkeyDocentesDto((CRG_DocentUniverDto)fkeyDocentesDao.findDtoByPkey(new Integer(rs.getInt("fkeyDocentes")), getDeepLevel()-1));
//      CRG_Grupo_Nivel_Dao fkeyGrupNiveDao = new CRG_Grupo_Nivel_Dao(); 
//      newDto.setFkeyGrupNiveDto((CRG_Grupo_Nivel_Dto)fkeyGrupNiveDao.findDtoByPkey(new Integer(rs.getInt("fkeyGrupNive")), getDeepLevel()-1));
    }
    return newDto;
  }
}

