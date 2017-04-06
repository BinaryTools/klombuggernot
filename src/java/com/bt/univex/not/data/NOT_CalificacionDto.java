package com.bt.univex.not.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.not.data.*;
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;

public class NOT_CalificacionDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});


  private Integer pkeyCalifica;
  private Integer fkeyEstudian;
  private Integer fkeyGrupAsig;
  private Integer fkeyPeriPlan;
  private Integer fkeyDiviMome;
  private Integer fkeyClasCali;
  private Integer notaNumerica;
  private Integer fkeyNotaRang;
  private String notaValoRang;
  private String estaAproCali;
  private String fue_PresCali;
  private String fue_Revisada;
  private Date fechModiCali;
  private Integer numeFallParc;

  private ADS_DivisiMomentDto fkeyDiviMomeDto;
  private ADS_Clase_CalifiDto fkeyClasCaliDto;
  private ADS_EstudiUniverDto fkeyEstudianDto;

  public NOT_CalificacionDto() { 
     PkeyEnti = 22603;
     setAliasName("Califica"); 
  } 

//-------------------------------------------| PkeyCalifica
  public Integer getPkeyCalifica(){ return pkeyCalifica; } 
  public Integer getPkeyCalificaNn(){ return setNotNull(pkeyCalifica); } 
  public String getPkeyCalificaDesc(){ return setDesc(pkeyCalifica); } 
  public void setPkeyCalifica(Integer value){ this.pkeyCalifica=value;} 
  @Override
  public int toInt(){ return getPkeyCalificaNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyCalifica; }; 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
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
//-------------------------------------------| FkeyDiviMome
  public Integer getFkeyDiviMome(){ return fkeyDiviMome; } 
  public Integer getFkeyDiviMomeNn(){ return setNotNull(fkeyDiviMome); } 
  public String getFkeyDiviMomeDesc(){ return setDesc(fkeyDiviMome); } 
  public void setFkeyDiviMome(Integer value){ this.fkeyDiviMome=value;} 
//-------------------------------------------| FkeyClasCali
  public Integer getFkeyClasCali(){ return fkeyClasCali; } 
  public Integer getFkeyClasCaliNn(){ return setNotNull(fkeyClasCali); } 
  public String getFkeyClasCaliDesc(){ return setDesc(fkeyClasCali); } 
  public void setFkeyClasCali(Integer value){ this.fkeyClasCali=value;} 
//-------------------------------------------| NotaNumerica
  public Integer getNotaNumerica(){ return notaNumerica; } 
  public Integer getNotaNumericaNn(){ return setNotNull(notaNumerica); } 
  public String getNotaNumericaDesc(){ return setDesc(notaNumerica); } 
  public void setNotaNumerica(Integer value){ this.notaNumerica=value;} 
//-------------------------------------------| FkeyNotaRang
  public Integer getFkeyNotaRang(){ return fkeyNotaRang; } 
  public Integer getFkeyNotaRangNn(){ return setNotNull(fkeyNotaRang); } 
  public String getFkeyNotaRangDesc(){ return setDesc(fkeyNotaRang); } 
  public void setFkeyNotaRang(Integer value){ this.fkeyNotaRang=value;} 
//-------------------------------------------| NotaValoRang
  public String getNotaValoRang(){ return notaValoRang; } 
  public String getNotaValoRangNn(){ return setNotNull(notaValoRang); } 
  public String getNotaValoRangDesc(){ return setDesc(notaValoRang); } 
  public void setNotaValoRang(String value){ this.notaValoRang=value;} 
//-------------------------------------------| EstaAproCali
  public String getEstaAproCali(){ return estaAproCali; } 
  public String getEstaAproCaliNn(){ return setNotNull(estaAproCali); } 
  public void setEstaAproCali(String value){ this.estaAproCali=value;} 
  public boolean getEstaAproCaliBool() { return estaAproCali==null?false:estaAproCali.equals("S");}
  public void setEstaAproCaliBool(boolean estaAproCali) { this.estaAproCali=estaAproCali?"S":"N";}
