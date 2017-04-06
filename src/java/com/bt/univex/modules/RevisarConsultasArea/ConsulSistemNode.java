package com.bt.univex.modules.RevisarConsultasArea;

import com.bt.univex.ads.data.ADSVLocaliMuniciDao;
import com.bt.univex.ads.data.ADSVMuniciDocumeDao;
import com.bt.univex.ads.data.ADS_EstudiUniverDao;
import com.bt.univex.ads.data.ADS_EstudiUniverDto;
import com.bt.univex.ads.data.ADS_Munici_DeparDao;
import com.bt.univex.cjd.data.*;
import com.xpc.app.BinarySession;
import com.xpc.base.BaseDto;
import com.xpc.base.data.TField;
import com.xpc.forms.field.*;
import com.xpc.grid.column.*;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.ControlNode;
import com.xpc.snode.SNode;
import com.xpc.snode.finder.TGridNode;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;


public class ConsulSistemNode  {

//  CJDVConsulSistem

   private ControlNode control;
   private SNode node; 
   private TGrifo grifo; 
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------
   String PkeyDoce;
   String PkeyPeri;
   int pkeyDoceEspe;
   String area;
   
   public void createGrifo(int id,int indent,int parent,final ControlNode ctrl) {
//---------------encontrando pkeyDoceEspe del docente que se loguea-----------------------
       BinarySession session = (BinarySession) ctrl.getSession();
       PkeyDoce = session.getParameter("DOCENTE");
       PkeyPeri = session.getParameter("PERIODO");
       CJD_DocentEspeciDao doceDao = new CJD_DocentEspeciDao();
       doceDao.setConditions("fkeyProfesor = " + PkeyDoce);
       CJD_DocentEspeciDto doceDto = (CJD_DocentEspeciDto) doceDao.findFirst();
       if (doceDto != null) {
           pkeyDoceEspe = doceDto.getPkeyDoceEspe();
           area=doceDto.getDoceEspecial();
       } else {
           pkeyDoceEspe = 0;
           area="";
       }
//----------------------------------------------------------------------------------------
       control = ctrl;
       final CJDVConsulSistemDto consulsistemDto = CJDVConsulSistemDao.getDefaultDto();
       consulsistemDto.setTipoUsuaSist("P");
//---------------------------- CREAR NODE 
       node = new SNode(id, indent, parent, "Consultas");
       final CJDVConsulSistemDao cjdvconsulsistemDao = new CJDVConsulSistemDao();
       grifo = new TGrifo(SNode.NODE_ID, cjdvconsulsistemDao) {
           @Override
           public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
               CJDVConsulSistemDto consDto = (CJDVConsulSistemDto) inDto;
               if (consDto.getPkeyConsSist() != 0) {
                   adverten2 = "";
                   adverten3 = "";
                   ADS_EstudiUniverDao estuDao = new ADS_EstudiUniverDao();
                   ADS_EstudiUniverDto estuDto = (ADS_EstudiUniverDto) estuDao.findByPkey(consDto.getFkeyEstudian());
                   adverten2 = "Estudiante que generó la consulta: " + estuDto.toString();
                   
                   if (consDto.getFkeyCoorEstu() != 0) {
                       CJDVCoordiEstudiDao coorDao = new CJDVCoordiEstudiDao();
                       coorDao.setConditions("pkeyCoorEstu = " + consDto.getFkeyCoorEstu());
                       CJDVCoordiEstudiDto coorDto = (CJDVCoordiEstudiDto) coorDao.findFirst();
                       if (coorDto != null) {
                           estuDto = (ADS_EstudiUniverDto) estuDao.findByPkey(coorDto.getFkeyEstuDian());
                           adverten3 = "  \nEstudiante coordinador a cargo de esta consulta: " + estuDto.toString();
                       } else {
                           adverten3 = "  \nEl estudiante coordinador asignado a esta consulta fue eliminado de la lista de estudiantes coordinadores.";
                       }
                   } else {
                       adverten3 = "\nCoordinador a cargo de esta consulta: Sin asignar";
                   }

                   if (consDto.getFkeyDoceEspe() != 0) {
                       CJDVDocentEspeciDao docEspDao = new CJDVDocentEspeciDao();
                       docEspDao.setConditions("pkeyDoceEspe = " + consDto.getFkeyDoceEspe());
                       CJDVDocentEspeciDto docEspDto = (CJDVDocentEspeciDto) docEspDao.findFirst();
                       if (docEspDto != null) {
                           adverten3 += "Docente a cargo de esta consulta: " + docEspDto.getNombCompProf();
                       } else {
                           adverten3 += "  \nEl docente asignado a esta consulta fue eliminado de la lista de docentes asesores.";
                       }
                   } else {
                       adverten3 += "\n Docente a cargo de esta consulta: Sin asignar";
                   }

                   valoDoceBefo = consDto.getValoDoceCons();

                   if (consDto.getTipoConsSist().equals("C")) {
                       procrequisitFld.setVisible(true);
                       procposisoluFld.setVisible(true);
                       procnoseinteFld.setVisible(true);
                       text3.setVisible(true);

                   } else {
                       procrequisitFld.setVisible(false);
                       procposisoluFld.setVisible(false);
                       procnoseinteFld.setVisible(false);
                       text3.setVisible(false);
                   }
               }

               procrequisitFld.setEnabled(false);
               procposisoluFld.setEnabled(false);
               procnoseinteFld.setEnabled(false);
               
               valoconssistFld.setEnabled(false);
               valodoceconsFld.setEnabled(false);
               notaconssistFld.setEnabled(false);
//               tipousuasistFld.setEnabled(false);
               numeradiconsFld.setEnabled(false);
               presotroconsFld.setEnabled(false);
               tienapoderadFld.setEnabled(false);
               tienmenoedadFld.setEnabled(false);
               nombusuasistFld.setEnabled(false);
               tipodocuusuaFld.setEnabled(false);
               nombconssistFld.setEnabled(false);
               numedocuusuaFld.setEnabled(false);
               descconssistFld.setEnabled(false);
               fechconssistFld.setEnabled(false);
               ocupusuasistFld.setEnabled(false);
               direusuasistFld.setEnabled(false);
               barrusuasistFld.setEnabled(false);
               tipoconssistFld.setEnabled(false);
               telefijousuaFld.setEnabled(false);
               teleceluusuaFld.setEnabled(false);
               corrusuasistFld.setEnabled(false);
               estrusuasistFld.setEnabled(false);
               escousuasistFld.setEnabled(false);
               locamunivLku.setEnabled(false);
               munidocuLku.setEnabled(false);
               munidepaLku.setEnabled(false);
//               coorestuvLku.setEnabled(false);
               areaconssistFld.setEnabled(false);
                    
               locacontvLku.setEnabled(false);
               nombcontactoFld.setEnabled(false);
               apelcontactoFld.setEnabled(false);
               parecontactoFld.setEnabled(false);
               direcontactoFld.setEnabled(false);
               barrcontactoFld.setEnabled(false);
               telefijocontFld.setEnabled(false);
               telecelucontFld.setEnabled(false);
               correleccontFld.setEnabled(false);
           }

           @Override
           public boolean update(AjaxRequestTarget art, BaseDto inDto) {
               CJDVConsulSistemDto consSistVDto = (CJDVConsulSistemDto) inDto;
               CJD_ConsulSistemDto consSistDto = new CJD_ConsulSistemDto();
               CJD_ConsulSistemDao consSistDao = new CJD_ConsulSistemDao();

               consSistDto.setPkeyConsSist(consSistVDto.getPkeyConsSist());
               consSistDto.setFkeyEstudian(consSistVDto.getFkeyEstudian());
               consSistDto.setFkeyCoorEstu(consSistVDto.getFkeyCoorEstu());
               consSistDto.setFkeyGrupAsig(consSistVDto.getFkeyGrupAsig());
               
               consSistDto.setFkeyDoceEspe(consSistVDto.getFkeyDoceEspe());
               consSistDto.setNombConsSist(consSistVDto.getNombConsSist());
               consSistDto.setDescConsSist(consSistVDto.getDescConsSist());
               consSistDto.setNumeRadiCons(consSistVDto.getNumeRadiCons());
               consSistDto.setTipoConsSist(consSistVDto.getTipoConsSist());
               consSistDto.setAreaConsSist(consSistVDto.getAreaConsSist());
               consSistDto.setFechConsSist(consSistVDto.getFechConsSist());
               consSistDto.setValoConsSist(consSistVDto.getValoConsSist());
               consSistDto.setValoDoceCons(consSistVDto.getValoDoceCons());
               consSistDto.setEstaAproCons(consSistVDto.getEstaAproCons());
               consSistDto.setNotaConsSist(consSistVDto.getNotaConsSist());
               consSistDto.setPresOtroCons(consSistVDto.getPresOtroCons());
               consSistDto.setTienApoderad(consSistVDto.getTienApoderad());
               consSistDto.setTienMenoEdad(consSistVDto.getTienMenoEdad());
               consSistDto.setProcRequisit(consSistVDto.getProcRequisit());
               consSistDto.setProcPosiSolu(consSistVDto.getProcPosiSolu());
               consSistDto.setProcNoseInte(consSistVDto.getProcNoseInte());

               try {
                   consSistDao.update(consSistDto);
                   return true;
               } catch (SQLException ex) {
                   Logger.getLogger(ConsulSistemNode.class.getName()).log(Level.SEVERE, null, ex);
                   return false;
               }
           }
       };
       
