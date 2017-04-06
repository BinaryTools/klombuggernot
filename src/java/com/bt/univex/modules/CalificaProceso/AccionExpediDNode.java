package com.bt.univex.modules.CalificaProceso;

import com.bt.univex.cjd.data.CJD_AccionExpediDao;
import com.bt.univex.cjd.data.CJD_AccionExpediDto;
import com.bt.univex.cjd.data.CJD_AccionExpediProv;
import com.bt.univex.cjd.data.CJD_EstudiProcesDao;
import com.bt.univex.cjd.data.CJD_EstudiProcesDto;
import com.bt.univex.def.data.DEFVPeriPlanProgDao;
import com.bt.univex.def.data.DEFVPeriPlanProgDto;
import com.xpc.base.BaseDto;
import com.xpc.conditions.data.Cond;
import com.xpc.forms.TPreForm;
import com.xpc.forms.field.BaseField;
import com.xpc.forms.field.GText;
import com.xpc.forms.field.TDateField;
import com.xpc.forms.field.TEditField;
import com.xpc.forms.field.TFileAnnex;
import com.xpc.forms.field.TLookupField;
import com.xpc.forms.field.TMemoField;
import com.xpc.grid.TGrid;
import com.xpc.grid.column.ColText;
import com.xpc.grid.column.TColumn;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.ControlNode;
import com.xpc.snode.SNode;
import com.xpc.snode.finder.TGridNode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.markup.html.repeater.util.SortParam;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
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
                return accExpDto;
            }

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
//               fechacciexpeFld.setEnabled(false);
                CJD_AccionExpediDto accExpDto = (CJD_AccionExpediDto) grifo.getForm().getObject();
                Double a = accExpDto.getCaliDoceAcci();
                DEFVPeriPlanProgDao perPlaDao = new DEFVPeriPlanProgDao();
                perPlaDao.setConditions("indiacticarg = 'S' and fkeyprogacad = 565");
                DEFVPeriPlanProgDto perPlaDto = (DEFVPeriPlanProgDto) perPlaDao.findFirst();
                int periPlanAct = perPlaDto.getPkeyPeriPlan();

                if (accExpDto.getFkeyPeriPlan() == periPlanAct) {
                    if ("E".equals(accExpDto.getCreaEstuDoce())) {
                        tareacciexpeFld.setEnabled(false);
                        fechlimiacciFld.setEnabled(false);
                    } else {
                        if (accExpDto.getFechLimiAcci() != null) {
                            fechlimiacciFld.setEnabled(false);
                            tareacciexpeFld.setEnabled(false);
                        } else {
                            fechlimiacciFld.setEnabled(true);
                            tareacciexpeFld.setEnabled(true);
                        }
                    }
                    obsedoceacciFld.setEnabled(true);
                    fa.setReadOnly(true);
                } else {
                    tareacciexpeFld.setEnabled(false);
                    fechlimiacciFld.setEnabled(false);
//                    calidoceacciFld.setEnabled(false);
                    obsedoceacciFld.setEnabled(false);
                    fa.setReadOnly(true);
                }

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
//            @Override
//            protected boolean deleteRecord(AjaxRequestTarget art, BaseDto dto) {
//                return false;
//            }
        };
       
//---------------------------- CREAR GRID 
        CJD_AccionExpediProv acciexpeProv = new CJD_AccionExpediProv();
        acciexpeProv.setSort(new SortParam("fkeyperiplan", false));
        acciexpeProv.setSort(new SortParam("fechacciexpe", false));
        grifo.createGrid(genFieldsGrid(), acciexpeProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Acciones expediente");
//---------------------------- CREAR FORM 
        DEFVPeriPlanProgDao perPlaDao = new DEFVPeriPlanProgDao();
        perPlaDao.setConditions("indiacticarg = 'S' and fkeyprogacad = 565");
        DEFVPeriPlanProgDto perPlaDto = (DEFVPeriPlanProgDto) perPlaDao.findFirst();
        CJD_AccionExpediDto acciexpeDto = CJD_AccionExpediDao.getDefaultDto();
        acciexpeDto.setCreaEstuDoce("D");
        acciexpeDto.setFkeyPeriPlan(perPlaDto.getPkeyPeriPlan());
        acciexpeDto.setEstaAcciVali("S");
//        acciexpeDto.setCaliDoceAcci(-1.0);
        Date date = new Date();
        acciexpeDto.setFechAcciExpe(date);
//        acciexpeDto.setCaliDoceAcci(-1.0);
        grifo.createForm(genFieldsForm(), acciexpeDto);
        grifo.addCondGrid(new Cond("fkeyEstuProc", " = ", "EstuProcV", "pkeyEstuProc"));
        grifo.addDefaults(new Cond("fkeyEstuProc", " = ", "EstuProcV", "pkeyEstuProc"));
        grifo.getGrid().addOnTop(panelInterno());
        node.add(grifo);
         grifo.setCanDel(false);
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
        cols.add(new ColText("FechLimiAcci", "Fecha calificación", 120));
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
                            style = "background-color:#C64444";//rojo
                        } else {
                            style = "background-color:#EEE737";//amarillo
                        }
                    } else if (fechaLim.getTime() < fechaAct.getTime()) {
                        style = "background-color:#EEE737";//amarillo
                    } else {
                        style = "background-color:#C64444";//rojo
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
        cols.add(new ColText("CaliDoceAcci", "Calificación", 180) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJD_AccionExpediDto acciexpeDto = (CJD_AccionExpediDto) getChild();
                double valor = acciexpeDto.getCaliDoceAcci();
                double valofina;
                if (valor == -1.0) {
                    valofina = 0.0;
                } else {
                    valofina = acciexpeDto.getCaliDoceAcci();
                }
                Label label = new Label(id, valofina);
                parent.add(label);
                setComponent(label);//To change body of generated methods, choose Tools | Templates.
            }
        });
        cols.add(new ColText("ObseDoceAcci", "Observaciones", 200));
