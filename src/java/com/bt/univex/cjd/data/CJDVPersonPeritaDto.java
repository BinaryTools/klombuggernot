package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDVPersonPeritaDto extends BaseDto {


  private Integer pkeyPersPeri;
  private Integer fkeyPersSist;
  private Integer fkeyPeriCons;
  private Date fechRelaPeri;
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


  public CJDVPersonPeritaDto() { 
     PkeyEnti = 188403;
     setAliasName("PersPeri"); 
  } 

//-------------------------------------------| PkeyPersPeri
  public Integer getPkeyPersPeri(){ return pkeyPersPeri; } 
  public Integer getPkeyPersPeriNn(){ return setNotNull(pkeyPersPeri); } 
  public String getPkeyPersPeriDesc(){ return setDesc(pkeyPersPeri); } 
  public void setPkeyPersPeri(Integer value){ this.pkeyPersPeri=value;} 
  @Override
  public int toInt(){ return getPkeyPersPeriNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyPersPeri; }; 
//-------------------------------------------| FkeyPersSist
  public Integer getFkeyPersSist(){ return fkeyPersSist; } 
  public Integer getFkeyPersSistNn(){ return setNotNull(fkeyPersSist); } 
  public String getFkeyPersSistDesc(){ return setDesc(fkeyPersSist); } 
  public void setFkeyPersSist(Integer value){ this.fkeyPersSist=value;} 
//-------------------------------------------| FkeyPeriCons
  public Integer getFkeyPeriCons(){ return fkeyPeriCons; } 
  public Integer getFkeyPeriConsNn(){ return setNotNull(fkeyPeriCons); } 
  public String getFkeyPeriConsDesc(){ return setDesc(fkeyPeriCons); } 
  public void setFkeyPeriCons(Integer value){ this.fkeyPeriCons=value;} 
//-------------------------------------------| FechRelaPeri
  public Date getFechRelaPeri(){ return fechRelaPeri; } 
  public Date getFechRelaPeriNn(){ return setNotNull(fechRelaPeri); } 
  public String getFechRelaPeriDesc(){ return setDesc(fechRelaPeri); } 
  public void setFechRelaPeri(Date value){ this.fechRelaPeri=value;} 
//-------------------------------------------| TipoUsuaSist
  public String getTipoUsuaSist(){ return tipoUsuaSist; } 
  public String getTipoUsuaSistNn(){ return setNotNull(tipoUsuaSist); } 
  public String getTipoUsuaSistDesc(){ return setDesc(tipoUsuaSist); } 
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
  public String getTipoDocuUsuaDesc(){ return setDesc(tipoDocuUsua); } 
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



  @Override 
  public CJDVPersonPeritaDto copy(){
    CJDVPersonPeritaDto result = new CJDVPersonPeritaDto();
    result.setPkeyPersPeri( this.getPkeyPersPeri()); 
    result.setFkeyPersSist( this.getFkeyPersSist()); 
    result.setFkeyPeriCons( this.getFkeyPeriCons()); 
    result.setFechRelaPeri( this.getFechRelaPeri()); 
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

