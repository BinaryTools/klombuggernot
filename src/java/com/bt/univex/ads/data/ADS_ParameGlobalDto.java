package com.bt.univex.ads.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;

public class ADS_ParameGlobalDto extends BaseDto {


  private Integer pkeyParaGlob;
  private String nombParaGlob;
  private String codiParaGlob;
  private String descParaGlob;
  private String valoParaGlob;
  private String estaActiPara;


  public ADS_ParameGlobalDto() { 
     PkeyEnti = 77303;
     setAliasName("ParaGlob"); 
  } 

//-------------------------------------------| PkeyParaGlob
  public Integer getPkeyParaGlob(){ return pkeyParaGlob; } 
  public Integer getPkeyParaGlobNn(){ return setNotNull(pkeyParaGlob); } 
  public String getPkeyParaGlobDesc(){ return setDesc(pkeyParaGlob); } 
  public void setPkeyParaGlob(Integer value){ this.pkeyParaGlob=value;} 
  @Override
  public int toInt(){ return getPkeyParaGlobNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyParaGlob; }; 
//-------------------------------------------| NombParaGlob
  public String getNombParaGlob(){ return nombParaGlob; } 
  public String getNombParaGlobNn(){ return setNotNull(nombParaGlob); } 
  public String getNombParaGlobDesc(){ return setDesc(nombParaGlob); } 
  public void setNombParaGlob(String value){ this.nombParaGlob=value;} 
//-------------------------------------------| CodiParaGlob
  public String getCodiParaGlob(){ return codiParaGlob; } 
  public String getCodiParaGlobNn(){ return setNotNull(codiParaGlob); } 
  public String getCodiParaGlobDesc(){ return setDesc(codiParaGlob); } 
  public void setCodiParaGlob(String value){ this.codiParaGlob=value;} 
//-------------------------------------------| DescParaGlob
  public String getDescParaGlob(){ return descParaGlob; } 
  public String getDescParaGlobNn(){ return setNotNull(descParaGlob); } 
  public String getDescParaGlobDesc(){ return setDesc(descParaGlob); } 
  public void setDescParaGlob(String value){ this.descParaGlob=value;} 
//-------------------------------------------| ValoParaGlob
  public String getValoParaGlob(){ return valoParaGlob; } 
  public String getValoParaGlobNn(){ return setNotNull(valoParaGlob); } 
  public String getValoParaGlobDesc(){ return setDesc(valoParaGlob); } 
  public void setValoParaGlob(String value){ this.valoParaGlob=value;} 
//-------------------------------------------| EstaActiPara
  public String getEstaActiPara(){ return estaActiPara; } 
  public String getEstaActiParaNn(){ return setNotNull(estaActiPara); } 
  public String getEstaActiParaDesc(){ return setDesc(estaActiPara); } 
  public void setEstaActiPara(String value){ this.estaActiPara=value;} 
// ---------------(RANGOS) 



  @Override 
  public ADS_ParameGlobalDto copy(){
    ADS_ParameGlobalDto result = new ADS_ParameGlobalDto();
    result.setPkeyParaGlob( this.getPkeyParaGlob()); 
    result.setNombParaGlob( this.getNombParaGlob()); 
    result.setCodiParaGlob( this.getCodiParaGlob()); 
    result.setDescParaGlob( this.getDescParaGlob()); 
    result.setValoParaGlob( this.getValoParaGlob()); 
    result.setEstaActiPara( this.getEstaActiPara()); 
    return result;
  }
}

