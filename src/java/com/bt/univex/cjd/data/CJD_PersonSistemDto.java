package com.bt.univex.cjd.data;

import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.* ;

public class CJD_PersonSistemDto extends BaseDto {
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


  private Integer pkeyPersSist;
  private Integer fkeyLocaMuni;
  private Integer fkeyMuniDocu;
  private Integer fkeyMunicipi;
  private String tipoUsuaSist;
  private String nombUsuaSist;
  private String tipoDocuUsua;
  private Integer numeDocuUsua;
  private String ocupUsuaSist;
  private String direUsuaSist;
  private String barrUsuaSist;
  private Integer teleFijoUsua;
  private Double teleCeluUsua;
  private String corrUsuaSist;
  private String estrUsuaSist;
  private String escoUsuaSist;
  private String nombContacto;
  private String apelContacto;
  private String pareContacto;
  private String direContacto;
  private String barrContacto;
  private Integer fkeyLocaCont;
  private Integer teleFijoCont;
  private Double teleCeluCont;
  private String corrElecCont;

  private ADS_Munici_DeparDto fkeyMunicipiDto;
  private ADSVLocaliMuniciDto fkeyLocaMuniDto;
  private ADSVMuniciDocumeDto fkeyMuniDocuDto;
  private ADSVLocaliMuniciDto fkeyLocaContDto;

  public CJD_PersonSistemDto() { 
     PkeyEnti = 129003;
     setAliasName("PersSist"); 
  } 

//-------------------------------------------| PkeyPersSist
  public Integer getPkeyPersSist(){ return pkeyPersSist; } 
  public Integer getPkeyPersSistNn(){ return setNotNull(pkeyPersSist); } 
  public String getPkeyPersSistDesc(){ return setDesc(pkeyPersSist); } 
  public void setPkeyPersSist(Integer value){ this.pkeyPersSist=value;} 
  @Override
  public int toInt(){ return getPkeyPersSistNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPersSist; }; 
//-------------------------------------------| FkeyLocaMuni
  public Integer getFkeyLocaMuni(){ return fkeyLocaMuni; } 
  public Integer getFkeyLocaMuniNn(){ return setNotNull(fkeyLocaMuni); } 
  public String getFkeyLocaMuniDesc(){ return setDesc(fkeyLocaMuni); } 
  public void setFkeyLocaMuni(Integer value){ this.fkeyLocaMuni=value;} 
//-------------------------------------------| FkeyMuniDocu
  public Integer getFkeyMuniDocu(){ return fkeyMuniDocu; } 
  public Integer getFkeyMuniDocuNn(){ return setNotNull(fkeyMuniDocu); } 
  public String getFkeyMuniDocuDesc(){ return setDesc(fkeyMuniDocu); } 
  public void setFkeyMuniDocu(Integer value){ this.fkeyMuniDocu=value;} 
//-------------------------------------------| FkeyMunicipi
  public Integer getFkeyMunicipi(){ return fkeyMunicipi; } 
  public Integer getFkeyMunicipiNn(){ return setNotNull(fkeyMunicipi); } 
  public String getFkeyMunicipiDesc(){ return setDesc(fkeyMunicipi); } 
  public void setFkeyMunicipi(Integer value){ this.fkeyMunicipi=value;} 
//-------------------------------------------| TipoUsuaSist
  public String getTipoUsuaSist(){ return tipoUsuaSist; } 
  public String getTipoUsuaSistNn(){ return setNotNull(tipoUsuaSist); } 
  public void setTipoUsuaSist(String value){ this.tipoUsuaSist=value;} 
//-------------------------------------------| NombUsuaSist
  public String getNombUsuaSist(){ return nombUsuaSist; } 
  public String getNombUsuaSistNn(){ return setNotNull(nombUsuaSist); } 
  public String getNombUsuaSistDesc(){ return setDesc(nombUsuaSist); } 
  public void setNombUsuaSist(String value){ this.nombUsuaSist=value;} 
  @Override
  public String toString(){ return getNombUsuaSistNn(); }; 
//-------------------------------------------| TipoDocuUsua
  public String getTipoDocuUsua(){ return tipoDocuUsua; } 
  public String getTipoDocuUsuaNn(){ return setNotNull(tipoDocuUsua); } 
  public void setTipoDocuUsua(String value){ this.tipoDocuUsua=value;} 
//-------------------------------------------| NumeDocuUsua
  public Integer getNumeDocuUsua(){ return numeDocuUsua; } 
  public Integer getNumeDocuUsuaNn(){ return setNotNull(numeDocuUsua); } 
  public String getNumeDocuUsuaDesc(){ return setDesc(numeDocuUsua); } 
  public void setNumeDocuUsua(Integer value){ this.numeDocuUsua=value;} 
//-------------------------------------------| OcupUsuaSist
  public String getOcupUsuaSist(){ return ocupUsuaSist; } 
  public String getOcupUsuaSistNn(){ return setNotNull(ocupUsuaSist); } 
  public void setOcupUsuaSist(String value){ this.ocupUsuaSist=value;} 
//-------------------------------------------| DireUsuaSist
  public String getDireUsuaSist(){ return direUsuaSist; } 
  public String getDireUsuaSistNn(){ return setNotNull(direUsuaSist); } 
  public String getDireUsuaSistDesc(){ return setDesc(direUsuaSist); } 
  public void setDireUsuaSist(String value){ this.direUsuaSist=value;} 
//-------------------------------------------| BarrUsuaSist
  public String getBarrUsuaSist(){ return barrUsuaSist; } 
  public String getBarrUsuaSistNn(){ return setNotNull(barrUsuaSist); } 
  public String getBarrUsuaSistDesc(){ return setDesc(barrUsuaSist); } 
  public void setBarrUsuaSist(String value){ this.barrUsuaSist=value;} 
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
//-------------------------------------------| FkeyLocaCont
  public Integer getFkeyLocaCont(){ return fkeyLocaCont; } 
  public Integer getFkeyLocaContNn(){ return setNotNull(fkeyLocaCont); } 
  public String getFkeyLocaContDesc(){ return setDesc(fkeyLocaCont); } 
  public void setFkeyLocaCont(Integer value){ this.fkeyLocaCont=value;} 
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
// ---------------(RANGOS) 
  public String getTipoUsuaSistDesc() { return DtoMisc.getRangeDesc(RANG_TipoUsuaSist,getTipoUsuaSistNn()); } 
  public String getTipoDocuUsuaDesc() { return DtoMisc.getRangeDesc(RANG_TipoDocuUsua,getTipoDocuUsuaNn()); } 
  public String getOcupUsuaSistDesc() { return DtoMisc.getRangeDesc(RANG_OcupUsuaSist,getOcupUsuaSistNn()); } 
  public String getEstrUsuaSistDesc() { return DtoMisc.getRangeDesc(RANG_EstrUsuaSist,getEstrUsuaSistNn()); } 
  public String getEscoUsuaSistDesc() { return DtoMisc.getRangeDesc(RANG_EscoUsuaSist,getEscoUsuaSistNn()); } 

//---------------------(REL: FkeyMunicipiDto) 
  public ADS_Munici_DeparDto getFkeyMunicipiDto() { return fkeyMunicipiDto; } 
  public void setFkeyMunicipiDto(ADS_Munici_DeparDto fkeyMunicipiDto) {
    if ( fkeyMunicipiDto != null ) { 
      this.fkeyMunicipi = fkeyMunicipiDto.getPkeyMunicipi(); 
    }
    this.fkeyMunicipiDto = fkeyMunicipiDto;
  } 
//---------------------(REL: FkeyLocaMuniDto) 
  public ADSVLocaliMuniciDto getFkeyLocaMuniDto() { return fkeyLocaMuniDto; } 
  public void setFkeyLocaMuniDto(ADSVLocaliMuniciDto fkeyLocaMuniDto) {
    if ( fkeyLocaMuniDto != null ) { 
      this.fkeyLocaMuni = fkeyLocaMuniDto.getPkeyLocaMuni(); 
    }
    this.fkeyLocaMuniDto = fkeyLocaMuniDto;
  } 
//---------------------(REL: FkeyMuniDocuDto) 
  public ADSVMuniciDocumeDto getFkeyMuniDocuDto() { return fkeyMuniDocuDto; } 
  public void setFkeyMuniDocuDto(ADSVMuniciDocumeDto fkeyMuniDocuDto) {
    if ( fkeyMuniDocuDto != null ) { 
      this.fkeyMuniDocu = fkeyMuniDocuDto.getPkeyMunicipi(); 
    }
    this.fkeyMuniDocuDto = fkeyMuniDocuDto;
  } 
//---------------------(REL: FkeyLocaContDto) 
  public ADSVLocaliMuniciDto getFkeyLocaContDto() { return fkeyLocaContDto; } 
  public void setFkeyLocaContDto(ADSVLocaliMuniciDto fkeyLocaContDto) {
    if ( fkeyLocaContDto != null ) { 
      this.fkeyLocaCont = fkeyLocaContDto.getPkeyLocaMuni(); 
    }
    this.fkeyLocaContDto = fkeyLocaContDto;
  } 


