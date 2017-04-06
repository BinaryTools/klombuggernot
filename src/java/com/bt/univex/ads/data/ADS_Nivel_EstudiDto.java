package com.bt.univex.ads.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;

public class ADS_Nivel_EstudiDto extends BaseDto {
  public static final List RANG_TipoBaNi = Arrays.asList( new Range[] { 
      new Range("C","Cursos"),
      new Range("P","Pregrado"),
      new Range("S","Posgrado")});
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});


  private Integer pkeyNiveEstu;
  private String nombNiveEstu;
  private String tipoBasiEstu;
  private String estaActiNive;


  public ADS_Nivel_EstudiDto() { 
     PkeyEnti = 4903;
     setAliasName("NiveEstu"); 
  } 

//-------------------------------------------| PkeyNiveEstu
  public Integer getPkeyNiveEstu(){ return pkeyNiveEstu; } 
  public Integer getPkeyNiveEstuNn(){ return setNotNull(pkeyNiveEstu); } 
  public String getPkeyNiveEstuDesc(){ return setDesc(pkeyNiveEstu); } 
  public void setPkeyNiveEstu(Integer value){ this.pkeyNiveEstu=value;} 
  @Override
  public int toInt(){ return getPkeyNiveEstuNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyNiveEstu; }; 
//-------------------------------------------| NombNiveEstu
  public String getNombNiveEstu(){ return nombNiveEstu; } 
  public String getNombNiveEstuNn(){ return setNotNull(nombNiveEstu); } 
  public String getNombNiveEstuDesc(){ return setDesc(nombNiveEstu); } 
  public void setNombNiveEstu(String value){ this.nombNiveEstu=value;} 
  @Override
  public String toString(){ return getNombNiveEstuNn(); }; 
//-------------------------------------------| TipoBasiEstu
  public String getTipoBasiEstu(){ return tipoBasiEstu; } 
  public String getTipoBasiEstuNn(){ return setNotNull(tipoBasiEstu); } 
  public void setTipoBasiEstu(String value){ this.tipoBasiEstu=value;} 
//-------------------------------------------| EstaActiNive
  public String getEstaActiNive(){ return estaActiNive; } 
  public String getEstaActiNiveNn(){ return setNotNull(estaActiNive); } 
  public void setEstaActiNive(String value){ this.estaActiNive=value;} 
  public boolean getEstaActiNiveBool() { return estaActiNive==null?false:estaActiNive.equals("S");}
  public void setEstaActiNiveBool(boolean estaActiNive) { this.estaActiNive=estaActiNive?"S":"N";}
// ---------------(RANGOS) 
  public String getTipoBasiEstuDesc() { return DtoMisc.getRangeDesc(RANG_TipoBaNi,getTipoBasiEstuNn()); } 
  public String getEstaActiNiveDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaActiNiveNn()); } 



  @Override 
  public ADS_Nivel_EstudiDto copy(){
    ADS_Nivel_EstudiDto result = new ADS_Nivel_EstudiDto();
    result.setPkeyNiveEstu( this.getPkeyNiveEstu()); 
    result.setNombNiveEstu( this.getNombNiveEstu()); 
    result.setTipoBasiEstu( this.getTipoBasiEstu()); 
    result.setEstaActiNive( this.getEstaActiNive()); 
    return result;
  }
}

