package com.bt.univex.modules.RevisarProcesosArea;

import com.bt.univex.modules.CalificaProceso.*;
import com.bt.univex.ads.data.ADS_EstudiUniverDao;
import java.util.*; 
import com.xpc.forms.field.*;
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.* ;
import com.xpc.base.BaseDto; 
import com.xpc.base.data.TField;
import com.xpc.conditions.data.Cond;


public class EstudiProcesDNode  {

//  EstuProc

   private ControlNode control;
   private SNode node; 
   private TGrifo grifo; 
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------
   public void createGrifo(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id,indent,parent, "Estudiantes del proceso");
        final CJD_EstudiProcesDao estuprocDao = new CJD_EstudiProcesDao();
        grifo = new TGrifo(SNode.NODE_ID,estuprocDao){
            @Override
            public BaseDto convertDto(BaseDto inDto) {
//                CJD_AnexosConsulDao anexDao2 = new CJD_AnexosConsulDao();
                return estuprocDao.findDtoByPkey(inDto.toInt(), 1);
            }
        };
//---------------------------- CREAR GRID 
        CJDVEstudiProcesProv estuProcV = new CJDVEstudiProcesProv();
        grifo.createGrid(genFieldsGrid(),estuProcV);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("CJDVEstudiProces");
//---------------------------- CREAR FORM 
        CJD_EstudiProcesDto estuprocDto = CJD_EstudiProcesDao.getDefaultDto();
        grifo.createForm(genFieldsForm(),estuprocDto);
        grifo.addCondGrid(new Cond("fkeyProcCons"," = ","ProcConsV", "pkeyProcCons"));
        grifo.addDefaults(new Cond("fkeyProcCons"," = ","ProcConsV", "pkeyProcCons"));
        node.add(grifo);
        ctrl.add(node);   
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
   private TGridNode gridNode;
   public void createFinder(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
        CJDVEstudiProcesProv estuprocProv = new CJDVEstudiProcesProv();
        node = new SNode(id,indent,parent, "Estudiantes del proceso");
        gridNode = new TGridNode(SNode.NODE_ID,genFieldsGrid(),estuprocProv);
        gridNode.setTitle("Estudiantes del proceso");
        gridNode.addCond(new Cond("fkeyProcCons"," = ","ProcConsV", "pkeyProcCons"));
        node.add(gridNode);
        ctrl.add(node);   
    }

 ///---------------------------------| FIN

//========================================================================
// CAMPOS DE LA GRILLA 
   public ArrayList<TColumn> genFieldsGrid() { 
       ArrayList<TColumn> cols = new ArrayList(); 
       cols.add(new ColText("CodiEstudian","Codigo Estudiante",120));
//       cols.add(new ColText("EstaActiEstu","Estado Estudiante",120));
//       cols.add(new ColText("EstaAcadEstu","Estado Académico Estudiante",120));
       cols.add(new ColText("NombEstudian","Nombre Estudiante",120));
       cols.add(new ColText("ApelEstudian","Apellido Estudiante",120));
       cols.add(new ColText("SeguApelEstu","Segundo Apellido Estudiante",120));
       cols.add(new ColText("FechAsigProc","Fecha Asignación",120)); 
       cols.add(new ColText("FechEntrProc","Fecha Entrega",120)); 
       return cols; 
   }

   private TDateField fechasigprocFld;
   private TDateField fechentrprocFld;
   private TLookupField procconsLku;
   private TLookupField estudianLku;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
   public ArrayList genFieldsForm() { 
       ArrayList<BaseField> flds = new ArrayList(); 
       flds.add(fechasigprocFld= new TDateField    (0,0,"FechAsigProc","Fecha Asignación",true));
       flds.add(fechentrprocFld= new TDateField    (0,1,"FechEntrProc","Fecha Entrega",false));
//-------------------------------------------------------- | CJD_ProcesConsul
//       CJD_ProcesConsulDao procconsDao = new CJD_ProcesConsulDao();
//       procconsDao.setOrderBy("");
//       procconsLku = new TLookupField(1,0,"FkeyProcConsDto","CJD_ProcesConsul",procconsDao,true); 
//       procconsLku.setFullLoad(true);
//       procconsLku.setSeekFields(
//                new ArrayList(Arrays.asList(
//                                        new TField("NombProyInve", "Buscar por nombre"),
//                                        new TField("CodiProyInve", "Buscar por código"))));
       
//       procconsLku.addSeekField(new TField("",""));
//       flds.add(procconsLku);
//-------------------------------------------------------- | ADS_EstudiUniver
       ADS_EstudiUniverDao estudianDao = new ADS_EstudiUniverDao();
       estudianDao.setOrderBy("");
       estudianLku = new TLookupField(1,0,"FkeyEstudianDto","Estudiantes",estudianDao,true); 
       estudianLku.setFullLoad(true);
       estudianLku.setSeekFields(
                new ArrayList(Arrays.asList(
                                        new TField("nombEstudian", "Buscar por nombre"),
                                        new TField("codiEstudian", "Buscar por código"))));
//       estudianLku.addSeekField(new TField("",""));
       flds.add(estudianLku);
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

    public TDateField getFechasigprocFld() {
        return fechasigprocFld;
    }

    public void setFechasigprocFld(TDateField fechasigprocFld) {
        this.fechasigprocFld = fechasigprocFld;
    }

    public TDateField getFechentrprocFld() {
        return fechentrprocFld;
    }

    public void setFechentrprocFld(TDateField fechentrprocFld) {
        this.fechentrprocFld = fechentrprocFld;
    }

    public TLookupField getProcconsLku() {
        return procconsLku;
    }

    public void setProcconsLku(TLookupField procconsLku) {
        this.procconsLku = procconsLku;
    }

    public TLookupField getEstudianLku() {
        return estudianLku;
    }

    public void setEstudianLku(TLookupField estudianLku) {
        this.estudianLku = estudianLku;
    }

}

