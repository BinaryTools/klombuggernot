/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bt.inicio;

   
import com.bt.inicio.login.Log_DocenteFlux;
import com.xpc.app.AuthenticatedWebPage;
import com.xpc.app.BinaryApplication;
import com.xpc.app.BinarySession;
import org.apache.wicket.Component; 
import org.apache.wicket.RestartResponseAtInterceptPageException; 
import org.apache.wicket.Session;
import org.apache.wicket.authorization.Action;
import org.apache.wicket.authorization.IAuthorizationStrategy;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters; 

/**
 *
 * @author alex
 */
public class InitApplication extends BinaryApplication {
    
  private PageParameters attributes;
     
     
  @Override
  public void init() {
      super.init();
      
      mountPage("ByPass_4Out",Development_2.class);
      
//      mountPage("PersonSistem",Development_1.class);//Estudiante
//      mountPage("AprobaConsul",Development_2.class);//Docente
//      mountPage("ProcesAsigna",Development_3.class);//Facultad
//      mountPage("CalifiProces",Development_4.class);//Docente
//      mountPage("ClasObservac",Development_5.class);//Facultad
//      mountPage("EstucompProc",Development_6.class);//Estudiante
//      mountPage("GeneraConsul",Development_7.class);//Estudiante
//      mountPage("requisMinimo",Development_8.class);//Facultad
//      mountPage("AgregaCoordi",Development_9.class);//Facultad
//      mountPage("ListaEstudia",Development_10.class);//Facultad ----Falta
//      mountPage("AsociaAsigna",Development_11.class);//Facultad
//      mountPage("DocentEspeci",Development_12.class);//Facultad
//      mountPage("EstudiAplica",Development_13.class);//Facultad
//      mountPage("AsocAsigCons",Development_14.class);//Facultad
      getRequestCycleSettings().setResponseRequestEncoding("ISO-8859-1");
    attributes = new PageParameters();
    getSecuritySettings().setAuthorizationStrategy(new IAuthorizationStrategy() {
      @Override
      public boolean isActionAuthorized(Component component, Action action) {
        return true;
      }
      
      @Override
      public boolean isInstantiationAuthorized(Class componentClass) {
        if (AuthenticatedWebPage.class.isAssignableFrom(componentClass)) {
          // Is user signed in?
          if ( ( (BinarySession) Session.get()).isSignedIn()) {
            // okay to proceed
            return true;
          }
          // Force sign in
          throw new RestartResponseAtInterceptPageException(getHomePage());
        }
        return true;
      }
    });
  }

  @Override
  public Session newSession(org.apache.wicket.request.Request request, org.apache.wicket.request.Response response) {
    return new BinarySession(InitApplication.this, request);
  }
  
  @Override
  public Class getHomePage() { 
//    return Log_EstudianteFlux.class;
    return Log_DocenteFlux.class;
//      return JumperPage.class;
  }
 
  @Override
  public Class getClassForName(String name) {
      try {
          return Class.forName(name);
      } catch (ClassNotFoundException ex) {
          System.out.println("XPC-SEG1101. Metodo invocado en el salto no fue encontrado:"+name+ex);
      }
      return null;
  }  

  public void setAttributes(PageParameters attributes) {
    this.attributes = attributes;
  }

  public PageParameters getAttributes() {
    return attributes;
  }

    @Override
    public WebPage getMainPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
