package com.bt.univex.cjd.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;

public class CJD_Clase_ObservDto extends BaseDto {
  public static final List RANG_EstaClasObse = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});
  public static final List RANG_TipoAnexObse = Arrays.asList( new Range[] { 
      new Range("C","Consulta"),
      new Range("P","Proceso"),
      new Range("E","Peritaje")
  });


  private Integer pkeyClasObse;
  private String nombClasObse;
  private Integer ordeClasObse;
  private String estaClasObse;
  private String tipoAnexObse;


  public CJD_Clase_ObservDto() { 
     PkeyEnti = 128703;
     setAliasName("ClasObse"); 
  } 

//-------------------------------------------| PkeyClasObse
  public Integer getPkeyClasObse(){ return pkeyClasObse; } 
  public Integer getPkeyClasObseNn(){ return setNotNull(pkeyClasObse); } 
  public String getPkeyClasObseDesc(){ return setDesc(pkeyClasObse); } 
  public void setPkeyClasObse(Integer value){ this.pkeyClasObse=value;} 
  @Override
  public int toInt(){ return getPkeyClasObseNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyClasObse; }; 
//-------------------------------------------| NombClasObse
  public String getNombClasObse(){ return nombClasObse; } 
  public String getNombClasObseNn(){ return setNotNull(nombClasObse); } 
  public String getNombClasObseDesc(){ return setDesc(nombClasObse); } 
  public void setNombClasObse(String value){ this.nombClasObse=value;} 
  @Override
  public String toString(){ return getNombClasObse(); }; 
//-------------------------------------------| OrdeClasObse
  public Integer getOrdeClasObse(){ return ordeClasObse; } 
  public Integer getOrdeClasObseNn(){ return setNotNull(ordeClasObse); } 
  public String getOrdeClasObseDesc(){ return setDesc(ordeClasObse); } 
  public void setOrdeClasObse(Integer value){ this.ordeClasObse=value;} 
//-------------------------------------------| EstaClasObse
  public String getEstaClasObse(){ return estaClasObse; } 
  public String getEstaClasObseNn(){ return setNotNull(estaClasObse); } 
  public void setEstaClasObse(String value){ this.estaClasObse=value;} 
  public boolean getEstaClasObseBool() { return estaClasObse==null?false:estaClasObse.equals("S");}
  public void setEstaClasObseBool(boolean estaClasObse) { this.estaClasObse=estaClasObse?"S":"N";}
//-------------------------------------------| TipoAnexObse
  public String getTipoAnexObse(){ return tipoAnexObse; } 
  public String getTipoAnexObseNn(){ return setNotNull(tipoAnexObse); } 
  public void setTipoAnexObse(String value){ this.tipoAnexObse=value;} 
// ---------------(RANGOS) 
  public String getEstaClasObseDesc() { return DtoMisc.getRangeDesc(RANG_EstaClasObse,getEstaClasObseNn()); } 
  public String getTipoAnexObseDesc() { return DtoMisc.getRangeDesc(RANG_TipoAnexObse,getTipoAnexObseNn()); } 



  @Override 
  public CJD_Clase_ObservDto copy(){
    CJD_Clase_ObservDto result = new CJD_Clase_ObservDto();
    result.setPkeyClasObse( this.getPkeyClasObse()); 
    result.setNombClasObse( this.getNombClasObse()); 
    result.setOrdeClasObse( this.getOrdeClasObse()); 
    result.setEstaClasObse( this.getEstaClasObse()); 
    result.setTipoAnexObse( this.getTipoAnexObse()); 
    return result;
  }
}

