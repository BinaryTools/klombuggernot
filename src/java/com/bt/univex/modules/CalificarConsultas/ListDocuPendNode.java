package com.bt.univex.modules.CalificarConsultas;

import java.util.*; 
import com.xpc.forms.field.*;
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.* ;
import com.xpc.base.BaseDto;
import com.xpc.conditions.data.Cond;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;


public class ListDocuPendNode  {

//  ListDocu

   private ControlNode control;
   private SNode node; 
   private TGrifo grifo; 
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------
   public void createGrifo(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id,indent,parent, "Lista de documentos recibidos y pendientes");
        final CJD_ListDocuPendDao listdocuDao = new CJD_ListDocuPendDao();
        grifo = new TGrifo(SNode.NODE_ID,listdocuDao){

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
                nombdocupendFld.setEnabled(false);
                obselistdocuFld.setEnabled(false);
                estapendentrFld.setEnabled(false);
            }
        
        };
        
        grifo.setCanIns(false);
        grifo.setCanDel(false);
//---------------------------- CREAR GRID 
        CJD_ListDocuPendProv listdocuProv = new CJD_ListDocuPendProv();
        grifo.createGrid(genFieldsGrid(),listdocuProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Lista de documentos recibidos y pendientes");
//---------------------------- CREAR FORM 
        CJD_ListDocuPendDto listdocuDto = CJD_ListDocuPendDao.getDefaultDto();
        grifo.createForm(genFieldsForm(),listdocuDto);
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
        CJD_ListDocuPendProv listdocuProv = new CJD_ListDocuPendProv();
        node = new SNode(id,indent,parent, "CJD_ListDocuPend");
        gridNode = new TGridNode(SNode.NODE_ID,genFieldsGrid(),listdocuProv);
        gridNode.setTitle("CJD_ListDocuPend");
//        gridNode.addCond(new Cond(""," = ","", ""));
        node.add(gridNode);
        ctrl.add(node);   
    }

 ///---------------------------------| FIN

//========================================================================
// CAMPOS DE LA GRILLA 
   
   String style, lastInfo;
   
   public ArrayList<TColumn> genFieldsGrid() { 
       ArrayList<TColumn> cols = new ArrayList();
       cols.add(new ColText("EstaPendEntr","¿Se recibió?",120){
           @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
//                CJD_ListDocuPendDto listDocuDto = (CJD_ListDocuPendDto) getChild();//obtiene el dto que esta pintando en ese momento
                super.showData(id, parent, obj);
                String info = obj.toString();

                if (info.equals("No")) {
//                    sw = !sw; si deseo que sea intercalado
                    style = "background-color:#CB4040"; 
                }else {
                    style = "background-color:#FFFFFF";
                }
//                lastInfo = info;
                parent.add(new AttributeModifier("style", style));
            }
       }); 
       cols.add(new ColText("NombDocuPend","Nombre",200));
       cols.add(new ColText("FechEntrDocu","Fecha de recibido",120)); 
       cols.add(new ColText("ObseListDocu","Observaciones",400)); 
       return cols; 
   }

   private TEditField nombdocupendFld;
   private TCheckField estapendentrFld;
//   private TDateField fechentrdocuFld;
   private TMemoField obselistdocuFld;
//   private TLookupField conssistLku;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
   public ArrayList genFieldsForm() { 
       ArrayList<BaseField> flds = new ArrayList(); 
       flds.add(nombdocupendFld= new TEditField    (0,0,2,1,"NombDocuPend","Nombre",false));
       flds.add(estapendentrFld= new TCheckField   (0,2,"EstaPendEntr","¿Se recibió?",false){

//           @Override
//           public String validate(Object obj, Object value) {
//               CJD_ListDocuPendDto listDocuDto = (CJD_ListDocuPendDto)obj;
//               
//               String valo = (String) value;
//               if(valo.equals("S")){
//                   listDocuDto.setFechEntrDocu(new Date());
//               }else if(valo.equals("N")){
//                   listDocuDto.setFechEntrDocu(null);
//               }
//               return ""; //To change body of generated methods, choose Tools | Templates.
//           }
           
       });
//       flds.add(fechentrdocuFld= new TDateField    (0,3,"FechEntrDocu","Fecha de Entrega",true));
       flds.add(obselistdocuFld= new TMemoField    (1,0,3,1,"ObseListDocu","Observaciones",true));
//-------------------------------------------------------- | CJD_ConsulSistem
//       CJD_ConsulSistemDao conssistDao = new CJD_ConsulSistemDao();
//       conssistDao.setOrderBy("");
//       conssistLku = new TLookupField(1,0,"FkeyConsSistDto","CJD_ConsulSistem",conssistDao,true); 
////       conssistLku.setFullLoad(true);
////       conssistLku.addSeekField(new TField("",""));
//       flds.add(conssistLku);
        return flds; 
   }

}

