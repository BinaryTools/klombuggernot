package com.bt.univex.modules.CalificaPeritaje;

import java.util.*;
import com.xpc.base.*;
import com.xpc.forms.field.*;
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.*;
import com.xpc.conditions.data.Cond;
import java.text.SimpleDateFormat;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;

public class AnexosPeritaDNode {

//  AnexPeri
    private ControlNode control;
    private SNode node;
    private TGrifo grifo;
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------

    public void createGrifo(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id, indent, parent, "Anexos del peritaje");
        final CJD_AnexosPeritaDao anexperiDao = new CJD_AnexosPeritaDao();
        grifo = new TGrifo(SNode.NODE_ID, anexperiDao) {
            @Override
            public BaseDto convertDto(BaseDto inDto) {
//                CJD_AnexosConsulDao anexDao2 = new CJD_AnexosConsulDao();
                return anexperiDao.findDtoByPkey(inDto.toInt(), 1);
            }

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
                infoanexperiFld.setEnabled(false);
                fechmodianexFld.setEnabled(false);
                fa.setReadOnly(true);
                super.onActivateForm(art, inDto); //To change body of generated methods, choose Tools | Templates.
            }
            
            
        };
//---------------------------- CREAR GRID 
        CJDVAnexosPeritaProv anexperiProv = new CJDVAnexosPeritaProv();
        grifo.createGrid(genFieldsGrid(), anexperiProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Anexos del peritaje");
//---------------------------- CREAR FORM 
        CJD_AnexosPeritaDto anexperiDto = CJD_AnexosPeritaDao.getDefaultDto();
        grifo.createForm(genFieldsForm(), anexperiDto);
        grifo.addCondGrid(new Cond("fkeyPeriCons", " = ", "PeriConV", "pkeyPeriCons"));
        grifo.addDefaults(new Cond("fkeyPeriCons", " = ", "PeriConV", "pkeyPeriCons"));
        node.add(grifo);
        ctrl.add(node);
        grifo.setCanDel(false);
        grifo.setCanIns(false);
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
    private TGridNode gridNode;

    public void createFinder(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
        CJD_AnexosPeritaProv anexperiProv = new CJD_AnexosPeritaProv();
        node = new SNode(id, indent, parent, "Anexos del peritaje");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), anexperiProv);
        gridNode.setTitle("Anexos del peritaje");
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
        cols.add(new ColText("InfoAnexPeri", "Información", 400));
        cols.add(new ColText("FechModiAnex", "Fecha", 120) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVAnexosPeritaDto anexDto = (CJDVAnexosPeritaDto) getChild();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
                String strFecha = " ";
                String strHora = " ";
                if (anexDto.getFechModiAnex() != null) {
                    strFecha = sdf.format(anexDto.getFechModiAnex());
                    strHora = sdf2.format(anexDto.getFechModiAnex());
                }
                Label label = new Label(id, strFecha + " - " + strHora);
                parent.add(label);
                setComponent(label);
            }
        });
        return cols;
    }

    private TMemoField infoanexperiFld;
    private TDateField fechmodianexFld;
    private TFileAnnex fa;
//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 

    public ArrayList genFieldsForm() {
        ArrayList<BaseField> flds = new ArrayList();
        flds.add(infoanexperiFld = new TMemoField(0, 0, "InfoAnexPeri", "Información", true));
        flds.add(fechmodianexFld = new TDateField(0, 1, "FechModiAnex", "Fecha", true));
        flds.add(fa = new TFileAnnex(1, 0, 3, 1, "pkeyAnexPeri", "Archivos Anexos", "AnexosPeritaje"));

        return flds;
    }

}
