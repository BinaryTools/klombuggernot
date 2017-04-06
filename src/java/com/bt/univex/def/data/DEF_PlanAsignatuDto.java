package com.bt.univex.def.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.* ;

public class DEF_PlanAsignatuDto extends BaseDto {
  public static final List RANG_TipoPerm = Arrays.asList( new Range[] { 
      new Range("C","Continúa sin cambios"),
      new Range("E","Entra como nueva al plan"),
      new Range("S","Salió del plan")});
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});


  private Integer pkeyAsigPlan;
  private Integer fkeyPlanEstu;
  private Integer fkeyDiviNota;
  private Integer fkeyModuPlan;
  private Integer fkeyClasCali;
  private Integer fkeyTipoForm;
  private Integer fkeyAreaCono;
  private Integer fkeyAsigEstu;
  private Integer fkeyNuclBasi;
  private Integer numeCredPlan;
  private Integer niveDondImpa;
  private String tipoPermPlan;
  private String tipoAsigPlan;
  private String esunAsigObli;
  private Integer totaHoraTeor;
  private Integer totaHoraPrac;
  private Integer horaTeorPrac;
  private Integer fkeyTipoAula;
  private String esunAsigVali;
  private Integer semaTotaPeri;
  private Integer pesoEnelProm;
  private Integer horaExtrClas;

  private DEF_NuclBasiConoDto fkeyNuclBasiDto;
//  private DEF_PlanAreaConoDto fkeyAreaConoDto;
//  private DEF_AsignaEstudiDto fkeyAsigEstuDto;
  private DEF_PlanesEstudiDto fkeyPlanEstuDto;
  private ADS_Clase_CalifiDto fkeyClasCaliDto;
//  private DEF_PlanEstuModuDto fkeyModuPlanDto;
//  private ADS_DivisiCalifiDto fkeyDiviNotaDto;
//  private CRG_TipoAulaClasDto fkeyTipoAulaDto;

  public DEF_PlanAsignatuDto() { 
     PkeyEnti = 7203;
     setAliasName("PlanAsig"); 
  } 

//-------------------------------------------| PkeyAsigPlan
  public Integer getPkeyAsigPlan(){ return pkeyAsigPlan; } 
  public Integer getPkeyAsigPlanNn(){ return setNotNull(pkeyAsigPlan); } 
  public String getPkeyAsigPlanDesc(){ return setDesc(pkeyAsigPlan); } 
  public void setPkeyAsigPlan(Integer value){ this.pkeyAsigPlan=value;} 
  @Override
  public int toInt(){ return getPkeyAsigPlanNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyAsigPlan; }; 
//-------------------------------------------| FkeyPlanEstu
  public Integer getFkeyPlanEstu(){ return fkeyPlanEstu; } 
  public Integer getFkeyPlanEstuNn(){ return setNotNull(fkeyPlanEstu); } 
  public String getFkeyPlanEstuDesc(){ return setDesc(fkeyPlanEstu); } 
  public void setFkeyPlanEstu(Integer value){ this.fkeyPlanEstu=value;} 
//-------------------------------------------| FkeyDiviNota
  public Integer getFkeyDiviNota(){ return fkeyDiviNota; } 
  public Integer getFkeyDiviNotaNn(){ return setNotNull(fkeyDiviNota); } 
  public String getFkeyDiviNotaDesc(){ return setDesc(fkeyDiviNota); } 
  public void setFkeyDiviNota(Integer value){ this.fkeyDiviNota=value;} 
//-------------------------------------------| FkeyModuPlan
  public Integer getFkeyModuPlan(){ return fkeyModuPlan; } 
  public Integer getFkeyModuPlanNn(){ return setNotNull(fkeyModuPlan); } 
  public String getFkeyModuPlanDesc(){ return setDesc(fkeyModuPlan); } 
  public void setFkeyModuPlan(Integer value){ this.fkeyModuPlan=value;} 
//-------------------------------------------| FkeyClasCali
  public Integer getFkeyClasCali(){ return fkeyClasCali; } 
  public Integer getFkeyClasCaliNn(){ return setNotNull(fkeyClasCali); } 
  public String getFkeyClasCaliDesc(){ return setDesc(fkeyClasCali); } 
  public void setFkeyClasCali(Integer value){ this.fkeyClasCali=value;} 
//-------------------------------------------| FkeyTipoForm
  public Integer getFkeyTipoForm(){ return fkeyTipoForm; } 
  public Integer getFkeyTipoFormNn(){ return setNotNull(fkeyTipoForm); } 
  public String getFkeyTipoFormDesc(){ return setDesc(fkeyTipoForm); } 
  public void setFkeyTipoForm(Integer value){ this.fkeyTipoForm=value;} 
