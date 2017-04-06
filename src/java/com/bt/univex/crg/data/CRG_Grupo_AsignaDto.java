package com.bt.univex.crg.data;

import com.bt.univex.def.data.DEFVPeriPlanProgDto;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;

public class CRG_Grupo_AsignaDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});
  public static final List RANG_TipoGrupAsig = Arrays.asList( new Range[] { 
      new Range("N","Grupo Regular"),
      new Range("R","Grupo para Repitentes"),
      new Range("T","Grupo para Tutoriales")});


  private Integer pkeyGrupAsig;
  private Integer fkeyPeriPlan;
  private Integer fkeyDocentes;
  private Integer fkeyGrupAsigEqui;
  private Integer fkeyAsigEstu;
  private Integer fkeyGrupNive;
  private String esunGrupComp;
  private Integer cupoMaxiGrup;
  private Integer cupoMiniGrup;
  private String tipoGrupAsig;
  private Integer horaAsigVist;
  private Integer horaTotaAsig;
  private Integer intensHorari;
  private Integer horaAsigRest;

  private DEFVPeriPlanProgDto fkeyPeriPlanDto;
//  private DEF_AsignaEstudiDto fkeyAsigEstuDto;
//  private CRG_DocentUniverDto fkeyDocentesDto;
//  private CRG_Grupo_Nivel_Dto fkeyGrupNiveDto;

  public CRG_Grupo_AsignaDto() { 
     PkeyEnti = 8003;
     setAliasName("GrupAsignatu"); 
  } 

//-------------------------------------------| PkeyGrupAsig
  public Integer getPkeyGrupAsig(){ return pkeyGrupAsig; } 
  public Integer getPkeyGrupAsigNn(){ return setNotNull(pkeyGrupAsig); } 
  public String getPkeyGrupAsigDesc(){ return setDesc(pkeyGrupAsig); } 
  public void setPkeyGrupAsig(Integer value){ this.pkeyGrupAsig=value;} 
  @Override
  public int toInt(){ return getPkeyGrupAsigNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyGrupAsig; }; 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
//-------------------------------------------| FkeyDocentes
  public Integer getFkeyDocentes(){ return fkeyDocentes; } 
  public Integer getFkeyDocentesNn(){ return setNotNull(fkeyDocentes); } 
  public String getFkeyDocentesDesc(){ return setDesc(fkeyDocentes); } 
  public void setFkeyDocentes(Integer value){ this.fkeyDocentes=value;} 
//-------------------------------------------| FkeyGrupAsigEqui
  public Integer getFkeyGrupAsigEqui(){ return fkeyGrupAsigEqui; } 
  public Integer getFkeyGrupAsigEquiNn(){ return setNotNull(fkeyGrupAsigEqui); } 
  public String getFkeyGrupAsigEquiDesc(){ return setDesc(fkeyGrupAsigEqui); } 
  public void setFkeyGrupAsigEqui(Integer value){ this.fkeyGrupAsigEqui=value;} 
//-------------------------------------------| FkeyAsigEstu
  public Integer getFkeyAsigEstu(){ return fkeyAsigEstu; } 
  public Integer getFkeyAsigEstuNn(){ return setNotNull(fkeyAsigEstu); } 
  public String getFkeyAsigEstuDesc(){ return setDesc(fkeyAsigEstu); } 
  public void setFkeyAsigEstu(Integer value){ this.fkeyAsigEstu=value;} 
//-------------------------------------------| FkeyGrupNive
  public Integer getFkeyGrupNive(){ return fkeyGrupNive; } 
  public Integer getFkeyGrupNiveNn(){ return setNotNull(fkeyGrupNive); } 
  public String getFkeyGrupNiveDesc(){ return setDesc(fkeyGrupNive); } 
  public void setFkeyGrupNive(Integer value){ this.fkeyGrupNive=value;} 
//-------------------------------------------| EsunGrupComp
  public String getEsunGrupComp(){ return esunGrupComp; } 
  public String getEsunGrupCompNn(){ return setNotNull(esunGrupComp); } 
  public void setEsunGrupComp(String value){ this.esunGrupComp=value;} 
  public boolean getEsunGrupCompBool() { return esunGrupComp==null?false:esunGrupComp.equals("S");}
  public void setEsunGrupCompBool(boolean esunGrupComp) { this.esunGrupComp=esunGrupComp?"S":"N";}
//-------------------------------------------| CupoMaxiGrup
  public Integer getCupoMaxiGrup(){ return cupoMaxiGrup; } 
  public Integer getCupoMaxiGrupNn(){ return setNotNull(cupoMaxiGrup); } 
  public String getCupoMaxiGrupDesc(){ return setDesc(cupoMaxiGrup); } 
  public void setCupoMaxiGrup(Integer value){ this.cupoMaxiGrup=value;} 
//-------------------------------------------| CupoMiniGrup
  public Integer getCupoMiniGrup(){ return cupoMiniGrup; } 
  public Integer getCupoMiniGrupNn(){ return setNotNull(cupoMiniGrup); } 
  public String getCupoMiniGrupDesc(){ return setDesc(cupoMiniGrup); } 
  public void setCupoMiniGrup(Integer value){ this.cupoMiniGrup=value;} 
//-------------------------------------------| TipoGrupAsig
  public String getTipoGrupAsig(){ return tipoGrupAsig; } 
  public String getTipoGrupAsigNn(){ return setNotNull(tipoGrupAsig); } 
  public void setTipoGrupAsig(String value){ this.tipoGrupAsig=value;} 
