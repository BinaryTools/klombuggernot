package com.bt.univex.def.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.def.data.*;
import com.bt.univex.ads.data.* ;
import com.bt.univex.def.data.* ;

public class DEF_PeriodPlanesDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});
  public static final List RANG_DiviPeri = Arrays.asList( new Range[] { 
      new Range("D","División"),
      new Range("P","Principal"),
      new Range("U","Unico (No usa divisiones)")});


  private Integer pkeyPeriPlan;
  private Integer fkeyPlanEstu;
  private Integer fkeyPeriAcad;
  private String esunPeriInfi;
  private String tipoDiviPeri;
  private Integer numeDiviPeri;
  private String indiActiNota;
  private String indiActiCarg;
  private Integer fkeyProgAcad;
  private Integer numeroPromoc;
  private Integer semestreCurs;
  private String usa_horafijo;
  private Integer numeTotaSema;
  private Double totaPuntCurs;

  private ADS_PeriodAcademDto fkeyPeriAcadDto;
  private DEF_PlanesEstudiDto fkeyPlanEstuDto;

  public DEF_PeriodPlanesDto() { 
     PkeyEnti = 7003;
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
//-------------------------------------------| FkeyPeriAcad
  public Integer getFkeyPeriAcad(){ return fkeyPeriAcad; } 
  public Integer getFkeyPeriAcadNn(){ return setNotNull(fkeyPeriAcad); } 
  public String getFkeyPeriAcadDesc(){ return setDesc(fkeyPeriAcad); } 
  public void setFkeyPeriAcad(Integer value){ this.fkeyPeriAcad=value;} 
//-------------------------------------------| EsunPeriInfi
  public String getEsunPeriInfi(){ return esunPeriInfi; } 
  public String getEsunPeriInfiNn(){ return setNotNull(esunPeriInfi); } 
  public void setEsunPeriInfi(String value){ this.esunPeriInfi=value;} 
  public boolean getEsunPeriInfiBool() { return esunPeriInfi==null?false:esunPeriInfi.equals("S");}
  public void setEsunPeriInfiBool(boolean esunPeriInfi) { this.esunPeriInfi=esunPeriInfi?"S":"N";}
//-------------------------------------------| TipoDiviPeri
  public String getTipoDiviPeri(){ return tipoDiviPeri; } 
  public String getTipoDiviPeriNn(){ return setNotNull(tipoDiviPeri); } 
  public void setTipoDiviPeri(String value){ this.tipoDiviPeri=value;} 
//-------------------------------------------| NumeDiviPeri
  public Integer getNumeDiviPeri(){ return numeDiviPeri; } 
  public Integer getNumeDiviPeriNn(){ return setNotNull(numeDiviPeri); } 
  public String getNumeDiviPeriDesc(){ return setDesc(numeDiviPeri); } 
  public void setNumeDiviPeri(Integer value){ this.numeDiviPeri=value;} 
//-------------------------------------------| IndiActiNota
  public String getIndiActiNota(){ return indiActiNota; } 
  public String getIndiActiNotaNn(){ return setNotNull(indiActiNota); } 
  public String getIndiActiNotaDesc(){ return setDesc(indiActiNota); } 
  public void setIndiActiNota(String value){ this.indiActiNota=value;} 
//-------------------------------------------| IndiActiCarg
  public String getIndiActiCarg(){ return indiActiCarg; } 
  public String getIndiActiCargNn(){ return setNotNull(indiActiCarg); } 
  public String getIndiActiCargDesc(){ return setDesc(indiActiCarg); } 
  public void setIndiActiCarg(String value){ this.indiActiCarg=value;} 
//-------------------------------------------| FkeyProgAcad
  public Integer getFkeyProgAcad(){ return fkeyProgAcad; } 
  public Integer getFkeyProgAcadNn(){ return setNotNull(fkeyProgAcad); } 
  public String getFkeyProgAcadDesc(){ return setDesc(fkeyProgAcad); } 
  public void setFkeyProgAcad(Integer value){ this.fkeyProgAcad=value;} 
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
//-------------------------------------------| Usa_horafijo
  public String getUsa_horafijo(){ return usa_horafijo; } 
  public String getUsa_horafijoNn(){ return setNotNull(usa_horafijo); } 
  public String getUsa_horafijoDesc(){ return setDesc(usa_horafijo); } 
  public void setUsa_horafijo(String value){ this.usa_horafijo=value;} 
//-------------------------------------------| NumeTotaSema
  public Integer getNumeTotaSema(){ return numeTotaSema; } 
  public Integer getNumeTotaSemaNn(){ return setNotNull(numeTotaSema); } 
  public String getNumeTotaSemaDesc(){ return setDesc(numeTotaSema); } 
  public void setNumeTotaSema(Integer value){ this.numeTotaSema=value;} 
//-------------------------------------------| TotaPuntCurs
  public Double getTotaPuntCurs(){ return totaPuntCurs; } 
  public Double getTotaPuntCursNn(){ return setNotNull(totaPuntCurs); } 
  public String getTotaPuntCursDesc(){ return setDesc(totaPuntCurs); } 
  public void setTotaPuntCurs(Double value){ this.totaPuntCurs=value;} 
// ---------------(RANGOS) 
  public String getEsunPeriInfiDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEsunPeriInfiNn()); } 
  public String getTipoDiviPeriDesc() { return DtoMisc.getRangeDesc(RANG_DiviPeri,getTipoDiviPeriNn()); } 

