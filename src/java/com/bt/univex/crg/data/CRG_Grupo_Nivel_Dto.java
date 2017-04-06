package com.bt.univex.crg.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.crg.data.*;
import com.bt.univex.ads.data.* ;
import com.bt.univex.def.data.* ;

public class CRG_Grupo_Nivel_Dto extends BaseDto {
  public static final List RANG_TipGrupo = Arrays.asList( new Range[] { 
      new Range("N","Normal"),
      new Range("O","Ocasional"),
      new Range("T","Tutorial"),
      new Range("V","Vacacional")});


  private Integer pkeyGrupNive;
  private Integer fkeyBloqTiem;
  private Integer fkeyPeriPlan;
  private String nombGrupNive;
  private Integer niveDentPlan;
  private Integer ordeGrupNive;
  private String tipoGrupNive;
  private Integer cupoMiniGrup;
  private Integer cupoMaxiGrup;

//  private ADS_BloqueTiempoDto fkeyBloqTiemDto;
  private DEFVPeriPlanProgDto fkeyPeriPlanDto;

  public CRG_Grupo_Nivel_Dto() { 
     PkeyEnti = 7703;
     setAliasName("GrupNive"); 
  } 

//-------------------------------------------| PkeyGrupNive
  public Integer getPkeyGrupNive(){ return pkeyGrupNive; } 
  public Integer getPkeyGrupNiveNn(){ return setNotNull(pkeyGrupNive); } 
  public String getPkeyGrupNiveDesc(){ return setDesc(pkeyGrupNive); } 
  public void setPkeyGrupNive(Integer value){ this.pkeyGrupNive=value;} 
  @Override
  public int toInt(){ return getPkeyGrupNiveNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyGrupNive; }; 
//-------------------------------------------| FkeyBloqTiem
  public Integer getFkeyBloqTiem(){ return fkeyBloqTiem; } 
  public Integer getFkeyBloqTiemNn(){ return setNotNull(fkeyBloqTiem); } 
  public String getFkeyBloqTiemDesc(){ return setDesc(fkeyBloqTiem); } 
  public void setFkeyBloqTiem(Integer value){ this.fkeyBloqTiem=value;} 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
//-------------------------------------------| NombGrupNive
  public String getNombGrupNive(){ return nombGrupNive; } 
  public String getNombGrupNiveNn(){ return setNotNull(nombGrupNive); } 
  public String getNombGrupNiveDesc(){ return setDesc(nombGrupNive); } 
  public void setNombGrupNive(String value){ this.nombGrupNive=value;} 
//-------------------------------------------| NiveDentPlan
  public Integer getNiveDentPlan(){ return niveDentPlan; } 
  public Integer getNiveDentPlanNn(){ return setNotNull(niveDentPlan); } 
  public String getNiveDentPlanDesc(){ return setDesc(niveDentPlan); } 
  public void setNiveDentPlan(Integer value){ this.niveDentPlan=value;} 
//-------------------------------------------| OrdeGrupNive
  public Integer getOrdeGrupNive(){ return ordeGrupNive; } 
  public Integer getOrdeGrupNiveNn(){ return setNotNull(ordeGrupNive); } 
  public String getOrdeGrupNiveDesc(){ return setDesc(ordeGrupNive); } 
  public void setOrdeGrupNive(Integer value){ this.ordeGrupNive=value;} 
//-------------------------------------------| TipoGrupNive
  public String getTipoGrupNive(){ return tipoGrupNive; } 
  public String getTipoGrupNiveNn(){ return setNotNull(tipoGrupNive); } 
  public void setTipoGrupNive(String value){ this.tipoGrupNive=value;} 
//-------------------------------------------| CupoMiniGrup
  public Integer getCupoMiniGrup(){ return cupoMiniGrup; } 
  public Integer getCupoMiniGrupNn(){ return setNotNull(cupoMiniGrup); } 
  public String getCupoMiniGrupDesc(){ return setDesc(cupoMiniGrup); } 
  public void setCupoMiniGrup(Integer value){ this.cupoMiniGrup=value;} 
//-------------------------------------------| CupoMaxiGrup
  public Integer getCupoMaxiGrup(){ return cupoMaxiGrup; } 
  public Integer getCupoMaxiGrupNn(){ return setNotNull(cupoMaxiGrup); } 
  public String getCupoMaxiGrupDesc(){ return setDesc(cupoMaxiGrup); } 
  public void setCupoMaxiGrup(Integer value){ this.cupoMaxiGrup=value;} 
// ---------------(RANGOS) 
  public String getTipoGrupNiveDesc() { return DtoMisc.getRangeDesc(RANG_TipGrupo,getTipoGrupNiveNn()); } 

//---------------------(REL: FkeyBloqTiemDto) 
//  public ADS_BloqueTiempoDto getFkeyBloqTiemDto() { return fkeyBloqTiemDto; } 
//  public void setFkeyBloqTiemDto(ADS_BloqueTiempoDto fkeyBloqTiemDto) {
//    if ( fkeyBloqTiemDto != null ) { 
//      this.fkeyBloqTiem = fkeyBloqTiemDto.getPkeyBloqTiem(); 
//    }
//    this.fkeyBloqTiemDto = fkeyBloqTiemDto;
//  } 
//---------------------(REL: FkeyPeriPlanDto) 
  public DEFVPeriPlanProgDto getFkeyPeriPlanDto() { return fkeyPeriPlanDto; } 
  public void setFkeyPeriPlanDto(DEFVPeriPlanProgDto fkeyPeriPlanDto) {
    if ( fkeyPeriPlanDto != null ) { 
      this.fkeyPeriPlan = fkeyPeriPlanDto.getPkeyPeriPlan(); 
    }
    this.fkeyPeriPlanDto = fkeyPeriPlanDto;
  } 


  @Override 
  public CRG_Grupo_Nivel_Dto copy(){
    CRG_Grupo_Nivel_Dto result = new CRG_Grupo_Nivel_Dto();
    result.setPkeyGrupNive( this.getPkeyGrupNive()); 
    result.setFkeyBloqTiem( this.getFkeyBloqTiem()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setNombGrupNive( this.getNombGrupNive()); 
    result.setNiveDentPlan( this.getNiveDentPlan()); 
    result.setOrdeGrupNive( this.getOrdeGrupNive()); 
    result.setTipoGrupNive( this.getTipoGrupNive()); 
    result.setCupoMiniGrup( this.getCupoMiniGrup()); 
    result.setCupoMaxiGrup( this.getCupoMaxiGrup()); 
//    result.setFkeyBloqTiemDto( this.getFkeyBloqTiemDto());
    result.setFkeyPeriPlanDto( this.getFkeyPeriPlanDto());
    return result;
  }
}

