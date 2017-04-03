package com.gp1.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ambie on 30/03/2017.
 */
public class JPEleveLogin extends JPanel{

    private JLabel labelPrenom = new JLabel("Mon prénom : ");
    private JLabel labelNom = new JLabel("Mon nom de famille : ");
    private JLabel labelTitre = new JLabel("J'écris mon prénom et nom ");
    private JTextField inputPrenom = new JTextField(10);
    private JTextField inputNom = new JTextField(10);
    private JButton buttonValider = new JButton("C'est parti !");
    private JButton buttonRetour = new JButton("Retour");

    public JPEleveLogin(){
        labelTitre.setFont(new Font("Lucida Handwriting", 3, 22));
        labelNom.setFont(new Font("Lucida Handwriting", 3, 14));
        labelPrenom.setFont(new Font("Lucida Handwriting", 3, 14));
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 2;
        c.anchor = GridBagConstraints.SOUTHWEST;
        c.gridwidth = 3;
        this.add(labelTitre,c);
        c.gridwidth = 1;
        c.weighty = 1;
        c.anchor = GridBagConstraints.NORTHWEST;
        this.add(buttonRetour,c);
        c.gridy = 1;
        c.anchor = GridBagConstraints.EAST;
        this.add(labelPrenom, c);
        c.gridy = 2;
        this.add(labelNom, c);
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(inputPrenom,c);
        c.gridy = 2;
        this.add(inputNom,c);
        c.gridx = 2;
        c.gridy = 3;
        c.fill = 0;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0,0,50,0);
        this.add(buttonValider,c);
        c.gridy = 5;
    }

    public JTextField getInputPrenom() {
        return inputPrenom;
    }

    public JTextField getInputNom() {
        return inputNom;
    }

    public JButton getButtonValider() {
        return buttonValider;
    }

    public JButton getButtonRetour() {
        return buttonRetour;
    }

}
