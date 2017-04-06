package com.bt.univex.def.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class DEF_PlanAsignatuProv extends BaseDataProvider {
    public DEF_PlanAsignatuProv() {
        dao = new DEF_PlanAsignatuDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((DEF_PlanAsignatuDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(DEF_PlanAsignatuDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (DEF_PlanAsignatuDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                DEF_PlanAsignatuDao newDao = new DEF_PlanAsignatuDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
