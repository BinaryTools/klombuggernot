package com.bt.univex.crg.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class CRGACarga_AcademProv extends BaseDataProvider {
    public CRGACarga_AcademProv() {
        dao = new CRGACarga_AcademDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((CRGACarga_AcademDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(CRGACarga_AcademDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (CRGACarga_AcademDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                CRGACarga_AcademDao newDao = new CRGACarga_AcademDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
