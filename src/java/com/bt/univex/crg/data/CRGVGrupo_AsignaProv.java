package com.bt.univex.crg.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class CRGVGrupo_AsignaProv extends BaseDataProvider {
    public CRGVGrupo_AsignaProv() {
        dao = new CRGVGrupo_AsignaDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((CRGVGrupo_AsignaDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(CRGVGrupo_AsignaDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (CRGVGrupo_AsignaDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                CRGVGrupo_AsignaDao newDao = new CRGVGrupo_AsignaDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
