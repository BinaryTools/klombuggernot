package com.bt.univex.ads.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;

public class ADS_PeriodAcademDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});


  private Integer pkeyPeriAcad;
  private String nombPeriAcad;
  private Integer ordePeriAcad;
  private Integer annoPeriAcad;
  private Integer numePeriAcad;
  private Integer numeMeseAbar;
  private String descPeriAcad;
  private Integer numeSemaPeri;
  private String estaActiPeri;
  private String esunVacacion;
  private Date fechInicPeri;
  private Date fechFiniPeri;


  public ADS_PeriodAcademDto() { 
     PkeyEnti = 6103;
     setAliasName("PeriAcad"); 
  } 

//-------------------------------------------| PkeyPeriAcad
  public Integer getPkeyPeriAcad(){ return pkeyPeriAcad; } 
  public Integer getPkeyPeriAcadNn(){ return setNotNull(pkeyPeriAcad); } 
  public String getPkeyPeriAcadDesc(){ return setDesc(pkeyPeriAcad); } 
  public void setPkeyPeriAcad(Integer value){ this.pkeyPeriAcad=value;} 
  @Override
  public int toInt(){ return getPkeyPeriAcadNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPeriAcad; }; 
//-------------------------------------------| NombPeriAcad
  public String getNombPeriAcad(){ return nombPeriAcad; } 
  public String getNombPeriAcadNn(){ return setNotNull(nombPeriAcad); } 
  public String getNombPeriAcadDesc(){ return setDesc(nombPeriAcad); } 
  public void setNombPeriAcad(String value){ this.nombPeriAcad=value;} 
  @Override
  public String toString(){ return getNombPeriAcadNn(); }; 
//-------------------------------------------| OrdePeriAcad
  public Integer getOrdePeriAcad(){ return ordePeriAcad; } 
  public Integer getOrdePeriAcadNn(){ return setNotNull(ordePeriAcad); } 
  public String getOrdePeriAcadDesc(){ return setDesc(ordePeriAcad); } 
  public void setOrdePeriAcad(Integer value){ this.ordePeriAcad=value;} 
//-------------------------------------------| AnnoPeriAcad
  public Integer getAnnoPeriAcad(){ return annoPeriAcad; } 
  public Integer getAnnoPeriAcadNn(){ return setNotNull(annoPeriAcad); } 
  public String getAnnoPeriAcadDesc(){ return setDesc(annoPeriAcad); } 
  public void setAnnoPeriAcad(Integer value){ this.annoPeriAcad=value;} 
//-------------------------------------------| NumePeriAcad
  public Integer getNumePeriAcad(){ return numePeriAcad; } 
  public Integer getNumePeriAcadNn(){ return setNotNull(numePeriAcad); } 
  public String getNumePeriAcadDesc(){ return setDesc(numePeriAcad); } 
  public void setNumePeriAcad(Integer value){ this.numePeriAcad=value;} 
//-------------------------------------------| NumeMeseAbar
  public Integer getNumeMeseAbar(){ return numeMeseAbar; } 
  public Integer getNumeMeseAbarNn(){ return setNotNull(numeMeseAbar); } 
  public String getNumeMeseAbarDesc(){ return setDesc(numeMeseAbar); } 
  public void setNumeMeseAbar(Integer value){ this.numeMeseAbar=value;} 
//-------------------------------------------| DescPeriAcad
  public String getDescPeriAcad(){ return descPeriAcad; } 
  public String getDescPeriAcadNn(){ return setNotNull(descPeriAcad); } 
  public String getDescPeriAcadDesc(){ return setDesc(descPeriAcad); } 
  public void setDescPeriAcad(String value){ this.descPeriAcad=value;} 
//-------------------------------------------| NumeSemaPeri
  public Integer getNumeSemaPeri(){ return numeSemaPeri; } 
  public Integer getNumeSemaPeriNn(){ return setNotNull(numeSemaPeri); } 
  public String getNumeSemaPeriDesc(){ return setDesc(numeSemaPeri); } 
  public void setNumeSemaPeri(Integer value){ this.numeSemaPeri=value;} 
//-------------------------------------------| EstaActiPeri
  public String getEstaActiPeri(){ return estaActiPeri; } 
  public String getEstaActiPeriNn(){ return setNotNull(estaActiPeri); } 
  public void setEstaActiPeri(String value){ this.estaActiPeri=value;} 
  public boolean getEstaActiPeriBool() { return estaActiPeri==null?false:estaActiPeri.equals("S");}
  public void setEstaActiPeriBool(boolean estaActiPeri) { this.estaActiPeri=estaActiPeri?"S":"N";}
//-------------------------------------------| EsunVacacion
  public String getEsunVacacion(){ return esunVacacion; } 
  public String getEsunVacacionNn(){ return setNotNull(esunVacacion); } 
  public void setEsunVacacion(String value){ this.esunVacacion=value;} 
  public boolean getEsunVacacionBool() { return esunVacacion==null?false:esunVacacion.equals("S");}
  public void setEsunVacacionBool(boolean esunVacacion) { this.esunVacacion=esunVacacion?"S":"N";}
//-------------------------------------------| FechInicPeri
  public Date getFechInicPeri(){ return fechInicPeri; } 
  public Date getFechInicPeriNn(){ return setNotNull(fechInicPeri); } 
  public String getFechInicPeriDesc(){ return setDesc(fechInicPeri); } 
  public void setFechInicPeri(Date value){ this.fechInicPeri=value;} 
//-------------------------------------------| FechFiniPeri
  public Date getFechFiniPeri(){ return fechFiniPeri; } 
  public Date getFechFiniPeriNn(){ return setNotNull(fechFiniPeri); } 
  public String getFechFiniPeriDesc(){ return setDesc(fechFiniPeri); } 
  public void setFechFiniPeri(Date value){ this.fechFiniPeri=value;} 
// ---------------(RANGOS) 
  public String getEstaActiPeriDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaActiPeriNn()); } 
  public String getEsunVacacionDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEsunVacacionNn()); } 



  @Override 
  public ADS_PeriodAcademDto copy(){
    ADS_PeriodAcademDto result = new ADS_PeriodAcademDto();
    result.setPkeyPeriAcad( this.getPkeyPeriAcad()); 
    result.setNombPeriAcad( this.getNombPeriAcad()); 
    result.setOrdePeriAcad( this.getOrdePeriAcad()); 
    result.setAnnoPeriAcad( this.getAnnoPeriAcad()); 
    result.setNumePeriAcad( this.getNumePeriAcad()); 
    result.setNumeMeseAbar( this.getNumeMeseAbar()); 
    result.setDescPeriAcad( this.getDescPeriAcad()); 
    result.setNumeSemaPeri( this.getNumeSemaPeri()); 
    result.setEstaActiPeri( this.getEstaActiPeri()); 
    result.setEsunVacacion( this.getEsunVacacion()); 
    result.setFechInicPeri( this.getFechInicPeri()); 
    result.setFechFiniPeri( this.getFechFiniPeri()); 
    return result;
  }
}

