package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.cjd.data.* ;

public class CJD_AnexosProcesDto extends BaseDto {


  private Integer pkeyAnexProc;
  private Integer fkeyClasObse;
  private Integer fkeyProcCons;
  private String infoAnexProc;
  private Date fechModiAnex;

  private CJD_ProcesConsulDto fkeyProcConsDto;
  private CJD_Clase_ObservDto fkeyClasObseDto;

  public CJD_AnexosProcesDto() { 
     PkeyEnti = 128603;
     setAliasName("AnexProc"); 
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
//-------------------------------------------| InfoAnexProc
  public String getInfoAnexProc(){ return infoAnexProc; } 
  public String getInfoAnexProcNn(){ return setNotNull(infoAnexProc); } 
  public String getInfoAnexProcDesc(){ return setDesc(infoAnexProc); } 
  public void setInfoAnexProc(String value){ this.infoAnexProc=value;} 
  @Override
  public String toString(){ return getInfoAnexProcNn(); }; 
//-------------------------------------------| FechModiAnex
  public Date getFechModiAnex(){ return fechModiAnex; } 
  public Date getFechModiAnexNn(){ return setNotNull(fechModiAnex); } 
  public String getFechModiAnexDesc(){ return setDesc(fechModiAnex); } 
  public void setFechModiAnex(Date value){ this.fechModiAnex=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyProcConsDto) 
  public CJD_ProcesConsulDto getFkeyProcConsDto() { return fkeyProcConsDto; } 
  public void setFkeyProcConsDto(CJD_ProcesConsulDto fkeyProcConsDto) {
    if ( fkeyProcConsDto != null ) { 
      this.fkeyProcCons = fkeyProcConsDto.getPkeyProcCons(); 
    }
    this.fkeyProcConsDto = fkeyProcConsDto;
  } 
//---------------------(REL: FkeyClasObseDto) 
  public CJD_Clase_ObservDto getFkeyClasObseDto() { return fkeyClasObseDto; } 
  public void setFkeyClasObseDto(CJD_Clase_ObservDto fkeyClasObseDto) {
    if ( fkeyClasObseDto != null ) { 
      this.fkeyClasObse = fkeyClasObseDto.getPkeyClasObse(); 
    }
    this.fkeyClasObseDto = fkeyClasObseDto;
  } 


  @Override 
  public CJD_AnexosProcesDto copy(){
    CJD_AnexosProcesDto result = new CJD_AnexosProcesDto();
    result.setPkeyAnexProc( this.getPkeyAnexProc()); 
    result.setFkeyClasObse( this.getFkeyClasObse()); 
    result.setFkeyProcCons( this.getFkeyProcCons()); 
    result.setInfoAnexProc( this.getInfoAnexProc()); 
    result.setFechModiAnex( this.getFechModiAnex()); 
    result.setFkeyProcConsDto( this.getFkeyProcConsDto());
    result.setFkeyClasObseDto( this.getFkeyClasObseDto());
    return result;
  }
}

