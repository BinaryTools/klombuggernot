package com.bt.univex.ads.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;

public class ADSVLocaliMuniciDto extends BaseDto {


  private Integer pkeyLocaMuni;
  private Integer fkeyDepartam;
  private String codiMunicipi;
  private String nombMunicipi;


  public ADSVLocaliMuniciDto() { 
     PkeyEnti = 131603;
     setAliasName("LocaMuniV"); 
  } 

//-------------------------------------------| PkeyLocaMuni
  public Integer getPkeyLocaMuni(){ return pkeyLocaMuni; } 
  public Integer getPkeyLocaMuniNn(){ return setNotNull(pkeyLocaMuni); } 
  public String getPkeyLocaMuniDesc(){ return setDesc(pkeyLocaMuni); } 
  public void setPkeyLocaMuni(Integer value){ this.pkeyLocaMuni=value;} 
  @Override
  public int toInt(){ return getPkeyLocaMuniNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyLocaMuni; }; 
//-------------------------------------------| FkeyDepartam
  public Integer getFkeyDepartam(){ return fkeyDepartam; } 
  public Integer getFkeyDepartamNn(){ return setNotNull(fkeyDepartam); } 
  public String getFkeyDepartamDesc(){ return setDesc(fkeyDepartam); } 
  public void setFkeyDepartam(Integer value){ this.fkeyDepartam=value;} 
//-------------------------------------------| CodiMunicipi
  public String getCodiMunicipi(){ return codiMunicipi; } 
  public String getCodiMunicipiNn(){ return setNotNull(codiMunicipi); } 
  public String getCodiMunicipiDesc(){ return setDesc(codiMunicipi); } 
  public void setCodiMunicipi(String value){ this.codiMunicipi=value;} 
//-------------------------------------------| NombMunicipi
  public String getNombMunicipi(){ return nombMunicipi; } 
  public String getNombMunicipiNn(){ return setNotNull(nombMunicipi); } 
  public String getNombMunicipiDesc(){ return setDesc(nombMunicipi); } 
  public void setNombMunicipi(String value){ this.nombMunicipi=value;} 
  @Override
  public String toString(){ return getNombMunicipiDesc(); }; 
// ---------------(RANGOS) 



  @Override 
  public ADSVLocaliMuniciDto copy(){
    ADSVLocaliMuniciDto result = new ADSVLocaliMuniciDto();
    result.setPkeyLocaMuni( this.getPkeyLocaMuni()); 
    result.setFkeyDepartam( this.getFkeyDepartam()); 
    result.setCodiMunicipi( this.getCodiMunicipi()); 
    result.setNombMunicipi( this.getNombMunicipi()); 
    return result;
  }
}

