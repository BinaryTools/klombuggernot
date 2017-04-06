package com.bt.univex.not.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.not.data.*;
import com.bt.univex.ads.data.* ;
import com.bt.univex.crg.data.* ;
import com.bt.univex.ads.data.* ;

public class NOTVCalificacionDto extends BaseDto {


  private Integer pkeyCalifica;
  private String nombMomento_;
  private Integer fkeyEstudian;
  private Integer fkeyGrupAsig;
  private Integer fkeyPeriPlan;
  private Integer fkeyDiviMome;
  private Integer fkeyClasCali;
  private Double notaNumerica;
  private String codiAsigEstu;
  private Integer fkeyNotaRang;
  private String notaValoRang;
  private String nombAsigEstu;
  private String estaAproCali;
  private String nombGrupNive;
  private String fue_PresCali;
  private Integer niveDentPlan;
  private String fue_Revisada;
  private Date fechModiCali;
  private String codiEstudian;
  private String estaActiEstu;
  private String nombEstudian;
  private String apelEstudian;
  private String seguApelEstu;
  private String descripcion;

  private ADS_EstudiUniverDto fkeyEstudianDto;
  private CRG_Grupo_AsignaDto fkeyGrupAsigDto;
  private ADS_DivisiMomentDto fkeyDiviMomeDto;

  public NOTVCalificacionDto() { 
     PkeyEnti = 26803;
     setAliasName("Califica"); 
  } 

//-------------------------------------------| PkeyCalifica
  public Integer getPkeyCalifica(){ return pkeyCalifica; } 
  public Integer getPkeyCalificaNn(){ return setNotNull(pkeyCalifica); } 
  public String getPkeyCalificaDesc(){ return setDesc(pkeyCalifica); } 
  public void setPkeyCalifica(Integer value){ this.pkeyCalifica=value;} 
  @Override
  public int toInt(){ return getPkeyCalificaNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyCalifica; }; 
//-------------------------------------------| NombMomento_
  public String getNombMomento_(){ return nombMomento_; } 
  public String getNombMomento_Nn(){ return setNotNull(nombMomento_); } 
  public String getNombMomento_Desc(){ return setDesc(nombMomento_); } 
  public void setNombMomento_(String value){ this.nombMomento_=value;} 
  @Override
  public String toString(){ return getNombMomento_Nn(); }; 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| FkeyGrupAsig
  public Integer getFkeyGrupAsig(){ return fkeyGrupAsig; } 
  public Integer getFkeyGrupAsigNn(){ return setNotNull(fkeyGrupAsig); } 
  public String getFkeyGrupAsigDesc(){ return setDesc(fkeyGrupAsig); } 
  public void setFkeyGrupAsig(Integer value){ this.fkeyGrupAsig=value;} 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
//-------------------------------------------| FkeyDiviMome
  public Integer getFkeyDiviMome(){ return fkeyDiviMome; } 
  public Integer getFkeyDiviMomeNn(){ return setNotNull(fkeyDiviMome); } 
  public String getFkeyDiviMomeDesc(){ return setDesc(fkeyDiviMome); } 
  public void setFkeyDiviMome(Integer value){ this.fkeyDiviMome=value;} 
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
//-------------------------------------------| CodiAsigEstu
  public String getCodiAsigEstu(){ return codiAsigEstu; } 
  public String getCodiAsigEstuNn(){ return setNotNull(codiAsigEstu); } 
  public String getCodiAsigEstuDesc(){ return setDesc(codiAsigEstu); } 
  public void setCodiAsigEstu(String value){ this.codiAsigEstu=value;} 
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
//-------------------------------------------| NombAsigEstu
  public String getNombAsigEstu(){ return nombAsigEstu; } 
  public String getNombAsigEstuNn(){ return setNotNull(nombAsigEstu); } 
  public String getNombAsigEstuDesc(){ return setDesc(nombAsigEstu); } 
  public void setNombAsigEstu(String value){ this.nombAsigEstu=value;} 
//-------------------------------------------| EstaAproCali
  public String getEstaAproCali(){ return estaAproCali; } 
  public String getEstaAproCaliNn(){ return setNotNull(estaAproCali); } 
  public String getEstaAproCaliDesc(){ return setDesc(estaAproCali); } 
  public void setEstaAproCali(String value){ this.estaAproCali=value;} 
//-------------------------------------------| NombGrupNive
  public String getNombGrupNive(){ return nombGrupNive; } 
  public String getNombGrupNiveNn(){ return setNotNull(nombGrupNive); } 
  public String getNombGrupNiveDesc(){ return setDesc(nombGrupNive); } 
  public void setNombGrupNive(String value){ this.nombGrupNive=value;} 
//-------------------------------------------| Fue_PresCali
  public String getFue_PresCali(){ return fue_PresCali; } 
  public String getFue_PresCaliNn(){ return setNotNull(fue_PresCali); } 
  public String getFue_PresCaliDesc(){ return setDesc(fue_PresCali); } 
  public void setFue_PresCali(String value){ this.fue_PresCali=value;} 
  public boolean getFue_PresCaliBool() { return fue_PresCali==null?false:fue_PresCali.equals("S");}
  public void setFue_PresCaliBool(boolean fue_PresCali) { this.fue_PresCali=fue_PresCali?"S":"N";}
//-------------------------------------------| NiveDentPlan
  public Integer getNiveDentPlan(){ return niveDentPlan; } 
  public Integer getNiveDentPlanNn(){ return setNotNull(niveDentPlan); } 
  public String getNiveDentPlanDesc(){ return setDesc(niveDentPlan); } 
  public void setNiveDentPlan(Integer value){ this.niveDentPlan=value;} 
//-------------------------------------------| Fue_Revisada
  public String getFue_Revisada(){ return fue_Revisada; } 
  public String getFue_RevisadaNn(){ return setNotNull(fue_Revisada); } 
  public String getFue_RevisadaDesc(){ return setDesc(fue_Revisada); } 
  public void setFue_Revisada(String value){ this.fue_Revisada=value;} 
//-------------------------------------------| FechModiCali
  public Date getFechModiCali(){ return fechModiCali; } 
  public Date getFechModiCaliNn(){ return setNotNull(fechModiCali); } 
  public String getFechModiCaliDesc(){ return setDesc(fechModiCali); } 
  public void setFechModiCali(Date value){ this.fechModiCali=value;} 
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
//-------------------------------------------| Descripcion
  public String getDescripcion(){ return descripcion; } 
  public String getDescripcionNn(){ return setNotNull(descripcion); } 
  public String getDescripcionDesc(){ return setDesc(descripcion); } 
  public void setDescripcion(String value){ this.descripcion=value;} 
//  @Override
//  public String toString(){ return getDescripcionNn(); }; 
// ---------------(RANGOS) 

//---------------------(REL: FkeyEstudianDto) 
  public ADS_EstudiUniverDto getFkeyEstudianDto() { return fkeyEstudianDto; } 
  public void setFkeyEstudianDto(ADS_EstudiUniverDto fkeyEstudianDto) {
    if ( fkeyEstudianDto != null ) { 
      this.fkeyEstudian = fkeyEstudianDto.getPkeyEstudian(); 
    }
    this.fkeyEstudianDto = fkeyEstudianDto;
  } 
//---------------------(REL: FkeyGrupAsigDto) 
  public CRG_Grupo_AsignaDto getFkeyGrupAsigDto() { return fkeyGrupAsigDto; } 
  public void setFkeyGrupAsigDto(CRG_Grupo_AsignaDto fkeyGrupAsigDto) {
    if ( fkeyGrupAsigDto != null ) { 
      this.fkeyGrupAsig = fkeyGrupAsigDto.getPkeyGrupAsig(); 
    }
    this.fkeyGrupAsigDto = fkeyGrupAsigDto;
  } 
//---------------------(REL: FkeyDiviMomeDto) 
  public ADS_DivisiMomentDto getFkeyDiviMomeDto() { return fkeyDiviMomeDto; } 
  public void setFkeyDiviMomeDto(ADS_DivisiMomentDto fkeyDiviMomeDto) {
    if ( fkeyDiviMomeDto != null ) { 
      this.fkeyDiviMome = fkeyDiviMomeDto.getPkeyDiviMome(); 
    }
    this.fkeyDiviMomeDto = fkeyDiviMomeDto;
  } 


