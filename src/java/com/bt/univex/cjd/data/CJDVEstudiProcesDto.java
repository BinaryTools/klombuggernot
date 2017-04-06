package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDVEstudiProcesDto extends BaseDto {
  public static final List RANG_Si_No = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Si")});


  private Integer pkeyEstuProc;
  private Integer fkeyProcCons;
  private Integer fkeyEstudian;
  private Date fechAsigProc;
  private Date fechEntrProc;
  private Integer fkeyProgAcad;
  private Integer fkeyHojaVida;
  private Integer fkeyInscripc;
  private String codiEstudian;
  private String estaActiEstu;
  private String nombEstudian;
  private String apelEstudian;
  private String seguApelEstu;
  private Double notaProcCons;
  private String estaMuesRepo;
  private Date fechNotaProc;


  public CJDVEstudiProcesDto() { 
     PkeyEnti = 130603;
     setAliasName("EstuProcV"); 
  } 

//-------------------------------------------| PkeyEstuProc
  public Integer getPkeyEstuProc(){ return pkeyEstuProc; } 
  public Integer getPkeyEstuProcNn(){ return setNotNull(pkeyEstuProc); } 
  public String getPkeyEstuProcDesc(){ return setDesc(pkeyEstuProc); } 
  public void setPkeyEstuProc(Integer value){ this.pkeyEstuProc=value;} 
  @Override
  public int toInt(){ return getPkeyEstuProcNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyEstuProc; }; 
//-------------------------------------------| FkeyProcCons
  public Integer getFkeyProcCons(){ return fkeyProcCons; } 
  public Integer getFkeyProcConsNn(){ return setNotNull(fkeyProcCons); } 
  public String getFkeyProcConsDesc(){ return setDesc(fkeyProcCons); } 
  public void setFkeyProcCons(Integer value){ this.fkeyProcCons=value;} 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| FechAsigProc
  public Date getFechAsigProc(){ return fechAsigProc; } 
  public Date getFechAsigProcNn(){ return setNotNull(fechAsigProc); } 
  public String getFechAsigProcDesc(){ return setDesc(fechAsigProc); } 
  public void setFechAsigProc(Date value){ this.fechAsigProc=value;} 
//-------------------------------------------| FechEntrProc
  public Date getFechEntrProc(){ return fechEntrProc; } 
  public Date getFechEntrProcNn(){ return setNotNull(fechEntrProc); } 
  public String getFechEntrProcDesc(){ return setDesc(fechEntrProc); } 
  public void setFechEntrProc(Date value){ this.fechEntrProc=value;} 
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
//-------------------------------------------| FkeyInscripc
  public Integer getFkeyInscripc(){ return fkeyInscripc; } 
  public Integer getFkeyInscripcNn(){ return setNotNull(fkeyInscripc); } 
  public String getFkeyInscripcDesc(){ return setDesc(fkeyInscripc); } 
  public void setFkeyInscripc(Integer value){ this.fkeyInscripc=value;} 
//-------------------------------------------| CodiEstudian
  public String getCodiEstudian(){ return codiEstudian; } 
  public String getCodiEstudianNn(){ return setNotNull(codiEstudian); } 
  public String getCodiEstudianDesc(){ return setDesc(codiEstudian); } 
  public void setCodiEstudian(String value){ this.codiEstudian=value;} 
//-------------------------------------------| EstaActiEstu
  public String getEstaActiEstu(){ return estaActiEstu; } 
  public String getEstaActiEstuNn(){ return setNotNull(estaActiEstu); } 
  public void setEstaActiEstu(String value){ this.estaActiEstu=value;} 
  public boolean getEstaActiEstuBool() { return estaActiEstu==null?false:estaActiEstu.equals("S");}
  public void setEstaActiEstuBool(boolean estaActiEstu) { this.estaActiEstu=estaActiEstu?"S":"N";}
//-------------------------------------------| NombEstudian
  public String getNombEstudian(){ return nombEstudian; } 
  public String getNombEstudianNn(){ return setNotNull(nombEstudian); } 
  public String getNombEstudianDesc(){ return setDesc(nombEstudian); } 
  public void setNombEstudian(String value){ this.nombEstudian=value;} 
  @Override
  public String toString(){ return getNombEstudianNn(); }; 
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
//-------------------------------------------| NotaProcCons
  public Double getNotaProcCons(){ return notaProcCons; } 
  public Double getNotaProcConsNn(){ return setNotNull(notaProcCons); } 
  public String getNotaProcConsDesc(){ return setDesc(notaProcCons); } 
  public void setNotaProcCons(Double value){ this.notaProcCons=value;} 
//-------------------------------------------| EstaMuesRepo
  public String getEstaMuesRepo(){ return estaMuesRepo; } 
  public String getEstaMuesRepoNn(){ return setNotNull(estaMuesRepo); } 
  public String getEstaMuesRepoDesc(){ return setDesc(estaMuesRepo); } 
  public void setEstaMuesRepo(String value){ this.estaMuesRepo=value;} 
  public boolean getEstaMuesRepoBool() { return estaMuesRepo==null?false:estaMuesRepo.equals("S");}
  public void setEstaMuesRepoBool(boolean estaMuesRepo) { this.estaMuesRepo=estaMuesRepo?"S":"N";}
//-------------------------------------------| FechNotaProc
  public Date getFechNotaProc(){ return fechNotaProc; } 
  public Date getFechNotaProcNn(){ return setNotNull(fechNotaProc); } 
  public String getFechNotaProcDesc(){ return setDesc(fechNotaProc); } 
  public void setFechNotaProc(Date value){ this.fechNotaProc=value;} 
// ---------------(RANGOS) 
  public String getEstaActiEstuDesc() { return DtoMisc.getRangeDesc(RANG_Si_No,getEstaActiEstuNn()); } 



  @Override 
  public CJDVEstudiProcesDto copy(){
    CJDVEstudiProcesDto result = new CJDVEstudiProcesDto();
    result.setPkeyEstuProc( this.getPkeyEstuProc()); 
    result.setFkeyProcCons( this.getFkeyProcCons()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFechAsigProc( this.getFechAsigProc()); 
    result.setFechEntrProc( this.getFechEntrProc()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setFkeyHojaVida( this.getFkeyHojaVida()); 
    result.setFkeyInscripc( this.getFkeyInscripc()); 
    result.setCodiEstudian( this.getCodiEstudian()); 
    result.setEstaActiEstu( this.getEstaActiEstu()); 
    result.setNombEstudian( this.getNombEstudian()); 
    result.setApelEstudian( this.getApelEstudian()); 
    result.setSeguApelEstu( this.getSeguApelEstu()); 
    result.setNotaProcCons( this.getNotaProcCons()); 
    result.setEstaMuesRepo( this.getEstaMuesRepo()); 
    result.setFechNotaProc( this.getFechNotaProc()); 
    return result;
  }
}

