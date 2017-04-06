package com.bt.univex.crg.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.crg.data.*;
import com.bt.univex.def.data.* ;
import com.bt.univex.def.data.* ;
import com.bt.univex.def.data.* ;
import com.bt.univex.ads.data.* ;

public class CRG_Carga_AcademDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});


  private Integer pkeyCargAcad;
  private Integer fkeyAsigEstu;
  private Integer fkeyGrupNive;
  private Integer fkeyPeriPlan;
  private Integer fkeyGrupAsig;
  private Integer fkeyEstudian;
  private Integer numeVecePerd;
  private String debeInscPeri;
  private Integer niveDelaAsig;
  private Integer numeCredCarg;
  private Integer veceCancAsig;
  private String estaCancMate;
  private String estaAsigCarg;

  private DEFVPeriPlanProgDto fkeyPeriPlanDto;
  private DEF_AsignaEstudiDto fkeyAsigEstuDto;
//  private DEF_PeriodPlanesDto fkeyPeriPlanDto;
  private ADS_EstudiUniverDto fkeyEstudianDto;

  public CRG_Carga_AcademDto() { 
     PkeyEnti = 7803;
     setAliasName("CargAcad"); 
  } 

//-------------------------------------------| PkeyCargAcad
  public Integer getPkeyCargAcad(){ return pkeyCargAcad; } 
  public Integer getPkeyCargAcadNn(){ return setNotNull(pkeyCargAcad); } 
  public String getPkeyCargAcadDesc(){ return setDesc(pkeyCargAcad); } 
  public void setPkeyCargAcad(Integer value){ this.pkeyCargAcad=value;} 
  @Override
  public int toInt(){ return getPkeyCargAcadNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyCargAcad; }; 
//-------------------------------------------| FkeyAsigEstu
  public Integer getFkeyAsigEstu(){ return fkeyAsigEstu; } 
  public Integer getFkeyAsigEstuNn(){ return setNotNull(fkeyAsigEstu); } 
  public String getFkeyAsigEstuDesc(){ return setDesc(fkeyAsigEstu); } 
  public void setFkeyAsigEstu(Integer value){ this.fkeyAsigEstu=value;} 
//-------------------------------------------| FkeyGrupNive
  public Integer getFkeyGrupNive(){ return fkeyGrupNive; } 
  public Integer getFkeyGrupNiveNn(){ return setNotNull(fkeyGrupNive); } 
  public String getFkeyGrupNiveDesc(){ return setDesc(fkeyGrupNive); } 
  public void setFkeyGrupNive(Integer value){ this.fkeyGrupNive=value;} 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
//-------------------------------------------| FkeyGrupAsig
  public Integer getFkeyGrupAsig(){ return fkeyGrupAsig; } 
  public Integer getFkeyGrupAsigNn(){ return setNotNull(fkeyGrupAsig); } 
  public String getFkeyGrupAsigDesc(){ return setDesc(fkeyGrupAsig); } 
  public void setFkeyGrupAsig(Integer value){ this.fkeyGrupAsig=value;} 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| NumeVecePerd
  public Integer getNumeVecePerd(){ return numeVecePerd; } 
  public Integer getNumeVecePerdNn(){ return setNotNull(numeVecePerd); } 
  public String getNumeVecePerdDesc(){ return setDesc(numeVecePerd); } 
  public void setNumeVecePerd(Integer value){ this.numeVecePerd=value;} 
//-------------------------------------------| DebeInscPeri
  public String getDebeInscPeri(){ return debeInscPeri; } 
  public String getDebeInscPeriNn(){ return setNotNull(debeInscPeri); } 
  public void setDebeInscPeri(String value){ this.debeInscPeri=value;} 
  public boolean getDebeInscPeriBool() { return debeInscPeri==null?false:debeInscPeri.equals("S");}
  public void setDebeInscPeriBool(boolean debeInscPeri) { this.debeInscPeri=debeInscPeri?"S":"N";}
//-------------------------------------------| NiveDelaAsig
  public Integer getNiveDelaAsig(){ return niveDelaAsig; } 
  public Integer getNiveDelaAsigNn(){ return setNotNull(niveDelaAsig); } 
  public String getNiveDelaAsigDesc(){ return setDesc(niveDelaAsig); } 
  public void setNiveDelaAsig(Integer value){ this.niveDelaAsig=value;} 
//-------------------------------------------| NumeCredCarg
  public Integer getNumeCredCarg(){ return numeCredCarg; } 
  public Integer getNumeCredCargNn(){ return setNotNull(numeCredCarg); } 
  public String getNumeCredCargDesc(){ return setDesc(numeCredCarg); } 
  public void setNumeCredCarg(Integer value){ this.numeCredCarg=value;} 
