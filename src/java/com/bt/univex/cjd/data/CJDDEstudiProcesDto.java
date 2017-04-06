package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDDEstudiProcesDto extends BaseDto {
  public static final List RANG_AreaProcesos = Arrays.asList( new Range[] { 
      new Range("P","Publico"),
      new Range("C","Civil"),
      new Range("E","Penal"),
      new Range("L","Laboral"),
      new Range("O","Conciliación")});
  public static final List RANG_EstaProcesos = Arrays.asList( new Range[] { 
      new Range("E","En Trámite"),
      new Range("F","Finalizado"),
      new Range("I","Inactivo"),
      new Range("P","Sustitución")});


  private Integer pkeyEstuProc;
  private Integer fkeyProcCons;
  private Integer fkeyDoceEspe;
  private Integer fkeyEstudian;
  private Date fechAsigProc;
  private Date fechEntrProc;
  private String nombProcesos;
  private String areaProcesos;
  private String nombCompProf;
  private String descProcesos;
  private String numeCasoProc;
  private String estaProcesos;
  private Double notaProcCons;
  private String estaMuesRepo;
  private Date fechNotaProc;


  public CJDDEstudiProcesDto() { 
     PkeyEnti = 132503;
     setAliasName("EstuProcD"); 
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
//-------------------------------------------| FkeyDoceEspe
  public Integer getFkeyDoceEspe(){ return fkeyDoceEspe; } 
  public Integer getFkeyDoceEspeNn(){ return setNotNull(fkeyDoceEspe); } 
  public String getFkeyDoceEspeDesc(){ return setDesc(fkeyDoceEspe); } 
  public void setFkeyDoceEspe(Integer value){ this.fkeyDoceEspe=value;} 
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
//-------------------------------------------| NombProcesos
  public String getNombProcesos(){ return nombProcesos; } 
  public String getNombProcesosNn(){ return setNotNull(nombProcesos); } 
  public String getNombProcesosDesc(){ return setDesc(nombProcesos); } 
  public void setNombProcesos(String value){ this.nombProcesos=value;} 
//-------------------------------------------| AreaProcesos
  public String getAreaProcesos(){ return areaProcesos; } 
  public String getAreaProcesosNn(){ return setNotNull(areaProcesos); } 
  public void setAreaProcesos(String value){ this.areaProcesos=value;} 
//-------------------------------------------| NombCompProf
  public String getNombCompProf(){ return nombCompProf; } 
  public String getNombCompProfNn(){ return setNotNull(nombCompProf); } 
  public String getNombCompProfDesc(){ return setDesc(nombCompProf); } 
  public void setNombCompProf(String value){ this.nombCompProf=value;} 
//-------------------------------------------| DescProcesos
  public String getDescProcesos(){ return descProcesos; } 
  public String getDescProcesosNn(){ return setNotNull(descProcesos); } 
  public String getDescProcesosDesc(){ return setDesc(descProcesos); } 
  public void setDescProcesos(String value){ this.descProcesos=value;} 
//-------------------------------------------| NumeCasoProc
  public String getNumeCasoProc(){ return numeCasoProc; } 
  public String getNumeCasoProcNn(){ return setNotNull(numeCasoProc); } 
  public String getNumeCasoProcDesc(){ return setDesc(numeCasoProc); } 
  public void setNumeCasoProc(String value){ this.numeCasoProc=value;} 
//-------------------------------------------| EstaProcesos
  public String getEstaProcesos(){ return estaProcesos; } 
  public String getEstaProcesosNn(){ return setNotNull(estaProcesos); } 
  public void setEstaProcesos(String value){ this.estaProcesos=value;} 
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
  public String getAreaProcesosDesc() { return DtoMisc.getRangeDesc(RANG_AreaProcesos,getAreaProcesosNn()); } 
  public String getEstaProcesosDesc() { return DtoMisc.getRangeDesc(RANG_EstaProcesos,getEstaProcesosNn()); } 



  @Override 
  public CJDDEstudiProcesDto copy(){
    CJDDEstudiProcesDto result = new CJDDEstudiProcesDto();
    result.setPkeyEstuProc( this.getPkeyEstuProc()); 
    result.setFkeyProcCons( this.getFkeyProcCons()); 
    result.setFkeyDoceEspe( this.getFkeyDoceEspe()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFechAsigProc( this.getFechAsigProc()); 
    result.setFechEntrProc( this.getFechEntrProc()); 
    result.setNombProcesos( this.getNombProcesos()); 
    result.setAreaProcesos( this.getAreaProcesos()); 
    result.setNombCompProf( this.getNombCompProf()); 
    result.setDescProcesos( this.getDescProcesos()); 
    result.setNumeCasoProc( this.getNumeCasoProc()); 
    result.setEstaProcesos( this.getEstaProcesos()); 
    result.setNotaProcCons( this.getNotaProcCons()); 
    result.setEstaMuesRepo( this.getEstaMuesRepo()); 
    result.setFechNotaProc( this.getFechNotaProc()); 
    return result;
  }
}

