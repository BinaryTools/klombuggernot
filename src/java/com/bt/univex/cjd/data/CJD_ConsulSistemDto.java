package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.ads.data.* ;
import com.bt.univex.crg.data.* ;
import com.bt.univex.cjd.data.* ;

public class CJD_ConsulSistemDto extends BaseDto {
  public static final List RANG_TipoConsSist = Arrays.asList( new Range[] { 
      new Range("L","Liquidación"),
      new Range("T","Tutela"),
      new Range("D","Derecho de Petición"),
      new Range("C","Conciliación"),
      new Range("A","Análisis de Jurisprudencia"),
      new Range("N","Consulta"),
      new Range("O","Otros")});
  public static final List RANG_EstaAproCons = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No"),
      new Range("A","Anulada")});
  public static final List RANG_AreaConsSist = Arrays.asList( new Range[] { 
      new Range("P","Público"),
      new Range("C","Civil"),
      new Range("E","Penal"),
      new Range("L","Laboral"),
      new Range("O","Conciliación")});


  private Integer pkeyConsSist;
  private Integer fkeyEstudian;
  private Integer fkeyCoorEstu;
  private Integer fkeyGrupAsig;
  private Integer fkeyDoceEspe;
  private String nombConsSist;
  private String descConsSist;
  private Integer numeRadiCons;
  private String tipoConsSist;
  private String valoConsSist;
  private String estaAproCons;
  private Double notaConsSist;
  private String areaConsSist;
  private Date fechConsSist;
  private String valoDoceCons;
  private String presOtroCons;
  private String tienApoderad;
  private String tienMenoEdad;
  private String procRequisit;
  private String procPosiSolu;
  private String procNoseInte;
  private Date fechCaliCons;
  private Date fechApruCoor;

  private CJDVCoordiEstudiDto fkeyCoorEstuDto;
  private ADS_EstudiUniverDto fkeyEstudianDto;
  private CRG_Grupo_AsignaDto fkeyGrupAsigDto;
  private CJDVDocentEspeciDto fkeyDoceEspeDto;

  public CJD_ConsulSistemDto() { 
     PkeyEnti = 129203;
     setAliasName("ConsSist"); 
  } 

//-------------------------------------------| PkeyConsSist
  public Integer getPkeyConsSist(){ return pkeyConsSist; } 
  public Integer getPkeyConsSistNn(){ return setNotNull(pkeyConsSist); } 
  public String getPkeyConsSistDesc(){ return setDesc(pkeyConsSist); } 
  public void setPkeyConsSist(Integer value){ this.pkeyConsSist=value;} 
  @Override
  public int toInt(){ return getPkeyConsSistNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyConsSist; }; 
//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
//-------------------------------------------| FkeyCoorEstu
  public Integer getFkeyCoorEstu(){ return fkeyCoorEstu; } 
  public Integer getFkeyCoorEstuNn(){ return setNotNull(fkeyCoorEstu); } 
  public String getFkeyCoorEstuDesc(){ return setDesc(fkeyCoorEstu); } 
  public void setFkeyCoorEstu(Integer value){ this.fkeyCoorEstu=value;} 
//-------------------------------------------| FkeyGrupAsig
  public Integer getFkeyGrupAsig(){ return fkeyGrupAsig; } 
  public Integer getFkeyGrupAsigNn(){ return setNotNull(fkeyGrupAsig); } 
  public String getFkeyGrupAsigDesc(){ return setDesc(fkeyGrupAsig); } 
  public void setFkeyGrupAsig(Integer value){ this.fkeyGrupAsig=value;} 
//-------------------------------------------| FkeyDoceEspe
  public Integer getFkeyDoceEspe(){ return fkeyDoceEspe; } 
  public Integer getFkeyDoceEspeNn(){ return setNotNull(fkeyDoceEspe); } 
  public String getFkeyDoceEspeDesc(){ return setDesc(fkeyDoceEspe); } 
  public void setFkeyDoceEspe(Integer value){ this.fkeyDoceEspe=value;} 
//-------------------------------------------| NombConsSist
  public String getNombConsSist(){ return nombConsSist; } 
  public String getNombConsSistNn(){ return setNotNull(nombConsSist); } 
  public String getNombConsSistDesc(){ return setDesc(nombConsSist); } 
  public void setNombConsSist(String value){ this.nombConsSist=value;} 
  @Override
  public String toString(){ return getNombConsSistNn(); }; 
//-------------------------------------------| DescConsSist
  public String getDescConsSist(){ return descConsSist; } 
  public String getDescConsSistNn(){ return setNotNull(descConsSist); } 
  public String getDescConsSistDesc(){ return setDesc(descConsSist); } 
  public void setDescConsSist(String value){ this.descConsSist=value;} 
//-------------------------------------------| NumeRadiCons
  public Integer getNumeRadiCons(){ return numeRadiCons; } 
  public Integer getNumeRadiConsNn(){ return setNotNull(numeRadiCons); } 
  public String getNumeRadiConsDesc(){ return setDesc(numeRadiCons); } 
  public void setNumeRadiCons(Integer value){ this.numeRadiCons=value;} 
