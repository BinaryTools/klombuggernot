package com.bt.univex.not.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class NOTVDefinitivas_Dao extends BaseDao {

    private void initializeDao() { 
        TableName = "NOTVDefinitivas_";
        PkeyName = "PkeyDefiniti";
        DescName = "Descripcion";
        CodeName = "null";
        AliasName = "Definiti";
        deepLevel = 2;
        setXPracPkeyEnti(25003);
        loadInfoEntity();
    }

    public NOTVDefinitivas_Dao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public NOTVDefinitivas_Dao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static NOTVDefinitivas_Dto getDefaultDto()  {
     NOTVDefinitivas_Dto dto = new NOTVDefinitivas_Dto(); 
     dto.setPkeyDefiniti(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new NOTVDefinitivas_Dto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyDefiniti", "PkeyDefiniti", "N",2),
        new InfoPack("FkeyPeriPlan", "FkeyPeriPlan", "N",3),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FkeyAsigEstu", "FkeyAsigEstu", "N",3),
        new InfoPack("FkeyClasCali", "FkeyClasCali", "N",3),
        new InfoPack("AnnoPeriAcad", "Año del Período", "N",5),
        new InfoPack("Descripcion", "Descripción", "S",4),
        new InfoPack("NumePeriAcad", "Número del Período", "N",5),
        new InfoPack("CodiAsigEstu", "Código de la Asignatura", "S",13),
        new InfoPack("NombAsigEstu", "Nombre de la Asignatura", "S",1),
        new InfoPack("NiveDondCurs", "Nivel", "N",5),
        new InfoPack("NotaNumerica", "Nota", "F",11),
        new InfoPack("FkeyNotaRang", "FkeyNotaRang", "N",3),
        new InfoPack("EstaAproDefi", "¿Aprobada?", "S",6),
        new InfoPack("CompCursAsig", "¿Completo?", "S",6),
        new InfoPack("TipoOrigNota", "¿Origen?", "S",6),
        new InfoPack("Fue_ReviDefi", "Fue Revisada", "S",6),
        new InfoPack("FechReviDefi", "Fecha Revisión", "D",7),
        new InfoPack("NotaValoRang", "Nota Rango", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    NOTVDefinitivas_Dto newDto = (NOTVDefinitivas_Dto) dto;
    if (getDeepLevel() != 0) {
      ADS_EstudiUniverDao fkeyEstudianDao = new ADS_EstudiUniverDao(); 
      newDto.setFkeyEstudianDto((ADS_EstudiUniverDto)fkeyEstudianDao.findDtoByPkey(new Integer(rs.getInt("fkeyEstudian")), getDeepLevel()-1));
//      DEF_AsignaEstudiDao fkeyAsigEstuDao = new DEF_AsignaEstudiDao(); 
//      newDto.setFkeyAsigEstuDto((DEF_AsignaEstudiDto)fkeyAsigEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyAsigEstu")), getDeepLevel()-1));
    }
    return newDto;
  }
}