//-------------------------------------------| VeceCancAsig
  public Integer getVeceCancAsig(){ return veceCancAsig; } 
  public Integer getVeceCancAsigNn(){ return setNotNull(veceCancAsig); } 
  public String getVeceCancAsigDesc(){ return setDesc(veceCancAsig); } 
  public void setVeceCancAsig(Integer value){ this.veceCancAsig=value;} 
//-------------------------------------------| EstaCancMate
  public String getEstaCancMate(){ return estaCancMate; } 
  public String getEstaCancMateNn(){ return setNotNull(estaCancMate); } 
  public void setEstaCancMate(String value){ this.estaCancMate=value;} 
  public boolean getEstaCancMateBool() { return estaCancMate==null?false:estaCancMate.equals("S");}
  public void setEstaCancMateBool(boolean estaCancMate) { this.estaCancMate=estaCancMate?"S":"N";}
//-------------------------------------------| EstaAsigCarg
  public String getEstaAsigCarg(){ return estaAsigCarg; } 
  public String getEstaAsigCargNn(){ return setNotNull(estaAsigCarg); } 
  public String getEstaAsigCargDesc(){ return setDesc(estaAsigCarg); } 
  public void setEstaAsigCarg(String value){ this.estaAsigCarg=value;} 
// ---------------(RANGOS) 
  public String getDebeInscPeriDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getDebeInscPeriNn()); } 
  public String getEstaCancMateDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaCancMateNn()); } 

//---------------------(REL: FkeyPeriPlanDto) 
  public DEFVPeriPlanProgDto getFkeyPeriPlanDto() { return fkeyPeriPlanDto; } 
  public void setFkeyPeriPlanDto(DEFVPeriPlanProgDto fkeyPeriPlanDto) {
    if ( fkeyPeriPlanDto != null ) { 
      this.fkeyPeriPlan = fkeyPeriPlanDto.getPkeyPeriPlan(); 
    }
    this.fkeyPeriPlanDto = fkeyPeriPlanDto;
  } 
//---------------------(REL: FkeyAsigEstuDto) 
  public DEF_AsignaEstudiDto getFkeyAsigEstuDto() { return fkeyAsigEstuDto; } 
  public void setFkeyAsigEstuDto(DEF_AsignaEstudiDto fkeyAsigEstuDto) {
    if ( fkeyAsigEstuDto != null ) { 
      this.fkeyAsigEstu = fkeyAsigEstuDto.getPkeyAsigEstu(); 
    }
    this.fkeyAsigEstuDto = fkeyAsigEstuDto;
  } 
//---------------------(REL: FkeyPeriPlanDto) 
//  public DEF_PeriodPlanesDto getFkeyPeriPlanDto() { return fkeyPeriPlanDto; } 
//  public void setFkeyPeriPlanDto(DEF_PeriodPlanesDto fkeyPeriPlanDto) {
//    if ( fkeyPeriPlanDto != null ) { 
//      this.fkeyPeriPlan = fkeyPeriPlanDto.getPkeyPeriPlan(); 
//    }
//    this.fkeyPeriPlanDto = fkeyPeriPlanDto;
//  } 
//---------------------(REL: FkeyEstudianDto) 
  public ADS_EstudiUniverDto getFkeyEstudianDto() { return fkeyEstudianDto; } 
  public void setFkeyEstudianDto(ADS_EstudiUniverDto fkeyEstudianDto) {
    if ( fkeyEstudianDto != null ) { 
      this.fkeyEstudian = fkeyEstudianDto.getPkeyEstudian(); 
    }
    this.fkeyEstudianDto = fkeyEstudianDto;
  } 


  @Override 
  public CRG_Carga_AcademDto copy(){
    CRG_Carga_AcademDto result = new CRG_Carga_AcademDto();
    result.setPkeyCargAcad( this.getPkeyCargAcad()); 
    result.setFkeyAsigEstu( this.getFkeyAsigEstu()); 
    result.setFkeyGrupNive( this.getFkeyGrupNive()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setNumeVecePerd( this.getNumeVecePerd()); 
    result.setDebeInscPeri( this.getDebeInscPeri()); 
    result.setNiveDelaAsig( this.getNiveDelaAsig()); 
    result.setNumeCredCarg( this.getNumeCredCarg()); 
    result.setVeceCancAsig( this.getVeceCancAsig()); 
    result.setEstaCancMate( this.getEstaCancMate()); 
    result.setEstaAsigCarg( this.getEstaAsigCarg()); 
    result.setFkeyPeriPlanDto( this.getFkeyPeriPlanDto());
    result.setFkeyAsigEstuDto( this.getFkeyAsigEstuDto());
    result.setFkeyPeriPlanDto( this.getFkeyPeriPlanDto());
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    return result;
  }
}

