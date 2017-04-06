package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDVPeritaConsulDto extends BaseDto {
  public static final List RANG_AreaPeritaje = Arrays.asList( new Range[] { 
      new Range("P","Publico"),
      new Range("C","Civil"),
      new Range("E","Penal"),
      new Range("L","Laboral"),
      new Range("O","Conciliación")});
  public static final List RANG_EstaPeritaje = Arrays.asList( new Range[] { 
      new Range("E","En Trámite"),
      new Range("F","Finalizado"),
      new Range("I","Inactivo"),
      new Range("P","Sustitución")});
  public static final List RANG_OrigPeriCons = Arrays.asList( new Range[] { 
      new Range("P","Jusgado"),
      new Range("C","Consulta"),
      new Range("F","Fiscalía")});


  private Integer pkeyPeriCons;
  private String nombPeritaje;
  private String areaPeritaje;
  private String descPeritaje;
  private Integer numePeritaje;
  private String estaPeritaje;
  private String origPeriCons;
  private Integer fkeyPeriPlan;
  private Integer fkeyDoceEspe;
  private String nombCompProf;


  public CJDVPeritaConsulDto() { 
     PkeyEnti = 186303;
     setAliasName("PeriConV"); 
  } 

//-------------------------------------------| PkeyPeriCons
  public Integer getPkeyPeriCons(){ return pkeyPeriCons; } 
  public Integer getPkeyPeriConsNn(){ return setNotNull(pkeyPeriCons); } 
  public String getPkeyPeriConsDesc(){ return setDesc(pkeyPeriCons); } 
  public void setPkeyPeriCons(Integer value){ this.pkeyPeriCons=value;} 
  @Override
  public int toInt(){ return getPkeyPeriConsNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPeriCons; }; 
//-------------------------------------------| NombPeritaje
  public String getNombPeritaje(){ return nombPeritaje; } 
  public String getNombPeritajeNn(){ return setNotNull(nombPeritaje); } 
  public String getNombPeritajeDesc(){ return setDesc(nombPeritaje); } 
  public void setNombPeritaje(String value){ this.nombPeritaje=value;} 
//-------------------------------------------| AreaPeritaje
  public String getAreaPeritaje(){ return areaPeritaje; } 
  public String getAreaPeritajeNn(){ return setNotNull(areaPeritaje); } 
  public void setAreaPeritaje(String value){ this.areaPeritaje=value;} 
//-------------------------------------------| DescPeritaje
  public String getDescPeritaje(){ return descPeritaje; } 
  public String getDescPeritajeNn(){ return setNotNull(descPeritaje); } 
  public String getDescPeritajeDesc(){ return setDesc(descPeritaje); } 
  public void setDescPeritaje(String value){ this.descPeritaje=value;} 
//-------------------------------------------| NumePeritaje
  public Integer getNumePeritaje(){ return numePeritaje; } 
  public Integer getNumePeritajeNn(){ return setNotNull(numePeritaje); } 
  public String getNumePeritajeDesc(){ return setDesc(numePeritaje); } 
  public void setNumePeritaje(Integer value){ this.numePeritaje=value;} 
//-------------------------------------------| EstaPeritaje
  public String getEstaPeritaje(){ return estaPeritaje; } 
  public String getEstaPeritajeNn(){ return setNotNull(estaPeritaje); } 
  public void setEstaPeritaje(String value){ this.estaPeritaje=value;} 
  public boolean getEstaPeritajeBool() { return estaPeritaje==null?false:estaPeritaje.equals("S");}
  public void setEstaPeritajeBool(boolean estaPeritaje) { this.estaPeritaje=estaPeritaje?"S":"N";}
//-------------------------------------------| OrigPeriCons
  public String getOrigPeriCons(){ return origPeriCons; } 
  public String getOrigPeriConsNn(){ return setNotNull(origPeriCons); } 
  public void setOrigPeriCons(String value){ this.origPeriCons=value;} 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
//-------------------------------------------| FkeyDoceEspe
  public Integer getFkeyDoceEspe(){ return fkeyDoceEspe; } 
  public Integer getFkeyDoceEspeNn(){ return setNotNull(fkeyDoceEspe); } 
  public String getFkeyDoceEspeDesc(){ return setDesc(fkeyDoceEspe); } 
  public void setFkeyDoceEspe(Integer value){ this.fkeyDoceEspe=value;} 
//-------------------------------------------| NombCompProf
  public String getNombCompProf(){ return nombCompProf; } 
  public String getNombCompProfNn(){ return setNotNull(nombCompProf); } 
  public String getNombCompProfDesc(){ return setDesc(nombCompProf); } 
  public void setNombCompProf(String value){ this.nombCompProf=value;} 
// ---------------(RANGOS) 
  public String getAreaPeritajeDesc() { return DtoMisc.getRangeDesc(RANG_AreaPeritaje,getAreaPeritajeNn()); } 
  public String getEstaPeritajeDesc() { return DtoMisc.getRangeDesc(RANG_EstaPeritaje,getEstaPeritajeNn()); } 
  public String getOrigPeriConsDesc() { return DtoMisc.getRangeDesc(RANG_OrigPeriCons,getOrigPeriConsNn()); } 



  @Override 
  public CJDVPeritaConsulDto copy(){
    CJDVPeritaConsulDto result = new CJDVPeritaConsulDto();
    result.setPkeyPeriCons( this.getPkeyPeriCons()); 
    result.setNombPeritaje( this.getNombPeritaje()); 
    result.setAreaPeritaje( this.getAreaPeritaje()); 
    result.setDescPeritaje( this.getDescPeritaje()); 
    result.setNumePeritaje( this.getNumePeritaje()); 
    result.setEstaPeritaje( this.getEstaPeritaje()); 
    result.setOrigPeriCons( this.getOrigPeriCons()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setFkeyDoceEspe( this.getFkeyDoceEspe()); 
    result.setNombCompProf( this.getNombCompProf()); 
    return result;
  }
}

