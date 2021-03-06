package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.crg.data.* ;

public class CJDVDocentEspeciDto extends BaseDto {
  public static final List RANG_DoceEspecial = Arrays.asList( new Range[] { 
      new Range("P","Público"),
      new Range("C","Civil"),
      new Range("E","Penal"),
      new Range("L","Laboral"),
      new Range("O","Concilicación")});


  private Integer pkeyDoceEspe;
  private Integer fkeyProfesor;
  private String doceEspecial;
  private String estaDoceActi;
  private String nombCompProf;
  private String codiDoceUniv;
  private Integer cantProcDoce;
  private Integer cantConsDoce;
  private String docentCoordi;
  private Integer cantPeriDoce;

  private CRG_DocentUniverDto fkeyProfesorDto;

  public CJDVDocentEspeciDto() { 
     PkeyEnti = 131803;
     setAliasName("DoceEspeV"); 
  } 

//-------------------------------------------| PkeyDoceEspe
  public Integer getPkeyDoceEspe(){ return pkeyDoceEspe; } 
  public Integer getPkeyDoceEspeNn(){ return setNotNull(pkeyDoceEspe); } 
  public String getPkeyDoceEspeDesc(){ return setDesc(pkeyDoceEspe); } 
  public void setPkeyDoceEspe(Integer value){ this.pkeyDoceEspe=value;} 
  @Override
  public int toInt(){ return getPkeyDoceEspeNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyDoceEspe; }; 
//-------------------------------------------| FkeyProfesor
  public Integer getFkeyProfesor(){ return fkeyProfesor; } 
  public Integer getFkeyProfesorNn(){ return setNotNull(fkeyProfesor); } 
  public String getFkeyProfesorDesc(){ return setDesc(fkeyProfesor); } 
  public void setFkeyProfesor(Integer value){ this.fkeyProfesor=value;} 
//-------------------------------------------| DoceEspecial
  public String getDoceEspecial(){ return doceEspecial; } 
  public String getDoceEspecialNn(){ return setNotNull(doceEspecial); } 
  public void setDoceEspecial(String value){ this.doceEspecial=value;} 
//-------------------------------------------| EstaDoceActi
  public String getEstaDoceActi(){ return estaDoceActi; } 
  public String getEstaDoceActiNn(){ return setNotNull(estaDoceActi); } 
  public String getEstaDoceActiDesc(){ return setDesc(estaDoceActi); } 
  public void setEstaDoceActi(String value){ this.estaDoceActi=value;} 
  public boolean getEstaDoceActiBool() { return estaDoceActi==null?false:estaDoceActi.equals("S");}
  public void setEstaDoceActiBool(boolean estaDoceActi) { this.estaDoceActi=estaDoceActi?"S":"N";}
//-------------------------------------------| NombCompProf
  public String getNombCompProf(){ return nombCompProf; } 
  public String getNombCompProfNn(){ return setNotNull(nombCompProf); } 
  public String getNombCompProfDesc(){ return setDesc(nombCompProf); } 
  public void setNombCompProf(String value){ this.nombCompProf=value;} 
  @Override
  public String toString(){ return getNombCompProf(); }; 
//-------------------------------------------| CodiDoceUniv
  public String getCodiDoceUniv(){ return codiDoceUniv; } 
  public String getCodiDoceUnivNn(){ return setNotNull(codiDoceUniv); } 
  public String getCodiDoceUnivDesc(){ return setDesc(codiDoceUniv); } 
  public void setCodiDoceUniv(String value){ this.codiDoceUniv=value;} 
//-------------------------------------------| CantProcDoce
  public Integer getCantProcDoce(){ return cantProcDoce; } 
  public Integer getCantProcDoceNn(){ return setNotNull(cantProcDoce); } 
  public String getCantProcDoceDesc(){ return setDesc(cantProcDoce); } 
  public void setCantProcDoce(Integer value){ this.cantProcDoce=value;} 
//-------------------------------------------| CantConsDoce
  public Integer getCantConsDoce(){ return cantConsDoce; } 
  public Integer getCantConsDoceNn(){ return setNotNull(cantConsDoce); } 
  public String getCantConsDoceDesc(){ return setDesc(cantConsDoce); } 
  public void setCantConsDoce(Integer value){ this.cantConsDoce=value;} 
//-------------------------------------------| DocentCoordi
  public String getDocentCoordi(){ return docentCoordi; } 
  public String getDocentCoordiNn(){ return setNotNull(docentCoordi); } 
  public String getDocentCoordiDesc(){ return setDesc(docentCoordi); } 
  public void setDocentCoordi(String value){ this.docentCoordi=value;} 
  public boolean getDocentCoordiBool() { return docentCoordi==null?false:docentCoordi.equals("S");}
  public void setDocentCoordiBool(boolean docentCoordi) { this.docentCoordi=docentCoordi?"S":"N";}
//-------------------------------------------| CantPeriDoce
  public Integer getCantPeriDoce(){ return cantPeriDoce; } 
  public Integer getCantPeriDoceNn(){ return setNotNull(cantPeriDoce); } 
  public String getCantPeriDoceDesc(){ return setDesc(cantPeriDoce); } 
  public void setCantPeriDoce(Integer value){ this.cantPeriDoce=value;} 
// ---------------(RANGOS) 
  public String getDoceEspecialDesc() { return DtoMisc.getRangeDesc(RANG_DoceEspecial,getDoceEspecialNn()); } 

//---------------------(REL: FkeyProfesorDto) 
  public CRG_DocentUniverDto getFkeyProfesorDto() { return fkeyProfesorDto; } 
  public void setFkeyProfesorDto(CRG_DocentUniverDto fkeyProfesorDto) {
    if ( fkeyProfesorDto != null ) { 
      this.fkeyProfesor = fkeyProfesorDto.getPkeyProfesor(); 
    }
    this.fkeyProfesorDto = fkeyProfesorDto;
  } 


  @Override 
  public CJDVDocentEspeciDto copy(){
    CJDVDocentEspeciDto result = new CJDVDocentEspeciDto();
    result.setPkeyDoceEspe( this.getPkeyDoceEspe()); 
    result.setFkeyProfesor( this.getFkeyProfesor()); 
    result.setDoceEspecial( this.getDoceEspecial()); 
    result.setEstaDoceActi( this.getEstaDoceActi()); 
    result.setNombCompProf( this.getNombCompProf()); 
    result.setCodiDoceUniv( this.getCodiDoceUniv()); 
    result.setCantProcDoce( this.getCantProcDoce()); 
    result.setCantConsDoce( this.getCantConsDoce()); 
    result.setDocentCoordi( this.getDocentCoordi()); 
    result.setCantPeriDoce( this.getCantPeriDoce()); 
    result.setFkeyProfesorDto( this.getFkeyProfesorDto());
    return result;
  }
}

