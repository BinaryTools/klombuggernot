package com.bt.univex.modules.RevisarProcesosArea;

import com.bt.univex.modules.CalificaProceso.*;
import com.bt.univex.ads.data.ADSVLocaliMuniciDao;
import com.bt.univex.ads.data.ADSVMuniciDocumeDao;
import com.bt.univex.ads.data.ADS_Munici_DeparDao;
import com.bt.univex.cjd.data.*;
import com.bt.univex.def.data.DEFVPeriPlanProgDao;
import com.bt.univex.def.data.DEFVPeriPlanProgDto;
import com.xpc.app.BinarySession;
import com.xpc.base.BaseDto;
import com.xpc.base.data.TField;
import com.xpc.forms.field.*;
import com.xpc.grid.column.*;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.ControlNode;
import com.xpc.snode.SNode;
import com.xpc.snode.finder.TGridNode;
import java.util.*;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.model.PropertyModel;

public class ProcesConsulDNode {

//  CJDVProcesConsul
    private ControlNode control;
    private SNode node;
    private TGrifo grifo;
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------String PkeyDoce;
    String PkeyDoce;
    String PkeyPeri;
    int pkeyDoceEspe;
    String area;

    public void createGrifo(int id, int indent, int parent, final ControlNode ctrl) {
        //---------------encontrando pkeyDoceEspe del docente que se loguea-----------------------
        BinarySession session = (BinarySession) ctrl.getSession();
        PkeyDoce = session.getParameter("DOCENTE");
        PkeyPeri = session.getParameter("PERIODO");
        CJD_DocentEspeciDao doceDao = new CJD_DocentEspeciDao();
        doceDao.setConditions("fkeyProfesor = " + PkeyDoce);
        CJD_DocentEspeciDto doceDto = (CJD_DocentEspeciDto) doceDao.findFirst();
        if (doceDto != null) {
            pkeyDoceEspe = doceDto.getPkeyDoceEspe();
        } else {
            pkeyDoceEspe = 0;
        }
//----------------------------------------------------------------------------------------
        control = ctrl;
//        final CJDVProcesConsulDto procesConsulDto= CJDVProcesConsulDao.getDefaultDto();
//---------------------------- CREAR NODE 
        node = new SNode(id, indent, parent, "Procesos");
        final CJDVProcesConsulDao cjdvprocesconsulDao = new CJDVProcesConsulDao();
        grifo = new TGrifo(SNode.NODE_ID, cjdvprocesconsulDao);

//---------------------------- CREAR GRID 
        CJDVProcesConsulProv cjdvprocesconsulProv = new CJDVProcesConsulProv();
        grifo.createGrid(genFieldsGrid(), cjdvprocesconsulProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Calificación de los procesos");
//---------------------------- CREAR FORM 
        CJDVProcesConsulDto cjdvprocesconsulDto = CJDVProcesConsulDao.getDefaultDto();

//        cjdvprocesconsulDto.setEstaProcesos("E");
//        cjdvprocesconsulDto.setTipoUsuaSist("P");
        grifo.createForm(genFieldsForm(), cjdvprocesconsulDto);
//        grifo.addCondGrid(new Cond(""," = ","", ""));
//        grifo.addDefaults(new Cond(""," = ","", ""));
//        grifo.getGrid().addOnTop(panelInterno());
        node.add(grifo);
        ctrl.add(node);
    }
//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
    private TGridNode gridNode; 

    public void createFinder(int id, int indent, int parent, final ControlNode ctrl) {

        BinarySession session = (BinarySession) ctrl.getSession();
        PkeyDoce = session.getParameter("DOCENTE");
        PkeyPeri = session.getParameter("PERIODO");
        CJD_DocentEspeciDao doceDao = new CJD_DocentEspeciDao();
        doceDao.setConditions("fkeyProfesor = " + PkeyDoce + " and docentCoordi='S'");
        CJD_DocentEspeciDto doceDto = (CJD_DocentEspeciDto) doceDao.findFirst();
        if (doceDto != null) {//El docente logueado es docente coordinador?
            area = doceDto.getDoceEspecial();
            pkeyDoceEspe = doceDto.getPkeyDoceEspe();
        } else {
            pkeyDoceEspe = 0;
        }
        control = ctrl;
        CJDVProcesConsulProv cjdvprocesconsulProv = new CJDVProcesConsulProv();
        if (pkeyDoceEspe != 0) {//si es diferente de cero muestra las procesos de su área, de lo contrario no muestra ningun proceso 
            cjdvprocesconsulProv.getDao().setConditions("areaProcesos = '" + area + "'");
        } else {
            cjdvprocesconsulProv.getDao().setConditions("pkeyProcCons = 0");
        }

        node = new SNode(id, indent, parent, "Procesos");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), cjdvprocesconsulProv);
        gridNode.setTitle("Revisar procesos");
        gridNode.setCanIns(false);
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
//            public String onRegister(BaseDto dto) {
//
////                CJDVProcesConsulDao proConDao = new CJDVProcesConsulDao();
////                proConDao.setConditions("PkeyProcCons=" + dto.toInteger());
////                CJDVProcesConsulDto procConsDto = (CJDVProcesConsulDto) proConDao.findFirst();
////                CJD_EstudiProcesDao estProDao = new CJD_EstudiProcesDao();
////                int fkEstu;
////                if (procConsDto.getEstaProcesos().equals("F")) {//valida si el proceso ya finalizo 
////                    estProDao.setConditions("fkeyProcCons=" + dto.toInteger());
////                    estProDao.setOrderBy("fechAsigProc  desc");
////                    CJD_EstudiProcesDto estProDto = (CJD_EstudiProcesDto) estProDao.findFirst();
////                    fkEstu = estProDto.getFkeyEstudian();//asigna la fkey el ultimo estiduante a cargo del proceso
////                } else {// si el proceso no esta finalizado
////                    estProDao.setConditions("fkeyProcCons=" + dto.toInteger() + " AND   fechEntrProc is null");
////                    CJD_EstudiProcesDto estProDto = (CJD_EstudiProcesDto) estProDao.findFirst();
////                    if (estProDto == null) {
////                        estProDao = null;
////                        estProDao = new CJD_EstudiProcesDao();
////                        estProDao.setConditions("fkeyProcCons=" + dto.toInteger());
////                        estProDao.setOrderBy("fechAsigProc  desc");
////                        estProDto = (CJD_EstudiProcesDto) estProDao.findFirst();//asigna la fkey el ultimo estiduante a cargo del proceso
////                        fkEstu = estProDto.getFkeyEstudian();//asigna la fkey del estudiante que tiene a cargo el procesoen estos momentos
////                    }else{
////                        fkEstu = estProDto.getFkeyEstudian();//asigna la fkey del estudiante que tiene a cargo el procesoen estos momentos
////                    }
////                }
////                DEFVPeriPlanProgDao pppDao = new DEFVPeriPlanProgDao();
////                pppDao.setConditions("FkeyProgAcad in (select FkeyProgAcad from ads_estudiUniver where pkeyestudian=" + fkEstu + " AND EstaActiEstu='S') and estaActiPeri='S' and indiactinota='S'");
////                DEFVPeriPlanProgDto pppDto = (DEFVPeriPlanProgDto) pppDao.findFirst();
//////                return "";            
////                return "http://reportes.umng.edu.co:8080/openreports/executeReport.action?reportId=416794&userName=PlanXprc43&Inicio=" + dto.toInteger()+"&PkeyPeriPlan="+ pppDto.getPkeyPeriPlan() +"&password=uvxfhx21&displayInline=true&exportType=0";
////
////            }
//        }
        });
        cols.add(new ColText("NombProcesos", "Nombre Proceso", 200));
        cols.add(new ColText("AreaProcesos", "Área Proceso", 200));
        cols.add(new ColText("DescProcesos", "Descripción Proceso", 400));
        cols.add(new ColText("NumeCasoProc", "Número caso", 200));
        cols.add(new ColText("EstaProcesos", "Estado Proceso", 120));
        cols.add(new ColText("OrigProcCons", "Origen del proceso", 200));
