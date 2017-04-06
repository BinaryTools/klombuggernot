package com.bt.univex.def.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.* ;

public class DEFVPeriPlanProgDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});
  public static final List RANG_Jorn = Arrays.asList( new Range[] { 
      new Range("A","A Mañana o Tarde o Noche"),
      new Range("C","C Tarde o Noche"),
      new Range("D","Diurna (Mañana y Tarde)"),
      new Range("F","F Tarde o Noche o Fin de Semana"),
      new Range("N","Nocturna"),
      new Range("R","R Mañana o Noche"),
      new Range("S","S Mañana o Tarde"),
      new Range("X","Fin de semana"),
      new Range("Z","Sin jornada especifica")});


  private Integer pkeyPeriPlan;
  private Integer fkeyPlanEstu;
  private Integer fkeyModaEstu;
  private Integer fkeyNiveEstu;
  private Integer annoPeriAcad;
  private Integer fkeyPeriAcad;
  private Integer pkeyPlanEstu;
  private String esunPeriInfi;
  private String nombFacuUniv;
  private Integer fkeyProgAcad;
  private String estaActiPlan;
  private Integer pkeyPeriAcad;
  private String nombPeriAcad;
  private Integer pkeyProgAcad;
  private String estaActiPeri;
  private Integer fkeyFacuUniv;
  private String nombProgAcad;
  private Integer codiProgAcad;
  private Integer codiPlanEstu;
  private Integer duraProgNive;
  private Integer credTotaProg;
  private Integer numePeriAcad;
  private String descPlanEstu;
  private String descripcion;
  private Integer fkeyBloqTiem;
  private String indiActiCarg;
  private String indiActiNota;
  private Integer numeroPromoc;
  private Integer semestreCurs;
  private String progJornada_;
  private String codiCentCost;

  private ADS_PrograAcademDto fkeyProgAcadDto;
  private ADS_PeriodAcademDto pkeyPeriAcadDto;

  public DEFVPeriPlanProgDto() { 
     PkeyEnti = 13003;
     setAliasName("PeriPlan"); 
  } 

//-------------------------------------------| PkeyPeriPlan
  public Integer getPkeyPeriPlan(){ return pkeyPeriPlan; } 
  public Integer getPkeyPeriPlanNn(){ return setNotNull(pkeyPeriPlan); } 
  public String getPkeyPeriPlanDesc(){ return setDesc(pkeyPeriPlan); } 
  public void setPkeyPeriPlan(Integer value){ this.pkeyPeriPlan=value;} 
  @Override
  public int toInt(){ return getPkeyPeriPlanNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPeriPlan; }; 
//-------------------------------------------| FkeyPlanEstu
  public Integer getFkeyPlanEstu(){ return fkeyPlanEstu; } 
  public Integer getFkeyPlanEstuNn(){ return setNotNull(fkeyPlanEstu); } 
  public String getFkeyPlanEstuDesc(){ return setDesc(fkeyPlanEstu); } 
  public void setFkeyPlanEstu(Integer value){ this.fkeyPlanEstu=value;} 
//-------------------------------------------| FkeyModaEstu
  public Integer getFkeyModaEstu(){ return fkeyModaEstu; } 
  public Integer getFkeyModaEstuNn(){ return setNotNull(fkeyModaEstu); } 
  public String getFkeyModaEstuDesc(){ return setDesc(fkeyModaEstu); } 
  public void setFkeyModaEstu(Integer value){ this.fkeyModaEstu=value;} 
//-------------------------------------------| FkeyNiveEstu
  public Integer getFkeyNiveEstu(){ return fkeyNiveEstu; } 
  public Integer getFkeyNiveEstuNn(){ return setNotNull(fkeyNiveEstu); } 
  public String getFkeyNiveEstuDesc(){ return setDesc(fkeyNiveEstu); } 
  public void setFkeyNiveEstu(Integer value){ this.fkeyNiveEstu=value;} 
//-------------------------------------------| AnnoPeriAcad
  public Integer getAnnoPeriAcad(){ return annoPeriAcad; } 
  public Integer getAnnoPeriAcadNn(){ return setNotNull(annoPeriAcad); } 
  public String getAnnoPeriAcadDesc(){ return setDesc(annoPeriAcad); } 
  public void setAnnoPeriAcad(Integer value){ this.annoPeriAcad=value;} 
//-------------------------------------------| FkeyPeriAcad
  public Integer getFkeyPeriAcad(){ return fkeyPeriAcad; } 
  public Integer getFkeyPeriAcadNn(){ return setNotNull(fkeyPeriAcad); } 
  public String getFkeyPeriAcadDesc(){ return setDesc(fkeyPeriAcad); } 
  public void setFkeyPeriAcad(Integer value){ this.fkeyPeriAcad=value;} 
