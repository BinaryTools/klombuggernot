package com.bt.univex.crg.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.crg.data.*;

public class CRGVDocentGruposDto extends BaseDto {


  private Integer pkeyDoceGrup;
  private Integer pkeyProfesor;
  private Integer fkeyProfesor;
  private Integer fkeyUnidAcad;
  private Integer fkeyGrupAsig;
  private String nombCompProf;
  private String nombMomento_;
  private Integer ordeDebeReci;
  private String tipoMomento_;


  public CRGVDocentGruposDto() { 
     PkeyEnti = 45903;
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
//-------------------------------------------| PkeyProfesor
  public Integer getPkeyProfesor(){ return pkeyProfesor; } 
  public Integer getPkeyProfesorNn(){ return setNotNull(pkeyProfesor); } 
  public String getPkeyProfesorDesc(){ return setDesc(pkeyProfesor); } 
  public void setPkeyProfesor(Integer value){ this.pkeyProfesor=value;} 
//-------------------------------------------| FkeyProfesor
  public Integer getFkeyProfesor(){ return fkeyProfesor; } 
  public Integer getFkeyProfesorNn(){ return setNotNull(fkeyProfesor); } 
  public String getFkeyProfesorDesc(){ return setDesc(fkeyProfesor); } 
  public void setFkeyProfesor(Integer value){ this.fkeyProfesor=value;} 
//-------------------------------------------| FkeyUnidAcad
  public Integer getFkeyUnidAcad(){ return fkeyUnidAcad; } 
  public Integer getFkeyUnidAcadNn(){ return setNotNull(fkeyUnidAcad); } 
  public String getFkeyUnidAcadDesc(){ return setDesc(fkeyUnidAcad); } 
  public void setFkeyUnidAcad(Integer value){ this.fkeyUnidAcad=value;} 
//-------------------------------------------| FkeyGrupAsig
  public Integer getFkeyGrupAsig(){ return fkeyGrupAsig; } 
  public Integer getFkeyGrupAsigNn(){ return setNotNull(fkeyGrupAsig); } 
  public String getFkeyGrupAsigDesc(){ return setDesc(fkeyGrupAsig); } 
  public void setFkeyGrupAsig(Integer value){ this.fkeyGrupAsig=value;} 
//-------------------------------------------| NombCompProf
  public String getNombCompProf(){ return nombCompProf; } 
  public String getNombCompProfNn(){ return setNotNull(nombCompProf); } 
  public String getNombCompProfDesc(){ return setDesc(nombCompProf); } 
  public void setNombCompProf(String value){ this.nombCompProf=value;} 
  @Override
  public String toString(){ return getNombCompProfNn(); }; 
//-------------------------------------------| NombMomento_
  public String getNombMomento_(){ return nombMomento_; } 
  public String getNombMomento_Nn(){ return setNotNull(nombMomento_); } 
  public String getNombMomento_Desc(){ return setDesc(nombMomento_); } 
  public void setNombMomento_(String value){ this.nombMomento_=value;} 
//-------------------------------------------| OrdeDebeReci
  public Integer getOrdeDebeReci(){ return ordeDebeReci; } 
  public Integer getOrdeDebeReciNn(){ return setNotNull(ordeDebeReci); } 
  public String getOrdeDebeReciDesc(){ return setDesc(ordeDebeReci); } 
  public void setOrdeDebeReci(Integer value){ this.ordeDebeReci=value;} 
//-------------------------------------------| TipoMomento_
  public String getTipoMomento_(){ return tipoMomento_; } 
  public String getTipoMomento_Nn(){ return setNotNull(tipoMomento_); } 
  public String getTipoMomento_Desc(){ return setDesc(tipoMomento_); } 
  public void setTipoMomento_(String value){ this.tipoMomento_=value;} 
// ---------------(RANGOS) 



  @Override 
  public CRGVDocentGruposDto copy(){
    CRGVDocentGruposDto result = new CRGVDocentGruposDto();
    result.setPkeyDoceGrup( this.getPkeyDoceGrup()); 
    result.setPkeyProfesor( this.getPkeyProfesor()); 
    result.setFkeyProfesor( this.getFkeyProfesor()); 
    result.setFkeyUnidAcad( this.getFkeyUnidAcad()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setNombCompProf( this.getNombCompProf()); 
    result.setNombMomento_( this.getNombMomento_()); 
    result.setOrdeDebeReci( this.getOrdeDebeReci()); 
    result.setTipoMomento_( this.getTipoMomento_()); 
    return result;
  }
}

