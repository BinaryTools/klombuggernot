package com.bt.univex.ads.data;

import com.xpc.base.*; 

public class ADS_Munici_DeparDto extends BaseDto {


  private Integer pkeyMunicipi;
  private Integer fkeyDepartam;
  private String codiMunicipi;
  private String nombMunicipi;

  private ADS_DepartamentoDto fkeyDepartamDto;

  public ADS_Munici_DeparDto() { 
     PkeyEnti = 4503;
     setAliasName("Municipi"); 
  } 

//-------------------------------------------| PkeyMunicipi
  public Integer getPkeyMunicipi(){ return pkeyMunicipi; } 
  public Integer getPkeyMunicipiNn(){ return setNotNull(pkeyMunicipi); } 
  public String getPkeyMunicipiDesc(){ return setDesc(pkeyMunicipi); } 
  public void setPkeyMunicipi(Integer value){ this.pkeyMunicipi=value;} 
  @Override
  public int toInt(){ return getPkeyMunicipiNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyMunicipi; }; 
//-------------------------------------------| FkeyDepartam
  public Integer getFkeyDepartam(){ return fkeyDepartam; } 
  public Integer getFkeyDepartamNn(){ return setNotNull(fkeyDepartam); } 
  public String getFkeyDepartamDesc(){ return setDesc(fkeyDepartam); } 
  public void setFkeyDepartam(Integer value){ this.fkeyDepartam=value;} 
//-------------------------------------------| CodiMunicipi
  public String getCodiMunicipi(){ return codiMunicipi; } 
  public String getCodiMunicipiNn(){ return setNotNull(codiMunicipi); } 
  public String getCodiMunicipiDesc(){ return setDesc(codiMunicipi); } 
  public void setCodiMunicipi(String value){ this.codiMunicipi=value;} 
//-------------------------------------------| NombMunicipi
  public String getNombMunicipi(){ return nombMunicipi; } 
  public String getNombMunicipiNn(){ return setNotNull(nombMunicipi); } 
  public String getNombMunicipiDesc(){ return setDesc(nombMunicipi); } 
  public void setNombMunicipi(String value){ this.nombMunicipi=value;} 
  @Override
  public String toString(){ return getNombMunicipi(); }; 
// ---------------(RANGOS) 

//---------------------(REL: FkeyDepartamDto) 
  public ADS_DepartamentoDto getFkeyDepartamDto() { return fkeyDepartamDto; } 
  public void setFkeyDepartamDto(ADS_DepartamentoDto fkeyDepartamDto) {
    if ( fkeyDepartamDto != null ) { 
      this.fkeyDepartam = fkeyDepartamDto.getPkeyDepartam(); 
    }
    this.fkeyDepartamDto = fkeyDepartamDto;
  } 


  @Override 
  public ADS_Munici_DeparDto copy(){
    ADS_Munici_DeparDto result = new ADS_Munici_DeparDto();
    result.setPkeyMunicipi( this.getPkeyMunicipi()); 
    result.setFkeyDepartam( this.getFkeyDepartam()); 
    result.setCodiMunicipi( this.getCodiMunicipi()); 
    result.setNombMunicipi( this.getNombMunicipi()); 
    result.setFkeyDepartamDto( this.getFkeyDepartamDto());
    return result;
  }
}

