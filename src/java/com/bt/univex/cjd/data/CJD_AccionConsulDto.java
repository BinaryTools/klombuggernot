package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;

public class CJD_AccionConsulDto extends BaseDto {
  public static final List RANG_CreaEstuDoce = Arrays.asList( new Range[] { 
      new Range("D","Docente"),
      new Range("E","Estudiante")});


  private Integer pkeyAcciCons;
  private Integer fkeyConsSist;
  private Date fechAcciCons;
  private Date fechLimiAcci;
  private Date fechEntrAcci;
  private Double caliDoceAcci;
  private String obseDoceAcci;
  private String creaEstuDoce;
  private String tareAcciCons;
  private String obseDoceCoor;

  private CJD_ConsulSistemDto fkeyConsSistDto;

  public CJD_AccionConsulDto() { 
     PkeyEnti = 169303;
     setAliasName("AcciCons"); 
  } 

//-------------------------------------------| PkeyAcciCons
  public Integer getPkeyAcciCons(){ return pkeyAcciCons; } 
  public Integer getPkeyAcciConsNn(){ return setNotNull(pkeyAcciCons); } 
  public String getPkeyAcciConsDesc(){ return setDesc(pkeyAcciCons); } 
  public void setPkeyAcciCons(Integer value){ this.pkeyAcciCons=value;} 
  @Override
  public int toInt(){ return getPkeyAcciConsNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyAcciCons; }; 
//-------------------------------------------| FkeyConsSist
  public Integer getFkeyConsSist(){ return fkeyConsSist; } 
  public Integer getFkeyConsSistNn(){ return setNotNull(fkeyConsSist); } 
  public String getFkeyConsSistDesc(){ return setDesc(fkeyConsSist); } 
  public void setFkeyConsSist(Integer value){ this.fkeyConsSist=value;} 
//-------------------------------------------| FechAcciCons
  public Date getFechAcciCons(){ return fechAcciCons; } 
  public Date getFechAcciConsNn(){ return setNotNull(fechAcciCons); } 
  public String getFechAcciConsDesc(){ return setDesc(fechAcciCons); } 
  public void setFechAcciCons(Date value){ this.fechAcciCons=value;} 
//-------------------------------------------| FechLimiAcci
  public Date getFechLimiAcci(){ return fechLimiAcci; } 
  public Date getFechLimiAcciNn(){ return setNotNull(fechLimiAcci); } 
  public String getFechLimiAcciDesc(){ return setDesc(fechLimiAcci); } 
  public void setFechLimiAcci(Date value){ this.fechLimiAcci=value;} 
//-------------------------------------------| FechEntrAcci
  public Date getFechEntrAcci(){ return fechEntrAcci; } 
  public Date getFechEntrAcciNn(){ return setNotNull(fechEntrAcci); } 
  public String getFechEntrAcciDesc(){ return setDesc(fechEntrAcci); } 
  public void setFechEntrAcci(Date value){ this.fechEntrAcci=value;} 
//-------------------------------------------| CaliDoceAcci
  public Double getCaliDoceAcci(){ return caliDoceAcci; } 
  public Double getCaliDoceAcciNn(){ return setNotNull(caliDoceAcci); } 
  public String getCaliDoceAcciDesc(){ return setDesc(caliDoceAcci); } 
  public void setCaliDoceAcci(Double value){ this.caliDoceAcci=value;} 
//-------------------------------------------| ObseDoceAcci
  public String getObseDoceAcci(){ return obseDoceAcci; } 
  public String getObseDoceAcciNn(){ return setNotNull(obseDoceAcci); } 
  public String getObseDoceAcciDesc(){ return setDesc(obseDoceAcci); } 
  public void setObseDoceAcci(String value){ this.obseDoceAcci=value;} 
//-------------------------------------------| CreaEstuDoce
  public String getCreaEstuDoce(){ return creaEstuDoce; } 
  public String getCreaEstuDoceNn(){ return setNotNull(creaEstuDoce); } 
  public void setCreaEstuDoce(String value){ this.creaEstuDoce=value;} 
//-------------------------------------------| TareAcciCons
  public String getTareAcciCons(){ return tareAcciCons; } 
  public String getTareAcciConsNn(){ return setNotNull(tareAcciCons); } 
  public String getTareAcciConsDesc(){ return setDesc(tareAcciCons); } 
  public void setTareAcciCons(String value){ this.tareAcciCons=value;} 
//-------------------------------------------| ObseDoceCoor
  public String getObseDoceCoor(){ return obseDoceCoor; } 
  public String getObseDoceCoorNn(){ return setNotNull(obseDoceCoor); } 
  public String getObseDoceCoorDesc(){ return setDesc(obseDoceCoor); } 
  public void setObseDoceCoor(String value){ this.obseDoceCoor=value;} 
// ---------------(RANGOS) 
  public String getCreaEstuDoceDesc() { return DtoMisc.getRangeDesc(RANG_CreaEstuDoce,getCreaEstuDoceNn()); } 

//---------------------(REL: FkeyConsSistDto) 
  public CJD_ConsulSistemDto getFkeyConsSistDto() { return fkeyConsSistDto; } 
  public void setFkeyConsSistDto(CJD_ConsulSistemDto fkeyConsSistDto) {
    if ( fkeyConsSistDto != null ) { 
      this.fkeyConsSist = fkeyConsSistDto.getPkeyConsSist(); 
    }
    this.fkeyConsSistDto = fkeyConsSistDto;
  } 


  @Override 
  public CJD_AccionConsulDto copy(){
    CJD_AccionConsulDto result = new CJD_AccionConsulDto();
    result.setPkeyAcciCons( this.getPkeyAcciCons()); 
    result.setFkeyConsSist( this.getFkeyConsSist()); 
    result.setFechAcciCons( this.getFechAcciCons()); 
    result.setFechLimiAcci( this.getFechLimiAcci()); 
    result.setFechEntrAcci( this.getFechEntrAcci()); 
    result.setCaliDoceAcci( this.getCaliDoceAcci()); 
    result.setObseDoceAcci( this.getObseDoceAcci()); 
    result.setCreaEstuDoce( this.getCreaEstuDoce()); 
    result.setTareAcciCons( this.getTareAcciCons()); 
    result.setObseDoceCoor( this.getObseDoceCoor()); 
    result.setFkeyConsSistDto( this.getFkeyConsSistDto());
    return result;
  }
}

