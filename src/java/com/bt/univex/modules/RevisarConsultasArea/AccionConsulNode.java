package com.bt.univex.modules.RevisarConsultasArea;

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
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.PropertyModel;


public class AccionConsulNode  {

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
   public void createGrifo(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id,indent,parent, "Calificación consulta");
        final CJD_AccionConsulDao acciconsDao = new CJD_AccionConsulDao();
        grifo = new TGrifo(SNode.NODE_ID,acciconsDao){
            
            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
                tareacciconsFld.setEnabled(false);
//                obsedoceacciFld.setEnabled(false);
                fa.setReadOnly(true);
            }

            @Override
            public void activate(AjaxRequestTarget art) {
                super.activate(art);
                if (panelInterno() == null) {
                } else {
                    mensInfo = "<li>Componente Rojo: Tarea no realizada y/o Tarea realizada fuera del tiempo límite.</li>"
                            + "<li>Componente Amarillo: Tarea por realizar.</li>"
                            + "<li>Componente Verde: Tarea realizada a tiempo y/o creada por el estudiante.</li>";
                    art.add(preForm);
                }
                art.add(grifo.getGrid());
            }
        };
        grifo.setCanDel(false);
        grifo.setCanIns(false);
//---------------------------- CREAR GRID 
        CJD_AccionConsulProv acciconsProv = new CJD_AccionConsulProv();
        grifo.createGrid(genFieldsGrid(),acciconsProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Calificación consulta");
//---------------------------- CREAR FORM 
        CJD_AccionConsulDto acciconsDto = CJD_AccionConsulDao.getDefaultDto();
        grifo.createForm(genFieldsForm(),acciconsDto);
        grifo.addCondGrid(new Cond("fkeyConsSist"," = ","ConsSistV", "pkeyConsSist"));
        grifo.addDefaults(new Cond("fkeyConsSist"," = ","ConsSistV", "pkeyConsSist"));
        grifo.getGrid().addOnTop(panelInterno());
        node.add(grifo);
        ctrl.add(node);   
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
   private TGridNode gridNode;
   public void createFinder(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
        CJD_AccionConsulProv acciconsProv = new CJD_AccionConsulProv();
        node = new SNode(id,indent,parent, "CJD_AccionConsul");
        gridNode = new TGridNode(SNode.NODE_ID,genFieldsGrid(),acciconsProv);
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
       cols.add(new ColText("FechEntrAcci", "Fecha de calificado", 120){
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
       cols.add(new ColText("CaliDoceAcci", "Calificación", 180));
//       cols.add(new ColText("ObseDoceAcci","Observaciones",200)); 
       cols.add(new ColText("TareAcciCons","Justificación de la nota",400)); 
//       cols.add(new ColText("ObseDoceCoor","Observaciones Docente Coordinador",400)); 
       return cols; 
   }

//   private TDateField fechacciconsFld;
//   private TDateField fechlimiacciFld;
//   private TDateField fechentracciFld;
//   private TEditField calidoceacciFld;
//   private TMemoField obsedoceacciFld;
   private TMemoField tareacciconsFld;
//   private TMemoField obsedocecoorFld;
//   private TLookupField conssistLku;
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
//       flds.add(fechlimiacciFld= new TDateField    (0,1,"FechLimiAcci","Fecha Límite",true));
//       flds.add(fechentracciFld= new TDateField    (0,2,"FechEntrAcci","Fecha de entrega",true));
//       flds.add(calidoceacciFld= new TEditField    (0,3,"CaliDoceAcci","Calificación",false));
       flds.add(tareacciconsFld= new TMemoField    (0,0,3,1,"TareAcciCons","Justificación de la nota",false));
//       flds.add(obsedocecoorFld= new TMemoField    (1,2,"ObseDoceCoor","Observaciones",false));
//       flds.add(obsedoceacciFld= new TMemoField    (1, 0, 3, 1,"ObseDoceAcci","Observaciones",false));
       flds.add(fa = new TFileAnnex(1, 0, 3, 1, "pkeyAcciCons", "Archivos Anexos", "AccionesConsulta") {
            @Override
            public void reload(int count) {
//                CJD_AnexosProcesDto dto = (CJD_AnexosProcesDto) grifo.getForm().getObject();
                cantidad = count;
            }
        });
       return flds; 
   }

}