//-------------------------------------------| FkeyAreaCono
  public Integer getFkeyAreaCono(){ return fkeyAreaCono; } 
  public Integer getFkeyAreaConoNn(){ return setNotNull(fkeyAreaCono); } 
  public String getFkeyAreaConoDesc(){ return setDesc(fkeyAreaCono); } 
  public void setFkeyAreaCono(Integer value){ this.fkeyAreaCono=value;} 
//-------------------------------------------| FkeyAsigEstu
  public Integer getFkeyAsigEstu(){ return fkeyAsigEstu; } 
  public Integer getFkeyAsigEstuNn(){ return setNotNull(fkeyAsigEstu); } 
  public String getFkeyAsigEstuDesc(){ return setDesc(fkeyAsigEstu); } 
  public void setFkeyAsigEstu(Integer value){ this.fkeyAsigEstu=value;} 
//-------------------------------------------| FkeyNuclBasi
  public Integer getFkeyNuclBasi(){ return fkeyNuclBasi; } 
  public Integer getFkeyNuclBasiNn(){ return setNotNull(fkeyNuclBasi); } 
  public String getFkeyNuclBasiDesc(){ return setDesc(fkeyNuclBasi); } 
  public void setFkeyNuclBasi(Integer value){ this.fkeyNuclBasi=value;} 
//-------------------------------------------| NumeCredPlan
  public Integer getNumeCredPlan(){ return numeCredPlan; } 
  public Integer getNumeCredPlanNn(){ return setNotNull(numeCredPlan); } 
  public String getNumeCredPlanDesc(){ return setDesc(numeCredPlan); } 
  public void setNumeCredPlan(Integer value){ this.numeCredPlan=value;} 
//-------------------------------------------| NiveDondImpa
  public Integer getNiveDondImpa(){ return niveDondImpa; } 
  public Integer getNiveDondImpaNn(){ return setNotNull(niveDondImpa); } 
  public String getNiveDondImpaDesc(){ return setDesc(niveDondImpa); } 
  public void setNiveDondImpa(Integer value){ this.niveDondImpa=value;} 
//-------------------------------------------| TipoPermPlan
  public String getTipoPermPlan(){ return tipoPermPlan; } 
  public String getTipoPermPlanNn(){ return setNotNull(tipoPermPlan); } 
  public void setTipoPermPlan(String value){ this.tipoPermPlan=value;} 
//-------------------------------------------| TipoAsigPlan
  public String getTipoAsigPlan(){ return tipoAsigPlan; } 
  public String getTipoAsigPlanNn(){ return setNotNull(tipoAsigPlan); } 
  public String getTipoAsigPlanDesc(){ return setDesc(tipoAsigPlan); } 
  public void setTipoAsigPlan(String value){ this.tipoAsigPlan=value;} 
//-------------------------------------------| EsunAsigObli
  public String getEsunAsigObli(){ return esunAsigObli; } 
  public String getEsunAsigObliNn(){ return setNotNull(esunAsigObli); } 
  public void setEsunAsigObli(String value){ this.esunAsigObli=value;} 
  public boolean getEsunAsigObliBool() { return esunAsigObli==null?false:esunAsigObli.equals("S");}
  public void setEsunAsigObliBool(boolean esunAsigObli) { this.esunAsigObli=esunAsigObli?"S":"N";}
//-------------------------------------------| TotaHoraTeor
  public Integer getTotaHoraTeor(){ return totaHoraTeor; } 
  public Integer getTotaHoraTeorNn(){ return setNotNull(totaHoraTeor); } 
  public String getTotaHoraTeorDesc(){ return setDesc(totaHoraTeor); } 
  public void setTotaHoraTeor(Integer value){ this.totaHoraTeor=value;} 
//-------------------------------------------| TotaHoraPrac
  public Integer getTotaHoraPrac(){ return totaHoraPrac; } 
  public Integer getTotaHoraPracNn(){ return setNotNull(totaHoraPrac); } 
  public String getTotaHoraPracDesc(){ return setDesc(totaHoraPrac); } 
  public void setTotaHoraPrac(Integer value){ this.totaHoraPrac=value;} 
//-------------------------------------------| HoraTeorPrac
  public Integer getHoraTeorPrac(){ return horaTeorPrac; } 
  public Integer getHoraTeorPracNn(){ return setNotNull(horaTeorPrac); } 
  public String getHoraTeorPracDesc(){ return setDesc(horaTeorPrac); } 
  public void setHoraTeorPrac(Integer value){ this.horaTeorPrac=value;} 
