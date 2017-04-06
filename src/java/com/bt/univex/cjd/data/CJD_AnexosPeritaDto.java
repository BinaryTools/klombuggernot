package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJD_AnexosPeritaDto extends BaseDto {


  private Integer pkeyAnexPeri;
  private Integer fkeyClasObse;
  private Integer fkeyPeriCons;
  private String infoAnexPeri;
  private Date fechModiAnex;


  public CJD_AnexosPeritaDto() { 
     PkeyEnti = 186703;
     setAliasName("AnexPeri"); 
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
  public CJD_AnexosPeritaDto copy(){
    CJD_AnexosPeritaDto result = new CJD_AnexosPeritaDto();
    result.setPkeyAnexPeri( this.getPkeyAnexPeri()); 
    result.setFkeyClasObse( this.getFkeyClasObse()); 
    result.setFkeyPeriCons( this.getFkeyPeriCons()); 
    result.setInfoAnexPeri( this.getInfoAnexPeri()); 
    result.setFechModiAnex( this.getFechModiAnex()); 
    return result;
  }
}

