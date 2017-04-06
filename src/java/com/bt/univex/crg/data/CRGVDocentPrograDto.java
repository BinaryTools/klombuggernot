package com.bt.univex.crg.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.sql.*;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.utilities.*;
import com.bt.univex.crg.data.*;

public class CRGVDocentPrograDto extends BaseDto {
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


  private Integer pkeyProfesor;
  private Integer pkeyDoceProg;
  private Integer fkeyUnidAcad;
  private Integer fkeyProgAcad;
  private Integer fkeyDoceUniv;
  private Integer fkeyProfesor;
  private Integer codiDoceUniv;
  private String estaActiProf;
  private String estaActiDoce;
  private String nombCompProf;
  private String tipoDediDoce;
  private String logiAcceSist;
  private String passAcceSist;
  private String mailProfesor;


  public CRGVDocentPrograDto() { 
     PkeyEnti = 44903;
     setAliasName("DoceProg"); 
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
//-------------------------------------------| PkeyDoceProg
  public Integer getPkeyDoceProg(){ return pkeyDoceProg; } 
  public Integer getPkeyDoceProgNn(){ return setNotNull(pkeyDoceProg); } 
  public String getPkeyDoceProgDesc(){ return setDesc(pkeyDoceProg); } 
  public void setPkeyDoceProg(Integer value){ this.pkeyDoceProg=value;} 
//-------------------------------------------| FkeyUnidAcad
  public Integer getFkeyUnidAcad(){ return fkeyUnidAcad; } 
  public Integer getFkeyUnidAcadNn(){ return setNotNull(fkeyUnidAcad); } 
  public String getFkeyUnidAcadDesc(){ return setDesc(fkeyUnidAcad); } 
  public void setFkeyUnidAcad(Integer value){ this.fkeyUnidAcad=value;} 
//-------------------------------------------| FkeyProgAcad
  public Integer getFkeyProgAcad(){ return fkeyProgAcad; } 
  public Integer getFkeyProgAcadNn(){ return setNotNull(fkeyProgAcad); } 
  public String getFkeyProgAcadDesc(){ return setDesc(fkeyProgAcad); } 
  public void setFkeyProgAcad(Integer value){ this.fkeyProgAcad=value;} 
//-------------------------------------------| FkeyDoceUniv
  public Integer getFkeyDoceUniv(){ return fkeyDoceUniv; } 
  public Integer getFkeyDoceUnivNn(){ return setNotNull(fkeyDoceUniv); } 
  public String getFkeyDoceUnivDesc(){ return setDesc(fkeyDoceUniv); } 
  public void setFkeyDoceUniv(Integer value){ this.fkeyDoceUniv=value;} 
//-------------------------------------------| FkeyProfesor
  public Integer getFkeyProfesor(){ return fkeyProfesor; } 
  public Integer getFkeyProfesorNn(){ return setNotNull(fkeyProfesor); } 
  public String getFkeyProfesorDesc(){ return setDesc(fkeyProfesor); } 
  public void setFkeyProfesor(Integer value){ this.fkeyProfesor=value;} 
//-------------------------------------------| CodiDoceUniv
  public Integer getCodiDoceUniv(){ return codiDoceUniv; } 
  public Integer getCodiDoceUnivNn(){ return setNotNull(codiDoceUniv); } 
  public String getCodiDoceUnivDesc(){ return setDesc(codiDoceUniv); } 
  public void setCodiDoceUniv(Integer value){ this.codiDoceUniv=value;} 
//-------------------------------------------| EstaActiProf
  public String getEstaActiProf(){ return estaActiProf; } 
  public String getEstaActiProfNn(){ return setNotNull(estaActiProf); } 
  public String getEstaActiProfDesc(){ return setDesc(estaActiProf); } 
  public void setEstaActiProf(String value){ this.estaActiProf=value;} 
  public boolean getEstaActiProfBool() { return estaActiProf==null?false:estaActiProf.equals("S");}
  public void setEstaActiProfBool(boolean estaActiProf) { this.estaActiProf=estaActiProf?"S":"N";}
//-------------------------------------------| EstaActiDoce
  public String getEstaActiDoce(){ return estaActiDoce; } 
  public String getEstaActiDoceNn(){ return setNotNull(estaActiDoce); } 
  public String getEstaActiDoceDesc(){ return setDesc(estaActiDoce); } 
  public void setEstaActiDoce(String value){ this.estaActiDoce=value;} 
  public boolean getEstaActiDoceBool() { return estaActiDoce==null?false:estaActiDoce.equals("S");}
  public void setEstaActiDoceBool(boolean estaActiDoce) { this.estaActiDoce=estaActiDoce?"S":"N";}
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
  public String getTipoDediDoceDesc(){ return setDesc(tipoDediDoce); } 
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




  @Override 
  public CRGVDocentPrograDto copy(){
    CRGVDocentPrograDto result = new CRGVDocentPrograDto();
    result.setPkeyProfesor( this.getPkeyProfesor()); 
    result.setPkeyDoceProg( this.getPkeyDoceProg()); 
    result.setFkeyUnidAcad( this.getFkeyUnidAcad()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setFkeyDoceUniv( this.getFkeyDoceUniv()); 
    result.setFkeyProfesor( this.getFkeyProfesor()); 
    result.setCodiDoceUniv( this.getCodiDoceUniv()); 
    result.setEstaActiProf( this.getEstaActiProf()); 
    result.setEstaActiDoce( this.getEstaActiDoce()); 
    result.setNombCompProf( this.getNombCompProf()); 
    result.setTipoDediDoce( this.getTipoDediDoce()); 
    result.setLogiAcceSist( this.getLogiAcceSist()); 
    result.setPassAcceSist( this.getPassAcceSist()); 
    result.setMailProfesor( this.getMailProfesor()); 
    return result;
  }
}