  @Override 
  public NOTVCalificacionDto copy(){
    NOTVCalificacionDto result = new NOTVCalificacionDto();
    result.setPkeyCalifica( this.getPkeyCalifica()); 
    result.setNombMomento_( this.getNombMomento_()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setFkeyDiviMome( this.getFkeyDiviMome()); 
    result.setFkeyClasCali( this.getFkeyClasCali()); 
    result.setNotaNumerica( this.getNotaNumerica()); 
    result.setCodiAsigEstu( this.getCodiAsigEstu()); 
    result.setFkeyNotaRang( this.getFkeyNotaRang()); 
    result.setNotaValoRang( this.getNotaValoRang()); 
    result.setNombAsigEstu( this.getNombAsigEstu()); 
    result.setEstaAproCali( this.getEstaAproCali()); 
    result.setNombGrupNive( this.getNombGrupNive()); 
    result.setFue_PresCali( this.getFue_PresCali()); 
    result.setNiveDentPlan( this.getNiveDentPlan()); 
    result.setFue_Revisada( this.getFue_Revisada()); 
    result.setFechModiCali( this.getFechModiCali()); 
    result.setCodiEstudian( this.getCodiEstudian()); 
    result.setEstaActiEstu( this.getEstaActiEstu()); 
    result.setNombEstudian( this.getNombEstudian()); 
    result.setApelEstudian( this.getApelEstudian()); 
    result.setSeguApelEstu( this.getSeguApelEstu()); 
    result.setDescripcion( this.getDescripcion()); 
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    result.setFkeyGrupAsigDto( this.getFkeyGrupAsigDto());
    result.setFkeyDiviMomeDto( this.getFkeyDiviMomeDto());
    return result;
  }
}

