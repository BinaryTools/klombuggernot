package com.bt.univex.crg.data;

import com.xpc.base.BaseDto; 
import com.xpc.base.Range;
import com.xpc.utilities.DtoMisc;
import java.util.Arrays;
import java.util.List;

public class CRG_DocentUniverDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});
  public static final List RANG_TipoDedi = Arrays.asList( new Range[] { 
      new Range("C","Cátedra"),
      new Range("C","Tiempo Completo"),
      new Range("H","Hora Catedra"),
      new Range("M","Medio Tiempo"),
      new Range("O","Ocasional"),
      new Range("S","Orde de Servicio")});
  public static final List RANG_TipoDocu = Arrays.asList( new Range[] { 
      new Range("C","Cédula de Ciudadanía"),
      new Range("E","Cédula de Extranjeria"),
      new Range("N","NUI"),
      new Range("P","Pasaporte"),
      new Range("R","Registro Civil"),
      new Range("T","Tarjeta de Identidad")});
  public static final List RANG_TipoDoceHoja = Arrays.asList( new Range[] { 
      new Range("A","Antiguo"),
      new Range("N","Nuevo")});
 

  private Integer pkeyProfesor;
  private Integer fkeyUnidAcad;
  private Integer fkeyDoceUniv;
  private Integer codiDoceUniv;
  private String estaActiProf;
  private String nombCompProf;
  private String tipoDediDoce;
  private String logiAcceSist;
  private String passAcceSist;
  private String mailProfesor;
  private String primApelProf;
  private String seguApelProf;
  private String tipoDocuProf;
  private Integer fkeyMuniDocu;
  private Integer fkeyEscaDoce;
  private String nombProfesor;
  private String tipoDoceHoja;

//  private PRF_EscalaDocentDto fkeyEscaDoceDto;

  public CRG_DocentUniverDto() { 
     PkeyEnti = 15603;
     setAliasName("Profesor"); 
  } 

//-------------------------------------------| PkeyProfesor
  public Integer getPkeyProfesor(){ return pkeyProfesor; } 
  public Integer getPkeyProfesorNn(){ return setNotNull(pkeyProfesor); } 
  public String getPkeyProfesorDesc(){ return setDesc(pkeyProfesor); } 
  public void setPkeyProfesor(Integer value){ this.pkeyProfesor=value;} 
  @Override
  public int toInt(){ return getPkeyProfesorNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyProfesor; }; 
//-------------------------------------------| FkeyUnidAcad
  public Integer getFkeyUnidAcad(){ return fkeyUnidAcad; } 
  public Integer getFkeyUnidAcadNn(){ return setNotNull(fkeyUnidAcad); } 
  public String getFkeyUnidAcadDesc(){ return setDesc(fkeyUnidAcad); } 
  public void setFkeyUnidAcad(Integer value){ this.fkeyUnidAcad=value;} 
//-------------------------------------------| FkeyDoceUniv
  public Integer getFkeyDoceUniv(){ return fkeyDoceUniv; } 
  public Integer getFkeyDoceUnivNn(){ return setNotNull(fkeyDoceUniv); } 
  public String getFkeyDoceUnivDesc(){ return setDesc(fkeyDoceUniv); } 
  public void setFkeyDoceUniv(Integer value){ this.fkeyDoceUniv=value;} 
//-------------------------------------------| CodiDoceUniv
  public Integer getCodiDoceUniv(){ return codiDoceUniv; } 
  public Integer getCodiDoceUnivNn(){ return setNotNull(codiDoceUniv); } 
  public String getCodiDoceUnivDesc(){ return setDesc(codiDoceUniv); } 
  public void setCodiDoceUniv(Integer value){ this.codiDoceUniv=value;} 
//-------------------------------------------| EstaActiProf
  public String getEstaActiProf(){ return estaActiProf; } 
  public String getEstaActiProfNn(){ return setNotNull(estaActiProf); } 
  public void setEstaActiProf(String value){ this.estaActiProf=value;} 
  public boolean getEstaActiProfBool() { return estaActiProf==null?false:estaActiProf.equals("S");}
  public void setEstaActiProfBool(boolean estaActiProf) { this.estaActiProf=estaActiProf?"S":"N";}
//-------------------------------------------| NombCompProf
  public String getNombCompProf(){ return nombCompProf; } 
  public String getNombCompProfNn(){ return setNotNull(nombCompProf); } 
  public String getNombCompProfDesc(){ return setDesc(nombCompProf); } 
  public void setNombCompProf(String value){ this.nombCompProf=value;} 
  @Override
  public String toString(){ return getNombCompProfNn(); }; 
//-------------------------------------------| TipoDediDoce
  public String getTipoDediDoce(){ return tipoDediDoce; } 
  public String getTipoDediDoceNn(){ return setNotNull(tipoDediDoce); } 
  public void setTipoDediDoce(String value){ this.tipoDediDoce=value;} 
//-------------------------------------------| LogiAcceSist
  public String getLogiAcceSist(){ return logiAcceSist; } 
  public String getLogiAcceSistNn(){ return setNotNull(logiAcceSist); } 
  public String getLogiAcceSistDesc(){ return setDesc(logiAcceSist); } 
  public void setLogiAcceSist(String value){ this.logiAcceSist=value;} 
//-------------------------------------------| PassAcceSist
  public String getPassAcceSist(){ return passAcceSist; } 
  public String getPassAcceSistNn(){ return setNotNull(passAcceSist); } 
  public String getPassAcceSistDesc(){ return setDesc(passAcceSist); } 
  public void setPassAcceSist(String value){ this.passAcceSist=value;} 
