package com.bt.univex.modules.CalificaPeritaje;

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
import com.xpc.base.data.TField;
import com.xpc.conditions.data.Cond;

public class PersonPeritaDNode {

//  PersPeri
    private ControlNode control;
    private SNode node;
    private TGrifo grifo;
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------

    public void createGrifo(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id, indent, parent, "Pesonas Peritaje");
        final CJD_PersonPeritaDao persperiDao = new CJD_PersonPeritaDao();
        grifo = new TGrifo(SNode.NODE_ID, persperiDao) {
            @Override
            public BaseDto convertDto(BaseDto inDto) {
//                CJD_AnexosConsulDao anexDao2 = new CJD_AnexosConsulDao();
                return persperiDao.findDtoByPkey(inDto.toInt(), 1);
            }
        };
//---------------------------- CREAR GRID 
        CJDVPersonPeritaProv persperiProv = new CJDVPersonPeritaProv();
        grifo.createGrid(genFieldsGrid(), persperiProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Pesonas Peritaje");
//---------------------------- CREAR FORM 
        CJD_PersonPeritaDto persperiDto = CJD_PersonPeritaDao.getDefaultDto();
        grifo.createForm(genFieldsForm(), persperiDto);
        grifo.addCondGrid(new Cond("fkeyPeriCons", " = ", "PeriConV", "pkeyPeriCons"));
        grifo.addDefaults(new Cond("fkeyPeriCons", " = ", "PeriConV", "pkeyPeriCons"));
        node.add(grifo);
        ctrl.add(node);
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
    private TGridNode gridNode;

    public void createFinder(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
        CJDVPersonPeritaProv persperiProv = new CJDVPersonPeritaProv();
        node = new SNode(id, indent, parent, "Pesonas Peritaje");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), persperiProv);
        gridNode.setTitle("Pesonas Peritaje");
        gridNode.addCond(new Cond("fkeyPeriCons", " = ", "PeriConV", "pkeyPeriCons"));
        node.add(gridNode);
        ctrl.add(node);
    }

    ///---------------------------------| FIN
//========================================================================
// CAMPOS DE LA GRILLA 
    public ArrayList<TColumn> genFieldsGrid() {
        ArrayList<TColumn> cols = new ArrayList();
        cols.add(new ColText("FechRelaPeri", "Fecha", 120));
        cols.add(new ColText("nombUsuaSist", "Nombre usuario", 120));
//       cols.add(new ColText("tipoDocuUsua","Tipo documento",120));
        cols.add(new ColText("numeDocuUsua", "Numero documento", 120));
        cols.add(new ColText("teleFijoUsua", "Telefono usuario", 120));
        cols.add(new ColText("teleCeluUsua", "Celular usuario", 120));
        cols.add(new ColText("corrUsuaSist", "Correo usuario", 120));
        cols.add(new ColText("NombContacto", "Nombre contacto", 200));
        cols.add(new ColText("teleFijoCont", "Telefono contacto", 200));
        cols.add(new ColText("teleCeluCont", "Celular contacto", 200));
        cols.add(new ColText("corrElecCont", "Correo contacto", 200));
        return cols;
    }

    private TDateField fechrelaprocFld;
    private TLookupField periconvLku;
    private TLookupField perssistLku;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
    public ArrayList genFieldsForm() {
        ArrayList<BaseField> flds = new ArrayList();
        flds.add(fechrelaprocFld = new TDateField(0, 0, "FechRelaProc", "Fecha", true) {
            @Override
            public String validate(Object obj, Object value) {
                String pkeyperita = control.inEventSolveCondition(node, new Cond("PeriConV", "pkeyPeriCons"));
                CJD_PersonPeritaDao perPeriDao = new CJD_PersonPeritaDao();
                perPeriDao.setConditions("fkeypericons=" + pkeyperita);
                CJD_PersonProcesDto perPerDto = (CJD_PersonProcesDto) perPeriDao.findFirst();
                String mjs = "";
                if (perPerDto != null) {
                    mjs = "Ya existe un usuario asociado al peritaje";
                    return mjs;
                }
                return "";
            }
        });
//-------------------------------------------------------- | CJDVPeritaConsul
//        CJDVPeritaConsulDao periconvDao = new CJDVPeritaConsulDao();
//        periconvDao.setOrderBy("");
//        periconvLku = new TLookupField(1, 0, "FkeyPeriConsDto", "Peritaje consultorio jurídico (VISTA)", periconvDao, true);
//       periconvLku.setFullLoad(true);
//       periconvLku.addSeekField(new TField("",""));
//        flds.add(periconvLku);
//-------------------------------------------------------- | CJD_PersonSistem
        CJD_PersonSistemDao perssistDao = new CJD_PersonSistemDao();
        perssistDao.setOrderBy("");
        perssistLku = new TLookupField(0, 1, "FekyPersSistDto", "CJD_PersonSistem", perssistDao, true);
        perssistLku.setFullLoad(true);
        perssistLku.setSeekFields(
                new ArrayList(Arrays.asList(
                                new TField("nombConcPres", "Buscar por nombre"),
                                new TField("codiConcPres", "Buscar por código"))));
//       perssistLku.addSeekField(new TField("",""));
        flds.add(perssistLku);
        return flds;
    }

}
