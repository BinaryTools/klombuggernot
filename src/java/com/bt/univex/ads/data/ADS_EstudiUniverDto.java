package com.bt.univex.ads.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;

public class ADS_EstudiUniverDto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});
  public static final List RANG_EstaAcad = Arrays.asList( new Range[] { 
      new Range("A","Estudiante Regular"),
      new Range("C","Perdida de Cupo"),
      new Range("E","Termino materias"),
      new Range("G","Graduado"),
      new Range("I","Estado Indefinido (Migración)"),
      new Range("K","Vencimiento de cupo"),
      new Range("P","Prueba Académica"),
      new Range("R","Reservo Cupo"),
      new Range("X","Expulsado"),
      new Range("Y","Renuncia al Cupo o Transferido")});
  public static final List RANG_Jorn = Arrays.asList( new Range[] { 
      new Range("A","A Mañana o Tarde o Noche"),
      new Range("C","C Tarde o Noche"),
      new Range("D","Diurna (Mañana y Tarde)"),
      new Range("F","F Tarde o Noche o Fin de Semana"),
      new Range("N","Nocturna"),
      new Range("R","R Mañana o Noche"),
      new Range("S","S Mañana o Tarde"),
      new Range("X","Fin de semana"),
      new Range("Z","Sin jornada especifica")});
  public static final List RANG_TipOngUni = Arrays.asList( new Range[] { 
      new Range("I","Transferencia interna"),
      new Range("M","Reingreso ESMIC"),
      new Range("N","Nuevo"),
      new Range("O","Segunda opción"),
      new Range("R","Reingreso"),
      new Range("S","Segundo ciclo"),
      new Range("T","Transferencia externa")});


  private Integer pkeyEstudian;
  private Integer fkeyProgAcad;
  private Integer fkeyHojaVida;
  private Integer fkeyInscripc;
  private Integer fkeyCasLiqMa;
  private Integer fkeyPlanEstu;
  private Integer fkeyPeriAcad;
  private String codiEstudian;
  private String nombEstudian;
  private String apelEstudian;
  private String seguApelEstu;
  private Integer niveEstudian;
  private String descripcion;
  private String logiAcceSist;
  private String clavAcceSist;
  private String estaClavAcce;
  private String estaActiEstu;
  private String estaAcadEstu;
  private String jornBaseEstu;
  private String estaNiveEstu;
  private String tipoIngrEstu;

  private ADS_PrograAcademDto fkeyProgAcadDto;

  public ADS_EstudiUniverDto() { 
     PkeyEnti = 8303;
     setAliasName("Estudian"); 
  } 

//-------------------------------------------| PkeyEstudian
  public Integer getPkeyEstudian(){ return pkeyEstudian; } 
  public Integer getPkeyEstudianNn(){ return setNotNull(pkeyEstudian); } 
  public String getPkeyEstudianDesc(){ return setDesc(pkeyEstudian); } 
  public void setPkeyEstudian(Integer value){ this.pkeyEstudian=value;} 
  @Override
  public int toInt(){ return getPkeyEstudianNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyEstudian; }; 
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
//-------------------------------------------| FkeyCasLiqMa
  public Integer getFkeyCasLiqMa(){ return fkeyCasLiqMa; } 
  public Integer getFkeyCasLiqMaNn(){ return setNotNull(fkeyCasLiqMa); } 
  public String getFkeyCasLiqMaDesc(){ return setDesc(fkeyCasLiqMa); } 
  public void setFkeyCasLiqMa(Integer value){ this.fkeyCasLiqMa=value;} 
//-------------------------------------------| FkeyPlanEstu
  public Integer getFkeyPlanEstu(){ return fkeyPlanEstu; } 
  public Integer getFkeyPlanEstuNn(){ return setNotNull(fkeyPlanEstu); } 
  public String getFkeyPlanEstuDesc(){ return setDesc(fkeyPlanEstu); } 
  public void setFkeyPlanEstu(Integer value){ this.fkeyPlanEstu=value;} 
//-------------------------------------------| FkeyPeriAcad
  public Integer getFkeyPeriAcad(){ return fkeyPeriAcad; } 
  public Integer getFkeyPeriAcadNn(){ return setNotNull(fkeyPeriAcad); } 
  public String getFkeyPeriAcadDesc(){ return setDesc(fkeyPeriAcad); } 
  public void setFkeyPeriAcad(Integer value){ this.fkeyPeriAcad=value;} 
//-------------------------------------------| CodiEstudian
  public String getCodiEstudian(){ return codiEstudian; } 
  public String getCodiEstudianNn(){ return setNotNull(codiEstudian); } 
  public String getCodiEstudianDesc(){ return setDesc(codiEstudian); } 
  public void setCodiEstudian(String value){ this.codiEstudian=value;} 
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
//-------------------------------------------| NiveEstudian
  public Integer getNiveEstudian(){ return niveEstudian; } 
  public Integer getNiveEstudianNn(){ return setNotNull(niveEstudian); } 
  public String getNiveEstudianDesc(){ return setDesc(niveEstudian); } 
  public void setNiveEstudian(Integer value){ this.niveEstudian=value;} 
//-------------------------------------------| Descripcion
  public String getDescripcion(){ return descripcion; } 
  public String getDescripcionNn(){ return setNotNull(descripcion); } 
  public String getDescripcionDesc(){ return setDesc(descripcion); } 
  public void setDescripcion(String value){ this.descripcion=value;} 
  @Override
  public String toString(){ return getNombEstudianNn() +" "+ getApelEstudianNn() + " - " + getCodiEstudianNn();/*getDescripcionNn();*/ }; 
