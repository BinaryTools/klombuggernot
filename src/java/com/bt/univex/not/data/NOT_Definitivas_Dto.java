package com.bt.univex.not.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.def.data.* ;
import com.bt.univex.ads.data.* ;

public class NOT_Definitivas_Dto extends BaseDto {
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});
  public static final List RANG_AsigComp = Arrays.asList( new Range[] { 
      new Range("A","Se anuló"),
      new Range("C","Se canceló voluntariamente"),
      new Range("N","No se completó"),
      new Range("R","Restringido"),
      new Range("S","Si se completó")});
  public static final List RANG_OrigDefi = Arrays.asList( new Range[] { 
      new Range("C","Curso de Vacacionales"),
      new Range("D","Normalmente Distancia"),
      new Range("F","Trasferencia"),
      new Range("H","Forzosa (No afecta ningún promedio)"),
      new Range("L","Nivelación"),
      new Range("N","Cursada normalmente"),
      new Range("S","Suficiencia"),
      new Range("T","Traslados"),
      new Range("U","Tutoriales"),
      new Range("V","Validacion")});
  public static final List RANG_ReviNota = Arrays.asList( new Range[] { 
      new Range("C","Se revisó y se corrigió"),
      new Range("N","Digitada pero no se ha revisado"),
      new Range("S","Digitada y sí se revisó"),
      new Range("V","No se ha digitado")});


  private Integer pkeyDefiniti;
  private Integer fkeyEstudian;
  private Integer fkeyAsigEstu;
  private Integer fkeyPeriPlan;
  private Integer fkeyClasCali;
  private Double notaNumerica;
  private Integer fkeyNotaRang;
  private String notaValoRang;
  private String estaAproDefi;
  private String compCursAsig;
  private String tipoOrigNota;
  private Integer niveDondCurs;
  private String fue_ReviDefi;
  private Date fechReviDefi;
  private Integer credDefiniti;
  private Double pondPromDefi;

  private ADS_EstudiUniverDto fkeyEstudianDto;
  private DEF_AsignaEstudiDto fkeyAsigEstuDto;
  private DEFVPeriPlanProgDto fkeyPeriPlanDto;
  private ADS_Clase_CalifiDto fkeyClasCaliDto;

  public NOT_Definitivas_Dto() { 
     PkeyEnti = 22703;
     setAliasName("Definiti"); 
  } 

//-------------------------------------------| PkeyDefiniti
  public Integer getPkeyDefiniti(){ return pkeyDefiniti; } 
  public Integer getPkeyDefinitiNn(){ return setNotNull(pkeyDefiniti); } 
  public String getPkeyDefinitiDesc(){ return setDesc(pkeyDefiniti); } 
  public void setPkeyDefiniti(Integer value){ this.pkeyDefiniti=value;} 
  @Override
  public int toInt(){ return getPkeyDefinitiNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyDefiniti; }; 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| FkeyAsigEstu
  public Integer getFkeyAsigEstu(){ return fkeyAsigEstu; } 
  public Integer getFkeyAsigEstuNn(){ return setNotNull(fkeyAsigEstu); } 
  public String getFkeyAsigEstuDesc(){ return setDesc(fkeyAsigEstu); } 
  public void setFkeyAsigEstu(Integer value){ this.fkeyAsigEstu=value;} 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
//-------------------------------------------| FkeyClasCali
  public Integer getFkeyClasCali(){ return fkeyClasCali; } 
  public Integer getFkeyClasCaliNn(){ return setNotNull(fkeyClasCali); } 
  public String getFkeyClasCaliDesc(){ return setDesc(fkeyClasCali); } 
  public void setFkeyClasCali(Integer value){ this.fkeyClasCali=value;} 
//-------------------------------------------| NotaNumerica
  public Double getNotaNumerica(){ return notaNumerica; } 
  public Double getNotaNumericaNn(){ return setNotNull(notaNumerica); } 
  public String getNotaNumericaDesc(){ return setDesc(notaNumerica); } 
  public void setNotaNumerica(Double value){ this.notaNumerica=value;} 
  @Override
  public String toString(){ return ""+getNotaNumericaNn(); }; 
