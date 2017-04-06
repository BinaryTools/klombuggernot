package com.bt.univex.mnu.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*; 
import com.bt.univex.mnu.data.* ;

public class MNU_VinculSistemDto extends BaseDto {
  public static final List RANG_TipoVinc = Arrays.asList( new Range[] { 
      new Range("E","Externo"),
      new Range("I","Interno")});
  public static final List RANG_SI_NO = Arrays.asList( new Range[] { 
      new Range("N","No"),   
      new Range("S","Sí")});

 
  private Integer pkeyVinculo_;
  private Integer fkeyModuSist;
  private Integer fkeyArbolNuevo;  
  private Integer fkeyOrigDato;
  private Integer ordeVincSist;
  private String tipoVinculo_;
  private String nombMethExec;
  private String nombVinculo_;
  private String clasPathExec;
  private String aliaVinculo_;
  private String linkVinculo_;
  private String esunCargAuto;
  private String sub_TipoVinc;
  private String aliaArboEjec;
  private String esunVincArbo;

  private MNU_ModuloSistemDto fkeyModuSistDto;

  public MNU_VinculSistemDto() { 
     PkeyEnti = 74103;
     setAliasName("VinculSistem"); 
  } 

//-------------------------------------------| PkeyVinculo_
  public Integer getPkeyVinculo_(){ return pkeyVinculo_; } 
  public Integer getPkeyVinculo_Nn(){ return setNotNull(pkeyVinculo_); } 
  public String getPkeyVinculo_Desc(){ return setDesc(pkeyVinculo_); } 
  public void setPkeyVinculo_(Integer value){ this.pkeyVinculo_=value;} 
  @Override
  public int toInt(){ return getPkeyVinculo_Nn(); }; 
  @Override
  public Integer toInteger(){ return pkeyVinculo_; }; 
//-------------------------------------------| FkeyModuSist
  public Integer getFkeyModuSist(){ return fkeyModuSist; } 
  public Integer getFkeyModuSistNn(){ return setNotNull(fkeyModuSist); } 
  public String getFkeyModuSistDesc(){ return setDesc(fkeyModuSist); } 
  public void setFkeyModuSist(Integer value){ this.fkeyModuSist=value;} 
//-------------------------------------------| FkeyArbolNuevo
  public Integer getFkeyArbolNuevo(){ return fkeyArbolNuevo; } 
  public Integer getFkeyArbolNuevoNn(){ return setNotNull(fkeyArbolNuevo); } 
  public String getFkeyArbolNuevoDesc(){ return setDesc(fkeyArbolNuevo); } 
  public void setFkeyArbolNuevo(Integer value){ this.fkeyArbolNuevo=value;} 
//-------------------------------------------| FkeyOrigDato
  public Integer getFkeyOrigDato(){ return fkeyOrigDato; } 
  public Integer getFkeyOrigDatoNn(){ return setNotNull(fkeyOrigDato); } 
  public String getFkeyOrigDatoDesc(){ return setDesc(fkeyOrigDato); } 
  public void setFkeyOrigDato(Integer value){ this.fkeyOrigDato=value;} 
//-------------------------------------------| OrdeVincSist
  public Integer getOrdeVincSist(){ return ordeVincSist; } 
  public Integer getOrdeVincSistNn(){ return setNotNull(ordeVincSist); } 
  public String getOrdeVincSistDesc(){ return setDesc(ordeVincSist); } 
  public void setOrdeVincSist(Integer value){ this.ordeVincSist=value;} 
//-------------------------------------------| TipoVinculo_
  public String getTipoVinculo_(){ return tipoVinculo_; } 
  public String getTipoVinculo_Nn(){ return setNotNull(tipoVinculo_); } 
  public void setTipoVinculo_(String value){ this.tipoVinculo_=value;} 
//-------------------------------------------| NombMethExec
  public String getNombMethExec(){ return nombMethExec; } 
  public String getNombMethExecNn(){ return setNotNull(nombMethExec); } 
  public String getNombMethExecDesc(){ return setDesc(nombMethExec); } 
  public void setNombMethExec(String value){ this.nombMethExec=value;} 
//-------------------------------------------| NombVinculo_
  public String getNombVinculo_(){ return nombVinculo_; } 
  public String getNombVinculo_Nn(){ return setNotNull(nombVinculo_); } 
  public String getNombVinculo_Desc(){ return setDesc(nombVinculo_); } 
  public void setNombVinculo_(String value){ this.nombVinculo_=value;} 
  @Override
  public String toString(){ return getNombVinculo_Nn(); }; 
//-------------------------------------------| ClasPathExec
  public String getClasPathExec(){ return clasPathExec; } 
  public String getClasPathExecNn(){ return setNotNull(clasPathExec); } 
  public String getClasPathExecDesc(){ return setDesc(clasPathExec); } 
  public void setClasPathExec(String value){ this.clasPathExec=value;} 
//-------------------------------------------| AliaVinculo_
  public String getAliaVinculo_(){ return aliaVinculo_; } 
  public String getAliaVinculo_Nn(){ return setNotNull(aliaVinculo_); } 
  public String getAliaVinculo_Desc(){ return setDesc(aliaVinculo_); } 
  public void setAliaVinculo_(String value){ this.aliaVinculo_=value;} 
//-------------------------------------------| LinkVinculo_
  public String getLinkVinculo_(){ return linkVinculo_; } 
  public String getLinkVinculo_Nn(){ return setNotNull(linkVinculo_); } 
  public String getLinkVinculo_Desc(){ return setDesc(linkVinculo_); } 
  public void setLinkVinculo_(String value){ this.linkVinculo_=value;} 
//-------------------------------------------| EsunCargAuto
  public String getEsunCargAuto(){ return esunCargAuto; } 
  public String getEsunCargAutoNn(){ return setNotNull(esunCargAuto); } 
  public void setEsunCargAuto(String value){ this.esunCargAuto=value;} 
  public boolean getEsunCargAutoBool() { return esunCargAuto==null?false:esunCargAuto.equals("S");}
  public void setEsunCargAutoBool(boolean esunCargAuto) { this.esunCargAuto=esunCargAuto?"S":"N";}
//-------------------------------------------| Sub_TipoVinc
  public String getSub_TipoVinc(){ return sub_TipoVinc; } 
  public String getSub_TipoVincNn(){ return setNotNull(sub_TipoVinc); } 
  public String getSub_TipoVincDesc(){ return setDesc(sub_TipoVinc); } 
  public void setSub_TipoVinc(String value){ this.sub_TipoVinc=value;} 
//-------------------------------------------| AliaArboEjec
  public String getAliaArboEjec(){ return aliaArboEjec; } 
  public String getAliaArboEjecNn(){ return setNotNull(aliaArboEjec); } 
  public String getAliaArboEjecDesc(){ return setDesc(aliaArboEjec); } 
  public void setAliaArboEjec(String value){ this.aliaArboEjec=value;} 
//-------------------------------------------| EsunVincArbo
  public String getEsunVincArbo(){ return esunVincArbo; } 
  public String getEsunVincArboNn(){ return setNotNull(esunVincArbo); } 
  public String getEsunVincArboDesc(){ return setDesc(esunVincArbo); } 
  public void setEsunVincArbo(String value){ this.esunVincArbo=value;} 
// ---------------(RANGOS) 
  public String getTipoVinculo_Desc() { return DtoMisc.getRangeDesc(RANG_TipoVinc,getTipoVinculo_Nn()); } 
  public String getEsunCargAutoDesc() { return DtoMisc.getRangeDesc(RANG_SI_NO,getEsunCargAutoNn()); } 

//---------------------(REL: FkeyModuSistDto) 
  public MNU_ModuloSistemDto getFkeyModuSistDto() { return fkeyModuSistDto; } 
  public void setFkeyModuSistDto(MNU_ModuloSistemDto fkeyModuSistDto) {
    if ( fkeyModuSistDto != null ) { 
      this.fkeyModuSist = fkeyModuSistDto.getPkeyModuSist(); 
    }
    this.fkeyModuSistDto = fkeyModuSistDto;
  } 


