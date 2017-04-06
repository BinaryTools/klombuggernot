package com.bt.univex.modules.CalificarConsultas;

import java.util.*; 
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.*;
import com.xpc.conditions.data.Cond;
import java.text.SimpleDateFormat;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;


public class ContIngrEstuNode  {

//  ConIngEst

   private ControlNode control;
   private SNode node; 
   private TGrifo grifo; 
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------
//   public void createGrifo(int id,int indent,int parent,final ControlNode ctrl) { 
//        control=ctrl;
////---------------------------- CREAR NODE 
//        node = new SNode(id,indent,parent, "CJD_ContIngrEstu");
//        final CJD_ContIngrEstuDao coningestDao = new CJD_ContIngrEstuDao();
//        grifo = new TGrifo(SNode.NODE_ID,coningestDao);
////---------------------------- CREAR GRID 
//        CJD_ContIngrEstuProv coningestProv = new CJD_ContIngrEstuProv();
//        grifo.createGrid(genFieldsGrid(),coningestProv);
////        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
////              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
//        grifo.setTitle("CJD_ContIngrEstu");
////---------------------------- CREAR FORM 
//        CJD_ContIngrEstuDto coningestDto = CJD_ContIngrEstuDao.getDefaultDto();
//        grifo.createForm(genFieldsForm(),coningestDto);
////        grifo.addCondGrid(new Cond(""," = ","", ""));
////        grifo.addDefaults(new Cond(""," = ","", ""));
//        node.add(grifo);
//        ctrl.add(node);   
//    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
   private TGridNode gridNode;
   public void createFinder(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
        CJD_ContIngrEstuProv coningestProv = new CJD_ContIngrEstuProv();
        node = new SNode(id,indent,parent, "Control de cambios de la consulta");
        gridNode = new TGridNode(SNode.NODE_ID,genFieldsGrid(),coningestProv);
        gridNode.setTitle("CJD_ContIngrEstu");
        gridNode.addCond(new Cond("fkeyConsSist"," = ","ConsSistV", "pkeyConsSist"));
        node.add(gridNode);
        ctrl.add(node);   
    }

 ///---------------------------------| FIN

//========================================================================
// CAMPOS DE LA GRILLA 
   public ArrayList<TColumn> genFieldsGrid() { 
       ArrayList<TColumn> cols = new ArrayList(); 
       cols.add(new ColText("fechHaceModi","Fecha y hora",200){
           @Override
           public void showData(String id, WebMarkupContainer parent, Object obj) {
               CJD_ContIngrEstuDto cieDto = (CJD_ContIngrEstuDto) getChild();
               Date fecha = cieDto.getFechHaceModi();
               String fechaStr = " ";
               if (fecha != null)
                   fechaStr = traerFecha(fecha) + " - " + traerHora(fecha);
               Label label = new Label(id, fechaStr);
               parent.add(label);
               setComponent(label);
           }
       });  
       cols.add(new ColText("descModiEstu","Detalle",800)); 
       return cols; 
   }
   
   private String traerFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }
   
   private String traerHora(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(fecha);
    }

//   private TLookupField conssistvLku;
//
////<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
//// CAMPOS DE LA FORMA 
//   public ArrayList genFieldsForm() { 
//       ArrayList<BaseField> flds = new ArrayList(); 
////-------------------------------------------------------- | CJDVConsulSistem
//       CJDVConsulSistemDao conssistvDao = new CJDVConsulSistemDao();
//       conssistvDao.setOrderBy("");
//       conssistvLku = new TLookupField(0,0,"FkeyConsSistDto","CJDVConsulSistem",conssistvDao,true); 
////       conssistvLku.setFullLoad(true);
////       conssistvLku.addSeekField(new TField("",""));
//       flds.add(conssistvLku);
//        return flds; 
//   }

}

