package com.bt.univex.modules.RevisarProcesosArea;

import com.bt.univex.ads.data.ADS_PeriodAcademDao;
import com.bt.univex.ads.data.ADS_PeriodAcademDto;
import java.util.*;
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.*;
import com.xpc.app.BinarySession;
import com.xpc.conditions.data.Cond;
import java.text.SimpleDateFormat;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;

public class NotaEstuProcNode {

//  NotEstPr
    private ControlNode control;
    private SNode node;
    private TGrifo grifo;
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------
//    String PkeyEstu;
    String pkeyPeri;
    String style;
//
//    public void createGrifo(int id, int indent, int parent, final ControlNode ctrl) {
////        BinarySession session = (BinarySession) ctrl.getSession();
////        PkeyEstu = session.getParameter("ESTUDIANTE");
////        pkeyPeri = session.getParameter("PERIODO");
//        control = ctrl;
////---------------------------- CREAR NODE 
//        node = new SNode(id, indent, parent, "Nota del estudiante(Por periodo)");
//        final CJD_NotaEstuProcDao notestprDao = new CJD_NotaEstuProcDao();
//        grifo = new TGrifo(SNode.NODE_ID, notestprDao) {
//            
//            @Override
//            public void onActivateForm(AjaxRequestTarget art, BaseDto inDto) {
//                CJD_NotaEstuProcDto nepDto = (CJD_NotaEstuProcDto) inDto;
//                if (nepDto.getPkeyNotaEstu() != 0) {//ModificaciÒn
//                    nepDto.setFechActuNota(new Date());
//                } 
//            }
//
//            @Override
//            public BaseDto onNew(AjaxRequestTarget art, BaseDto inDto) {
//                CJD_NotaEstuProcDto nepDto = (CJD_NotaEstuProcDto) inDto;
//                pkeyPeri = control.inEventSolveCondition(4, new Cond("PeriPlan", "fkeyPeriAcad"));
//                    String fkeyEstuProc = control.inEventSolveCondition(4, new Cond("EstuProc", "pkeyEstuProc"));
//                    CJD_NotaEstuProcDao nepDao = new CJD_NotaEstuProcDao();
//                    nepDao.setConditions("fkeyEstuProc in (" + fkeyEstuProc + ")"+" and fkeyPeriAcad ="+pkeyPeri);
//                    CJD_NotaEstuProcDto nepFiltroDto = (CJD_NotaEstuProcDto) nepDao.findFirst();
//                    if (nepFiltroDto == null) {
//                        nepDto.setFkeyPeriAcad(Integer.parseInt(pkeyPeri));
//                        nepDto.setFechRegiNota(new Date());
//                        notaestuprocFld.setEnabled(true);
//                    }else {
////                        grifo.setCanIns(false);
////                        ADS_PeriodAcademDao paDao = new ADS_PeriodAcademDao();
////                        ADS_PeriodAcademDto paDto = (ADS_PeriodAcademDto) paDao.findByPkey(Integer.parseInt(pkeyPeri));
////                        String advertencia = "Ya existe un registro de nota para el periodo "+paDto.getNombPeriAcadDesc();
//                        notaestuprocFld.setEnabled(false);
//                    }
//                return inDto;
//            }
//
//            
//        };
//        
//        grifo.setCanDel(false);
////---------------------------- CREAR GRID 
//        CJD_NotaEstuProcProv notestprProv = new CJD_NotaEstuProcProv();
//        grifo.createGrid(genFieldsGrid(), notestprProv);
////        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
////              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
//        grifo.setTitle("CJD_NotaEstuProc");
////---------------------------- CREAR FORM 
//        CJD_NotaEstuProcDto notestprDto = CJD_NotaEstuProcDao.getDefaultDto();
//        grifo.createForm(genFieldsForm(), notestprDto);
//        grifo.addCondGrid(new Cond("fkeyEstuProc", " = ", "EstuProcV", "pkeyEstuProc"));
//        grifo.addDefaults(new Cond("fkeyEstuProc", " = ", "EstuProcV", "pkeyEstuProc"));
//        node.add(grifo);
//        ctrl.add(node);
//    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
    private TGridNode gridNode;

