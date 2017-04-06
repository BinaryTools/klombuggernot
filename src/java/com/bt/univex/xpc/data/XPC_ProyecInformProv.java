package com.bt.univex.xpc.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class XPC_ProyecInformProv extends BaseDataProvider {
    public XPC_ProyecInformProv() {
        dao = new XPC_ProyecInformDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((XPC_ProyecInformDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(XPC_ProyecInformDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (XPC_ProyecInformDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                XPC_ProyecInformDao newDao = new XPC_ProyecInformDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
