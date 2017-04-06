package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;

public class CJD_ContIngrEstuDto extends BaseDto {


  private Integer pkeyContIngr;
  private Integer fkeyConsSist;
  private Date fechHaceModi;
  private String descModiEstu;
  private Date fechCreaRegi;

  private CJDVConsulSistemDto fkeyConsSistDto;

  public CJD_ContIngrEstuDto() { 
     PkeyEnti = 228603;
     setAliasName("ConIngEst"); 
  } 

//-------------------------------------------| PkeyContIngr
  public Integer getPkeyContIngr(){ return pkeyContIngr; } 
  public Integer getPkeyContIngrNn(){ return setNotNull(pkeyContIngr); } 
  public String getPkeyContIngrDesc(){ return setDesc(pkeyContIngr); } 
  public void setPkeyContIngr(Integer value){ this.pkeyContIngr=value;} 
  @Override
  public int toInt(){ return getPkeyContIngrNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyContIngr; }; 
//-------------------------------------------| FkeyConsSist
  public Integer getFkeyConsSist(){ return fkeyConsSist; } 
  public Integer getFkeyConsSistNn(){ return setNotNull(fkeyConsSist); } 
  public String getFkeyConsSistDesc(){ return setDesc(fkeyConsSist); } 
  public void setFkeyConsSist(Integer value){ this.fkeyConsSist=value;} 
//-------------------------------------------| FechHaceModi
  public Date getFechHaceModi(){ return fechHaceModi; } 
  public Date getFechHaceModiNn(){ return setNotNull(fechHaceModi); } 
  public String getFechHaceModiDesc(){ return setDesc(fechHaceModi); } 
  public void setFechHaceModi(Date value){ this.fechHaceModi=value;} 
//-------------------------------------------| DescModiEstu
  public String getDescModiEstu(){ return descModiEstu; } 
  public String getDescModiEstuNn(){ return setNotNull(descModiEstu); } 
  public String getDescModiEstuDesc(){ return setDesc(descModiEstu); } 
  public void setDescModiEstu(String value){ this.descModiEstu=value;} 
//-------------------------------------------| FechCreaRegi
  public Date getFechCreaRegi(){ return fechCreaRegi; } 
  public Date getFechCreaRegiNn(){ return setNotNull(fechCreaRegi); } 
  public String getFechCreaRegiDesc(){ return setDesc(fechCreaRegi); } 
  public void setFechCreaRegi(Date value){ this.fechCreaRegi=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyConsSistDto) 
  public CJDVConsulSistemDto getFkeyConsSistDto() { return fkeyConsSistDto; } 
  public void setFkeyConsSistDto(CJDVConsulSistemDto fkeyConsSistDto) {
    if ( fkeyConsSistDto != null ) { 
      this.fkeyConsSist = fkeyConsSistDto.getPkeyConsSist(); 
    }
    this.fkeyConsSistDto = fkeyConsSistDto;
  } 


  @Override 
  public CJD_ContIngrEstuDto copy(){
    CJD_ContIngrEstuDto result = new CJD_ContIngrEstuDto();
    result.setPkeyContIngr( this.getPkeyContIngr()); 
    result.setFkeyConsSist( this.getFkeyConsSist()); 
    result.setFechHaceModi( this.getFechHaceModi()); 
    result.setDescModiEstu( this.getDescModiEstu()); 
    result.setFechCreaRegi( this.getFechCreaRegi()); 
    result.setFkeyConsSistDto( this.getFkeyConsSistDto());
    return result;
  }
}

