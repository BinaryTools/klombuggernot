/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bt.univex.modules.CalificarConsultas;

import com.xpc.base.BaseFlux;
import com.xpc.base.PanelFlux;
import com.xpc.snode.ControlNode;

/**
 *
 * @author alex
 */
public class CalificarConsultaFlux extends PanelFlux {

    public CalificarConsultaFlux() {
        super();
        ctrl = new ControlNode(CTRL_ID, "Calificación de consultas");
        new ConsulSistemNode().createGrifo(0, 0, -1, ctrl);
        new ContIngrEstuNode().createFinder(1, 1, 0, ctrl);
        new AnexosConsulNode().createGrifo(2, 1, 0, ctrl);
        new AccionConsulNode().createGrifo(3, 1, 0, ctrl);
        new Turno_AsignaNode().createGrifo(4, 1, 0, ctrl);
        new ListDocuPendNode().createGrifo(5, 1, 0, ctrl);
        
        ctrl.init();
        add(ctrl);
    }
    
}
    