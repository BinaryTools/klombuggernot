package com.bt.univex.ads.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;

public class ADS_ModaliEstudiDto extends BaseDto {
  public static final List RANG_TipoBasi = Arrays.asList( new Range[] { 
      new Range("D","Distancia"),
      new Range("P","Presencial"),
      new Range("S","Semi-presencial")});


  private Integer pkeyModaEstu;
  private String nombModaEstu;
  private String tipoBasiModa;


  public ADS_ModaliEstudiDto() { 
     PkeyEnti = 5003;
     setAliasName("ModaEstu"); 
  } 

//-------------------------------------------| PkeyModaEstu
  public Integer getPkeyModaEstu(){ return pkeyModaEstu; } 
  public Integer getPkeyModaEstuNn(){ return setNotNull(pkeyModaEstu); } 
  public String getPkeyModaEstuDesc(){ return setDesc(pkeyModaEstu); } 
  public void setPkeyModaEstu(Integer value){ this.pkeyModaEstu=value;} 
  @Override
  public int toInt(){ return getPkeyModaEstuNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyModaEstu; }; 
//-------------------------------------------| NombModaEstu
  public String getNombModaEstu(){ return nombModaEstu; } 
  public String getNombModaEstuNn(){ return setNotNull(nombModaEstu); } 
  public String getNombModaEstuDesc(){ return setDesc(nombModaEstu); } 
  public void setNombModaEstu(String value){ this.nombModaEstu=value;} 
  @Override
  public String toString(){ return getNombModaEstuNn(); }; 
//-------------------------------------------| TipoBasiModa
  public String getTipoBasiModa(){ return tipoBasiModa; } 
  public String getTipoBasiModaNn(){ return setNotNull(tipoBasiModa); } 
  public void setTipoBasiModa(String value){ this.tipoBasiModa=value;} 
// ---------------(RANGOS) 
  public String getTipoBasiModaDesc() { return DtoMisc.getRangeDesc(RANG_TipoBasi,getTipoBasiModaNn()); } 



  @Override 
  public ADS_ModaliEstudiDto copy(){
    ADS_ModaliEstudiDto result = new ADS_ModaliEstudiDto();
    result.setPkeyModaEstu( this.getPkeyModaEstu()); 
    result.setNombModaEstu( this.getNombModaEstu()); 
    result.setTipoBasiModa( this.getTipoBasiModa()); 
    return result;
  }
}

