package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_ContIngrEstuDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_ContIngrEstu";
        PkeyName = "PkeyContIngr";
        DescName = "null";
        CodeName = "null";
        AliasName = "ConIngEst";
        deepLevel = 2;
        setXPracPkeyEnti(228603);
        loadInfoEntity();
    }

    public CJD_ContIngrEstuDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_ContIngrEstuDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_ContIngrEstuDto getDefaultDto()  {
     CJD_ContIngrEstuDto dto = new CJD_ContIngrEstuDto(); 
     dto.setPkeyContIngr(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_ContIngrEstuDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyContIngr", "PkeyContIngr", "N",2),
        new InfoPack("FkeyConsSist", "FkeyConsSist", "N",3),
        new InfoPack("FechHaceModi", "Fecha Acceso Consulta", "D",7),
        new InfoPack("DescModiEstu", "Descripción", "S",4),
        new InfoPack("FechCreaRegi", "Fecha Registro", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_ContIngrEstuDto newDto = (CJD_ContIngrEstuDto) dto;
    if (getDeepLevel() != 0) {
      CJDVConsulSistemDao fkeyConsSistDao = new CJDVConsulSistemDao(); 
      newDto.setFkeyConsSistDto((CJDVConsulSistemDto)fkeyConsSistDao.findDtoByPkey(new Integer(rs.getInt("fkeyConsSist")), getDeepLevel()-1));
    }
    return newDto;
  }
}