  @Override 
  public CJD_PersonSistemDto copy(){
    CJD_PersonSistemDto result = new CJD_PersonSistemDto();
    result.setPkeyPersSist( this.getPkeyPersSist()); 
    result.setFkeyLocaMuni( this.getFkeyLocaMuni()); 
    result.setFkeyMuniDocu( this.getFkeyMuniDocu()); 
    result.setFkeyMunicipi( this.getFkeyMunicipi()); 
    result.setTipoUsuaSist( this.getTipoUsuaSist()); 
    result.setNombUsuaSist( this.getNombUsuaSist()); 
    result.setTipoDocuUsua( this.getTipoDocuUsua()); 
    result.setNumeDocuUsua( this.getNumeDocuUsua()); 
    result.setOcupUsuaSist( this.getOcupUsuaSist()); 
    result.setDireUsuaSist( this.getDireUsuaSist()); 
    result.setBarrUsuaSist( this.getBarrUsuaSist()); 
    result.setTeleFijoUsua( this.getTeleFijoUsua()); 
    result.setTeleCeluUsua( this.getTeleCeluUsua()); 
    result.setCorrUsuaSist( this.getCorrUsuaSist()); 
    result.setEstrUsuaSist( this.getEstrUsuaSist()); 
    result.setEscoUsuaSist( this.getEscoUsuaSist()); 
    result.setNombContacto( this.getNombContacto()); 
    result.setApelContacto( this.getApelContacto()); 
    result.setPareContacto( this.getPareContacto()); 
    result.setDireContacto( this.getDireContacto()); 
    result.setBarrContacto( this.getBarrContacto()); 
    result.setFkeyLocaCont( this.getFkeyLocaCont()); 
    result.setTeleFijoCont( this.getTeleFijoCont()); 
    result.setTeleCeluCont( this.getTeleCeluCont()); 
    result.setCorrElecCont( this.getCorrElecCont()); 
    result.setFkeyMunicipiDto( this.getFkeyMunicipiDto());
    result.setFkeyLocaMuniDto( this.getFkeyLocaMuniDto());
    result.setFkeyMuniDocuDto( this.getFkeyMuniDocuDto());
    result.setFkeyLocaContDto( this.getFkeyLocaContDto());
    return result;
  }
}

