package com.bt.univex.mnu.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.mnu.data.*;
import com.bt.univex.xpc.data.* ;

public class MNU_ModuloSistemDto extends BaseDto {
  public static final List RANG_TipoPort = Arrays.asList( new Range[] { 
      new Range("A","Aspirantes"),
      new Range("C","Comunidad (Externos a la Instituci¿n)"),
      new Range("D","Docentes"),
      new Range("E","Estudiantes"),
      new Range("G","Gestion General"),
      new Range("I","Investigadores"),
      new Range("O","Otros"),
      new Range("P","Proveedores"),
      new Range("R","Egresados"),
      new Range("S","Soporte externo"),
      new Range("W","Web service (Entidades externas)")});
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),
      new Range("S","Sí")});


  private Integer pkeyModuSist;
  private Integer fkeyProyInfo;
  private Integer ordeModuSist;
  private String nombModuSist;
  private String aliaModuSist;
  private String descModuSist;
  private String tipoPortModu;
  private String estaActiModu;

  private XPC_ProyecInformDto fkeyProyInfoDto;

  public MNU_ModuloSistemDto() { 
     PkeyEnti = 73203;
     setAliasName("ModuloSistem"); 
  } 

//-------------------------------------------| PkeyModuSist
  public Integer getPkeyModuSist(){ return pkeyModuSist; } 
  public Integer getPkeyModuSistNn(){ return setNotNull(pkeyModuSist); } 
  public String getPkeyModuSistDesc(){ return setDesc(pkeyModuSist); } 
  public void setPkeyModuSist(Integer value){ this.pkeyModuSist=value;} 
  @Override
  public int toInt(){ return getPkeyModuSistNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyModuSist; }; 
//-------------------------------------------| FkeyProyInfo
  public Integer getFkeyProyInfo(){ return fkeyProyInfo; } 
  public Integer getFkeyProyInfoNn(){ return setNotNull(fkeyProyInfo); } 
  public String getFkeyProyInfoDesc(){ return setDesc(fkeyProyInfo); } 
  public void setFkeyProyInfo(Integer value){ this.fkeyProyInfo=value;} 
//-------------------------------------------| OrdeModuSist
  public Integer getOrdeModuSist(){ return ordeModuSist; } 
  public Integer getOrdeModuSistNn(){ return setNotNull(ordeModuSist); } 
  public String getOrdeModuSistDesc(){ return setDesc(ordeModuSist); } 
  public void setOrdeModuSist(Integer value){ this.ordeModuSist=value;} 
//-------------------------------------------| NombModuSist
  public String getNombModuSist(){ return nombModuSist; } 
  public String getNombModuSistNn(){ return setNotNull(nombModuSist); } 
  public String getNombModuSistDesc(){ return setDesc(nombModuSist); } 
  public void setNombModuSist(String value){ this.nombModuSist=value;} 
  @Override
  public String toString(){ return getNombModuSistNn(); }; 
//-------------------------------------------| AliaModuSist
  public String getAliaModuSist(){ return aliaModuSist; } 
  public String getAliaModuSistNn(){ return setNotNull(aliaModuSist); } 
  public String getAliaModuSistDesc(){ return setDesc(aliaModuSist); } 
  public void setAliaModuSist(String value){ this.aliaModuSist=value;} 
//-------------------------------------------| DescModuSist
  public String getDescModuSist(){ return descModuSist; } 
  public String getDescModuSistNn(){ return setNotNull(descModuSist); } 
  public String getDescModuSistDesc(){ return setDesc(descModuSist); } 
  public void setDescModuSist(String value){ this.descModuSist=value;} 
//-------------------------------------------| TipoPortModu
  public String getTipoPortModu(){ return tipoPortModu; } 
  public String getTipoPortModuNn(){ return setNotNull(tipoPortModu); } 
  public void setTipoPortModu(String value){ this.tipoPortModu=value;} 
//-------------------------------------------| EstaActiModu
  public String getEstaActiModu(){ return estaActiModu; } 
  public String getEstaActiModuNn(){ return setNotNull(estaActiModu); } 
  public void setEstaActiModu(String value){ this.estaActiModu=value;} 
  public boolean getEstaActiModuBool() { return estaActiModu==null?false:estaActiModu.equals("S");}
  public void setEstaActiModuBool(boolean estaActiModu) { this.estaActiModu=estaActiModu?"S":"N";}
// ---------------(RANGOS) 
  public String getTipoPortModuDesc() { return DtoMisc.getRangeDesc(RANG_TipoPort,getTipoPortModuNn()); } 
  public String getEstaActiModuDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEstaActiModuNn()); } 

//---------------------(REL: FkeyProyInfoDto) 
  public XPC_ProyecInformDto getFkeyProyInfoDto() { return fkeyProyInfoDto; } 
  public void setFkeyProyInfoDto(XPC_ProyecInformDto fkeyProyInfoDto) {
    if ( fkeyProyInfoDto != null ) { 
      this.fkeyProyInfo = fkeyProyInfoDto.getPkeyProyInfo(); 
    }
    this.fkeyProyInfoDto = fkeyProyInfoDto;
  } 


  @Override 
  public MNU_ModuloSistemDto copy(){
    MNU_ModuloSistemDto result = new MNU_ModuloSistemDto();
    result.setPkeyModuSist( this.getPkeyModuSist()); 
    result.setFkeyProyInfo( this.getFkeyProyInfo()); 
    result.setOrdeModuSist( this.getOrdeModuSist()); 
    result.setNombModuSist( this.getNombModuSist()); 
    result.setAliaModuSist( this.getAliaModuSist()); 
    result.setDescModuSist( this.getDescModuSist()); 
    result.setTipoPortModu( this.getTipoPortModu()); 
    result.setEstaActiModu( this.getEstaActiModu()); 
    result.setFkeyProyInfoDto( this.getFkeyProyInfoDto());
    return result;
  }
}