//-------------------------------------------| MailProfesor
  public String getMailProfesor(){ return mailProfesor; } 
  public String getMailProfesorNn(){ return setNotNull(mailProfesor); } 
  public String getMailProfesorDesc(){ return setDesc(mailProfesor); } 
  public void setMailProfesor(String value){ this.mailProfesor=value;} 
//-------------------------------------------| PrimApelProf
  public String getPrimApelProf(){ return primApelProf; } 
  public String getPrimApelProfNn(){ return setNotNull(primApelProf); } 
  public String getPrimApelProfDesc(){ return setDesc(primApelProf); } 
  public void setPrimApelProf(String value){ this.primApelProf=value;} 
//-------------------------------------------| SeguApelProf
  public String getSeguApelProf(){ return seguApelProf; } 
  public String getSeguApelProfNn(){ return setNotNull(seguApelProf); } 
  public String getSeguApelProfDesc(){ return setDesc(seguApelProf); } 
  public void setSeguApelProf(String value){ this.seguApelProf=value;} 
//-------------------------------------------| TipoDocuProf
  public String getTipoDocuProf(){ return tipoDocuProf; } 
  public String getTipoDocuProfNn(){ return setNotNull(tipoDocuProf); } 
  public void setTipoDocuProf(String value){ this.tipoDocuProf=value;} 
//-------------------------------------------| FkeyMuniDocu
  public Integer getFkeyMuniDocu(){ return fkeyMuniDocu; } 
  public Integer getFkeyMuniDocuNn(){ return setNotNull(fkeyMuniDocu); } 
  public String getFkeyMuniDocuDesc(){ return setDesc(fkeyMuniDocu); } 
  public void setFkeyMuniDocu(Integer value){ this.fkeyMuniDocu=value;} 
//-------------------------------------------| FkeyEscaDoce
  public Integer getFkeyEscaDoce(){ return fkeyEscaDoce; } 
  public Integer getFkeyEscaDoceNn(){ return setNotNull(fkeyEscaDoce); } 
  public String getFkeyEscaDoceDesc(){ return setDesc(fkeyEscaDoce); } 
  public void setFkeyEscaDoce(Integer value){ this.fkeyEscaDoce=value;} 
//-------------------------------------------| NombProfesor
  public String getNombProfesor(){ return nombProfesor; } 
  public String getNombProfesorNn(){ return setNotNull(nombProfesor); } 
  public String getNombProfesorDesc(){ return setDesc(nombProfesor); } 
  public void setNombProfesor(String value){ this.nombProfesor=value;} 
//-------------------------------------------| TipoDoceHoja
  public String getTipoDoceHoja(){ return tipoDoceHoja; } 
  public String getTipoDoceHojaNn(){ return setNotNull(tipoDoceHoja); } 
  public void setTipoDoceHoja(String value){ this.tipoDoceHoja=value;} 
// ---------------(RANGOS) 
  public String getEstaActiProfDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaActiProfNn()); } 
  public String getTipoDediDoceDesc() { return DtoMisc.getRangeDesc(RANG_TipoDedi,getTipoDediDoceNn()); } 
  public String getTipoDocuProfDesc() { return DtoMisc.getRangeDesc(RANG_TipoDocu,getTipoDocuProfNn()); } 
  public String getTipoDoceHojaDesc() { return DtoMisc.getRangeDesc(RANG_TipoDoceHoja,getTipoDoceHojaNn()); } 

//---------------------(REL: FkeyEscaDoceDto) 
//  public PRF_EscalaDocentDto getFkeyEscaDoceDto() { return fkeyEscaDoceDto; } 
//  public void setFkeyEscaDoceDto(PRF_EscalaDocentDto fkeyEscaDoceDto) {
//    if ( fkeyEscaDoceDto != null ) { 
//      this.fkeyEscaDoce = fkeyEscaDoceDto.getPkeyEscaDoce(); 
//    }
//    this.fkeyEscaDoceDto = fkeyEscaDoceDto;
//  } 


  @Override 
  public CRG_DocentUniverDto copy(){
    CRG_DocentUniverDto result = new CRG_DocentUniverDto();
    result.setPkeyProfesor( this.getPkeyProfesor()); 
    result.setFkeyUnidAcad( this.getFkeyUnidAcad()); 
    result.setFkeyDoceUniv( this.getFkeyDoceUniv()); 
    result.setCodiDoceUniv( this.getCodiDoceUniv()); 
    result.setEstaActiProf( this.getEstaActiProf()); 
    result.setNombCompProf( this.getNombCompProf()); 
    result.setTipoDediDoce( this.getTipoDediDoce()); 
    result.setLogiAcceSist( this.getLogiAcceSist()); 
    result.setPassAcceSist( this.getPassAcceSist()); 
    result.setMailProfesor( this.getMailProfesor()); 
    result.setPrimApelProf( this.getPrimApelProf()); 
    result.setSeguApelProf( this.getSeguApelProf()); 
    result.setTipoDocuProf( this.getTipoDocuProf()); 
    result.setFkeyMuniDocu( this.getFkeyMuniDocu()); 
    result.setFkeyEscaDoce( this.getFkeyEscaDoce()); 
    result.setNombProfesor( this.getNombProfesor()); 
    result.setTipoDoceHoja( this.getTipoDoceHoja()); 
//    result.setFkeyEscaDoceDto( this.getFkeyEscaDoceDto());
    return result;
  }
}

