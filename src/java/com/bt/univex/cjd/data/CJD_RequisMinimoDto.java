package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;

public class CJD_RequisMinimoDto extends BaseDto {
  public static final List RANG_TienConsEstu = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});
  public static final List RANG_TienProcEstu = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});
  public static final List RANG_TienLiquEstu = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});
  public static final List RANG_TienTuteEstu = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});
  public static final List RANG_TienDerePeti = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});
  public static final List RANG_TienConcEstu = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});
  public static final List RANG_TienAnalJuri = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});
  public static final List RANG_TipoEstudian = Arrays.asList( new Range[] { 
      new Range("P","Empleado Publico"),
      new Range("C","Estudiante Coordinador"),
      new Range("E","Estudiante Normal")});


  private Integer pkeyRequMini;
  private String tienConsEstu;
  private Integer cantConsEstu;
  private String tienProcEstu;
  private Integer cantProcEstu;
  private String tienLiquEstu;
  private Integer cantLiquEstu;
  private String tienTuteEstu;
  private Integer cantTuteEstu;
  private String tienDerePeti;
  private Integer cantDerePeti;
  private String tienConcEstu;
  private Integer cantConcEstu;
  private String tienAnalJuri;
  private Integer cantAnalJuri;
  private String tipoEstudian;


  public CJD_RequisMinimoDto() { 
     PkeyEnti = 129703;
     setAliasName("RequMini"); 
  } 

//-------------------------------------------| PkeyRequMini
  public Integer getPkeyRequMini(){ return pkeyRequMini; } 
  public Integer getPkeyRequMiniNn(){ return setNotNull(pkeyRequMini); } 
  public String getPkeyRequMiniDesc(){ return setDesc(pkeyRequMini); } 
  public void setPkeyRequMini(Integer value){ this.pkeyRequMini=value;} 
  @Override
  public int toInt(){ return getPkeyRequMiniNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyRequMini; }; 
//-------------------------------------------| TienConsEstu
  public String getTienConsEstu(){ return tienConsEstu; } 
  public String getTienConsEstuNn(){ return setNotNull(tienConsEstu); } 
  public void setTienConsEstu(String value){ this.tienConsEstu=value;} 
  public boolean getTienConsEstuBool() { return tienConsEstu==null?false:tienConsEstu.equals("S");}
  public void setTienConsEstuBool(boolean tienConsEstu) { this.tienConsEstu=tienConsEstu?"S":"N";}
//-------------------------------------------| CantConsEstu
  public Integer getCantConsEstu(){ return cantConsEstu; } 
  public Integer getCantConsEstuNn(){ return setNotNull(cantConsEstu); } 
  public String getCantConsEstuDesc(){ return setDesc(cantConsEstu); } 
  public void setCantConsEstu(Integer value){ this.cantConsEstu=value;} 
//-------------------------------------------| TienProcEstu
  public String getTienProcEstu(){ return tienProcEstu; } 
  public String getTienProcEstuNn(){ return setNotNull(tienProcEstu); } 
  public void setTienProcEstu(String value){ this.tienProcEstu=value;} 
  public boolean getTienProcEstuBool() { return tienProcEstu==null?false:tienProcEstu.equals("S");}
  public void setTienProcEstuBool(boolean tienProcEstu) { this.tienProcEstu=tienProcEstu?"S":"N";}
//-------------------------------------------| CantProcEstu
  public Integer getCantProcEstu(){ return cantProcEstu; } 
  public Integer getCantProcEstuNn(){ return setNotNull(cantProcEstu); } 
  public String getCantProcEstuDesc(){ return setDesc(cantProcEstu); } 
  public void setCantProcEstu(Integer value){ this.cantProcEstu=value;} 
//-------------------------------------------| TienLiquEstu
  public String getTienLiquEstu(){ return tienLiquEstu; } 
  public String getTienLiquEstuNn(){ return setNotNull(tienLiquEstu); } 
  public void setTienLiquEstu(String value){ this.tienLiquEstu=value;} 
  public boolean getTienLiquEstuBool() { return tienLiquEstu==null?false:tienLiquEstu.equals("S");}
  public void setTienLiquEstuBool(boolean tienLiquEstu) { this.tienLiquEstu=tienLiquEstu?"S":"N";}
//-------------------------------------------| CantLiquEstu
  public Integer getCantLiquEstu(){ return cantLiquEstu; } 
  public Integer getCantLiquEstuNn(){ return setNotNull(cantLiquEstu); } 
  public String getCantLiquEstuDesc(){ return setDesc(cantLiquEstu); } 
  public void setCantLiquEstu(Integer value){ this.cantLiquEstu=value;} 
//-------------------------------------------| TienTuteEstu
  public String getTienTuteEstu(){ return tienTuteEstu; } 
  public String getTienTuteEstuNn(){ return setNotNull(tienTuteEstu); } 
  public void setTienTuteEstu(String value){ this.tienTuteEstu=value;} 
  public boolean getTienTuteEstuBool() { return tienTuteEstu==null?false:tienTuteEstu.equals("S");}
  public void setTienTuteEstuBool(boolean tienTuteEstu) { this.tienTuteEstu=tienTuteEstu?"S":"N";}
//-------------------------------------------| CantTuteEstu
  public Integer getCantTuteEstu(){ return cantTuteEstu; } 
  public Integer getCantTuteEstuNn(){ return setNotNull(cantTuteEstu); } 
  public String getCantTuteEstuDesc(){ return setDesc(cantTuteEstu); } 
  public void setCantTuteEstu(Integer value){ this.cantTuteEstu=value;} 
