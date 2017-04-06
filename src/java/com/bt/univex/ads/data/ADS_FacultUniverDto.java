package com.bt.univex.ads.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;
import com.bt.univex.ads.data.* ;

public class ADS_FacultUniverDto extends BaseDto {
  public static final List RANG_Si_No = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Si")});


  private Integer pkeyFacuUniv;
  private Integer fkeyRegiUniv;
  private Integer codiFacuUniv;
  private String nombFacuUniv;
  private String estaActiFacu;

//  private ADS_Regiona_UnivDto fkeyRegiUnivDto;

  public ADS_FacultUniverDto() { 
     PkeyEnti = 5403;
     setAliasName("Facultad"); 
  } 

//-------------------------------------------| PkeyFacuUniv
  public Integer getPkeyFacuUniv(){ return pkeyFacuUniv; } 
  public Integer getPkeyFacuUnivNn(){ return setNotNull(pkeyFacuUniv); } 
  public String getPkeyFacuUnivDesc(){ return setDesc(pkeyFacuUniv); } 
  public void setPkeyFacuUniv(Integer value){ this.pkeyFacuUniv=value;} 
  @Override
  public int toInt(){ return getPkeyFacuUnivNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyFacuUniv; }; 
//-------------------------------------------| FkeyRegiUniv
  public Integer getFkeyRegiUniv(){ return fkeyRegiUniv; } 
  public Integer getFkeyRegiUnivNn(){ return setNotNull(fkeyRegiUniv); } 
  public String getFkeyRegiUnivDesc(){ return setDesc(fkeyRegiUniv); } 
  public void setFkeyRegiUniv(Integer value){ this.fkeyRegiUniv=value;} 
//-------------------------------------------| CodiFacuUniv
  public Integer getCodiFacuUniv(){ return codiFacuUniv; } 
  public Integer getCodiFacuUnivNn(){ return setNotNull(codiFacuUniv); } 
  public String getCodiFacuUnivDesc(){ return setDesc(codiFacuUniv); } 
  public void setCodiFacuUniv(Integer value){ this.codiFacuUniv=value;} 
//-------------------------------------------| NombFacuUniv
  public String getNombFacuUniv(){ return nombFacuUniv; } 
  public String getNombFacuUnivNn(){ return setNotNull(nombFacuUniv); } 
  public String getNombFacuUnivDesc(){ return setDesc(nombFacuUniv); } 
  public void setNombFacuUniv(String value){ this.nombFacuUniv=value;} 
  @Override
  public String toString(){ return getNombFacuUnivNn(); }; 
//-------------------------------------------| EstaActiFacu
  public String getEstaActiFacu(){ return estaActiFacu; } 
  public String getEstaActiFacuNn(){ return setNotNull(estaActiFacu); } 
  public void setEstaActiFacu(String value){ this.estaActiFacu=value;} 
// ---------------(RANGOS) 
  public String getEstaActiFacuDesc() { return DtoMisc.getRangeDesc(RANG_Si_No,getEstaActiFacuNn()); } 

//---------------------(REL: FkeyRegiUnivDto) 
//  public ADS_Regiona_UnivDto getFkeyRegiUnivDto() { return fkeyRegiUnivDto; } 
//  public void setFkeyRegiUnivDto(ADS_Regiona_UnivDto fkeyRegiUnivDto) {
//    if ( fkeyRegiUnivDto != null ) { 
//      this.fkeyRegiUniv = fkeyRegiUnivDto.getPkeyRegional(); 
//    }
//    this.fkeyRegiUnivDto = fkeyRegiUnivDto;
//  } 


  @Override 
  public ADS_FacultUniverDto copy(){
    ADS_FacultUniverDto result = new ADS_FacultUniverDto();
    result.setPkeyFacuUniv( this.getPkeyFacuUniv()); 
    result.setFkeyRegiUniv( this.getFkeyRegiUniv()); 
    result.setCodiFacuUniv( this.getCodiFacuUniv()); 
    result.setNombFacuUniv( this.getNombFacuUniv()); 
    result.setEstaActiFacu( this.getEstaActiFacu()); 
//    result.setFkeyRegiUnivDto( this.getFkeyRegiUnivDto());
    return result;
  }
}

