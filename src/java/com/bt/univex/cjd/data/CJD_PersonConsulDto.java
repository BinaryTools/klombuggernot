package com.bt.univex.cjd.data;

import com.xpc.base.*; 

public class CJD_PersonConsulDto extends BaseDto {


  private Integer pkeyPersCons;
  private Integer fkeyPersSist;
  private Integer fkeyConsSist;

  private CJD_ConsulSistemDto fkeyConsSistDto;
  private CJD_PersonSistemDto fkeyPersSistDto;

  public CJD_PersonConsulDto() { 
     PkeyEnti = 129103;
     setAliasName("PersCons"); 
  } 

//-------------------------------------------| PkeyPersCons
  public Integer getPkeyPersCons(){ return pkeyPersCons; } 
  public Integer getPkeyPersConsNn(){ return setNotNull(pkeyPersCons); } 
  public String getPkeyPersConsDesc(){ return setDesc(pkeyPersCons); } 
  public void setPkeyPersCons(Integer value){ this.pkeyPersCons=value;} 
  @Override
  public int toInt(){ return getPkeyPersConsNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPersCons; }; 
//-------------------------------------------| FkeyPersSist
  public Integer getFkeyPersSist(){ return fkeyPersSist; } 
  public Integer getFkeyPersSistNn(){ return setNotNull(fkeyPersSist); } 
  public String getFkeyPersSistDesc(){ return setDesc(fkeyPersSist); } 
  public void setFkeyPersSist(Integer value){ this.fkeyPersSist=value;} 
//-------------------------------------------| FkeyConsSist
  public Integer getFkeyConsSist(){ return fkeyConsSist; } 
  public Integer getFkeyConsSistNn(){ return setNotNull(fkeyConsSist); } 
  public String getFkeyConsSistDesc(){ return setDesc(fkeyConsSist); } 
  public void setFkeyConsSist(Integer value){ this.fkeyConsSist=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyConsSistDto) 
  public CJD_ConsulSistemDto getFkeyConsSistDto() { return fkeyConsSistDto; } 
  public void setFkeyConsSistDto(CJD_ConsulSistemDto fkeyConsSistDto) {
    if ( fkeyConsSistDto != null ) { 
      this.fkeyConsSist = fkeyConsSistDto.getPkeyConsSist(); 
    }
    this.fkeyConsSistDto = fkeyConsSistDto;
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
  public CJD_PersonConsulDto copy(){
    CJD_PersonConsulDto result = new CJD_PersonConsulDto();
    result.setPkeyPersCons( this.getPkeyPersCons()); 
    result.setFkeyPersSist( this.getFkeyPersSist()); 
    result.setFkeyConsSist( this.getFkeyConsSist()); 
    result.setFkeyConsSistDto( this.getFkeyConsSistDto());
    result.setFkeyPersSistDto( this.getFkeyPersSistDto());
    return result;
  }
}

