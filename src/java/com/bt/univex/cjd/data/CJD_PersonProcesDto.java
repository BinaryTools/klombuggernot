package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.cjd.data.* ;

public class CJD_PersonProcesDto extends BaseDto {


  private Integer pkeyPersProc;
  private Integer fkeyPersSist;
  private Integer fkeyProcCons;
  private Date fechRelaProc;

  private CJD_ProcesConsulDto fkeyProcConsDto;
  private CJD_PersonSistemDto fkeyPersSistDto;

  public CJD_PersonProcesDto() { 
     PkeyEnti = 128903;
     setAliasName("PersProc"); 
  } 

//-------------------------------------------| PkeyPersProc
  public Integer getPkeyPersProc(){ return pkeyPersProc; } 
  public Integer getPkeyPersProcNn(){ return setNotNull(pkeyPersProc); } 
  public String getPkeyPersProcDesc(){ return setDesc(pkeyPersProc); } 
  public void setPkeyPersProc(Integer value){ this.pkeyPersProc=value;} 
  @Override
  public int toInt(){ return getPkeyPersProcNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPersProc; }; 
//-------------------------------------------| FkeyPersSist
  public Integer getFkeyPersSist(){ return fkeyPersSist; } 
  public Integer getFkeyPersSistNn(){ return setNotNull(fkeyPersSist); } 
  public String getFkeyPersSistDesc(){ return setDesc(fkeyPersSist); } 
  public void setFkeyPersSist(Integer value){ this.fkeyPersSist=value;} 
//-------------------------------------------| FkeyProcCons
  public Integer getFkeyProcCons(){ return fkeyProcCons; } 
  public Integer getFkeyProcConsNn(){ return setNotNull(fkeyProcCons); } 
  public String getFkeyProcConsDesc(){ return setDesc(fkeyProcCons); } 
  public void setFkeyProcCons(Integer value){ this.fkeyProcCons=value;} 
//-------------------------------------------| FechRelaProc
  public Date getFechRelaProc(){ return fechRelaProc; } 
  public Date getFechRelaProcNn(){ return setNotNull(fechRelaProc); } 
  public String getFechRelaProcDesc(){ return setDesc(fechRelaProc); } 
  public void setFechRelaProc(Date value){ this.fechRelaProc=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyProcConsDto) 
  public CJD_ProcesConsulDto getFkeyProcConsDto() { return fkeyProcConsDto; } 
  public void setFkeyProcConsDto(CJD_ProcesConsulDto fkeyProcConsDto) {
    if ( fkeyProcConsDto != null ) { 
      this.fkeyProcCons = fkeyProcConsDto.getPkeyProcCons(); 
    }
    this.fkeyProcConsDto = fkeyProcConsDto;
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
  public CJD_PersonProcesDto copy(){
    CJD_PersonProcesDto result = new CJD_PersonProcesDto();
    result.setPkeyPersProc( this.getPkeyPersProc()); 
    result.setFkeyPersSist( this.getFkeyPersSist()); 
    result.setFkeyProcCons( this.getFkeyProcCons()); 
    result.setFechRelaProc( this.getFechRelaProc()); 
    result.setFkeyProcConsDto( this.getFkeyProcConsDto());
    result.setFkeyPersSistDto( this.getFkeyPersSistDto());
    return result;
  }
}

