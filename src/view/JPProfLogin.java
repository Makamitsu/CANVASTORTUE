package com.gp1.view;

import javax.swing.*;
import java.awt.*;


public class JPProfLogin extends JPanel{

    private JLabel labelId = new JLabel("Identifiant : ");
    private JLabel labelMdp = new JLabel("Mot de passe : ");
    private JLabel labelTitre = new JLabel("Espace professeur ");
    private JTextField inputId = new JTextField(10);
    private JTextField inputMdp = new JPasswordField(10);
    private JButton buttonValider = new JButton("Valider");
    private JButton buttonRetour = new JButton("Retour");

    public JPProfLogin(){
        labelTitre.setFont(new Font("Lucida Handwriting", 3, 28));
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 2;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 3;
        this.add(labelTitre,c);
        c.gridwidth = 1;
        c.weighty = 1;
        c.anchor = GridBagConstraints.NORTHWEST;
        this.add(buttonRetour,c);
        c.gridy = 1;
        c.anchor = GridBagConstraints.EAST;
        this.add(labelId, c);
        c.gridy = 2;
        this.add(labelMdp, c);
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(inputId,c);
        c.gridy = 2;
        this.add(inputMdp,c);
        c.gridx = 2;
        c.gridy = 3;
        c.fill = 0;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0,0,50,0);
        this.add(buttonValider,c);
        c.gridy = 5;
    }

    public JTextField getInputId() {
        return inputId;
    }

    public JTextField getInputMdp() {
        return inputMdp;
    }

    public JButton getButtonValider() {
        return buttonValider;
    }

    public JButton getButtonRetour() {
        return buttonRetour;
    }
}
