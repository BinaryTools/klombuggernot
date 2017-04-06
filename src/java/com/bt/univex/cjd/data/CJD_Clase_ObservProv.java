package com.bt.univex.cjd.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class CJD_Clase_ObservProv extends BaseDataProvider {
    public CJD_Clase_ObservProv() {
        dao = new CJD_Clase_ObservDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((CJD_Clase_ObservDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(CJD_Clase_ObservDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (CJD_Clase_ObservDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                CJD_Clase_ObservDao newDao = new CJD_Clase_ObservDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
