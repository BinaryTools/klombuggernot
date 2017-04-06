package com.bt.univex.modules.RevisarProcesosArea;

import com.bt.univex.cjd.data.*;
import com.xpc.base.BaseDto;
import com.xpc.conditions.data.Cond;
import com.xpc.forms.TPreForm;
import com.xpc.forms.field.*;
import com.xpc.grid.TGrid;
import com.xpc.grid.column.*;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.ControlNode;
import com.xpc.snode.SNode;
import com.xpc.snode.finder.TGridNode;
import java.sql.SQLException;
//import java.sql.Date;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.PropertyModel;

public class AccionExpediDNode {

//  AcciExpe
    private ControlNode control;
    private SNode node;
    private TGrifo grifo;
    private String lastInfo;
    private boolean sw;
    private String style;
    private String mensInfo;
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------

    public void createGrifo(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id, indent, parent, "Acciones expediente");
        final CJD_AccionExpediDao acciexpeDao = new CJD_AccionExpediDao();
        grifo = new TGrifo(SNode.NODE_ID, acciexpeDao) {

            @Override
            public BaseDto onNew(AjaxRequestTarget art, BaseDto inDto) {

                CJD_AccionExpediDao accExpDao = new CJD_AccionExpediDao();
                CJD_AccionExpediDto accExpDto = (CJD_AccionExpediDto) inDto;
                accExpDto.setPkeyAcciExpe(accExpDao.findSecuence("SEC_CJD_ACCIONEXPEDI"));
                return accExpDto; //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
//               fechacciexpeFld.setEnabled(false);
                CJD_AccionExpediDto accExpDto = (CJD_AccionExpediDto) grifo.getForm().getObject();
                if (accExpDto.getPkeyAcciExpe() == 0) {
                    CJD_AccionExpediDao accExpDao = new CJD_AccionExpediDao();
                    int pkAccExpe = 0;
                    try {
                        pkAccExpe = accExpDao.getSecuence("CJD_ACCIONEXPEDI");
                    } catch (SQLException ex) {
                        Logger.getLogger(AccionExpediDNode.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    accExpDto.setPkeyAcciExpe(pkAccExpe);
                }
                tareacciexpeFld.setEnabled(false);
                calidoceacciFld.setEnabled(false);
                fechlimiacciFld.setEnabled(false);
                calidoceacciFld.setEnabled(false);
                obsedoceacciFld.setEnabled(false);
                tareacciexpeFld.setEnabled(false);
                fa.setReadOnly(true);
            }

            @Override
            public void activate(AjaxRequestTarget art) {
                super.activate(art);
                if (panelInterno() == null) {
                } else {
                    mensInfo = "<li>Componente rojo: Tarea no realizada ó Tarea realizada fuera del tiempo límite</li>"
                            + "<li>Componente Amarillo: Tarea por realizar</li>"
                            + "<li>Componente Verde: Tarea realizada a tiempo ó creada por el estudiante.</li>";
                    art.add(preForm);
                }
            }

            @Override
            protected boolean deleteRecord(AjaxRequestTarget art, BaseDto dto) {
                return false;
            }
        };
        grifo.setCanDel(false);
        grifo.setCanIns(false);
//---------------------------- CREAR GRID 
        CJD_AccionExpediProv acciexpeProv = new CJD_AccionExpediProv();
        grifo.createGrid(genFieldsGrid(), acciexpeProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Acciones expediente");
//---------------------------- CREAR FORM 
        CJD_AccionExpediDto acciexpeDto = CJD_AccionExpediDao.getDefaultDto();
        acciexpeDto.setCreaEstuDoce("D");
        Date date = new Date();
        acciexpeDto.setFechAcciExpe(date);
        grifo.createForm(genFieldsForm(), acciexpeDto);
        grifo.addCondGrid(new Cond("FkeyProcCons", " = ", "EstuProcV", "FkeyProcCons"));
        grifo.addDefaults(new Cond("FkeyProcCons", " = ", "EstuProcV", "FkeyProcCons"));
        grifo.addCondGrid(new Cond("FkeyEstuProc", " = ", "EstuProcV", "PkeyEstuProc"));
        grifo.addDefaults(new Cond("FkeyEstuProc", " = ", "EstuProcV", "PkeyEstuProc"));

        grifo.getGrid().addOnTop(panelInterno());
        node.add(grifo);
        ctrl.add(node);
    }
//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
    private TGridNode gridNode;

    public void createFinder(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
        CJD_AccionExpediProv acciexpeProv = new CJD_AccionExpediProv();
        node = new SNode(id, indent, parent, "CJD_AccionExpedi");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), acciexpeProv);
        gridNode.setTitle("Acciones expediente");
//        gridNode.addCond(new Cond(""," = ","", ""));
        node.add(gridNode);
        ctrl.add(node);
    }

