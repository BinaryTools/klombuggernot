package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.cjd.data.* ;

public class CJD_AnexosConsulDto extends BaseDto {


  private Integer pkeyAnexCons;
  private Integer fkeyClasObse;
  private Integer fkeyConsSist;
  private String infoAnexCons;
  private Date fechModiAnex;

  private CJD_Clase_ObservDto fkeyClasObseDto;
  private CJD_ConsulSistemDto fkeyConsSistDto;

  public CJD_AnexosConsulDto() { 
     PkeyEnti = 128803;
     setAliasName("AnexCons"); 
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
//-------------------------------------------| InfoAnexCons
  public String getInfoAnexCons(){ return infoAnexCons; } 
  public String getInfoAnexConsNn(){ return setNotNull(infoAnexCons); } 
  public String getInfoAnexConsDesc(){ return setDesc(infoAnexCons); } 
  public void setInfoAnexCons(String value){ this.infoAnexCons=value;} 
  @Override
  public String toString(){ return getInfoAnexConsNn(); }; 
//-------------------------------------------| FechModiAnex
  public Date getFechModiAnex(){ return fechModiAnex; } 
  public Date getFechModiAnexNn(){ return setNotNull(fechModiAnex); } 
  public String getFechModiAnexDesc(){ return setDesc(fechModiAnex); } 
  public void setFechModiAnex(Date value){ this.fechModiAnex=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyClasObseDto) 
  public CJD_Clase_ObservDto getFkeyClasObseDto() { return fkeyClasObseDto; } 
  public void setFkeyClasObseDto(CJD_Clase_ObservDto fkeyClasObseDto) {
    if ( fkeyClasObseDto != null ) { 
      this.fkeyClasObse = fkeyClasObseDto.getPkeyClasObse(); 
    }
    this.fkeyClasObseDto = fkeyClasObseDto;
  } 
//---------------------(REL: FkeyConsSistDto) 
  public CJD_ConsulSistemDto getFkeyConsSistDto() { return fkeyConsSistDto; } 
  public void setFkeyConsSistDto(CJD_ConsulSistemDto fkeyConsSistDto) {
    if ( fkeyConsSistDto != null ) { 
      this.fkeyConsSist = fkeyConsSistDto.getPkeyConsSist(); 
    }
    this.fkeyConsSistDto = fkeyConsSistDto;
  } 


  @Override 
  public CJD_AnexosConsulDto copy(){
    CJD_AnexosConsulDto result = new CJD_AnexosConsulDto();
    result.setPkeyAnexCons( this.getPkeyAnexCons()); 
    result.setFkeyClasObse( this.getFkeyClasObse()); 
    result.setFkeyConsSist( this.getFkeyConsSist()); 
    result.setInfoAnexCons( this.getInfoAnexCons()); 
    result.setFechModiAnex( this.getFechModiAnex()); 
    result.setFkeyClasObseDto( this.getFkeyClasObseDto());
    result.setFkeyConsSistDto( this.getFkeyConsSistDto());
    return result;
  }
}

