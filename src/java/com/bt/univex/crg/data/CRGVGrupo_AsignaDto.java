package com.bt.univex.crg.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.def.data.* ;

public class CRGVGrupo_AsignaDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});
  public static final List RANG_TipGrupo = Arrays.asList( new Range[] { 
      new Range("N","Normal"),
      new Range("O","Ocasional"),
      new Range("T","Tutorial"),
      new Range("V","Vacacional")});
  public static final List RANG_TipoGrupAsig = Arrays.asList( new Range[] { 
      new Range("N","Grupo Regular"),
      new Range("R","Grupo para Repitentes"),
      new Range("T","Grupo para Tutoriales")});


  private Integer pkeyGrupAsig;
  private Integer fkeyAsigEstu;
  private Integer fkeyPeriPlan;
  private Integer fkeyDocentes;
  private Integer ordeGrupNive;
  private Integer fkeyGrupAsigEqui;
  private Integer fkeyGrupNive;
  private String descripcion;
  private String codiAsigEstu;
  private String esunGrupComp;
//  private String descripcion;
  private String tipoGrupNive;
  private String nombAsigEstu;
  private Integer cupoMaxiGrup;
  private String nombGrupNive;
  private Integer cupoMiniGrup;
  private Integer niveDentPlan;
  private String tipoGrupAsig;
  private Integer horaAsigVist;
  private Integer horaTotaAsig;

  private CRG_Grupo_Nivel_Dto fkeyGrupNiveDto;
  private DEFVPeriPlanProgDto fkeyPeriPlanDto;

  public CRGVGrupo_AsignaDto() { 
     PkeyEnti = 18903;
     setAliasName("GrupAsig"); 
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
//-------------------------------------------| FkeyAsigEstu
  public Integer getFkeyAsigEstu(){ return fkeyAsigEstu; } 
  public Integer getFkeyAsigEstuNn(){ return setNotNull(fkeyAsigEstu); } 
  public String getFkeyAsigEstuDesc(){ return setDesc(fkeyAsigEstu); } 
  public void setFkeyAsigEstu(Integer value){ this.fkeyAsigEstu=value;} 
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
//-------------------------------------------| OrdeGrupNive
  public Integer getOrdeGrupNive(){ return ordeGrupNive; } 
  public Integer getOrdeGrupNiveNn(){ return setNotNull(ordeGrupNive); } 
  public String getOrdeGrupNiveDesc(){ return setDesc(ordeGrupNive); } 
  public void setOrdeGrupNive(Integer value){ this.ordeGrupNive=value;} 
//-------------------------------------------| FkeyGrupAsigEqui
  public Integer getFkeyGrupAsigEqui(){ return fkeyGrupAsigEqui; } 
  public Integer getFkeyGrupAsigEquiNn(){ return setNotNull(fkeyGrupAsigEqui); } 
  public String getFkeyGrupAsigEquiDesc(){ return setDesc(fkeyGrupAsigEqui); } 
  public void setFkeyGrupAsigEqui(Integer value){ this.fkeyGrupAsigEqui=value;} 
//-------------------------------------------| FkeyGrupNive
  public Integer getFkeyGrupNive(){ return fkeyGrupNive; } 
  public Integer getFkeyGrupNiveNn(){ return setNotNull(fkeyGrupNive); } 
  public String getFkeyGrupNiveDesc(){ return setDesc(fkeyGrupNive); } 
  public void setFkeyGrupNive(Integer value){ this.fkeyGrupNive=value;} 
//-------------------------------------------| Descripcion
  public String getDescripcion(){ return descripcion; } 
  public String getDescripcionNn(){ return setNotNull(descripcion); } 
  public String getDescripcionDesc(){ return setDesc(descripcion); } 
  public void setDescripcion(String value){ this.descripcion=value;} 
  @Override
  public String toString(){ return getDescripcionNn(); }; 
//-------------------------------------------| CodiAsigEstu
  public String getCodiAsigEstu(){ return codiAsigEstu; } 
  public String getCodiAsigEstuNn(){ return setNotNull(codiAsigEstu); } 
  public String getCodiAsigEstuDesc(){ return setDesc(codiAsigEstu); } 
  public void setCodiAsigEstu(String value){ this.codiAsigEstu=value;} 
//-------------------------------------------| EsunGrupComp
  public String getEsunGrupComp(){ return esunGrupComp; } 
  public String getEsunGrupCompNn(){ return setNotNull(esunGrupComp); } 
  public void setEsunGrupComp(String value){ this.esunGrupComp=value;} 
  public boolean getEsunGrupCompBool() { return esunGrupComp==null?false:esunGrupComp.equals("S");}
  public void setEsunGrupCompBool(boolean esunGrupComp) { this.esunGrupComp=esunGrupComp?"S":"N";}
//-------------------------------------------| Descripcion
//  public String getDescripcion(){ return descripcion; } 
//  public String getDescripcionNn(){ return setNotNull(descripcion); } 
//  public String getDescripcionDesc(){ return setDesc(descripcion); } 
//  public void setDescripcion(String value){ this.descripcion=value;} 
//  @Override
//  public String toString(){ return getDescripcionNn(); }; 
//-------------------------------------------| TipoGrupNive
  public String getTipoGrupNive(){ return tipoGrupNive; } 
  public String getTipoGrupNiveNn(){ return setNotNull(tipoGrupNive); } 
  public void setTipoGrupNive(String value){ this.tipoGrupNive=value;} 
//-------------------------------------------| NombAsigEstu
  public String getNombAsigEstu(){ return nombAsigEstu; } 
  public String getNombAsigEstuNn(){ return setNotNull(nombAsigEstu); } 
  public String getNombAsigEstuDesc(){ return setDesc(nombAsigEstu); } 
  public void setNombAsigEstu(String value){ this.nombAsigEstu=value;} 
//-------------------------------------------| CupoMaxiGrup
  public Integer getCupoMaxiGrup(){ return cupoMaxiGrup; } 
  public Integer getCupoMaxiGrupNn(){ return setNotNull(cupoMaxiGrup); } 
  public String getCupoMaxiGrupDesc(){ return setDesc(cupoMaxiGrup); } 
  public void setCupoMaxiGrup(Integer value){ this.cupoMaxiGrup=value;} 
//-------------------------------------------| NombGrupNive
  public String getNombGrupNive(){ return nombGrupNive; } 
  public String getNombGrupNiveNn(){ return setNotNull(nombGrupNive); } 
  public String getNombGrupNiveDesc(){ return setDesc(nombGrupNive); } 
  public void setNombGrupNive(String value){ this.nombGrupNive=value;} 
//-------------------------------------------| CupoMiniGrup
  public Integer getCupoMiniGrup(){ return cupoMiniGrup; } 
  public Integer getCupoMiniGrupNn(){ return setNotNull(cupoMiniGrup); } 
  public String getCupoMiniGrupDesc(){ return setDesc(cupoMiniGrup); } 
  public void setCupoMiniGrup(Integer value){ this.cupoMiniGrup=value;} 
//-------------------------------------------| NiveDentPlan
  public Integer getNiveDentPlan(){ return niveDentPlan; } 
  public Integer getNiveDentPlanNn(){ return setNotNull(niveDentPlan); } 
  public String getNiveDentPlanDesc(){ return setDesc(niveDentPlan); } 
  public void setNiveDentPlan(Integer value){ this.niveDentPlan=value;} 
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
// ---------------(RANGOS) 
  public String getEsunGrupCompDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEsunGrupCompNn()); } 
  public String getTipoGrupNiveDesc() { return DtoMisc.getRangeDesc(RANG_TipGrupo,getTipoGrupNiveNn()); } 
  public String getTipoGrupAsigDesc() { return DtoMisc.getRangeDesc(RANG_TipoGrupAsig,getTipoGrupAsigNn()); } 

