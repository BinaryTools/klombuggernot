package com.bt.univex.modules.CalificarConsultas;

import java.util.*;
import com.xpc.forms.field.*;
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.*;
import com.xpc.base.BaseDto;
import com.xpc.conditions.data.Cond;
import com.xpc.forms.TPreForm;
import com.xpc.grid.TGrid;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.PropertyModel;

public class AccionConsulNode {

//  AcciCons
    private ControlNode control;
    private SNode node;
    private TGrifo grifo;

    private String lastInfo;
    private String mensInfo;
    private String style;
    private int cantidad;
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------

    public void createGrifo(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id, indent, parent, "Calificación consulta");
        final CJD_AccionConsulDao acciconsDao = new CJD_AccionConsulDao();
        grifo = new TGrifo(SNode.NODE_ID, acciconsDao) {

            @Override
            public BaseDto onNew(AjaxRequestTarget art, BaseDto inDto) {
                CJD_AccionConsulDao accConDao = new CJD_AccionConsulDao();
                CJD_AccionConsulDto accConDto = (CJD_AccionConsulDto) inDto;
                accConDto.setPkeyAcciCons(accConDao.findSecuence("SEC_CJD_AccionConsul"));
                accConDto.setCreaEstuDoce("D");
                accConDto.setCaliDoceAcci(null);
                accConDto.setObseDoceCoor("Observación");
                accConDto.setFechAcciCons(new Date());
                return accConDto;
            }

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
//               fechacciexpeFld.setEnabled(false);
                CJD_AccionConsulDto accConsDto = (CJD_AccionConsulDto) grifo.getForm().getObject();
//                if ("E".equals(accConsDto.getCreaEstuDoce())) {
//                    obsedoceacciFld.setEnabled(false);
//                } else {
//                    obsedoceacciFld.setEnabled(true);
//                }

                if (accConsDto.getCaliDoceAcci() != null) {
                    if (accConsDto.getCaliDoceAcci() > 0) {
                        calidoceacciFld.setEnabled(false);
                    } else {
                        calidoceacciFld.setEnabled(true);
                    }
                } else {
                    calidoceacciFld.setEnabled(true);
                }

                if (accConsDto.getCreaEstuDoce().equals("D")) {
                    calidoceacciFld.setVisible(true);
                } else {
                    calidoceacciFld.setEnabled(false);
                }

                fa.setReadOnly(true);
            }

            @Override
            public void activate(AjaxRequestTarget art) {
                super.activate(art);
                String pkey = control.inEventSolveCondition(4, new Cond("ConsSistV", "pkeyConsSist"));
                CJD_AccionConsulDao acciConsDao = new CJD_AccionConsulDao();
                acciConsDao.setConditions("fkeyConsSist =" + pkey + " and creaEstuDoce = 'D'");
                if (acciConsDao.size() >= 2) {
                    this.setCanIns(false);
                } else {
                    this.setCanIns(true);
                }

                if (panelInterno() == null) {
                } else {
                    mensInfo = "<li>Componente Rojo: Tarea no realizada y/o Tarea realizada fuera del tiempo límite.</li>"
                            + "<li>Componente Amarillo: Tarea por realizar.</li>"
                            + "<li>Componente Verde: Tarea realizada a tiempo y/o creada por el estudiante.</li>";
                    art.add(preForm);
                }
                art.add(grifo.getGrid());
            }

            @Override
            protected boolean deleteRecord(AjaxRequestTarget art, BaseDto dto) {
                CJD_AccionConsulDao accConDao = new CJD_AccionConsulDao();
                CJD_AccionConsulDto accConDto = (CJD_AccionConsulDto) dto;
                String person = accConDto.getCreaEstuDoce();
                if ("D".equals(person)) {
                    this.setCanIns(true);
                }

                accConDao.delete(accConDto.getPkeyAcciCons());
                String pkey = control.inEventSolveCondition(node, new Cond("ConsSistV", "pkeyConsSist"));
                actualizarNota(pkey, accConDao);

                art.add(grifo.getGrid());
                return true;

            }

            @Override
            public boolean insert(AjaxRequestTarget art, BaseDto inDto) {
                CJD_AccionConsulDao acciDao = new CJD_AccionConsulDao();
                CJD_AccionConsulDto acciDto = (CJD_AccionConsulDto) inDto;
                String pkey = control.inEventSolveCondition(node, new Cond("ConsSistV", "pkeyConsSist"));

                if (acciDto.getFechEntrAcci() == null) {
                    if (acciDto.getCaliDoceAcci() != null) {
                        if (acciDto.getCaliDoceAcci() > 0) {
                            acciDto.setFechEntrAcci(new Date());
                        }
                    }
                }

                acciDao.insertDto(inDto);
                actualizarNota(pkey, acciDao);

                CJD_AccionConsulDao acciConsDao = new CJD_AccionConsulDao();
                acciConsDao.setConditions("fkeyConsSist =" + pkey + " and creaEstuDoce = 'D'");
                if (acciConsDao.size() >= 2) {
                    grifo.setCanIns(false);
                } else {
                    grifo.setCanIns(true);
                }

                art.add(grifo.getGrid());
                return true;
            }

            @Override
            public boolean update(AjaxRequestTarget art, BaseDto inDto) {
                CJD_AccionConsulDao acciDao = new CJD_AccionConsulDao();
                CJD_AccionConsulDto acciDto = (CJD_AccionConsulDto) inDto;
                String pkey = control.inEventSolveCondition(node, new Cond("ConsSistV", "pkeyConsSist"));

                if (acciDto.getFechEntrAcci() == null) {
                    if (acciDto.getCaliDoceAcci() > 0) {
                        acciDto.setFechEntrAcci(new Date());
                    }
                }

                acciDao.updateDto(inDto);
                actualizarNota(pkey, acciDao);
                art.add(grifo.getGrid());
                return true;
            }
        };
