package com.bt.univex.modules.CalificaProceso;

import java.util.*;
import com.xpc.forms.field.*;
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.*;
import com.xpc.base.BaseDto;
import com.xpc.conditions.data.Cond;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;

public class EstudiProcesDNode {

//  EstuProc
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
        node = new SNode(id, indent, parent, "Estudiantes del proceso");
        final CJD_EstudiProcesDao estuprocDao = new CJD_EstudiProcesDao();
        grifo = new TGrifo(SNode.NODE_ID, estuprocDao) {
            @Override
            public BaseDto convertDto(BaseDto inDto) {
//                CJD_AnexosConsulDao anexDao2 = new CJD_AnexosConsulDao();
                return estuprocDao.findDtoByPkey(inDto.toInt(), 1);
            }

            @Override
            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
                fechasigprocFld.setEnabled(false);
                CJD_EstudiProcesDto estPerDto = (CJD_EstudiProcesDto) grifo.getForm().getObject();
                if(estPerDto.getFechEntrProc()==null) {
                    fechentrprocFld.setEnabled(true);
                }else{
                    fechentrprocFld.setEnabled(false);
                }
//                if (estPerDto.getFechEntrProc() == null) {
//                    Double a = estPerDto.getNotaProcCons();
//                    if (a == null || a == -1.0 || a == 0.0) {
//                        notaprocconsFld.setEnabled(true);
//                    } else {
//                        notaprocconsFld.setEnabled(false);
//                    }
//                } else {
                    notaprocconsFld.setEnabled(false);
//                }

                super.onActivateForm(art, inDto); //To change body of generated methods, choose Tools | Templates.
            }
        };
        grifo.setCanDel(false);
        grifo.setCanIns(false);
//---------------------------- CREAR GRID 
        CJDVEstudiProcesProv estuProcV = new CJDVEstudiProcesProv();
        grifo.createGrid(genFieldsGrid(), estuProcV);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("CJD_EstudiProces");
//---------------------------- CREAR FORM 
        CJD_EstudiProcesDto estuprocDto = CJD_EstudiProcesDao.getDefaultDto();
        grifo.createForm(genFieldsForm(), estuprocDto);
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
        CJDVEstudiProcesProv estuprocProv = new CJDVEstudiProcesProv();
        node = new SNode(id, indent, parent, "Estudiantes del proceso");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), estuprocProv);
        gridNode.setTitle("CJD_EstudiProces");
        gridNode.addCond(new Cond("fkeyProcCons", " = ", "ProcConsV", "pkeyProcCons"));
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
                CJDVEstudiProcesDto dto = (CJDVEstudiProcesDto) getChild();
                String estado = "";
                if (dto.getFechEntrProc() == null) {
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
        cols.add(new ColText("CodiEstudian", "Codigo Estudiante", 120));
//       cols.add(new ColText("EstaActiEstu","Estado Estudiante",120));
//       cols.add(new ColText("EstaAcadEstu","Estado Académico Estudiante",120));
        cols.add(new ColText("NombEstudian", "Nombre Estudiante", 120));
        cols.add(new ColText("ApelEstudian", "Apellido Estudiante", 120));
        cols.add(new ColText("SeguApelEstu", "Segundo Apellido", 120));
        cols.add(new ColText("FechAsigProc", "Fecha Asignación", 120));
        cols.add(new ColText("FechEntrProc", "Fecha Entrega", 120));
        cols.add(new ColText("NotaProcCons", "Nota Proceso", 180) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                // Si no han digitado (-1) muestra cero
                CJDVEstudiProcesDto dto = (CJDVEstudiProcesDto) getChild();
                Double notaActual = dto.getNotaProcCons();
                double valofina;
                if (notaActual == -1.0) {
                    valofina = 0.0;
                } else {
                    valofina = dto.getNotaProcCons();
                }
                Label label = new Label(id, valofina);
                parent.add(label);
                setComponent(label); 
            }

        });
        return cols;
    }

    private TDateField fechasigprocFld;
    private TDateField fechentrprocFld;
    private TEditField notaprocconsFld;
    private TLookupField procconsLku;
    private TLookupField estudianLku;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
    public ArrayList genFieldsForm() {
        ArrayList<BaseField> flds = new ArrayList();
        flds.add(fechasigprocFld = new TDateField(0, 0, "FechAsigProc", "Fecha Asignación", false));
        fechasigprocFld.setEnabled(false);
        flds.add(fechentrprocFld = new TDateField(0, 1, "FechEntrProc", "Fecha Entrega", false));
//        fechentrprocFld.setEnabled(false);
        flds.add(notaprocconsFld = new TEditField(0, 2, "NotaProcCons", "Nota proceso", true) {
            @Override
            public String validate(Object obj, Object value) {
                Double valor = (Double) value;
                CJD_EstudiProcesDto estProDto = (CJD_EstudiProcesDto) grifo.getForm().getObject();
                String error = "";
                if (valor != null) {
                    if (valor < 0.0) {
                        error = "la nota no puede ser un valor negativo";
                    } else {
                        estProDto.setFechNotaProc(new Date());
                    }
                } else {
                    estProDto.setNotaProcCons(-1.0);
                }
                return error; //To change body of generated methods, choose Tools | Templates.
            }
        });

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
//        ADS_EstudiUniverDao estudianDao = new ADS_EstudiUniverDao();
//        estudianDao.setOrderBy("");
//        estudianLku = new TLookupField(1, 0, "FkeyEstudianDto", "Estudiantes", estudianDao, true);
//        estudianLku.setFullLoad(true);
//        estudianLku.setSeekFields(
//                new ArrayList(Arrays.asList(
//                                new TField("nombEstudian", "Buscar por nombre"),
//                                new TField("codiEstudian", "Buscar por código"))));
////       estudianLku.addSeekField(new TField("",""));
//        flds.add(estudianLku);
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