//-------------------------------------------| FkeyTipoAula
  public Integer getFkeyTipoAula(){ return fkeyTipoAula; } 
  public Integer getFkeyTipoAulaNn(){ return setNotNull(fkeyTipoAula); } 
  public String getFkeyTipoAulaDesc(){ return setDesc(fkeyTipoAula); } 
  public void setFkeyTipoAula(Integer value){ this.fkeyTipoAula=value;} 
//-------------------------------------------| EsunAsigVali
  public String getEsunAsigVali(){ return esunAsigVali; } 
  public String getEsunAsigValiNn(){ return setNotNull(esunAsigVali); } 
  public void setEsunAsigVali(String value){ this.esunAsigVali=value;} 
//-------------------------------------------| SemaTotaPeri
  public Integer getSemaTotaPeri(){ return semaTotaPeri; } 
  public Integer getSemaTotaPeriNn(){ return setNotNull(semaTotaPeri); } 
  public String getSemaTotaPeriDesc(){ return setDesc(semaTotaPeri); } 
  public void setSemaTotaPeri(Integer value){ this.semaTotaPeri=value;} 
//-------------------------------------------| PesoEnelProm
  public Integer getPesoEnelProm(){ return pesoEnelProm; } 
  public Integer getPesoEnelPromNn(){ return setNotNull(pesoEnelProm); } 
  public String getPesoEnelPromDesc(){ return setDesc(pesoEnelProm); } 
  public void setPesoEnelProm(Integer value){ this.pesoEnelProm=value;} 
//-------------------------------------------| HoraExtrClas
  public Integer getHoraExtrClas(){ return horaExtrClas; } 
  public Integer getHoraExtrClasNn(){ return setNotNull(horaExtrClas); } 
  public String getHoraExtrClasDesc(){ return setDesc(horaExtrClas); } 
  public void setHoraExtrClas(Integer value){ this.horaExtrClas=value;} 
// ---------------(RANGOS) 
  public String getTipoPermPlanDesc() { return DtoMisc.getRangeDesc(RANG_TipoPerm,getTipoPermPlanNn()); } 
  public String getEsunAsigObliDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEsunAsigObliNn()); } 
  public String getEsunAsigValiDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEsunAsigValiNn()); } 

//---------------------(REL: FkeyNuclBasiDto) 
  public DEF_NuclBasiConoDto getFkeyNuclBasiDto() { return fkeyNuclBasiDto; } 
  public void setFkeyNuclBasiDto(DEF_NuclBasiConoDto fkeyNuclBasiDto) {
    if ( fkeyNuclBasiDto != null ) { 
      this.fkeyNuclBasi = fkeyNuclBasiDto.getPkeyNuclBasi(); 
    }
    this.fkeyNuclBasiDto = fkeyNuclBasiDto;
  } 
//---------------------(REL: FkeyAreaConoDto) 
//  public DEF_PlanAreaConoDto getFkeyAreaConoDto() { return fkeyAreaConoDto; } 
//  public void setFkeyAreaConoDto(DEF_PlanAreaConoDto fkeyAreaConoDto) {
//    if ( fkeyAreaConoDto != null ) { 
//      this.fkeyAreaCono = fkeyAreaConoDto.getPkeyAreaPlan(); 
//    }
//    this.fkeyAreaConoDto = fkeyAreaConoDto;
//  } 
////---------------------(REL: FkeyAsigEstuDto) 
//  public DEF_AsignaEstudiDto getFkeyAsigEstuDto() { return fkeyAsigEstuDto; } 
//  public void setFkeyAsigEstuDto(DEF_AsignaEstudiDto fkeyAsigEstuDto) {
//    if ( fkeyAsigEstuDto != null ) { 
//      this.fkeyAsigEstu = fkeyAsigEstuDto.getPkeyAsigEstu(); 
//    }
//    this.fkeyAsigEstuDto = fkeyAsigEstuDto;
//  } 
//---------------------(REL: FkeyPlanEstuDto) 
  public DEF_PlanesEstudiDto getFkeyPlanEstuDto() { return fkeyPlanEstuDto; } 
  public void setFkeyPlanEstuDto(DEF_PlanesEstudiDto fkeyPlanEstuDto) {
    if ( fkeyPlanEstuDto != null ) { 
      this.fkeyPlanEstu = fkeyPlanEstuDto.getPkeyPlanEstu(); 
    }
    this.fkeyPlanEstuDto = fkeyPlanEstuDto;
  } 
