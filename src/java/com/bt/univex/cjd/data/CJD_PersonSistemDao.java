package com.bt.univex.cjd.data;

import java.util.*; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import com.xpc.base.*; 
import com.xpc.connect.BaseConnection; 
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJD_PersonSistemDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJD_PersonSistem";
        PkeyName = "PkeyPersSist";
        DescName = "NombUsuaSist";
        CodeName = "null";
        AliasName = "PersSist";
        deepLevel = 2;
        setXPracPkeyEnti(129003);
        loadInfoEntity();
    }

    public CJD_PersonSistemDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJD_PersonSistemDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJD_PersonSistemDto getDefaultDto()  {
     CJD_PersonSistemDto dto = new CJD_PersonSistemDto(); 
     dto.setPkeyPersSist(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJD_PersonSistemDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyPersSist", "PkeyPersSist", "N",2),
        new InfoPack("FkeyLocaMuni", "Localidad", "N",3),
        new InfoPack("FkeyMuniDocu", "Lugar de Expedición", "N",3),
        new InfoPack("FkeyMunicipi", "Municipio", "N",3),
        new InfoPack("TipoUsuaSist", "Tipo de Usuario", "S",6),
        new InfoPack("NombUsuaSist", "Nombre de Usuario", "S",1),
        new InfoPack("TipoDocuUsua", "Tipo Documento", "S",6),
        new InfoPack("NumeDocuUsua", "Documento", "N",5),
        new InfoPack("OcupUsuaSist", "Ocupación", "S",6),
        new InfoPack("DireUsuaSist", "Dirección", "S",1),
        new InfoPack("BarrUsuaSist", "Barrio", "S",1),
        new InfoPack("TeleFijoUsua", "Teléfono Fijo", "N",5),
        new InfoPack("TeleCeluUsua", "Teléfono Celular", "F",12),
        new InfoPack("CorrUsuaSist", "Correo", "S",1),
        new InfoPack("EstrUsuaSist", "Estrato", "S",6),
        new InfoPack("EscoUsuaSist", "Escolaridad", "S",6),
        new InfoPack("NombContacto", "Nombre Contacto", "S",1),
        new InfoPack("ApelContacto", "Apellido Contacto", "S",1),
        new InfoPack("PareContacto", "Parentesco", "S",1),
        new InfoPack("DireContacto", "Dirección contacto", "S",1),
        new InfoPack("BarrContacto", "Barrio contacto", "S",1),
        new InfoPack("FkeyLocaCont", "Localidad contacto", "N",3),
        new InfoPack("TeleFijoCont", "Teléfono fijo contacto", "N",5),
        new InfoPack("TeleCeluCont", "Teléfono celular contacto", "F",12),
        new InfoPack("CorrElecCont", "Correo electronico contacto", "S",1)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJD_PersonSistemDto newDto = (CJD_PersonSistemDto) dto;
    if (getDeepLevel() != 0) {
      ADS_Munici_DeparDao fkeyMunicipiDao = new ADS_Munici_DeparDao(); 
      newDto.setFkeyMunicipiDto((ADS_Munici_DeparDto)fkeyMunicipiDao.findDtoByPkey(new Integer(rs.getInt("fkeyMunicipi")), getDeepLevel()-1));
      ADSVLocaliMuniciDao fkeyLocaMuniDao = new ADSVLocaliMuniciDao(); 
      newDto.setFkeyLocaMuniDto((ADSVLocaliMuniciDto)fkeyLocaMuniDao.findDtoByPkey(new Integer(rs.getInt("fkeyLocaMuni")), getDeepLevel()-1));
      ADSVMuniciDocumeDao fkeyMuniDocuDao = new ADSVMuniciDocumeDao(); 
      newDto.setFkeyMuniDocuDto((ADSVMuniciDocumeDto)fkeyMuniDocuDao.findDtoByPkey(new Integer(rs.getInt("fkeyMuniDocu")), getDeepLevel()-1));
      ADSVLocaliMuniciDao fkeyLocaContDao = new ADSVLocaliMuniciDao(); 
      newDto.setFkeyLocaContDto((ADSVLocaliMuniciDto)fkeyLocaContDao.findDtoByPkey(new Integer(rs.getInt("fkeyLocaCont")), getDeepLevel()-1));
    }
    return newDto;
  }
}

