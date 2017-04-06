package com.bt.inicio.login;

import com.bt.menu.MainMenuDocent;
import com.config.Defaults;
import com.xpc.base.BaseDto;
import com.xpc.base.UnsecureBaseFlux;
import static com.xpc.base.UnsecureBaseFlux.CTRL_ID; 
import com.xpc.binarytool.univex.connect.Connect;
import com.xpc.binarytool.univex.logic.ParametrosGlobales;
import com.xpc.forms.field.BaseField;
import com.xpc.forms.field.GEditField;
import com.xpc.forms.field.GImage;
import com.xpc.forms.field.GPassField;
import com.xpc.forms.field.GText;
import com.xpc.forms.field.TButton;
import com.xpc.snode.ControlNode;
import com.xpc.snode.SNode;
import com.xpc.snode.finder.TPreFormNode;
import java.util.ArrayList;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.markup.html.captcha.CaptchaImageResource;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.resource.AbstractResource;

public class Log_DocenteFlux extends UnsecureBaseFlux {
    private String userName = "";
    private String passWord = "";
    private String info = "";
    private String mensajes = "";
    private String imagePass; 
    private String userText;
    private int intento;
    
    public Log_DocenteFlux() {
        super();
        intento = 0;
//        setMask(SIMPLE);
        imagePass = randomString();
        // Flux especial con campos de logeo
        ctrl = new ControlNode(CTRL_ID, "");
//        ctrl.setUserDto(new SEG_UsuariSistemDto());
        crearLogin("Docentes, Acceso al Sistema");
        ctrl.init();
        add(ctrl);
    }
    protected void gotoMainPage(AjaxRequestTarget art) {
        setResponsePage(MainMenuDocent.class);
    }
    
    private void crearLogin(String title) {
        SNode node = new SNode(0, 0, title);
        TPreFormNode logNode = new TPreFormNode(SNode.NODE_ID, fields(), 3);
        node.add(logNode);
        ctrl.add(node);
    }

    private GImage img;
    private GEditField imgTextFld;
    
    private void message(String text, AjaxRequestTarget art){
        mensajes = text;
        art.add(msg.getContent());
    }
    
    private boolean aceptar(AjaxRequestTarget art){
        // verifica la clave 
        if ( passWord == null || "".equals(passWord) || 
             userName == null || "".equals(userName)){
            message("Debe ingresar tanto usuario como clave",art);
            return false;
        }
        if (intento >= 3) {
            if ("".equals(userText)) {
                message("Debe ingresar el texto que ve en la imagen",art);
                return false;
            }else if (userText == null || !userText.equals(imagePass)){
                message("El texto y la imagen deben coincidir",art);
                return false;
            }
        }
        DoceAcceLogic lgc = new DoceAcceLogic(new Connect());     
        
        BaseDto userDto = lgc.getUser(userName, passWord);
        
        if (userDto != null) {  
            lgc.saveInfo(this);
//            UserSistDto dto = new UserSistDto();
            getBSession().getUser().setCodiUsuaSist(lgc.getDoceDto().getCodiDoceUnivDesc());
            getBSession().getUser().setNombUsuaSist(lgc.getDoceDto().toString());
            getBSession().getUser().setTipoUsuaSist("D");            
            gotoMainPage(art);
            return true;
        }
        message(lgc.getLastError(),art);

        intento++;
        if ( intento == 3) {
            // mostrar y obligar el texto
            imgTextFld.setVisible(true);
            img.setVisible(true);
            art.add(imgTextFld.getContent());
            art.add(img.getContent());
        } else if (intento > 3) {
            imagePass = randomString();
            art.add(img.getVisual());
        }
        return false;
    }
    
    private GText msg;
    private GText text;
    
    private ArrayList fields() {
        info = "";
        ArrayList<BaseField> flds = new ArrayList();
//        flds.add(text=new GText(0,1,"<center><h4>Acceso a los Memorandos Internos</h4></center>"));
                String logoUrl = (new ParametrosGlobales()).getParam("LogoText");
        if ("".equals(logoUrl)) 
            logoUrl = Defaults.LOGO_TEXT;
        flds.add(new GImage(0,1,"", logoUrl));
        
        flds.add(new GEditField(1, 1, new PropertyModel(this, "userName"), "Usuario:", true));
        flds.add(new GPassField(2, 1, new PropertyModel(this, "passWord"), "Clave:"));
        flds.add(new TButton(5, 1, "Ingresar", "") {
            @Override
            public void onClick(AjaxRequestTarget art) {
                aceptar(art);
            }
        });

        flds.add(img = new GImage(3, 1, "", new PropertyModel(this,"captcha")));
        flds.add(imgTextFld=new GEditField(4, 1, new PropertyModel(this,"userText"), "Ingrese el texto de la imagen de arriba"));
        img.setVisible(false);
        imgTextFld.setVisible(false);
        flds.add(new GText(6, 0, 3, 1, new PropertyModel(this, "info"), "La U le dice:"));
        msg = new GText(7,0,3,1,new PropertyModel(this,"mensajes"),"background-color:#FDEFA7;color:black;");
        flds.add(msg);
        flds.add(new GText(8,1,"<center><a href='http://www.univex.com.co' target:_blank ><strong>Univex IV<br/>Binary Tools<br/>2017<br/>&copy;</strong></a></center>"));
        
        return flds;
    }

    public AbstractResource getCaptcha() {
        CaptchaImageResource captchaImageResource = new CaptchaImageResource(new PropertyModel(this, "imagePass"));
        //captchaImg = new Image("captchaImage", captchaImageResource);
        return captchaImageResource;
    }
    
    private String TEXT = "AzByCxDwEvFuGtHsIrJqKpLoMnNmOlPkQjRiShTgUfVeWdXcYbZa";
    
    private  String randomString()    {
        // Un caracter entre 60 p
        String b="";
        for (int i = 0; i < 5; i++) {
            Long n = System.currentTimeMillis() % 50;        
            int num =  (int)(Math.random() * n);
            b += TEXT.charAt(num);
        }
        return new String(b);
    }
    
    public String getUserName() {         return userName;    }
    public void setUserName(String userName) {        this.userName = userName;    }
    public String getPassWord() {        return passWord;    }
    public void setPassWord(String passWord) {        this.passWord = passWord;    }
    public String getInfo() {        return info;    }
    public void setInfo(String info) {        this.info = info;    }
    public String getMensajes() {        return mensajes;    }
    public void setMensajes(String mensajes) {        this.mensajes = mensajes;    }
    public String getImagePass() {        return imagePass;     }
    public void setImagePass(String imagePass) {        this.imagePass = imagePass;    }
    public String getUserText() {        return userText;    }
    public void setUserText(String userText) {        this.userText = userText;    }


    
    
}