//---------------------(REL: FkeyClasCaliDto) 
  public ADS_Clase_CalifiDto getFkeyClasCaliDto() { return fkeyClasCaliDto; } 
  public void setFkeyClasCaliDto(ADS_Clase_CalifiDto fkeyClasCaliDto) {
    if ( fkeyClasCaliDto != null ) { 
      this.fkeyClasCali = fkeyClasCaliDto.getPkeyClasCali(); 
    }
    this.fkeyClasCaliDto = fkeyClasCaliDto;
  } 
//---------------------(REL: FkeyModuPlanDto) 
//  public DEF_PlanEstuModuDto getFkeyModuPlanDto() { return fkeyModuPlanDto; } 
//  public void setFkeyModuPlanDto(DEF_PlanEstuModuDto fkeyModuPlanDto) {
//    if ( fkeyModuPlanDto != null ) { 
//      this.fkeyModuPlan = fkeyModuPlanDto.getPkeyModuPlan(); 
//    }
//    this.fkeyModuPlanDto = fkeyModuPlanDto;
//  } 
////---------------------(REL: FkeyDiviNotaDto) 
//  public ADS_DivisiCalifiDto getFkeyDiviNotaDto() { return fkeyDiviNotaDto; } 
//  public void setFkeyDiviNotaDto(ADS_DivisiCalifiDto fkeyDiviNotaDto) {
//    if ( fkeyDiviNotaDto != null ) { 
//      this.fkeyDiviNota = fkeyDiviNotaDto.getPkeyDiviCali(); 
//    }
//    this.fkeyDiviNotaDto = fkeyDiviNotaDto;
//  } 
////---------------------(REL: FkeyTipoAulaDto) 
//  public CRG_TipoAulaClasDto getFkeyTipoAulaDto() { return fkeyTipoAulaDto; } 
//  public void setFkeyTipoAulaDto(CRG_TipoAulaClasDto fkeyTipoAulaDto) {
//    if ( fkeyTipoAulaDto != null ) { 
//      this.fkeyTipoAula = fkeyTipoAulaDto.getPkeyTipoAula(); 
//    }
//    this.fkeyTipoAulaDto = fkeyTipoAulaDto;
//  } 


  @Override 
  public DEF_PlanAsignatuDto copy(){
    DEF_PlanAsignatuDto result = new DEF_PlanAsignatuDto();
    result.setPkeyAsigPlan( this.getPkeyAsigPlan()); 
    result.setFkeyPlanEstu( this.getFkeyPlanEstu()); 
    result.setFkeyDiviNota( this.getFkeyDiviNota()); 
    result.setFkeyModuPlan( this.getFkeyModuPlan()); 
    result.setFkeyClasCali( this.getFkeyClasCali()); 
    result.setFkeyTipoForm( this.getFkeyTipoForm()); 
    result.setFkeyAreaCono( this.getFkeyAreaCono()); 
    result.setFkeyAsigEstu( this.getFkeyAsigEstu()); 
    result.setFkeyNuclBasi( this.getFkeyNuclBasi()); 
    result.setNumeCredPlan( this.getNumeCredPlan()); 
    result.setNiveDondImpa( this.getNiveDondImpa()); 
    result.setTipoPermPlan( this.getTipoPermPlan()); 
    result.setTipoAsigPlan( this.getTipoAsigPlan()); 
    result.setEsunAsigObli( this.getEsunAsigObli()); 
    result.setTotaHoraTeor( this.getTotaHoraTeor()); 
    result.setTotaHoraPrac( this.getTotaHoraPrac()); 
    result.setHoraTeorPrac( this.getHoraTeorPrac()); 
    result.setFkeyTipoAula( this.getFkeyTipoAula()); 
    result.setEsunAsigVali( this.getEsunAsigVali()); 
    result.setSemaTotaPeri( this.getSemaTotaPeri()); 
    result.setPesoEnelProm( this.getPesoEnelProm()); 
    result.setHoraExtrClas( this.getHoraExtrClas()); 
    result.setFkeyNuclBasiDto( this.getFkeyNuclBasiDto());
//    result.setFkeyAreaConoDto( this.getFkeyAreaConoDto());
//    result.setFkeyAsigEstuDto( this.getFkeyAsigEstuDto());
//    result.setFkeyPlanEstuDto( this.getFkeyPlanEstuDto());
//    result.setFkeyClasCaliDto( this.getFkeyClasCaliDto());
//    result.setFkeyModuPlanDto( this.getFkeyModuPlanDto());
//    result.setFkeyDiviNotaDto( this.getFkeyDiviNotaDto());
//    result.setFkeyTipoAulaDto( this.getFkeyTipoAulaDto());
    return result;
  }
}