//---------------------(REL: FkeyGrupNiveDto) 
  public CRG_Grupo_Nivel_Dto getFkeyGrupNiveDto() { return fkeyGrupNiveDto; } 
  public void setFkeyGrupNiveDto(CRG_Grupo_Nivel_Dto fkeyGrupNiveDto) {
    if ( fkeyGrupNiveDto != null ) { 
      this.fkeyGrupNive = fkeyGrupNiveDto.getFkeyBloqTiem(); 
    }
    this.fkeyGrupNiveDto = fkeyGrupNiveDto;
  } 
//---------------------(REL: FkeyPeriPlanDto) 
  public DEFVPeriPlanProgDto getFkeyPeriPlanDto() { return fkeyPeriPlanDto; } 
  public void setFkeyPeriPlanDto(DEFVPeriPlanProgDto fkeyPeriPlanDto) {
    if ( fkeyPeriPlanDto != null ) { 
      this.fkeyPeriPlan = fkeyPeriPlanDto.getPkeyPeriPlan(); 
    }
    this.fkeyPeriPlanDto = fkeyPeriPlanDto;
  } 


  @Override 
  public CRGVGrupo_AsignaDto copy(){
    CRGVGrupo_AsignaDto result = new CRGVGrupo_AsignaDto();
    result.setPkeyGrupAsig( this.getPkeyGrupAsig()); 
    result.setFkeyAsigEstu( this.getFkeyAsigEstu()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setFkeyDocentes( this.getFkeyDocentes()); 
    result.setOrdeGrupNive( this.getOrdeGrupNive()); 
    result.setFkeyGrupAsigEqui( this.getFkeyGrupAsigEqui()); 
    result.setFkeyGrupNive( this.getFkeyGrupNive()); 
    result.setDescripcion( this.getDescripcion()); 
    result.setCodiAsigEstu( this.getCodiAsigEstu()); 
    result.setEsunGrupComp( this.getEsunGrupComp()); 
//    result.setDescripcion( this.getDescripcion()); 
    result.setTipoGrupNive( this.getTipoGrupNive()); 
    result.setNombAsigEstu( this.getNombAsigEstu()); 
    result.setCupoMaxiGrup( this.getCupoMaxiGrup()); 
    result.setNombGrupNive( this.getNombGrupNive()); 
    result.setCupoMiniGrup( this.getCupoMiniGrup()); 
    result.setNiveDentPlan( this.getNiveDentPlan()); 
    result.setTipoGrupAsig( this.getTipoGrupAsig()); 
    result.setHoraAsigVist( this.getHoraAsigVist()); 
    result.setHoraTotaAsig( this.getHoraTotaAsig()); 
    result.setFkeyGrupNiveDto( this.getFkeyGrupNiveDto());
    result.setFkeyPeriPlanDto( this.getFkeyPeriPlanDto());
    return result;
  }
}

