package com.bt.univex.modules.CalificaProceso;

import com.xpc.base.PanelFlux;
import com.xpc.snode.ControlNode;

public class CalificaProcesoFlux extends PanelFlux{
    public CalificaProcesoFlux(){
        super();
        ctrl = new ControlNode(CTRL_ID, "Calificación procesos");
        new ProcesConsulDNode().createFinder(0, 0, -1, ctrl);
        new PersonProcesDNode().createFinder(1, 1, 0, ctrl);
        new AnexosProcesDNode().createGrifo(2, 1, 0, ctrl);
        new EstudiProcesDNode().createGrifo(3, 1, 0, ctrl);
        new NotaEstuProcNode().createGrifo(4, 2, 3, ctrl);
        new AccionExpediDNode().createGrifo(5, 2, 3, ctrl);
        
        ctrl.init();
        add(ctrl);
    }
}
