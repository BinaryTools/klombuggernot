package com.bt.univex.ads.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;

public class ADS_DivisiMomentDto extends BaseDto {
  public static final List RANG_TipoMome = Arrays.asList( new Range[] { 
      new Range("D","Divisiones Iguales"),
      new Range("H","Suple nota total (Habilitación)"),
      new Range("L","Laboratorio (Correquisito)"),
      new Range("N","Normal"),
      new Range("S","Suple la nota parcial"),
      new Range("V","Validación total del período")});


  private Integer pkeyDiviMome;
  private Integer fkeyDiviCali;
  private String nombMomento_;
  private Integer ordeDebeReci;
  private String tipoMomento_;
  private Integer porcAplicaci;
  private Integer numeNotaReem;
  private Integer numeCortNota;

//  private ADS_DivisiCalifiDto fkeyDiviCaliDto;

  public ADS_DivisiMomentDto() { 
     PkeyEnti = 5903;
     setAliasName("DiviMome"); 
  } 

//-------------------------------------------| PkeyDiviMome
  public Integer getPkeyDiviMome(){ return pkeyDiviMome; } 
  public Integer getPkeyDiviMomeNn(){ return setNotNull(pkeyDiviMome); } 
  public String getPkeyDiviMomeDesc(){ return setDesc(pkeyDiviMome); } 
  public void setPkeyDiviMome(Integer value){ this.pkeyDiviMome=value;} 
  @Override
  public int toInt(){ return getPkeyDiviMomeNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyDiviMome; }; 
//-------------------------------------------| FkeyDiviCali
  public Integer getFkeyDiviCali(){ return fkeyDiviCali; } 
  public Integer getFkeyDiviCaliNn(){ return setNotNull(fkeyDiviCali); } 
  public String getFkeyDiviCaliDesc(){ return setDesc(fkeyDiviCali); } 
  public void setFkeyDiviCali(Integer value){ this.fkeyDiviCali=value;} 
//-------------------------------------------| NombMomento_
  public String getNombMomento_(){ return nombMomento_; } 
  public String getNombMomento_Nn(){ return setNotNull(nombMomento_); } 
  public String getNombMomento_Desc(){ return setDesc(nombMomento_); } 
  public void setNombMomento_(String value){ this.nombMomento_=value;} 
  @Override
  public String toString(){ return getNombMomento_Nn(); }; 
//-------------------------------------------| OrdeDebeReci
  public Integer getOrdeDebeReci(){ return ordeDebeReci; } 
  public Integer getOrdeDebeReciNn(){ return setNotNull(ordeDebeReci); } 
  public String getOrdeDebeReciDesc(){ return setDesc(ordeDebeReci); } 
  public void setOrdeDebeReci(Integer value){ this.ordeDebeReci=value;} 
//-------------------------------------------| TipoMomento_
  public String getTipoMomento_(){ return tipoMomento_; } 
  public String getTipoMomento_Nn(){ return setNotNull(tipoMomento_); } 
  public void setTipoMomento_(String value){ this.tipoMomento_=value;} 
//-------------------------------------------| PorcAplicaci
  public Integer getPorcAplicaci(){ return porcAplicaci; } 
  public Integer getPorcAplicaciNn(){ return setNotNull(porcAplicaci); } 
  public String getPorcAplicaciDesc(){ return setDesc(porcAplicaci); } 
  public void setPorcAplicaci(Integer value){ this.porcAplicaci=value;} 
//-------------------------------------------| NumeNotaReem
  public Integer getNumeNotaReem(){ return numeNotaReem; } 
  public Integer getNumeNotaReemNn(){ return setNotNull(numeNotaReem); } 
  public String getNumeNotaReemDesc(){ return setDesc(numeNotaReem); } 
  public void setNumeNotaReem(Integer value){ this.numeNotaReem=value;} 
//-------------------------------------------| NumeCortNota
  public Integer getNumeCortNota(){ return numeCortNota; } 
  public Integer getNumeCortNotaNn(){ return setNotNull(numeCortNota); } 
  public String getNumeCortNotaDesc(){ return setDesc(numeCortNota); } 
  public void setNumeCortNota(Integer value){ this.numeCortNota=value;} 
// ---------------(RANGOS) 
  public String getTipoMomento_Desc() { return DtoMisc.getRangeDesc(RANG_TipoMome,getTipoMomento_Nn()); } 

//---------------------(REL: FkeyDiviCaliDto) 
//  public ADS_DivisiCalifiDto getFkeyDiviCaliDto() { return fkeyDiviCaliDto; } 
//  public void setFkeyDiviCaliDto(ADS_DivisiCalifiDto fkeyDiviCaliDto) {
//    if ( fkeyDiviCaliDto != null ) { 
//      this.fkeyDiviCali = fkeyDiviCaliDto.getPkeyDiviCali(); 
//    }
//    this.fkeyDiviCaliDto = fkeyDiviCaliDto;
//  } 


  @Override 
  public ADS_DivisiMomentDto copy(){
    ADS_DivisiMomentDto result = new ADS_DivisiMomentDto();
    result.setPkeyDiviMome( this.getPkeyDiviMome()); 
    result.setFkeyDiviCali( this.getFkeyDiviCali()); 
    result.setNombMomento_( this.getNombMomento_()); 
    result.setOrdeDebeReci( this.getOrdeDebeReci()); 
    result.setTipoMomento_( this.getTipoMomento_()); 
    result.setPorcAplicaci( this.getPorcAplicaci()); 
    result.setNumeNotaReem( this.getNumeNotaReem()); 
    result.setNumeCortNota( this.getNumeCortNota()); 
//    result.setFkeyDiviCaliDto( this.getFkeyDiviCaliDto());
    return result;
  }
}