    ///---------------------------------| FIN
//========================================================================
// CAMPOS DE LA GRILLA 
    public ArrayList<TColumn> genFieldsGrid() {
        ArrayList<TColumn> cols = new ArrayList();
        cols.add(new ColText("CreaEstuDoce", "Creado por:", 150));
        cols.add(new ColText("FechAcciExpe", "Fecha Creado", 120));
        cols.add(new ColText("FechLimiAcci", "Fecha Límite", 120));
        cols.add(new ColText("FechEntrAcci", "Fecha de Entrega", 120) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJD_AccionExpediDto accExpDto = (CJD_AccionExpediDto) getChild();//obtiene el dto que esta pintando en ese momento
                Date fechaEnt = accExpDto.getFechEntrAcci();
                Date fechaLim = accExpDto.getFechLimiAcci();
                Date fechaAct = new Date();
                super.showData(id, parent, obj);
                String info = obj.toString();
                String pers = accExpDto.getCreaEstuDoce();
                if (fechaEnt == null) {
                    if ("D".equals(pers)) {
                        if (fechaLim.getTime() < fechaAct.getTime()) {
                            style = "background-color:#C64444";
                        } else {
                            style = "background-color:#EEE737";
                        }
                    } else if (fechaLim.getTime() < fechaAct.getTime()) {
                        style = "background-color:#EEE737";
                    } else {
                        style = "background-color:#C64444";
                    }
                } else if ("D".equals(pers) && fechaEnt.getTime() <= fechaLim.getTime()) {
                    style = "background-color:#2C9F28";
                } else if ("D".equals(pers) && fechaEnt.getTime() > fechaLim.getTime()) {
                    style = "background-color:#C64444";
                } else {
                    style = "background-color:#2C9F28";
                }
                lastInfo = info;
                parent.add(new AttributeModifier("style", style));
            }
        });
        cols.add(new ColText("TareAcciExpe", "Tareas", 400));
        cols.add(new ColText("CaliDoceAcci", "Calificación", 180));
        cols.add(new ColText("ObseDoceAcci", "Observaciones", 200));
//        cols.add(new ColText("ObseDoceCoor", "Observaciones Docente Coordinador", 400));

        return cols;
    }
    private TDateField fechacciexpeFld;
    private TDateField fechlimiacciFld;
    private TDateField fechentracciFld;
    private TEditField calidoceacciFld;
    private TMemoField obsedoceacciFld;
    private TMemoField tareacciexpeFld;
    private TMemoField obsedocecoorFld;
    private TLookupField estuprocLku;
    private TLookupField procconsLku;
    TFileAnnex fa;
    private GText contenidoPF;
    private TPreForm preForm;

    private TPreForm panelInterno() {
        ArrayList<BaseField> flds = new ArrayList();
        flds.add(contenidoPF = new GText(0, 0, new PropertyModel(this, "mensInfo"), ""));
        contenidoPF.setHtmlMode(false);
        preForm = new TPreForm(TGrid.BAR_ID, flds, 2);
        contenidoPF.setEnabled(false);
        preForm.setParentNode(grifo);
        preForm.setOutputMarkupId(true);
        preForm.initiate();
        return preForm;
    }
