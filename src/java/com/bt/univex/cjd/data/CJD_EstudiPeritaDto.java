package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.ads.data.* ;

public class CJD_EstudiPeritaDto extends BaseDto {


  private Integer pkeyEstuPeri;
  private Integer fkeyPeriCons;
  private Integer fkeyEstudian;
  private Date fechAsigPeri;
  private Date fechEntrPeri;
  private Double notaPeritaje;
  private Date fechNotaPeri;

  private CJD_PeritaConsulDto fkeyPeriConsDto;
  private ADS_EstudiUniverDto fkeyEstudianDto;

  public CJD_EstudiPeritaDto() { 
     PkeyEnti = 186403;
     setAliasName("EstuPeri"); 
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
//-------------------------------------------| FechNotaPeri
  public Date getFechNotaPeri(){ return fechNotaPeri; } 
  public Date getFechNotaPeriNn(){ return setNotNull(fechNotaPeri); } 
  public String getFechNotaPeriDesc(){ return setDesc(fechNotaPeri); } 
  public void setFechNotaPeri(Date value){ this.fechNotaPeri=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyPeriConsDto) 
  public CJD_PeritaConsulDto getFkeyPeriConsDto() { return fkeyPeriConsDto; } 
  public void setFkeyPeriConsDto(CJD_PeritaConsulDto fkeyPeriConsDto) {
    if ( fkeyPeriConsDto != null ) { 
      this.fkeyPeriCons = fkeyPeriConsDto.getPkeyPeriCons(); 
    }
    this.fkeyPeriConsDto = fkeyPeriConsDto;
  } 
//---------------------(REL: FkeyEstudianDto) 
  public ADS_EstudiUniverDto getFkeyEstudianDto() { return fkeyEstudianDto; } 
  public void setFkeyEstudianDto(ADS_EstudiUniverDto fkeyEstudianDto) {
    if ( fkeyEstudianDto != null ) { 
      this.fkeyEstudian = fkeyEstudianDto.getPkeyEstudian(); 
    }
    this.fkeyEstudianDto = fkeyEstudianDto;
  } 


  @Override 
  public CJD_EstudiPeritaDto copy(){
    CJD_EstudiPeritaDto result = new CJD_EstudiPeritaDto();
    result.setPkeyEstuPeri( this.getPkeyEstuPeri()); 
    result.setFkeyPeriCons( this.getFkeyPeriCons()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFechAsigPeri( this.getFechAsigPeri()); 
    result.setFechEntrPeri( this.getFechEntrPeri()); 
    result.setNotaPeritaje( this.getNotaPeritaje()); 
    result.setFechNotaPeri( this.getFechNotaPeri()); 
    result.setFkeyPeriConsDto( this.getFkeyPeriConsDto());
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    return result;
  }
}

