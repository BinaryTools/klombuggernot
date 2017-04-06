/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bt.inicio.security;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 * @author Alex
 */
public class WebPanel extends WebPage{

    public WebPanel(Panel pnl) {
        this.add(pnl);
    }
    
}
