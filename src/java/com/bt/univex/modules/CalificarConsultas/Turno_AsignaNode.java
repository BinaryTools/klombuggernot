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
import org.apache.wicket.ajax.AjaxRequestTarget;


public class Turno_AsignaNode  {

//  TurnAsig

   private ControlNode control;
   private SNode node; 
   private TGrifo grifo; 
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------
   public void createGrifo(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id,indent,parent, "Reasignar Cita");
        final CJD_Turno_AsignaDao turnasigDao = new CJD_Turno_AsignaDao();
        grifo = new TGrifo(SNode.NODE_ID,turnasigDao){

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
                fechturnasigFld.setEnabled(false);
                horaatenturnFld.setEnabled(false);
                efecturnasigFld.setEnabled(false);
                obseturnasigFld.setEnabled(false);
            }
        
        };
        
        grifo.setCanIns(false);
        grifo.setCanDel(false);
//---------------------------- CREAR GRID 
        CJD_Turno_AsignaProv turnasigProv = new CJD_Turno_AsignaProv();
        grifo.createGrid(genFieldsGrid(),turnasigProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("CJD_Turno_Asigna");
//---------------------------- CREAR FORM 
        CJD_Turno_AsignaDto turnasigDto = CJD_Turno_AsignaDao.getDefaultDto();
        grifo.createForm(genFieldsForm(),turnasigDto);
        grifo.addCondGrid(new Cond("FkeyConsSist"," = ","ConsSistV", "PkeyConsSist"));
        grifo.addDefaults(new Cond("FkeyConsSist"," = ","ConsSistV", "PkeyConsSist"));
        node.add(grifo);
        ctrl.add(node);
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
   private TGridNode gridNode;
   public void createFinder(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
        CJD_Turno_AsignaProv turnasigProv = new CJD_Turno_AsignaProv();
        node = new SNode(id,indent,parent, "CJD_Turno_Asigna");
        gridNode = new TGridNode(SNode.NODE_ID,genFieldsGrid(),turnasigProv);
        gridNode.setTitle("CJD_Turno_Asigna");
//        gridNode.addCond(new Cond(""," = ","", ""));
        node.add(gridNode);
        ctrl.add(node);   
    }

 ///---------------------------------| FIN

//========================================================================
// CAMPOS DE LA GRILLA 
   public ArrayList<TColumn> genFieldsGrid() { 
       ArrayList<TColumn> cols = new ArrayList(); 
       cols.add(new ColText("FechTurnAsig","Fecha",120)); 
       cols.add(new ColText("HoraAtenTurn","Hora de Atención",200)); 
       cols.add(new ColText("EfecTurnAsig","¿Se efectuó la cita?",120)); 
       return cols; 
   }

   private TDateField fechturnasigFld;
   private TEditField horaatenturnFld;
   private TCheckField efecturnasigFld;
   private TMemoField obseturnasigFld;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
   public ArrayList genFieldsForm() { 
       ArrayList<BaseField> flds = new ArrayList(); 
       flds.add(fechturnasigFld= new TDateField    (0,0,"FechTurnAsig","Fecha",true));
       flds.add(horaatenturnFld= new TEditField    (0,1,"HoraAtenTurn","Hora de Atención",true));
       flds.add(efecturnasigFld= new TCheckField   (0,2,"EfecTurnAsig","¿Se efectuó la cita?",false));
       flds.add(obseturnasigFld= new TMemoField    (1,0,3,1,"ObseTurnAsig","Observaciones",true));
       
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

    public TDateField getFechturnasigFld() {
        return fechturnasigFld;
    }

    public void setFechturnasigFld(TDateField fechturnasigFld) {
        this.fechturnasigFld = fechturnasigFld;
    }

    public TEditField getHoraatenturnFld() {
        return horaatenturnFld;
    }

    public void setHoraatenturnFld(TEditField horaatenturnFld) {
        this.horaatenturnFld = horaatenturnFld;
    }

    public TCheckField getEfecturnasigFld() {
        return efecturnasigFld;
    }

    public void setEfecturnasigFld(TCheckField efecturnasigFld) {
        this.efecturnasigFld = efecturnasigFld;
    }

}

