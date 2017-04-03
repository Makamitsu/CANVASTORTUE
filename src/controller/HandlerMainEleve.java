package com.gp1.controller;

import com.gp1.model.core.Eleve;
import com.gp1.view.JPMainEleve;

/**
 * Created by ambie on 30/03/2017.
 */
public class HandlerMainEleve {

    private JPMainEleve panel;

    private Eleve eleve;

    private MainController controller;

    public HandlerMainEleve(MainController controller,Eleve eleve) {
        this.eleve = eleve;
        this.controller = controller;
        panel = new JPMainEleve(eleve);
        controller.getView().setMainPane(panel);
    }

}
