package com.bt.univex.def.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class DEF_PeriodPlanesProv extends BaseDataProvider {
    public DEF_PeriodPlanesProv() {
        dao = new DEF_PeriodPlanesDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((DEF_PeriodPlanesDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(DEF_PeriodPlanesDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (DEF_PeriodPlanesDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                DEF_PeriodPlanesDao newDao = new DEF_PeriodPlanesDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