//-------------------------------------------| PkeyPlanEstu
  public Integer getPkeyPlanEstu(){ return pkeyPlanEstu; } 
  public Integer getPkeyPlanEstuNn(){ return setNotNull(pkeyPlanEstu); } 
  public String getPkeyPlanEstuDesc(){ return setDesc(pkeyPlanEstu); } 
  public void setPkeyPlanEstu(Integer value){ this.pkeyPlanEstu=value;} 
//-------------------------------------------| EsunPeriInfi
  public String getEsunPeriInfi(){ return esunPeriInfi; } 
  public String getEsunPeriInfiNn(){ return setNotNull(esunPeriInfi); } 
  public void setEsunPeriInfi(String value){ this.esunPeriInfi=value;} 
  public boolean getEsunPeriInfiBool() { return esunPeriInfi==null?false:esunPeriInfi.equals("S");}
  public void setEsunPeriInfiBool(boolean esunPeriInfi) { this.esunPeriInfi=esunPeriInfi?"S":"N";}
//-------------------------------------------| NombFacuUniv
  public String getNombFacuUniv(){ return nombFacuUniv; } 
  public String getNombFacuUnivNn(){ return setNotNull(nombFacuUniv); } 
  public String getNombFacuUnivDesc(){ return setDesc(nombFacuUniv); } 
  public void setNombFacuUniv(String value){ this.nombFacuUniv=value;} 
//-------------------------------------------| FkeyProgAcad
  public Integer getFkeyProgAcad(){ return fkeyProgAcad; } 
  public Integer getFkeyProgAcadNn(){ return setNotNull(fkeyProgAcad); } 
  public String getFkeyProgAcadDesc(){ return setDesc(fkeyProgAcad); } 
  public void setFkeyProgAcad(Integer value){ this.fkeyProgAcad=value;} 
//-------------------------------------------| EstaActiPlan
  public String getEstaActiPlan(){ return estaActiPlan; } 
  public String getEstaActiPlanNn(){ return setNotNull(estaActiPlan); } 
  public String getEstaActiPlanDesc(){ return setDesc(estaActiPlan); } 
  public void setEstaActiPlan(String value){ this.estaActiPlan=value;} 
  public boolean getEstaActiPlanBool() { return estaActiPlan==null?false:estaActiPlan.equals("S");}
  public void setEstaActiPlanBool(boolean estaActiPlan) { this.estaActiPlan=estaActiPlan?"S":"N";}
//-------------------------------------------| PkeyPeriAcad
  public Integer getPkeyPeriAcad(){ return pkeyPeriAcad; } 
  public Integer getPkeyPeriAcadNn(){ return setNotNull(pkeyPeriAcad); } 
  public String getPkeyPeriAcadDesc(){ return setDesc(pkeyPeriAcad); } 
  public void setPkeyPeriAcad(Integer value){ this.pkeyPeriAcad=value;} 
//-------------------------------------------| NombPeriAcad
  public String getNombPeriAcad(){ return nombPeriAcad; } 
  public String getNombPeriAcadNn(){ return setNotNull(nombPeriAcad); } 
  public String getNombPeriAcadDesc(){ return setDesc(nombPeriAcad); } 
  public void setNombPeriAcad(String value){ this.nombPeriAcad=value;} 
//-------------------------------------------| PkeyProgAcad
  public Integer getPkeyProgAcad(){ return pkeyProgAcad; } 
  public Integer getPkeyProgAcadNn(){ return setNotNull(pkeyProgAcad); } 
  public String getPkeyProgAcadDesc(){ return setDesc(pkeyProgAcad); } 
  public void setPkeyProgAcad(Integer value){ this.pkeyProgAcad=value;} 
//-------------------------------------------| EstaActiPeri
  public String getEstaActiPeri(){ return estaActiPeri; } 
  public String getEstaActiPeriNn(){ return setNotNull(estaActiPeri); } 
  public void setEstaActiPeri(String value){ this.estaActiPeri=value;} 
  public boolean getEstaActiPeriBool() { return estaActiPeri==null?false:estaActiPeri.equals("S");}
  public void setEstaActiPeriBool(boolean estaActiPeri) { this.estaActiPeri=estaActiPeri?"S":"N";}
//-------------------------------------------| FkeyFacuUniv
  public Integer getFkeyFacuUniv(){ return fkeyFacuUniv; } 
  public Integer getFkeyFacuUnivNn(){ return setNotNull(fkeyFacuUniv); } 
  public String getFkeyFacuUnivDesc(){ return setDesc(fkeyFacuUniv); } 
  public void setFkeyFacuUniv(Integer value){ this.fkeyFacuUniv=value;} 
