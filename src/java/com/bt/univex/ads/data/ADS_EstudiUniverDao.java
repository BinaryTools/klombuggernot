package com.bt.univex.ads.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.xpc.binarytool.univex.connect.Connect;

public class ADS_EstudiUniverDao extends BaseDao {

    private void initializeDao() { 
        TableName = "ADS_EstudiUniver";
        PkeyName = "PkeyEstudian";
        DescName = "Descripcion";
        CodeName = "CodiEstudian";
        AliasName = "Estudian";
        deepLevel = 2;
        setXPracPkeyEnti(8303);
        loadInfoEntity();
    }

    public ADS_EstudiUniverDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public ADS_EstudiUniverDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static ADS_EstudiUniverDto getDefaultDto()  {
     ADS_EstudiUniverDto dto = new ADS_EstudiUniverDto(); 
     dto.setPkeyEstudian(0);
     dto.setNiveEstudian( new Integer(1));
     dto.setEstaClavAcce("C");
     dto.setEstaActiEstu("S");
     dto.setEstaAcadEstu("N");
     dto.setJornBaseEstu("D");
     dto.setEstaNiveEstu("S");
     dto.setTipoIngrEstu("N");
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new ADS_EstudiUniverDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyEstudian", "PkeyEstudian", "N",2),
        new InfoPack("FkeyProgAcad", "FkeyProgAcad", "N",3),
        new InfoPack("FkeyHojaVida", "FkeyHojaVida", "N",3),
        new InfoPack("FkeyInscripc", "FkeyInscripc", "N",3),
        new InfoPack("FkeyCasLiqMa", "FkeyCasLiqMa", "N",3),
        new InfoPack("FkeyPlanEstu", "FkeyPlanEstu", "N",3),
        new InfoPack("FkeyPeriAcad", "FkeyPeriAcad", "N",3),
        new InfoPack("CodiEstudian", "Código", "S",1),
        new InfoPack("NombEstudian", "Nombres", "S",1),
        new InfoPack("ApelEstudian", "Apellido", "S",1),
        new InfoPack("SeguApelEstu", "Segundo Apellido", "S",1),
        new InfoPack("NiveEstudian", "Nivel Mínimo Actual", "N",5),
        new InfoPack("LogiAcceSist", "Login", "S",1),
        new InfoPack("ClavAcceSist", "Clave", "S",1),
        new InfoPack("EstaClavAcce", "Estado clave", "S",6),
        new InfoPack("EstaActiEstu", "¿Está Activo?", "S",6),
        new InfoPack("EstaAcadEstu", "Estado Académico", "S",6),
        new InfoPack("JornBaseEstu", "Jornada", "S",6),
        new InfoPack("EstaNiveEstu", "¿Nivelado?", "S",6),
        new InfoPack("TipoIngrEstu", "Tipo Ingreso", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    ADS_EstudiUniverDto newDto = (ADS_EstudiUniverDto) dto;
    if (getDeepLevel() != 0) {
      ADS_PrograAcademDao fkeyProgAcadDao = new ADS_PrograAcademDao(); 
      newDto.setFkeyProgAcadDto((ADS_PrograAcademDto)fkeyProgAcadDao.findDtoByPkey(new Integer(rs.getInt("fkeyProgAcad")), getDeepLevel()-1));
    }
    return newDto;
  }
}