//-------------------------------------------| LogiAcceSist
  public String getLogiAcceSist(){ return logiAcceSist; } 
  public String getLogiAcceSistNn(){ return setNotNull(logiAcceSist); } 
  public String getLogiAcceSistDesc(){ return setDesc(logiAcceSist); } 
  public void setLogiAcceSist(String value){ this.logiAcceSist=value;} 
//-------------------------------------------| ClavAcceSist
  public String getClavAcceSist(){ return clavAcceSist; } 
  public String getClavAcceSistNn(){ return setNotNull(clavAcceSist); } 
  public String getClavAcceSistDesc(){ return setDesc(clavAcceSist); } 
  public void setClavAcceSist(String value){ this.clavAcceSist=value;} 
//-------------------------------------------| EstaClavAcce
  public String getEstaClavAcce(){ return estaClavAcce; } 
  public String getEstaClavAcceNn(){ return setNotNull(estaClavAcce); } 
  public String getEstaClavAcceDesc(){ return setDesc(estaClavAcce); } 
  public void setEstaClavAcce(String value){ this.estaClavAcce=value;} 
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
//-------------------------------------------| JornBaseEstu
  public String getJornBaseEstu(){ return jornBaseEstu; } 
  public String getJornBaseEstuNn(){ return setNotNull(jornBaseEstu); } 
  public void setJornBaseEstu(String value){ this.jornBaseEstu=value;} 
//-------------------------------------------| EstaNiveEstu
  public String getEstaNiveEstu(){ return estaNiveEstu; } 
  public String getEstaNiveEstuNn(){ return setNotNull(estaNiveEstu); } 
  public String getEstaNiveEstuDesc(){ return setDesc(estaNiveEstu); } 
  public void setEstaNiveEstu(String value){ this.estaNiveEstu=value;} 
  public boolean getEstaNiveEstuBool() { return estaNiveEstu==null?false:estaNiveEstu.equals("S");}
  public void setEstaNiveEstuBool(boolean estaNiveEstu) { this.estaNiveEstu=estaNiveEstu?"S":"N";}
//-------------------------------------------| TipoIngrEstu
  public String getTipoIngrEstu(){ return tipoIngrEstu; } 
  public String getTipoIngrEstuNn(){ return setNotNull(tipoIngrEstu); } 
  public void setTipoIngrEstu(String value){ this.tipoIngrEstu=value;} 
// ---------------(RANGOS) 
  public String getEstaActiEstuDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaActiEstuNn()); } 
  public String getEstaAcadEstuDesc() { return DtoMisc.getRangeDesc(RANG_EstaAcad,getEstaAcadEstuNn()); } 
  public String getJornBaseEstuDesc() { return DtoMisc.getRangeDesc(RANG_Jorn,getJornBaseEstuNn()); } 
  public String getTipoIngrEstuDesc() { return DtoMisc.getRangeDesc(RANG_TipOngUni,getTipoIngrEstuNn()); } 

//---------------------(REL: FkeyProgAcadDto) 
  public ADS_PrograAcademDto getFkeyProgAcadDto() { return fkeyProgAcadDto; } 
  public void setFkeyProgAcadDto(ADS_PrograAcademDto fkeyProgAcadDto) {
    if ( fkeyProgAcadDto != null ) { 
      this.fkeyProgAcad = fkeyProgAcadDto.getPkeyProgAcad(); 
    }
    this.fkeyProgAcadDto = fkeyProgAcadDto;
  } 


  @Override 
  public ADS_EstudiUniverDto copy(){
    ADS_EstudiUniverDto result = new ADS_EstudiUniverDto();
    result.setPkeyEstudian( this.getPkeyEstudian()); 
    result.setFkeyProgAcad( this.getFkeyProgAcad()); 
    result.setFkeyHojaVida( this.getFkeyHojaVida()); 
    result.setFkeyInscripc( this.getFkeyInscripc()); 
    result.setFkeyCasLiqMa( this.getFkeyCasLiqMa()); 
    result.setFkeyPlanEstu( this.getFkeyPlanEstu()); 
    result.setFkeyPeriAcad( this.getFkeyPeriAcad()); 
    result.setCodiEstudian( this.getCodiEstudian()); 
    result.setNombEstudian( this.getNombEstudian()); 
    result.setApelEstudian( this.getApelEstudian()); 
    result.setSeguApelEstu( this.getSeguApelEstu()); 
    result.setNiveEstudian( this.getNiveEstudian()); 
    result.setDescripcion( this.getDescripcion()); 
    result.setLogiAcceSist( this.getLogiAcceSist()); 
    result.setClavAcceSist( this.getClavAcceSist()); 
    result.setEstaClavAcce( this.getEstaClavAcce()); 
    result.setEstaActiEstu( this.getEstaActiEstu()); 
    result.setEstaAcadEstu( this.getEstaAcadEstu()); 
    result.setJornBaseEstu( this.getJornBaseEstu()); 
    result.setEstaNiveEstu( this.getEstaNiveEstu()); 
    result.setTipoIngrEstu( this.getTipoIngrEstu()); 
    result.setFkeyProgAcadDto( this.getFkeyProgAcadDto());
    return result;
  }
}