//-------------------------------------------| FkeyNotaRang
  public Integer getFkeyNotaRang(){ return fkeyNotaRang; } 
  public Integer getFkeyNotaRangNn(){ return setNotNull(fkeyNotaRang); } 
  public String getFkeyNotaRangDesc(){ return setDesc(fkeyNotaRang); } 
  public void setFkeyNotaRang(Integer value){ this.fkeyNotaRang=value;} 
//-------------------------------------------| NotaValoRang
  public String getNotaValoRang(){ return notaValoRang; } 
  public String getNotaValoRangNn(){ return setNotNull(notaValoRang); } 
  public String getNotaValoRangDesc(){ return setDesc(notaValoRang); } 
  public void setNotaValoRang(String value){ this.notaValoRang=value;} 
//-------------------------------------------| EstaAproDefi
  public String getEstaAproDefi(){ return estaAproDefi; } 
  public String getEstaAproDefiNn(){ return setNotNull(estaAproDefi); } 
  public void setEstaAproDefi(String value){ this.estaAproDefi=value;} 
  public boolean getEstaAproDefiBool() { return estaAproDefi==null?false:estaAproDefi.equals("S");}
  public void setEstaAproDefiBool(boolean estaAproDefi) { this.estaAproDefi=estaAproDefi?"S":"N";}
//-------------------------------------------| CompCursAsig
  public String getCompCursAsig(){ return compCursAsig; } 
  public String getCompCursAsigNn(){ return setNotNull(compCursAsig); } 
  public void setCompCursAsig(String value){ this.compCursAsig=value;} 
//-------------------------------------------| TipoOrigNota
  public String getTipoOrigNota(){ return tipoOrigNota; } 
  public String getTipoOrigNotaNn(){ return setNotNull(tipoOrigNota); } 
  public void setTipoOrigNota(String value){ this.tipoOrigNota=value;} 
//-------------------------------------------| NiveDondCurs
  public Integer getNiveDondCurs(){ return niveDondCurs; } 
  public Integer getNiveDondCursNn(){ return setNotNull(niveDondCurs); } 
  public String getNiveDondCursDesc(){ return setDesc(niveDondCurs); } 
  public void setNiveDondCurs(Integer value){ this.niveDondCurs=value;} 
//-------------------------------------------| Fue_ReviDefi
  public String getFue_ReviDefi(){ return fue_ReviDefi; } 
  public String getFue_ReviDefiNn(){ return setNotNull(fue_ReviDefi); } 
  public void setFue_ReviDefi(String value){ this.fue_ReviDefi=value;} 
//-------------------------------------------| FechReviDefi
  public Date getFechReviDefi(){ return fechReviDefi; } 
  public Date getFechReviDefiNn(){ return setNotNull(fechReviDefi); } 
  public String getFechReviDefiDesc(){ return setDesc(fechReviDefi); } 
  public void setFechReviDefi(Date value){ this.fechReviDefi=value;} 
//-------------------------------------------| CredDefiniti
  public Integer getCredDefiniti(){ return credDefiniti; } 
  public Integer getCredDefinitiNn(){ return setNotNull(credDefiniti); } 
  public String getCredDefinitiDesc(){ return setDesc(credDefiniti); } 
  public void setCredDefiniti(Integer value){ this.credDefiniti=value;} 
//-------------------------------------------| PondPromDefi
  public Double getPondPromDefi(){ return pondPromDefi; } 
  public Double getPondPromDefiNn(){ return setNotNull(pondPromDefi); } 
  public String getPondPromDefiDesc(){ return setDesc(pondPromDefi); } 
  public void setPondPromDefi(Double value){ this.pondPromDefi=value;} 
