package com.bt.univex.def.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class DEFVPeriPlanProgProv extends BaseDataProvider {
    public DEFVPeriPlanProgProv() {
        dao = new DEFVPeriPlanProgDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((DEFVPeriPlanProgDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(DEFVPeriPlanProgDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (DEFVPeriPlanProgDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                DEFVPeriPlanProgDao newDao = new DEFVPeriPlanProgDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