//-------------------------------------------| TienDerePeti
  public String getTienDerePeti(){ return tienDerePeti; } 
  public String getTienDerePetiNn(){ return setNotNull(tienDerePeti); } 
  public void setTienDerePeti(String value){ this.tienDerePeti=value;} 
  public boolean getTienDerePetiBool() { return tienDerePeti==null?false:tienDerePeti.equals("S");}
  public void setTienDerePetiBool(boolean tienDerePeti) { this.tienDerePeti=tienDerePeti?"S":"N";}
//-------------------------------------------| CantDerePeti
  public Integer getCantDerePeti(){ return cantDerePeti; } 
  public Integer getCantDerePetiNn(){ return setNotNull(cantDerePeti); } 
  public String getCantDerePetiDesc(){ return setDesc(cantDerePeti); } 
  public void setCantDerePeti(Integer value){ this.cantDerePeti=value;} 
//-------------------------------------------| TienConcEstu
  public String getTienConcEstu(){ return tienConcEstu; } 
  public String getTienConcEstuNn(){ return setNotNull(tienConcEstu); } 
  public void setTienConcEstu(String value){ this.tienConcEstu=value;} 
  public boolean getTienConcEstuBool() { return tienConcEstu==null?false:tienConcEstu.equals("S");}
  public void setTienConcEstuBool(boolean tienConcEstu) { this.tienConcEstu=tienConcEstu?"S":"N";}
//-------------------------------------------| CantConcEstu
  public Integer getCantConcEstu(){ return cantConcEstu; } 
  public Integer getCantConcEstuNn(){ return setNotNull(cantConcEstu); } 
  public String getCantConcEstuDesc(){ return setDesc(cantConcEstu); } 
  public void setCantConcEstu(Integer value){ this.cantConcEstu=value;} 
//-------------------------------------------| TienAnalJuri
  public String getTienAnalJuri(){ return tienAnalJuri; } 
  public String getTienAnalJuriNn(){ return setNotNull(tienAnalJuri); } 
  public void setTienAnalJuri(String value){ this.tienAnalJuri=value;} 
  public boolean getTienAnalJuriBool() { return tienAnalJuri==null?false:tienAnalJuri.equals("S");}
  public void setTienAnalJuriBool(boolean tienAnalJuri) { this.tienAnalJuri=tienAnalJuri?"S":"N";}
//-------------------------------------------| CantAnalJuri
  public Integer getCantAnalJuri(){ return cantAnalJuri; } 
  public Integer getCantAnalJuriNn(){ return setNotNull(cantAnalJuri); } 
  public String getCantAnalJuriDesc(){ return setDesc(cantAnalJuri); } 
  public void setCantAnalJuri(Integer value){ this.cantAnalJuri=value;} 
//-------------------------------------------| TipoEstudian
  public String getTipoEstudian(){ return tipoEstudian; } 
  public String getTipoEstudianNn(){ return setNotNull(tipoEstudian); } 
  public void setTipoEstudian(String value){ this.tipoEstudian=value;} 
// ---------------(RANGOS) 
  public String getTienConsEstuDesc() { return DtoMisc.getRangeDesc(RANG_TienConsEstu,getTienConsEstuNn()); } 
  public String getTienProcEstuDesc() { return DtoMisc.getRangeDesc(RANG_TienProcEstu,getTienProcEstuNn()); } 
  public String getTienLiquEstuDesc() { return DtoMisc.getRangeDesc(RANG_TienLiquEstu,getTienLiquEstuNn()); } 
  public String getTienTuteEstuDesc() { return DtoMisc.getRangeDesc(RANG_TienTuteEstu,getTienTuteEstuNn()); } 
  public String getTienDerePetiDesc() { return DtoMisc.getRangeDesc(RANG_TienDerePeti,getTienDerePetiNn()); } 
  public String getTienConcEstuDesc() { return DtoMisc.getRangeDesc(RANG_TienConcEstu,getTienConcEstuNn()); } 
  public String getTienAnalJuriDesc() { return DtoMisc.getRangeDesc(RANG_TienAnalJuri,getTienAnalJuriNn()); } 
  public String getTipoEstudianDesc() { return DtoMisc.getRangeDesc(RANG_TipoEstudian,getTipoEstudianNn()); } 



  @Override 
  public CJD_RequisMinimoDto copy(){
    CJD_RequisMinimoDto result = new CJD_RequisMinimoDto();
    result.setPkeyRequMini( this.getPkeyRequMini()); 
    result.setTienConsEstu( this.getTienConsEstu()); 
    result.setCantConsEstu( this.getCantConsEstu()); 
    result.setTienProcEstu( this.getTienProcEstu()); 
    result.setCantProcEstu( this.getCantProcEstu()); 
    result.setTienLiquEstu( this.getTienLiquEstu()); 
    result.setCantLiquEstu( this.getCantLiquEstu()); 
    result.setTienTuteEstu( this.getTienTuteEstu()); 
    result.setCantTuteEstu( this.getCantTuteEstu()); 
    result.setTienDerePeti( this.getTienDerePeti()); 
    result.setCantDerePeti( this.getCantDerePeti()); 
    result.setTienConcEstu( this.getTienConcEstu()); 
    result.setCantConcEstu( this.getCantConcEstu()); 
    result.setTienAnalJuri( this.getTienAnalJuri()); 
    result.setCantAnalJuri( this.getCantAnalJuri()); 
    result.setTipoEstudian( this.getTipoEstudian()); 
    return result;
  }
}

