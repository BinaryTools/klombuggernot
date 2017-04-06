package com.bt.univex.ads.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class ADS_PrograAcademProv extends BaseDataProvider {
    public ADS_PrograAcademProv() {
        dao = new ADS_PrograAcademDao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((ADS_PrograAcademDto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(ADS_PrograAcademDto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (ADS_PrograAcademDto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                ADS_PrograAcademDao newDao = new ADS_PrograAcademDao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