//-------------------------------------------| TipoConsSist
  public String getTipoConsSist(){ return tipoConsSist; } 
  public String getTipoConsSistNn(){ return setNotNull(tipoConsSist); } 
  public void setTipoConsSist(String value){ this.tipoConsSist=value;} 
//-------------------------------------------| ValoConsSist
  public String getValoConsSist(){ return valoConsSist; } 
  public String getValoConsSistNn(){ return setNotNull(valoConsSist); } 
  public String getValoConsSistDesc(){ return setDesc(valoConsSist); } 
  public void setValoConsSist(String value){ this.valoConsSist=value;} 
//-------------------------------------------| EstaAproCons
  public String getEstaAproCons(){ return estaAproCons; } 
  public String getEstaAproConsNn(){ return setNotNull(estaAproCons); } 
  public void setEstaAproCons(String value){ this.estaAproCons=value;} 
//-------------------------------------------| NotaConsSist
  public Double getNotaConsSist(){ return notaConsSist; } 
  public Double getNotaConsSistNn(){ return setNotNull(notaConsSist); } 
  public String getNotaConsSistDesc(){ return setDesc(notaConsSist); } 
  public void setNotaConsSist(Double value){ this.notaConsSist=value;} 
//-------------------------------------------| AreaConsSist
  public String getAreaConsSist(){ return areaConsSist; } 
  public String getAreaConsSistNn(){ return setNotNull(areaConsSist); } 
  public void setAreaConsSist(String value){ this.areaConsSist=value;} 
//-------------------------------------------| FechConsSist
  public Date getFechConsSist(){ return fechConsSist; } 
  public Date getFechConsSistNn(){ return setNotNull(fechConsSist); } 
  public String getFechConsSistDesc(){ return setDesc(fechConsSist); } 
  public void setFechConsSist(Date value){ this.fechConsSist=value;} 
//-------------------------------------------| ValoDoceCons
  public String getValoDoceCons(){ return valoDoceCons; } 
  public String getValoDoceConsNn(){ return setNotNull(valoDoceCons); } 
  public String getValoDoceConsDesc(){ return setDesc(valoDoceCons); } 
  public void setValoDoceCons(String value){ this.valoDoceCons=value;} 
//-------------------------------------------| PresOtroCons
  public String getPresOtroCons(){ return presOtroCons; } 
  public String getPresOtroConsNn(){ return setNotNull(presOtroCons); } 
  public String getPresOtroConsDesc(){ return setDesc(presOtroCons); } 
  public void setPresOtroCons(String value){ this.presOtroCons=value;} 
  public boolean getPresOtroConsBool() { return presOtroCons==null?false:presOtroCons.equals("S");}
  public void setPresOtroConsBool(boolean presOtroCons) { this.presOtroCons=presOtroCons?"S":"N";}
//-------------------------------------------| TienApoderad
  public String getTienApoderad(){ return tienApoderad; } 
  public String getTienApoderadNn(){ return setNotNull(tienApoderad); } 
  public String getTienApoderadDesc(){ return setDesc(tienApoderad); } 
  public void setTienApoderad(String value){ this.tienApoderad=value;} 
  public boolean getTienApoderadBool() { return tienApoderad==null?false:tienApoderad.equals("S");}
  public void setTienApoderadBool(boolean tienApoderad) { this.tienApoderad=tienApoderad?"S":"N";}
//-------------------------------------------| TienMenoEdad
  public String getTienMenoEdad(){ return tienMenoEdad; } 
  public String getTienMenoEdadNn(){ return setNotNull(tienMenoEdad); } 
  public String getTienMenoEdadDesc(){ return setDesc(tienMenoEdad); } 
  public void setTienMenoEdad(String value){ this.tienMenoEdad=value;} 
  public boolean getTienMenoEdadBool() { return tienMenoEdad==null?false:tienMenoEdad.equals("S");}
  public void setTienMenoEdadBool(boolean tienMenoEdad) { this.tienMenoEdad=tienMenoEdad?"S":"N";}
//-------------------------------------------| ProcRequisit
  public String getProcRequisit(){ return procRequisit; } 
  public String getProcRequisitNn(){ return setNotNull(procRequisit); } 
  public String getProcRequisitDesc(){ return setDesc(procRequisit); } 
  public void setProcRequisit(String value){ this.procRequisit=value;} 
  public boolean getProcRequisitBool() { return procRequisit==null?false:procRequisit.equals("S");}
  public void setProcRequisitBool(boolean procRequisit) { this.procRequisit=procRequisit?"S":"N";}
//-------------------------------------------| ProcPosiSolu
  public String getProcPosiSolu(){ return procPosiSolu; } 
  public String getProcPosiSoluNn(){ return setNotNull(procPosiSolu); } 
  public String getProcPosiSoluDesc(){ return setDesc(procPosiSolu); } 
  public void setProcPosiSolu(String value){ this.procPosiSolu=value;} 
  public boolean getProcPosiSoluBool() { return procPosiSolu==null?false:procPosiSolu.equals("S");}
  public void setProcPosiSoluBool(boolean procPosiSolu) { this.procPosiSolu=procPosiSolu?"S":"N";}
