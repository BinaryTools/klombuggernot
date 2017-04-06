package com.bt.univex.ads.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;

public class ADS_Clase_CalifiDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});


  private Integer pkeyClasCali;
  private String nombClasCali;
  private String esdeTipoRang;
  private Integer valoInfeRang;
  private Integer valoSupeRang;
  private Integer cantDecimale;
  private Integer notaMiniApro;
  private Double inteEntrNota;
  private String debeRedoNota;


  public ADS_Clase_CalifiDto() { 
     PkeyEnti = 5703;
     setAliasName("ClasCali"); 
  } 

//-------------------------------------------| PkeyClasCali
  public Integer getPkeyClasCali(){ return pkeyClasCali; } 
  public Integer getPkeyClasCaliNn(){ return setNotNull(pkeyClasCali); } 
  public String getPkeyClasCaliDesc(){ return setDesc(pkeyClasCali); } 
  public void setPkeyClasCali(Integer value){ this.pkeyClasCali=value;} 
  @Override
  public int toInt(){ return getPkeyClasCaliNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyClasCali; }; 
//-------------------------------------------| NombClasCali
  public String getNombClasCali(){ return nombClasCali; } 
  public String getNombClasCaliNn(){ return setNotNull(nombClasCali); } 
  public String getNombClasCaliDesc(){ return setDesc(nombClasCali); } 
  public void setNombClasCali(String value){ this.nombClasCali=value;} 
  @Override
  public String toString(){ return getNombClasCaliNn(); }; 
//-------------------------------------------| EsdeTipoRang
  public String getEsdeTipoRang(){ return esdeTipoRang; } 
  public String getEsdeTipoRangNn(){ return setNotNull(esdeTipoRang); } 
  public void setEsdeTipoRang(String value){ this.esdeTipoRang=value;} 
  public boolean getEsdeTipoRangBool() { return esdeTipoRang==null?false:esdeTipoRang.equals("S");}
  public void setEsdeTipoRangBool(boolean esdeTipoRang) { this.esdeTipoRang=esdeTipoRang?"S":"N";}
//-------------------------------------------| ValoInfeRang
  public Integer getValoInfeRang(){ return valoInfeRang; } 
  public Integer getValoInfeRangNn(){ return setNotNull(valoInfeRang); } 
  public String getValoInfeRangDesc(){ return setDesc(valoInfeRang); } 
  public void setValoInfeRang(Integer value){ this.valoInfeRang=value;} 
//-------------------------------------------| ValoSupeRang
  public Integer getValoSupeRang(){ return valoSupeRang; } 
  public Integer getValoSupeRangNn(){ return setNotNull(valoSupeRang); } 
  public String getValoSupeRangDesc(){ return setDesc(valoSupeRang); } 
  public void setValoSupeRang(Integer value){ this.valoSupeRang=value;} 
//-------------------------------------------| CantDecimale
  public Integer getCantDecimale(){ return cantDecimale; } 
  public Integer getCantDecimaleNn(){ return setNotNull(cantDecimale); } 
  public String getCantDecimaleDesc(){ return setDesc(cantDecimale); } 
  public void setCantDecimale(Integer value){ this.cantDecimale=value;} 
//-------------------------------------------| NotaMiniApro
  public Integer getNotaMiniApro(){ return notaMiniApro; } 
  public Integer getNotaMiniAproNn(){ return setNotNull(notaMiniApro); } 
  public String getNotaMiniAproDesc(){ return setDesc(notaMiniApro); } 
  public void setNotaMiniApro(Integer value){ this.notaMiniApro=value;} 
//-------------------------------------------| InteEntrNota
  public Double getInteEntrNota(){ return inteEntrNota; } 
  public Double getInteEntrNotaNn(){ return setNotNull(inteEntrNota); } 
  public String getInteEntrNotaDesc(){ return setDesc(inteEntrNota); } 
  public void setInteEntrNota(Double value){ this.inteEntrNota=value;} 
//-------------------------------------------| DebeRedoNota
  public String getDebeRedoNota(){ return debeRedoNota; } 
  public String getDebeRedoNotaNn(){ return setNotNull(debeRedoNota); } 
  public void setDebeRedoNota(String value){ this.debeRedoNota=value;} 
  public boolean getDebeRedoNotaBool() { return debeRedoNota==null?false:debeRedoNota.equals("S");}
  public void setDebeRedoNotaBool(boolean debeRedoNota) { this.debeRedoNota=debeRedoNota?"S":"N";}
// ---------------(RANGOS) 
  public String getEsdeTipoRangDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEsdeTipoRangNn()); } 
  public String getDebeRedoNotaDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getDebeRedoNotaNn()); } 



  @Override 
  public ADS_Clase_CalifiDto copy(){
    ADS_Clase_CalifiDto result = new ADS_Clase_CalifiDto();
    result.setPkeyClasCali( this.getPkeyClasCali()); 
    result.setNombClasCali( this.getNombClasCali()); 
    result.setEsdeTipoRang( this.getEsdeTipoRang()); 
    result.setValoInfeRang( this.getValoInfeRang()); 
    result.setValoSupeRang( this.getValoSupeRang()); 
    result.setCantDecimale( this.getCantDecimale()); 
    result.setNotaMiniApro( this.getNotaMiniApro()); 
    result.setInteEntrNota( this.getInteEntrNota()); 
    result.setDebeRedoNota( this.getDebeRedoNota()); 
    return result;
  }
}

