package com.bt.univex.cjd.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class CJD_PeritaConsulProv extends BaseDataProvider {
    public CJD_PeritaConsulProv() {
        dao = new CJD_PeritaConsulDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((CJD_PeritaConsulDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(CJD_PeritaConsulDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (CJD_PeritaConsulDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                CJD_PeritaConsulDao newDao = new CJD_PeritaConsulDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
