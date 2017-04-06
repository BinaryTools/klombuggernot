/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bt.inicio.security;

 
import com.xpc.app.BinarySession; 
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDao;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;

/**
 *
 * @author alex
 */
public class JumperPage extends WebPage {

    
    public void init(PageParameters pp){
        final JumperLogic lgc = new JumperLogic();
        StringValue key = pp.get("luca");
        lgc.recibeSalto(key.toString()); 
        lgc.completarSalto();       
        Jumper jmp = new Jumper(this){
            @Override
            public void SecurePage() {
                BinarySession session = (BinarySession)getSession();
                session.setUser((new SEG_UsuariSistemDao()).userConvert(lgc.getUsuarioDto()));
            }
        };    
        jmp.jumpPage(lgc.getParametros());
    }
    
    public JumperPage(PageParameters pp) {               
        init(pp);
    }
    
    public JumperPage(PageParameters pp, Class AccessPage) {        
        final JumperLogic lgc = new JumperLogic();
        if (pp == null || pp.isEmpty() ) {
            this.setResponsePage(AccessPage);
            return;
        }
        init(pp);
    }
    
}
