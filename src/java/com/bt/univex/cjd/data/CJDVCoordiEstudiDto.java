package com.bt.univex.cjd.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;

public class CJDVCoordiEstudiDto extends BaseDto {
  public static final List RANG_Si_No = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Si")});
  public static final List RANG_EstaAcad = Arrays.asList( new Range[] { 
      new Range("A","Estudiante Regular"),
      new Range("C","Perdida de Cupo"),
      new Range("E","Terminó materias"),
      new Range("G","Graduado"),
      new Range("I","Estado Indefinido (Migración)"),
      new Range("K","Vencimiento de cupo"),
      new Range("P","Prueba Académica"),
      new Range("R","Reservó Cupo"),
      new Range("X","Expulsado"),
      new Range("Y","Renuncia al Cupo o Transferido")});


  private Integer pkeyCoorEstu;
  private Integer fkeyEstuDian;
  private String esunGrupComp;
  private Integer fkeyGrupAsig;
  private Integer fkeyProgAcad;
  private Integer fkeyHojaVida;
  private Integer fkeyInscRipc;
  private Integer fkeyPeriPlan;
  private String codiEstuDian;
  private String estaCoorEstu;
  private String estaActiEstu;
  private String estaAcadEstu;
  private String nombEstudian;
  private String apelEstuDian;
  private String seguApelEstu;
  private String tipoGrupAsig;
  private String nombGrupNive;


