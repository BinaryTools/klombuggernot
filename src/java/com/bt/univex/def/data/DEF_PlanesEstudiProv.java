package com.bt.univex.def.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class DEF_PlanesEstudiProv extends BaseDataProvider {
    public DEF_PlanesEstudiProv() {
        dao = new DEF_PlanesEstudiDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((DEF_PlanesEstudiDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(DEF_PlanesEstudiDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (DEF_PlanesEstudiDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                DEF_PlanesEstudiDao newDao = new DEF_PlanesEstudiDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
