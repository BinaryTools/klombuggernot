package com.bt.univex.modules.CalificaPeritaje;

import com.bt.univex.ads.data.ADS_ParameGlobalDao;
import com.bt.univex.ads.data.ADS_ParameGlobalDto;
import java.util.*;
import com.xpc.base.*;
import com.xpc.forms.field.*;
import com.xpc.grid.column.*;
import com.xpc.snode.ControlNode;
import com.xpc.grifo.TGrifo;
import com.xpc.snode.finder.TGridNode;
import com.xpc.snode.SNode;
import com.bt.univex.cjd.data.*;
import com.bt.univex.def.data.*;
import com.xpc.app.BinarySession;
import com.xpc.base.data.TField;
import com.xpc.conditions.data.Cond;
import com.xpc.forms.TPreForm;
import com.xpc.grid.TGrid;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;

public class PeritaConsulDNode {

//  PeriCosu
    private ControlNode control;
    private SNode node;
    private TGrifo grifo;

    private String PkeyDoce;
    private String PkeyPeri;
    private int pkeyDoceEspe;
    private String style;
    private String lastInfo;
//------------------------------------------------------------------------
// GRIFO: Grilla y Formulario 
//------------------------------------------------------------------------

    public void createGrifo(int id, int indent, int parent, final ControlNode ctrl) {

        control = ctrl;
//---------------------------- CREAR NODE 
        node = new SNode(id, indent, parent, "Peritaje consultorio jurídico");
        final CJD_PeritaConsulDao pericosuDao = new CJD_PeritaConsulDao();
        grifo = new TGrifo(SNode.NODE_ID, pericosuDao);

//---------------------------- CREAR GRID 
        CJDVPeritaConsulProv pericosuProv = new CJDVPeritaConsulProv();
        grifo.createGrid(genFieldsGrid(), pericosuProv);
//        grifo.getGrid().btnInactive(TGridNav.BTN_CHK)
//              .btnActive(TGridNav.BTN_NEW).btnInactive(TGridNav.BTN_UNCHK);
        grifo.setTitle("Peritaje consultorio jurídico");
//---------------------------- CREAR FORM 
        CJD_PeritaConsulDto pericosuDto = CJD_PeritaConsulDao.getDefaultDto();
        grifo.createForm(genFieldsForm(), pericosuDto);
//        grifo.addCondGrid(new Cond(""," = ","", ""));
//        grifo.addDefaults(new Cond(""," = ","", ""));
        grifo.getGrid().addOnTop(panelInterno());
        node.add(grifo);
        ctrl.add(node);
    }

//------------------------------------------------------------------------
// GRIDMode: Grilla para realizar búsquedas 
//------------------------------------------------------------------------
    private TGridNode gridNode;

    public void createFinder(int id, int indent, int parent, final ControlNode ctrl) {
        BinarySession session = (BinarySession) ctrl.getSession();
        PkeyDoce = session.getParameter("DOCENTE");
        PkeyPeri = session.getParameter("PERIODO");
        CJD_DocentEspeciDao doceDao = new CJD_DocentEspeciDao();
        doceDao.setConditions("fkeyProfesor = " + PkeyDoce);
        CJD_DocentEspeciDto doceDto = (CJD_DocentEspeciDto) doceDao.findFirst();
        if (doceDto != null) {
            pkeyDoceEspe = doceDto.getPkeyDoceEspe();
        } else {
            pkeyDoceEspe = 0;
        }

        control = ctrl;
        CJDVPeritaConsulProv pericosuProv = new CJDVPeritaConsulProv();

        if (pkeyDoceEspe != 0) {
            pericosuProv.getDao().setConditions("fkeyDoceEspe = " + pkeyDoceEspe + " and estaperitaje not in ('F')");
        }else{
            pericosuProv.getDao().setConditions("PkeyPeriCons = 0");
        }

        node = new SNode(id, indent, parent, "Peritaje consultorio jurídico");
        gridNode = new TGridNode(SNode.NODE_ID, genFieldsGrid(), pericosuProv);
        gridNode.setTitle("Peritaje consultorio jurídico");
//        gridNode.addCond(new Cond("fkeyDoceEspe", " = ", "DoceEspeV", "pkeyDoceEspe"));
        node.add(gridNode);
        ctrl.add(node);
    }

