/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Code: XPC-SEG1100
 */
package com.bt.inicio.security;



import com.xpc.base.BaseLogic;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;

/**
 * Extraido del Guachiman de camilo 
 * @author alex
 */
// Esta clase invoca el respectivo formulario:WebPage, Panel, BinaryPage, etc., que sea invocado
// en un salto, pierde el bajo acoplamiento y se amarra a Wicket 
public class Jumper extends BaseLogic {
    private WebPage parent;
    

    public Jumper(WebPage parentPage) {
        parent = parentPage;
    }
    
    public Class getClassForName(String metodo){
        try {
            return Class.forName(metodo);
        } catch (ClassNotFoundException ex) {
            error("XPC-SEG1101. Metodo invocado en el salto no fue encontrado:"+metodo,ex,1000,false);
            return null;
        }
    }
    // Verifica de que esta echa la clase y la llama 
    public boolean jumpPage(PageParameters pp) {
        SecurePage();
        StringValue metodo = pp.get("1");
        if (metodo.equals("none")) {
            return false;
        }
        Class forName = getClassForName(metodo.toString());   
        if (Panel.class.isAssignableFrom(forName)) {
            Class[] tipo = new Class[1];
            tipo[0] = String.class;
            Constructor ct;
            try {
                ct = forName.getConstructor(tipo);
                Object[] args = new Object[1];
                args[0] = "panel";
                parent.setResponsePage(new WebPanel(Panel.class.cast(ct.newInstance(args))));
            } catch (NoSuchMethodException ex) {
                error("XPC-SEG1102. La clase fue encontrada, pero el metodo no:"+metodo,ex,1000,false);
                return false;            
            } catch (SecurityException ex) {
                error("XPC-SEG1103. Error de seguridad...{Completar} :"+metodo,ex,1000,false);
                return false;            
            } catch (InstantiationException ex) {
                error("XPC-SEG1104. Error de inicalizacion {completar}:"+metodo,ex,1000,false);
                return false;            
            } catch (IllegalAccessException ex) {
                error("XPC-SEG1105. Error de Ilegal acceso :"+metodo,ex,1000,false);
                return false;            
            } catch (IllegalArgumentException ex) {
                error("XPC-SEG1106. Argumentos erroneos al ejecutar el metodo:"+metodo,ex,1000,false);
                return false;            
            } catch (InvocationTargetException ex) {
                error("XPC-SEG1107. Invocación:"+metodo,ex,1000,false);
                return false;            
            }
//        } else if (BinaryPage.class.isAssignableFrom(forName)) {
//            return binaryCall(forName);
        } else if (WebPage.class.isAssignableFrom(forName)) {
            Class<WebPage> aux = (Class<WebPage>) forName;
            parent.setResponsePage(aux);
        } else {
          //  parent.setResponsePage(new LogOff());
        }        
        return true;
    }
    
    public void SecurePage() {  }
    
//    private boolean binaryCall(Class x) {
//        try {
//            SecurePage();
//            BinaryPage page = (BinaryPage) x.newInstance();
//            page.setParams(new PageParameters());
//            Navigator nav = new Navigator(page);
//            page.init(nav);            
//            page.initPage();            
//            nav.NextPage( x, page.getParams());
//            nav.goNextPage();
////            parent.setResponsePage(page);
//        } catch (InstantiationException ex) {
//             error("XPC-SEG1108. Error de inicializaci�n:",ex,1000,false);
//             return false;            
//        } catch (IllegalAccessException ex) {
//             error("XPC-SEG1109. Metodo invocado en el salto no fue encontrado:",ex,1000,false);
//             return false;            
//        }
//        return true;
//    }

    
}
