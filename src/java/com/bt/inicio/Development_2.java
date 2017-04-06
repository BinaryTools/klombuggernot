package com.bt.inicio;

import static com.bt.inicio.login.DoceAcceLogic.ID_DOCENTE;
import static com.bt.inicio.login.DoceAcceLogic.ID_PERIODO;
import com.bt.menu.MainMenuDocent;
import com.bt.univex.crg.data.CRG_DocentUniverDao;
import com.bt.univex.crg.data.CRG_DocentUniverDto;
import com.bt.univex.def.data.DEFVPeriPlanProgDao;
import com.bt.univex.def.data.DEFVPeriPlanProgDto;
import com.xpc.app.BinarySession;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDao;
import com.xpc.binarytool.univex.data.SEG_UsuariSistemDto;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;

public class Development_2 extends WebPage {

// Acceso al portal del docente de forma directa por un usuario administrador
    public Development_2(PageParameters pp) {
        getSession().bind();
        BinarySession session = (BinarySession) getSession();
        SEG_UsuariSistemDao dao = new SEG_UsuariSistemDao();
        SEG_UsuariSistemDto dto = new SEG_UsuariSistemDto();
        StringValue id = pp.get(0);
        StringValue key = pp.get(1);
        StringValue doc = pp.get(2); 
        StringValue jmp = pp.get(3);
        dao.setConditions("idenUsuaSist ='" + id + "' And niveUsuaSist = 'S' ");
        dto = (SEG_UsuariSistemDto) dao.findFirst();
        if (dto != null) {
            session.setUser(dao.userConvert(dto));
            CRG_DocentUniverDao doceDao = new CRG_DocentUniverDao();
            doceDao.setConditions("PkeyProfesor = "+doc);
            
            CRG_DocentUniverDto doceDto = (CRG_DocentUniverDto) doceDao.findFirst();
            session.setParameter(ID_DOCENTE, "" + doceDto.getPkeyProfesorNn());
            session.getUser().setCodiUsuaSist("" + doceDto.getCodiDoceUnivNn());
            session.getUser().setPkeyUsuaSist(doceDto.getPkeyProfesor());
            session.getUser().setNombUsuaSist(doceDto.getNombCompProf());
            session.getUser().setTipoUsuaSist("D");
            session.getUser().setInfoUsuaSist("" + doceDto.getCodiDoceUnivNn());
            // Ubica el periodo activo ... Ummmm... 
            DEFVPeriPlanProgDao pppDao = new DEFVPeriPlanProgDao();
            pppDao.setConditions("FkeyProgAcad=2 And IndiActiNota='S' ");
            pppDao.setOrderBy("FkeyPeriAcad desc");
            DEFVPeriPlanProgDto pppDto = (DEFVPeriPlanProgDto) pppDao.findFirst();
            if (pppDto == null) {
                session.getUser().setParaUsuaSist("PeriPla:Error");
                return;
            }
            session.setParameter(ID_PERIODO, "" + pppDto.getFkeyPeriAcadNn());
            this.setResponsePage(MainMenuDocent.class);
        }
//        dto = (SEG_UsuariSistemDto) dao.findDtoByPkey(1, 1);
//        this.setResponsePage(CalificaProcesoFlux.class);
    }
}
