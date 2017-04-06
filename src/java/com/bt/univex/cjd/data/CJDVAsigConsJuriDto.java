package com.bt.univex.cjd.data;

import com.bt.univex.crg.data.* ;
import com.bt.univex.def.data.*;
import com.xpc.base.*;

public class CJDVAsigConsJuriDto extends BaseDto {


  private Integer pkeyAsigCons;
  private Integer fkeyGrupAsig;
  private Integer fkeyPeriPlan;
  private String codiAsigEstu;
  private String nombAsigEstu;
  private String nombGrupNive;
  private String niveDentPlan;
  private String descripcion;

  private DEFVPeriPlanProgDto fkeyPeriPlanDto;
  private CRG_Grupo_AsignaDto fkeyGrupAsigDto;

  public CJDVAsigConsJuriDto() { 
     PkeyEnti = 130503;
     setAliasName("AsigConsV"); 
  } 

//-------------------------------------------| PkeyAsigCons
  public Integer getPkeyAsigCons(){ return pkeyAsigCons; } 
  public Integer getPkeyAsigConsNn(){ return setNotNull(pkeyAsigCons); } 
  public String getPkeyAsigConsDesc(){ return setDesc(pkeyAsigCons); } 
  public void setPkeyAsigCons(Integer value){ this.pkeyAsigCons=value;} 
  @Override
  public int toInt(){ return getPkeyAsigConsNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyAsigCons; }; 
//-------------------------------------------| FkeyGrupAsig
  public Integer getFkeyGrupAsig(){ return fkeyGrupAsig; } 
  public Integer getFkeyGrupAsigNn(){ return setNotNull(fkeyGrupAsig); } 
  public String getFkeyGrupAsigDesc(){ return setDesc(fkeyGrupAsig); } 
  public void setFkeyGrupAsig(Integer value){ this.fkeyGrupAsig=value;} 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
//-------------------------------------------| CodiAsigEstu
  public String getCodiAsigEstu(){ return codiAsigEstu; } 
  public String getCodiAsigEstuNn(){ return setNotNull(codiAsigEstu); } 
  public String getCodiAsigEstuDesc(){ return setDesc(codiAsigEstu); } 
  public void setCodiAsigEstu(String value){ this.codiAsigEstu=value;} 
//-------------------------------------------| NombAsigEstu
  public String getNombAsigEstu(){ return nombAsigEstu; } 
  public String getNombAsigEstuNn(){ return setNotNull(nombAsigEstu); } 
  public String getNombAsigEstuDesc(){ return setDesc(nombAsigEstu); } 
  public void setNombAsigEstu(String value){ this.nombAsigEstu=value;} 
//-------------------------------------------| NombGrupNive
  public String getNombGrupNive(){ return nombGrupNive; } 
  public String getNombGrupNiveNn(){ return setNotNull(nombGrupNive); } 
  public String getNombGrupNiveDesc(){ return setDesc(nombGrupNive); } 
  public void setNombGrupNive(String value){ this.nombGrupNive=value;} 
//-------------------------------------------| NiveDentPlan
  public String getNiveDentPlan(){ return niveDentPlan; } 
  public String getNiveDentPlanNn(){ return setNotNull(niveDentPlan); } 
  public String getNiveDentPlanDesc(){ return setDesc(niveDentPlan); } 
  public void setNiveDentPlan(String value){ this.niveDentPlan=value;} 
//-------------------------------------------| Descripcion
  public String getDescripcion(){ return descripcion; } 
  public String getDescripcionNn(){ return setNotNull(descripcion); } 
  public String getDescripcionDesc(){ return setDesc(descripcion); } 
  public void setDescripcion(String value){ this.descripcion=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyPeriPlanDto) 
  public DEFVPeriPlanProgDto getFkeyPeriPlanDto() { return fkeyPeriPlanDto; } 
  public void setFkeyPeriPlanDto(DEFVPeriPlanProgDto fkeyPeriPlanDto) {
    if ( fkeyPeriPlanDto != null ) { 
      this.fkeyPeriPlan = fkeyPeriPlanDto.getPkeyPeriPlan(); 
    }
    this.fkeyPeriPlanDto = fkeyPeriPlanDto;
  } 
//---------------------(REL: FkeyGrupAsigDto) 
  public CRG_Grupo_AsignaDto getFkeyGrupAsigDto() { return fkeyGrupAsigDto; } 
  public void setFkeyGrupAsigDto(CRG_Grupo_AsignaDto fkeyGrupAsigDto) {
    if ( fkeyGrupAsigDto != null ) { 
      this.fkeyGrupAsig = fkeyGrupAsigDto.getPkeyGrupAsig(); 
    }
    this.fkeyGrupAsigDto = fkeyGrupAsigDto;
  } 


  @Override 
  public CJDVAsigConsJuriDto copy(){
    CJDVAsigConsJuriDto result = new CJDVAsigConsJuriDto();
    result.setPkeyAsigCons( this.getPkeyAsigCons()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setCodiAsigEstu( this.getCodiAsigEstu()); 
    result.setNombAsigEstu( this.getNombAsigEstu()); 
    result.setNombGrupNive( this.getNombGrupNive()); 
    result.setNiveDentPlan( this.getNiveDentPlan()); 
    result.setDescripcion( this.getDescripcion()); 
    result.setFkeyPeriPlanDto( this.getFkeyPeriPlanDto());
    result.setFkeyGrupAsigDto( this.getFkeyGrupAsigDto());
    return result;
  }
}

