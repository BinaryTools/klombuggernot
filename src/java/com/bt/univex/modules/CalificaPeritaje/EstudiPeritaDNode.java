package com.bt.univex.modules.CalificaPeritaje;

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
import com.bt.univex.def.data.DEFVPeriPlanProgDao;
import com.bt.univex.def.data.DEFVPeriPlanProgDto;
import com.xpc.conditions.data.Cond;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;

public class EstudiPeritaDNode {

//  EstuPeri
    private ControlNode control;
    private SNode node;
    private TGrifo grifo;
    private String style;
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------

    public void createGrifo(int id, int indent, int parent, final ControlNode ctrl) {
        control = ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id, indent, parent, "Estudiante asignado al peritaje");
        final CJD_EstudiPeritaDao estuperiDao = new CJD_EstudiPeritaDao();
        grifo = new TGrifo(SNode.NODE_ID, estuperiDao) {
            @Override
            public BaseDto convertDto(BaseDto inDto) {
//                CJD_AnexosConsulDao anexDao2 = new CJD_AnexosConsulDao();
                return estuperiDao.findDtoByPkey(inDto.toInt(), 1);
            }

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
                fechasigperiFld.setEnabled(false);
                fechentrperiFld.setEnabled(false);
                CJD_EstudiPeritaDto estPerDto = (CJD_EstudiPeritaDto) grifo.getForm().getObject();
                Double a = estPerDto.getNotaPeritaje();
                CJD_PeritaConsulDao perConDao = new CJD_PeritaConsulDao();
                perConDao.setConditions("pkeypericons = "+estPerDto.getFkeyPeriCons());
                CJD_PeritaConsulDto perConDto = (CJD_PeritaConsulDto) perConDao.findFirst();
                
                DEFVPeriPlanProgDao perPlaDao = new DEFVPeriPlanProgDao();
                perPlaDao.setConditions("indiacticarg = 'S' and fkeyprogacad = 565");
                DEFVPeriPlanProgDto perPlaDto = (DEFVPeriPlanProgDto) perPlaDao.findFirst();
                int periPlanAct = perPlaDto.getPkeyPeriPlan();
                if (perConDto.getFkeyPeriPlan() == periPlanAct) {
                    if (a == null || a == -1.0 || a == 0.0) {
                        notaperitajeFld.setEnabled(true);
                    }else{
                        notaperitajeFld.setEnabled(false);
                    }
                }else{
                    notaperitajeFld.setEnabled(false);
                }
            }
            
            
        };
        grifo.setCanDel(false);
        grifo.setCanIns(false);
//---------------------------- CREAR GRID 
        CJDVEstudiPeritaProv estuperiProv = new CJDVEstudiPeritaProv();
        grifo.createGrid(genFieldsGrid(), estuperiProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Estudiante asignado al peritaje");
//---------------------------- CREAR FORM 
        CJD_EstudiPeritaDto estuperiDto = CJD_EstudiPeritaDao.getDefaultDto();
        grifo.createForm(genFieldsForm(), estuperiDto);
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
        CJD_EstudiPeritaProv estuperiProv = new CJD_EstudiPeritaProv();
        node = new SNode(id, indent, parent, "Estudiante asignado al peritaje");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), estuperiProv);
        gridNode.setTitle("Estudiante asignado al peritaje");
//        gridNode.addCond(new Cond(""," = ","", ""));
        node.add(gridNode);
        ctrl.add(node);
    }

    ///---------------------------------| FIN
//========================================================================
// CAMPOS DE LA GRILLA 
    public ArrayList<TColumn> genFieldsGrid() {
        ArrayList<TColumn> cols = new ArrayList();
        cols.add(new ColText("", "Estado", 120) {

            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVEstudiPeritaDto dto = (CJDVEstudiPeritaDto) getChild();
                String estado = "";
                if (dto.getFechEntrPeri() == null) {
                    estado = "Activo";
                    style = "background-color:#8BEAA9";
                } else {
                    estado = "Inactivo";
                    style = "";
                }
                parent.add(new AttributeModifier("style", style));
                Label label = new Label(id, estado);
                parent.add(label);
                setComponent(label);

            }
        });
        cols.add(new ColText("FechAsigPeri", "Fecha", 120));
        cols.add(new ColText("FechEntrPeri", "Fecha", 120));
//        cols.add(new ColText("NotaPeritaje", "NotaPeritaje", 180));
        cols.add(new ColText("NotaPeritaje", "Nota Peritaje", 180) {

            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVEstudiPeritaDto dto = (CJDVEstudiPeritaDto) getChild();
                Double notaActual = dto.getNotaPeritaje();
                double valofina;
                if (notaActual == -1.0) {
                    valofina = 0.0;
                } else {
                    valofina = dto.getNotaPeritaje();
                }
                Label label = new Label(id, valofina);
                parent.add(label);
                setComponent(label);
//                super.showData(id, parent, obj); //To change body of generated methods, choose Tools | Templates.
            }

        });
        cols.add(new ColText("FechNotaPeri", "Fecha Calificación", 120));
        return cols;
    }

    private TDateField fechasigperiFld;
    private TDateField fechentrperiFld;
    private TEditField notaperitajeFld;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
    public ArrayList genFieldsForm() {
        ArrayList<BaseField> flds = new ArrayList();
        flds.add(fechasigperiFld = new TDateField(0, 0, "FechAsigPeri", "Fecha", true));
        flds.add(fechentrperiFld = new TDateField(0, 1, "FechEntrPeri", "Fecha", false));
        flds.add(notaperitajeFld = new TEditField(0, 2, "NotaPeritaje", "NotaPeritaje", false) {

            @Override
            public String validate(Object obj, Object value) {
                CJD_EstudiPeritaDto estPerDto = (CJD_EstudiPeritaDto) grifo.getForm().getObject();

                Double valor = (Double) value;
                String error = "";
                if (valor != null) {
                    if (valor < 0.0) {
                        error = "la nota no puede ser un valor negativo";
                    }else{
                        estPerDto.setFechNotaPeri(new Date());
                    }
                }
                if (estPerDto.getNotaPeritaje() == null) {
                    estPerDto.setNotaPeritaje(-1.0);
                }
                return error;
            }
        });
        return flds;
    }

}