  public CJDVCoordiEstudiDto() { 
     PkeyEnti = 130403;
     setAliasName("CoorEstuV"); 
  } 

//-------------------------------------------| PkeyCoorEstu
  public Integer getPkeyCoorEstu(){ return pkeyCoorEstu; } 
  public Integer getPkeyCoorEstuNn(){ return setNotNull(pkeyCoorEstu); } 
  public String getPkeyCoorEstuDesc(){ return setDesc(pkeyCoorEstu); } 
  public void setPkeyCoorEstu(Integer value){ this.pkeyCoorEstu=value;} 
  @Override
  public int toInt(){ return getPkeyCoorEstuNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyCoorEstu; }; 
//-------------------------------------------| FkeyEstuDian
  public Integer getFkeyEstuDian(){ return fkeyEstuDian; } 
  public Integer getFkeyEstuDianNn(){ return setNotNull(fkeyEstuDian); } 
  public String getFkeyEstuDianDesc(){ return setDesc(fkeyEstuDian); } 
  public void setFkeyEstuDian(Integer value){ this.fkeyEstuDian=value;} 
//-------------------------------------------| EsunGrupComp
  public String getEsunGrupComp(){ return esunGrupComp; } 
  public String getEsunGrupCompNn(){ return setNotNull(esunGrupComp); } 
  public String getEsunGrupCompDesc(){ return setDesc(esunGrupComp); } 
  public void setEsunGrupComp(String value){ this.esunGrupComp=value;} 
  public boolean getEsunGrupCompBool() { return esunGrupComp==null?false:esunGrupComp.equals("S");}
  public void setEsunGrupCompBool(boolean esunGrupComp) { this.esunGrupComp=esunGrupComp?"S":"N";}
//-------------------------------------------| FkeyGrupAsig
  public Integer getFkeyGrupAsig(){ return fkeyGrupAsig; } 
  public Integer getFkeyGrupAsigNn(){ return setNotNull(fkeyGrupAsig); } 
  public String getFkeyGrupAsigDesc(){ return setDesc(fkeyGrupAsig); } 
  public void setFkeyGrupAsig(Integer value){ this.fkeyGrupAsig=value;} 
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
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
//-------------------------------------------| CodiEstuDian
  public String getCodiEstuDian(){ return codiEstuDian; } 
  public String getCodiEstuDianNn(){ return setNotNull(codiEstuDian); } 
  public String getCodiEstuDianDesc(){ return setDesc(codiEstuDian); } 
  public void setCodiEstuDian(String value){ this.codiEstuDian=value;} 
//-------------------------------------------| EstaCoorEstu
  public String getEstaCoorEstu(){ return estaCoorEstu; } 
  public String getEstaCoorEstuNn(){ return setNotNull(estaCoorEstu); } 
  public String getEstaCoorEstuDesc(){ return setDesc(estaCoorEstu); } 
  public void setEstaCoorEstu(String value){ this.estaCoorEstu=value;} 
  public boolean getEstaCoorEstuBool() { return estaCoorEstu==null?false:estaCoorEstu.equals("S");}
  public void setEstaCoorEstuBool(boolean estaCoorEstu) { this.estaCoorEstu=estaCoorEstu?"S":"N";}
//-------------------------------------------| EstaActiEstu
  public String getEstaActiEstu(){ return estaActiEstu; } 
  public String getEstaActiEstuNn(){ return setNotNull(estaActiEstu); } 
  public void setEstaActiEstu(String value){ this.estaActiEstu=value;} 
  public boolean getEstaActiEstuBool() { return estaActiEstu==null?false:estaActiEstu.equals("S");}
  public void setEstaActiEstuBool(boolean estaActiEstu) { this.estaActiEstu=estaActiEstu?"S":"N";}
//-------------------------------------------| EstaAcadEstu
  public String getEstaAcadEstu(){ return estaAcadEstu; } 
  public String getEstaAcadEstuNn(){ return setNotNull(estaAcadEstu); } 
  public void setEstaAcadEstu(String value){ this.estaAcadEstu=value;} 
//-------------------------------------------| NombEstudian
  public String getNombEstudian(){ return nombEstudian; } 
  public String getNombEstudianNn(){ return setNotNull(nombEstudian); } 
  public String getNombEstudianDesc(){ return setDesc(nombEstudian); } 
  public void setNombEstudian(String value){ this.nombEstudian=value;} 
  @Override
  public String toString(){ 
      String s = getCodiEstuDianNn()+" - "+getNombEstudianNn()+" "+getApelEstuDian()+" "+getSeguApelEstuNn()+" - "+getNombGrupNive();
      return s;
  }; 
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
//-------------------------------------------| TipoGrupAsig
  public String getTipoGrupAsig(){ return tipoGrupAsig; } 
  public String getTipoGrupAsigNn(){ return setNotNull(tipoGrupAsig); } 
  public String getTipoGrupAsigDesc(){ return setDesc(tipoGrupAsig); } 
  public void setTipoGrupAsig(String value){ this.tipoGrupAsig=value;} 
  public boolean getTipoGrupAsigBool() { return tipoGrupAsig==null?false:tipoGrupAsig.equals("S");}
  public void setTipoGrupAsigBool(boolean tipoGrupAsig) { this.tipoGrupAsig=tipoGrupAsig?"S":"N";}
//-------------------------------------------| NombGrupNive
  public String getNombGrupNive(){ return nombGrupNive; } 
  public String getNombGrupNiveNn(){ return setNotNull(nombGrupNive); } 
  public String getNombGrupNiveDesc(){ return setDesc(nombGrupNive); } 
  public void setNombGrupNive(String value){ this.nombGrupNive=value;} 
// ---------------(RANGOS) 
  public String getEstaActiEstuDesc() { return DtoMisc.getRangeDesc(RANG_Si_No,getEstaActiEstuNn()); } 
  public String getEstaAcadEstuDesc() { return DtoMisc.getRangeDesc(RANG_EstaAcad,getEstaAcadEstuNn()); } 



  @Override 
  public CJDVCoordiEstudiDto copy(){
    CJDVCoordiEstudiDto result = new CJDVCoordiEstudiDto();
    result.setPkeyCoorEstu( this.getPkeyCoorEstu()); 
    result.setFkeyEstuDian( this.getFkeyEstuDian()); 
    result.setEsunGrupComp( this.getEsunGrupComp()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setFkeyHojaVida( this.getFkeyHojaVida()); 
    result.setFkeyInscRipc( this.getFkeyInscRipc()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setCodiEstuDian( this.getCodiEstuDian()); 
    result.setEstaCoorEstu( this.getEstaCoorEstu()); 
    result.setEstaActiEstu( this.getEstaActiEstu()); 
    result.setEstaAcadEstu( this.getEstaAcadEstu()); 
    result.setNombEstudian( this.getNombEstudian()); 
    result.setApelEstuDian( this.getApelEstuDian()); 
    result.setSeguApelEstu( this.getSeguApelEstu()); 
    result.setTipoGrupAsig( this.getTipoGrupAsig()); 
    result.setNombGrupNive( this.getNombGrupNive()); 
    return result;
  }
}

