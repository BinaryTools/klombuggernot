package com.bt.modules.mensajes;

import com.xpc.base.PanelFlux;
import static com.xpc.base.PanelFlux.CTRL_ID;
import com.xpc.snode.ControlNode;
 
public class MensajesFlux extends PanelFlux{

    public MensajesFlux() {
        super();       
        ctrl = new ControlNode(CTRL_ID, "Tenga en cuenta:");        
        
        new MensajAdminiNode().createFinder(0, 0, -1, ctrl);
        
        ctrl.init();
        add(ctrl);
    }
    
}