//        grifo.setCanDel(false);
//        grifo.setCanIns(false);
//---------------------------- CREAR GRID 
        CJD_AccionConsulProv acciconsProv = new CJD_AccionConsulProv();
        grifo.createGrid(genFieldsGrid(), acciconsProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Calificación consulta");
//---------------------------- CREAR FORM 
        CJD_AccionConsulDto acciconsDto = CJD_AccionConsulDao.getDefaultDto();
        grifo.createForm(genFieldsForm(), acciconsDto);
        grifo.addCondGrid(new Cond("fkeyConsSist", " = ", "ConsSistV", "pkeyConsSist"));
        grifo.addDefaults(new Cond("fkeyConsSist", " = ", "ConsSistV", "pkeyConsSist"));
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
        CJD_AccionConsulProv acciconsProv = new CJD_AccionConsulProv();
        node = new SNode(id, indent, parent, "CJD_AccionConsul");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), acciconsProv);
        gridNode.setTitle("CJD_AccionConsul");
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
        cols.add(new ColText("FechAcciCons", "Fecha Creado", 120));
        cols.add(new ColText("FechLimiAcci", "Fecha Límite", 120));
        cols.add(new ColText("FechEntrAcci", "Fecha de calificado", 120) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJD_AccionConsulDto accConDto = (CJD_AccionConsulDto) getChild();//obtiene el dto que esta pintando en ese momento
                Date fechaEnt = accConDto.getFechEntrAcci();
                Date fechaLim = accConDto.getFechLimiAcci();
                Date fechaAct = new Date();
                super.showData(id, parent, obj);
                String info = accConDto.getCreaEstuDoce();
                if (fechaEnt == null) {
                    if ("D".equals(info)) {
                        if (fechaLim.getTime() < fechaAct.getTime()) {
                            style = "background-color:#C64444";//rojo
                        } else {
                            style = "background-color:#EEE737";//amarillo
                        }
                    }
                } else if ("D".equals(info) && fechaEnt.getTime() <= fechaLim.getTime()) {
                    style = "background-color:#2C9F28";
                } else if ("D".equals(info) && fechaEnt.getTime() > fechaLim.getTime()) {
                    style = "background-color:#C64444";
                } else {
                    style = "background-color:#2C9F28";
                }
                lastInfo = info;
                parent.add(new AttributeModifier("style", style));
            }
        });
        cols.add(new ColText("TareAcciCons", "Justificación de la nota", 400));
        cols.add(new ColText("CaliDoceAcci", "Calificación", 180));
//       cols.add(new ColText("ObseDoceAcci","Observaciones",200)); 
//       cols.add(new ColText("ObseDoceCoor","Observaciones Docente Coordinador",400)); 
        return cols;
    }

    private TDateField fechacciconsFld;
    private TDateField fechlimiacciFld;
    private TDateField fechentracciFld;
    private TEditField calidoceacciFld;
//   private TMemoField obsedoceacciFld;
    private TMemoField tareacciconsFld;
    private TMemoField obsedocecoorFld;
    private TLookupField conssistLku;
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
//       flds.add(fechacciconsFld= new TDateField    (0,0,"FechAcciCons","Fecha Creado",true));
        flds.add(fechlimiacciFld = new TDateField(0, 0, "FechLimiAcci", "Fecha Límite", true) {
            @Override
            public String validate(Object obj, Object value) {
                if (value != null) {
                    CJD_AccionConsulDto accConDto = (CJD_AccionConsulDto) grifo.getForm().getObject();
                    DateFormat format = new SimpleDateFormat("EEEE, MMM dd, yyyy");
                    String fechaStr = format.format((Date) value);
                    DateFormat format2 = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");
                    fechaStr += " 23:59:59 pm";
                    Date fechaD = null;
                    try {
                        fechaD = format2.parse(fechaStr);
                        accConDto.setFechLimiAcci(fechaD);
                        return "";
                    } catch (ParseException ex) {
                        Logger.getLogger(AccionConsulNode.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return "por favor digita aquí";
            }

        });
//       flds.add(fechentracciFld= new TDateField    (0,2,"FechEntrAcci","Fecha de entrega",true));
        flds.add(calidoceacciFld = new TEditField(0, 1, "CaliDoceAcci", "Calificación", false));
        flds.add(tareacciconsFld = new TMemoField(0, 2, 2, 1, "TareAcciCons", "Justificación de la nota", true));
//       flds.add(obsedocecoorFld= new TMemoField    (1,2,"ObseDoceCoor","Observaciones",false));
//       flds.add(obsedoceacciFld= new TMemoField    (1, 0, 3, 1,"ObseDoceAcci","Observaciones",false));
        flds.add(fa = new TFileAnnex(1, 0, 3, 1, "pkeyAcciCons", "Archivos Anexos", "AccionesConsulta"));
        return flds;
    }

    public void actualizarNota(String pkeyCons, CJD_AccionConsulDao acciDao) {
        acciDao.setConditions("fkeyConsSist = " + pkeyCons
                + " and CreaEstuDoce = 'D'");
        Double nota = acciDao.getAvg("caliDoceAcci");

        CJD_ConsulSistemDao consDao = new CJD_ConsulSistemDao();
        consDao.setConditions("pkeyConsSist = " + pkeyCons);
        CJD_ConsulSistemDto consDto = (CJD_ConsulSistemDto) consDao.findFirst();

        consDto.setNotaConsSist(nota);
        consDao.updateDto(consDto);
    }

}