//-------------------------------------------| Fue_PresCali
  public String getFue_PresCali(){ return fue_PresCali; } 
  public String getFue_PresCaliNn(){ return setNotNull(fue_PresCali); } 
  public String getFue_PresCaliDesc(){ return setDesc(fue_PresCali); } 
  public void setFue_PresCali(String value){ this.fue_PresCali=value;} 
  public boolean getFue_PresCaliBool() { return fue_PresCali==null?false:fue_PresCali.equals("S");}
  public void setFue_PresCaliBool(boolean fue_PresCali) { this.fue_PresCali=fue_PresCali?"S":"N";}
//-------------------------------------------| Fue_Revisada
  public String getFue_Revisada(){ return fue_Revisada; } 
  public String getFue_RevisadaNn(){ return setNotNull(fue_Revisada); } 
  public String getFue_RevisadaDesc(){ return setDesc(fue_Revisada); } 
  public void setFue_Revisada(String value){ this.fue_Revisada=value;} 
  public boolean getFue_RevisadaBool() { return fue_Revisada==null?false:fue_Revisada.equals("S");}
  public void setFue_RevisadaBool(boolean fue_Revisada) { this.fue_Revisada=fue_Revisada?"S":"N";}
//-------------------------------------------| FechModiCali
  public Date getFechModiCali(){ return fechModiCali; } 
  public Date getFechModiCaliNn(){ return setNotNull(fechModiCali); } 
  public String getFechModiCaliDesc(){ return setDesc(fechModiCali); } 
  public void setFechModiCali(Date value){ this.fechModiCali=value;} 
//-------------------------------------------| NumeFallParc
  public Integer getNumeFallParc(){ return numeFallParc; } 
  public Integer getNumeFallParcNn(){ return setNotNull(numeFallParc); } 
  public String getNumeFallParcDesc(){ return setDesc(numeFallParc); } 
  public void setNumeFallParc(Integer value){ this.numeFallParc=value;} 
// ---------------(RANGOS) 
  public String getEstaAproCaliDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaAproCaliNn()); } 

//---------------------(REL: FkeyDiviMomeDto) 
  public ADS_DivisiMomentDto getFkeyDiviMomeDto() { return fkeyDiviMomeDto; } 
  public void setFkeyDiviMomeDto(ADS_DivisiMomentDto fkeyDiviMomeDto) {
    if ( fkeyDiviMomeDto != null ) { 
      this.fkeyDiviMome = fkeyDiviMomeDto.getPkeyDiviMome(); 
    }
    this.fkeyDiviMomeDto = fkeyDiviMomeDto;
  } 
//---------------------(REL: FkeyClasCaliDto) 
  public ADS_Clase_CalifiDto getFkeyClasCaliDto() { return fkeyClasCaliDto; } 
  public void setFkeyClasCaliDto(ADS_Clase_CalifiDto fkeyClasCaliDto) {
    if ( fkeyClasCaliDto != null ) { 
      this.fkeyClasCali = fkeyClasCaliDto.getPkeyClasCali(); 
    }
    this.fkeyClasCaliDto = fkeyClasCaliDto;
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
  public NOT_CalificacionDto copy(){
    NOT_CalificacionDto result = new NOT_CalificacionDto();
    result.setPkeyCalifica( this.getPkeyCalifica()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setFkeyDiviMome( this.getFkeyDiviMome()); 
    result.setFkeyClasCali( this.getFkeyClasCali()); 
    result.setNotaNumerica( this.getNotaNumerica()); 
    result.setFkeyNotaRang( this.getFkeyNotaRang()); 
    result.setNotaValoRang( this.getNotaValoRang()); 
    result.setEstaAproCali( this.getEstaAproCali()); 
    result.setFue_PresCali( this.getFue_PresCali()); 
    result.setFue_Revisada( this.getFue_Revisada()); 
    result.setFechModiCali( this.getFechModiCali()); 
    result.setNumeFallParc( this.getNumeFallParc()); 
    result.setFkeyDiviMomeDto( this.getFkeyDiviMomeDto());
    result.setFkeyClasCaliDto( this.getFkeyClasCaliDto());
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    return result;
  }
}

