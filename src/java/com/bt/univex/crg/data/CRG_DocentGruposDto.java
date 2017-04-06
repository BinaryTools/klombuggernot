package com.bt.univex.crg.data;

import com.bt.univex.ads.data.ADS_DivisiMomentDto ;
import com.xpc.base.BaseDto;

public class CRG_DocentGruposDto extends BaseDto {


  private Integer pkeyDoceGrup;
  private Integer fkeyProfesor;
  private Integer fkeyGrupAsig;
  private Integer fkeyDiviMome;

  private ADS_DivisiMomentDto fkeyDiviMomeDto;
  private CRG_DocentUniverDto fkeyProfesorDto;

  public CRG_DocentGruposDto() { 
     PkeyEnti = 45403;
     setAliasName("DoceGrup"); 
  } 

//-------------------------------------------| PkeyDoceGrup
  public Integer getPkeyDoceGrup(){ return pkeyDoceGrup; } 
  public Integer getPkeyDoceGrupNn(){ return setNotNull(pkeyDoceGrup); } 
  public String getPkeyDoceGrupDesc(){ return setDesc(pkeyDoceGrup); } 
  public void setPkeyDoceGrup(Integer value){ this.pkeyDoceGrup=value;} 
  @Override
  public int toInt(){ return getPkeyDoceGrupNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyDoceGrup; }; 
//-------------------------------------------| FkeyProfesor
  public Integer getFkeyProfesor(){ return fkeyProfesor; } 
  public Integer getFkeyProfesorNn(){ return setNotNull(fkeyProfesor); } 
  public String getFkeyProfesorDesc(){ return setDesc(fkeyProfesor); } 
  public void setFkeyProfesor(Integer value){ this.fkeyProfesor=value;} 
//-------------------------------------------| FkeyGrupAsig
  public Integer getFkeyGrupAsig(){ return fkeyGrupAsig; } 
  public Integer getFkeyGrupAsigNn(){ return setNotNull(fkeyGrupAsig); } 
  public String getFkeyGrupAsigDesc(){ return setDesc(fkeyGrupAsig); } 
  public void setFkeyGrupAsig(Integer value){ this.fkeyGrupAsig=value;} 
//-------------------------------------------| FkeyDiviMome
  public Integer getFkeyDiviMome(){ return fkeyDiviMome; } 
  public Integer getFkeyDiviMomeNn(){ return setNotNull(fkeyDiviMome); } 
  public String getFkeyDiviMomeDesc(){ return setDesc(fkeyDiviMome); } 
  public void setFkeyDiviMome(Integer value){ this.fkeyDiviMome=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyDiviMomeDto) 
  public ADS_DivisiMomentDto getFkeyDiviMomeDto() { return fkeyDiviMomeDto; } 
  public void setFkeyDiviMomeDto(ADS_DivisiMomentDto fkeyDiviMomeDto) {
    if ( fkeyDiviMomeDto != null ) { 
      this.fkeyDiviMome = fkeyDiviMomeDto.getPkeyDiviMome(); 
    }
    this.fkeyDiviMomeDto = fkeyDiviMomeDto;
  } 
//---------------------(REL: FkeyProfesorDto) 
  public CRG_DocentUniverDto getFkeyProfesorDto() { return fkeyProfesorDto; } 
  public void setFkeyProfesorDto(CRG_DocentUniverDto fkeyProfesorDto) {
    if ( fkeyProfesorDto != null ) { 
      this.fkeyProfesor = fkeyProfesorDto.getPkeyProfesor(); 
    }
    this.fkeyProfesorDto = fkeyProfesorDto;
  } 


  @Override 
  public CRG_DocentGruposDto copy(){
    CRG_DocentGruposDto result = new CRG_DocentGruposDto();
    result.setPkeyDoceGrup( this.getPkeyDoceGrup()); 
    result.setFkeyProfesor( this.getFkeyProfesor()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setFkeyDiviMome( this.getFkeyDiviMome()); 
    result.setFkeyDiviMomeDto( this.getFkeyDiviMomeDto());
    result.setFkeyProfesorDto( this.getFkeyProfesorDto());
    return result;
  }
}