//        cols.add(new ColText("NombCompProf", "Docente Asignado", 200));
        return cols;
    }
    private TEditField nombprocesosFld;
    private TStaticField AreaProcesosFLD;
    private TMemoField descprocesosFld;
    private TEditField numecasoprocFld;
    private TStaticField estaprocesosFld;
    private TDateField fechrelaprocFld;
    private TStaticField tipousuasistFld;
    private TEditField nombusuasistFld;
    private TStaticField tipodocuusuaFld;
    private TEditField numedocuusuaFld;
//   private TEditField lugaexpedocuFld;
    private TEditField ocupusuasistFld;
    private TEditField direusuasistFld;
    private TEditField barrusuasistFld;
//   private TEditField locausuasistFld;
    private TEditField telefijousuaFld;
    private TEditField teleceluusuaFld;
    private TEditField corrusuasistFld;
    private TStaticField estrusuasistFld;
    private TStaticField escousuasistFld;
    private TStaticField origProcConsFld;
    private TEditField nombcompprofFld;
    private TLookupField municipiLku;
    private TLookupField munidocuLku;
    private TLookupField locamunivLku;
    private TLookupField doceespeLku;
    private GLookup personaLku;
    private TButton personaBtn;
    private CJD_PersonSistemDto personDto;
    ADS_Munici_DeparDao municipiDao;
    ADSVLocaliMuniciDao locamunivDao;
    ADSVMuniciDocumeDao munidocuDao;
    private GText text2;
    String adverten;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
    public ArrayList genFieldsForm() {
        ArrayList<BaseField> flds = new ArrayList();
        flds.add(nombprocesosFld = new TEditField(0, 0, "NombProcesos", "Nombre Proceso", true));
        flds.add(descprocesosFld = new TMemoField(0, 1, "DescProcesos", "Descripción Proceso", false));
        flds.add(numecasoprocFld = new TEditField(0, 2, "NumeCasoProc", "Número caso", true));
        flds.add(origProcConsFld = new TStaticField(0, 3, "OrigProcCons", "Origen del proceso", CJDVProcesConsulDto.RANG_OrigProcCons, true));
        flds.add(AreaProcesosFLD = new TStaticField(1, 0, "AreaProcesos", "Area Proceso", CJDVProcesConsulDto.RANG_AreaProcesos, true));
        flds.add(estaprocesosFld = new TStaticField(1, 1, "EstaProcesos", "Estado Proceso", CJDVProcesConsulDto.RANG_EstaProcesos, false));
        

//       CJD_DocentEspeciDao doceespeDao = new CJD_DocentEspeciDao();
//       doceespeDao.setOrderBy("");
//       doceespeLku = new TLookupField(5,3,"FkeyDoceEspeDto","Docente asignado",doceespeDao,true); 
//       doceespeLku.setFullLoad(true);
//       doceespeLku.addSeekField(new TField("",""));
//       flds.add(doceespeLku);
        return flds;
    }

    public TStaticField getTipousuasistFld() {
        return tipousuasistFld;
    }

    public void setTipousuasistFld(TStaticField tipousuasistFld) {
        this.tipousuasistFld = tipousuasistFld;
    }

    public TStaticField getAreaProcesosFLD() {
        return AreaProcesosFLD;
    }

    public void setAreaProcesosFLD(TStaticField AreaProcesosFLD) {
        this.AreaProcesosFLD = AreaProcesosFLD;
    }

    public TLookupField getMunicipiLku() {
        return municipiLku;
    }

    public void setMunicipiLku(TLookupField municipiLku) {
        this.municipiLku = municipiLku;
    }

    public ControlNode getControl() {
        return control;
    }

    public void setControl(ControlNode control) {
        this.control = control;
    }

    public SNode getNode() {
        return node;
    }

    public void setNode(SNode node) {
        this.node = node;
    }

    public TGrifo getGrifo() {
        return grifo;
    }

    public TEditField getNombcompprofFld() {
        return nombcompprofFld;
    }

    public void setNombcompprofFld(TEditField nombcompprofFld) {
        this.nombcompprofFld = nombcompprofFld;
    }

    public void setGrifo(TGrifo grifo) {
        this.grifo = grifo;
    }

    public TGridNode getGridNode() {
        return gridNode;
    }

    public void setGridNode(TGridNode gridNode) {
        this.gridNode = gridNode;
    }

    public TEditField getNombprocesosFld() {
        return nombprocesosFld;
    }

    public void setNombprocesosFld(TEditField nombprocesosFld) {
        this.nombprocesosFld = nombprocesosFld;
    }

    public TMemoField getDescprocesosFld() {
        return descprocesosFld;
    }

    public void setDescprocesosFld(TMemoField descprocesosFld) {
        this.descprocesosFld = descprocesosFld;
    }

    public TEditField getNumecasoprocFld() {
        return numecasoprocFld;
    }

    public void setNumecasoprocFld(TEditField numecasoprocFld) {
        this.numecasoprocFld = numecasoprocFld;
    }

    public TStaticField getEstaprocesosFld() {
        return estaprocesosFld;
    }

    public void setEstaprocesosFld(TStaticField estaprocesosFld) {
        this.estaprocesosFld = estaprocesosFld;
    }

    public TDateField getFechrelaprocFld() {
        return fechrelaprocFld;
    }

    public void setFechrelaprocFld(TDateField fechrelaprocFld) {
        this.fechrelaprocFld = fechrelaprocFld;
    }

    public TEditField getNombusuasistFld() {
        return nombusuasistFld;
    }

    public void setNombusuasistFld(TEditField nombusuasistFld) {
        this.nombusuasistFld = nombusuasistFld;
    }

    public TStaticField getTipodocuusuaFld() {
        return tipodocuusuaFld;
    }

    public void setTipodocuusuaFld(TStaticField tipodocuusuaFld) {
        this.tipodocuusuaFld = tipodocuusuaFld;
    }

    public TEditField getNumedocuusuaFld() {
        return numedocuusuaFld;
    }

    public void setNumedocuusuaFld(TEditField numedocuusuaFld) {
        this.numedocuusuaFld = numedocuusuaFld;
    }

    public TEditField getOcupusuasistFld() {
        return ocupusuasistFld;
    }

    public void setOcupusuasistFld(TEditField ocupusuasistFld) {
        this.ocupusuasistFld = ocupusuasistFld;
    }

    public TEditField getDireusuasistFld() {
        return direusuasistFld;
    }

    public void setDireusuasistFld(TEditField direusuasistFld) {
        this.direusuasistFld = direusuasistFld;
    }

    public TEditField getBarrusuasistFld() {
        return barrusuasistFld;
    }

    public void setBarrusuasistFld(TEditField barrusuasistFld) {
        this.barrusuasistFld = barrusuasistFld;
    }

    public TEditField getTelefijousuaFld() {
        return telefijousuaFld;
    }

    public void setTelefijousuaFld(TEditField telefijousuaFld) {
        this.telefijousuaFld = telefijousuaFld;
    }

    public TEditField getTeleceluusuaFld() {
        return teleceluusuaFld;
    }

    public void setTeleceluusuaFld(TEditField teleceluusuaFld) {
        this.teleceluusuaFld = teleceluusuaFld;
    }

    public TEditField getCorrusuasistFld() {
        return corrusuasistFld;
    }

    public void setCorrusuasistFld(TEditField corrusuasistFld) {
        this.corrusuasistFld = corrusuasistFld;
    }

    public TStaticField getEstrusuasistFld() {
        return estrusuasistFld;
    }

    public void setEstrusuasistFld(TStaticField estrusuasistFld) {
        this.estrusuasistFld = estrusuasistFld;
    }

    public TStaticField getEscousuasistFld() {
        return escousuasistFld;
    }

    public void setEscousuasistFld(TStaticField escousuasistFld) {
        this.escousuasistFld = escousuasistFld;
    }

    public TStaticField getOrigProcConsFld() {
        return origProcConsFld;
    }

    public void setOrigProcConsFld(TStaticField origProcConsFld) {
        this.origProcConsFld = origProcConsFld;
    }

    public TLookupField getMunidocuLku() {
        return munidocuLku;
    }

    public void setMunidocuLku(TLookupField munidocuLku) {
        this.munidocuLku = munidocuLku;
    }

    public TLookupField getLocamunivLku() {
        return locamunivLku;
    }

    public void setLocamunivLku(TLookupField locamunivLku) {
        this.locamunivLku = locamunivLku;
    }

    public TLookupField getDoceespeLku() {
        return doceespeLku;
    }

    public void setDoceespeLku(TLookupField doceespeLku) {
        this.doceespeLku = doceespeLku;
    }

    public CJD_PersonSistemDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(CJD_PersonSistemDto personDto) {
        this.personDto = personDto;
    }

    public GLookup getPersonaLku() {
        return personaLku;
    }

    public void setPersonaLku(GLookup personaLku) {
        this.personaLku = personaLku;
    }

    public TButton getPersonaBtn() {
        return personaBtn;
    }

    public void setPersonaBtn(TButton personaBtn) {
        this.personaBtn = personaBtn;
    }

    public ADS_Munici_DeparDao getMunicipiDao() {
        return municipiDao;
    }

    public void setMunicipiDao(ADS_Munici_DeparDao municipiDao) {
        this.municipiDao = municipiDao;
    }

    public ADSVLocaliMuniciDao getLocamunivDao() {
        return locamunivDao;
    }

    public void setLocamunivDao(ADSVLocaliMuniciDao locamunivDao) {
        this.locamunivDao = locamunivDao;
    }

    public ADSVMuniciDocumeDao getMunidocuDao() {
        return munidocuDao;
    }

    public void setMunidocuDao(ADSVMuniciDocumeDao munidocuDao) {
        this.munidocuDao = munidocuDao;
    }
}
