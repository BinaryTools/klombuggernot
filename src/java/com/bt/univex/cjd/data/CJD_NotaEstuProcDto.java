package com.bt.univex.cjd.data;

import java.util.*; 
import com.xpc.base.*; 
import com.bt.univex.ads.data.* ;

public class CJD_NotaEstuProcDto extends BaseDto {


  private Integer pkeyNotaEstu;
  private Integer fkeyEstuProc;
  private Integer fkeyPeriAcad;
  private Double notaEstuProc;
  private Date fechRegiNota;
  private Date fechActuNota;

  private ADS_PeriodAcademDto fkeyPeriAcadDto;
  private CJD_EstudiProcesDto fkeyEstuProcDto;

  public CJD_NotaEstuProcDto() { 
     PkeyEnti = 216703;
     setAliasName("NotEstPr"); 
  } 

//-------------------------------------------| PkeyNotaEstu
  public Integer getPkeyNotaEstu(){ return pkeyNotaEstu; } 
  public Integer getPkeyNotaEstuNn(){ return setNotNull(pkeyNotaEstu); } 
  public String getPkeyNotaEstuDesc(){ return setDesc(pkeyNotaEstu); } 
  public void setPkeyNotaEstu(Integer value){ this.pkeyNotaEstu=value;} 
  @Override
  public int toInt(){ return getPkeyNotaEstuNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyNotaEstu; }; 
//-------------------------------------------| fkeyEstuProc
  public Integer getFkeyEstuProc(){ return fkeyEstuProc; } 
  public Integer getFkeyEstuProcNn(){ return setNotNull(fkeyEstuProc); } 
  public String getFkeyEstuProcDesc(){ return setDesc(fkeyEstuProc); } 
  public void setFkeyEstuProc(Integer value){ this.fkeyEstuProc=value;} 
//-------------------------------------------| FkeyPeriAcad
  public Integer getFkeyPeriAcad(){ return fkeyPeriAcad; } 
  public Integer getFkeyPeriAcadNn(){ return setNotNull(fkeyPeriAcad); } 
  public String getFkeyPeriAcadDesc(){ return setDesc(fkeyPeriAcad); } 
  public void setFkeyPeriAcad(Integer value){ this.fkeyPeriAcad=value;} 
//-------------------------------------------| NotaEstuProc
  public Double getNotaEstuProc(){ return notaEstuProc; } 
  public Double getNotaEstuProcNn(){ return setNotNull(notaEstuProc); } 
  public String getNotaEstuProcDesc(){ return setDesc(notaEstuProc); } 
  public void setNotaEstuProc(Double value){ this.notaEstuProc=value;} 
//-------------------------------------------| FechRegiNota
  public Date getFechRegiNota(){ return fechRegiNota; } 
  public Date getFechRegiNotaNn(){ return setNotNull(fechRegiNota); } 
  public String getFechRegiNotaDesc(){ return setDesc(fechRegiNota); } 
  public void setFechRegiNota(Date value){ this.fechRegiNota=value;} 
//-------------------------------------------| FechActuNota
  public Date getFechActuNota(){ return fechActuNota; } 
  public Date getFechActuNotaNn(){ return setNotNull(fechActuNota); } 
  public String getFechActuNotaDesc(){ return setDesc(fechActuNota); } 
  public void setFechActuNota(Date value){ this.fechActuNota=value;} 
// ---------------(RANGOS) 

//---------------------(REL: FkeyPeriAcadDto) 
  public ADS_PeriodAcademDto getFkeyPeriAcadDto() { return fkeyPeriAcadDto; } 
  public void setFkeyPeriAcadDto(ADS_PeriodAcademDto fkeyPeriAcadDto) {
    if ( fkeyPeriAcadDto != null ) { 
      this.fkeyPeriAcad = fkeyPeriAcadDto.getPkeyPeriAcad(); 
    }
    this.fkeyPeriAcadDto = fkeyPeriAcadDto;
  } 
//---------------------(REL: fkeyEstuProcDto) 
  public CJD_EstudiProcesDto getFkeyEstuProcDto() { return fkeyEstuProcDto; } 
  public void setFkeyEstuProcDto(CJD_EstudiProcesDto fkeyEstuProcDto) {
    if ( fkeyEstuProcDto != null ) { 
      this.fkeyEstuProc = fkeyEstuProcDto.getPkeyEstuProc(); 
    }
    this.fkeyEstuProcDto = fkeyEstuProcDto;
  } 


  @Override 
  public CJD_NotaEstuProcDto copy(){
    CJD_NotaEstuProcDto result = new CJD_NotaEstuProcDto();
    result.setPkeyNotaEstu( this.getPkeyNotaEstu()); 
    result.setFkeyEstuProc( this.getFkeyEstuProc()); 
    result.setFkeyPeriAcad( this.getFkeyPeriAcad()); 
    result.setNotaEstuProc( this.getNotaEstuProc()); 
    result.setFechRegiNota( this.getFechRegiNota()); 
    result.setFechActuNota( this.getFechActuNota()); 
    result.setFkeyPeriAcadDto( this.getFkeyPeriAcadDto());
    result.setFkeyEstuProcDto( this.getFkeyEstuProcDto());
    return result;
  }
}

