 package com.bt.univex.crg.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.crg.data.*;
import com.bt.univex.def.data.* ;
import com.bt.univex.ads.data.* ;

public class CRGACarga_AcademDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});
  public static final List RANG_TipOngUni = Arrays.asList( new Range[] { 
      new Range("I","Transferencia interna"),
      new Range("M","Reingreso ESMIC"),
      new Range("N","Nuevo"),
      new Range("O","Segunda opción"),
      new Range("R","Reingreso"),
      new Range("S","Segundo ciclo"),
      new Range("T","Transferencia externa")});
//  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
//      new Range("N","No"),
//      new Range("S","Sí")});
 

  private Integer pkeyCargAcad;
  private Integer fkeyAsigEstu;
  private Integer fkeyGrupNive;
  private Integer fkeyPeriPlan;
  private Integer fkeyGrupAsig;
  private String codiEstudian;
  private Integer fkeyEstudian;
  private String estaActiEstu;
  private Integer numeVecePerd;
  private String debeInscPeri;
  private String nombEstudian;
  private Integer niveDelaAsig;
  private String apelEstudian;
  private String seguApelEstu;
  private Integer numeCredCarg;
  private Integer veceCancAsig;
  private String tipoIngrEstu;
  private String estaCancMate;
  private String estaAsigCarg;
  private String descripcion;
  private String descGrupAsig;

  private DEF_AsignaEstudiDto fkeyAsigEstuDto;
  private ADS_EstudiUniverDto fkeyEstudianDto;

  public CRGACarga_AcademDto() { 
     PkeyEnti = 44603;
     setAliasName("CargAsig"); 
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
//-------------------------------------------| CodiEstudian
  public String getCodiEstudian(){ return codiEstudian; } 
  public String getCodiEstudianNn(){ return setNotNull(codiEstudian); } 
  public String getCodiEstudianDesc(){ return setDesc(codiEstudian); } 
  public void setCodiEstudian(String value){ this.codiEstudian=value;} 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| EstaActiEstu
  public String getEstaActiEstu(){ return estaActiEstu; } 
  public String getEstaActiEstuNn(){ return setNotNull(estaActiEstu); } 
  public void setEstaActiEstu(String value){ this.estaActiEstu=value;} 
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
//-------------------------------------------| NombEstudian
  public String getNombEstudian(){ return nombEstudian; } 
  public String getNombEstudianNn(){ return setNotNull(nombEstudian); } 
  public String getNombEstudianDesc(){ return setDesc(nombEstudian); } 
  public void setNombEstudian(String value){ this.nombEstudian=value;} 
//-------------------------------------------| NiveDelaAsig
  public Integer getNiveDelaAsig(){ return niveDelaAsig; } 
  public Integer getNiveDelaAsigNn(){ return setNotNull(niveDelaAsig); } 
  public String getNiveDelaAsigDesc(){ return setDesc(niveDelaAsig); } 
  public void setNiveDelaAsig(Integer value){ this.niveDelaAsig=value;} 
//-------------------------------------------| ApelEstudian
  public String getApelEstudian(){ return apelEstudian; } 
  public String getApelEstudianNn(){ return setNotNull(apelEstudian); } 
  public String getApelEstudianDesc(){ return setDesc(apelEstudian); } 
  public void setApelEstudian(String value){ this.apelEstudian=value;} 
//-------------------------------------------| SeguApelEstu
  public String getSeguApelEstu(){ return seguApelEstu; } 
  public String getSeguApelEstuNn(){ return setNotNull(seguApelEstu); } 
  public String getSeguApelEstuDesc(){ return setDesc(seguApelEstu); } 
  public void setSeguApelEstu(String value){ this.seguApelEstu=value;} 
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
//-------------------------------------------| TipoIngrEstu
  public String getTipoIngrEstu(){ return tipoIngrEstu; } 
  public String getTipoIngrEstuNn(){ return setNotNull(tipoIngrEstu); } 
  public void setTipoIngrEstu(String value){ this.tipoIngrEstu=value;} 
//-------------------------------------------| EstaCancMate
  public String getEstaCancMate(){ return estaCancMate; } 
  public String getEstaCancMateNn(){ return setNotNull(estaCancMate); } 
  public void setEstaCancMate(String value){ this.estaCancMate=value;} 
//-------------------------------------------| EstaAsigCarg
  public String getEstaAsigCarg(){ return estaAsigCarg; } 
  public String getEstaAsigCargNn(){ return setNotNull(estaAsigCarg); } 
  public String getEstaAsigCargDesc(){ return setDesc(estaAsigCarg); } 
  public void setEstaAsigCarg(String value){ this.estaAsigCarg=value;} 
//-------------------------------------------| Descripcion
  public String getDescripcion(){ return descripcion; } 
  public String getDescripcionNn(){ return setNotNull(descripcion); } 
  public String getDescripcionDesc(){ return setDesc(descripcion); } 
  public void setDescripcion(String value){ this.descripcion=value;} 
//-------------------------------------------| DescGrupAsig
  public String getDescGrupAsig(){ return descGrupAsig; } 
  public String getDescGrupAsigNn(){ return setNotNull(descGrupAsig); } 
  public String getDescGrupAsigDesc(){ return setDesc(descGrupAsig); } 
  public void setDescGrupAsig(String value){ this.descGrupAsig=value;} 
// ---------------(RANGOS) 
  public String getEstaActiEstuDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaActiEstuNn()); } 
  public String getDebeInscPeriDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getDebeInscPeriNn()); } 
  public String getTipoIngrEstuDesc() { return DtoMisc.getRangeDesc(RANG_TipOngUni,getTipoIngrEstuNn()); } 
  public String getEstaCancMateDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaCancMateNn()); } 