  @Override 
  public MNU_VinculSistemDto copy(){
    MNU_VinculSistemDto result = new MNU_VinculSistemDto();
    result.setPkeyVinculo_( this.getPkeyVinculo_()); 
    result.setFkeyModuSist( this.getFkeyModuSist()); 
    result.setFkeyArbolNuevo( this.getFkeyArbolNuevo()); 
    result.setFkeyOrigDato( this.getFkeyOrigDato()); 
    result.setOrdeVincSist( this.getOrdeVincSist()); 
    result.setTipoVinculo_( this.getTipoVinculo_()); 
    result.setNombMethExec( this.getNombMethExec()); 
    result.setNombVinculo_( this.getNombVinculo_()); 
    result.setClasPathExec( this.getClasPathExec()); 
    result.setAliaVinculo_( this.getAliaVinculo_()); 
    result.setLinkVinculo_( this.getLinkVinculo_()); 
    result.setEsunCargAuto( this.getEsunCargAuto()); 
    result.setSub_TipoVinc( this.getSub_TipoVinc()); 
    result.setAliaArboEjec( this.getAliaArboEjec()); 
    result.setEsunVincArbo( this.getEsunVincArbo()); 
    result.setFkeyModuSistDto( this.getFkeyModuSistDto());
    return result;
  }
}

