package controller;

import model.core.Classe;
import model.core.Eleve;
import view.JPEleveLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ambie on 30/03/2017.
 */
public class HandlerEleveLogin {

    private JPEleveLogin panel;
    private MainController controller;

    public HandlerEleveLogin(MainController controller) {
        this.controller = controller;
        panel = new JPEleveLogin();
        controller.getView().setMainPane(panel);

        panel.getButtonRetour().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HandlerLogin(controller);
            }
        });

        panel.getButtonValider().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean found = false;
                Eleve eleve = new Eleve();
                for (Classe c: controller.getEcole().getClasses()) {
                    eleve = c.findEleve(panel.getInputPrenom().getText(),
                            panel.getInputNom().getText());
                    if (eleve != null){
                        found = true;
                        break;
                    }
                }
                if (!found && null==eleve){
                    JOptionPane.showMessageDialog(null,"N'aurais-tu pas fait un faute ?","Oups !",JOptionPane.QUESTION_MESSAGE);
                }else {
                    new HandlerMainEleve(controller,eleve);
                }

            }
        });
    }
}