//-------------------------------------------| NombProgAcad
  public String getNombProgAcad(){ return nombProgAcad; } 
  public String getNombProgAcadNn(){ return setNotNull(nombProgAcad); } 
  public String getNombProgAcadDesc(){ return setDesc(nombProgAcad); } 
  public void setNombProgAcad(String value){ this.nombProgAcad=value;} 
//-------------------------------------------| CodiProgAcad
  public Integer getCodiProgAcad(){ return codiProgAcad; } 
  public Integer getCodiProgAcadNn(){ return setNotNull(codiProgAcad); } 
  public String getCodiProgAcadDesc(){ return setDesc(codiProgAcad); } 
  public void setCodiProgAcad(Integer value){ this.codiProgAcad=value;} 
//-------------------------------------------| CodiPlanEstu
  public Integer getCodiPlanEstu(){ return codiPlanEstu; } 
  public Integer getCodiPlanEstuNn(){ return setNotNull(codiPlanEstu); } 
  public String getCodiPlanEstuDesc(){ return setDesc(codiPlanEstu); } 
  public void setCodiPlanEstu(Integer value){ this.codiPlanEstu=value;} 
//-------------------------------------------| DuraProgNive
  public Integer getDuraProgNive(){ return duraProgNive; } 
  public Integer getDuraProgNiveNn(){ return setNotNull(duraProgNive); } 
  public String getDuraProgNiveDesc(){ return setDesc(duraProgNive); } 
  public void setDuraProgNive(Integer value){ this.duraProgNive=value;} 
//-------------------------------------------| CredTotaProg
  public Integer getCredTotaProg(){ return credTotaProg; } 
  public Integer getCredTotaProgNn(){ return setNotNull(credTotaProg); } 
  public String getCredTotaProgDesc(){ return setDesc(credTotaProg); } 
  public void setCredTotaProg(Integer value){ this.credTotaProg=value;} 
//-------------------------------------------| NumePeriAcad
  public Integer getNumePeriAcad(){ return numePeriAcad; } 
  public Integer getNumePeriAcadNn(){ return setNotNull(numePeriAcad); } 
  public String getNumePeriAcadDesc(){ return setDesc(numePeriAcad); } 
  public void setNumePeriAcad(Integer value){ this.numePeriAcad=value;} 
//-------------------------------------------| DescPlanEstu
  public String getDescPlanEstu(){ return descPlanEstu; } 
  public String getDescPlanEstuNn(){ return setNotNull(descPlanEstu); } 
  public String getDescPlanEstuDesc(){ return setDesc(descPlanEstu); } 
  public void setDescPlanEstu(String value){ this.descPlanEstu=value;} 
//-------------------------------------------| Descripcion
  public String getDescripcion(){ return descripcion; } 
  public String getDescripcionNn(){ return setNotNull(descripcion); } 
  public String getDescripcionDesc(){ return setDesc(descripcion); } 
  public void setDescripcion(String value){ this.descripcion=value;} 
  @Override
  public String toString(){ return getDescripcionNn(); }; 
//-------------------------------------------| FkeyBloqTiem
  public Integer getFkeyBloqTiem(){ return fkeyBloqTiem; } 
  public Integer getFkeyBloqTiemNn(){ return setNotNull(fkeyBloqTiem); } 
  public String getFkeyBloqTiemDesc(){ return setDesc(fkeyBloqTiem); } 
  public void setFkeyBloqTiem(Integer value){ this.fkeyBloqTiem=value;} 
//-------------------------------------------| IndiActiCarg
  public String getIndiActiCarg(){ return indiActiCarg; } 
  public String getIndiActiCargNn(){ return setNotNull(indiActiCarg); } 
  public String getIndiActiCargDesc(){ return setDesc(indiActiCarg); } 
  public void setIndiActiCarg(String value){ this.indiActiCarg=value;} 
  public boolean getIndiActiCargBool() { return indiActiCarg==null?false:indiActiCarg.equals("S");}
  public void setIndiActiCargBool(boolean indiActiCarg) { this.indiActiCarg=indiActiCarg?"S":"N";}
//-------------------------------------------| IndiActiNota
  public String getIndiActiNota(){ return indiActiNota; } 
  public String getIndiActiNotaNn(){ return setNotNull(indiActiNota); } 
  public String getIndiActiNotaDesc(){ return setDesc(indiActiNota); } 
  public void setIndiActiNota(String value){ this.indiActiNota=value;} 
//-------------------------------------------| NumeroPromoc
  public Integer getNumeroPromoc(){ return numeroPromoc; } 
  public Integer getNumeroPromocNn(){ return setNotNull(numeroPromoc); } 
  public String getNumeroPromocDesc(){ return setDesc(numeroPromoc); } 
  public void setNumeroPromoc(Integer value){ this.numeroPromoc=value;} 
