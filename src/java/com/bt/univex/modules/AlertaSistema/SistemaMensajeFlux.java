/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bt.univex.modules.AlertaSistema;

import com.bt.univex.ads.data.ADS_ParameGlobalDto;
import com.xpc.base.PanelFlux;
import com.xpc.forms.field.GText;
import com.xpc.snode.finder.TPreFormNode;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class SistemaMensajeFlux extends PanelFlux {

    private String PkeyEstu, msj1;
    private GText texto1;

    private ADS_ParameGlobalDto parGloDto;

    public SistemaMensajeFlux() {
        ArrayList flds = new ArrayList();
        flds.add(new GText(0, 0, "Sistema actualmente bloqueado por la oficina de consultorio jurídico"));
        TPreFormNode frm = new TPreFormNode(CTRL_ID, flds);
        frm.init();
        add(frm);
    }
}
