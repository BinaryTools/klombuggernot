package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.ads.data.* ;
import com.bt.univex.crg.data.* ;

public class CJD_CoordiEstudiDto extends BaseDto {


  private Integer pkeyCoorEstu;
  private Integer fkeyEstudian;
  private Integer fkeyGrupAsig;
  private String estaCoorEstu;

  private ADS_EstudiUniverDto fkeyEstudianDto;
  private CRG_Grupo_AsignaDto fkeyGrupAsigDto;

  public CJD_CoordiEstudiDto() { 
     PkeyEnti = 129403;
     setAliasName("CoorEstu"); 
  } 

//-------------------------------------------| PkeyCoorEstu
  public Integer getPkeyCoorEstu(){ return pkeyCoorEstu; } 
  public Integer getPkeyCoorEstuNn(){ return setNotNull(pkeyCoorEstu); } 
  public String getPkeyCoorEstuDesc(){ return setDesc(pkeyCoorEstu); } 
  public void setPkeyCoorEstu(Integer value){ this.pkeyCoorEstu=value;} 
  @Override
  public int toInt(){ return getPkeyCoorEstuNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyCoorEstu; }; 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| FkeyGrupAsig
  public Integer getFkeyGrupAsig(){ return fkeyGrupAsig; } 
  public Integer getFkeyGrupAsigNn(){ return setNotNull(fkeyGrupAsig); } 
  public String getFkeyGrupAsigDesc(){ return setDesc(fkeyGrupAsig); } 
  public void setFkeyGrupAsig(Integer value){ this.fkeyGrupAsig=value;} 
//-------------------------------------------| EstaCoorEstu
  public String getEstaCoorEstu(){ return estaCoorEstu; } 
  public String getEstaCoorEstuNn(){ return setNotNull(estaCoorEstu); } 
  public String getEstaCoorEstuDesc(){ return setDesc(estaCoorEstu); } 
  public void setEstaCoorEstu(String value){ this.estaCoorEstu=value;} 
  public boolean getEstaCoorEstuBool() { return estaCoorEstu==null?false:estaCoorEstu.equals("S");}
  public void setEstaCoorEstuBool(boolean estaCoorEstu) { this.estaCoorEstu=estaCoorEstu?"S":"N";}
// ---------------(RANGOS) 

//---------------------(REL: FkeyEstudianDto) 
  public ADS_EstudiUniverDto getFkeyEstudianDto() { return fkeyEstudianDto; } 
  public void setFkeyEstudianDto(ADS_EstudiUniverDto fkeyEstudianDto) {
    if ( fkeyEstudianDto != null ) { 
      this.fkeyEstudian = fkeyEstudianDto.getPkeyEstudian(); 
    }
    this.fkeyEstudianDto = fkeyEstudianDto;
  } 
//---------------------(REL: FkeyGrupAsigDto) 
  public CRG_Grupo_AsignaDto getFkeyGrupAsigDto() { return fkeyGrupAsigDto; } 
  public void setFkeyGrupAsigDto(CRG_Grupo_AsignaDto fkeyGrupAsigDto) {
    if ( fkeyGrupAsigDto != null ) { 
      this.fkeyGrupAsig = fkeyGrupAsigDto.getPkeyGrupAsig(); 
    }
    this.fkeyGrupAsigDto = fkeyGrupAsigDto;
  } 


  @Override 
  public CJD_CoordiEstudiDto copy(){
    CJD_CoordiEstudiDto result = new CJD_CoordiEstudiDto();
    result.setPkeyCoorEstu( this.getPkeyCoorEstu()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setEstaCoorEstu( this.getEstaCoorEstu()); 
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    result.setFkeyGrupAsigDto( this.getFkeyGrupAsigDto());
    return result;
  }
}

