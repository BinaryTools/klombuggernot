package com.bt.univex.ads.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;

public class ADS_DepartamentoDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});


  private Integer pkeyDepartam;
  private String codiDepartam;
  private String nombDepartam;
  private String indiPaisDepa;
  private String nacionalidad;


  public ADS_DepartamentoDto() { 
     PkeyEnti = 4403;
     setAliasName("Departam"); 
  } 

//-------------------------------------------| PkeyDepartam
  public Integer getPkeyDepartam(){ return pkeyDepartam; } 
  public Integer getPkeyDepartamNn(){ return setNotNull(pkeyDepartam); } 
  public String getPkeyDepartamDesc(){ return setDesc(pkeyDepartam); } 
  public void setPkeyDepartam(Integer value){ this.pkeyDepartam=value;} 
  @Override
  public int toInt(){ return getPkeyDepartamNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyDepartam; }; 
//-------------------------------------------| CodiDepartam
  public String getCodiDepartam(){ return codiDepartam; } 
  public String getCodiDepartamNn(){ return setNotNull(codiDepartam); } 
  public String getCodiDepartamDesc(){ return setDesc(codiDepartam); } 
  public void setCodiDepartam(String value){ this.codiDepartam=value;} 
//-------------------------------------------| NombDepartam
  public String getNombDepartam(){ return nombDepartam; } 
  public String getNombDepartamNn(){ return setNotNull(nombDepartam); } 
  public String getNombDepartamDesc(){ return setDesc(nombDepartam); } 
  public void setNombDepartam(String value){ this.nombDepartam=value;} 
  @Override
  public String toString(){ return getNombDepartamNn(); }; 
//-------------------------------------------| IndiPaisDepa
  public String getIndiPaisDepa(){ return indiPaisDepa; } 
  public String getIndiPaisDepaNn(){ return setNotNull(indiPaisDepa); } 
  public void setIndiPaisDepa(String value){ this.indiPaisDepa=value;} 
//-------------------------------------------| Nacionalidad
  public String getNacionalidad(){ return nacionalidad; } 
  public String getNacionalidadNn(){ return setNotNull(nacionalidad); } 
  public String getNacionalidadDesc(){ return setDesc(nacionalidad); } 
  public void setNacionalidad(String value){ this.nacionalidad=value;} 
// ---------------(RANGOS) 
  public String getIndiPaisDepaDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getIndiPaisDepaNn()); } 



  @Override 
  public ADS_DepartamentoDto copy(){
    ADS_DepartamentoDto result = new ADS_DepartamentoDto();
    result.setPkeyDepartam( this.getPkeyDepartam()); 
    result.setCodiDepartam( this.getCodiDepartam()); 
    result.setNombDepartam( this.getNombDepartam()); 
    result.setIndiPaisDepa( this.getIndiPaisDepa()); 
    result.setNacionalidad( this.getNacionalidad()); 
    return result;
  }
}

