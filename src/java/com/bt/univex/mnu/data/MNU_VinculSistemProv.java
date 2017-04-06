package com.bt.univex.mnu.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class MNU_VinculSistemProv extends BaseDataProvider {
    public MNU_VinculSistemProv() {
        dao = new MNU_VinculSistemDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((MNU_VinculSistemDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(MNU_VinculSistemDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (MNU_VinculSistemDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                MNU_VinculSistemDao newDao = new MNU_VinculSistemDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