//---------------------(REL: FkeyAsigEstuDto) 
  public DEF_AsignaEstudiDto getFkeyAsigEstuDto() { return fkeyAsigEstuDto; } 
  public void setFkeyAsigEstuDto(DEF_AsignaEstudiDto fkeyAsigEstuDto) {
    if ( fkeyAsigEstuDto != null ) { 
      this.fkeyAsigEstu = fkeyAsigEstuDto.getPkeyAsigEstu(); 
    }
    this.fkeyAsigEstuDto = fkeyAsigEstuDto;
  } 
//---------------------(REL: FkeyEstudianDto) 
  public ADS_EstudiUniverDto getFkeyEstudianDto() { return fkeyEstudianDto; } 
  public void setFkeyEstudianDto(ADS_EstudiUniverDto fkeyEstudianDto) {
    if ( fkeyEstudianDto != null ) { 
      this.fkeyEstudian = fkeyEstudianDto.getPkeyEstudian(); 
    }
    this.fkeyEstudianDto = fkeyEstudianDto;
  } 


  @Override 
  public CRGACarga_AcademDto copy(){
    CRGACarga_AcademDto result = new CRGACarga_AcademDto();
    result.setPkeyCargAcad( this.getPkeyCargAcad()); 
    result.setFkeyAsigEstu( this.getFkeyAsigEstu()); 
    result.setFkeyGrupNive( this.getFkeyGrupNive()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setCodiEstudian( this.getCodiEstudian()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setEstaActiEstu( this.getEstaActiEstu()); 
    result.setNumeVecePerd( this.getNumeVecePerd()); 
    result.setDebeInscPeri( this.getDebeInscPeri()); 
    result.setNombEstudian( this.getNombEstudian()); 
    result.setNiveDelaAsig( this.getNiveDelaAsig()); 
    result.setApelEstudian( this.getApelEstudian()); 
    result.setSeguApelEstu( this.getSeguApelEstu()); 
    result.setNumeCredCarg( this.getNumeCredCarg()); 
    result.setVeceCancAsig( this.getVeceCancAsig()); 
    result.setTipoIngrEstu( this.getTipoIngrEstu()); 
    result.setEstaCancMate( this.getEstaCancMate()); 
    result.setEstaAsigCarg( this.getEstaAsigCarg()); 
    result.setDescripcion( this.getDescripcion()); 
    result.setDescGrupAsig( this.getDescGrupAsig()); 
    result.setFkeyAsigEstuDto( this.getFkeyAsigEstuDto());
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    return result;
  }
}

