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
import com.bt.univex.cjd.data.*;
import com.bt.univex.cjd.data.*;
import com.xpc.conditions.data.Cond;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class AnexosProcesDNode {

//  AnexProc
    private ControlNode control;
    private SNode node;
    private TGrifo grifo;
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------

    public void createGrifo(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id, indent, parent, "Anexos");
        final CJD_AnexosProcesDao anexprocDao = new CJD_AnexosProcesDao();
        grifo = new TGrifo(SNode.NODE_ID, anexprocDao) {

            @Override
            public BaseDto convertDto(BaseDto inDto) {
//                CJD_AnexosConsulDao anexDao2 = new CJD_AnexosConsulDao();
                return anexprocDao.findDtoByPkey(inDto.toInt(), 1);
            }

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
                infoanexprocFld.setEnabled(false);
                fa.setReadOnly(true);

                super.onActivateForm(art, inDto); //To change body of generated methods, choose Tools | Templates.
            }

        };
        grifo.setCanDel(false);
        grifo.setCanIns(false);
//---------------------------- CREAR GRID 
        CJDVAnexosProcesProv anexprocProv = new CJDVAnexosProcesProv();
        grifo.createGrid(genFieldsGrid(), anexprocProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Anexos");
//---------------------------- CREAR FORM 
        CJD_AnexosProcesDto anexprocDto = CJD_AnexosProcesDao.getDefaultDto();
        grifo.createForm(genFieldsForm(), anexprocDto);
        grifo.addCondGrid(new Cond("fkeyProcCons", " = ", "ProcConsV", "pkeyProcCons"));
        grifo.addDefaults(new Cond("fkeyProcCons", " = ", "ProcConsV", "pkeyProcCons"));

        node.add(grifo);
        ctrl.add(node);
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
    private TGridNode gridNode;

    public void createFinder(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
        CJD_AnexosProcesProv anexprocProv = new CJD_AnexosProcesProv();
        node = new SNode(id, indent, parent, "CJD_AnexosProces");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), anexprocProv);
        gridNode.setTitle("CJD_AnexosProces");
//        gridNode.addCond(new Cond(""," = ","", ""));
        node.add(gridNode);
        ctrl.add(node);
    }

 ///---------------------------------| FIN
//========================================================================
// CAMPOS DE LA GRILLA 
    public ArrayList<TColumn> genFieldsGrid() {
        ArrayList<TColumn> cols = new ArrayList();
        cols.add(new ColText("nombClasObse", "Anexo", 400));
        cols.add(new ColText("InfoAnexProc", "Información", 400));
        cols.add(new ColText("FechModiAnex", "Fecha Modificación", 120));
        return cols;
    }

    private TMemoField infoanexprocFld;
    private TLookupField procconsLku;
//   private TLookupField clasobseLku;
    private TFileAnnex fa;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
    public ArrayList genFieldsForm() {
        ArrayList<BaseField> flds = new ArrayList();
        flds.add(infoanexprocFld = new TMemoField(0, 0, 3, 1, "InfoAnexProc", "Información", true));
//       flds.add(fechmodianexFld= new TDateField    (0,1,"FechModiAnex","Fecha Modificación",false));
//-------------------------------------------------------- | CJD_ProcesConsul
//       CJD_ProcesConsulDao procconsDao = new CJD_ProcesConsulDao();
//       procconsDao.setOrderBy("");
//       procconsLku = new TLookupField(1,0,"FkeyProcConsDto","CJD_ProcesConsul",procconsDao,true); 
////       procconsLku.setFullLoad(true);
////       procconsLku.addSeekField(new TField("",""));
//       flds.add(procconsLku);
////-------------------------------------------------------- | CJD_Clase_Observ
//       CJD_Clase_ObservDao clasobseDao = new CJD_Clase_ObservDao();
//       clasobseDao.setOrderBy("");
//       clasobseLku = new TLookupField(2,0,"FkeyClasObseDto","CJD_Clase_Observ",clasobseDao,true); 
////       clasobseLku.setFullLoad(true);
////       clasobseLku.addSeekField(new TField("",""));
//       flds.add(clasobseLku);
        flds.add(fa = new TFileAnnex(1, 0, 3, 1, "pkeyAnexProc", "Archivos Anexos", "AnexosProces"));
        return flds;
    }

}
