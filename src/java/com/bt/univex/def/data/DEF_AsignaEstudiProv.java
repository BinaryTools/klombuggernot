package com.bt.univex.def.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class DEF_AsignaEstudiProv extends BaseDataProvider {
    public DEF_AsignaEstudiProv() {
        dao = new DEF_AsignaEstudiDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((DEF_AsignaEstudiDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(DEF_AsignaEstudiDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (DEF_AsignaEstudiDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                DEF_AsignaEstudiDao newDao = new DEF_AsignaEstudiDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
