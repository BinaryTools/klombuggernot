package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.def.data.* ;

public class CJD_AccionExpediDto extends BaseDto {
  public static final List RANG_CreaEstuDoce = Arrays.asList( new Range[] { 
      new Range("D","Docente"),
      new Range("E","Estudiante")});


  private Integer pkeyAcciExpe;
  private Integer fkeyEstuProc;
  private Integer fkeyProcCons;
  private Date fechAcciExpe;
  private Date fechLimiAcci;
  private Date fechEntrAcci;
  private Double caliDoceAcci;
  private String obseDoceAcci;
  private String creaEstuDoce;
  private String tareAcciExpe;
  private String obseDoceCoor;
  private Integer fkeyPeriPlan;
  private String estaAcciVali;

  private CJD_EstudiProcesDto fkeyEstuProcDto;
  private CJD_ProcesConsulDto fkeyProcConsDto;
  private DEFVPeriPlanProgDto fkeyPeriPlanDto;

  public CJD_AccionExpediDto() { 
     PkeyEnti = 129503;
     setAliasName("AcciExpe"); 
  } 

//-------------------------------------------| PkeyAcciExpe
  public Integer getPkeyAcciExpe(){ return pkeyAcciExpe; } 
  public Integer getPkeyAcciExpeNn(){ return setNotNull(pkeyAcciExpe); } 
  public String getPkeyAcciExpeDesc(){ return setDesc(pkeyAcciExpe); } 
  public void setPkeyAcciExpe(Integer value){ this.pkeyAcciExpe=value;} 
  @Override
  public int toInt(){ return getPkeyAcciExpeNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyAcciExpe; }; 
//-------------------------------------------| FkeyEstuProc
  public Integer getFkeyEstuProc(){ return fkeyEstuProc; } 
  public Integer getFkeyEstuProcNn(){ return setNotNull(fkeyEstuProc); } 
  public String getFkeyEstuProcDesc(){ return setDesc(fkeyEstuProc); } 
  public void setFkeyEstuProc(Integer value){ this.fkeyEstuProc=value;} 
//-------------------------------------------| FkeyProcCons
  public Integer getFkeyProcCons(){ return fkeyProcCons; } 
  public Integer getFkeyProcConsNn(){ return setNotNull(fkeyProcCons); } 
  public String getFkeyProcConsDesc(){ return setDesc(fkeyProcCons); } 
  public void setFkeyProcCons(Integer value){ this.fkeyProcCons=value;} 
//-------------------------------------------| FechAcciExpe
  public Date getFechAcciExpe(){ return fechAcciExpe; } 
  public Date getFechAcciExpeNn(){ return setNotNull(fechAcciExpe); } 
  public String getFechAcciExpeDesc(){ return setDesc(fechAcciExpe); } 
  public void setFechAcciExpe(Date value){ this.fechAcciExpe=value;} 
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
//-------------------------------------------| TareAcciExpe
  public String getTareAcciExpe(){ return tareAcciExpe; } 
  public String getTareAcciExpeNn(){ return setNotNull(tareAcciExpe); } 
  public String getTareAcciExpeDesc(){ return setDesc(tareAcciExpe); } 
  public void setTareAcciExpe(String value){ this.tareAcciExpe=value;} 
//-------------------------------------------| ObseDoceCoor
  public String getObseDoceCoor(){ return obseDoceCoor; } 
  public String getObseDoceCoorNn(){ return setNotNull(obseDoceCoor); } 
  public String getObseDoceCoorDesc(){ return setDesc(obseDoceCoor); } 
  public void setObseDoceCoor(String value){ this.obseDoceCoor=value;} 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
//-------------------------------------------| EstaAcciVali
  public String getEstaAcciVali(){ return estaAcciVali; } 
  public String getEstaAcciValiNn(){ return setNotNull(estaAcciVali); } 
  public String getEstaAcciValiDesc(){ return setDesc(estaAcciVali); } 
  public void setEstaAcciVali(String value){ this.estaAcciVali=value;} 
  public boolean getEstaAcciValiBool() { return estaAcciVali==null?false:estaAcciVali.equals("S");}
  public void setEstaAcciValiBool(boolean estaAcciVali) { this.estaAcciVali=estaAcciVali?"S":"N";}
// ---------------(RANGOS) 
  public String getCreaEstuDoceDesc() { return DtoMisc.getRangeDesc(RANG_CreaEstuDoce,getCreaEstuDoceNn()); } 

//---------------------(REL: FkeyEstuProcDto) 
  public CJD_EstudiProcesDto getFkeyEstuProcDto() { return fkeyEstuProcDto; } 
  public void setFkeyEstuProcDto(CJD_EstudiProcesDto fkeyEstuProcDto) {
    if ( fkeyEstuProcDto != null ) { 
      this.fkeyEstuProc = fkeyEstuProcDto.getPkeyEstuProc(); 
    }
    this.fkeyEstuProcDto = fkeyEstuProcDto;
  } 
//---------------------(REL: FkeyProcConsDto) 
  public CJD_ProcesConsulDto getFkeyProcConsDto() { return fkeyProcConsDto; } 
  public void setFkeyProcConsDto(CJD_ProcesConsulDto fkeyProcConsDto) {
    if ( fkeyProcConsDto != null ) { 
      this.fkeyProcCons = fkeyProcConsDto.getPkeyProcCons(); 
    }
    this.fkeyProcConsDto = fkeyProcConsDto;
  } 
//---------------------(REL: FkeyPeriPlanDto) 
  public DEFVPeriPlanProgDto getFkeyPeriPlanDto() { return fkeyPeriPlanDto; } 
  public void setFkeyPeriPlanDto(DEFVPeriPlanProgDto fkeyPeriPlanDto) {
    if ( fkeyPeriPlanDto != null ) { 
      this.fkeyPeriPlan = fkeyPeriPlanDto.getPkeyPeriPlan(); 
    }
    this.fkeyPeriPlanDto = fkeyPeriPlanDto;
  } 


  @Override 
  public CJD_AccionExpediDto copy(){
    CJD_AccionExpediDto result = new CJD_AccionExpediDto();
    result.setPkeyAcciExpe( this.getPkeyAcciExpe()); 
    result.setFkeyEstuProc( this.getFkeyEstuProc()); 
    result.setFkeyProcCons( this.getFkeyProcCons()); 
    result.setFechAcciExpe( this.getFechAcciExpe()); 
    result.setFechLimiAcci( this.getFechLimiAcci()); 
    result.setFechEntrAcci( this.getFechEntrAcci()); 
    result.setCaliDoceAcci( this.getCaliDoceAcci()); 
    result.setObseDoceAcci( this.getObseDoceAcci()); 
    result.setCreaEstuDoce( this.getCreaEstuDoce()); 
    result.setTareAcciExpe( this.getTareAcciExpe()); 
    result.setObseDoceCoor( this.getObseDoceCoor()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    result.setEstaAcciVali( this.getEstaAcciVali()); 
    result.setFkeyEstuProcDto( this.getFkeyEstuProcDto());
    result.setFkeyProcConsDto( this.getFkeyProcConsDto());
    result.setFkeyPeriPlanDto( this.getFkeyPeriPlanDto());
    return result;
  }
}

