package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.connect.BaseConnection; 
import com.xpc.utilities.*;
import com.bt.univex.cjd.data.*;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_RequisMinimoDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_RequisMinimo";
        PkeyName = "PkeyRequMini";
        DescName = "null";
        CodeName = "null";
        AliasName = "RequMini";
        deepLevel = 2;
        setXPracPkeyEnti(129703);
        loadInfoEntity();
    }

    public CJD_RequisMinimoDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_RequisMinimoDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_RequisMinimoDto getDefaultDto()  {
     CJD_RequisMinimoDto dto = new CJD_RequisMinimoDto(); 
     dto.setPkeyRequMini(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_RequisMinimoDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyRequMini", "PkeyRequMini", "N",2),
        new InfoPack("TienConsEstu", "Consultas", "S",6),
        new InfoPack("CantConsEstu", "Cantidad Consultas", "N",5),
        new InfoPack("TienProcEstu", "Procesos", "S",6),
        new InfoPack("CantProcEstu", "Cantidad Procesos", "N",5),
        new InfoPack("TienLiquEstu", "Liquidación", "S",6),
        new InfoPack("CantLiquEstu", "Cantidad Liquidaciones", "N",5),
        new InfoPack("TienTuteEstu", "Tutela", "S",6),
        new InfoPack("CantTuteEstu", "Cantidad Tutelas", "N",5),
        new InfoPack("TienDerePeti", "Derecho de Petición", "S",6),
        new InfoPack("CantDerePeti", "Cantidad Derechos de Petición", "N",5),
        new InfoPack("TienConcEstu", "Concilicación", "S",6),
        new InfoPack("CantConcEstu", "Cantidad Conciliaciones", "N",5),
        new InfoPack("TienAnalJuri", "Análisis Jurisprudencial", "S",6),
        new InfoPack("CantAnalJuri", "Cantidad Análisis Jurisprudencial", "N",5),
        new InfoPack("TipoEstudian", "Tipo Estudiante", "S",6)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_RequisMinimoDto newDto = (CJD_RequisMinimoDto) dto;
    if (getDeepLevel() != 0) {
    }
    return newDto;
  }
}

