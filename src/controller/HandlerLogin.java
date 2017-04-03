package controller;

import view.JPLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ambie on 30/03/2017.
 */
public class HandlerLogin {
    private JPLogin panel;
    private MainController controller;
    private JButton buttonEleve;
    private JButton buttonProf;

    public HandlerLogin(MainController controller) {
        this.controller = controller;
        this.panel = new JPLogin();
        controller.getView().setMainPane(panel);

        panel.getButtonEleve().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HandlerEleveLogin(controller);
            }
        });

        panel.getButtonProf().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HandlerProfLogin(controller);
            }
        });
    }


}
