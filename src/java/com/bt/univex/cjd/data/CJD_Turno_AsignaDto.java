package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;

public class CJD_Turno_AsignaDto extends BaseDto {
  public static final List RANG_EfecTurnAsig = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});


  private Integer pkeyTurnAsig;
  private Integer fkeyConsSist;
  private Date fechTurnAsig;
  private Integer horaAtenTurn;
  private String efecTurnAsig;
  private String obseTurnAsig;

  private CJD_ConsulSistemDto fkeyConsSistDto;

  public CJD_Turno_AsignaDto() { 
     PkeyEnti = 129303;
     setAliasName("TurnAsig"); 
  } 

//-------------------------------------------| PkeyTurnAsig
  public Integer getPkeyTurnAsig(){ return pkeyTurnAsig; } 
  public Integer getPkeyTurnAsigNn(){ return setNotNull(pkeyTurnAsig); } 
  public String getPkeyTurnAsigDesc(){ return setDesc(pkeyTurnAsig); } 
  public void setPkeyTurnAsig(Integer value){ this.pkeyTurnAsig=value;} 
  @Override
  public int toInt(){ return getPkeyTurnAsigNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyTurnAsig; }; 
//-------------------------------------------| FkeyConsSist
  public Integer getFkeyConsSist(){ return fkeyConsSist; } 
  public Integer getFkeyConsSistNn(){ return setNotNull(fkeyConsSist); } 
  public String getFkeyConsSistDesc(){ return setDesc(fkeyConsSist); } 
  public void setFkeyConsSist(Integer value){ this.fkeyConsSist=value;} 
//-------------------------------------------| FechTurnAsig
  public Date getFechTurnAsig(){ return fechTurnAsig; } 
  public Date getFechTurnAsigNn(){ return setNotNull(fechTurnAsig); } 
  public String getFechTurnAsigDesc(){ return setDesc(fechTurnAsig); } 
  public void setFechTurnAsig(Date value){ this.fechTurnAsig=value;} 
//-------------------------------------------| HoraAtenTurn
  public Integer getHoraAtenTurn(){ return horaAtenTurn; } 
  public Integer getHoraAtenTurnNn(){ return setNotNull(horaAtenTurn); } 
  public String getHoraAtenTurnDesc(){ return setDesc(horaAtenTurn); } 
  public void setHoraAtenTurn(Integer value){ this.horaAtenTurn=value;} 
//-------------------------------------------| EfecTurnAsig
  public String getEfecTurnAsig(){ return efecTurnAsig; } 
  public String getEfecTurnAsigNn(){ return setNotNull(efecTurnAsig); } 
  public void setEfecTurnAsig(String value){ this.efecTurnAsig=value;} 
  public boolean getEfecTurnAsigBool() { return efecTurnAsig==null?false:efecTurnAsig.equals("S");}
  public void setEfecTurnAsigBool(boolean efecTurnAsig) { this.efecTurnAsig=efecTurnAsig?"S":"N";}
//-------------------------------------------| ObseTurnAsig
  public String getObseTurnAsig(){ return obseTurnAsig; } 
  public String getObseTurnAsigNn(){ return setNotNull(obseTurnAsig); } 
  public String getObseTurnAsigDesc(){ return setDesc(obseTurnAsig); } 
  public void setObseTurnAsig(String value){ this.obseTurnAsig=value;} 
// ---------------(RANGOS) 
  public String getEfecTurnAsigDesc() { return DtoMisc.getRangeDesc(RANG_EfecTurnAsig,getEfecTurnAsigNn()); } 

//---------------------(REL: FkeyConsSistDto) 
  public CJD_ConsulSistemDto getFkeyConsSistDto() { return fkeyConsSistDto; } 
  public void setFkeyConsSistDto(CJD_ConsulSistemDto fkeyConsSistDto) {
    if ( fkeyConsSistDto != null ) { 
      this.fkeyConsSist = fkeyConsSistDto.getPkeyConsSist(); 
    }
    this.fkeyConsSistDto = fkeyConsSistDto;
  } 


  @Override 
  public CJD_Turno_AsignaDto copy(){
    CJD_Turno_AsignaDto result = new CJD_Turno_AsignaDto();
    result.setPkeyTurnAsig( this.getPkeyTurnAsig()); 
    result.setFkeyConsSist( this.getFkeyConsSist()); 
    result.setFechTurnAsig( this.getFechTurnAsig()); 
    result.setHoraAtenTurn( this.getHoraAtenTurn()); 
    result.setEfecTurnAsig( this.getEfecTurnAsig()); 
    result.setObseTurnAsig( this.getObseTurnAsig()); 
    result.setFkeyConsSistDto( this.getFkeyConsSistDto());
    return result;
  }
}