//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 

    public ArrayList genFieldsForm() {
        ArrayList<BaseField> flds = new ArrayList();
//       flds.add(fechacciexpeFld= new TDateField    (0,0,"FechAcciExpe","Fecha Creado",true){
//           @Override
//           public String validate(Object obj, Object value) {
//               CJD_AccionExpediDto axionDto = (CJD_AccionExpediDto) grifo.getForm().getObject();
//               String Pkey = control.inEventSolveCondition(4, new Cond("ProcCons", "pkeyProcCons"));
//               CJD_EstudiProcesDao estudiProcesDao = new CJD_EstudiProcesDao();
//               estudiProcesDao.setConditions("FkeyProcCons=" + Pkey + "and (FechEntrProc=NULL OR FechEntrProc='')");
//               CJD_EstudiProcesDto estudiProcesDto = new CJD_EstudiProcesDto();
//
//               axionDto.setFkeyEstuProc(estudiProcesDto.getPkeyEstuProc());
//               return "";
//           }
//       });
        flds.add(fechlimiacciFld = new TDateField(0, 0, "FechLimiAcci", "Fecha Límite", true));
//       flds.add(fechentracciFld= new TDateField    (0,2,"FechEntrAcci","Fecha de Entrega",true));
        flds.add(calidoceacciFld = new TEditField(0, 1, "CaliDoceAcci", "Calificación", false));
        flds.add(tareacciexpeFld = new TMemoField(0, 2, 2, 1, "TareAcciExpe", "Tarea", true));
        flds.add(obsedoceacciFld = new TMemoField(1, 0, 3, 1, "ObseDoceAcci", "Observaciones", true) {
            @Override
            public String validate(Object obj, Object value) {
                CJD_AccionExpediDto axionDto = (CJD_AccionExpediDto) grifo.getForm().getObject();
                String Pkey = control.inEventSolveCondition(5, new Cond("ProcConsV", "pkeyProcCons"));
                CJD_EstudiProcesDao estudiProcesDao = new CJD_EstudiProcesDao();
                estudiProcesDao.setConditions("FkeyProcCons=" + Pkey + " and (FechEntrProc is null or fechentrproc ='')");
                Vector vecEst = estudiProcesDao.findAll();
                int pkeyEstPro = 0;
                int pkeyProces = 0;
                for (int i = 0; i < vecEst.size(); i++) {
                    CJD_EstudiProcesDto estudiProcesDto = (CJD_EstudiProcesDto) vecEst.get(i);
                    pkeyEstPro = estudiProcesDto.getPkeyEstuProc();
                    pkeyProces = estudiProcesDto.getFkeyProcCons();
                }
                axionDto.setFkeyEstuProc(pkeyEstPro);
                axionDto.setFkeyProcCons(pkeyProces);
                return "";
            }
        });
//        flds.add(obsedocecoorFld = new TMemoField(2, 0, 3, 1, "ObseDoceCoor", "Observaciones Docente Coordinador", false));
        flds.add(fa = new TFileAnnex(2, 0, 3, 1, "pkeyAcciExpe", "Archivos Anexos", "Acciones"));
//-------------------------------------------------------- | CJD_EstudiProces
//       CJD_EstudiProcesDao estuprocDao = new CJD_EstudiProcesDao();
//       estuprocDao.setOrderBy("");
//       estuprocLku = new TLookupField(2,0,"FkeyEstuProcDto","CJD_EstudiProces",estuprocDao,true); 
////       estuprocLku.setFullLoad(true);
////       estuprocLku.addSeekField(new TField("",""));
//       flds.add(estuprocLku);
////-------------------------------------------------------- | CJD_ProcesConsul
//       CJD_ProcesConsulDao procconsDao = new CJD_ProcesConsulDao();
//       procconsDao.setOrderBy("");
//       procconsLku = new TLookupField(3,0,"FkeyProcConsDto","CJD_ProcesConsul",procconsDao,true); 
////       procconsLku.setFullLoad(true);
////       procconsLku.addSeekField(new TField("",""));
//       flds.add(procconsLku);
//        flds.add(fa = new TFileAnnex(2, 0, 3, 1, "pkeyAcciExpe", "Archivos Anexos", "Acciones"));

        return flds;
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

    public void setGrifo(TGrifo grifo) {
        this.grifo = grifo;
    }

    public TGridNode getGridNode() {
        return gridNode;
    }

    public void setGridNode(TGridNode gridNode) {
        this.gridNode = gridNode;
    }

    public TDateField getFechacciexpeFld() {
        return fechacciexpeFld;
    }

    public void setFechacciexpeFld(TDateField fechacciexpeFld) {
        this.fechacciexpeFld = fechacciexpeFld;
    }

    public TDateField getFechlimiacciFld() {
        return fechlimiacciFld;
    }

    public void setFechlimiacciFld(TDateField fechlimiacciFld) {
        this.fechlimiacciFld = fechlimiacciFld;
    }

    public TDateField getFechentracciFld() {
        return fechentracciFld;
    }

    public void setFechentracciFld(TDateField fechentracciFld) {
        this.fechentracciFld = fechentracciFld;
    }

    public TEditField getCalidoceacciFld() {
        return calidoceacciFld;
    }

    public void setCalidoceacciFld(TEditField calidoceacciFld) {
        this.calidoceacciFld = calidoceacciFld;
    }

    public TMemoField getObsedoceacciFld() {
        return obsedoceacciFld;
    }

    public void setObsedoceacciFld(TMemoField obsedoceacciFld) {
        this.obsedoceacciFld = obsedoceacciFld;
    }

    public TLookupField getEstuprocLku() {
        return estuprocLku;
    }

    public void setEstuprocLku(TLookupField estuprocLku) {
        this.estuprocLku = estuprocLku;
    }

    public TLookupField getProcconsLku() {
        return procconsLku;
    }

    public void setProcconsLku(TLookupField procconsLku) {
        this.procconsLku = procconsLku;
    }

    public TFileAnnex getFa() {
        return fa;
    }

    public void setFa(TFileAnnex fa) {
        this.fa = fa;
    }
}
