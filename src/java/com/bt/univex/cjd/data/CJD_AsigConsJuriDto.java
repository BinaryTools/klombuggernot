package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.crg.data.* ;

public class CJD_AsigConsJuriDto extends BaseDto {


  private Integer pkeyAsigCons;
  private Integer fkeyGrupAsig;

  private CRGVGrupo_AsignaDto fkeyGrupAsigDto;

  public CJD_AsigConsJuriDto() { 
     PkeyEnti = 129803;
     setAliasName("AsigCons"); 
  } 

//-------------------------------------------| PkeyAsigCons
  public Integer getPkeyAsigCons(){ return pkeyAsigCons; } 
  public Integer getPkeyAsigConsNn(){ return setNotNull(pkeyAsigCons); } 
  public String getPkeyAsigConsDesc(){ return setDesc(pkeyAsigCons); } 
  public void setPkeyAsigCons(Integer value){ this.pkeyAsigCons=value;} 
  @Override
  public int toInt(){ return getPkeyAsigConsNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyAsigCons; }; 
//-------------------------------------------| FkeyGrupAsig
  public Integer getFkeyGrupAsig(){ return fkeyGrupAsig; } 
  public Integer getFkeyGrupAsigNn(){ return setNotNull(fkeyGrupAsig); } 
  public String getFkeyGrupAsigDesc(){ return setDesc(fkeyGrupAsig); } 
  public void setFkeyGrupAsig(Integer value){ this.fkeyGrupAsig=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyGrupAsigDto) 
  public CRGVGrupo_AsignaDto getFkeyGrupAsigDto() { return fkeyGrupAsigDto; } 
  public void setFkeyGrupAsigDto(CRGVGrupo_AsignaDto fkeyGrupAsigDto) {
    if ( fkeyGrupAsigDto != null ) { 
      this.fkeyGrupAsig = fkeyGrupAsigDto.getPkeyGrupAsig(); 
    }
    this.fkeyGrupAsigDto = fkeyGrupAsigDto;
  } 


  @Override 
  public CJD_AsigConsJuriDto copy(){
    CJD_AsigConsJuriDto result = new CJD_AsigConsJuriDto();
    result.setPkeyAsigCons( this.getPkeyAsigCons()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setFkeyGrupAsigDto( this.getFkeyGrupAsigDto());
    return result;
  }
}

