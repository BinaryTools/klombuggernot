package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;

public class CJDVConsulSistemDto extends BaseDto {
  public static final List RANG_TipoUsuaSist = Arrays.asList( new Range[] { 
      new Range("P","Usuario Principal"),
      new Range("A","Usuario Alternativo"),
      new Range("J","Juez"),
      new Range("E","Empresa"),
      new Range("C","Contraparte")});
  public static final List RANG_TipoDocuUsua = Arrays.asList( new Range[] { 
      new Range("N","NIT"),
      new Range("C","Cédula de Ciudadanía"),
      new Range("E","Cédula de Extranjería"),
      new Range("P","Pasaporte"),
      new Range("T","Tarjeta de Identidad")});
  public static final List RANG_OcupUsuaSist = Arrays.asList( new Range[] { 
      new Range("P","Pensionado"),
      new Range("I","Independiente"),
      new Range("E","Empleado")});
  public static final List RANG_TipoConsSist = Arrays.asList( new Range[] { 
      new Range("L","Liquidación"),
      new Range("T","Tutela"),
      new Range("D","Derecho de Petición"),
      new Range("C","Conciliación"),
      new Range("A","Análisis de Jurisprudencia"),
      new Range("N","Consulta"),
      new Range("O","Otros")});
  public static final List RANG_AreaConsSist = Arrays.asList( new Range[] { 
      new Range("P","Público"),
      new Range("C","Civil"),
      new Range("E","Penal"),
      new Range("L","Laboral"),
      new Range("O","Conciliación")});
  public static final List RANG_EstaAproCons = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No"),
      new Range("A","Anulada")});
  public static final List RANG_EstrUsuaSist = Arrays.asList( new Range[] { 
      new Range("Z","Cero"),
      new Range("U","Uno"),
      new Range("D","Dos"),
      new Range("T","Tres"),
      new Range("C","Cuatro"),
      new Range("F","Cinco"),
      new Range("S","Seis")});
  public static final List RANG_EscoUsuaSist = Arrays.asList( new Range[] { 
      new Range("P","Primaria"),
      new Range("S","Secundaria"),
      new Range("U","Profesional"),
      new Range("N","No Aplica")});


  private Integer pkeyConsSist;
  private Integer pkeyPersCons;
  private Integer fkeyPersSist;
  private Integer fkeyMunicipi;
  private Integer fkeyLocaMuni;
  private Integer fkeyCoorEstu;
  private Integer fkeyEstudian;
  private Integer fkeyGrupAsig;
  private Integer fkeyDoceEspe;
  private Integer fkeyMuniDocu;
  private String tipoUsuaSist;
  private String nombUsuaSist;
  private String tipoDocuUsua;
  private String nombConsSist;
  private Integer numeDocuUsua;
  private String descConsSist;
  private String ocupUsuaSist;
  private String direUsuaSist;
  private Integer numeRadiCons;
  private String barrUsuaSist;
  private String tipoConsSist;
  private String areaConsSist;
  private Date fechConsSist;
  private String valoConsSist;
  private String estaAproCons;
  private Integer teleFijoUsua;
  private Double teleCeluUsua;
  private Date fechApruCoor;
  private Double notaConsSist;
  private String corrUsuaSist;
  private String estrUsuaSist;
  private String escoUsuaSist;
  private String valoDoceCons;
  private String nombContacto;
  private String apelContacto;
  private String pareContacto;
  private String direContacto;
  private String barrContacto;
  private Integer teleFijoCont;
  private Double teleCeluCont;
  private String corrElecCont;
  private Integer fkeyLocaCont;
  private String nombCompProf;
  private String presOtroCons;
  private String tienApoderad;
  private String tienMenoEdad;
  private String procRequisit;
  private String procPosiSolu;
  private String procNoseInte;
  private Date fechCaliCons;

  private CJDVCoordiEstudiDto fkeyCoorEstuDto;
  private ADS_Munici_DeparDto fkeyMunicipiDto;
  private ADSVLocaliMuniciDto fkeyLocaContDto;
  private ADSVMuniciDocumeDto fkeyMuniDocuDto;
  private ADSVLocaliMuniciDto fkeyLocaMuniDto;

  public CJDVConsulSistemDto() { 
     PkeyEnti = 130003;
     setAliasName("ConsSistV"); 
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
//-------------------------------------------| PkeyPersCons
  public Integer getPkeyPersCons(){ return pkeyPersCons; } 
  public Integer getPkeyPersConsNn(){ return setNotNull(pkeyPersCons); } 
  public String getPkeyPersConsDesc(){ return setDesc(pkeyPersCons); } 
  public void setPkeyPersCons(Integer value){ this.pkeyPersCons=value;} 
//-------------------------------------------| FkeyPersSist
  public Integer getFkeyPersSist(){ return fkeyPersSist; } 
  public Integer getFkeyPersSistNn(){ return setNotNull(fkeyPersSist); } 
  public String getFkeyPersSistDesc(){ return setDesc(fkeyPersSist); } 
  public void setFkeyPersSist(Integer value){ this.fkeyPersSist=value;} 
//-------------------------------------------| FkeyMunicipi
  public Integer getFkeyMunicipi(){ return fkeyMunicipi; } 
  public Integer getFkeyMunicipiNn(){ return setNotNull(fkeyMunicipi); } 
  public String getFkeyMunicipiDesc(){ return setDesc(fkeyMunicipi); } 
  public void setFkeyMunicipi(Integer value){ this.fkeyMunicipi=value;} 
//-------------------------------------------| FkeyLocaMuni
  public Integer getFkeyLocaMuni(){ return fkeyLocaMuni; } 
  public Integer getFkeyLocaMuniNn(){ return setNotNull(fkeyLocaMuni); } 
  public String getFkeyLocaMuniDesc(){ return setDesc(fkeyLocaMuni); } 
  public void setFkeyLocaMuni(Integer value){ this.fkeyLocaMuni=value;} 
//-------------------------------------------| FkeyCoorEstu
  public Integer getFkeyCoorEstu(){ return fkeyCoorEstu; } 
  public Integer getFkeyCoorEstuNn(){ return setNotNull(fkeyCoorEstu); } 
  public String getFkeyCoorEstuDesc(){ return setDesc(fkeyCoorEstu); } 
  public void setFkeyCoorEstu(Integer value){ this.fkeyCoorEstu=value;} 
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
//-------------------------------------------| FkeyDoceEspe
  public Integer getFkeyDoceEspe(){ return fkeyDoceEspe; } 
  public Integer getFkeyDoceEspeNn(){ return setNotNull(fkeyDoceEspe); } 
  public String getFkeyDoceEspeDesc(){ return setDesc(fkeyDoceEspe); } 
  public void setFkeyDoceEspe(Integer value){ this.fkeyDoceEspe=value;} 
//-------------------------------------------| FkeyMuniDocu
  public Integer getFkeyMuniDocu(){ return fkeyMuniDocu; } 
  public Integer getFkeyMuniDocuNn(){ return setNotNull(fkeyMuniDocu); } 
  public String getFkeyMuniDocuDesc(){ return setDesc(fkeyMuniDocu); } 
  public void setFkeyMuniDocu(Integer value){ this.fkeyMuniDocu=value;} 
//-------------------------------------------| TipoUsuaSist
  public String getTipoUsuaSist(){ return tipoUsuaSist; } 
  public String getTipoUsuaSistNn(){ return setNotNull(tipoUsuaSist); } 
  public void setTipoUsuaSist(String value){ this.tipoUsuaSist=value;} 
//-------------------------------------------| NombUsuaSist
  public String getNombUsuaSist(){ return nombUsuaSist; } 
  public String getNombUsuaSistNn(){ return setNotNull(nombUsuaSist); } 
  public String getNombUsuaSistDesc(){ return setDesc(nombUsuaSist); } 
  public void setNombUsuaSist(String value){ this.nombUsuaSist=value;} 
//-------------------------------------------| TipoDocuUsua
  public String getTipoDocuUsua(){ return tipoDocuUsua; } 
  public String getTipoDocuUsuaNn(){ return setNotNull(tipoDocuUsua); } 
  public void setTipoDocuUsua(String value){ this.tipoDocuUsua=value;} 
//-------------------------------------------| NombConsSist
  public String getNombConsSist(){ return nombConsSist; } 
  public String getNombConsSistNn(){ return setNotNull(nombConsSist); } 
  public String getNombConsSistDesc(){ return setDesc(nombConsSist); } 
  public void setNombConsSist(String value){ this.nombConsSist=value;} 
//-------------------------------------------| NumeDocuUsua
  public Integer getNumeDocuUsua(){ return numeDocuUsua; } 
  public Integer getNumeDocuUsuaNn(){ return setNotNull(numeDocuUsua); } 
  public String getNumeDocuUsuaDesc(){ return setDesc(numeDocuUsua); } 
  public void setNumeDocuUsua(Integer value){ this.numeDocuUsua=value;} 
//-------------------------------------------| DescConsSist
  public String getDescConsSist(){ return descConsSist; } 
  public String getDescConsSistNn(){ return setNotNull(descConsSist); } 
  public String getDescConsSistDesc(){ return setDesc(descConsSist); } 
  public void setDescConsSist(String value){ this.descConsSist=value;} 
//-------------------------------------------| OcupUsuaSist
  public String getOcupUsuaSist(){ return ocupUsuaSist; } 
  public String getOcupUsuaSistNn(){ return setNotNull(ocupUsuaSist); } 
  public void setOcupUsuaSist(String value){ this.ocupUsuaSist=value;} 
//-------------------------------------------| DireUsuaSist
  public String getDireUsuaSist(){ return direUsuaSist; } 
  public String getDireUsuaSistNn(){ return setNotNull(direUsuaSist); } 
  public String getDireUsuaSistDesc(){ return setDesc(direUsuaSist); } 
  public void setDireUsuaSist(String value){ this.direUsuaSist=value;} 
//-------------------------------------------| NumeRadiCons
  public Integer getNumeRadiCons(){ return numeRadiCons; } 
  public Integer getNumeRadiConsNn(){ return setNotNull(numeRadiCons); } 
  public String getNumeRadiConsDesc(){ return setDesc(numeRadiCons); } 
  public void setNumeRadiCons(Integer value){ this.numeRadiCons=value;} 
//-------------------------------------------| BarrUsuaSist
  public String getBarrUsuaSist(){ return barrUsuaSist; } 
  public String getBarrUsuaSistNn(){ return setNotNull(barrUsuaSist); } 
  public String getBarrUsuaSistDesc(){ return setDesc(barrUsuaSist); } 
  public void setBarrUsuaSist(String value){ this.barrUsuaSist=value;} 
//-------------------------------------------| TipoConsSist
  public String getTipoConsSist(){ return tipoConsSist; } 
  public String getTipoConsSistNn(){ return setNotNull(tipoConsSist); } 
  public void setTipoConsSist(String value){ this.tipoConsSist=value;} 
//-------------------------------------------| AreaConsSist
  public String getAreaConsSist(){ return areaConsSist; } 
  public String getAreaConsSistNn(){ return setNotNull(areaConsSist); } 
  public void setAreaConsSist(String value){ this.areaConsSist=value;} 
//-------------------------------------------| FechConsSist
  public Date getFechConsSist(){ return fechConsSist; } 
  public Date getFechConsSistNn(){ return setNotNull(fechConsSist); } 
  public String getFechConsSistDesc(){ return setDesc(fechConsSist); } 
  public void setFechConsSist(Date value){ this.fechConsSist=value;} 
//-------------------------------------------| ValoConsSist
  public String getValoConsSist(){ return valoConsSist; } 
  public String getValoConsSistNn(){ return setNotNull(valoConsSist); } 
  public String getValoConsSistDesc(){ return setDesc(valoConsSist); } 
  public void setValoConsSist(String value){ this.valoConsSist=value;} 
//-------------------------------------------| EstaAproCons
  public String getEstaAproCons(){ return estaAproCons; } 
  public String getEstaAproConsNn(){ return setNotNull(estaAproCons); } 
  public void setEstaAproCons(String value){ this.estaAproCons=value;} 
//-------------------------------------------| TeleFijoUsua
  public Integer getTeleFijoUsua(){ return teleFijoUsua; } 
  public Integer getTeleFijoUsuaNn(){ return setNotNull(teleFijoUsua); } 
  public String getTeleFijoUsuaDesc(){ return setDesc(teleFijoUsua); } 
  public void setTeleFijoUsua(Integer value){ this.teleFijoUsua=value;} 
//-------------------------------------------| TeleCeluUsua
  public Double getTeleCeluUsua(){ return teleCeluUsua; } 
  public Double getTeleCeluUsuaNn(){ return setNotNull(teleCeluUsua); } 
  public String getTeleCeluUsuaDesc(){ return setDesc(teleCeluUsua); } 
  public void setTeleCeluUsua(Double value){ this.teleCeluUsua=value;} 
//-------------------------------------------| FechApruCoor
  public Date getFechApruCoor(){ return fechApruCoor; } 
  public Date getFechApruCoorNn(){ return setNotNull(fechApruCoor); } 
  public String getFechApruCoorDesc(){ return setDesc(fechApruCoor); } 
  public void setFechApruCoor(Date value){ this.fechApruCoor=value;} 
//-------------------------------------------| NotaConsSist
  public Double getNotaConsSist(){ return notaConsSist; } 
  public Double getNotaConsSistNn(){ return setNotNull(notaConsSist); } 
  public String getNotaConsSistDesc(){ return setDesc(notaConsSist); } 
  public void setNotaConsSist(Double value){ this.notaConsSist=value;} 
//-------------------------------------------| CorrUsuaSist
  public String getCorrUsuaSist(){ return corrUsuaSist; } 
  public String getCorrUsuaSistNn(){ return setNotNull(corrUsuaSist); } 
  public String getCorrUsuaSistDesc(){ return setDesc(corrUsuaSist); } 
  public void setCorrUsuaSist(String value){ this.corrUsuaSist=value;} 
//-------------------------------------------| EstrUsuaSist
  public String getEstrUsuaSist(){ return estrUsuaSist; } 
  public String getEstrUsuaSistNn(){ return setNotNull(estrUsuaSist); } 
  public void setEstrUsuaSist(String value){ this.estrUsuaSist=value;} 
//-------------------------------------------| EscoUsuaSist
  public String getEscoUsuaSist(){ return escoUsuaSist; } 
  public String getEscoUsuaSistNn(){ return setNotNull(escoUsuaSist); } 
  public void setEscoUsuaSist(String value){ this.escoUsuaSist=value;} 
//-------------------------------------------| ValoDoceCons
  public String getValoDoceCons(){ return valoDoceCons; } 
  public String getValoDoceConsNn(){ return setNotNull(valoDoceCons); } 
  public String getValoDoceConsDesc(){ return setDesc(valoDoceCons); } 
  public void setValoDoceCons(String value){ this.valoDoceCons=value;} 
//-------------------------------------------| NombContacto
  public String getNombContacto(){ return nombContacto; } 
  public String getNombContactoNn(){ return setNotNull(nombContacto); } 
  public String getNombContactoDesc(){ return setDesc(nombContacto); } 
  public void setNombContacto(String value){ this.nombContacto=value;} 
//-------------------------------------------| ApelContacto
  public String getApelContacto(){ return apelContacto; } 
  public String getApelContactoNn(){ return setNotNull(apelContacto); } 
  public String getApelContactoDesc(){ return setDesc(apelContacto); } 
  public void setApelContacto(String value){ this.apelContacto=value;} 
//-------------------------------------------| PareContacto
  public String getPareContacto(){ return pareContacto; } 
  public String getPareContactoNn(){ return setNotNull(pareContacto); } 
  public String getPareContactoDesc(){ return setDesc(pareContacto); } 
  public void setPareContacto(String value){ this.pareContacto=value;} 
//-------------------------------------------| DireContacto
  public String getDireContacto(){ return direContacto; } 
  public String getDireContactoNn(){ return setNotNull(direContacto); } 
  public String getDireContactoDesc(){ return setDesc(direContacto); } 
  public void setDireContacto(String value){ this.direContacto=value;} 
//-------------------------------------------| BarrContacto
  public String getBarrContacto(){ return barrContacto; } 
  public String getBarrContactoNn(){ return setNotNull(barrContacto); } 
  public String getBarrContactoDesc(){ return setDesc(barrContacto); } 
  public void setBarrContacto(String value){ this.barrContacto=value;} 
//-------------------------------------------| TeleFijoCont
  public Integer getTeleFijoCont(){ return teleFijoCont; } 
  public Integer getTeleFijoContNn(){ return setNotNull(teleFijoCont); } 
  public String getTeleFijoContDesc(){ return setDesc(teleFijoCont); } 
  public void setTeleFijoCont(Integer value){ this.teleFijoCont=value;} 
//-------------------------------------------| TeleCeluCont
  public Double getTeleCeluCont(){ return teleCeluCont; } 
  public Double getTeleCeluContNn(){ return setNotNull(teleCeluCont); } 
  public String getTeleCeluContDesc(){ return setDesc(teleCeluCont); } 
  public void setTeleCeluCont(Double value){ this.teleCeluCont=value;} 
//-------------------------------------------| CorrElecCont
  public String getCorrElecCont(){ return corrElecCont; } 
  public String getCorrElecContNn(){ return setNotNull(corrElecCont); } 
  public String getCorrElecContDesc(){ return setDesc(corrElecCont); } 
  public void setCorrElecCont(String value){ this.corrElecCont=value;} 
//-------------------------------------------| FkeyLocaCont
  public Integer getFkeyLocaCont(){ return fkeyLocaCont; } 
  public Integer getFkeyLocaContNn(){ return setNotNull(fkeyLocaCont); } 
  public String getFkeyLocaContDesc(){ return setDesc(fkeyLocaCont); } 
  public void setFkeyLocaCont(Integer value){ this.fkeyLocaCont=value;} 
//-------------------------------------------| NombCompProf
  public String getNombCompProf(){ return nombCompProf; } 
  public String getNombCompProfNn(){ return setNotNull(nombCompProf); } 
  public String getNombCompProfDesc(){ return setDesc(nombCompProf); } 
  public void setNombCompProf(String value){ this.nombCompProf=value;} 
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
//-------------------------------------------| toString
  @Override
  public String toString() { return nombConsSist + " - " + numeRadiCons; }
// ---------------(RANGOS) 
  public String getTipoUsuaSistDesc() { return DtoMisc.getRangeDesc(RANG_TipoUsuaSist,getTipoUsuaSistNn()); } 
  public String getTipoDocuUsuaDesc() { return DtoMisc.getRangeDesc(RANG_TipoDocuUsua,getTipoDocuUsuaNn()); } 
  public String getOcupUsuaSistDesc() { return DtoMisc.getRangeDesc(RANG_OcupUsuaSist,getOcupUsuaSistNn()); } 
  public String getTipoConsSistDesc() { return DtoMisc.getRangeDesc(RANG_TipoConsSist,getTipoConsSistNn()); } 
  public String getAreaConsSistDesc() { return DtoMisc.getRangeDesc(RANG_AreaConsSist,getAreaConsSistNn()); } 
  public String getEstaAproConsDesc() { return DtoMisc.getRangeDesc(RANG_EstaAproCons,getEstaAproConsNn()); } 
  public String getEstrUsuaSistDesc() { return DtoMisc.getRangeDesc(RANG_EstrUsuaSist,getEstrUsuaSistNn()); } 
  public String getEscoUsuaSistDesc() { return DtoMisc.getRangeDesc(RANG_EscoUsuaSist,getEscoUsuaSistNn()); } 

//---------------------(REL: FkeyCoorEstuDto) 
  public CJDVCoordiEstudiDto getFkeyCoorEstuDto() { return fkeyCoorEstuDto; } 
  public void setFkeyCoorEstuDto(CJDVCoordiEstudiDto fkeyCoorEstuDto) {
    if ( fkeyCoorEstuDto != null ) { 
      this.fkeyCoorEstu = fkeyCoorEstuDto.getPkeyCoorEstu(); 
    }
    this.fkeyCoorEstuDto = fkeyCoorEstuDto;
  } 
//---------------------(REL: FkeyMunicipiDto) 
  public ADS_Munici_DeparDto getFkeyMunicipiDto() { return fkeyMunicipiDto; } 
  public void setFkeyMunicipiDto(ADS_Munici_DeparDto fkeyMunicipiDto) {
    if ( fkeyMunicipiDto != null ) { 
      this.fkeyMunicipi = fkeyMunicipiDto.getPkeyMunicipi(); 
    }
    this.fkeyMunicipiDto = fkeyMunicipiDto;
  } 
//---------------------(REL: FkeyLocaContDto) 
  public ADSVLocaliMuniciDto getFkeyLocaContDto() { return fkeyLocaContDto; } 
  public void setFkeyLocaContDto(ADSVLocaliMuniciDto fkeyLocaContDto) {
    if ( fkeyLocaContDto != null ) { 
      this.fkeyLocaCont = fkeyLocaContDto.getPkeyLocaMuni(); 
    }
    this.fkeyLocaContDto = fkeyLocaContDto;
  } 
//---------------------(REL: FkeyMuniDocuDto) 
  public ADSVMuniciDocumeDto getFkeyMuniDocuDto() { return fkeyMuniDocuDto; } 
  public void setFkeyMuniDocuDto(ADSVMuniciDocumeDto fkeyMuniDocuDto) {
    if ( fkeyMuniDocuDto != null ) { 
      this.fkeyMuniDocu = fkeyMuniDocuDto.getPkeyMunicipi(); 
    }
    this.fkeyMuniDocuDto = fkeyMuniDocuDto;
  } 
//---------------------(REL: FkeyLocaMuniDto) 
  public ADSVLocaliMuniciDto getFkeyLocaMuniDto() { return fkeyLocaMuniDto; } 
  public void setFkeyLocaMuniDto(ADSVLocaliMuniciDto fkeyLocaMuniDto) {
    if ( fkeyLocaMuniDto != null ) { 
      this.fkeyLocaMuni = fkeyLocaMuniDto.getPkeyLocaMuni(); 
    }
    this.fkeyLocaMuniDto = fkeyLocaMuniDto;
  } 


  @Override 
  public CJDVConsulSistemDto copy(){
    CJDVConsulSistemDto result = new CJDVConsulSistemDto();
    result.setPkeyConsSist( this.getPkeyConsSist()); 
    result.setPkeyPersCons( this.getPkeyPersCons()); 
    result.setFkeyPersSist( this.getFkeyPersSist()); 
    result.setFkeyMunicipi( this.getFkeyMunicipi()); 
    result.setFkeyLocaMuni( this.getFkeyLocaMuni()); 
    result.setFkeyCoorEstu( this.getFkeyCoorEstu()); 
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setFkeyGrupAsig( this.getFkeyGrupAsig()); 
    result.setFkeyDoceEspe( this.getFkeyDoceEspe()); 
    result.setFkeyMuniDocu( this.getFkeyMuniDocu()); 
    result.setTipoUsuaSist( this.getTipoUsuaSist()); 
    result.setNombUsuaSist( this.getNombUsuaSist()); 
    result.setTipoDocuUsua( this.getTipoDocuUsua()); 
    result.setNombConsSist( this.getNombConsSist()); 
    result.setNumeDocuUsua( this.getNumeDocuUsua()); 
    result.setDescConsSist( this.getDescConsSist()); 
    result.setOcupUsuaSist( this.getOcupUsuaSist()); 
    result.setDireUsuaSist( this.getDireUsuaSist()); 
    result.setNumeRadiCons( this.getNumeRadiCons()); 
    result.setBarrUsuaSist( this.getBarrUsuaSist()); 
    result.setTipoConsSist( this.getTipoConsSist()); 
    result.setAreaConsSist( this.getAreaConsSist()); 
    result.setFechConsSist( this.getFechConsSist()); 
    result.setValoConsSist( this.getValoConsSist()); 
    result.setEstaAproCons( this.getEstaAproCons()); 
    result.setTeleFijoUsua( this.getTeleFijoUsua()); 
    result.setTeleCeluUsua( this.getTeleCeluUsua()); 
    result.setFechApruCoor( this.getFechApruCoor()); 
    result.setNotaConsSist( this.getNotaConsSist()); 
    result.setCorrUsuaSist( this.getCorrUsuaSist()); 
    result.setEstrUsuaSist( this.getEstrUsuaSist()); 
    result.setEscoUsuaSist( this.getEscoUsuaSist()); 
    result.setValoDoceCons( this.getValoDoceCons()); 
    result.setNombContacto( this.getNombContacto()); 
    result.setApelContacto( this.getApelContacto()); 
    result.setPareContacto( this.getPareContacto()); 
    result.setDireContacto( this.getDireContacto()); 
    result.setBarrContacto( this.getBarrContacto()); 
    result.setTeleFijoCont( this.getTeleFijoCont()); 
    result.setTeleCeluCont( this.getTeleCeluCont()); 
    result.setCorrElecCont( this.getCorrElecCont()); 
    result.setFkeyLocaCont( this.getFkeyLocaCont()); 
    result.setNombCompProf( this.getNombCompProf()); 
    result.setPresOtroCons( this.getPresOtroCons()); 
    result.setTienApoderad( this.getTienApoderad()); 
    result.setTienMenoEdad( this.getTienMenoEdad()); 
    result.setProcRequisit( this.getProcRequisit()); 
    result.setProcPosiSolu( this.getProcPosiSolu()); 
    result.setProcNoseInte( this.getProcNoseInte()); 
    result.setFechCaliCons( this.getFechCaliCons()); 
    result.setFechApruCoor( this.getFechApruCoor()); 
    result.setFkeyCoorEstuDto( this.getFkeyCoorEstuDto());
    result.setFkeyMunicipiDto( this.getFkeyMunicipiDto());
    result.setFkeyLocaContDto( this.getFkeyLocaContDto());
    result.setFkeyMuniDocuDto( this.getFkeyMuniDocuDto());
    result.setFkeyLocaMuniDto( this.getFkeyLocaMuniDto());
    return result;
  }
}

