package com.bt.univex.cjd.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class CJDVAnexosConsulProv extends BaseDataProvider {
    public CJDVAnexosConsulProv() {
        dao = new CJDVAnexosConsulDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((CJDVAnexosConsulDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(CJDVAnexosConsulDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (CJDVAnexosConsulDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                CJDVAnexosConsulDao newDao = new CJDVAnexosConsulDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
