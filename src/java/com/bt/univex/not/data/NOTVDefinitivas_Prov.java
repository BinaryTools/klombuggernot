package com.bt.univex.not.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class NOTVDefinitivas_Prov extends BaseDataProvider {
    public NOTVDefinitivas_Prov() {
        dao = new NOTVDefinitivas_Dao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((NOTVDefinitivas_Dto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(NOTVDefinitivas_Dto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (NOTVDefinitivas_Dto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                NOTVDefinitivas_Dao newDao = new NOTVDefinitivas_Dao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
