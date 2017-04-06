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
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;
import com.bt.univex.ads.data.* ;
import com.xpc.binarytool.univex.connect.Connect;

public class CJDVConsulSistemDao extends BaseDao {

    private void initializeDao() { 
        TableName = "CJDVConsulSistem";
        PkeyName = "PkeyConsSist";
        DescName = "null";
        CodeName = "null";
        AliasName = "ConsSistV";
        deepLevel = 2;
        setXPracPkeyEnti(130003);
        loadInfoEntity();
    }

    public CJDVConsulSistemDao(BaseConnection connect) {
        super();
        initializeDao();
        this.setDataConnect(connect);
    }

    public CJDVConsulSistemDao() {
        super();
        initializeDao();
        this.setDataConnect(new Connect());
    }

  public static CJDVConsulSistemDto getDefaultDto()  {
     CJDVConsulSistemDto dto = new CJDVConsulSistemDto(); 
     dto.setPkeyConsSist(0);
     return dto;
  }

    @Override
    public BaseDto getBasicDto() {
        return new CJDVConsulSistemDto();
    }

//-------------------------------------------------------- INFO DTo
    @Override
    public void loadInfoEntity() {
        infoFields = new ArrayList(Arrays.asList(new InfoPack[]{
        new InfoPack("PkeyConsSist", "PkeyConsSist", "N",2),
        new InfoPack("PkeyPersCons", "PkeyPersCons", "N",2),
        new InfoPack("FkeyPersSist", "FkeyPersSist", "N",3),
        new InfoPack("FkeyMunicipi", "FkeyMunicipi", "N",3),
        new InfoPack("FkeyLocaMuni", "FkeyLocaMuni", "N",3),
        new InfoPack("FkeyCoorEstu", "FkeyCoorEstu", "N",3),
        new InfoPack("FkeyEstudian", "FkeyEstudian", "N",3),
        new InfoPack("FkeyGrupAsig", "FkeyGrupAsig", "N",3),
        new InfoPack("FkeyDoceEspe", "FkeyDoceEspe", "N",3),
        new InfoPack("FkeyMuniDocu", "FkeyMuniDocu", "N",3),
        new InfoPack("TipoUsuaSist", "Tipo de Usuario", "S",6),
        new InfoPack("NombUsuaSist", "Nombre o Razón Social", "S",1),
        new InfoPack("TipoDocuUsua", "Tipo Documento", "S",6),
        new InfoPack("NombConsSist", "Nombre", "S",1),
        new InfoPack("NumeDocuUsua", "Documento", "N",5),
        new InfoPack("DescConsSist", "Descripción", "S",4),
        new InfoPack("OcupUsuaSist", "Ocupación", "S",6),
        new InfoPack("DireUsuaSist", "Dirección", "S",1),
        new InfoPack("NumeRadiCons", "Número Radicado", "N",5),
        new InfoPack("BarrUsuaSist", "Barrio", "S",1),
        new InfoPack("TipoConsSist", "Tipo Consulta", "S",6),
        new InfoPack("AreaConsSist", "Área", "S",6),
        new InfoPack("FechConsSist", "Fecha Consulta", "D",7),
        new InfoPack("ValoConsSist", "Valoración del coordinador", "S",4),
        new InfoPack("EstaAproCons", "¿Esta aprobada?", "S",6),
        new InfoPack("TeleFijoUsua", "Teléfono Fijo", "N",5),
        new InfoPack("TeleCeluUsua", "Teléfono Celular", "F",12),
        new InfoPack("FechApruCoor", "Fecha aprobada", "D",7),
        new InfoPack("NotaConsSist", "Nota Consulta", "F",12),
        new InfoPack("CorrUsuaSist", "Correo", "S",1),
        new InfoPack("EstrUsuaSist", "Estrato", "S",6),
        new InfoPack("EscoUsuaSist", "Escolaridad", "S",6),
        new InfoPack("ValoDoceCons", "Valoración del docente", "S",4),
        new InfoPack("NombContacto", "Nombre Contacto", "S",1),
        new InfoPack("ApelContacto", "Apellido Contacto", "S",1),
        new InfoPack("PareContacto", "Parentesco Contacto", "S",1),
        new InfoPack("DireContacto", "Dirección Contacto", "S",1),
        new InfoPack("BarrContacto", "Barrio Contacto", "S",1),
        new InfoPack("TeleFijoCont", "Teléfono Fijo Contacto", "N",5),
        new InfoPack("TeleCeluCont", "Celular Contacto", "F",12),
        new InfoPack("CorrElecCont", "Correo Contacto", "S",1),
        new InfoPack("FkeyLocaCont", "FkeyLocaCont", "N",3),
        new InfoPack("NombCompProf", "Docente", "S",1),
        new InfoPack("PresOtroCons", "¿Presentado en otro consultorio?", "S",6),
        new InfoPack("TienApoderad", "¿Tiene apoderado?", "S",6),
        new InfoPack("TienMenoEdad", "¿Menores de edad involucrados en el caso?", "S",6),
        new InfoPack("ProcRequisit", "Por ser requisito", "S",6),
        new InfoPack("ProcPosiSolu", "Por ser posible solución", "S",6),
        new InfoPack("ProcNoseInte", "No se Intentara", "S",6),
        new InfoPack("FechCaliCons", "Fecha de calificado", "D",7),
        new InfoPack("FechApruCoor", "Fecha aprobación coordinador", "D",7)      }
        ));
    }

  @Override
  public BaseDto userLoadDto(BaseDto dto,ResultSet rs )  throws SQLException {
    CJDVConsulSistemDto newDto = (CJDVConsulSistemDto) dto;
    if (getDeepLevel() != 0) {
      CJDVCoordiEstudiDao fkeyCoorEstuDao = new CJDVCoordiEstudiDao(); 
      newDto.setFkeyCoorEstuDto((CJDVCoordiEstudiDto)fkeyCoorEstuDao.findDtoByPkey(new Integer(rs.getInt("fkeyCoorEstu")), getDeepLevel()-1));
      ADS_Munici_DeparDao fkeyMunicipiDao = new ADS_Munici_DeparDao(); 
      newDto.setFkeyMunicipiDto((ADS_Munici_DeparDto)fkeyMunicipiDao.findDtoByPkey(new Integer(rs.getInt("fkeyMunicipi")), getDeepLevel()-1));
      ADSVLocaliMuniciDao fkeyLocaContDao = new ADSVLocaliMuniciDao(); 
      newDto.setFkeyLocaContDto((ADSVLocaliMuniciDto)fkeyLocaContDao.findDtoByPkey(new Integer(rs.getInt("fkeyLocaCont")), getDeepLevel()-1));
      ADSVMuniciDocumeDao fkeyMuniDocuDao = new ADSVMuniciDocumeDao(); 
      newDto.setFkeyMuniDocuDto((ADSVMuniciDocumeDto)fkeyMuniDocuDao.findDtoByPkey(new Integer(rs.getInt("fkeyMuniDocu")), getDeepLevel()-1));
      ADSVLocaliMuniciDao fkeyLocaMuniDao = new ADSVLocaliMuniciDao(); 
      newDto.setFkeyLocaMuniDto((ADSVLocaliMuniciDto)fkeyLocaMuniDao.findDtoByPkey(new Integer(rs.getInt("fkeyLocaMuni")), getDeepLevel()-1));
    }
    return newDto;
  }
}