       grifo.setCanIns(false);
       grifo.setCanDel(false);
//---------------------------- CREAR GRID 
       CJDVConsulSistemProv cjdvconsulsistemProv = new CJDVConsulSistemProv();
       
       if (pkeyDoceEspe != 0) {//si es diferente de cero muestra las consultas asociadas, de lo contrario no muestra ninguna consulta 
           cjdvconsulsistemProv.getDao().setConditions("AreaConsSist='"+area+"' and EstaAproCons = 'S' "
                   + " and fkeygrupasig in"
                   + "(select pkeyGrupAsig from crg_grupo_Asigna where fkeyPeriPlan in"
                   + "(select pkeyPeriPlan from DEFVPeriPlanProg where indiActiNota = 'S'))");
       }else{
           cjdvconsulsistemProv.getDao().setConditions("pkeyConsSist = 0 and EstaAproCons = 'S'"
                   + " and fkeygrupasig in"
                   + "(select pkeyGrupAsig from crg_grupo_Asigna where fkeyPeriPlan in"
                   + "(select pkeyPeriPlan from DEFVPeriPlanProg where indiActiNota = 'S'))");
       }
       grifo.createGrid(genFieldsGrid(), cjdvconsulsistemProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
       grifo.setTitle("Agregar Consulta");
//---------------------------- CREAR FORM 
       grifo.createForm(genFieldsForm(), consulsistemDto);
//        grifo.addCondGrid(new Cond(""," = ","", ""));
//        grifo.addDefaults(new Cond(""," = ","", ""));
       node.add(grifo);
       ctrl.add(node);   
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
   private TGridNode gridNode;
   public void createFinder(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
        CJDVConsulSistemProv cjdvconsulsistemProv = new CJDVConsulSistemProv();
        node = new SNode(id,indent,parent, "CJDVConsulSistem");
        gridNode = new TGridNode(SNode.NODE_ID,genFieldsGrid(),cjdvconsulsistemProv);
        gridNode.setTitle("CJDVConsulSistem");
//        gridNode.addCond(new Cond(""," = ","", ""));
        node.add(gridNode);
        ctrl.add(node);   
    }

 ///---------------------------------| FIN

//========================================================================
// CAMPOS DE LA GRILLA 
   public ArrayList<TColumn> genFieldsGrid() { 
       ArrayList<TColumn> cols = new ArrayList(); 
       cols.add(new ColReport("Reporte", 100) {
            public String onRegister(BaseDto dto) {
                return "http://reportes.umng.edu.co:8080/openreports/executeReport.action?reportId=417057&userName=PlanXprc43&Inicio=" + dto.toInteger()+"&password=uvxfhx21&displayInline=true&exportType=0";
            }
        });
      cols.add(new ColText("NumeRadiCons", "Número Radicado", 200));
       cols.add(new ColText("NombConsSist", "Nombre", 200));
//        cols.add(new ColText("ValoConsSist", "Valoración", 400));
       cols.add(new ColText("EstaAproCons", "¿Aprobada?", 120));
       cols.add(new ColText("NotaConsSist", "Nota Consulta", 200));
       cols.add(new ColText("FechConsSist", "Estado", 200) {
           @Override
           public void showData(String id, WebMarkupContainer parent, Object obj) {
               final CJDVConsulSistemDto dto = (CJDVConsulSistemDto) getChild();
// super.showData(id, parent, obj);
               String sinicio = null, cadena = "", style = "";

               if (obj != null) {
                   sinicio = obj.toString();
                   Date dinicio = null, dfinal = null;
                   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                   try {
                       // PARSEO STRING A DATE
                       dinicio = sdf.parse(sinicio);

                       Calendar calendar = Calendar.getInstance();
                       calendar.setTime(dinicio); // Configuramos la fecha que se recibe
                       calendar.add(Calendar.DAY_OF_YEAR, 7);  // número de días a añadir, o restar en caso de días<0

                       dfinal = calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
//                       sfinal = sdf.format(dfinal);
//                       
//                       cadena += sfinal;

                       if (dto.getNotaConsSist() == 0) {

                           Calendar cal1 = Calendar.getInstance();
                           Calendar cal2 = Calendar.getInstance();
                           cal1.setTime(new Date());
                           cal2.setTime(dfinal);

                           long milis1 = cal1.getTimeInMillis();
                           long milis2 = cal2.getTimeInMillis();
                           milis1 = milis1 / (24 * 60 * 60 * 1000);
                           milis2 = milis2 / (24 * 60 * 60 * 1000);
                           // calcular la diferencia en milisengundos
                           long diff = milis2 - milis1;
                           if (diff > -1) {
                               // calcular la diferencia en dias
//                               long diffDays = diff / (24 * 60 * 60 * 1000);
//                               cadena += " - Quedan " + diffDays + " días";
                               diff += 1;
                               cadena += "Plazo: " + diff + " días";
                               style = "background-color:#CBC966";
                           } else {
                               cadena += "Plazo vencido";
                               style = "background-color:#AD4751";
                           }
                       } else {
                           cadena += "Calificado";
//                           style = "background-color:#FFFFFF";
                           style = "background-color:#47AD5F";
                       }
                   } catch (ParseException e) {
                       System.out.println("Se ha producido un error en el parseo");
                   }

               } else {
                   cadena = "-";
               }

               Label label = new Label(id, cadena);
//               TLinkAsPanel verLnk = new TLinkAsPanel(id, text) {
//                   @Override
//                   public void onClick(AjaxRequestTarget art) {
//                       grifo.editRecord(art, dto);
//                   }
//               };
//               parent.add(verLnk);
//               setComponent(verLnk);
               parent.add(label);
               parent.add(new AttributeModifier("style", style));
               setComponent(label);
//               if ("R".equals(dto.getApelContacto())) {
//                   parent.add(new AttributeModifier("style", "font-weight:bold"));
//               }
           }
       });

       cols.add(new ColText("FechConsSist", "Fecha de la consulta", 200));
       cols.add(new ColText("FechConsSist", "Fecha límite", 200) {
           @Override
           public void showData(String id, WebMarkupContainer parent, Object obj) {
               final CJDVConsulSistemDto dto = (CJDVConsulSistemDto) getChild();
// super.showData(id, parent, obj);
               String sinicio = null, sfinal = null, cadena = "";

               if (obj != null) {
                   sinicio = obj.toString();
                   Date dinicio = null, dfinal = null;
                   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                   try {
                       // PARSEO STRING A DATE
                       dinicio = sdf.parse(sinicio);

                       Calendar calendar = Calendar.getInstance();
                       calendar.setTime(dinicio); // Configuramos la fecha que se recibe
                       calendar.add(Calendar.DAY_OF_YEAR, 7);  // número de días a añadir, o restar en caso de días<0

                       dfinal = calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
                       sfinal = sdf.format(dfinal);

                       cadena += sfinal;
                   } catch (ParseException e) {
                       System.out.println("Se ha producido un error en el parseo");
                   }
               } else {
                   cadena = "-";
               }

               Label label = new Label(id, cadena);
               parent.add(label);
               setComponent(label);
           }
       });
       cols.add(new ColText("FechCaliCons", "Fecha de la nota", 100) {
           @Override
           public void showData(String id, WebMarkupContainer parent, Object obj) {
               CJDVConsulSistemDto consVDto = (CJDVConsulSistemDto) getChild();
               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
               SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
               String strFecha = " ";
               String strHora = " ";
               if (consVDto.getFechCaliCons() != null) {
                   strFecha = sdf.format(consVDto.getFechCaliCons());
                   strHora = sdf2.format(consVDto.getFechCaliCons());
               }
               Label label = new Label(id, strFecha + " - " + strHora);
               parent.add(label);
               setComponent(label);
           }
       });
       cols.add(new ColText("TipoConsSist", "Tipo Consulta", 120));
       cols.add(new ColText("DescConsSist", "Descripción", 400));
//       cols.add(new ColText("TipoUsuaSist","Tipo de Usuario",120)); 
       cols.add(new ColText("NombUsuaSist", "Usuario", 200));
       cols.add(new ColText("TipoDocuUsua", "Tipo Documento", 120));
       cols.add(new ColText("NumeDocuUsua", "Documento", 200));
       cols.add(new ColText("NombCompProf", "Docente", 200));
//       cols.add(new ColText("LugaExpeDocu","Lugar Expedición",200)); 
//       cols.add(new ColText("OcupUsuaSist","Ocupación",200)); 
//       cols.add(new ColText("DireUsuaSist","Dirección",200)); 
//       cols.add(new ColText("BarrUsuaSist","Barrio",200)); 
//       cols.add(new ColText("LocaUsuaSist","Localidad",200)); 
//       cols.add(new ColText("TeleFijoUsua","Teléfono Fijo",200)); 
//       cols.add(new ColText("TeleCeluUsua","Teléfono Celular",200)); 
//       cols.add(new ColText("CorrUsuaSist","Correo",200)); 
//       cols.add(new ColText("EstrUsuaSist","Estrato",120)); 
//       cols.add(new ColText("EscoUsuaSist","Escolaridad",120)); 
       return cols; 
   }

//   private TStaticField tipousuasistFld;
   private TEditField nombusuasistFld;
   private TStaticField tipodocuusuaFld;
   private TEditField nombconssistFld;
   private TEditField numedocuusuaFld;
//   private TEditField lugaexpedocuFld;
   private TMemoField descconssistFld;
   private TStaticField ocupusuasistFld;
   private TEditField direusuasistFld;
   private TEditField numeradiconsFld;
   private TEditField barrusuasistFld;
   private TStaticField tipoconssistFld;
   private TMemoField valoconssistFld;
   private TMemoField valodoceconsFld;
    private TDateField fechconssistFld;
    private TEditField nombcontactoFld;
    private TEditField apelcontactoFld;
    private TEditField parecontactoFld;
    private TEditField direcontactoFld;
    private TEditField barrcontactoFld;
    private TEditField telefijocontFld;
    private TEditField telecelucontFld;
    private TEditField correleccontFld;
    private TCheckField presotroconsFld;
    private TCheckField tienapoderadFld;
    private TCheckField tienmenoedadFld;
    private TCheckField procrequisitFld;
    private TCheckField procposisoluFld;
    private TCheckField procnoseinteFld;
//   private TEditField locausuasistFld;
   private TCheckField estaaproconsFld;
   private TEditField telefijousuaFld;
   private TEditField teleceluusuaFld;
   private TEditField notaconssistFld;
   private TEditField corrusuasistFld;
   private TStaticField estrusuasistFld;
   private TStaticField escousuasistFld;
   private TLookupField munidepaLku;
   private TLookupField munidocuLku;
   private TLookupField locamunivLku;
    private TLookupField locacontvLku;
//   private TLookupField coorestuvLku;
   private TStaticField areaconssistFld;
   ADS_Munici_DeparDao muniDepaDao;
   ADSVMuniciDocumeDao munidocuDao;
   ADSVLocaliMuniciDao locamunivDao,locamuniv2Dao;
   private CJD_PersonSistemDto personDto;
    private GText text3, text4, text5, text6;
    private String adverten2 = ""
            ,adverten3 = ""
            ,dato1="¿RESULTA NECESARIO AGOTAR EL REQUISITO DE PROCEDIBILIDAD(CONCILIACIÓN)?"
            ,dato2="USUARIO Y CONTACTO"
            ,valoCoorBefo
            ,valoDoceBefo;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
   public ArrayList genFieldsForm() { 
       ArrayList<BaseField> flds = new ArrayList(); 
       flds.add(nombconssistFld= new TEditField    (0,0,"NombConsSist","Nombre",true));
       flds.add(tipoconssistFld= new TStaticField  (0,1,"TipoConsSist","Tipo Consulta",CJDVConsulSistemDto.RANG_TipoConsSist,true));
       flds.add(areaconssistFld= new TStaticField  (0,2,"AreaConsSist","Área",CJDVConsulSistemDto.RANG_AreaConsSist,true));
       flds.add(numeradiconsFld= new TEditField    (0,3,"NumeRadiCons","Número Radicado",true));
       flds.add(descconssistFld= new TMemoField    (1,0,2,1,"DescConsSist","Descripción",true));
        
       flds.add(fechconssistFld = new TDateField(1, 2, "FechConsSist", "Fecha Consulta", true));
       flds.add(text5 = new GText(1, 3, new PropertyModel(this, "adverten2")));
       flds.add(presotroconsFld = new TCheckField(2, 0, "PresOtroCons", "¿Presentado en otro consultorio?", false));
       flds.add(tienapoderadFld = new TCheckField(2, 1, "TienApoderad", "¿Tiene apoderado?", false));
       flds.add(tienmenoedadFld = new TCheckField(2, 2, "TienMenoEdad", "¿Menores de edad involucrados en el caso?", false));
       flds.add(text6 = new GText(2, 3, new PropertyModel(this, "adverten3")));
       flds.add(text3 = new GText(3, 0, 3, 1, new PropertyModel(this, "dato1")));
       flds.add(procrequisitFld = new TCheckField(4, 0, "ProcRequisit", "Por ser requisito", false));
       flds.add(procposisoluFld = new TCheckField(4, 1, "ProcPosiSolu", "Por ser posible solución", false));
       flds.add(procnoseinteFld = new TCheckField(4, 2, "ProcNoseInte", "No se intentara", false));
       flds.add(text4 = new GText(5, 0, 3, 1, new PropertyModel(this, "dato2")));

       flds.add(nombusuasistFld= new TEditField    (6,0,2,1,"NombUsuaSist","Nombre Usuario",false));
//       flds.add(tipousuasistFld= new TStaticField  (2,2,"TipoUsuaSist","Tipo Persona",CJDVConsulSistemDto.RANG_TipoUsuaSist,true));
       flds.add(tipodocuusuaFld= new TStaticField  (6,2,"TipoDocuUsua","Tipo Documento",CJDVConsulSistemDto.RANG_TipoDocuUsua,true));
       flds.add(numedocuusuaFld= new TEditField    (7,0,"NumeDocuUsua","Documento",true));
       flds.add(barrusuasistFld= new TEditField    (7,2,"BarrUsuaSist","Barrio",true));
//       flds.add(locausuasistFld= new TEditField    (3,3,"LocaUsuaSist","Localidad",true));
       flds.add(direusuasistFld= new TEditField    (8,0,"DireUsuaSist","Dirección",true));
       flds.add(telefijousuaFld= new TEditField    (8,1,"TeleFijoUsua","Teléfono Fijo",true));
       flds.add(teleceluusuaFld= new TEditField    (8,2,"TeleCeluUsua","Teléfono Celular",true));
       flds.add(estrusuasistFld= new TStaticField  (8,3,"EstrUsuaSist","Estrato",CJDVConsulSistemDto.RANG_EstrUsuaSist,true));
       flds.add(escousuasistFld= new TStaticField  (9,0,"EscoUsuaSist","Escolaridad",CJDVConsulSistemDto.RANG_EscoUsuaSist,true));
        flds.add(ocupusuasistFld = new TStaticField(9, 1, "OcupUsuaSist", "Ocupación", CJDVConsulSistemDto.RANG_OcupUsuaSist, true));
       flds.add(corrusuasistFld = new TEditField(9, 3, "CorrUsuaSist", "Correo", true));
        flds.add(nombcontactoFld = new TEditField(10, 0, "NombContacto", "Nombre Contacto", false));
       flds.add(apelcontactoFld = new TEditField(10, 1, "ApelContacto", "Apellido Contacto", true));
       flds.add(parecontactoFld = new TEditField(10, 2, "PareContacto", "Parentesco Contacto", true));
       flds.add(direcontactoFld = new TEditField(11, 0, "DireContacto", "Dirección Contacto", true));
       flds.add(barrcontactoFld = new TEditField(11, 1, "BarrContacto", "Barrio Contacto", true));
       flds.add(telefijocontFld = new TEditField(12, 0, "TeleFijoCont", "Teléfono Fijo Contacto", true));
       flds.add(telecelucontFld = new TEditField(12, 1, "TeleCeluCont", "Celular Contacto", true));
       flds.add(correleccontFld= new TEditField(12,2,"CorrElecCont","Correo Contacto",true));
       flds.add(valoconssistFld = new TMemoField(13, 0, 3, 1, "ValoConsSist", "Valoración del estudiante coordinador", false));
       flds.add(notaconssistFld = new TEditField(14, 0, "NotaConsSist", "Nota Consulta", true));
       flds.add(valodoceconsFld = new TMemoField(14, 1, 3, 1, "ValoDoceCons", "Valoración del docente encargado.", false){
            @Override
            public String validate(Object obj, Object value) {
                CJDVConsulSistemDto consDto = (CJDVConsulSistemDto) obj;
                String valoDoceBefo2 = valoDoceBefo;
                String valoDoceAfte = (String) value;
                if (valoDoceAfte != null) {
                    if (!valoDoceAfte.equals(valoDoceBefo2)) {
                        Date fecha = new Date();
                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");
                        format.format(fecha);
                        valoDoceAfte = format.format(fecha) + "\n" + valoDoceAfte;
                        consDto.setValoDoceCons(valoDoceAfte);
                    }
                }
                return "";
            }
        });
       
       muniDepaDao = new ADS_Munici_DeparDao();
//       muniDepaDao.setOrderBy("");
       munidepaLku = new TLookupField(9,2,"fkeyMunicipiDto","Municipio",muniDepaDao,true);
       munidepaLku.setFullLoad(true);
//       munidepaLku.addSeekField(new TField("nombMunicipi","Buscar por nombre"));
       flds.add(munidepaLku);
       //-------------------------------------------------------- | ADSVMuniciDocume
       munidocuDao = new ADSVMuniciDocumeDao();
       munidocuDao.setOrderBy("");
       munidocuLku = new TLookupField(7,1,"FkeyMuniDocuDto","Lugar de Expedición",munidocuDao,true);
       munidocuLku.setFullLoad(true);
//       munidocuLku.addSeekField(new TField("nombMunicipi","Buscar por nombre"));
       flds.add(munidocuLku);
//-------------------------------------------------------- | ADSVLocaliMunici
       locamunivDao = new ADSVLocaliMuniciDao();
       locamunivDao.setOrderBy("");
       locamunivLku = new TLookupField(7,3,"FkeyLocaMuniDto","Localidad",locamunivDao,true);
       locamunivLku.setFullLoad(true);
//       locamunivLku.addSeekField(new TField("nombMunicipi","Buscar por nombre"));
       flds.add(locamunivLku);
//-------------------------------------------------------- | ADSVLocaliMunici2
       locamuniv2Dao = new ADSVLocaliMuniciDao();
       locamuniv2Dao.setOrderBy("");
       locacontvLku = new TLookupField(11,2,"FkeyLocaContDto","Localidad contacto",locamuniv2Dao,true); 
       locacontvLku.setFullLoad(true);
       locacontvLku.addSeekField(new TField("nombMunicipi","Buscar por nombre"));
       flds.add(locacontvLku);
//-------------------------------------------------------- | CJDVCoordiEstudi
//       CJDVCoordiEstudiDao coorestuvDao = new CJDVCoordiEstudiDao();
////       coorestuvDao.setOrderBy("");
//       coorestuvLku = new TLookupField(1,2,"FkeyCoorEstuDto","Estudiante Coordinador",coorestuvDao,true);
//       coorestuvLku.setFullLoad(true);
////       coorestuvLku.setSeekFields(new ArrayList(Arrays.asList(
////               new TField("nombEstudian","Buscar por nombre"),
////               new TField("codiEstudian","Buscar por código"))));
//       flds.add(coorestuvLku);
//       CJD_PersonSistemDao personDao = new CJD_PersonSistemDao();
//       personaLku = new GLookup(2, 0, 2, 1, new PropertyModel(this, "personDto"), "Si la persona ya está en el sistema, búsquela aquí", personDao, false);
//       personaLku.setFullLoad(true);
//       personaLku.addSeekField(new TField("numeDocuUsua","Buscar por el documento"));
//       flds.add(personaLku);
       
       return flds; 
   }


}

