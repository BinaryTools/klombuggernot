package com.bt.univex.modules.RevisarProcesosArea;

import com.xpc.base.PanelFlux;
import com.xpc.snode.ControlNode;

public class RevisaProcesoFlux extends PanelFlux{
    public RevisaProcesoFlux(){
        super();
        ctrl = new ControlNode(CTRL_ID, "Revisar procesos área");
        new ProcesConsulDNode().createFinder(0, 0, -1, ctrl);
        new PersonProcesDNode().createFinder(1, 1, 0, ctrl); 
        new AnexosProcesDNode().createGrifo(2, 1, 0, ctrl);
        new EstudiProcesDNode().createFinder(3, 1, 0, ctrl); 
        new NotaEstuProcNode().createFinder(4, 2, 3, ctrl);
        new AccionExpediDNode().createGrifo(5, 2, 3, ctrl);
        
        ctrl.init();
        add(ctrl);
    }
}