//        cols.add(new ColText("ObseDoceCoor", "Observaciones Docente Coordinador", 400));
//        cols.add(new ColText("EstaAcciVali","¿Acción Válida?",120)); 

        return cols;
    }
    private TDateField fechacciexpeFld;
    private TDateField fechlimiacciFld;
    private TDateField fechentracciFld;
    private TEditField calidoceacciFld;
    private TMemoField obsedoceacciFld;
    private TMemoField tareacciexpeFld;
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

        flds.add(fechlimiacciFld = new TDateField(0, 0, "FechLimiAcci", "Fecha calificación", true) {

            @Override
            public String validate(Object obj, Object value) {
                CJD_AccionExpediDto accExpDto = (CJD_AccionExpediDto) grifo.getForm().getObject();

                if (value != null) {
                    DateFormat format = new SimpleDateFormat("EEEE, MMM dd, yyyy");
                    String fechaStr = format.format((Date) value);
                    DateFormat format2 = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");
                    fechaStr += " 23:59:59 pm";
                    Date fechaD = null;
                    try {
                        fechaD = format2.parse(fechaStr);
                        accExpDto.setFechLimiAcci(fechaD);
                        return "";
                    } catch (ParseException ex) {
                        Logger.getLogger(AccionExpediDNode.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (accExpDto.getCaliDoceAcci() == null) {
                    accExpDto.setCaliDoceAcci(-1.0);
                }
                return "por favor digita aqui";
            }
        });

        flds.add(tareacciexpeFld = new TMemoField(0, 2, 2, 1, "TareAcciExpe", "Tarea", true) {
            @Override
            public String validate(Object obj, Object value) {
                CJD_AccionExpediDto axionDto = (CJD_AccionExpediDto) grifo.getForm().getObject();
                String Pkey = control.inEventSolveCondition(5, new Cond("ProcConsV", "pkeyProcCons"));
                String Pkeyestuproc = control.inEventSolveCondition(5, new Cond("EstuProcV", "pkeyEstuProc"));
                CJD_EstudiProcesDao estudiProcesDao = new CJD_EstudiProcesDao();
                estudiProcesDao.setConditions("FkeyProcCons=" + Pkey + " and pkeyestuproc =" + Integer.parseInt(Pkeyestuproc) + " and (FechEntrProc is null or fechentrproc ='') ");
                Vector vecEst = estudiProcesDao.findAll();
                int pkeyEstPro = 0;
                int pkeyProces = 0;
                String msj = "";
                if (vecEst.size() > 0) {
                    for (int i = 0; i < vecEst.size(); i++) {
                        CJD_EstudiProcesDto estudiProcesDto = (CJD_EstudiProcesDto) vecEst.get(i);
                        pkeyEstPro = estudiProcesDto.getPkeyEstuProc();
                        pkeyProces = estudiProcesDto.getFkeyProcCons();
                    }
                    axionDto.setFkeyEstuProc(pkeyEstPro);
                    axionDto.setFkeyProcCons(pkeyProces);
                } else {
                    msj = "Estudiante ya entrego el proceso, asignar acciones al estudiante activo o acercarce a la administración de consultorio jurídico e informar";
                }
                if (axionDto.getCaliDoceAcci() == null) {
                    axionDto.setCaliDoceAcci(-1.0);
                }
                return msj;
            }
        });
        flds.add(obsedoceacciFld = new TMemoField(1, 0, 2, 1, "ObseDoceAcci", "Observaciones", false));
        flds.add(fa = new TFileAnnex(2, 0, 2, 1, "pkeyAcciExpe", "Archivos Anexos", "Acciones"));
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


//       flds.add(fechentracciFld= new TDateField    (0,2,"FechEntrAcci","Fecha de Entrega",true));
//        flds.add(calidoceacciFld = new TEditField(0, 1, "CaliDoceAcci", "Calificación", false) {
//
//            @Override
//            public String validate(Object obj, Object value) {
//                Double valor = (Double) value;
//                String error = "";
//                if (valor != null) {
//
//                    if (valor < 0.0) {
//                        error = "la nota no puede ser un valor negativo";
//                    }
//                }
//
//                return error; //To change body of generated methods, choose Tools | Templates.
//            }
//
//        });



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