    public void createFinder(int id, int indent, int parent, final ControlNode ctrl) {
        BinarySession session = (BinarySession) ctrl.getSession();
//        PkeyEstu = session.getParameter("ESTUDIANTE");
        pkeyPeri = session.getParameter("PERIODO");
        control = ctrl;
        CJD_NotaEstuProcProv notestprProv = new CJD_NotaEstuProcProv();
        node = new SNode(id, indent, parent, "Nota del estudiante(Por periodo)");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), notestprProv);
        gridNode.setTitle("CJD_NotaEstuProc");
        gridNode.addCond(new Cond("fkeyEstuProc", " = ", "EstuProcV", "pkeyEstuProc"));
        node.add(gridNode);
        ctrl.add(node);
    }

 ///---------------------------------| FIN
//========================================================================
// CAMPOS DE LA GRILLA 
    public ArrayList<TColumn> genFieldsGrid() {
        ArrayList<TColumn> cols = new ArrayList();
        
        cols.add(new ColText("", "Periodo", 120) {

            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJD_NotaEstuProcDto dto = (CJD_NotaEstuProcDto) getChild();
                String estado = "";
                ADS_PeriodAcademDto periAcadDto = (ADS_PeriodAcademDto) (new ADS_PeriodAcademDao()).findByPkey(dto.getFkeyPeriAcad());
                if (dto.getFkeyPeriAcad() == Integer.parseInt(pkeyPeri)) {
                    estado = periAcadDto.getAnnoPeriAcad() + " - " + periAcadDto.getNumePeriAcadDesc()+"  (Actual)";
                    style = "background-color:#8BEAA9";
                } else {
                    estado = periAcadDto.getAnnoPeriAcad()+" - "+periAcadDto.getNumePeriAcadDesc();
                    style = "";
                }
                parent.add(new AttributeModifier("style", style));
                Label label = new Label(id, estado);
                parent.add(label);
                setComponent(label);

            }

        });
        cols.add(new ColText("NotaEstuProc", "Nota", 180) {

            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                // Si no han digitado (-1) muestra cero
                CJD_NotaEstuProcDto dto = (CJD_NotaEstuProcDto) getChild();
                Double notaActual = dto.getNotaEstuProc();
                double valofina;
                if (notaActual == -1.0) {
                    valofina = 0.0;
                } else {
                    valofina = dto.getNotaEstuProc();
                }
                Label label = new Label(id, valofina);
                parent.add(label);
                setComponent(label); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        cols.add(new ColText("FechRegiNota", "Fecha de registro", 120){
        
           @Override
           public void showData(String id, WebMarkupContainer parent, Object obj) {
               CJD_NotaEstuProcDto consVDto = (CJD_NotaEstuProcDto) getChild();
               Label label = new Label(id,aplicarFormatoFechaYHora(consVDto.getFechRegiNota()));
               parent.add(label);
               setComponent(label);
           }
        });
        cols.add(new ColText("FechActuNota", "Fecha de actualización", 120){
        
           @Override
           public void showData(String id, WebMarkupContainer parent, Object obj) {
               CJD_NotaEstuProcDto consVDto = (CJD_NotaEstuProcDto) getChild();
               Label label = new Label(id,aplicarFormatoFechaYHora(consVDto.getFechActuNota()));
               parent.add(label);
               setComponent(label);
           }
        });
        return cols;
    }
    
    private String aplicarFormatoFechaYHora(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String strFecha = " ";
        String strHora = " ";
        if (fecha != null) {
            strFecha = sdf.format(fecha);
            strHora = sdf2.format(fecha);
        }
        return strFecha + " - " + strHora;
    }

//    private TEditField notaestuprocFld;
//    private TDateField fechreginotaFld;
//    private TDateField fechactunotaFld;
//    private TLookupField periacadLku;

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
//    public ArrayList genFieldsForm() {
//        ArrayList<BaseField> flds = new ArrayList();
//        flds.add(notaestuprocFld = new TEditField(0, 0, "NotaEstuProc", "Nota", false));
////       flds.add(fechreginotaFld= new TDateField    (0,1,"FechRegiNota","Fecha de registro",false));
////       flds.add(fechactunotaFld= new TDateField    (0,2,"FechActuNota","Fecha de actualización",false));
////-------------------------------------------------------- | ADS_PeriodAcadem
////       ADS_PeriodAcademDao periacadDao = new ADS_PeriodAcademDao();
////       periacadDao.setOrderBy("");
////       periacadLku = new TLookupField(1,0,"FkeyPeriAcadDto","Período Académico",periacadDao,true); 
//////       periacadLku.setFullLoad(true);
//////       periacadLku.addSeekField(new TField("",""));
////       flds.add(periacadLku);
//        return flds;
//    }

}
