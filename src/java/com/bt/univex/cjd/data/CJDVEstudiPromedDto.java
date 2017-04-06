package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJDVEstudiPromedDto extends BaseDto {


  private Integer fkeyEstudian;
  private String promCarrEstu;
  private Integer fkeyPeriPlan;


  public CJDVEstudiPromedDto() { 
     PkeyEnti = 133603;
     setAliasName("EstuPromV"); 
  } 

//-------------------------------------------| FkeyEstudian
  public Integer getFkeyEstudian(){ return fkeyEstudian; } 
  public Integer getFkeyEstudianNn(){ return setNotNull(fkeyEstudian); } 
  public String getFkeyEstudianDesc(){ return setDesc(fkeyEstudian); } 
  public void setFkeyEstudian(Integer value){ this.fkeyEstudian=value;} 
  @Override
  public int toInt(){ return getFkeyEstudianNn(); }; 
  @Override
  public Integer toInteger(){ return fkeyEstudian; }; 
//-------------------------------------------| PromCarrEstu
  public String getPromCarrEstu(){ return promCarrEstu; } 
  public String getPromCarrEstuNn(){ return setNotNull(promCarrEstu); } 
  public String getPromCarrEstuDesc(){ return setDesc(promCarrEstu); } 
  public void setPromCarrEstu(String value){ this.promCarrEstu=value;} 
//-------------------------------------------| FkeyPeriPlan
  public Integer getFkeyPeriPlan(){ return fkeyPeriPlan; } 
  public Integer getFkeyPeriPlanNn(){ return setNotNull(fkeyPeriPlan); } 
  public String getFkeyPeriPlanDesc(){ return setDesc(fkeyPeriPlan); } 
  public void setFkeyPeriPlan(Integer value){ this.fkeyPeriPlan=value;} 
// ---------------(RANGOS) 



  @Override 
  public CJDVEstudiPromedDto copy(){
    CJDVEstudiPromedDto result = new CJDVEstudiPromedDto();
    result.setFkeyEstudian( this.getFkeyEstudian()); 
    result.setPromCarrEstu( this.getPromCarrEstu()); 
    result.setFkeyPeriPlan( this.getFkeyPeriPlan()); 
    return result;
  }
}

