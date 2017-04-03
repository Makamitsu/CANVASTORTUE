package com.gp1.controller;

import com.gp1.model.core.Professeur;
import com.gp1.view.JPProfLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ambie on 30/03/2017.
 */
public class HandlerProfLogin {

    private JPProfLogin panel;
    private MainController controller;


    public HandlerProfLogin(MainController controller) {
        this.controller = controller;
        panel = new JPProfLogin();
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
                Boolean goodMdp = false;
                for (Professeur p: controller.getEcole().getProfesseurs()) {
                    if(p.compareLogin(panel.getInputId().getText())){
                        found = true;
                        if (p.comparePassword(panel.getInputMdp().getText())){
                            goodMdp = true;
                        }
                        break;
                    }
                }
                if (!found){
                    JOptionPane.showMessageDialog(null,"Le professeur n'a pas été trouvé.","Erreur !",JOptionPane.ERROR_MESSAGE);
                    panel.getInputId().setText("");
                    panel.getInputMdp().setText("");
                }else if(!goodMdp){
                    JOptionPane.showMessageDialog(null,"Mot de passe incorrect !","Erreur !",JOptionPane.WARNING_MESSAGE);
                    panel.getInputMdp().setText("");
                }else {
                    new HandlerLogin(controller);
                }

            }
        });


    }


}
