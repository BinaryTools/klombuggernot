package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDVPersonProcesDto extends BaseDto {
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


  private Integer pkeyPersProc;
  private Integer fkeyPersSist;
  private Integer fkeyProcCons;
  private Date fechRelaProc;
  private String tipoUsuaSist;
  private String nombUsuaSist;
  private String tipoDocuUsua;
  private Integer numeDocuUsua;
  private String lugaExpeDocu;
  private String teleFijoUsua;
  private String teleCeluUsua;
  private String corrUsuaSist;
  private String nombContacto;
  private String teleFijoCont;
  private String teleCeluCont;
  private String corrElecCont;


  public CJDVPersonProcesDto() { 
     PkeyEnti = 130803;
     setAliasName("PersProcV"); 
  } 

//-------------------------------------------| PkeyPersProc
  public Integer getPkeyPersProc(){ return pkeyPersProc; } 
  public Integer getPkeyPersProcNn(){ return setNotNull(pkeyPersProc); } 
  public String getPkeyPersProcDesc(){ return setDesc(pkeyPersProc); } 
  public void setPkeyPersProc(Integer value){ this.pkeyPersProc=value;} 
  @Override
  public int toInt(){ return getPkeyPersProcNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPersProc; }; 
//-------------------------------------------| FkeyPersSist
  public Integer getFkeyPersSist(){ return fkeyPersSist; } 
  public Integer getFkeyPersSistNn(){ return setNotNull(fkeyPersSist); } 
  public String getFkeyPersSistDesc(){ return setDesc(fkeyPersSist); } 
  public void setFkeyPersSist(Integer value){ this.fkeyPersSist=value;} 
//-------------------------------------------| FkeyProcCons
  public Integer getFkeyProcCons(){ return fkeyProcCons; } 
  public Integer getFkeyProcConsNn(){ return setNotNull(fkeyProcCons); } 
  public String getFkeyProcConsDesc(){ return setDesc(fkeyProcCons); } 
  public void setFkeyProcCons(Integer value){ this.fkeyProcCons=value;} 
//-------------------------------------------| FechRelaProc
  public Date getFechRelaProc(){ return fechRelaProc; } 
  public Date getFechRelaProcNn(){ return setNotNull(fechRelaProc); } 
  public String getFechRelaProcDesc(){ return setDesc(fechRelaProc); } 
  public void setFechRelaProc(Date value){ this.fechRelaProc=value;} 
//-------------------------------------------| TipoUsuaSist
  public String getTipoUsuaSist(){ return tipoUsuaSist; } 
  public String getTipoUsuaSistNn(){ return setNotNull(tipoUsuaSist); } 
  public void setTipoUsuaSist(String value){ this.tipoUsuaSist=value;} 
  public boolean getTipoUsuaSistBool() { return tipoUsuaSist==null?false:tipoUsuaSist.equals("S");}
  public void setTipoUsuaSistBool(boolean tipoUsuaSist) { this.tipoUsuaSist=tipoUsuaSist?"S":"N";}
//-------------------------------------------| NombUsuaSist
  public String getNombUsuaSist(){ return nombUsuaSist; } 
  public String getNombUsuaSistNn(){ return setNotNull(nombUsuaSist); } 
  public String getNombUsuaSistDesc(){ return setDesc(nombUsuaSist); } 
  public void setNombUsuaSist(String value){ this.nombUsuaSist=value;} 
//-------------------------------------------| TipoDocuUsua
  public String getTipoDocuUsua(){ return tipoDocuUsua; } 
  public String getTipoDocuUsuaNn(){ return setNotNull(tipoDocuUsua); } 
  public void setTipoDocuUsua(String value){ this.tipoDocuUsua=value;} 
  public boolean getTipoDocuUsuaBool() { return tipoDocuUsua==null?false:tipoDocuUsua.equals("S");}
  public void setTipoDocuUsuaBool(boolean tipoDocuUsua) { this.tipoDocuUsua=tipoDocuUsua?"S":"N";}
//-------------------------------------------| NumeDocuUsua
  public Integer getNumeDocuUsua(){ return numeDocuUsua; } 
  public Integer getNumeDocuUsuaNn(){ return setNotNull(numeDocuUsua); } 
  public String getNumeDocuUsuaDesc(){ return setDesc(numeDocuUsua); } 
  public void setNumeDocuUsua(Integer value){ this.numeDocuUsua=value;} 
//-------------------------------------------| LugaExpeDocu
  public String getLugaExpeDocu(){ return lugaExpeDocu; } 
  public String getLugaExpeDocuNn(){ return setNotNull(lugaExpeDocu); } 
  public String getLugaExpeDocuDesc(){ return setDesc(lugaExpeDocu); } 
  public void setLugaExpeDocu(String value){ this.lugaExpeDocu=value;} 
//-------------------------------------------| TeleFijoUsua
  public String getTeleFijoUsua(){ return teleFijoUsua; } 
  public String getTeleFijoUsuaNn(){ return setNotNull(teleFijoUsua); } 
  public String getTeleFijoUsuaDesc(){ return setDesc(teleFijoUsua); } 
  public void setTeleFijoUsua(String value){ this.teleFijoUsua=value;} 
//-------------------------------------------| TeleCeluUsua
  public String getTeleCeluUsua(){ return teleCeluUsua; } 
  public String getTeleCeluUsuaNn(){ return setNotNull(teleCeluUsua); } 
  public String getTeleCeluUsuaDesc(){ return setDesc(teleCeluUsua); } 
  public void setTeleCeluUsua(String value){ this.teleCeluUsua=value;} 
//-------------------------------------------| CorrUsuaSist
  public String getCorrUsuaSist(){ return corrUsuaSist; } 
  public String getCorrUsuaSistNn(){ return setNotNull(corrUsuaSist); } 
  public String getCorrUsuaSistDesc(){ return setDesc(corrUsuaSist); } 
  public void setCorrUsuaSist(String value){ this.corrUsuaSist=value;} 
//-------------------------------------------| NombContacto
  public String getNombContacto(){ return nombContacto; } 
  public String getNombContactoNn(){ return setNotNull(nombContacto); } 
  public String getNombContactoDesc(){ return setDesc(nombContacto); } 
  public void setNombContacto(String value){ this.nombContacto=value;} 
//-------------------------------------------| TeleFijoCont
  public String getTeleFijoCont(){ return teleFijoCont; } 
  public String getTeleFijoContNn(){ return setNotNull(teleFijoCont); } 
  public String getTeleFijoContDesc(){ return setDesc(teleFijoCont); } 
  public void setTeleFijoCont(String value){ this.teleFijoCont=value;} 
//-------------------------------------------| TeleCeluCont
  public String getTeleCeluCont(){ return teleCeluCont; } 
  public String getTeleCeluContNn(){ return setNotNull(teleCeluCont); } 
  public String getTeleCeluContDesc(){ return setDesc(teleCeluCont); } 
  public void setTeleCeluCont(String value){ this.teleCeluCont=value;} 
//-------------------------------------------| CorrElecCont
  public String getCorrElecCont(){ return corrElecCont; } 
  public String getCorrElecContNn(){ return setNotNull(corrElecCont); } 
  public String getCorrElecContDesc(){ return setDesc(corrElecCont); } 
  public void setCorrElecCont(String value){ this.corrElecCont=value;} 
// ---------------(RANGOS) 
  public String getTipoUsuaSistDesc() { return DtoMisc.getRangeDesc(RANG_TipoUsuaSist,getTipoUsuaSistNn()); } 
  public String getTipoDocuUsuaDesc() { return DtoMisc.getRangeDesc(RANG_TipoDocuUsua,getTipoDocuUsuaNn()); } 



  @Override 
  public CJDVPersonProcesDto copy(){
    CJDVPersonProcesDto result = new CJDVPersonProcesDto();
    result.setPkeyPersProc( this.getPkeyPersProc()); 
    result.setFkeyPersSist( this.getFkeyPersSist()); 
    result.setFkeyProcCons( this.getFkeyProcCons()); 
    result.setFechRelaProc( this.getFechRelaProc()); 
    result.setTipoUsuaSist( this.getTipoUsuaSist()); 
    result.setNombUsuaSist( this.getNombUsuaSist()); 
    result.setTipoDocuUsua( this.getTipoDocuUsua()); 
    result.setNumeDocuUsua( this.getNumeDocuUsua()); 
    result.setLugaExpeDocu( this.getLugaExpeDocu()); 
    result.setTeleFijoUsua( this.getTeleFijoUsua()); 
    result.setTeleCeluUsua( this.getTeleCeluUsua()); 
    result.setCorrUsuaSist( this.getCorrUsuaSist()); 
    result.setNombContacto( this.getNombContacto()); 
    result.setTeleFijoCont( this.getTeleFijoCont()); 
    result.setTeleCeluCont( this.getTeleCeluCont()); 
    result.setCorrElecCont( this.getCorrElecCont()); 
    return result;
  }
}

