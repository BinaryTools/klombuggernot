package com.bt.univex.ads.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.ads.data.*;

public class ADS_MensajAdminiDto extends BaseDto {
  public static final List RANG_TipoPortModu = Arrays.asList( new Range[] { 
      new Range("A","Aspirantes"),
      new Range("C","Comunidad"),
      new Range("D","Docentes"),
      new Range("E","Estudiantes"),
      new Range("G","Gestion General"),
      new Range("I","Investigadores"),
      new Range("P","Proveedores"),
      new Range("R","Egresados"),
      new Range("S","Soporte"),
      new Range("W","Web Servide"),
      new Range("O","Otros")});


  private Integer pkeyMensAdmi;
  private Date fechMensAdmi;
  private String textMensAdmi;
  private String linkMensAdmi;
  private String tipoPortModu;
  private String estaActiMens;


  public ADS_MensajAdminiDto() { 
     PkeyEnti = 132803;
     setAliasName("Mensajes"); 
  } 

//-------------------------------------------| PkeyMensAdmi
  public Integer getPkeyMensAdmi(){ return pkeyMensAdmi; } 
  public Integer getPkeyMensAdmiNn(){ return setNotNull(pkeyMensAdmi); } 
  public String getPkeyMensAdmiDesc(){ return setDesc(pkeyMensAdmi); } 
  public void setPkeyMensAdmi(Integer value){ this.pkeyMensAdmi=value;} 
  @Override
  public int toInt(){ return getPkeyMensAdmiNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyMensAdmi; }; 
//-------------------------------------------| FechMensAdmi
  public Date getFechMensAdmi(){ return fechMensAdmi; } 
  public Date getFechMensAdmiNn(){ return setNotNull(fechMensAdmi); } 
  public String getFechMensAdmiDesc(){ return setDesc(fechMensAdmi); } 
  public void setFechMensAdmi(Date value){ this.fechMensAdmi=value;} 
//-------------------------------------------| TextMensAdmi
  public String getTextMensAdmi(){ return textMensAdmi; } 
  public String getTextMensAdmiNn(){ return setNotNull(textMensAdmi); } 
  public String getTextMensAdmiDesc(){ return setDesc(textMensAdmi); } 
  public void setTextMensAdmi(String value){ this.textMensAdmi=value;} 
//-------------------------------------------| LinkMensAdmi
  public String getLinkMensAdmi(){ return linkMensAdmi; } 
  public String getLinkMensAdmiNn(){ return setNotNull(linkMensAdmi); } 
  public String getLinkMensAdmiDesc(){ return setDesc(linkMensAdmi); } 
  public void setLinkMensAdmi(String value){ this.linkMensAdmi=value;} 
//-------------------------------------------| TipoPortModu
  public String getTipoPortModu(){ return tipoPortModu; } 
  public String getTipoPortModuNn(){ return setNotNull(tipoPortModu); } 
  public void setTipoPortModu(String value){ this.tipoPortModu=value;} 
//-------------------------------------------| EstaActiMens
  public String getEstaActiMens(){ return estaActiMens; } 
  public String getEstaActiMensNn(){ return setNotNull(estaActiMens); } 
  public String getEstaActiMensDesc(){ return setDesc(estaActiMens); } 
  public void setEstaActiMens(String value){ this.estaActiMens=value;} 
  public boolean getEstaActiMensBool() { return estaActiMens==null?false:estaActiMens.equals("S");}
  public void setEstaActiMensBool(boolean estaActiMens) { this.estaActiMens=estaActiMens?"S":"N";}
// ---------------(RANGOS) 
  public String getTipoPortModuDesc() { return DtoMisc.getRangeDesc(RANG_TipoPortModu,getTipoPortModuNn()); } 



  @Override 
  public ADS_MensajAdminiDto copy(){
    ADS_MensajAdminiDto result = new ADS_MensajAdminiDto();
    result.setPkeyMensAdmi( this.getPkeyMensAdmi()); 
    result.setFechMensAdmi( this.getFechMensAdmi()); 
    result.setTextMensAdmi( this.getTextMensAdmi()); 
    result.setLinkMensAdmi( this.getLinkMensAdmi()); 
    result.setTipoPortModu( this.getTipoPortModu()); 
    result.setEstaActiMens( this.getEstaActiMens()); 
    return result;
  }
}