//-------------------------------------------| SemestreCurs
  public Integer getSemestreCurs(){ return semestreCurs; } 
  public Integer getSemestreCursNn(){ return setNotNull(semestreCurs); } 
  public String getSemestreCursDesc(){ return setDesc(semestreCurs); } 
  public void setSemestreCurs(Integer value){ this.semestreCurs=value;} 
//-------------------------------------------| ProgJornada_
  public String getProgJornada_(){ return progJornada_; } 
  public String getProgJornada_Nn(){ return setNotNull(progJornada_); } 
  public void setProgJornada_(String value){ this.progJornada_=value;} 
//-------------------------------------------| CodiCentCost
  public String getCodiCentCost(){ return codiCentCost; } 
  public String getCodiCentCostNn(){ return setNotNull(codiCentCost); } 
  public String getCodiCentCostDesc(){ return setDesc(codiCentCost); } 
  public void setCodiCentCost(String value){ this.codiCentCost=value;} 
// ---------------(RANGOS) 
  public String getEsunPeriInfiDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEsunPeriInfiNn()); } 
  public String getEstaActiPeriDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaActiPeriNn()); } 
  public String getProgJornada_Desc() { return DtoMisc.getRangeDesc(RANG_Jorn,getProgJornada_Nn()); } 

//---------------------(REL: FkeyProgAcadDto) 
  public ADS_PrograAcademDto getFkeyProgAcadDto() { return fkeyProgAcadDto; } 
  public void setFkeyProgAcadDto(ADS_PrograAcademDto fkeyProgAcadDto) {
    if ( fkeyProgAcadDto != null ) { 
      this.fkeyProgAcad = fkeyProgAcadDto.getPkeyProgAcad(); 
    }
    this.fkeyProgAcadDto = fkeyProgAcadDto;
  } 
//---------------------(REL: PkeyPeriAcadDto) 
  public ADS_PeriodAcademDto getPkeyPeriAcadDto() { return pkeyPeriAcadDto; } 
  public void setPkeyPeriAcadDto(ADS_PeriodAcademDto pkeyPeriAcadDto) {
    if ( pkeyPeriAcadDto != null ) { 
      this.pkeyPeriAcad = pkeyPeriAcadDto.getPkeyPeriAcad(); 
    }
    this.pkeyPeriAcadDto = pkeyPeriAcadDto;
  } 


  @Override 
  public DEFVPeriPlanProgDto copy(){
    DEFVPeriPlanProgDto result = new DEFVPeriPlanProgDto();
    result.setPkeyPeriPlan( this.getPkeyPeriPlan()); 
    result.setFkeyPlanEstu( this.getFkeyPlanEstu()); 
    result.setFkeyModaEstu( this.getFkeyModaEstu()); 
    result.setFkeyNiveEstu( this.getFkeyNiveEstu()); 
    result.setAnnoPeriAcad( this.getAnnoPeriAcad()); 
    result.setFkeyPeriAcad( this.getFkeyPeriAcad()); 
    result.setPkeyPlanEstu( this.getPkeyPlanEstu()); 
    result.setEsunPeriInfi( this.getEsunPeriInfi()); 
    result.setNombFacuUniv( this.getNombFacuUniv()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setEstaActiPlan( this.getEstaActiPlan()); 
    result.setPkeyPeriAcad( this.getPkeyPeriAcad()); 
    result.setNombPeriAcad( this.getNombPeriAcad()); 
    result.setPkeyProgAcad( this.getPkeyProgAcad()); 
    result.setEstaActiPeri( this.getEstaActiPeri()); 
    result.setFkeyFacuUniv( this.getFkeyFacuUniv()); 
    result.setNombProgAcad( this.getNombProgAcad()); 
    result.setCodiProgAcad( this.getCodiProgAcad()); 
    result.setCodiPlanEstu( this.getCodiPlanEstu()); 
    result.setDuraProgNive( this.getDuraProgNive()); 
    result.setCredTotaProg( this.getCredTotaProg()); 
    result.setNumePeriAcad( this.getNumePeriAcad()); 
    result.setDescPlanEstu( this.getDescPlanEstu()); 
    result.setDescripcion( this.getDescripcion()); 
    result.setFkeyBloqTiem( this.getFkeyBloqTiem()); 
    result.setIndiActiCarg( this.getIndiActiCarg()); 
    result.setIndiActiNota( this.getIndiActiNota()); 
    result.setNumeroPromoc( this.getNumeroPromoc()); 
    result.setSemestreCurs( this.getSemestreCurs()); 
    result.setProgJornada_( this.getProgJornada_()); 
    result.setCodiCentCost( this.getCodiCentCost()); 
    result.setFkeyProgAcadDto( this.getFkeyProgAcadDto());
    result.setPkeyPeriAcadDto( this.getPkeyPeriAcadDto());
    return result;
  }
}

