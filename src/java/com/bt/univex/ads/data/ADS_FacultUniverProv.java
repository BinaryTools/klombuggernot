package com.bt.univex.ads.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class ADS_FacultUniverProv extends BaseDataProvider {
    public ADS_FacultUniverProv() {
        dao = new ADS_FacultUniverDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((ADS_FacultUniverDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(ADS_FacultUniverDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (ADS_FacultUniverDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                ADS_FacultUniverDao newDao = new ADS_FacultUniverDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
