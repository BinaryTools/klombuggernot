package com.bt.univex.ads.data;

import com.bt.univex.def.data.DEF_NuclBasiConoDto;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;

public class ADS_PrograAcademDto extends BaseDto {
  public static final List RANG_TipoCompProg = Arrays.asList( new Range[] { 
      new Range("A","Ambos"),
      new Range("P","Programa Académico"),
      new Range("U","Unidad Académica")});
  public static final List RANG_Jorn = Arrays.asList( new Range[] { 
      new Range("A","A Mañana o Tarde o Noche"),
      new Range("C","C Tarde o Noche"),
      new Range("D","Diurna (Mañana y Tarde)"),
      new Range("F","F Tarde o Noche o Fin de Semana"),
      new Range("N","Nocturna"),
      new Range("R","R Mañana o Noche"),
      new Range("S","S Mañana o Tarde"),
      new Range("X","Fin de semana"),
      new Range("Z","Sin jornada especifica")});
  public static final List RANG_TipoPeri = Arrays.asList( new Range[] { 
      new Range("A","Anual"),
      new Range("B","Bimestral"),
      new Range("C","Cuatrimestre"),
      new Range("M","Mensual"),
      new Range("S","Semestral"),
      new Range("T","Trimestral")});
  public static final List RANG_TipoCubr = Arrays.asList( new Range[] { 
      new Range("1"," Directo Principal"),
      new Range("2","Directo Seccional"),
      new Range("3","Directo a Distancia"),
      new Range("4","Indirecto en convenio con IES"),
      new Range("5","Indirecto en convenio con CERES"),
      new Range("6","Indirecto a distancia"),
      new Range("7","Contrato Alcaldia"),
      new Range("8","Contrato Gobernacion")});


  private Integer pkeyProgAcad;
  private Integer fkeyModaEstu;
  private Integer fkeyNiveEstu;
  private Integer fkeyFacuUniv;
  private Integer codiProgAcad;
  private String nombProgAcad;
  private String abreProgAcad;
  private String codiAproIcfe;
  private String resoAproIcfe;
  private Integer duraProgNive;
  private Integer credTotaProg;
  private String codiAbreProg;
  private String tituOtorProg;
  private Date fechAcueProg;
  private Integer numeAcueProg;
  private String tipoCompProg;
  private String estaActiProg;
  private String progJornada_;
  private String consCodiProg;
  private Date fechAproIcfe;
  private String modiAproIcfe;
  private String estaAcreProg;
  private String numeAcreProg;
  private Date fechAcreProg;
  private Integer duraAcreProg;
  private String tienRegiCali;
  private String numeRegiCali;
  private Date fechRegiCali;
  private Integer duraRegiCali;
  private String estaAcreInte;
  private String descAcreInte;
  private String entiAcreInte;
  private String url_Programa;
  private String url_Aspirant;
  private String url_PerfProf;
  private String peridiProgra;
  private String tipoCubrProg;
  private String tienCiclProp;
  private Integer fkeyNuclPrim;
  private Integer fkeyNuclSecu;
  private String descripcion;
  private String codiCentCost;
  private Integer fkeyNiveForm;

  private DEF_NuclBasiConoDto fkeyNuclPrimDto;
//  private DEFVNuclBasiConoDto fkeyNuclSecuDto;
  private ADS_ModaliEstudiDto fkeyModaEstuDto;
  private ADS_Nivel_EstudiDto fkeyNiveEstuDto;
  private ADS_FacultUniverDto fkeyFacuUnivDto;

