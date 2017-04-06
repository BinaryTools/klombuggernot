/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bt.menu;

import com.xpc.component.basic.TLinkAsPanel;
import com.xpc.menu.WindowPack;
import java.util.ArrayList;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.Loop;
import org.apache.wicket.markup.html.list.LoopItem;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

/**
 *
 * @author alfax
 */
public class MenuTabs extends Panel {
    
    private ArrayList<WindowPack> lst;
    public MenuTabs(String id, ArrayList lstWnd) {
        super(id);
        lst = lstWnd;
        createComponent();
    }
    
    public void onSelected(AjaxRequestTarget art, WindowPack pack){  }
    
    public String textMenu(String text){ return text;}
    
    public void createComponent(){
        Loop loop = new Loop("tabs_content", new PropertyModel(this,"size") ) {
            @Override
            protected void populateItem(LoopItem li) {
//                WebMarkupContainer wmc=new WebMarkupContainer("tab");
//                li.add(wmc);
                final WindowPack pck = lst.get(li.getIndex());
                if (pck.isVisible()){
                    li.add(new Label("tab_name", textMenu(pck.getTitle())));
                } else {
                    TLinkAsPanel lnk = new TLinkAsPanel("tab_name", textMenu(pck.getTitle())) {
                        @Override
                        public void onClick(AjaxRequestTarget art) {
                            onSelected(art, pck);
                        }
                    };
                    li.add(lnk);
                }
            }
        };
        add(loop);
    }
    
    public int getSize(){
        return lst.size();
    }
}
