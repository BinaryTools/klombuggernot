package com.bt.univex.crg.data;

import com.xpc.base.BaseDataProvider; 
import com.xpc.base.BaseDetachableModel;
import com.xpc.binarytool.univex.connect.Connect; 
import com.xpc.base.BaseDto;
import java.sql.*;
import org.apache.wicket.*;
import org.apache.wicket.model.*;
//===================================================================
public class CRG_Grupo_Nivel_Prov extends BaseDataProvider {
    public CRG_Grupo_Nivel_Prov() {
        dao = new CRG_Grupo_Nivel_Dao(new Connect());
        setSort("", true);
    }

    @Override 
    public IModel model(Object obj) {
        return new DetachableModel((CRG_Grupo_Nivel_Dto) obj);
    }
//================================= Detach Model ====================
    public class DetachableModel extends BaseDetachableModel {

        public DetachableModel(CRG_Grupo_Nivel_Dto inDto) {
            super(inDto.toInt());
            this.dto = inDto;
        }

        protected void onSetObject(Component comp, Object obj) {
            dto = (CRG_Grupo_Nivel_Dto) obj;
        }

        protected void onAttach() {
            if (dto == null) {
                CRG_Grupo_Nivel_Dao newDao = new CRG_Grupo_Nivel_Dao();
                dto = (BaseDto) newDao.findDtoByPkey(new Integer((int) Pk), 1);
                dao = null;
            }
        }
    } // End class
} // End File
