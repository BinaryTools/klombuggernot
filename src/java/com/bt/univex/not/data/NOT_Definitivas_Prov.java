package com.bt.univex.not.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class NOT_Definitivas_Prov extends BaseDataProvider {
    public NOT_Definitivas_Prov() {
        dao = new NOT_Definitivas_Dao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((NOT_Definitivas_Dto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(NOT_Definitivas_Dto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (NOT_Definitivas_Dto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                NOT_Definitivas_Dao newDao = new NOT_Definitivas_Dao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
