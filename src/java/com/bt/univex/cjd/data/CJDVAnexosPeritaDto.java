package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDVAnexosPeritaDto extends BaseDto {


  private Integer pkeyAnexPeri;
  private Integer fkeyClasObse;
  private Integer fkeyPeriCons;
  private String nombClasObse;
  private String ordeClasObse;
  private String estaClasObse;
  private String tipoAnexObse;
  private String infoAnexPeri;
  private Date fechModiAnex;


  public CJDVAnexosPeritaDto() { 
     PkeyEnti = 187903;
     setAliasName("AnexPeriV"); 
  } 

//-------------------------------------------| PkeyAnexPeri
  public Integer getPkeyAnexPeri(){ return pkeyAnexPeri; } 
  public Integer getPkeyAnexPeriNn(){ return setNotNull(pkeyAnexPeri); } 
  public String getPkeyAnexPeriDesc(){ return setDesc(pkeyAnexPeri); } 
  public void setPkeyAnexPeri(Integer value){ this.pkeyAnexPeri=value;} 
  @Override
  public int toInt(){ return getPkeyAnexPeriNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyAnexPeri; }; 
//-------------------------------------------| FkeyClasObse
  public Integer getFkeyClasObse(){ return fkeyClasObse; } 
  public Integer getFkeyClasObseNn(){ return setNotNull(fkeyClasObse); } 
  public String getFkeyClasObseDesc(){ return setDesc(fkeyClasObse); } 
  public void setFkeyClasObse(Integer value){ this.fkeyClasObse=value;} 
//-------------------------------------------| FkeyPeriCons
  public Integer getFkeyPeriCons(){ return fkeyPeriCons; } 
  public Integer getFkeyPeriConsNn(){ return setNotNull(fkeyPeriCons); } 
  public String getFkeyPeriConsDesc(){ return setDesc(fkeyPeriCons); } 
  public void setFkeyPeriCons(Integer value){ this.fkeyPeriCons=value;} 
//-------------------------------------------| NombClasObse
  public String getNombClasObse(){ return nombClasObse; } 
  public String getNombClasObseNn(){ return setNotNull(nombClasObse); } 
  public String getNombClasObseDesc(){ return setDesc(nombClasObse); } 
  public void setNombClasObse(String value){ this.nombClasObse=value;} 
  @Override
  public String toString(){ return getNombClasObseNn(); }; 
//-------------------------------------------| OrdeClasObse
  public String getOrdeClasObse(){ return ordeClasObse; } 
  public String getOrdeClasObseNn(){ return setNotNull(ordeClasObse); } 
  public String getOrdeClasObseDesc(){ return setDesc(ordeClasObse); } 
  public void setOrdeClasObse(String value){ this.ordeClasObse=value;} 
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
  public String getTipoAnexObseDesc(){ return setDesc(tipoAnexObse); } 
  public void setTipoAnexObse(String value){ this.tipoAnexObse=value;} 
  public boolean getTipoAnexObseBool() { return tipoAnexObse==null?false:tipoAnexObse.equals("S");}
  public void setTipoAnexObseBool(boolean tipoAnexObse) { this.tipoAnexObse=tipoAnexObse?"S":"N";}
//-------------------------------------------| InfoAnexPeri
  public String getInfoAnexPeri(){ return infoAnexPeri; } 
  public String getInfoAnexPeriNn(){ return setNotNull(infoAnexPeri); } 
  public String getInfoAnexPeriDesc(){ return setDesc(infoAnexPeri); } 
  public void setInfoAnexPeri(String value){ this.infoAnexPeri=value;} 
//-------------------------------------------| FechModiAnex
  public Date getFechModiAnex(){ return fechModiAnex; } 
  public Date getFechModiAnexNn(){ return setNotNull(fechModiAnex); } 
  public String getFechModiAnexDesc(){ return setDesc(fechModiAnex); } 
  public void setFechModiAnex(Date value){ this.fechModiAnex=value;} 
// ---------------(RANGOS) 



  @Override 
  public CJDVAnexosPeritaDto copy(){
    CJDVAnexosPeritaDto result = new CJDVAnexosPeritaDto();
    result.setPkeyAnexPeri( this.getPkeyAnexPeri()); 
    result.setFkeyClasObse( this.getFkeyClasObse()); 
    result.setFkeyPeriCons( this.getFkeyPeriCons()); 
    result.setNombClasObse( this.getNombClasObse()); 
    result.setOrdeClasObse( this.getOrdeClasObse()); 
    result.setEstaClasObse( this.getEstaClasObse()); 
    result.setTipoAnexObse( this.getTipoAnexObse()); 
    result.setInfoAnexPeri( this.getInfoAnexPeri()); 
    result.setFechModiAnex( this.getFechModiAnex()); 
    return result;
  }
}

