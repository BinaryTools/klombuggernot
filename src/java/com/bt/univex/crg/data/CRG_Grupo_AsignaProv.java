package com.bt.univex.crg.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class CRG_Grupo_AsignaProv extends BaseDataProvider {
    public CRG_Grupo_AsignaProv() {
        dao = new CRG_Grupo_AsignaDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((CRG_Grupo_AsignaDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(CRG_Grupo_AsignaDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (CRG_Grupo_AsignaDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                CRG_Grupo_AsignaDao newDao = new CRG_Grupo_AsignaDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
