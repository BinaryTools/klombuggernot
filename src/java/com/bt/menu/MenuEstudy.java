package com.bt.menu;

import com.bt.univex.cjd.data.CJD_CoordiEstudiDao;
import com.bt.univex.cjd.data.CJD_CoordiEstudiDto;
import com.bt.univex.xpc.data.XPC_ProyecInformDao;
import com.xpc.app.BinarySession;
import com.xpc.component.accordion.AccordionPack;
import com.xpc.component.accordion.AccordionPanel;
import com.xpc.component.basic.TPanel;
import com.xpc.menu.MainControl;
import static com.xpc.menu.MainControl.ID_MAIN_MENU;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class MenuEstudy extends TPanel {

    private MainControl control;

    public MenuEstudy() {
        super(ID_MAIN_MENU);
        opciones();
    }
    private XPC_ProyecInformDao proyInfoDao;
    String PkeyEstu;
    String PkeyPeri;

    private void opciones() {

        BinarySession session = (BinarySession) getSession();
        PkeyEstu = session.getParameter("ESTUDIANTE");
        PkeyPeri = session.getParameter("PERIODO");
        CJD_CoordiEstudiDao coorDao = new CJD_CoordiEstudiDao();
        coorDao.setConditions("fkeyEstudian = "+PkeyEstu);
        CJD_CoordiEstudiDto coorDto = (CJD_CoordiEstudiDto) coorDao.findFirst();
        
        
        AccordionPack first = new AccordionPack("0", "Menú Principal", (Object) null);
        if(coorDto == null){
            addPack(first, "10", "Procesos", "com.bt.univex.modules.EstudiComplProce.EstudiCompleProcesFlux");
            addPack(first, "20", "Consultas", "com.bt.univex.modules.GenerarConsultas.CrearConsultaFlux");
            addPack(first, "30", "Agregar una persona", "com.bt.univex.modules.AgregarPersonaAdmin.AgregarPersonaFlux");
        }else{
            addPack(first, "10", "Aprobar Consultas", "com.bt.univex.modules.AprobarConsultas.AprobarConsultaFlux");
        }
//        addPack(first, "4", "", "");
//        addPack(first, "5", "", "");

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

    public void execute(AjaxRequestTarget art, AccordionPack pack) {
    }

    public MainControl getControl() {
        return control;
    }

    public void setControl(MainControl control) {
        this.control = control;
//        popup.setControl(control);
    }
}