//-------------------------------------------| ProcNoseInte
  public String getProcNoseInte(){ return procNoseInte; } 
  public String getProcNoseInteNn(){ return setNotNull(procNoseInte); } 
  public String getProcNoseInteDesc(){ return setDesc(procNoseInte); } 
  public void setProcNoseInte(String value){ this.procNoseInte=value;} 
  public boolean getProcNoseInteBool() { return procNoseInte==null?false:procNoseInte.equals("S");}
  public void setProcNoseInteBool(boolean procNoseInte) { this.procNoseInte=procNoseInte?"S":"N";}
//-------------------------------------------| FechCaliCons
  public Date getFechCaliCons(){ return fechCaliCons; } 
  public Date getFechCaliConsNn(){ return setNotNull(fechCaliCons); } 
  public String getFechCaliConsDesc(){ return setDesc(fechCaliCons); } 
  public void setFechCaliCons(Date value){ this.fechCaliCons=value;} 
//-------------------------------------------| FechApruCoor
  public Date getFechApruCoor(){ return fechApruCoor; } 
  public Date getFechApruCoorNn(){ return setNotNull(fechApruCoor); } 
  public String getFechApruCoorDesc(){ return setDesc(fechApruCoor); } 
  public void setFechApruCoor(Date value){ this.fechApruCoor=value;} 
// ---------------(RANGOS) 
  public String getTipoConsSistDesc() { return DtoMisc.getRangeDesc(RANG_TipoConsSist,getTipoConsSistNn()); } 
  public String getEstaAproConsDesc() { return DtoMisc.getRangeDesc(RANG_EstaAproCons,getEstaAproConsNn()); } 
  public String getAreaConsSistDesc() { return DtoMisc.getRangeDesc(RANG_AreaConsSist,getAreaConsSistNn()); } 

//---------------------(REL: FkeyCoorEstuDto) 
  public CJDVCoordiEstudiDto getFkeyCoorEstuDto() { return fkeyCoorEstuDto; } 
  public void setFkeyCoorEstuDto(CJDVCoordiEstudiDto fkeyCoorEstuDto) {
    if ( fkeyCoorEstuDto != null ) { 
      this.fkeyCoorEstu = fkeyCoorEstuDto.getPkeyCoorEstu(); 
    }
    this.fkeyCoorEstuDto = fkeyCoorEstuDto;
  } 
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
//---------------------(REL: FkeyDoceEspeDto) 
  public CJDVDocentEspeciDto getFkeyDoceEspeDto() { return fkeyDoceEspeDto; } 
  public void setFkeyDoceEspeDto(CJDVDocentEspeciDto fkeyDoceEspeDto) {
    if ( fkeyDoceEspeDto != null ) { 
      this.fkeyDoceEspe = fkeyDoceEspeDto.getPkeyDoceEspe(); 
    }
    this.fkeyDoceEspeDto = fkeyDoceEspeDto;
  } 


  @Override 
  public CJD_ConsulSistemDto copy(){
    CJD_ConsulSistemDto result = new CJD_ConsulSistemDto();
    result.setPkeyConsSist( this.getPkeyConsSist()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFkeyCoorEstu( this.getFkeyCoorEstu()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setFkeyDoceEspe( this.getFkeyDoceEspe()); 
    result.setNombConsSist( this.getNombConsSist()); 
    result.setDescConsSist( this.getDescConsSist()); 
    result.setNumeRadiCons( this.getNumeRadiCons()); 
    result.setTipoConsSist( this.getTipoConsSist()); 
    result.setValoConsSist( this.getValoConsSist()); 
    result.setEstaAproCons( this.getEstaAproCons()); 
    result.setNotaConsSist( this.getNotaConsSist()); 
    result.setAreaConsSist( this.getAreaConsSist()); 
    result.setFechConsSist( this.getFechConsSist()); 
    result.setValoDoceCons( this.getValoDoceCons()); 
    result.setPresOtroCons( this.getPresOtroCons()); 
    result.setTienApoderad( this.getTienApoderad()); 
    result.setTienMenoEdad( this.getTienMenoEdad()); 
    result.setProcRequisit( this.getProcRequisit()); 
    result.setProcPosiSolu( this.getProcPosiSolu()); 
    result.setProcNoseInte( this.getProcNoseInte()); 
    result.setFechCaliCons( this.getFechCaliCons()); 
    result.setFechApruCoor( this.getFechApruCoor()); 
    result.setFkeyCoorEstuDto( this.getFkeyCoorEstuDto());
    result.setFkeyEstudianDto( this.getFkeyEstudianDto());
    result.setFkeyGrupAsigDto( this.getFkeyGrupAsigDto());
    result.setFkeyDoceEspeDto( this.getFkeyDoceEspeDto());
    return result;
  }
}

