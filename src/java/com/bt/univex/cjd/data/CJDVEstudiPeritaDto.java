package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDVEstudiPeritaDto extends BaseDto {


  private Integer pkeyEstuPeri;
  private Integer fkeyPeriCons;
  private Integer fkeyEstudian;
  private Date fechAsigPeri;
  private Date fechEntrPeri;
  private Double notaPeritaje;
  private Integer fkeyProgAcad;
  private Integer fkeyHojaVida;
  private Integer fkeyInscRipc;
  private String codiEstudian;
  private String estaActiEstu;
  private String estaAcadEstu;
  private String nombEstudian;
  private String apelEstudian;
  private String seguApelEstu;


  public CJDVEstudiPeritaDto() { 
     PkeyEnti = 187103;
     setAliasName("EstuPerV"); 
  } 

//-------------------------------------------| PkeyEstuPeri
  public Integer getPkeyEstuPeri(){ return pkeyEstuPeri; } 
  public Integer getPkeyEstuPeriNn(){ return setNotNull(pkeyEstuPeri); } 
  public String getPkeyEstuPeriDesc(){ return setDesc(pkeyEstuPeri); } 
  public void setPkeyEstuPeri(Integer value){ this.pkeyEstuPeri=value;} 
  @Override
  public int toInt(){ return getPkeyEstuPeriNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyEstuPeri; }; 
//-------------------------------------------| FkeyPeriCons
  public Integer getFkeyPeriCons(){ return fkeyPeriCons; } 
  public Integer getFkeyPeriConsNn(){ return setNotNull(fkeyPeriCons); } 
  public String getFkeyPeriConsDesc(){ return setDesc(fkeyPeriCons); } 
  public void setFkeyPeriCons(Integer value){ this.fkeyPeriCons=value;} 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| FechAsigPeri
  public Date getFechAsigPeri(){ return fechAsigPeri; } 
  public Date getFechAsigPeriNn(){ return setNotNull(fechAsigPeri); } 
  public String getFechAsigPeriDesc(){ return setDesc(fechAsigPeri); } 
  public void setFechAsigPeri(Date value){ this.fechAsigPeri=value;} 
//-------------------------------------------| FechEntrPeri
  public Date getFechEntrPeri(){ return fechEntrPeri; } 
  public Date getFechEntrPeriNn(){ return setNotNull(fechEntrPeri); } 
  public String getFechEntrPeriDesc(){ return setDesc(fechEntrPeri); } 
  public void setFechEntrPeri(Date value){ this.fechEntrPeri=value;} 
//-------------------------------------------| NotaPeritaje
  public Double getNotaPeritaje(){ return notaPeritaje; } 
  public Double getNotaPeritajeNn(){ return setNotNull(notaPeritaje); } 
  public String getNotaPeritajeDesc(){ return setDesc(notaPeritaje); } 
  public void setNotaPeritaje(Double value){ this.notaPeritaje=value;} 
//-------------------------------------------| FkeyProgAcad
  public Integer getFkeyProgAcad(){ return fkeyProgAcad; } 
  public Integer getFkeyProgAcadNn(){ return setNotNull(fkeyProgAcad); } 
  public String getFkeyProgAcadDesc(){ return setDesc(fkeyProgAcad); } 
  public void setFkeyProgAcad(Integer value){ this.fkeyProgAcad=value;} 
//-------------------------------------------| FkeyHojaVida
  public Integer getFkeyHojaVida(){ return fkeyHojaVida; } 
  public Integer getFkeyHojaVidaNn(){ return setNotNull(fkeyHojaVida); } 
  public String getFkeyHojaVidaDesc(){ return setDesc(fkeyHojaVida); } 
  public void setFkeyHojaVida(Integer value){ this.fkeyHojaVida=value;} 
//-------------------------------------------| FkeyInscRipc
  public Integer getFkeyInscRipc(){ return fkeyInscRipc; } 
  public Integer getFkeyInscRipcNn(){ return setNotNull(fkeyInscRipc); } 
  public String getFkeyInscRipcDesc(){ return setDesc(fkeyInscRipc); } 
  public void setFkeyInscRipc(Integer value){ this.fkeyInscRipc=value;} 
//-------------------------------------------| CodiEstudian
  public String getCodiEstudian(){ return codiEstudian; } 
  public String getCodiEstudianNn(){ return setNotNull(codiEstudian); } 
  public String getCodiEstudianDesc(){ return setDesc(codiEstudian); } 
  public void setCodiEstudian(String value){ this.codiEstudian=value;} 
//-------------------------------------------| EstaActiEstu
  public String getEstaActiEstu(){ return estaActiEstu; } 
  public String getEstaActiEstuNn(){ return setNotNull(estaActiEstu); } 
  public String getEstaActiEstuDesc(){ return setDesc(estaActiEstu); } 
  public void setEstaActiEstu(String value){ this.estaActiEstu=value;} 
  public boolean getEstaActiEstuBool() { return estaActiEstu==null?false:estaActiEstu.equals("S");}
  public void setEstaActiEstuBool(boolean estaActiEstu) { this.estaActiEstu=estaActiEstu?"S":"N";}
//-------------------------------------------| EstaAcadEstu
  public String getEstaAcadEstu(){ return estaAcadEstu; } 
  public String getEstaAcadEstuNn(){ return setNotNull(estaAcadEstu); } 
  public String getEstaAcadEstuDesc(){ return setDesc(estaAcadEstu); } 
  public void setEstaAcadEstu(String value){ this.estaAcadEstu=value;} 
  public boolean getEstaAcadEstuBool() { return estaAcadEstu==null?false:estaAcadEstu.equals("S");}
  public void setEstaAcadEstuBool(boolean estaAcadEstu) { this.estaAcadEstu=estaAcadEstu?"S":"N";}
//-------------------------------------------| NombEstudian
  public String getNombEstudian(){ return nombEstudian; } 
  public String getNombEstudianNn(){ return setNotNull(nombEstudian); } 
  public String getNombEstudianDesc(){ return setDesc(nombEstudian); } 
  public void setNombEstudian(String value){ this.nombEstudian=value;} 
//-------------------------------------------| ApelEstudian
  public String getApelEstudian(){ return apelEstudian; } 
  public String getApelEstudianNn(){ return setNotNull(apelEstudian); } 
  public String getApelEstudianDesc(){ return setDesc(apelEstudian); } 
  public void setApelEstudian(String value){ this.apelEstudian=value;} 
//-------------------------------------------| SeguApelEstu
  public String getSeguApelEstu(){ return seguApelEstu; } 
  public String getSeguApelEstuNn(){ return setNotNull(seguApelEstu); } 
  public String getSeguApelEstuDesc(){ return setDesc(seguApelEstu); } 
  public void setSeguApelEstu(String value){ this.seguApelEstu=value;} 
// ---------------(RANGOS) 



  @Override 
  public CJDVEstudiPeritaDto copy(){
    CJDVEstudiPeritaDto result = new CJDVEstudiPeritaDto();
    result.setPkeyEstuPeri( this.getPkeyEstuPeri()); 
    result.setFkeyPeriCons( this.getFkeyPeriCons()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFechAsigPeri( this.getFechAsigPeri()); 
    result.setFechEntrPeri( this.getFechEntrPeri()); 
    result.setNotaPeritaje( this.getNotaPeritaje()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setFkeyHojaVida( this.getFkeyHojaVida()); 
    result.setFkeyInscRipc( this.getFkeyInscRipc()); 
    result.setCodiEstudian( this.getCodiEstudian()); 
    result.setEstaActiEstu( this.getEstaActiEstu()); 
    result.setEstaAcadEstu( this.getEstaAcadEstu()); 
    result.setNombEstudian( this.getNombEstudian()); 
    result.setApelEstudian( this.getApelEstudian()); 
    result.setSeguApelEstu( this.getSeguApelEstu()); 
    return result;
  }
}

