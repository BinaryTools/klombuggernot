package com.bt.univex.def.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.* ;

public class DEF_PlanesEstudiDto extends BaseDto {
  public static final List RANG_TipoModa = Arrays.asList( new Range[] { 
      new Range("C","Créditos Académicos"),
      new Range("S","Semestralizado")});


  private Integer pkeyPlanEstu;
  private Integer fkeyProgAcad;
  private Integer codiPlanEstu;
  private String descPlanEstu;
  private String estaActiPlan;
  private Integer fkeyBloqTiem;
  private String modaPlanEstu;

  private ADS_PrograAcademDto fkeyProgAcadDto;
//  private ADS_BloqueTiempoDto fkeyBloqTiemDto;

  public DEF_PlanesEstudiDto() { 
     PkeyEnti = 1503;
     setAliasName("PlanEstu"); 
  } 

//-------------------------------------------| PkeyPlanEstu
  public Integer getPkeyPlanEstu(){ return pkeyPlanEstu; } 
  public Integer getPkeyPlanEstuNn(){ return setNotNull(pkeyPlanEstu); } 
  public String getPkeyPlanEstuDesc(){ return setDesc(pkeyPlanEstu); } 
  public void setPkeyPlanEstu(Integer value){ this.pkeyPlanEstu=value;} 
  @Override
  public int toInt(){ return getPkeyPlanEstuNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPlanEstu; }; 
//-------------------------------------------| FkeyProgAcad
  public Integer getFkeyProgAcad(){ return fkeyProgAcad; } 
  public Integer getFkeyProgAcadNn(){ return setNotNull(fkeyProgAcad); } 
  public String getFkeyProgAcadDesc(){ return setDesc(fkeyProgAcad); } 
  public void setFkeyProgAcad(Integer value){ this.fkeyProgAcad=value;} 
//-------------------------------------------| CodiPlanEstu
  public Integer getCodiPlanEstu(){ return codiPlanEstu; } 
  public Integer getCodiPlanEstuNn(){ return setNotNull(codiPlanEstu); } 
  public String getCodiPlanEstuDesc(){ return setDesc(codiPlanEstu); } 
  public void setCodiPlanEstu(Integer value){ this.codiPlanEstu=value;} 
//-------------------------------------------| DescPlanEstu
  public String getDescPlanEstu(){ return descPlanEstu; } 
  public String getDescPlanEstuNn(){ return setNotNull(descPlanEstu); } 
  public String getDescPlanEstuDesc(){ return setDesc(descPlanEstu); } 
  public void setDescPlanEstu(String value){ this.descPlanEstu=value;} 
  @Override
  public String toString(){ return getDescPlanEstuNn(); }; 
//-------------------------------------------| EstaActiPlan
  public String getEstaActiPlan(){ return estaActiPlan; } 
  public String getEstaActiPlanNn(){ return setNotNull(estaActiPlan); } 
  public String getEstaActiPlanDesc(){ return setDesc(estaActiPlan); } 
  public void setEstaActiPlan(String value){ this.estaActiPlan=value;} 
  public boolean getEstaActiPlanBool() { return estaActiPlan==null?false:estaActiPlan.equals("S");}
  public void setEstaActiPlanBool(boolean estaActiPlan) { this.estaActiPlan=estaActiPlan?"S":"N";}
//-------------------------------------------| FkeyBloqTiem
  public Integer getFkeyBloqTiem(){ return fkeyBloqTiem; } 
  public Integer getFkeyBloqTiemNn(){ return setNotNull(fkeyBloqTiem); } 
  public String getFkeyBloqTiemDesc(){ return setDesc(fkeyBloqTiem); } 
  public void setFkeyBloqTiem(Integer value){ this.fkeyBloqTiem=value;} 
//-------------------------------------------| ModaPlanEstu
  public String getModaPlanEstu(){ return modaPlanEstu; } 
  public String getModaPlanEstuNn(){ return setNotNull(modaPlanEstu); } 
  public void setModaPlanEstu(String value){ this.modaPlanEstu=value;} 
// ---------------(RANGOS) 
  public String getModaPlanEstuDesc() { return DtoMisc.getRangeDesc(RANG_TipoModa,getModaPlanEstuNn()); } 

//---------------------(REL: FkeyProgAcadDto) 
  public ADS_PrograAcademDto getFkeyProgAcadDto() { return fkeyProgAcadDto; } 
  public void setFkeyProgAcadDto(ADS_PrograAcademDto fkeyProgAcadDto) {
    if ( fkeyProgAcadDto != null ) { 
      this.fkeyProgAcad = fkeyProgAcadDto.getPkeyProgAcad(); 
    }
    this.fkeyProgAcadDto = fkeyProgAcadDto;
  } 
//---------------------(REL: FkeyBloqTiemDto) 
//  public ADS_BloqueTiempoDto getFkeyBloqTiemDto() { return fkeyBloqTiemDto; } 
//  public void setFkeyBloqTiemDto(ADS_BloqueTiempoDto fkeyBloqTiemDto) {
//    if ( fkeyBloqTiemDto != null ) { 
//      this.fkeyBloqTiem = fkeyBloqTiemDto.getPkeyBloqTiem(); 
//    }
//    this.fkeyBloqTiemDto = fkeyBloqTiemDto;
//  } 


  @Override 
  public DEF_PlanesEstudiDto copy(){
    DEF_PlanesEstudiDto result = new DEF_PlanesEstudiDto();
    result.setPkeyPlanEstu( this.getPkeyPlanEstu()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setCodiPlanEstu( this.getCodiPlanEstu()); 
    result.setDescPlanEstu( this.getDescPlanEstu()); 
    result.setEstaActiPlan( this.getEstaActiPlan()); 
    result.setFkeyBloqTiem( this.getFkeyBloqTiem()); 
    result.setModaPlanEstu( this.getModaPlanEstu()); 
    result.setFkeyProgAcadDto( this.getFkeyProgAcadDto());
//    result.setFkeyBloqTiemDto( this.getFkeyBloqTiemDto());
    return result;
  }
}

