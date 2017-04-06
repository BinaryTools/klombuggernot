package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDDEstudiPeritaDto extends BaseDto {
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


  private Integer pkeyEstuPeri;
  private Integer fkeyPeriCons;
  private Integer fkeyEstudian;
  private Date fechAsigPeri;
  private Date fechEntrPeri;
  private String nombPeritaje;
  private String areaPeritaje;
  private String descPeritaje;
  private Integer numePeritaje;
  private String estaPeritaje;
  private Integer fkeyDoceEspe;
  private String nombCompProf;
  private Double notaPeritaje;
  private Date fechNotaPeri;


  public CJDDEstudiPeritaDto() { 
     PkeyEnti = 188703;
     setAliasName("EstuPeriD"); 
  } 

//-------------------------------------------| PkeyEstuPeri
  public Integer getPkeyEstuPeri(){ return pkeyEstuPeri; } 
  public Integer getPkeyEstuPeriNn(){ return setNotNull(pkeyEstuPeri); } 
  public String getPkeyEstuPeriDesc(){ return setDesc(pkeyEstuPeri); } 
  public void setPkeyEstuPeri(Integer value){ this.pkeyEstuPeri=value;} 
  @Override
  public int toInt(){ return getPkeyEstuPeriNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyEstuPeri; }; 
//-------------------------------------------| FkeyPeriCons
  public Integer getFkeyPeriCons(){ return fkeyPeriCons; } 
  public Integer getFkeyPeriConsNn(){ return setNotNull(fkeyPeriCons); } 
  public String getFkeyPeriConsDesc(){ return setDesc(fkeyPeriCons); } 
  public void setFkeyPeriCons(Integer value){ this.fkeyPeriCons=value;} 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| FechAsigPeri
  public Date getFechAsigPeri(){ return fechAsigPeri; } 
  public Date getFechAsigPeriNn(){ return setNotNull(fechAsigPeri); } 
  public String getFechAsigPeriDesc(){ return setDesc(fechAsigPeri); } 
  public void setFechAsigPeri(Date value){ this.fechAsigPeri=value;} 
//-------------------------------------------| FechEntrPeri
  public Date getFechEntrPeri(){ return fechEntrPeri; } 
  public Date getFechEntrPeriNn(){ return setNotNull(fechEntrPeri); } 
  public String getFechEntrPeriDesc(){ return setDesc(fechEntrPeri); } 
  public void setFechEntrPeri(Date value){ this.fechEntrPeri=value;} 
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
//-------------------------------------------| NotaPeritaje
  public Double getNotaPeritaje(){ return notaPeritaje; } 
  public Double getNotaPeritajeNn(){ return setNotNull(notaPeritaje); } 
  public String getNotaPeritajeDesc(){ return setDesc(notaPeritaje); } 
  public void setNotaPeritaje(Double value){ this.notaPeritaje=value;} 
//-------------------------------------------| FechNotaPeri
  public Date getFechNotaPeri(){ return fechNotaPeri; } 
  public Date getFechNotaPeriNn(){ return setNotNull(fechNotaPeri); } 
  public String getFechNotaPeriDesc(){ return setDesc(fechNotaPeri); } 
  public void setFechNotaPeri(Date value){ this.fechNotaPeri=value;} 
// ---------------(RANGOS) 
  public String getAreaPeritajeDesc() { return DtoMisc.getRangeDesc(RANG_AreaPeritaje,getAreaPeritajeNn()); } 
  public String getEstaPeritajeDesc() { return DtoMisc.getRangeDesc(RANG_EstaPeritaje,getEstaPeritajeNn()); } 



  @Override 
  public CJDDEstudiPeritaDto copy(){
    CJDDEstudiPeritaDto result = new CJDDEstudiPeritaDto();
    result.setPkeyEstuPeri( this.getPkeyEstuPeri()); 
    result.setFkeyPeriCons( this.getFkeyPeriCons()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFechAsigPeri( this.getFechAsigPeri()); 
    result.setFechEntrPeri( this.getFechEntrPeri()); 
    result.setNombPeritaje( this.getNombPeritaje()); 
    result.setAreaPeritaje( this.getAreaPeritaje()); 
    result.setDescPeritaje( this.getDescPeritaje()); 
    result.setNumePeritaje( this.getNumePeritaje()); 
    result.setEstaPeritaje( this.getEstaPeritaje()); 
    result.setFkeyDoceEspe( this.getFkeyDoceEspe()); 
    result.setNombCompProf( this.getNombCompProf()); 
    result.setNotaPeritaje( this.getNotaPeritaje()); 
    result.setFechNotaPeri( this.getFechNotaPeri()); 
    return result;
  }
}

