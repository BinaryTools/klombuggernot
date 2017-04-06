package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDVAnexosConsulDto extends BaseDto {
  public static final List RANG_TipoAnexObse = Arrays.asList( new Range[] { 
      new Range("C","Consulta"),
      new Range("P","Proceso")});


  private Integer pkeyAnexCons;
  private Integer fkeyClasObse;
  private Integer fkeyConsSist;
  private String nombClasObse;
  private Integer ordeClasObse;
  private String estaClasObse;
  private String tipoAnexObse;
  private String infoAnexCons;
  private Date fechModiAnex;


  public CJDVAnexosConsulDto() { 
     PkeyEnti = 130203;
     setAliasName("AnexConsV"); 
  } 

//-------------------------------------------| PkeyAnexCons
  public Integer getPkeyAnexCons(){ return pkeyAnexCons; } 
  public Integer getPkeyAnexConsNn(){ return setNotNull(pkeyAnexCons); } 
  public String getPkeyAnexConsDesc(){ return setDesc(pkeyAnexCons); } 
  public void setPkeyAnexCons(Integer value){ this.pkeyAnexCons=value;} 
  @Override
  public int toInt(){ return getPkeyAnexConsNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyAnexCons; }; 
//-------------------------------------------| FkeyClasObse
  public Integer getFkeyClasObse(){ return fkeyClasObse; } 
  public Integer getFkeyClasObseNn(){ return setNotNull(fkeyClasObse); } 
  public String getFkeyClasObseDesc(){ return setDesc(fkeyClasObse); } 
  public void setFkeyClasObse(Integer value){ this.fkeyClasObse=value;} 
//-------------------------------------------| FkeyConsSist
  public Integer getFkeyConsSist(){ return fkeyConsSist; } 
  public Integer getFkeyConsSistNn(){ return setNotNull(fkeyConsSist); } 
  public String getFkeyConsSistDesc(){ return setDesc(fkeyConsSist); } 
  public void setFkeyConsSist(Integer value){ this.fkeyConsSist=value;} 
//-------------------------------------------| NombClasObse
  public String getNombClasObse(){ return nombClasObse; } 
  public String getNombClasObseNn(){ return setNotNull(nombClasObse); } 
  public String getNombClasObseDesc(){ return setDesc(nombClasObse); } 
  public void setNombClasObse(String value){ this.nombClasObse=value;} 
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
//-------------------------------------------| InfoAnexCons
  public String getInfoAnexCons(){ return infoAnexCons; } 
  public String getInfoAnexConsNn(){ return setNotNull(infoAnexCons); } 
  public String getInfoAnexConsDesc(){ return setDesc(infoAnexCons); } 
  public void setInfoAnexCons(String value){ this.infoAnexCons=value;} 
//-------------------------------------------| FechModiAnex
  public Date getFechModiAnex(){ return fechModiAnex; } 
  public Date getFechModiAnexNn(){ return setNotNull(fechModiAnex); } 
  public String getFechModiAnexDesc(){ return setDesc(fechModiAnex); } 
  public void setFechModiAnex(Date value){ this.fechModiAnex=value;} 
// ---------------(RANGOS) 
  public String getTipoAnexObseDesc() { return DtoMisc.getRangeDesc(RANG_TipoAnexObse,getTipoAnexObseNn()); } 



  @Override 
  public CJDVAnexosConsulDto copy(){
    CJDVAnexosConsulDto result = new CJDVAnexosConsulDto();
    result.setPkeyAnexCons( this.getPkeyAnexCons()); 
    result.setFkeyClasObse( this.getFkeyClasObse()); 
    result.setFkeyConsSist( this.getFkeyConsSist()); 
    result.setNombClasObse( this.getNombClasObse()); 
    result.setOrdeClasObse( this.getOrdeClasObse()); 
    result.setEstaClasObse( this.getEstaClasObse()); 
    result.setTipoAnexObse( this.getTipoAnexObse()); 
    result.setInfoAnexCons( this.getInfoAnexCons()); 
    result.setFechModiAnex( this.getFechModiAnex()); 
    return result;
  }
}

