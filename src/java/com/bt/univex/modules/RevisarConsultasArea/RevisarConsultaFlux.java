/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bt.univex.modules.RevisarConsultasArea;

import com.bt.univex.modules.CalificarConsultas.*;
import com.xpc.base.PanelFlux;
import com.xpc.snode.ControlNode;

/**
 *
 * @author alex
 */
public class RevisarConsultaFlux extends PanelFlux {

    public RevisarConsultaFlux() {
        super();
        ctrl = new ControlNode(CTRL_ID, "Calificación de consultas");
        new ConsulSistemNode().createGrifo(0, 0, -1, ctrl);
        new AnexosConsulNode().createGrifo(1, 1, 0, ctrl);
        new AccionConsulNode().createGrifo(2, 1, 0, ctrl);
        new Turno_AsignaNode().createGrifo(3, 1, 0, ctrl);
        new ListDocuPendNode().createGrifo(4, 1, 0, ctrl);
        
        ctrl.init();
        add(ctrl);
    }
    
}
    