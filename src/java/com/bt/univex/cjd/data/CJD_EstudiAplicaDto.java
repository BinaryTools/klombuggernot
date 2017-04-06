package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.ads.data.* ;

public class CJD_EstudiAplicaDto extends BaseDto {


  private Integer pkeyEstuApli;
  private Integer fkeyEstudian;
  private Date fechCertEstu;

  private ADS_EstudiUniverDto fkeyEstudianDto;

  public CJD_EstudiAplicaDto() { 
     PkeyEnti = 129603;
     setAliasName("EstuApli"); 
  } 

//-------------------------------------------| PkeyEstuApli
  public Integer getPkeyEstuApli(){ return pkeyEstuApli; } 
  public Integer getPkeyEstuApliNn(){ return setNotNull(pkeyEstuApli); } 
  public String getPkeyEstuApliDesc(){ return setDesc(pkeyEstuApli); } 
  public void setPkeyEstuApli(Integer value){ this.pkeyEstuApli=value;} 
  @Override
  public int toInt(){ return getPkeyEstuApliNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyEstuApli; }; 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| FechCertEstu
  public Date getFechCertEstu(){ return fechCertEstu; } 
  public Date getFechCertEstuNn(){ return setNotNull(fechCertEstu); } 
  public String getFechCertEstuDesc(){ return setDesc(fechCertEstu); } 
  public void setFechCertEstu(Date value){ this.fechCertEstu=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyEstudianDto) 
  public ADS_EstudiUniverDto getFkeyEstudianDto() { return fkeyEstudianDto; } 
  public void setFkeyEstudianDto(ADS_EstudiUniverDto fkeyEstudianDto) {
    if ( fkeyEstudianDto != null ) { 
      this.fkeyEstudian = fkeyEstudianDto.getPkeyEstudian(); 
    }
    this.fkeyEstudianDto = fkeyEstudianDto;
  } 


  @Override 
  public CJD_EstudiAplicaDto copy(){
    CJD_EstudiAplicaDto result = new CJD_EstudiAplicaDto();
    result.setPkeyEstuApli( this.getPkeyEstuApli()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFechCertEstu( this.getFechCertEstu()); 
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    return result;
  }
}

