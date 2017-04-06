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
import com.bt.univex.ads.data.* ;
import com.bt.univex.crg.data.* ;
import com.bt.univex.cjd.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_ConsulSistemDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_ConsulSistem";
        PkeyName = "PkeyConsSist";
        DescName = "NombConsSist";
        CodeName = "null";
        AliasName = "ConsSist";
        deepLevel = 2;
        setXPracPkeyEnti(129203);
        loadInfoEntity();
    }

    public CJD_ConsulSistemDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_ConsulSistemDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_ConsulSistemDto getDefaultDto()  {
     CJD_ConsulSistemDto dto = new CJD_ConsulSistemDto(); 
     dto.setPkeyConsSist(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_ConsulSistemDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyConsSist", "PkeyConsSist", "N",2),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FkeyCoorEstu", "FkeyCoorEstu", "N",3),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("FkeyDoceEspe", "FkeyDoceEspe", "N",3),
        new InfoPack("NombConsSist", "Nombre", "S",1),
        new InfoPack("DescConsSist", "Descripción", "S",4),
        new InfoPack("NumeRadiCons", "Número Radicado", "N",5),
        new InfoPack("TipoConsSist", "Tipo Consulta", "S",6),
        new InfoPack("ValoConsSist", "Valoración del coordinador", "S",4),
        new InfoPack("EstaAproCons", "Esta Activa", "S",6),
        new InfoPack("NotaConsSist", "Nota Consulta", "F",12),
        new InfoPack("AreaConsSist", "Área", "S",6),
        new InfoPack("FechConsSist", "Fecha Consulta", "D",7),
        new InfoPack("ValoDoceCons", "Valoración del docente", "S",4),
        new InfoPack("PresOtroCons", "¿Presentado en otro consultorio?", "S",6),
        new InfoPack("TienApoderad", "¿Tiene apoderado?", "S",6),
        new InfoPack("TienMenoEdad", "¿Menores de edad involucrados en el caso?", "S",6),
        new InfoPack("ProcRequisit", "Por ser requisito", "S",6),
        new InfoPack("ProcPosiSolu", "Por ser posible solución", "S",6),
        new InfoPack("ProcNoseInte", "No se Intentara", "S",6),
        new InfoPack("FechCaliCons", "Fecha de calificado", "D",7),
        new InfoPack("FechApruCoor", "Fecha aprobada", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_ConsulSistemDto newDto = (CJD_ConsulSistemDto) dto;
    if (getDeepLevel() != 0) {
      CJDVCoordiEstudiDao fkeyCoorEstuDao = new CJDVCoordiEstudiDao(); 
      newDto.setFkeyCoorEstuDto((CJDVCoordiEstudiDto)fkeyCoorEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyCoorEstu")), getDeepLevel()-1));
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
      CRG_Grupo_AsignaDao fkeyGrupAsigDao = new CRG_Grupo_AsignaDao(); 
      newDto.setFkeyGrupAsigDto((CRG_Grupo_AsignaDto)fkeyGrupAsigDao.findDtoByPkey(new Integer(rs.getInt("fkeyGrupAsig")), getDeepLevel()-1));
      CJDVDocentEspeciDao fkeyDoceEspeDao = new CJDVDocentEspeciDao(); 
      newDto.setFkeyDoceEspeDto((CJDVDocentEspeciDto)fkeyDoceEspeDao.findDtoByPkey(new Integer(rs.getInt("fkeyDoceEspe")), getDeepLevel()-1));
    }
    return newDto;
  }
}

