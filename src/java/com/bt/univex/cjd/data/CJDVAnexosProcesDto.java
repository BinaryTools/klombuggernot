package com.bt.univex.cjd.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;

public class CJDVAnexosProcesDto extends BaseDto {
  public static final List RANG_TipoAnexObse = Arrays.asList( new Range[] { 
      new Range("C","Consultorio"),
      new Range("P","Proceso")});


  private Integer pkeyAnexProc;
  private Integer fkeyClasObse;
  private Integer fkeyProcCons;
  private String nombClasObse;
  private Integer ordeClasObse;
  private String estaClasObse;
  private String tipoAnexObse;
  private String infoAnexProc;
  private Date fechModiAnex;


  public CJDVAnexosProcesDto() { 
     PkeyEnti = 130303;
     setAliasName("AnexProcV"); 
  } 

//-------------------------------------------| PkeyAnexProc
  public Integer getPkeyAnexProc(){ return pkeyAnexProc; } 
  public Integer getPkeyAnexProcNn(){ return setNotNull(pkeyAnexProc); } 
  public String getPkeyAnexProcDesc(){ return setDesc(pkeyAnexProc); } 
  public void setPkeyAnexProc(Integer value){ this.pkeyAnexProc=value;} 
  @Override
  public int toInt(){ return getPkeyAnexProcNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyAnexProc; }; 
//-------------------------------------------| FkeyClasObse
  public Integer getFkeyClasObse(){ return fkeyClasObse; } 
  public Integer getFkeyClasObseNn(){ return setNotNull(fkeyClasObse); } 
  public String getFkeyClasObseDesc(){ return setDesc(fkeyClasObse); } 
  public void setFkeyClasObse(Integer value){ this.fkeyClasObse=value;} 
//-------------------------------------------| FkeyProcCons
  public Integer getFkeyProcCons(){ return fkeyProcCons; } 
  public Integer getFkeyProcConsNn(){ return setNotNull(fkeyProcCons); } 
  public String getFkeyProcConsDesc(){ return setDesc(fkeyProcCons); } 
  public void setFkeyProcCons(Integer value){ this.fkeyProcCons=value;} 
//-------------------------------------------| NombClasObse
  public String getNombClasObse(){ return nombClasObse; } 
  public String getNombClasObseNn(){ return setNotNull(nombClasObse); } 
  public String getNombClasObseDesc(){ return setDesc(nombClasObse); } 
  public void setNombClasObse(String value){ this.nombClasObse=value;} 
  @Override
  public String toString(){ return getNombClasObseNn(); }; 
//-------------------------------------------| OrdeClasObse
  public Integer getOrdeClasObse(){ return ordeClasObse; } 
  public Integer getOrdeClasObseNn(){ return setNotNull(ordeClasObse); } 
  public String getOrdeClasObseDesc(){ return setDesc(ordeClasObse); } 
  public void setOrdeClasObse(Integer value){ this.ordeClasObse=value;} 
//-------------------------------------------| EstaClasObse
  public String getEstaClasObse(){ return estaClasObse; } 
  public String getEstaClasObseNn(){ return setNotNull(estaClasObse); } 
  public String getEstaClasObseDesc(){ return setDesc(estaClasObse); } 
  public void setEstaClasObse(String value){ this.estaClasObse=value;} 
  public boolean getEstaClasObseBool() { return estaClasObse==null?false:estaClasObse.equals("S");}
  public void setEstaClasObseBool(boolean estaClasObse) { this.estaClasObse=estaClasObse?"S":"N";}
//-------------------------------------------| TipoAnexObse
  public String getTipoAnexObse(){ return tipoAnexObse; } 
  public String getTipoAnexObseNn(){ return setNotNull(tipoAnexObse); } 
  public void setTipoAnexObse(String value){ this.tipoAnexObse=value;} 
//-------------------------------------------| InfoAnexProc
  public String getInfoAnexProc(){ return infoAnexProc; } 
  public String getInfoAnexProcNn(){ return setNotNull(infoAnexProc); } 
  public String getInfoAnexProcDesc(){ return setDesc(infoAnexProc); } 
  public void setInfoAnexProc(String value){ this.infoAnexProc=value;} 
//-------------------------------------------| FechModiAnex
  public Date getFechModiAnex(){ return fechModiAnex; } 
  public Date getFechModiAnexNn(){ return setNotNull(fechModiAnex); } 
  public String getFechModiAnexDesc(){ return setDesc(fechModiAnex); } 
  public void setFechModiAnex(Date value){ this.fechModiAnex=value;} 
// ---------------(RANGOS) 
  public String getTipoAnexObseDesc() { return DtoMisc.getRangeDesc(RANG_TipoAnexObse,getTipoAnexObseNn()); } 



  @Override 
  public CJDVAnexosProcesDto copy(){
    CJDVAnexosProcesDto result = new CJDVAnexosProcesDto();
    result.setPkeyAnexProc( this.getPkeyAnexProc()); 
    result.setFkeyClasObse( this.getFkeyClasObse()); 
    result.setFkeyProcCons( this.getFkeyProcCons()); 
    result.setNombClasObse( this.getNombClasObse()); 
    result.setOrdeClasObse( this.getOrdeClasObse()); 
    result.setEstaClasObse( this.getEstaClasObse()); 
    result.setTipoAnexObse( this.getTipoAnexObse()); 
    result.setInfoAnexProc( this.getInfoAnexProc()); 
    result.setFechModiAnex( this.getFechModiAnex()); 
    return result;
  }
}

