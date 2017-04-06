package com.bt.univex.modules.RevisarConsultasArea;

import com.bt.univex.modules.CalificarConsultas.*;
import java.util.*; 
import com.xpc.forms.field.*;
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.*;
import com.xpc.app.BinarySession;
import com.xpc.base.BaseDto;
import com.xpc.conditions.data.Cond;
import java.text.SimpleDateFormat;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;


public class AnexosConsulNode  {

//  AnexCons

   private ControlNode control;
   private SNode node; 
   private TGrifo grifo; 
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------
   public void createGrifo(int id,int indent,int parent,final ControlNode ctrl) { 
       
       BinarySession session = (BinarySession)ctrl.getSession();
       String PkeyEstu = session.getParameter("DOCENTE");
       String PkeyPeri = session.getParameter("PERIODO");
       
        control=ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id,indent,parent, "Llenar Anexos");
        final CJD_AnexosConsulDao anexconsDao = new CJD_AnexosConsulDao();
        grifo = new TGrifo(SNode.NODE_ID,anexconsDao){
            @Override
            public BaseDto convertDto(BaseDto inDto) {
//                CJD_AnexosConsulDao anexDao2 = new CJD_AnexosConsulDao();
                return anexconsDao.findDtoByPkey(inDto.toInt(), 1);
            }

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
                infoanexconsFld.setEnabled(false);
                fa.setReadOnly(true);
            }

           @Override
           protected boolean deleteRecord(AjaxRequestTarget art, BaseDto dto) {
               return false;
           }
            
            
        };
        
        grifo.setCanIns(false);
        grifo.setCanDel(false);
//---------------------------- CREAR GRID 
        CJDVAnexosConsulProv anexconsProv = new CJDVAnexosConsulProv();
        grifo.createGrid(genFieldsGrid(),anexconsProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("CJD_AnexosConsul");
//---------------------------- CREAR FORM 
        CJD_AnexosConsulDto anexconsDto = CJD_AnexosConsulDao.getDefaultDto();
        grifo.createForm(genFieldsForm(),anexconsDto);
        grifo.addCondGrid(new Cond("fkeyConsSist"," = ","ConsSistV", "pkeyConsSist"));
        grifo.addDefaults(new Cond("fkeyConsSist"," = ","ConsSistV", "pkeyConsSist"));
        node.add(grifo);
        ctrl.add(node);   
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
   private TGridNode gridNode;
   public void createFinder(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
        CJD_AnexosConsulProv anexconsProv = new CJD_AnexosConsulProv();
        node = new SNode(id,indent,parent, "CJD_AnexosConsul");
        gridNode = new TGridNode(SNode.NODE_ID,genFieldsGrid(),anexconsProv);
        gridNode.setTitle("CJD_AnexosConsul");
//        gridNode.addCond(new Cond(""," = ","", ""));
        node.add(gridNode);
        ctrl.add(node);   
    }

 ///---------------------------------| FIN

//========================================================================
// CAMPOS DE LA GRILLA 
   public ArrayList<TColumn> genFieldsGrid() { 
       ArrayList<TColumn> cols = new ArrayList();
       cols.add(new ColText("NombClasObse","Anexo",400)); 
       cols.add(new ColText("InfoAnexCons","Información del Anexo",400)); 
       cols.add(new ColText("FechModiAnex","Fecha de modificación",200){
           @Override
           public void showData(String id, WebMarkupContainer parent, Object obj) {
               CJDVAnexosConsulDto anexDto = (CJDVAnexosConsulDto) getChild();
               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
               SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
               String strFecha = " ";
               String strHora = " ";
               if(anexDto.getFechModiAnex() != null) {
                   strFecha = sdf.format(anexDto.getFechModiAnex());
                   strHora = sdf2.format(anexDto.getFechModiAnex());
               }
               Label label = new Label(id, strFecha+" - "+strHora);
               parent.add(label);
               setComponent(label);
           }
       }); 
       return cols; 
   }

   private TMemoField infoanexconsFld;
//   private TLookupField clasobseLku;
//   private TLookupField conssistLku;
   private TFileAnnex fa;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
   public ArrayList genFieldsForm() { 
       ArrayList<BaseField> flds = new ArrayList(); 
       flds.add(infoanexconsFld= new TMemoField    (0,0,4,3,"InfoAnexCons","Información del anexo",true){

           @Override
           public String validate(Object obj, Object value) {
               CJD_AnexosConsulDto anexDto = (CJD_AnexosConsulDto) grifo.getForm().getObject();
               return "";
           }
           
       });
//-------------------------------------------------------- | CJD_Clase_Observ
//       CJD_Clase_ObservDao clasobseDao = new CJD_Clase_ObservDao();
////       clasobseDao.setOrderBy("");
//       clasobseLku = new TLookupField(1,0,"FkeyClasObseDto","CJD_Clase_Observ",clasobseDao,true); 
//       clasobseLku.setFullLoad(true);
//       clasobseLku.addSeekField(new TField("nombClasObse","Buscar por Nombre"));
//       flds.add(clasobseLku);
//-------------------------------------------------------- | CJD_ConsulSistem
//       CJD_ConsulSistemDao conssistDao = new CJD_ConsulSistemDao();
//       conssistDao.setOrderBy("");
//       conssistLku = new TLookupField(2,0,"FkeyConsSistDto","CJD_ConsulSistem",conssistDao,true); 
////       conssistLku.setFullLoad(true);
////       conssistLku.addSeekField(new TField("",""));
//       flds.add(conssistLku);
       
       flds.add(fa = new TFileAnnex(3, 0, 3, 1, "pkeyAnexCons", "Archivos Anexos", "AnexosConsul"));
       
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

    public TMemoField getInfoanexconsFld() {
        return infoanexconsFld;
    }

    public void setInfoanexconsFld(TMemoField infoanexconsFld) {
        this.infoanexconsFld = infoanexconsFld;
    }

}