  public ADS_PrograAcademDto() { 
     PkeyEnti = 5503;
     setAliasName("ProgAcad"); 
  } 

//-------------------------------------------| PkeyProgAcad
  public Integer getPkeyProgAcad(){ return pkeyProgAcad; } 
  public Integer getPkeyProgAcadNn(){ return setNotNull(pkeyProgAcad); } 
  public String getPkeyProgAcadDesc(){ return setDesc(pkeyProgAcad); } 
  public void setPkeyProgAcad(Integer value){ this.pkeyProgAcad=value;} 
  @Override
  public int toInt(){ return getPkeyProgAcadNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyProgAcad; }; 
//-------------------------------------------| FkeyModaEstu
  public Integer getFkeyModaEstu(){ return fkeyModaEstu; } 
  public Integer getFkeyModaEstuNn(){ return setNotNull(fkeyModaEstu); } 
  public String getFkeyModaEstuDesc(){ return setDesc(fkeyModaEstu); } 
  public void setFkeyModaEstu(Integer value){ this.fkeyModaEstu=value;} 
//-------------------------------------------| FkeyNiveEstu
  public Integer getFkeyNiveEstu(){ return fkeyNiveEstu; } 
  public Integer getFkeyNiveEstuNn(){ return setNotNull(fkeyNiveEstu); } 
  public String getFkeyNiveEstuDesc(){ return setDesc(fkeyNiveEstu); } 
  public void setFkeyNiveEstu(Integer value){ this.fkeyNiveEstu=value;} 
//-------------------------------------------| FkeyFacuUniv
  public Integer getFkeyFacuUniv(){ return fkeyFacuUniv; } 
  public Integer getFkeyFacuUnivNn(){ return setNotNull(fkeyFacuUniv); } 
  public String getFkeyFacuUnivDesc(){ return setDesc(fkeyFacuUniv); } 
  public void setFkeyFacuUniv(Integer value){ this.fkeyFacuUniv=value;} 
//-------------------------------------------| CodiProgAcad
  public Integer getCodiProgAcad(){ return codiProgAcad; } 
  public Integer getCodiProgAcadNn(){ return setNotNull(codiProgAcad); } 
  public String getCodiProgAcadDesc(){ return setDesc(codiProgAcad); } 
  public void setCodiProgAcad(Integer value){ this.codiProgAcad=value;} 
//-------------------------------------------| NombProgAcad
  public String getNombProgAcad(){ return nombProgAcad; } 
  public String getNombProgAcadNn(){ return setNotNull(nombProgAcad); } 
  public String getNombProgAcadDesc(){ return setDesc(nombProgAcad); } 
  public void setNombProgAcad(String value){ this.nombProgAcad=value;} 
  @Override
  public String toString(){ return getNombProgAcadNn(); }; 
//-------------------------------------------| AbreProgAcad
  public String getAbreProgAcad(){ return abreProgAcad; } 
  public String getAbreProgAcadNn(){ return setNotNull(abreProgAcad); } 
  public String getAbreProgAcadDesc(){ return setDesc(abreProgAcad); } 
  public void setAbreProgAcad(String value){ this.abreProgAcad=value;} 
//-------------------------------------------| CodiAproIcfe
  public String getCodiAproIcfe(){ return codiAproIcfe; } 
  public String getCodiAproIcfeNn(){ return setNotNull(codiAproIcfe); } 
  public String getCodiAproIcfeDesc(){ return setDesc(codiAproIcfe); } 
  public void setCodiAproIcfe(String value){ this.codiAproIcfe=value;} 
//-------------------------------------------| ResoAproIcfe
  public String getResoAproIcfe(){ return resoAproIcfe; } 
  public String getResoAproIcfeNn(){ return setNotNull(resoAproIcfe); } 
  public String getResoAproIcfeDesc(){ return setDesc(resoAproIcfe); } 
  public void setResoAproIcfe(String value){ this.resoAproIcfe=value;} 
//-------------------------------------------| DuraProgNive
  public Integer getDuraProgNive(){ return duraProgNive; } 
  public Integer getDuraProgNiveNn(){ return setNotNull(duraProgNive); } 
  public String getDuraProgNiveDesc(){ return setDesc(duraProgNive); } 
  public void setDuraProgNive(Integer value){ this.duraProgNive=value;} 
//-------------------------------------------| CredTotaProg
  public Integer getCredTotaProg(){ return credTotaProg; } 
  public Integer getCredTotaProgNn(){ return setNotNull(credTotaProg); } 
  public String getCredTotaProgDesc(){ return setDesc(credTotaProg); } 
  public void setCredTotaProg(Integer value){ this.credTotaProg=value;} 
//-------------------------------------------| CodiAbreProg
  public String getCodiAbreProg(){ return codiAbreProg; } 
  public String getCodiAbreProgNn(){ return setNotNull(codiAbreProg); } 
  public String getCodiAbreProgDesc(){ return setDesc(codiAbreProg); } 
  public void setCodiAbreProg(String value){ this.codiAbreProg=value;} 
//-------------------------------------------| TituOtorProg
  public String getTituOtorProg(){ return tituOtorProg; } 
  public String getTituOtorProgNn(){ return setNotNull(tituOtorProg); } 
  public String getTituOtorProgDesc(){ return setDesc(tituOtorProg); } 
  public void setTituOtorProg(String value){ this.tituOtorProg=value;} 
//-------------------------------------------| FechAcueProg
  public Date getFechAcueProg(){ return fechAcueProg; } 
  public Date getFechAcueProgNn(){ return setNotNull(fechAcueProg); } 
  public String getFechAcueProgDesc(){ return setDesc(fechAcueProg); } 
  public void setFechAcueProg(Date value){ this.fechAcueProg=value;} 
//-------------------------------------------| NumeAcueProg
  public Integer getNumeAcueProg(){ return numeAcueProg; } 
  public Integer getNumeAcueProgNn(){ return setNotNull(numeAcueProg); } 
  public String getNumeAcueProgDesc(){ return setDesc(numeAcueProg); } 
  public void setNumeAcueProg(Integer value){ this.numeAcueProg=value;} 
//-------------------------------------------| TipoCompProg
  public String getTipoCompProg(){ return tipoCompProg; } 
  public String getTipoCompProgNn(){ return setNotNull(tipoCompProg); } 
  public void setTipoCompProg(String value){ this.tipoCompProg=value;} 
//-------------------------------------------| EstaActiProg
  public String getEstaActiProg(){ return estaActiProg; } 
  public String getEstaActiProgNn(){ return setNotNull(estaActiProg); } 
  public String getEstaActiProgDesc(){ return setDesc(estaActiProg); } 
  public void setEstaActiProg(String value){ this.estaActiProg=value;} 
  public boolean getEstaActiProgBool() { return estaActiProg==null?false:estaActiProg.equals("S");}
  public void setEstaActiProgBool(boolean estaActiProg) { this.estaActiProg=estaActiProg?"S":"N";}
//-------------------------------------------| ProgJornada_
  public String getProgJornada_(){ return progJornada_; } 
  public String getProgJornada_Nn(){ return setNotNull(progJornada_); } 
  public void setProgJornada_(String value){ this.progJornada_=value;} 
//-------------------------------------------| ConsCodiProg
  public String getConsCodiProg(){ return consCodiProg; } 
  public String getConsCodiProgNn(){ return setNotNull(consCodiProg); } 
  public String getConsCodiProgDesc(){ return setDesc(consCodiProg); } 
  public void setConsCodiProg(String value){ this.consCodiProg=value;} 
//-------------------------------------------| FechAproIcfe
  public Date getFechAproIcfe(){ return fechAproIcfe; } 
  public Date getFechAproIcfeNn(){ return setNotNull(fechAproIcfe); } 
  public String getFechAproIcfeDesc(){ return setDesc(fechAproIcfe); } 
  public void setFechAproIcfe(Date value){ this.fechAproIcfe=value;} 
//-------------------------------------------| ModiAproIcfe
  public String getModiAproIcfe(){ return modiAproIcfe; } 
  public String getModiAproIcfeNn(){ return setNotNull(modiAproIcfe); } 
  public String getModiAproIcfeDesc(){ return setDesc(modiAproIcfe); } 
  public void setModiAproIcfe(String value){ this.modiAproIcfe=value;} 
//-------------------------------------------| EstaAcreProg
  public String getEstaAcreProg(){ return estaAcreProg; } 
  public String getEstaAcreProgNn(){ return setNotNull(estaAcreProg); } 
  public String getEstaAcreProgDesc(){ return setDesc(estaAcreProg); } 
  public void setEstaAcreProg(String value){ this.estaAcreProg=value;} 
  public boolean getEstaAcreProgBool() { return estaAcreProg==null?false:estaAcreProg.equals("S");}
  public void setEstaAcreProgBool(boolean estaAcreProg) { this.estaAcreProg=estaAcreProg?"S":"N";}
//-------------------------------------------| NumeAcreProg
  public String getNumeAcreProg(){ return numeAcreProg; } 
  public String getNumeAcreProgNn(){ return setNotNull(numeAcreProg); } 
  public String getNumeAcreProgDesc(){ return setDesc(numeAcreProg); } 
  public void setNumeAcreProg(String value){ this.numeAcreProg=value;} 
//-------------------------------------------| FechAcreProg
  public Date getFechAcreProg(){ return fechAcreProg; } 
  public Date getFechAcreProgNn(){ return setNotNull(fechAcreProg); } 
  public String getFechAcreProgDesc(){ return setDesc(fechAcreProg); } 
  public void setFechAcreProg(Date value){ this.fechAcreProg=value;} 
//-------------------------------------------| DuraAcreProg
  public Integer getDuraAcreProg(){ return duraAcreProg; } 
  public Integer getDuraAcreProgNn(){ return setNotNull(duraAcreProg); } 
  public String getDuraAcreProgDesc(){ return setDesc(duraAcreProg); } 
  public void setDuraAcreProg(Integer value){ this.duraAcreProg=value;} 
//-------------------------------------------| TienRegiCali
  public String getTienRegiCali(){ return tienRegiCali; } 
  public String getTienRegiCaliNn(){ return setNotNull(tienRegiCali); } 
  public String getTienRegiCaliDesc(){ return setDesc(tienRegiCali); } 
  public void setTienRegiCali(String value){ this.tienRegiCali=value;} 
  public boolean getTienRegiCaliBool() { return tienRegiCali==null?false:tienRegiCali.equals("S");}
  public void setTienRegiCaliBool(boolean tienRegiCali) { this.tienRegiCali=tienRegiCali?"S":"N";}
//-------------------------------------------| NumeRegiCali
  public String getNumeRegiCali(){ return numeRegiCali; } 
  public String getNumeRegiCaliNn(){ return setNotNull(numeRegiCali); } 
  public String getNumeRegiCaliDesc(){ return setDesc(numeRegiCali); } 
  public void setNumeRegiCali(String value){ this.numeRegiCali=value;} 
//-------------------------------------------| FechRegiCali
  public Date getFechRegiCali(){ return fechRegiCali; } 
  public Date getFechRegiCaliNn(){ return setNotNull(fechRegiCali); } 
  public String getFechRegiCaliDesc(){ return setDesc(fechRegiCali); } 
  public void setFechRegiCali(Date value){ this.fechRegiCali=value;} 
//-------------------------------------------| DuraRegiCali
  public Integer getDuraRegiCali(){ return duraRegiCali; } 
  public Integer getDuraRegiCaliNn(){ return setNotNull(duraRegiCali); } 
  public String getDuraRegiCaliDesc(){ return setDesc(duraRegiCali); } 
  public void setDuraRegiCali(Integer value){ this.duraRegiCali=value;} 
//-------------------------------------------| EstaAcreInte
  public String getEstaAcreInte(){ return estaAcreInte; } 
  public String getEstaAcreInteNn(){ return setNotNull(estaAcreInte); } 
  public String getEstaAcreInteDesc(){ return setDesc(estaAcreInte); } 
  public void setEstaAcreInte(String value){ this.estaAcreInte=value;} 
  public boolean getEstaAcreInteBool() { return estaAcreInte==null?false:estaAcreInte.equals("S");}
  public void setEstaAcreInteBool(boolean estaAcreInte) { this.estaAcreInte=estaAcreInte?"S":"N";}
//-------------------------------------------| DescAcreInte
  public String getDescAcreInte(){ return descAcreInte; } 
  public String getDescAcreInteNn(){ return setNotNull(descAcreInte); } 
  public String getDescAcreInteDesc(){ return setDesc(descAcreInte); } 
  public void setDescAcreInte(String value){ this.descAcreInte=value;} 
//-------------------------------------------| EntiAcreInte
  public String getEntiAcreInte(){ return entiAcreInte; } 
  public String getEntiAcreInteNn(){ return setNotNull(entiAcreInte); } 
  public String getEntiAcreInteDesc(){ return setDesc(entiAcreInte); } 
  public void setEntiAcreInte(String value){ this.entiAcreInte=value;} 
//-------------------------------------------| Url_Programa
  public String getUrl_Programa(){ return url_Programa; } 
  public String getUrl_ProgramaNn(){ return setNotNull(url_Programa); } 
  public String getUrl_ProgramaDesc(){ return setDesc(url_Programa); } 
  public void setUrl_Programa(String value){ this.url_Programa=value;} 
//-------------------------------------------| Url_Aspirant
  public String getUrl_Aspirant(){ return url_Aspirant; } 
  public String getUrl_AspirantNn(){ return setNotNull(url_Aspirant); } 
  public String getUrl_AspirantDesc(){ return setDesc(url_Aspirant); } 
  public void setUrl_Aspirant(String value){ this.url_Aspirant=value;} 
//-------------------------------------------| Url_PerfProf
  public String getUrl_PerfProf(){ return url_PerfProf; } 
  public String getUrl_PerfProfNn(){ return setNotNull(url_PerfProf); } 
  public String getUrl_PerfProfDesc(){ return setDesc(url_PerfProf); } 
  public void setUrl_PerfProf(String value){ this.url_PerfProf=value;} 
//-------------------------------------------| PeridiProgra
  public String getPeridiProgra(){ return peridiProgra; } 
  public String getPeridiPrograNn(){ return setNotNull(peridiProgra); } 
  public void setPeridiProgra(String value){ this.peridiProgra=value;} 
//-------------------------------------------| TipoCubrProg
  public String getTipoCubrProg(){ return tipoCubrProg; } 
  public String getTipoCubrProgNn(){ return setNotNull(tipoCubrProg); } 
  public void setTipoCubrProg(String value){ this.tipoCubrProg=value;} 
//-------------------------------------------| TienCiclProp
  public String getTienCiclProp(){ return tienCiclProp; } 
  public String getTienCiclPropNn(){ return setNotNull(tienCiclProp); } 
  public String getTienCiclPropDesc(){ return setDesc(tienCiclProp); } 
  public void setTienCiclProp(String value){ this.tienCiclProp=value;} 
  public boolean getTienCiclPropBool() { return tienCiclProp==null?false:tienCiclProp.equals("S");}
  public void setTienCiclPropBool(boolean tienCiclProp) { this.tienCiclProp=tienCiclProp?"S":"N";}
//-------------------------------------------| FkeyNuclPrim
  public Integer getFkeyNuclPrim(){ return fkeyNuclPrim; } 
  public Integer getFkeyNuclPrimNn(){ return setNotNull(fkeyNuclPrim); } 
  public String getFkeyNuclPrimDesc(){ return setDesc(fkeyNuclPrim); } 
  public void setFkeyNuclPrim(Integer value){ this.fkeyNuclPrim=value;} 
//-------------------------------------------| FkeyNuclSecu
  public Integer getFkeyNuclSecu(){ return fkeyNuclSecu; } 
  public Integer getFkeyNuclSecuNn(){ return setNotNull(fkeyNuclSecu); } 
  public String getFkeyNuclSecuDesc(){ return setDesc(fkeyNuclSecu); } 
  public void setFkeyNuclSecu(Integer value){ this.fkeyNuclSecu=value;} 
//-------------------------------------------| Descripcion
  public String getDescripcion(){ return descripcion; } 
  public String getDescripcionNn(){ return setNotNull(descripcion); } 
  public String getDescripcionDesc(){ return setDesc(descripcion); } 
  public void setDescripcion(String value){ this.descripcion=value;} 
//-------------------------------------------| CodiCentCost
  public String getCodiCentCost(){ return codiCentCost; } 
  public String getCodiCentCostNn(){ return setNotNull(codiCentCost); } 
  public String getCodiCentCostDesc(){ return setDesc(codiCentCost); } 
  public void setCodiCentCost(String value){ this.codiCentCost=value;} 
//-------------------------------------------| FkeyNiveForm
  public Integer getFkeyNiveForm(){ return fkeyNiveForm; } 
  public Integer getFkeyNiveFormNn(){ return setNotNull(fkeyNiveForm); } 
  public String getFkeyNiveFormDesc(){ return setDesc(fkeyNiveForm); } 
  public void setFkeyNiveForm(Integer value){ this.fkeyNiveForm=value;} 
// ---------------(RANGOS) 
  public String getTipoCompProgDesc() { return DtoMisc.getRangeDesc(RANG_TipoCompProg,getTipoCompProgNn()); } 
  public String getProgJornada_Desc() { return DtoMisc.getRangeDesc(RANG_Jorn,getProgJornada_Nn()); } 
  public String getPeridiPrograDesc() { return DtoMisc.getRangeDesc(RANG_TipoPeri,getPeridiPrograNn()); } 
  public String getTipoCubrProgDesc() { return DtoMisc.getRangeDesc(RANG_TipoCubr,getTipoCubrProgNn()); } 

//---------------------(REL: FkeyNuclPrimDto) 
  public DEF_NuclBasiConoDto getFkeyNuclPrimDto() { return fkeyNuclPrimDto; } 
  public void setFkeyNuclPrimDto(DEF_NuclBasiConoDto fkeyNuclPrimDto) {
    if ( fkeyNuclPrimDto != null ) { 
      this.fkeyNuclPrim = fkeyNuclPrimDto.getPkeyNuclBasi(); 
    }
    this.fkeyNuclPrimDto = fkeyNuclPrimDto;
  } 
//---------------------(REL: FkeyNuclSecuDto) 
//  public DEFVNuclBasiConoDto getFkeyNuclSecuDto() { return fkeyNuclSecuDto; } 
//  public void setFkeyNuclSecuDto(DEFVNuclBasiConoDto fkeyNuclSecuDto) {
//    if ( fkeyNuclSecuDto != null ) { 
//      this.fkeyNuclSecu = fkeyNuclSecuDto.getPkeyNuclBasi(); 
//    }
//    this.fkeyNuclSecuDto = fkeyNuclSecuDto;
//  } 
//---------------------(REL: FkeyModaEstuDto) 
  public ADS_ModaliEstudiDto getFkeyModaEstuDto() { return fkeyModaEstuDto; } 
  public void setFkeyModaEstuDto(ADS_ModaliEstudiDto fkeyModaEstuDto) {
    if ( fkeyModaEstuDto != null ) { 
      this.fkeyModaEstu = fkeyModaEstuDto.getPkeyModaEstu(); 
    }
    this.fkeyModaEstuDto = fkeyModaEstuDto;
  } 
//---------------------(REL: FkeyNiveEstuDto) 
  public ADS_Nivel_EstudiDto getFkeyNiveEstuDto() { return fkeyNiveEstuDto; } 
  public void setFkeyNiveEstuDto(ADS_Nivel_EstudiDto fkeyNiveEstuDto) {
    if ( fkeyNiveEstuDto != null ) { 
      this.fkeyNiveEstu = fkeyNiveEstuDto.getPkeyNiveEstu(); 
    }
    this.fkeyNiveEstuDto = fkeyNiveEstuDto;
  } 
//---------------------(REL: FkeyFacuUnivDto) 
  public ADS_FacultUniverDto getFkeyFacuUnivDto() { return fkeyFacuUnivDto; } 
  public void setFkeyFacuUnivDto(ADS_FacultUniverDto fkeyFacuUnivDto) {
    if ( fkeyFacuUnivDto != null ) { 
      this.fkeyFacuUniv = fkeyFacuUnivDto.getPkeyFacuUniv(); 
    }
    this.fkeyFacuUnivDto = fkeyFacuUnivDto;
  } 


