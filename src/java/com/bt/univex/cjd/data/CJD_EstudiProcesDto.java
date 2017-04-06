package com.bt.univex.cjd.data;

import java.util.*; 
import com.xpc.base.*; 
import com.bt.univex.ads.data.* ;

public class CJD_EstudiProcesDto extends BaseDto {


  private Integer pkeyEstuProc;
  private Integer fkeyProcCons;
  private Integer fkeyEstudian;
  private Date fechAsigProc;
  private Date fechEntrProc;
  private Double notaProcCons;
  private String estaMuesRepo;
  private Date fechNotaProc;

  private CJD_ProcesConsulDto fkeyProcConsDto;
  private ADS_EstudiUniverDto fkeyEstudianDto;

  public CJD_EstudiProcesDto() { 
     PkeyEnti = 128503;
     setAliasName("EstuProc"); 
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

//---------------------(REL: FkeyProcConsDto) 
  public CJD_ProcesConsulDto getFkeyProcConsDto() { return fkeyProcConsDto; } 
  public void setFkeyProcConsDto(CJD_ProcesConsulDto fkeyProcConsDto) {
    if ( fkeyProcConsDto != null ) { 
      this.fkeyProcCons = fkeyProcConsDto.getPkeyProcCons(); 
    }
    this.fkeyProcConsDto = fkeyProcConsDto;
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
  public CJD_EstudiProcesDto copy(){
    CJD_EstudiProcesDto result = new CJD_EstudiProcesDto();
    result.setPkeyEstuProc( this.getPkeyEstuProc()); 
    result.setFkeyProcCons( this.getFkeyProcCons()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFechAsigProc( this.getFechAsigProc()); 
    result.setFechEntrProc( this.getFechEntrProc()); 
    result.setNotaProcCons( this.getNotaProcCons()); 
    result.setEstaMuesRepo( this.getEstaMuesRepo()); 
    result.setFechNotaProc( this.getFechNotaProc()); 
    result.setFkeyProcConsDto( this.getFkeyProcConsDto());
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    return result;
  }
}

