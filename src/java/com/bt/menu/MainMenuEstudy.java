package com.bt.menu;

import com.xpc.app.AuthenticatedWebPage;
import com.xpc.component.accordion.AccordionPack;
import com.xpc.menu.PortalBeta;
import org.apache.wicket.ajax.AjaxRequestTarget;

public class MainMenuEstudy extends PortalBeta implements AuthenticatedWebPage {

    private MenuTabs tabs;
    private MenuEstudy menu;

    public MainMenuEstudy() {
        init("com.bt.modules.mensajes.MensajesFlux", "Tenga en cuenta, pero muy en cuenta:");
    }
    @Override
    protected void createHeader() {
        add(new InfoHeader(ID_HEADER));
    }
    @Override
    protected void createMainMenu() {
        getContent().add(menu = new MenuEstudy() {
            public void execute(AjaxRequestTarget art, AccordionPack pack) {
                addWindow(art,(String)pack.getObj(),pack.getName(), null);
            }
//            public void exec(AjaxRequestTarget art, MNU_VinculSistemDto vincDto){
//              addWindow(art, vincDto.getClasPathExecNn(),vincDto.getNombVinculo_Nn(), null);                
//            }
        });
        menu.setControl(this);
    }

//    @Override
//    protected void createTabs() {
//        tabs = new MenuTabs("work_tabs", loadOptions());
//        getContent().add(tabs);
//    }
//    @Override
//    protected void createHeader() {
//        add(new EmptyPanel(ID_HEADER));
//    }

}
