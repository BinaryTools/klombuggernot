package com.bt.univex.xpc.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.xpc.data.*;

public class XPC_ProyecInformDto extends BaseDto {


  private Integer pkeyProyInfo;
  private String nombProyInfo;
  private String tituProyInfo;
  private String descProyInfo;
  private String nombDataBase;


  public XPC_ProyecInformDto() { 
     PkeyEnti = 74903;
     setAliasName("ProyecInform"); 
  } 

//-------------------------------------------| PkeyProyInfo
  public Integer getPkeyProyInfo(){ return pkeyProyInfo; } 
  public Integer getPkeyProyInfoNn(){ return setNotNull(pkeyProyInfo); } 
  public String getPkeyProyInfoDesc(){ return setDesc(pkeyProyInfo); } 
  public void setPkeyProyInfo(Integer value){ this.pkeyProyInfo=value;} 
  @Override
  public int toInt(){ return getPkeyProyInfoNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyProyInfo; }; 
//-------------------------------------------| NombProyInfo
  public String getNombProyInfo(){ return nombProyInfo; } 
  public String getNombProyInfoNn(){ return setNotNull(nombProyInfo); } 
  public String getNombProyInfoDesc(){ return setDesc(nombProyInfo); } 
  public void setNombProyInfo(String value){ this.nombProyInfo=value;} 
//-------------------------------------------| TituProyInfo
  public String getTituProyInfo(){ return tituProyInfo; } 
  public String getTituProyInfoNn(){ return setNotNull(tituProyInfo); } 
  public String getTituProyInfoDesc(){ return setDesc(tituProyInfo); } 
  public void setTituProyInfo(String value){ this.tituProyInfo=value;} 
  @Override
  public String toString(){ return getTituProyInfoNn(); }; 
//-------------------------------------------| DescProyInfo
  public String getDescProyInfo(){ return descProyInfo; } 
  public String getDescProyInfoNn(){ return setNotNull(descProyInfo); } 
  public String getDescProyInfoDesc(){ return setDesc(descProyInfo); } 
  public void setDescProyInfo(String value){ this.descProyInfo=value;} 
//-------------------------------------------| NombDataBase
  public String getNombDataBase(){ return nombDataBase; } 
  public String getNombDataBaseNn(){ return setNotNull(nombDataBase); } 
  public String getNombDataBaseDesc(){ return setDesc(nombDataBase); } 
  public void setNombDataBase(String value){ this.nombDataBase=value;} 
// ---------------(RANGOS) 



  @Override 
  public XPC_ProyecInformDto copy(){
    XPC_ProyecInformDto result = new XPC_ProyecInformDto();
    result.setPkeyProyInfo( this.getPkeyProyInfo()); 
    result.setNombProyInfo( this.getNombProyInfo()); 
    result.setTituProyInfo( this.getTituProyInfo()); 
    result.setDescProyInfo( this.getDescProyInfo()); 
    result.setNombDataBase( this.getNombDataBase()); 
    return result;
  }
}

