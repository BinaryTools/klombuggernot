package com.bt.univex.def.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.def.data.*;

public class DEF_NuclBasiConoDto extends BaseDto {


  private Integer pkeyNuclBasi;
  private String codiNuclBasi;
  private String descNuclBasi;
  private String areaNuclBasi;
  private String espcNuclBasi;


  public DEF_NuclBasiConoDto() { 
     PkeyEnti = 53003;
     setAliasName("NuclBasi"); 
  } 

//-------------------------------------------| PkeyNuclBasi
  public Integer getPkeyNuclBasi(){ return pkeyNuclBasi; } 
  public Integer getPkeyNuclBasiNn(){ return setNotNull(pkeyNuclBasi); } 
  public String getPkeyNuclBasiDesc(){ return setDesc(pkeyNuclBasi); } 
  public void setPkeyNuclBasi(Integer value){ this.pkeyNuclBasi=value;} 
  @Override
  public int toInt(){ return getPkeyNuclBasiNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyNuclBasi; }; 
//-------------------------------------------| CodiNuclBasi
  public String getCodiNuclBasi(){ return codiNuclBasi; } 
  public String getCodiNuclBasiNn(){ return setNotNull(codiNuclBasi); } 
  public String getCodiNuclBasiDesc(){ return setDesc(codiNuclBasi); } 
  public void setCodiNuclBasi(String value){ this.codiNuclBasi=value;} 
//-------------------------------------------| DescNuclBasi
  public String getDescNuclBasi(){ return descNuclBasi; } 
  public String getDescNuclBasiNn(){ return setNotNull(descNuclBasi); } 
  public String getDescNuclBasiDesc(){ return setDesc(descNuclBasi); } 
  public void setDescNuclBasi(String value){ this.descNuclBasi=value;} 
  @Override
  public String toString(){ return getDescNuclBasiNn(); }; 
//-------------------------------------------| AreaNuclBasi
  public String getAreaNuclBasi(){ return areaNuclBasi; } 
  public String getAreaNuclBasiNn(){ return setNotNull(areaNuclBasi); } 
  public String getAreaNuclBasiDesc(){ return setDesc(areaNuclBasi); } 
  public void setAreaNuclBasi(String value){ this.areaNuclBasi=value;} 
//-------------------------------------------| EspcNuclBasi
  public String getEspcNuclBasi(){ return espcNuclBasi; } 
  public String getEspcNuclBasiNn(){ return setNotNull(espcNuclBasi); } 
  public String getEspcNuclBasiDesc(){ return setDesc(espcNuclBasi); } 
  public void setEspcNuclBasi(String value){ this.espcNuclBasi=value;} 
// ---------------(RANGOS) 



  @Override 
  public DEF_NuclBasiConoDto copy(){
    DEF_NuclBasiConoDto result = new DEF_NuclBasiConoDto();
    result.setPkeyNuclBasi( this.getPkeyNuclBasi()); 
    result.setCodiNuclBasi( this.getCodiNuclBasi()); 
    result.setDescNuclBasi( this.getDescNuclBasi()); 
    result.setAreaNuclBasi( this.getAreaNuclBasi()); 
    result.setEspcNuclBasi( this.getEspcNuclBasi()); 
    return result;
  }
}

