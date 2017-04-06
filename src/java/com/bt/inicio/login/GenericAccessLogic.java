package com.bt.inicio.login;

import com.xpc.base.BaseDto;
import com.xpc.base.BaseLogic;
import com.xpc.binarytool.univex.connect.Connect;
import com.xpc.connect.BaseConnection;
import com.xpc.utilities.MiscFunctions;

public class GenericAccessLogic extends BaseLogic {

    private static final String VALIDOS = "ABCDEFGHIJKLMN—OPQRSTUVWXYZ 1234567890¡…Õ”⁄.:@";

    public GenericAccessLogic(BaseConnection bCon) {
        if (bCon != null) {
            this.setDataConnect(bCon);
        } else {
            this.setDataConnect(new Connect());
        }
    }

    protected String encryptNew(String text) {
        return MiscFunctions.newEncode(text);
    }
    
    protected String encryptOld(String text) {
        return MiscFunctions.EncriptarForhex(text);
    }
        
    public BaseDto getUser(String user, String pass) {
        // Docentes ... probar con los tres metodos de encripciÛn
        
        
        return null; 
    }  


    //-------------------------------------------------------------------------------------
    public String getInvalidChars(String sName) {
        String res = sName.toUpperCase();
        char c = ' ';
        for (int i = 0; i < res.length(); i++) {
            c = res.charAt(i);
            if (VALIDOS.indexOf(c) == -1) {
                return "" + VALIDOS.charAt(i);
            }
        }
        return "";
    }

}
 