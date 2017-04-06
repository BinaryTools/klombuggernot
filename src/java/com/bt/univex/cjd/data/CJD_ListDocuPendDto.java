package com.bt.univex.cjd.data;

import com.xpc.binarytool.univex.connect.Connect;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;

public class CJD_ListDocuPendDto extends BaseDto {
  public static final List RANG_EstaPendEntr = Arrays.asList( new Range[] { 
      new Range("S","Si"),
      new Range("N","No")});


  private Integer pkeyListDocu;
  private Integer fkeyConsSist;
  private String nombDocuPend;
  private String estaPendEntr;
  private Date fechEntrDocu;
  private String obseListDocu;

  private CJD_ConsulSistemDto fkeyConsSistDto;

  public CJD_ListDocuPendDto() { 
     PkeyEnti = 132003;
     setAliasName("ListDocu"); 
  } 

//-------------------------------------------| PkeyListDocu
  public Integer getPkeyListDocu(){ return pkeyListDocu; } 
  public Integer getPkeyListDocuNn(){ return setNotNull(pkeyListDocu); } 
  public String getPkeyListDocuDesc(){ return setDesc(pkeyListDocu); } 
  public void setPkeyListDocu(Integer value){ this.pkeyListDocu=value;} 
  @Override
  public int toInt(){ return getPkeyListDocuNn(); }; 
  @Override
  public Integer toInteger(){ return pkeyListDocu; }; 
//-------------------------------------------| FkeyConsSist
  public Integer getFkeyConsSist(){ return fkeyConsSist; } 
  public Integer getFkeyConsSistNn(){ return setNotNull(fkeyConsSist); } 
  public String getFkeyConsSistDesc(){ return setDesc(fkeyConsSist); } 
  public void setFkeyConsSist(Integer value){ this.fkeyConsSist=value;} 
//-------------------------------------------| NombDocuPend
  public String getNombDocuPend(){ return nombDocuPend; } 
  public String getNombDocuPendNn(){ return setNotNull(nombDocuPend); } 
  public String getNombDocuPendDesc(){ return setDesc(nombDocuPend); } 
  public void setNombDocuPend(String value){ this.nombDocuPend=value;} 
//-------------------------------------------| EstaPendEntr
  public String getEstaPendEntr(){ return estaPendEntr; } 
  public String getEstaPendEntrNn(){ return setNotNull(estaPendEntr); } 
  public void setEstaPendEntr(String value){ this.estaPendEntr=value;} 
  public boolean getEstaPendEntrBool() { return estaPendEntr==null?false:estaPendEntr.equals("S");}
  public void setEstaPendEntrBool(boolean estaPendEntr) { this.estaPendEntr=estaPendEntr?"S":"N";}
//-------------------------------------------| FechEntrDocu
  public Date getFechEntrDocu(){ return fechEntrDocu; } 
  public Date getFechEntrDocuNn(){ return setNotNull(fechEntrDocu); } 
  public String getFechEntrDocuDesc(){ return setDesc(fechEntrDocu); } 
  public void setFechEntrDocu(Date value){ this.fechEntrDocu=value;} 
//-------------------------------------------| ObseListDocu
  public String getObseListDocu(){ return obseListDocu; } 
  public String getObseListDocuNn(){ return setNotNull(obseListDocu); } 
  public String getObseListDocuDesc(){ return setDesc(obseListDocu); } 
  public void setObseListDocu(String value){ this.obseListDocu=value;} 
// ---------------(RANGOS) 
  public String getEstaPendEntrDesc() { return DtoMisc.getRangeDesc(RANG_EstaPendEntr,getEstaPendEntrNn()); } 

//---------------------(REL: FkeyConsSistDto) 
  public CJD_ConsulSistemDto getFkeyConsSistDto() { return fkeyConsSistDto; } 
  public void setFkeyConsSistDto(CJD_ConsulSistemDto fkeyConsSistDto) {
    if ( fkeyConsSistDto != null ) { 
      this.fkeyConsSist = fkeyConsSistDto.getPkeyConsSist(); 
    }
    this.fkeyConsSistDto = fkeyConsSistDto;
  } 


  @Override 
  public CJD_ListDocuPendDto copy(){
    CJD_ListDocuPendDto result = new CJD_ListDocuPendDto();
    result.setPkeyListDocu( this.getPkeyListDocu()); 
    result.setFkeyConsSist( this.getFkeyConsSist()); 
    result.setNombDocuPend( this.getNombDocuPend()); 
    result.setEstaPendEntr( this.getEstaPendEntr()); 
    result.setFechEntrDocu( this.getFechEntrDocu()); 
    result.setObseListDocu( this.getObseListDocu()); 
    result.setFkeyConsSistDto( this.getFkeyConsSistDto());
    return result;
  }
}

