package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.def.data.* ;
import com.bt.univex.cjd.data.* ;

public class CJD_PeritaConsulDto extends BaseDto {
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
  private String numePeritaje;
  private String estaPeritaje;
  private Integer fkeyDoceEspe;
  private String origPeriCons;
  private Integer fkeyPeriPlan;

  private DEFVPeriPlanProgDto fkeyPeriPlanDto;
  private CJDVDocentEspeciDto fkeyDoceEspeDto;

  public CJD_PeritaConsulDto() { 
     PkeyEnti = 185703;
     setAliasName("PeriCosu"); 
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
  public String getNumePeritaje(){ return numePeritaje; } 
  public String getNumePeritajeNn(){ return setNotNull(numePeritaje); } 
  public String getNumePeritajeDesc(){ return setDesc(numePeritaje); } 
  public void setNumePeritaje(String value){ this.numePeritaje=value;} 
//-------------------------------------------| EstaPeritaje
  public String getEstaPeritaje(){ return estaPeritaje; } 
  public String getEstaPeritajeNn(){ return setNotNull(estaPeritaje); } 
  public void setEstaPeritaje(String value){ this.estaPeritaje=value;} 
//-------------------------------------------| FkeyDoceEspe
  public Integer getFkeyDoceEspe(){ return fkeyDoceEspe; } 
  public Integer getFkeyDoceEspeNn(){ return setNotNull(fkeyDoceEspe); } 
  public String getFkeyDoceEspeDesc(){ return setDesc(fkeyDoceEspe); } 
  public void setFkeyDoceEspe(Integer value){ this.fkeyDoceEspe=value;} 
//-------------------------------------------| OrigPeriCons
  public String getOrigPeriCons(){ return origPeriCons; } 
  public String getOrigPeriConsNn(){ return setNotNull(origPeriCons); } 
  public void setOrigPeriCons(String value){ this.origPeriCons=value;} 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
// ---------------(RANGOS) 
  public String getAreaPeritajeDesc() { return DtoMisc.getRangeDesc(RANG_AreaPeritaje,getAreaPeritajeNn()); } 
  public String getEstaPeritajeDesc() { return DtoMisc.getRangeDesc(RANG_EstaPeritaje,getEstaPeritajeNn()); } 
  public String getOrigPeriConsDesc() { return DtoMisc.getRangeDesc(RANG_OrigPeriCons,getOrigPeriConsNn()); } 

//---------------------(REL: FkeyPeriPlanDto) 
  public DEFVPeriPlanProgDto getFkeyPeriPlanDto() { return fkeyPeriPlanDto; } 
  public void setFkeyPeriPlanDto(DEFVPeriPlanProgDto fkeyPeriPlanDto) {
    if ( fkeyPeriPlanDto != null ) { 
      this.fkeyPeriPlan = fkeyPeriPlanDto.getPkeyPeriPlan(); 
    }
    this.fkeyPeriPlanDto = fkeyPeriPlanDto;
  } 
//---------------------(REL: FkeyDoceEspeDto) 
  public CJDVDocentEspeciDto getFkeyDoceEspeDto() { return fkeyDoceEspeDto; } 
  public void setFkeyDoceEspeDto(CJDVDocentEspeciDto fkeyDoceEspeDto) {
    if ( fkeyDoceEspeDto != null ) { 
      this.fkeyDoceEspe = fkeyDoceEspeDto.getPkeyDoceEspe(); 
    }
    this.fkeyDoceEspeDto = fkeyDoceEspeDto;
  } 


  @Override 
  public CJD_PeritaConsulDto copy(){
    CJD_PeritaConsulDto result = new CJD_PeritaConsulDto();
    result.setPkeyPeriCons( this.getPkeyPeriCons()); 
    result.setNombPeritaje( this.getNombPeritaje()); 
    result.setAreaPeritaje( this.getAreaPeritaje()); 
    result.setDescPeritaje( this.getDescPeritaje()); 
    result.setNumePeritaje( this.getNumePeritaje()); 
    result.setEstaPeritaje( this.getEstaPeritaje()); 
    result.setFkeyDoceEspe( this.getFkeyDoceEspe()); 
    result.setOrigPeriCons( this.getOrigPeriCons()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setFkeyPeriPlanDto( this.getFkeyPeriPlanDto());
    result.setFkeyDoceEspeDto( this.getFkeyDoceEspeDto());
    return result;
  }
}

