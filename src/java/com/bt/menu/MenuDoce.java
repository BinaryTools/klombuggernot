package com.bt.menu;

import com.bt.univex.cjd.data.CJD_DocentEspeciDao;
import com.bt.univex.cjd.data.CJD_DocentEspeciDto;
import com.bt.univex.crg.data.CRG_DocentUniverDao;
import com.bt.univex.crg.data.CRG_DocentUniverDto;
import com.bt.univex.mnu.data.MNU_VinculSistemDao;
import com.bt.univex.mnu.data.MNU_VinculSistemDto;
import com.bt.univex.xpc.data.XPC_ProyecInformDao;
import com.xpc.app.BinarySession;
import com.xpc.binarytool.univex.logic.ParaSystemLogic;
import com.xpc.component.accordion.AccordionPack;
import com.xpc.component.accordion.AccordionPanel;
import com.xpc.component.basic.TPanel;
import com.xpc.menu.MainControl;
import static com.xpc.menu.MainControl.ID_MAIN_MENU;
import java.util.ArrayList;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class MenuDoce extends TPanel {

    @Override
    protected void ajaxar(Component c) {
        c.setOutputMarkupId(true);
        c.setOutputMarkupPlaceholderTag(true);
    }
    private MainControl control;

    public MenuDoce() {
        super(ID_MAIN_MENU);
        opciones();
    }
    private XPC_ProyecInformDao proyInfoDao;
    String PkeyDoce;
    String PkeyPeri;

    private void opciones() {
        BinarySession session = (BinarySession) getSession();
        PkeyDoce = session.getParameter("DOCENTE");
        PkeyPeri = session.getParameter("PERIODO");
        CJD_DocentEspeciDao doceEspeDao = new CJD_DocentEspeciDao();
        doceEspeDao.setConditions("fkeyProfesor=" + PkeyDoce + " and docentCoordi='S'");
        CJD_DocentEspeciDto doceEspeDto = (CJD_DocentEspeciDto) doceEspeDao.findFirst();

        CRG_DocentUniverDao doceDao = new CRG_DocentUniverDao();
        doceDao.setConditions("pkeyProfesor in (select fkeyProfesor "
                + " from CJD_DocentEspeci where estaDoceActi ='S') "
                + "and estaActiProf = 'S' "
                + "and pkeyProfesor = " + PkeyDoce);
        CRG_DocentUniverDto doceDto = (CRG_DocentUniverDto) doceDao.findFirst();

//        ADS_ParameGlobalDao parGloDao = new ADS_ParameGlobalDao();
//        parGloDao.setConditions("NOMBPARAGLOB = 'AbreConsJuriDoce'");
//        ADS_ParameGlobalDto parGloDto = (ADS_ParameGlobalDto) parGloDao.findFirst();

        AccordionPack first = new AccordionPack("0", "Menú Principal", (Object) null);

//        if ("S".equals(parGloDto.getValoParaGlob())) {
            if (doceEspeDto == null) {
                if (doceDto != null) {
                    addPack(first, "1", "Calificar Consultas", "com.bt.univex.modules.CalificarConsultas.CalificarConsultaFlux");
                    addPack(first, "2", "Calificar Procesos", "com.bt.univex.modules.CalificaProceso.CalificaProcesoFlux");
                    addPack(first, "3", "Calificar Peritaje", "com.bt.univex.modules.CalificaPeritaje.CalificaPeritajeFlux");
                }
            } else {
                addPack(first, "1", "Calificar Consultas", "com.bt.univex.modules.CalificarConsultas.CalificarConsultaFlux");
                addPack(first, "2", "Calificar Procesos", "com.bt.univex.modules.CalificaProceso.CalificaProcesoFlux");
                addPack(first, "3", "Calificar Procesos", "com.bt.univex.modules.CalificaPeritaje.CalificaPeritajeFlux");
                addPack(first, "4", "Revisar Procesos", "com.bt.univex.modules.RevisarProcesosArea.RevisaProcesoFlux");
                addPack(first, "5", "Revisar Consultas", "com.bt.univex.modules.RevisarConsultasArea.RevisarConsultaFlux");
            }
//        } else {
//            addPack(first, "1", "Mensaje del sistema", "com.bt.univex.modules.AlertaSistema.SistemaMensajeFlux");
//        }

//        addPack(first, "1", "Calificar Consultas", "com.bt.univex.modules.CalificarConsultas.CalificarConsultaFlux");
//        addPack(first, "2", "Calificar Procesos", "com.bt.univex.modules.CalificaProceso.CalificaProcesoFlux");
//        addPack(first, "3", "Revisar Procesos", "com.bt.univex.modules.RevisarProcesosArea.RevisaProcesoFlux");
//        addPack(first, "4", "Revisar Consultas", "com.bt.univex.modules.RevisarConsultasArea.RevisarConsultaFlux");
//
//
//        addPack(first, "5", "Admin Crear Procesos", "com.bt.univex.modules.ProcesosAsignaAdmin.AsignaProcesoFlux");
//        addPack(first, "6", "Admin Completar Procesos", "com.bt.univex.modules.EstudiComplProceAdmin.EstudiCompleProcesFlux");
//        addPack(first, "7", "Admin Calificar Procesos", "com.bt.univex.modules.CalificaProcesoAdmin.CalificaProcesoFlux");
//        addPack(first, "8", "Admin Generar Consulta", "com.bt.univex.modules.GenerarConsultasAdmin.CrearConsultaFlux");
//        addPack(first, "9", "Admin Aprobar Consulta", "com.bt.univex.modules.AprobarConsultasAdmin.AprobarConsultaFlux");
//        addPack(first, "10", "Admin Calificar Consulta", "com.bt.univex.modules.CalificarConsultasAdmin.CalificarConsultaFlux");
//        addPack(first, "11", "Admin Crear Clase Observación", "com.bt.univex.modules.CrearClaseObservacionAdmin.CrearClaseObservaFlux");
//        addPack(first, "12", "Admin Crear Persona", "com.bt.univex.modules.AgregarPersonaAdmin.AgregarPersonaFlux");
//        addPack(first, "13", "Admin Agregar Coordinador", "com.bt.univex.modules.AgregarCoordiEstudiAdmin.AgregarEstudiCoordinaFlux");
//        addPack(first, "14", "Admin Agregar Doncente Especialidad", "com.bt.univex.modules.AsignaDocenteYSuEspecialidadAdmin.AsignarDocentesFlux");
//        addPack(first, "15", "Admin Agregar Estudiantes No Aplican", "com.bt.univex.modules.AgregarEstudiAplicaAdmin.AgregarEstudianteAplicaFlux");
//        addPack(first, "16", "Admin Asociar Asignaturas con Consultorio", "com.bt.univex.modules.AsociarAsignaturasConConsultorioAdmin.AsociaAsignaturasFlux");
//        addPack(first, "17", "Admin Listar Estudiantes Por Consultorio", "com.bt.univex.modules.ListarEstudiantesPorConsultorioAdmin.ListaEstudiantesFlux");
        add(new AccordionPanel("opciones", first) {
            @Override
            public void onClick(AjaxRequestTarget art, AccordionPack pack) {
//                super.onClick(art, pack); //To change body of generated methods, choose Tools | Templates.
                if (pack.getObj() != null) {
                    execute(art, pack);
                }
            }
        });

    }

    private void addPack(AccordionPack first, String id, String name, String path) {
        AccordionPack nod = new AccordionPack(id, name, path);
        first.getSons().add(nod);
    }

    private void loadOptions() {
        AccordionPack first = new AccordionPack("0", "Menú Principal", (Object) null);
        String pkey = (new ParaSystemLogic()).getParam("PortDocePkeyUser");
        String sqlVincPerm = "Select PkeyVinculo_ From SEG_PerfilSistem PS, "
                + " MNU_VinculSistem VS, MNU_VinculPerfil VP,"
                + " SEG_UsuariPerfil UP, MNU_ModuloSistem MS \n"
                + " Where PS.PkeyPerfSist = UP.FkeyPerfSist "
                + "   And VS.PkeyVinculo_ = VP.FkeyVinculo_ "
                + "   And VP.FkeyPerfSist = PS.PkeyPerfSist "
                + "   And VS.FkeyModuSist = MS.PkeyModuSist "
                + "   And PS.EstaActiPerf = 'S' " //                + "   And MS.TipoPortModu = 'D' "                
                //                + "   And UP.FKEYUSUASIST = " + pkey
                ;

        MNU_VinculSistemDao vincDao = new MNU_VinculSistemDao();
        vincDao.setConditions("PkeyVinculo_ in (" + sqlVincPerm + ")");
        ArrayList<MNU_VinculSistemDto> vincLst = vincDao.loadAll();
        for (MNU_VinculSistemDto vincDto : vincLst) {
            AccordionPack nod = new AccordionPack(vincDto.getAliaArboEjecNn(), vincDto.getNombVinculo_Nn(), vincDto);
            first.getSons().add(nod);
        }
        add(new AccordionPanel("opciones", first) {
            @Override
            public void onClick(AjaxRequestTarget art, AccordionPack pack) {
//                super.onClick(art, pack); //To change body of generated methods, choose Tools | Templates.
                if (pack.getObj() != null) {
                    MNU_VinculSistemDto vincDto = (MNU_VinculSistemDto) pack.getObj();
                    exec(art, vincDto);
                }
            }
        });
    }

    public void execute(AjaxRequestTarget art, AccordionPack pack) {
    }

    public void exec(AjaxRequestTarget art, MNU_VinculSistemDto vincDto) {
    }

//    private void addLink(String id, final String name, final String title) {
//        TAjaxLink lnk = new TAjaxLink(id) {
//            @Override
//            public void onClick(AjaxRequestTarget art) {
//                control.addWindow(art, name, title, null);
//            }
//        };
//        Label lbl = new Label("text", title);
//        lbl.setEscapeModelStrings(false);
//        lnk.add(lbl);
//        add(lnk);
//    }
//    private void addLink(String id, final String name, PropertyModel mdl) {
//        TAjaxLink lnk = new TAjaxLink(id) {
//            @Override
//            public void onClick(AjaxRequestTarget art) {
//                control.addWindow(art, name, "", null);
//            }
//        };
//        Label lbl = new Label("text", mdl);
//        lbl.setEscapeModelStrings(false);
//        lnk.add(lbl);
//        add(lnk);
//    }
    public MainControl getControl() {
        return control;
    }

    public void setControl(MainControl control) {
        this.control = control;
//        popup.setControl(control);
    }
}