//---------------------(REL: FkeyPeriAcadDto) 
  public ADS_PeriodAcademDto getFkeyPeriAcadDto() { return fkeyPeriAcadDto; } 
  public void setFkeyPeriAcadDto(ADS_PeriodAcademDto fkeyPeriAcadDto) {
    if ( fkeyPeriAcadDto != null ) { 
      this.fkeyPeriAcad = fkeyPeriAcadDto.getPkeyPeriAcad(); 
    }
    this.fkeyPeriAcadDto = fkeyPeriAcadDto;
  } 
//---------------------(REL: FkeyPlanEstuDto) 
  public DEF_PlanesEstudiDto getFkeyPlanEstuDto() { return fkeyPlanEstuDto; } 
  public void setFkeyPlanEstuDto(DEF_PlanesEstudiDto fkeyPlanEstuDto) {
    if ( fkeyPlanEstuDto != null ) { 
      this.fkeyPlanEstu = fkeyPlanEstuDto.getPkeyPlanEstu(); 
    }
    this.fkeyPlanEstuDto = fkeyPlanEstuDto;
  } 


  @Override 
  public DEF_PeriodPlanesDto copy(){
    DEF_PeriodPlanesDto result = new DEF_PeriodPlanesDto();
    result.setPkeyPeriPlan( this.getPkeyPeriPlan()); 
    result.setFkeyPlanEstu( this.getFkeyPlanEstu()); 
    result.setFkeyPeriAcad( this.getFkeyPeriAcad()); 
    result.setEsunPeriInfi( this.getEsunPeriInfi()); 
    result.setTipoDiviPeri( this.getTipoDiviPeri()); 
    result.setNumeDiviPeri( this.getNumeDiviPeri()); 
    result.setIndiActiNota( this.getIndiActiNota()); 
    result.setIndiActiCarg( this.getIndiActiCarg()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setNumeroPromoc( this.getNumeroPromoc()); 
    result.setSemestreCurs( this.getSemestreCurs()); 
    result.setUsa_horafijo( this.getUsa_horafijo()); 
    result.setNumeTotaSema( this.getNumeTotaSema()); 
    result.setTotaPuntCurs( this.getTotaPuntCurs()); 
    result.setFkeyPeriAcadDto( this.getFkeyPeriAcadDto());
    result.setFkeyPlanEstuDto( this.getFkeyPlanEstuDto());
    return result;
  }
}

