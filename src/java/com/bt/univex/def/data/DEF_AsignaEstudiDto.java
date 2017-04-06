package com.bt.univex.def.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.def.data.*;
import com.bt.univex.ads.data.* ;

public class DEF_AsignaEstudiDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});
  public static final List RANG_TipoAsig = Arrays.asList( new Range[] { 
      new Range("L","Laboratorio asociado"),
      new Range("M","Teórico - Práctica"),
      new Range("P","Práctica"),
      new Range("T","Teórica")});


  private Integer pkeyAsigEstu;
  private Integer fkeyFacuUniv;
  private String codiAsigEstu;
  private String nombAsigEstu;
  private String descAsigEstu;
  private String infoAdicMate;
  private Integer numeCredBase;
  private Integer numeCredPres;
  private String estaActiAsig;
  private String tipoPracAsig;
  private Integer fkeyProgAcad;

  private ADS_PrograAcademDto fkeyProgAcadDto;

  public DEF_AsignaEstudiDto() { 
     PkeyEnti = 7103;
     setAliasName("AsigEstu"); 
  } 

//-------------------------------------------| PkeyAsigEstu
  public Integer getPkeyAsigEstu(){ return pkeyAsigEstu; } 
  public Integer getPkeyAsigEstuNn(){ return setNotNull(pkeyAsigEstu); } 
  public String getPkeyAsigEstuDesc(){ return setDesc(pkeyAsigEstu); } 
  public void setPkeyAsigEstu(Integer value){ this.pkeyAsigEstu=value;} 
  @Override
  public int toInt(){ return getPkeyAsigEstuNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyAsigEstu; }; 
//-------------------------------------------| FkeyFacuUniv
  public Integer getFkeyFacuUniv(){ return fkeyFacuUniv; } 
  public Integer getFkeyFacuUnivNn(){ return setNotNull(fkeyFacuUniv); } 
  public String getFkeyFacuUnivDesc(){ return setDesc(fkeyFacuUniv); } 
  public void setFkeyFacuUniv(Integer value){ this.fkeyFacuUniv=value;} 
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
  @Override
  public String toString(){ return getNombAsigEstuNn()+" - "+getCodiAsigEstu(); }; 
//-------------------------------------------| DescAsigEstu
  public String getDescAsigEstu(){ return descAsigEstu; } 
  public String getDescAsigEstuNn(){ return setNotNull(descAsigEstu); } 
  public String getDescAsigEstuDesc(){ return setDesc(descAsigEstu); } 
  public void setDescAsigEstu(String value){ this.descAsigEstu=value;} 
//-------------------------------------------| InfoAdicMate
  public String getInfoAdicMate(){ return infoAdicMate; } 
  public String getInfoAdicMateNn(){ return setNotNull(infoAdicMate); } 
  public String getInfoAdicMateDesc(){ return setDesc(infoAdicMate); } 
  public void setInfoAdicMate(String value){ this.infoAdicMate=value;} 
//-------------------------------------------| NumeCredBase
  public Integer getNumeCredBase(){ return numeCredBase; } 
  public Integer getNumeCredBaseNn(){ return setNotNull(numeCredBase); } 
  public String getNumeCredBaseDesc(){ return setDesc(numeCredBase); } 
  public void setNumeCredBase(Integer value){ this.numeCredBase=value;} 
//-------------------------------------------| NumeCredPres
  public Integer getNumeCredPres(){ return numeCredPres; } 
  public Integer getNumeCredPresNn(){ return setNotNull(numeCredPres); } 
  public String getNumeCredPresDesc(){ return setDesc(numeCredPres); } 
  public void setNumeCredPres(Integer value){ this.numeCredPres=value;} 
//-------------------------------------------| EstaActiAsig
  public String getEstaActiAsig(){ return estaActiAsig; } 
  public String getEstaActiAsigNn(){ return setNotNull(estaActiAsig); } 
  public void setEstaActiAsig(String value){ this.estaActiAsig=value;} 
  public boolean getEstaActiAsigBool() { return estaActiAsig==null?false:estaActiAsig.equals("S");}
  public void setEstaActiAsigBool(boolean estaActiAsig) { this.estaActiAsig=estaActiAsig?"S":"N";}
//-------------------------------------------| TipoPracAsig
  public String getTipoPracAsig(){ return tipoPracAsig; } 
  public String getTipoPracAsigNn(){ return setNotNull(tipoPracAsig); } 
  public void setTipoPracAsig(String value){ this.tipoPracAsig=value;} 
//-------------------------------------------| FkeyProgAcad
  public Integer getFkeyProgAcad(){ return fkeyProgAcad; } 
  public Integer getFkeyProgAcadNn(){ return setNotNull(fkeyProgAcad); } 
  public String getFkeyProgAcadDesc(){ return setDesc(fkeyProgAcad); } 
  public void setFkeyProgAcad(Integer value){ this.fkeyProgAcad=value;} 
// ---------------(RANGOS) 
  public String getEstaActiAsigDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaActiAsigNn()); } 
  public String getTipoPracAsigDesc() { return DtoMisc.getRangeDesc(RANG_TipoAsig,getTipoPracAsigNn()); } 

//---------------------(REL: FkeyProgAcadDto) 
  public ADS_PrograAcademDto getFkeyProgAcadDto() { return fkeyProgAcadDto; } 
  public void setFkeyProgAcadDto(ADS_PrograAcademDto fkeyProgAcadDto) {
    if ( fkeyProgAcadDto != null ) { 
      this.fkeyProgAcad = fkeyProgAcadDto.getPkeyProgAcad(); 
    }
    this.fkeyProgAcadDto = fkeyProgAcadDto;
  } 


  @Override 
  public DEF_AsignaEstudiDto copy(){
    DEF_AsignaEstudiDto result = new DEF_AsignaEstudiDto();
    result.setPkeyAsigEstu( this.getPkeyAsigEstu()); 
    result.setFkeyFacuUniv( this.getFkeyFacuUniv()); 
    result.setCodiAsigEstu( this.getCodiAsigEstu()); 
    result.setNombAsigEstu( this.getNombAsigEstu()); 
    result.setDescAsigEstu( this.getDescAsigEstu()); 
    result.setInfoAdicMate( this.getInfoAdicMate()); 
    result.setNumeCredBase( this.getNumeCredBase()); 
    result.setNumeCredPres( this.getNumeCredPres()); 
    result.setEstaActiAsig( this.getEstaActiAsig()); 
    result.setTipoPracAsig( this.getTipoPracAsig()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setFkeyProgAcadDto( this.getFkeyProgAcadDto());
    return result;
  }
}