// ---------------(RANGOS) 
  public String getEstaAproDefiDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaAproDefiNn()); } 
  public String getCompCursAsigDesc() { return DtoMisc.getRangeDesc(RANG_AsigComp,getCompCursAsigNn()); } 
  public String getTipoOrigNotaDesc() { return DtoMisc.getRangeDesc(RANG_OrigDefi,getTipoOrigNotaNn()); } 
  public String getFue_ReviDefiDesc() { return DtoMisc.getRangeDesc(RANG_ReviNota,getFue_ReviDefiNn()); } 

//---------------------(REL: FkeyEstudianDto) 
  public ADS_EstudiUniverDto getFkeyEstudianDto() { return fkeyEstudianDto; } 
  public void setFkeyEstudianDto(ADS_EstudiUniverDto fkeyEstudianDto) {
    if ( fkeyEstudianDto != null ) { 
      this.fkeyEstudian = fkeyEstudianDto.getPkeyEstudian(); 
    }
    this.fkeyEstudianDto = fkeyEstudianDto;
  } 
//---------------------(REL: FkeyAsigEstuDto) 
  public DEF_AsignaEstudiDto getFkeyAsigEstuDto() { return fkeyAsigEstuDto; } 
  public void setFkeyAsigEstuDto(DEF_AsignaEstudiDto fkeyAsigEstuDto) {
    if ( fkeyAsigEstuDto != null ) { 
      this.fkeyAsigEstu = fkeyAsigEstuDto.getPkeyAsigEstu(); 
    }
    this.fkeyAsigEstuDto = fkeyAsigEstuDto;
  } 
//---------------------(REL: FkeyPeriPlanDto) 
  public DEFVPeriPlanProgDto getFkeyPeriPlanDto() { return fkeyPeriPlanDto; } 
  public void setFkeyPeriPlanDto(DEFVPeriPlanProgDto fkeyPeriPlanDto) {
    if ( fkeyPeriPlanDto != null ) { 
      this.fkeyPeriPlan = fkeyPeriPlanDto.getPkeyPeriPlan(); 
    }
    this.fkeyPeriPlanDto = fkeyPeriPlanDto;
  } 
//---------------------(REL: FkeyClasCaliDto) 
  public ADS_Clase_CalifiDto getFkeyClasCaliDto() { return fkeyClasCaliDto; } 
  public void setFkeyClasCaliDto(ADS_Clase_CalifiDto fkeyClasCaliDto) {
    if ( fkeyClasCaliDto != null ) { 
      this.fkeyClasCali = fkeyClasCaliDto.getPkeyClasCali(); 
    }
    this.fkeyClasCaliDto = fkeyClasCaliDto;
  } 


  @Override 
  public NOT_Definitivas_Dto copy(){
    NOT_Definitivas_Dto result = new NOT_Definitivas_Dto();
    result.setPkeyDefiniti( this.getPkeyDefiniti()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFkeyAsigEstu( this.getFkeyAsigEstu()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setFkeyClasCali( this.getFkeyClasCali()); 
    result.setNotaNumerica( this.getNotaNumerica()); 
    result.setFkeyNotaRang( this.getFkeyNotaRang()); 
    result.setNotaValoRang( this.getNotaValoRang()); 
    result.setEstaAproDefi( this.getEstaAproDefi()); 
    result.setCompCursAsig( this.getCompCursAsig()); 
    result.setTipoOrigNota( this.getTipoOrigNota()); 
    result.setNiveDondCurs( this.getNiveDondCurs()); 
    result.setFue_ReviDefi( this.getFue_ReviDefi()); 
    result.setFechReviDefi( this.getFechReviDefi()); 
    result.setCredDefiniti( this.getCredDefiniti()); 
    result.setPondPromDefi( this.getPondPromDefi()); 
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    result.setFkeyAsigEstuDto( this.getFkeyAsigEstuDto());
    result.setFkeyPeriPlanDto( this.getFkeyPeriPlanDto());
    result.setFkeyClasCaliDto( this.getFkeyClasCaliDto());
    return result;
  }
}

