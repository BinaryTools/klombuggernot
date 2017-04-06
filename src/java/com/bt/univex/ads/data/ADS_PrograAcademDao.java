package com.bt.univex.ads.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.xpc.binarytool.univex.connect.Connect;

public class ADS_PrograAcademDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_PrograAcadem";
        PkeyName = "PkeyProgAcad";
        DescName = "NombProgAcad";
        CodeName = "CodiProgAcad";
        AliasName = "ProgAcad";
        deepLevel = 2;
        setXPracPkeyEnti(5503);
        loadInfoEntity();
    }

    public ADS_PrograAcademDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_PrograAcademDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_PrograAcademDto getDefaultDto()  {
     ADS_PrograAcademDto dto = new ADS_PrograAcademDto(); 
     dto.setPkeyProgAcad(0);
     dto.setDuraProgNive( new Integer(10));
     dto.setCredTotaProg( new Integer(0));
     dto.setTipoCompProg("P");
     dto.setEstaActiProg("S");
     dto.setProgJornada_("D");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_PrograAcademDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyProgAcad", "PkeyProgAcad", "N",2),
        new InfoPack("FkeyModaEstu", "FkeyModaEstu", "N",3),
        new InfoPack("FkeyNiveEstu", "FkeyNiveEstu", "N",3),
        new InfoPack("FkeyFacuUniv", "FkeyFacuUniv", "N",3),
        new InfoPack("CodiProgAcad", "Código del Programa", "N",5),
        new InfoPack("NombProgAcad", "Nombre del Programa", "S",1),
        new InfoPack("AbreProgAcad", "Abreviatura del programa", "S",1),
        new InfoPack("CodiAproIcfe", "Número de Registro Icfes", "S",1),
        new InfoPack("ResoAproIcfe", "Resolución de Aprobación Icfes", "S",1),
        new InfoPack("DuraProgNive", "Duración del Programa (niveles)", "N",5),
        new InfoPack("CredTotaProg", "Créditos Totales", "N",5),
        new InfoPack("CodiAbreProg", "Código Abreviado del Programa", "S",1),
        new InfoPack("TituOtorProg", "Título que Otorga el Programa", "S",1),
        new InfoPack("FechAcueProg", "Fecha del Acuerdo", "D",7),
        new InfoPack("NumeAcueProg", "Número del Acuerdo", "N",5),
        new InfoPack("TipoCompProg", "Tipo de Comportamiento", "S",6),
        new InfoPack("EstaActiProg", "¿Está Activo?", "S",6),
        new InfoPack("ProgJornada_", "ProgJornada_", "S",6),
        new InfoPack("ConsCodiProg", "ConsCodiProg", "S",1),
        new InfoPack("FechAproIcfe", "Fecha Aprobacion Icfes", "D",7),
        new InfoPack("ModiAproIcfe", "Modificaciones Aprobaciones Icfes", "S",1),
        new InfoPack("EstaAcreProg", "Esta Acreditado el Programa", "S",6),
        new InfoPack("NumeAcreProg", "Numero Acreditacion Programa", "S",1),
        new InfoPack("FechAcreProg", "Fecha Acreditacion Programa", "D",7),
        new InfoPack("DuraAcreProg", "Duracion Acreditacion Programa", "N",5),
        new InfoPack("TienRegiCali", "Tiene Registro Calificado", "S",6),
        new InfoPack("NumeRegiCali", "Numero Registro Calificado", "S",1),
        new InfoPack("FechRegiCali", "Fecha Registro Calificado", "D",7),
        new InfoPack("DuraRegiCali", "Duracion Registro Calificado", "N",5),
        new InfoPack("EstaAcreInte", "Esta Acreditado Internacionalmente", "S",6),
        new InfoPack("DescAcreInte", "Descripcion Acreditacion Internacionalmente", "S",1),
        new InfoPack("EntiAcreInte", "Entidad Acreditacion Internacional", "S",1),
        new InfoPack("Url_Programa", "URL_Programa", "S",1),
        new InfoPack("Url_Aspirant", "URL_Aspitante", "S",1),
        new InfoPack("Url_PerfProf", "URL_PerfProf", "S",1),
        new InfoPack("PeridiProgra", "Periodicidad del Programa", "S",6),
        new InfoPack("TipoCubrProg", "Tipo Cubrimiento Programa", "S",6),
        new InfoPack("TienCiclProp", "Tiene Ciclo Propedeutico", "S",6),
        new InfoPack("FkeyNuclPrim", "FkeyNuclPrim", "N",3),
        new InfoPack("FkeyNuclSecu", "FkeyNuclSecu", "N",3),
        new InfoPack("CodiCentCost", "Código Centro Costo", "S",1),
        new InfoPack("FkeyNiveForm", "FkeyNiveForm", "N",3)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_PrograAcademDto newDto = (ADS_PrograAcademDto) dto;
    if (getDeepLevel() != 0) {
//      DEF_NuclBasiConoDao fkeyNuclPrimDao = new DEF_NuclBasiConoDao(); 
//      newDto.setFkeyNuclPrimDto((DEF_NuclBasiConoDto)fkeyNuclPrimDao.findDtoByPkey(new Integer(rs.getInt("fkeyNuclPrim")), getDeepLevel()-1));
//      DEFVNuclBasiConoDao fkeyNuclSecuDao = new DEFVNuclBasiConoDao(); 
//      newDto.setFkeyNuclSecuDto((DEFVNuclBasiConoDto)fkeyNuclSecuDao.findDtoByPkey(new Integer(rs.getInt("fkeyNuclSecu")), getDeepLevel()-1));
//      ADS_ModaliEstudiDao fkeyModaEstuDao = new ADS_ModaliEstudiDao(); 
//      newDto.setFkeyModaEstuDto((ADS_ModaliEstudiDto)fkeyModaEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyModaEstu")), getDeepLevel()-1));
//      ADS_Nivel_EstudiDao fkeyNiveEstuDao = new ADS_Nivel_EstudiDao(); 
//      newDto.setFkeyNiveEstuDto((ADS_Nivel_EstudiDto)fkeyNiveEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyNiveEstu")), getDeepLevel()-1));
//      ADS_FacultUniverDao fkeyFacuUnivDao = new ADS_FacultUniverDao(); 
//      newDto.setFkeyFacuUnivDto((ADS_FacultUniverDto)fkeyFacuUnivDao.findDtoByPkey(new Integer(rs.getInt("fkeyFacuUniv")), getDeepLevel()-1));
    }
    return newDto;
  }
}

