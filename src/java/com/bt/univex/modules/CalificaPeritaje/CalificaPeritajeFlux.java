package com.bt.univex.modules.CalificaPeritaje;

import com.xpc.base.BaseFlux;
import com.xpc.base.PanelFlux;
import com.xpc.snode.ControlNode;

public class CalificaPeritajeFlux extends PanelFlux{
    public CalificaPeritajeFlux(){
        ctrl = new ControlNode(CTRL_ID, "Calificación procesos");
        new PeritaConsulDNode().createFinder(0, 0, -1, ctrl);
        new AnexosPeritaDNode().createGrifo(1, 1, 0, ctrl);
        new EstudiPeritaDNode().createGrifo(2, 1, 0, ctrl);
        new PersonPeritaDNode().createFinder(3, 1, 0, ctrl);
        
        ctrl.init();
        add(ctrl);
    }
}
