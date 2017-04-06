package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;

public class CJDVProcesConsulDto extends BaseDto {
  public static final List RANG_AreaProcesos = Arrays.asList( new Range[] { 
      new Range("P","Público"),
      new Range("C","Civil"),
      new Range("E","Penal"),
      new Range("L","Laboral"),
      new Range("O","Conciliación")});
  public static final List RANG_EstaProcesos = Arrays.asList( new Range[] { 
      new Range("E","En Trámite"),
      new Range("F","Finalizado"),
      new Range("I","Inactivo"),
      new Range("P","Sustitución")});
  public static final List RANG_OrigProcCons = Arrays.asList( new Range[] { 
      new Range("P","Jusgado"),
      new Range("C","Consulta")});


  private Integer pkeyProcCons;
  private String nombProcesos;
  private String areaProcesos;
  private String descProcesos;
  private String numeCasoProc;
  private String estaProcesos;
  private String origProcCons;
  private Integer fkeyDoceEspe;
  private String nombCompProf;

  private CJDVDocentEspeciDto fkeyDoceEspeDto;

  public CJDVProcesConsulDto() { 
     PkeyEnti = 130103;
     setAliasName("ProcConsV"); 
  } 

//-------------------------------------------| PkeyProcCons
  public Integer getPkeyProcCons(){ return pkeyProcCons; } 
  public Integer getPkeyProcConsNn(){ return setNotNull(pkeyProcCons); } 
  public String getPkeyProcConsDesc(){ return setDesc(pkeyProcCons); } 
  public void setPkeyProcCons(Integer value){ this.pkeyProcCons=value;} 
  @Override
  public int toInt(){ return getPkeyProcConsNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyProcCons; }; 
//-------------------------------------------| NombProcesos
  public String getNombProcesos(){ return nombProcesos; } 
  public String getNombProcesosNn(){ return setNotNull(nombProcesos); } 
  public String getNombProcesosDesc(){ return setDesc(nombProcesos); } 
  public void setNombProcesos(String value){ this.nombProcesos=value;} 
  @Override
  public String toString(){ return getNombProcesosNn(); }; 
//-------------------------------------------| AreaProcesos
  public String getAreaProcesos(){ return areaProcesos; } 
  public String getAreaProcesosNn(){ return setNotNull(areaProcesos); } 
  public void setAreaProcesos(String value){ this.areaProcesos=value;} 
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
//-------------------------------------------| OrigProcCons
  public String getOrigProcCons(){ return origProcCons; } 
  public String getOrigProcConsNn(){ return setNotNull(origProcCons); } 
  public void setOrigProcCons(String value){ this.origProcCons=value;} 
//-------------------------------------------| FkeyDoceEspe
  public Integer getFkeyDoceEspe(){ return fkeyDoceEspe; } 
  public Integer getFkeyDoceEspeNn(){ return setNotNull(fkeyDoceEspe); } 
  public String getFkeyDoceEspeDesc(){ return setDesc(fkeyDoceEspe); } 
  public void setFkeyDoceEspe(Integer value){ this.fkeyDoceEspe=value;} 
//-------------------------------------------| NombCompProf
  public String getNombCompProf(){ return nombCompProf; } 
  public String getNombCompProfNn(){ return setNotNull(nombCompProf); } 
  public String getNombCompProfDesc(){ return setDesc(nombCompProf); } 
  public void setNombCompProf(String value){ this.nombCompProf=value;} 
// ---------------(RANGOS) 
  public String getAreaProcesosDesc() { return DtoMisc.getRangeDesc(RANG_AreaProcesos,getAreaProcesosNn()); } 
  public String getEstaProcesosDesc() { return DtoMisc.getRangeDesc(RANG_EstaProcesos,getEstaProcesosNn()); } 
  public String getOrigProcConsDesc() { return DtoMisc.getRangeDesc(RANG_OrigProcCons,getOrigProcConsNn()); } 

//---------------------(REL: FkeyDoceEspeDto) 
  public CJDVDocentEspeciDto getFkeyDoceEspeDto() { return fkeyDoceEspeDto; } 
  public void setFkeyDoceEspeDto(CJDVDocentEspeciDto fkeyDoceEspeDto) {
    if ( fkeyDoceEspeDto != null ) { 
      this.fkeyDoceEspe = fkeyDoceEspeDto.getPkeyDoceEspe(); 
    }
    this.fkeyDoceEspeDto = fkeyDoceEspeDto;
  } 


  @Override 
  public CJDVProcesConsulDto copy(){
    CJDVProcesConsulDto result = new CJDVProcesConsulDto();
    result.setPkeyProcCons( this.getPkeyProcCons()); 
    result.setNombProcesos( this.getNombProcesos()); 
    result.setAreaProcesos( this.getAreaProcesos()); 
    result.setDescProcesos( this.getDescProcesos()); 
    result.setNumeCasoProc( this.getNumeCasoProc()); 
    result.setEstaProcesos( this.getEstaProcesos()); 
    result.setOrigProcCons( this.getOrigProcCons()); 
    result.setFkeyDoceEspe( this.getFkeyDoceEspe()); 
    result.setNombCompProf( this.getNombCompProf()); 
    result.setFkeyDoceEspeDto( this.getFkeyDoceEspeDto());
    return result;
  }
}