//-------------------------------------------| HoraAsigVist
  public Integer getHoraAsigVist(){ return horaAsigVist; } 
  public Integer getHoraAsigVistNn(){ return setNotNull(horaAsigVist); } 
  public String getHoraAsigVistDesc(){ return setDesc(horaAsigVist); } 
  public void setHoraAsigVist(Integer value){ this.horaAsigVist=value;} 
//-------------------------------------------| HoraTotaAsig
  public Integer getHoraTotaAsig(){ return horaTotaAsig; } 
  public Integer getHoraTotaAsigNn(){ return setNotNull(horaTotaAsig); } 
  public String getHoraTotaAsigDesc(){ return setDesc(horaTotaAsig); } 
  public void setHoraTotaAsig(Integer value){ this.horaTotaAsig=value;} 
//-------------------------------------------| IntensHorari
  public Integer getIntensHorari(){ return intensHorari; } 
  public Integer getIntensHorariNn(){ return setNotNull(intensHorari); } 
  public String getIntensHorariDesc(){ return setDesc(intensHorari); } 
  public void setIntensHorari(Integer value){ this.intensHorari=value;} 
//-------------------------------------------| HoraAsigRest
  public Integer getHoraAsigRest(){ return horaAsigRest; } 
  public Integer getHoraAsigRestNn(){ return setNotNull(horaAsigRest); } 
  public String getHoraAsigRestDesc(){ return setDesc(horaAsigRest); } 
  public void setHoraAsigRest(Integer value){ this.horaAsigRest=value;} 
// ---------------(RANGOS) 
  public String getEsunGrupCompDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEsunGrupCompNn()); } 
  public String getTipoGrupAsigDesc() { return DtoMisc.getRangeDesc(RANG_TipoGrupAsig,getTipoGrupAsigNn()); } 

//---------------------(REL: FkeyPeriPlanDto) 
  public DEFVPeriPlanProgDto getFkeyPeriPlanDto() { return fkeyPeriPlanDto; } 
  public void setFkeyPeriPlanDto(DEFVPeriPlanProgDto fkeyPeriPlanDto) {
    if ( fkeyPeriPlanDto != null ) { 
      this.fkeyPeriPlan = fkeyPeriPlanDto.getPkeyPeriPlan(); 
    }
    this.fkeyPeriPlanDto = fkeyPeriPlanDto;
  } 
//---------------------(REL: FkeyAsigEstuDto) 
//  public DEF_AsignaEstudiDto getFkeyAsigEstuDto() { return fkeyAsigEstuDto; } 
//  public void setFkeyAsigEstuDto(DEF_AsignaEstudiDto fkeyAsigEstuDto) {
//    if ( fkeyAsigEstuDto != null ) { 
//      this.fkeyAsigEstu = fkeyAsigEstuDto.getPkeyAsigEstu(); 
//    }
//    this.fkeyAsigEstuDto = fkeyAsigEstuDto;
//  } 
////---------------------(REL: FkeyDocentesDto) 
//  public CRG_DocentUniverDto getFkeyDocentesDto() { return fkeyDocentesDto; } 
//  public void setFkeyDocentesDto(CRG_DocentUniverDto fkeyDocentesDto) {
//    if ( fkeyDocentesDto != null ) { 
//      this.fkeyDocentes = fkeyDocentesDto.getPkeyProfesor(); 
//    }
//    this.fkeyDocentesDto = fkeyDocentesDto;
//  } 
////---------------------(REL: FkeyGrupNiveDto) 
//  public CRG_Grupo_Nivel_Dto getFkeyGrupNiveDto() { return fkeyGrupNiveDto; } 
//  public void setFkeyGrupNiveDto(CRG_Grupo_Nivel_Dto fkeyGrupNiveDto) {
//    if ( fkeyGrupNiveDto != null ) { 
//      this.fkeyGrupNive = fkeyGrupNiveDto.getFkeyBloqTiem(); 
//    }
//    this.fkeyGrupNiveDto = fkeyGrupNiveDto;
//  } 


  @Override 
  public CRG_Grupo_AsignaDto copy(){
    CRG_Grupo_AsignaDto result = new CRG_Grupo_AsignaDto();
    result.setPkeyGrupAsig( this.getPkeyGrupAsig()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setFkeyDocentes( this.getFkeyDocentes()); 
    result.setFkeyGrupAsigEqui( this.getFkeyGrupAsigEqui()); 
    result.setFkeyAsigEstu( this.getFkeyAsigEstu()); 
    result.setFkeyGrupNive( this.getFkeyGrupNive()); 
    result.setEsunGrupComp( this.getEsunGrupComp()); 
    result.setCupoMaxiGrup( this.getCupoMaxiGrup()); 
    result.setCupoMiniGrup( this.getCupoMiniGrup()); 
    result.setTipoGrupAsig( this.getTipoGrupAsig()); 
    result.setHoraAsigVist( this.getHoraAsigVist()); 
    result.setHoraTotaAsig( this.getHoraTotaAsig()); 
    result.setIntensHorari( this.getIntensHorari()); 
    result.setHoraAsigRest( this.getHoraAsigRest()); 
    result.setFkeyPeriPlanDto( this.getFkeyPeriPlanDto());
//    result.setFkeyAsigEstuDto( this.getFkeyAsigEstuDto());
//    result.setFkeyDocentesDto( this.getFkeyDocentesDto());
//    result.setFkeyGrupNiveDto( this.getFkeyGrupNiveDto());
    return result;
  }
}

