package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDVEstudiAplicaDto extends BaseDto {
  public static final List RANG_Si_No = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Si")});


  private Integer pkeyEstuApli;
  private Integer fkeyEstuDian;
  private Date fechCertEstu;
  private Integer fkeyProgAcad;
  private Integer fkeyHojaVida;
  private Integer fkeyInscRipc;
  private String codiEstudian;
  private String estaActiEstu;
  private String estaAcadEstu;
  private String nombEstuDian;
  private String apelEstuDian;
  private String seguApelEstu;


  public CJDVEstudiAplicaDto() { 
     PkeyEnti = 130703;
     setAliasName("EstuApliV"); 
  } 

//-------------------------------------------| PkeyEstuApli
  public Integer getPkeyEstuApli(){ return pkeyEstuApli; } 
  public Integer getPkeyEstuApliNn(){ return setNotNull(pkeyEstuApli); } 
  public String getPkeyEstuApliDesc(){ return setDesc(pkeyEstuApli); } 
  public void setPkeyEstuApli(Integer value){ this.pkeyEstuApli=value;} 
  @Override
  public int toInt(){ return getPkeyEstuApliNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyEstuApli; }; 
//-------------------------------------------| FkeyEstuDian
  public Integer getFkeyEstuDian(){ return fkeyEstuDian; } 
  public Integer getFkeyEstuDianNn(){ return setNotNull(fkeyEstuDian); } 
  public String getFkeyEstuDianDesc(){ return setDesc(fkeyEstuDian); } 
  public void setFkeyEstuDian(Integer value){ this.fkeyEstuDian=value;} 
//-------------------------------------------| FechCertEstu
  public Date getFechCertEstu(){ return fechCertEstu; } 
  public Date getFechCertEstuNn(){ return setNotNull(fechCertEstu); } 
  public String getFechCertEstuDesc(){ return setDesc(fechCertEstu); } 
  public void setFechCertEstu(Date value){ this.fechCertEstu=value;} 
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
  public void setEstaActiEstu(String value){ this.estaActiEstu=value;} 
  public boolean getEstaActiEstuBool() { return estaActiEstu==null?false:estaActiEstu.equals("S");}
  public void setEstaActiEstuBool(boolean estaActiEstu) { this.estaActiEstu=estaActiEstu?"S":"N";}
//-------------------------------------------| EstaAcadEstu
  public String getEstaAcadEstu(){ return estaAcadEstu; } 
  public String getEstaAcadEstuNn(){ return setNotNull(estaAcadEstu); } 
  public String getEstaAcadEstuDesc(){ return setDesc(estaAcadEstu); } 
  public void setEstaAcadEstu(String value){ this.estaAcadEstu=value;} 
//-------------------------------------------| NombEstuDian
  public String getNombEstuDian(){ return nombEstuDian; } 
  public String getNombEstuDianNn(){ return setNotNull(nombEstuDian); } 
  public String getNombEstuDianDesc(){ return setDesc(nombEstuDian); } 
  public void setNombEstuDian(String value){ this.nombEstuDian=value;} 
//-------------------------------------------| ApelEstuDian
  public String getApelEstuDian(){ return apelEstuDian; } 
  public String getApelEstuDianNn(){ return setNotNull(apelEstuDian); } 
  public String getApelEstuDianDesc(){ return setDesc(apelEstuDian); } 
  public void setApelEstuDian(String value){ this.apelEstuDian=value;} 
//-------------------------------------------| SeguApelEstu
  public String getSeguApelEstu(){ return seguApelEstu; } 
  public String getSeguApelEstuNn(){ return setNotNull(seguApelEstu); } 
  public String getSeguApelEstuDesc(){ return setDesc(seguApelEstu); } 
  public void setSeguApelEstu(String value){ this.seguApelEstu=value;} 
// ---------------(RANGOS) 
  public String getEstaActiEstuDesc() { return DtoMisc.getRangeDesc(RANG_Si_No,getEstaActiEstuNn()); } 



  @Override 
  public CJDVEstudiAplicaDto copy(){
    CJDVEstudiAplicaDto result = new CJDVEstudiAplicaDto();
    result.setPkeyEstuApli( this.getPkeyEstuApli()); 
    result.setFkeyEstuDian( this.getFkeyEstuDian()); 
    result.setFechCertEstu( this.getFechCertEstu()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setFkeyHojaVida( this.getFkeyHojaVida()); 
    result.setFkeyInscRipc( this.getFkeyInscRipc()); 
    result.setCodiEstudian( this.getCodiEstudian()); 
    result.setEstaActiEstu( this.getEstaActiEstu()); 
    result.setEstaAcadEstu( this.getEstaAcadEstu()); 
    result.setNombEstuDian( this.getNombEstuDian()); 
    result.setApelEstuDian( this.getApelEstuDian()); 
    result.setSeguApelEstu( this.getSeguApelEstu()); 
    return result;
  }
}

