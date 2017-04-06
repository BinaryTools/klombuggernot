package com.bt.univex.modules.CalificaProceso;

import java.sql.*;
import java.util.*; 
import com.xpc.base.*; 
import com.xpc.utilities.*;
import com.xpc.forms.field.*; 
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.* ;
import com.bt.univex.cjd.data.* ;
import com.xpc.base.data.TField;
import com.xpc.conditions.data.Cond;


public class PersonProcesDNode  {

//  PersProc

   private ControlNode control;
   private SNode node; 
   private TGrifo grifo; 
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------
   public void createGrifo(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id,indent,parent, "Personas ligadas al proceso");
        final CJD_PersonProcesDao persprocDao = new CJD_PersonProcesDao();
        grifo = new TGrifo(SNode.NODE_ID,persprocDao){
            @Override
            public BaseDto convertDto(BaseDto inDto) {
//                CJD_AnexosConsulDao anexDao2 = new CJD_AnexosConsulDao();
                return persprocDao.findDtoByPkey(inDto.toInt(), 1);
            }
        };
//        grifo.setCanDel(false);
//        grifo.setCanIns(false);
//---------------------------- CREAR GRID 
        CJDVPersonProcesProv persprocV = new CJDVPersonProcesProv();
        grifo.createGrid(genFieldsGrid(),persprocV);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("CJDVPersonProces");
//---------------------------- CREAR FORM 
        CJDVPersonProcesDto persprocDto = CJDVPersonProcesDao.getDefaultDto();
        grifo.createForm(genFieldsForm(),persprocDto);
//        grifo.addCondGrid(new Cond("fkeyProcCons"," = ","ProcCons", "pkeyProcCons"));
//        grifo.addDefaults(new Cond("fkeyProcCons"," = ","ProcCons", "pkeyProcCons"));
        node.add(grifo);
        ctrl.add(node);   
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
   private TGridNode gridNode;
   public void createFinder(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
        CJDVPersonProcesProv persprocProv = new CJDVPersonProcesProv();
        node = new SNode(id,indent,parent, "Usuario del proceso");
        gridNode = new TGridNode(SNode.NODE_ID,genFieldsGrid(),persprocProv);
        gridNode.setTitle("Usuario del proceso");
        gridNode.addCond(new Cond("fkeyProcCons"," = ","ProcConsV", "pkeyProcCons"));
        node.add(gridNode);
        ctrl.add(node);   
    }

 ///---------------------------------| FIN

//========================================================================
// CAMPOS DE LA GRILLA 
   public ArrayList<TColumn> genFieldsGrid() { 
       ArrayList<TColumn> cols = new ArrayList(); 
       cols.add(new ColText("FechRelaProc","Fecha Relación",120)); 
       cols.add(new ColText("nombUsuaSist","Nombre usuario",120));
//       cols.add(new ColText("tipoDocuUsua","Tipo documento",120));
       cols.add(new ColText("numeDocuUsua","Numero documento",120));
       cols.add(new ColText("teleFijoUsua","Telefono usuario",120));
       cols.add(new ColText("teleCeluUsua","Celular usuario",120));
       cols.add(new ColText("corrUsuaSist","Correo usuario",120));
       cols.add(new ColText("NombContacto","Nombre contacto",200)); 
       cols.add(new ColText("teleFijoCont","Telefono contacto",200)); 
       cols.add(new ColText("teleCeluCont","Celular contacto",200)); 
       cols.add(new ColText("corrElecCont","Correo contacto",200)); 
       return cols; 
   }

   private TDateField fechrelaprocFld;
   private TLookupField procconsLku;
   private TLookupField perssistLku;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
   public ArrayList genFieldsForm() { 
       ArrayList<BaseField> flds = new ArrayList(); 
       flds.add(fechrelaprocFld= new TDateField    (0,0,"FechRelaProc","Fecha Relación",true));
//-------------------------------------------------------- | CJD_ProcesConsul
//       CJD_ProcesConsulDao procconsDao = new CJD_ProcesConsulDao();
//       procconsDao.setOrderBy("");
//       procconsLku = new TLookupField(1,0,"FkeyProcConsDto","CJD_ProcesConsul",procconsDao,true); 
////       procconsLku.setFullLoad(true);
////       procconsLku.addSeekField(new TField("",""));
//       flds.add(procconsLku);
//-------------------------------------------------------- | CJD_PersonSistem
       CJD_PersonSistemDao perssistDao = new CJD_PersonSistemDao();
       perssistDao.setOrderBy("");
       perssistLku = new TLookupField(1,0,"FkeyPersSistDto","Usuario",perssistDao,true); 
       perssistLku.setFullLoad(true);
       perssistLku.setSeekFields(
                new ArrayList(Arrays.asList(
                                        new TField("nombUsuaSist", "Buscar por nombre"),
                                        new TField("numeDocuUsua", "Buscar por Documento"))));
//       perssistLku.addSeekField(new TField("",""));
       flds.add(perssistLku);
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

    public TDateField getFechrelaprocFld() {
        return fechrelaprocFld;
    }

    public void setFechrelaprocFld(TDateField fechrelaprocFld) {
        this.fechrelaprocFld = fechrelaprocFld;
    }

    public TLookupField getProcconsLku() {
        return procconsLku;
    }

    public void setProcconsLku(TLookupField procconsLku) {
        this.procconsLku = procconsLku;
    }

    public TLookupField getPerssistLku() {
        return perssistLku;
    }

    public void setPerssistLku(TLookupField perssistLku) {
        this.perssistLku = perssistLku;
    }

}

