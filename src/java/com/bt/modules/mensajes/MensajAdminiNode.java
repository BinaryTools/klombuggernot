package com.bt.modules.mensajes;

import com.bt.univex.ads.data.ADS_MensajAdminiDto;
import com.bt.univex.ads.data.ADS_MensajAdminiProv;
import com.xpc.forms.field.BaseField;
import com.xpc.forms.field.TCheckField;
import com.xpc.forms.field.TDateField;
import com.xpc.forms.field.TMemoField;
import com.xpc.forms.field.TStaticField;
import com.xpc.grid.column.ColText;
import com.xpc.grid.column.TColumn;
import com.xpc.snode.ControlNode;
import com.xpc.snode.SNode;
import com.xpc.snode.finder.TGridNode;
import java.util.ArrayList;
import org.apache.wicket.extensions.markup.html.repeater.util.SortParam;


public class MensajAdminiNode  {

//  Mensajes

   private ControlNode control;
   private SNode node; 
 
//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
   private TGridNode gridNode;
   public void createFinder(int id,int indent,int parent,final ControlNode ctrl) { 
        control=ctrl;
        ADS_MensajAdminiProv mensajesProv = new ADS_MensajAdminiProv();
        mensajesProv.getDao().addParam("TipoPortModu='D' And EstaActiMens='S' ");
        mensajesProv.setSort(new SortParam("FechMensAdmi",false));
        node = new SNode(id,indent,parent, "Mensajes del Administrador");
        gridNode = new TGridNode(SNode.NODE_ID,genFieldsGrid(),mensajesProv);
        gridNode.setTitle("Mensajes del Administrador");
//        gridNode.addCond(new Cond(""," = ","", ""));
        node.add(gridNode);
        ctrl.add(node);   
    }

 ///---------------------------------| FIN

//========================================================================
// CAMPOS DE LA GRILLA 
   public ArrayList<TColumn> genFieldsGrid() { 
       ArrayList<TColumn> cols = new ArrayList(); 
       cols.add(new ColText("FechMensAdmi","Fecha",120)); 
       cols.add(new ColText("TextMensAdmi","Mensaje",600)); 
//       cols.add(new ColText("TipoPortModu","Portal en el cual aparecer",120)); 
       cols.add(new ColText("EstaActiMens","Estado",120)); 
       return cols; 
   }

   private TDateField fechmensadmiFld;
   private TMemoField textmensadmiFld;
   private TStaticField tipoportmoduFld;
   private TCheckField estaactimensFld;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
   public ArrayList genFieldsForm() { 
       ArrayList<BaseField> flds = new ArrayList(); 
       flds.add(fechmensadmiFld= new TDateField    (0,0,"FechMensAdmi","Fecha",true));
       flds.add(textmensadmiFld= new TMemoField    (0,1,"TextMensAdmi","Mensaje",true));
       flds.add(tipoportmoduFld= new TStaticField  (0,2,"TipoPortModu","Portal en el cual aparecer",ADS_MensajAdminiDto.RANG_TipoPortModu,true));
       flds.add(estaactimensFld= new TCheckField   (0,3,"EstaActiMens","Estado",true));
        return flds; 
   }

}

