/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bt.inicio;
 
import com.bt.univex.modules.CalificaProceso.CalificaProcesoFlux;
import com.bt.univex.modules.CalificarConsultas.CalificarConsultaFlux;
import com.bt.univex.modules.RevisarProcesosArea.RevisaProcesoFlux;
import com.xpc.app.BinarySession;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDao;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDto;
import org.apache.wicket.markup.html.WebPage;
 
 
public class Development_1 extends WebPage{

    public Development_1() {
        getSession().bind();
        BinarySession session = (BinarySession) getSession();
        SEG_UsuariSistemDao dao = new SEG_UsuariSistemDao();
        SEG_UsuariSistemDto dto = new SEG_UsuariSistemDto();
        dto = (SEG_UsuariSistemDto) dao.findDtoByPkey(1,1);
        session.setUser(dao.userConvert(dto));
//        this.setResponsePage(CalificaProcesoFlux.class);
    }
}
