 

package com.bt.menu;

import com.bt.inicio.login.Log_DocenteFlux;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

 
public class InfoHeader extends Panel {

    public InfoHeader(String id) {
        super(id);
        add(new Link("close") {
            @Override
            public void onClick() {
                setResponsePage(Log_DocenteFlux.class);
                getSession().invalidate();
            }
        });
    }   
}
