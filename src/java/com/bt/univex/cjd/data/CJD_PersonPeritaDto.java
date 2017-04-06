package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.cjd.data.* ;

public class CJD_PersonPeritaDto extends BaseDto {


  private Integer pkeyPersPeri;
  private Integer fkeyPersSist;
  private Integer fkeyPeriCons;
  private Date fechRelaPeri;

  private CJDVPeritaConsulDto fkeyPeriConsDto;
  private CJD_PersonSistemDto fkeyPersSistDto;

  public CJD_PersonPeritaDto() { 
     PkeyEnti = 188303;
     setAliasName("PersPeri"); 
  } 

//-------------------------------------------| PkeyPersPeri
  public Integer getPkeyPersPeri(){ return pkeyPersPeri; } 
  public Integer getPkeyPersPeriNn(){ return setNotNull(pkeyPersPeri); } 
  public String getPkeyPersPeriDesc(){ return setDesc(pkeyPersPeri); } 
  public void setPkeyPersPeri(Integer value){ this.pkeyPersPeri=value;} 
  @Override
  public int toInt(){ return getPkeyPersPeriNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPersPeri; }; 
//-------------------------------------------| FkeyPersSist
  public Integer getFkeyPersSist(){ return fkeyPersSist; } 
  public Integer getFkeyPersSistNn(){ return setNotNull(fkeyPersSist); } 
  public String getFkeyPersSistDesc(){ return setDesc(fkeyPersSist); } 
  public void setFkeyPersSist(Integer value){ this.fkeyPersSist=value;} 
//-------------------------------------------| FkeyPeriCons
  public Integer getFkeyPeriCons(){ return fkeyPeriCons; } 
  public Integer getFkeyPeriConsNn(){ return setNotNull(fkeyPeriCons); } 
  public String getFkeyPeriConsDesc(){ return setDesc(fkeyPeriCons); } 
  public void setFkeyPeriCons(Integer value){ this.fkeyPeriCons=value;} 
//-------------------------------------------| FechRelaPeri
  public Date getFechRelaPeri(){ return fechRelaPeri; } 
  public Date getFechRelaPeriNn(){ return setNotNull(fechRelaPeri); } 
  public String getFechRelaPeriDesc(){ return setDesc(fechRelaPeri); } 
  public void setFechRelaPeri(Date value){ this.fechRelaPeri=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyPeriConsDto) 
  public CJDVPeritaConsulDto getFkeyPeriConsDto() { return fkeyPeriConsDto; } 
  public void setFkeyPeriConsDto(CJDVPeritaConsulDto fkeyPeriConsDto) {
    if ( fkeyPeriConsDto != null ) { 
      this.fkeyPeriCons = fkeyPeriConsDto.getPkeyPeriCons(); 
    }
    this.fkeyPeriConsDto = fkeyPeriConsDto;
  } 
//---------------------(REL: FkeyPersSistDto) 
  public CJD_PersonSistemDto getFkeyPersSistDto() { return fkeyPersSistDto; } 
  public void setFkeyPersSistDto(CJD_PersonSistemDto fkeyPersSistDto) {
    if ( fkeyPersSistDto != null ) { 
      this.fkeyPersSist = fkeyPersSistDto.getPkeyPersSist(); 
    }
    this.fkeyPersSistDto = fkeyPersSistDto;
  } 


  @Override 
  public CJD_PersonPeritaDto copy(){
    CJD_PersonPeritaDto result = new CJD_PersonPeritaDto();
    result.setPkeyPersPeri( this.getPkeyPersPeri()); 
    result.setFkeyPersSist( this.getFkeyPersSist()); 
    result.setFkeyPeriCons( this.getFkeyPeriCons()); 
    result.setFechRelaPeri( this.getFechRelaPeri()); 
    result.setFkeyPeriConsDto( this.getFkeyPeriConsDto());
    result.setFkeyPersSistDto( this.getFkeyPersSistDto());
    return result;
  }
}