    ///---------------------------------| FIN
//========================================================================
// CAMPOS DE LA GRILLA 
    public ArrayList<TColumn> genFieldsGrid() {
        ArrayList<TColumn> cols = new ArrayList();
        cols.add(new ColText("NombPeritaje", "Nombre Peritaje", 200) {

            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVPeritaConsulDto perConDto = (CJDVPeritaConsulDto) getChild();
                super.showData(id, parent, obj);
                String info = obj.toString();
                if ("F".equals(perConDto.getEstaPeritaje())) {
                    style = "background-color:#E6E6E6";
                } else {
                    style = "";
                }
                lastInfo = info;
                parent.add(new AttributeModifier("style", style));
            }

        });
        cols.add(new ColText("AreaPeritaje", "ÁreaPeritaje", 120) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVPeritaConsulDto perConDto = (CJDVPeritaConsulDto) getChild();
                super.showData(id, parent, obj);
                String info = obj.toString();
                if ("F".equals(perConDto.getEstaPeritaje())) {
                    style = "background-color:#E6E6E6";
                } else {
                    style = "";
                }
                lastInfo = info;
                parent.add(new AttributeModifier("style", style));
            }
        });
        cols.add(new ColText("DescPeritaje", "Descripción Peritaje", 400) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVPeritaConsulDto perConDto = (CJDVPeritaConsulDto) getChild();
                super.showData(id, parent, obj);
                String info = obj.toString();
                if ("F".equals(perConDto.getEstaPeritaje())) {
                    style = "background-color:#E6E6E6";
                } else {
                    style = "";
                }
                lastInfo = info;
                parent.add(new AttributeModifier("style", style));
            }
        });
        cols.add(new ColText("NumePeritaje", "Número Fiscalía", 200) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVPeritaConsulDto perConDto = (CJDVPeritaConsulDto) getChild();
                super.showData(id, parent, obj);
                String info = obj.toString();
                if ("F".equals(perConDto.getEstaPeritaje())) {
                    style = "background-color:#E6E6E6";
                } else {
                    style = "";
                }
                lastInfo = info;
                parent.add(new AttributeModifier("style", style));
            }
        });
        cols.add(new ColText("EstaPeritaje", "Estado Peritaje", 120) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVPeritaConsulDto perConDto = (CJDVPeritaConsulDto) getChild();
                super.showData(id, parent, obj);
                String info = obj.toString();
                if ("F".equals(perConDto.getEstaPeritaje())) {
                    style = "background-color:#E6E6E6";
                } else {
                    style = "";
                }
                lastInfo = info;
                parent.add(new AttributeModifier("style", style));
            }
        });
        cols.add(new ColText("OrigPeriCons", "Origen", 120) {
            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVPeritaConsulDto perConDto = (CJDVPeritaConsulDto) getChild();
                super.showData(id, parent, obj);
                String info = obj.toString();
                if ("F".equals(perConDto.getEstaPeritaje())) {
                    style = "background-color:#E6E6E6";
                } else {
                    style = "";
                }
                lastInfo = info;
                parent.add(new AttributeModifier("style", style));
            }
        });
        cols.add(new ColText("NombCompProf", "Estudiante Asignado", 120) {

            @Override
            public void showData(String id, WebMarkupContainer parent, Object obj) {
                CJDVPeritaConsulDto perConDto = (CJDVPeritaConsulDto) getChild();
                CJDVEstudiPeritaDao estPerDao = new CJDVEstudiPeritaDao();
                estPerDao.setConditions("fkeypericons=" + perConDto.getPkeyPeriCons());
                CJDVEstudiPeritaDto estPerDto = (CJDVEstudiPeritaDto) estPerDao.findFirst();
                String total = "";
                if (estPerDto != null) {
                    total = estPerDto.getNombEstudian() + " " + estPerDto.getApelEstudian() + " " + estPerDto.getSeguApelEstu();
                } else {
                    total = "Estudiante sin asignar";
                }
                if ("F".equals(perConDto.getEstaPeritaje())) {
                    style = "background-color:#E6E6E6";
                } else {
                    style = "";
                }
                parent.add(new AttributeModifier("style", style));
                Label label = new Label(id, total);
                parent.add(label);
                setComponent(label);
            }
        });

        return cols;
    }

    private TEditField nombperitajeFld;
    private TStaticField areaperitajeFld;
    private TMemoField descperitajeFld;
    private TEditField numeperitajeFld;
    private TStaticField estaperitajeFld;
    private TStaticField origpericonsFld;
    private TLookupField doceespeLku;
    private TLookupField periplanLku;
    private GText text;
    private TButton btnDoc;
    String infoProfe;
    private TButton btnEst;

    public TPreForm panelInterno() {
        ArrayList flds = new ArrayList();

        flds.add(text = new GText(1, 0, new PropertyModel(this, "infoProfe")));
        flds.add(btnDoc = new TButton(0, 0, "ASIGNAR DOCENTES", TButton.BTN_SIZE_NORMAL + TButton.BTN_COLOR_SUCCESS) {

            @Override
            public void onClick(AjaxRequestTarget art) {
                CJD_PeritaConsulDao perConDao = new CJD_PeritaConsulDao();
                perConDao.setConditions("(fkeyDoceEspe is null or fkeyDoceEspe=0)");
                ArrayList<CJD_PeritaConsulDto> vecper = perConDao.loadAll();//Peritagen sin docentes
                for (int i = 0; i < vecper.size(); i++) {
                    CJD_PeritaConsulDto perCon1Dto = (CJD_PeritaConsulDto) vecper.get(i);
                    CJD_DocentEspeciDao doceEspeDao = new CJD_DocentEspeciDao();
                    CJD_DocentEspeciDto docEspCoDto = new CJD_DocentEspeciDto();
                    doceEspeDao.setConditions("doceEspecial='" + perCon1Dto.getAreaPeritaje() + "' and (estaDoceActi='S' or estaDoceActi is null)  and fkeyProfesor in (select pkeyProfesor from crg_docentuniver where estaactiprof='S')");
                    ArrayList<CJD_DocentEspeciDto> vecDocEsp = doceEspeDao.loadAll();//docente que aplican para el peritaje
                    int[][] contProc = new int[2][vecDocEsp.size()];
                    for (int j = 0; j < vecDocEsp.size(); j++) {
                        docEspCoDto = (CJD_DocentEspeciDto) vecDocEsp.get(j);
                        CJD_PeritaConsulDao perConAsDao = new CJD_PeritaConsulDao();
                        perConAsDao.setConditions("fkeyDoceEspe=" + docEspCoDto.getPkeyDoceEspe() + "and estaperitaje = 'I'");
                        Vector vecCuePro = perConAsDao.findAll();
                        int capMax = docEspCoDto.getCantPeriDoce();//capacidad maxima de peritajes del docente
                        int canAct = vecCuePro.size();// cantidad actual de peritajes
                        if (canAct < capMax) {
                            contProc[0][j] = vecDocEsp.get(j).getPkeyDoceEspe();//vector con pkey del docente y cantidad actual de peritajes
                            contProc[1][j] = canAct;
                        }
                    }
                    /**
                     * ordenar la matriz de forma ascendente y de esta forma
                     * asignar el priemro de la lista cumpliendo el requisito de
                     * q sea menor que la cantidad maxima de peritajes
                     */
                    int pkDoce = ordenarDocentes(contProc, vecDocEsp.size());
                    String palAre = "";
                    if (pkDoce != 0) {
                        perCon1Dto.setFkeyDoceEspe(pkDoce);
                        CJD_EstudiPeritaDao estPerDao = new CJD_EstudiPeritaDao();
                        estPerDao.setConditions("fkeyPeriCons=" + perCon1Dto.getPkeyPeriCons() + " and fechEntrPeri is null");
                        CJD_EstudiPeritaDto estPerDto = (CJD_EstudiPeritaDto) estPerDao.findFirst();
                        if (estPerDto != null) {
                            perCon1Dto.setEstaPeritaje("E");
                        }
                        perConDao.updateDto(perCon1Dto);
                    } else {
                        if (perCon1Dto.getAreaPeritaje() == "C") {
                            palAre = "Civil";
                        } else if (perCon1Dto.getAreaPeritaje() == "P") {
                            palAre = "Público";
                        } else if (perCon1Dto.getAreaPeritaje() == "L") {
                            palAre = "Laboral";
                        } else if (perCon1Dto.getAreaPeritaje() == "O") {
                            palAre = "Concilicación";
                        } else {
                            palAre = "Penal";
                        }
                        infoProfe = "No Hay docentes disponibles para la asignar al proceso, por favor aumentar el máximo de procesos de los docentes pertenecientes al área " + palAre;
                        art.add(text.getContent());
                        perCon1Dto.setFkeyDoceEspe(null);//null en caso de que todos los docentes tengan el maximo tope de procesos
                        perConDao.updateDto(perCon1Dto);
                    }
                    art.add(grifo.getGrid());
                }
                super.onClick(art); //To change body of generated methods, choose Tools | Templates.
            }

        });
        flds.add(btnEst = new TButton(0, 1, "ASIGNAR ESTUDIANTES", TButton.BTN_SIZE_NORMAL + TButton.BTN_COLOR_SUCCESS) {

            @Override
            public void onClick(AjaxRequestTarget art) {
                int bandera = 0;
                ADS_ParameGlobalDao parGloDao = new ADS_ParameGlobalDao();
                ADS_ParameGlobalDto ParGloDto = (ADS_ParameGlobalDto) parGloDao.findByPkey(215);
                String periAcad = ParGloDto.getValoParaGlob();
                DEFVPeriPlanProgDao perPlaDao = new DEFVPeriPlanProgDao();
                perPlaDao.setConditions("FkeyProgAcad = 565 and indiacticarg = 'S'");
                DEFVPeriPlanProgDto perPlaDto = (DEFVPeriPlanProgDto) perPlaDao.findFirst();

//                CJDVEstudiAplicaDao estAplDao = new CJDVEstudiAplicaDao();
//                estAplDao.setConditions("fkeyPeriPlan in (select pkeyperiplan from defvperiplanprog where fkeyprogacad = 565 and indiacticarg = 'S')");
//                CJDVEstudiAplicaDto estAplDto;
                CJD_EstudiPeritaDao estPerDao = new CJD_EstudiPeritaDao();
                CJD_EstudiPeritaDto estPerDto;

                CJD_EstudiPeritaDao estPer2Dao = new CJD_EstudiPeritaDao();
                CJD_EstudiPeritaDto estPer2Dto;

                CJD_PeritaConsulDao perConDao = new CJD_PeritaConsulDao();
                perConDao.setConditions("estaperitaje not in ('F') and pkeyperiCons not in (select fkeypericons from cjd_estudiperita where fechEntrPeri is null)");
                ArrayList<CJD_PeritaConsulDto> vecPer = perConDao.loadAll();//peritajes sin asiganar estudiantes
                for (int i = 0; i < vecPer.size(); i++) {
                    int pkPeri = vecPer.get(i).getPkeyPeriCons();
                    estPerDao.setConditions("fkeypericons = " + pkPeri);
                    estPerDto = (CJD_EstudiPeritaDto) estPerDao.findFirst();
                    CJD_EstudiPeritaDao estPer1Dao = new CJD_EstudiPeritaDao();
                    estPer1Dao.setConditions("fkeypericons =" + pkPeri + " and fechentrperi is null");
                    CJD_EstudiPeritaDto estPer1Dto = (CJD_EstudiPeritaDto) estPer1Dao.findFirst();
                    if (estPer1Dto != null) {
                        if (estPerDto != null) {//revisa si el peritaje ya tenia estudiante asignado
                            CJDVEstudiAplicaDao estAplDao = new CJDVEstudiAplicaDao();
                            estAplDao.setConditions("fkeyPeriPlan in (select pkeyperiplan from defvperiplanprog where fkeyprogacad = 565 and indiacticarg = 'S') and fkeyestudian=" + estPerDto.getFkeyEstudian());
                            CJDVEstudiAplicaDto estAplDto = (CJDVEstudiAplicaDto) estAplDao.findFirst();
                            if (estAplDto != null) {
                                bandera = 0;
                            } else {
                                bandera = 1;
                            }
                        } else {
                            bandera = 1;
                        }
                    } else {
                        bandera = 1;
                    }

                    if (bandera == 0) {//ASIGNA ESTUDIANTE QUE TIENE A CARGO EL peritaje ANTERIORMENTE Y ESTA HABILITADO PARA ASIGNARLE
                        estPer2Dto = new CJD_EstudiPeritaDto();
                        estPer2Dto.setPkeyEstuPeri(0);
                        estPer2Dto.setFkeyEstudian(estPerDto.getFkeyEstudian());
                        estPer2Dto.setFkeyPeriCons(estPerDto.getFkeyPeriCons());
                        estPer2Dto.setFechAsigPeri(new Date());
                        estPer2Dto.setFechEntrPeri(null);
                        estPer2Dto.setNotaPeritaje(null);
                        estPer2Dao.insertDto(estPer2Dto);
                    } else if (bandera == 1) {
                        CJDVEstudiAplicaDao estAplDao = new CJDVEstudiAplicaDao();
                        ArrayList<CJDVEstudiAplicaDto> vecEstu = estAplDao.loadAll();
                        int[][] contProc = new int[2][vecEstu.size()];
                        for (int j = 0; j < vecEstu.size(); j++) {//LLENA MATRIZ CON PKEY ESTUDIAN Y NUMERO DE peritajes
                            CJD_EstudiPeritaDao estPer3Dao = new CJD_EstudiPeritaDao();
                            estPer3Dao.setConditions("fkeyestudian =" + vecEstu.get(j).getFkeyEstuDian() + " and fechEntrPeri is NULL");//valida cuantos peritajes tiene asignados el estudiante
                            ArrayList<CJD_EstudiAplicaDto> vecEstProc2 = estPer3Dao.loadAll();
                            contProc[0][j] = vecEstu.get(j).getFkeyEstuDian();
                            contProc[1][j] = vecEstProc2.size();
                            estPer3Dao = null;
                        }
                        boolean indica = false;
                        /**
                         * Si encuentra un estudiante con 0 peritajes, se le
                         * asigna peritaje, de lo contrario se le asigna al que
                         * tenga menos peritajes a cargo
                         */
                        for (int j = 0; j < vecEstu.size(); j++) {
                            if (contProc[1][j] == 0) {
                                indica = true;
                                break;
                            }
                        }
                        if (indica) {
                            try {
                                asignarPorPromedio(contProc, vecEstu.size(), pkPeri);
                            } catch (SQLException ex) {
                                Logger.getLogger(PeritaConsulDNode.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                asignarPorCantiPeritaje(contProc, vecEstu.size(), pkPeri);
                            } catch (SQLException ex) {
                                Logger.getLogger(PeritaConsulDNode.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    }
                    CJD_PeritaConsulDao perConsDao = new CJD_PeritaConsulDao();
                    CJD_PeritaConsulDto perConsDto = new CJD_PeritaConsulDto();
                    perConsDto.setPkeyPeriCons(vecPer.get(i).getPkeyPeriCons());
                    perConsDto.setNombPeritaje(vecPer.get(i).getNombPeritaje());
                    perConsDto.setAreaPeritaje(vecPer.get(i).getAreaPeritaje());
                    perConsDto.setDescPeritaje(vecPer.get(i).getDescPeritaje());
                    perConsDto.setNumePeritaje(vecPer.get(i).getNumePeritaje());
                    if (vecPer.get(i).getFkeyDoceEspe() == null || vecPer.get(i).getFkeyDoceEspe() == 0) {
                        perConsDto.setEstaPeritaje("I");
                    } else {
                        perConsDto.setEstaPeritaje("E");
                    }

                    perConsDto.setFkeyDoceEspe(vecPer.get(i).getFkeyDoceEspe());
                    perConsDto.setOrigPeriCons(vecPer.get(i).getOrigPeriCons());
                    perConsDao.updateDto(perConsDto);
                    perConsDao = null;
                    perConsDao = new CJD_PeritaConsulDao();
                }
                super.onClick(art); //To change body of generated methods, choose Tools | Templates.
            }

        });
        TPreForm preForm = new TPreForm(TGrid.BAR_ID, flds, 4);
        preForm.initiate();
        return preForm;
    }

//<<<<<<<<<<<<<<<<<<<<< CAMPOS DE LA FORMA >>>>>>>>>>>>>>>>>>>>>>>>>>>
// CAMPOS DE LA FORMA 
    public ArrayList genFieldsForm() {
        ArrayList<BaseField> flds = new ArrayList();
        flds.add(nombperitajeFld = new TEditField(0, 0, "NombPeritaje", "Nombre Peritaje", true) {

            @Override
            public String validate(Object obj, Object value) {
                CJD_PeritaConsulDto PerConDto = (CJD_PeritaConsulDto) grifo.getForm().getObject();
                String msj = "";
                if (PerConDto.getPkeyPeriCons() == 0) {
                    CJD_PeritaConsulDao PeriConsDao = new CJD_PeritaConsulDao();
                    PeriConsDao.setConditions("nombperitaje = '" + value + "'");
                    CJD_PeritaConsulDto PeriConsDto = (CJD_PeritaConsulDto) PeriConsDao.findFirst();
                    if (PeriConsDto != null) {
                        msj = "Nombre del peritaje ya se encuentra registrado";
                    }
                }
                return msj; //To change body of generated methods, choose Tools | Templates.
            }

        });
        flds.add(areaperitajeFld = new TStaticField(0, 1, "AreaPeritaje", "ÁreaPeritaje", CJD_PeritaConsulDto.RANG_AreaPeritaje, true));
        flds.add(descperitajeFld = new TMemoField(0, 2, "DescPeritaje", "Descripción Peritaje", false));
        flds.add(numeperitajeFld = new TEditField(0, 3, "NumePeritaje", "Número Fiscalía", true) {

            @Override
            public String validate(Object obj, Object value) {
                CJD_PeritaConsulDto PerConDto = (CJD_PeritaConsulDto) grifo.getForm().getObject();
                String msj = "";
                if (PerConDto.getPkeyPeriCons() == 0) {
                    CJD_PeritaConsulDao PeriConsDao = new CJD_PeritaConsulDao();
                    PeriConsDao.setConditions("numeperitaje = '" + value + "'");
                    CJD_PeritaConsulDto PeriConsDto = (CJD_PeritaConsulDto) PeriConsDao.findFirst();
                    if (PeriConsDto != null) {
                        msj = "Número del peritaje ya se encuentra registrado";
                    }
                }

                return msj; //To change body of generated methods, choose Tools | Templates.
            }

        });
        flds.add(estaperitajeFld = new TStaticField(1, 0, "EstaPeritaje", "Estado Peritaje", CJD_PeritaConsulDto.RANG_EstaPeritaje, true) {

            @Override
            public String validate(Object obj, Object value) {
                CJD_PeritaConsulDto PerConDto = (CJD_PeritaConsulDto) grifo.getForm().getObject();
                CJD_EstudiPeritaDao EstPerDao = new CJD_EstudiPeritaDao();
                EstPerDao.setConditions("fkeyperiCons =" + PerConDto.getPkeyPeriCons() + " and fechEntrPeri is null");
                CJD_EstudiPeritaDto EstPerDto = (CJD_EstudiPeritaDto) EstPerDao.findFirst();
                String msj = "";
                if (PerConDto.getPkeyPeriCons() != 0) {

                    if ("I".equals(PerConDto.getEstaPeritaje())) {
                        if (EstPerDto != null && PerConDto.getFkeyDoceEspe() > 0) {
                            msj = "Peritaje con estudiante y docente asignado";
                        }
                    } else if ("E".equals(PerConDto.getEstaPeritaje())) {
                        if (EstPerDto == null && PerConDto.getFkeyDoceEspe() > 0) {
                            msj = "Peritaje sin estudiante asignado";
                        } else if (EstPerDto != null && PerConDto.getFkeyDoceEspe() == 0) {
                            msj = "Peritaje sin docente asignado";
                        } else if (EstPerDto == null && PerConDto.getFkeyDoceEspe() == 0) {
                            msj = "Peritaje sin asignar estudiante y docente";
                        }
                    } else {
                        CJD_EstudiPeritaDao EstPer1Dao = new CJD_EstudiPeritaDao();
                        EstPerDao.setConditions("fkeyperiCons =" + PerConDto.getPkeyPeriCons() + " and fechEntrPeri is not null");
                        CJD_EstudiPeritaDto EstPer1Dto = (CJD_EstudiPeritaDto) EstPer1Dao.findFirst();
                        if (EstPerDto == null && PerConDto.getFkeyDoceEspe() > 0 && EstPer1Dto == null) {
                            msj = "Peritaje sin historico de estudiante";
                        } else if (EstPerDto == null && PerConDto.getFkeyDoceEspe() == 0 && EstPer1Dto == null) {
                            msj = "Peritaje sin historico de estudiante y no tiene asignado docente";
                        } else if (EstPerDto == null && PerConDto.getFkeyDoceEspe() == 0 && EstPer1Dto != null) {
                            msj = "Peritaje sin docente asignado";
                        } else if (EstPerDto != null && PerConDto.getFkeyDoceEspe() == 0) {
                            msj = "Estudiante a cargo del Peritaje no ha hecho efectiva la entrega y no tiene docente asignado";
                        } else if (EstPerDto != null && PerConDto.getFkeyDoceEspe() > 0) {
                            msj = "Estudiante a cargo del Peritaje no ha hecho efectiva la entrega";
                        }
                    }
                }
                return msj; //To change body of generated methods, choose Tools | Templates.
            }

        });
        flds.add(origpericonsFld = new TStaticField(1, 1, "OrigPeriCons", "OrigPeriCons", CJD_PeritaConsulDto.RANG_OrigPeriCons, true));
//-------------------------------------------------------- | CJD_DocentEspeci
        CJDVDocentEspeciDao doceespeDao = new CJDVDocentEspeciDao();
        doceespeDao.setConditions("DoceESpecial = 'E'");
        doceespeDao.setOrderBy("");
        doceespeLku = new TLookupField(2, 0, "FkeyDoceEspeDto", "Docente", doceespeDao, false) {

            @Override
            public String validate(Object obj, Object value) {
                CJD_PeritaConsulDto PerConDto = (CJD_PeritaConsulDto) grifo.getForm().getObject();
                String msj = "";
                CJD_PeritaConsulDao PerConDao = new CJD_PeritaConsulDao();
                int pkey = 0;
                if (PerConDto.getPkeyPeriCons() == 0) {
                    try {
                        pkey = PerConDao.getSecuence("CJD_PeritaConsul");
                    } catch (SQLException ex) {
                        Logger.getLogger(PeritaConsulDNode.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    pkey = PerConDto.getPkeyPeriCons();
                }
                if (PerConDto.getFkeyDoceEspe() != null && PerConDto.getFkeyDoceEspe() > 0) {
                    PerConDao.setConditions("fkeydoceespe=" + PerConDto.getFkeyDoceEspe());
                    ArrayList<CJD_PeritaConsulDto> vecPeriDoce = PerConDao.loadAll();
                    CJD_DocentEspeciDao docEspDao = new CJD_DocentEspeciDao();
                    CJD_DocentEspeciDto docEspDto = (CJD_DocentEspeciDto) docEspDao.findByPkey(PerConDto.getFkeyDoceEspe());
                    CJD_PeritaConsulDao PerCon1Dao = new CJD_PeritaConsulDao();
                    PerCon1Dao.setConditions("PkeyPeriCons=" + PerConDto.getPkeyPeriCons() + " and fkeydoceespe=" + PerConDto.getFkeyDoceEspe());
                    CJD_PeritaConsulDto perCon1Dto = (CJD_PeritaConsulDto) PerCon1Dao.findFirst();
                    if (perCon1Dto == null) {
                        if (vecPeriDoce.size() >= docEspDto.getCantProcDoce()) {
                            msj = "Docente no tiene mas cupo para recibir mas procesos";
                        } else {
                            CJD_EstudiPeritaDao estPerDao = new CJD_EstudiPeritaDao();
                            estPerDao.setConditions("fkeyperiCons=" + pkey + " and (FechEntrPeri is null or fechentrperi ='')");
                            CJD_EstudiPeritaDto estPerDto = new CJD_EstudiPeritaDto();
                            ArrayList<CJD_EstudiPeritaDto> vecEstuPeri = estPerDao.loadAll();
                            if (vecEstuPeri.size() != 0) {
                                PerConDto.setEstaPeritaje("E");
                            } else {
                                PerConDto.setEstaPeritaje("I");
                            }
                        }
                    }
                }
                return msj; //To change body of generated methods, choose Tools | Templates.
            }

        };
        doceespeLku.setFullLoad(true);
        doceespeLku.addSeekField(new TField("nombCompProf", "Buscar por nombre"));
        flds.add(doceespeLku);
//-------------------------------------------------------- | DEFVPeriPlanProg
//        DEFVPeriPlanProgDao periplanDao = new DEFVPeriPlanProgDao();
//        periplanDao.setOrderBy("");
//        periplanLku = new TLookupField(3, 0, "FkeyPeriPlanDto", "Período / Plan / Programa (VISTA)", periplanDao, true);
////       periplanLku.setFullLoad(true);
////       periplanLku.addSeekField(new TField("",""));
//        flds.add(periplanLku);
        return flds;
    }

    public int ordenarDocentes(int[][] cantDoce, int numFilas) {
        int aux0, aux1;
        for (int i = 0; i < numFilas; i++) {//Ordenando la matriz de forma ascendente de acuerdo a la cantidad de procesos
            for (int j = 0; j < numFilas - 1; j++) {
                if (cantDoce[1][j] > cantDoce[1][j + 1]) {
                    aux0 = cantDoce[0][j];
                    aux1 = cantDoce[1][j];
                    cantDoce[0][j] = cantDoce[0][j + 1];
                    cantDoce[1][j] = cantDoce[1][j + 1];
                    cantDoce[0][j + 1] = aux0;
                    cantDoce[1][j + 1] = aux1;
                }
            }
        }
        int pkDocEsp = 0;
        for (int i = 0; i < numFilas; i++) {
            if (cantDoce[0][i] > 0) {
                pkDocEsp = cantDoce[0][i];
                break;
            }
        }
        return pkDocEsp;
    }

    public void asignarPorPromedio(int[][] contProc, int numFilas, int pkeyPeri) throws SQLException {
        for (int i = 0; i < numFilas; i++) {
            if (contProc[1][i] == 0) {
                CJD_EstudiPeritaDao estuPeriDao = new CJD_EstudiPeritaDao();
//                estuProcDao.setConditions("fkeyEstudian = "+contProc[0][i]);
                CJD_EstudiPeritaDto estuPeriDto = new CJD_EstudiPeritaDto();
                estuPeriDto.setPkeyEstuPeri(0);
                estuPeriDto.setFkeyEstudian(contProc[0][i]);
                estuPeriDto.setFkeyPeriCons(pkeyPeri);
                estuPeriDto.setFechAsigPeri(new Date());
                estuPeriDto.setFechEntrPeri(null);

                estuPeriDao.insert(estuPeriDto);
                break;
            }
        }
    }

    public void asignarPorCantiPeritaje(int[][] contPeri, int numFilas, int pkeyPeri) throws SQLException {
        int aux0, aux1;
        for (int i = 0; i < numFilas; i++) {//Ordenando la matriz de forma ascendente de acuerdo a la cantidad de consultas
            for (int j = 0; j < numFilas - 1; j++) {
                if (contPeri[1][j] > contPeri[1][j + 1]) {
                    aux0 = contPeri[0][j];
                    aux1 = contPeri[1][j];
                    contPeri[0][j] = contPeri[0][j + 1];
                    contPeri[1][j] = contPeri[1][j + 1];
                    contPeri[0][j + 1] = aux0;
                    contPeri[1][j + 1] = aux1;
                }
            }
        }

        int cont = 1;
        for (int i = 1; i < numFilas; i++) {//contando la cantidad de docentes que tinen el mínimo de consultas
            if (contPeri[1][0] == contPeri[1][i]) {
                cont++;
            } else {
                break;
            }
        }

        Random rnd = new Random();

        int x = (int) (rnd.nextDouble() * cont);//buscamos una posicion al azar para asignar la consulta a cualquiera de los docentes que tienen menos consultas

        int pkeyEstudian = contPeri[0][x];

        CJD_EstudiPeritaDao estuPeriDao = new CJD_EstudiPeritaDao();
//                estuProcDao.setConditions("fkeyEstudian = "+contProc[0][i]);
        CJD_EstudiPeritaDto estuPeriDto = new CJD_EstudiPeritaDto();
        estuPeriDto.setPkeyEstuPeri(0);
        estuPeriDto.setFkeyEstudian(pkeyEstudian);
        estuPeriDto.setFkeyPeriCons(pkeyPeri);
        estuPeriDto.setFechAsigPeri(new Date());
        estuPeriDto.setFechEntrPeri(null);

        estuPeriDao.insert(estuPeriDto);
    }

}