  @Override 
  public ADS_PrograAcademDto copy(){
    ADS_PrograAcademDto result = new ADS_PrograAcademDto();
    result.setPkeyProgAcad( this.getPkeyProgAcad()); 
    result.setFkeyModaEstu( this.getFkeyModaEstu()); 
    result.setFkeyNiveEstu( this.getFkeyNiveEstu()); 
    result.setFkeyFacuUniv( this.getFkeyFacuUniv()); 
    result.setCodiProgAcad( this.getCodiProgAcad()); 
    result.setNombProgAcad( this.getNombProgAcad()); 
    result.setAbreProgAcad( this.getAbreProgAcad()); 
    result.setCodiAproIcfe( this.getCodiAproIcfe()); 
    result.setResoAproIcfe( this.getResoAproIcfe()); 
    result.setDuraProgNive( this.getDuraProgNive()); 
    result.setCredTotaProg( this.getCredTotaProg()); 
    result.setCodiAbreProg( this.getCodiAbreProg()); 
    result.setTituOtorProg( this.getTituOtorProg()); 
    result.setFechAcueProg( this.getFechAcueProg()); 
    result.setNumeAcueProg( this.getNumeAcueProg()); 
    result.setTipoCompProg( this.getTipoCompProg()); 
    result.setEstaActiProg( this.getEstaActiProg()); 
    result.setProgJornada_( this.getProgJornada_()); 
    result.setConsCodiProg( this.getConsCodiProg()); 
    result.setFechAproIcfe( this.getFechAproIcfe()); 
    result.setModiAproIcfe( this.getModiAproIcfe()); 
    result.setEstaAcreProg( this.getEstaAcreProg()); 
    result.setNumeAcreProg( this.getNumeAcreProg()); 
    result.setFechAcreProg( this.getFechAcreProg()); 
    result.setDuraAcreProg( this.getDuraAcreProg()); 
    result.setTienRegiCali( this.getTienRegiCali()); 
    result.setNumeRegiCali( this.getNumeRegiCali()); 
    result.setFechRegiCali( this.getFechRegiCali()); 
    result.setDuraRegiCali( this.getDuraRegiCali()); 
    result.setEstaAcreInte( this.getEstaAcreInte()); 
    result.setDescAcreInte( this.getDescAcreInte()); 
    result.setEntiAcreInte( this.getEntiAcreInte()); 
    result.setUrl_Programa( this.getUrl_Programa()); 
    result.setUrl_Aspirant( this.getUrl_Aspirant()); 
    result.setUrl_PerfProf( this.getUrl_PerfProf()); 
    result.setPeridiProgra( this.getPeridiProgra()); 
    result.setTipoCubrProg( this.getTipoCubrProg()); 
    result.setTienCiclProp( this.getTienCiclProp()); 
    result.setFkeyNuclPrim( this.getFkeyNuclPrim()); 
    result.setFkeyNuclSecu( this.getFkeyNuclSecu()); 
    result.setDescripcion( this.getDescripcion()); 
    result.setCodiCentCost( this.getCodiCentCost()); 
    result.setFkeyNiveForm( this.getFkeyNiveForm()); 
    result.setFkeyNuclPrimDto( this.getFkeyNuclPrimDto());
//    result.setFkeyNuclSecuDto( this.getFkeyNuclSecuDto());
    result.setFkeyModaEstuDto( this.getFkeyModaEstuDto());
    result.setFkeyNiveEstuDto( this.getFkeyNiveEstuDto());
    result.setFkeyFacuUnivDto( this.getFkeyFacuUnivDto());
    return result;
  }
}

