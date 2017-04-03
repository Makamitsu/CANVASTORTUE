package com.gp1.view;

import javax.swing.*;
import java.awt.*;


public class JPLogin extends JPanel{

    private JButton buttonEleve = new JButton("Élève");
    private JButton buttonProf = new JButton("Professeur");
    private JLabel labelTitre = new JLabel("Logo Tortue ");
    private Container pane = new Container();

    //Constructeur
    public JPLogin()
    {
        labelTitre.setFont(new Font("Lucida Handwriting", 3, 28));

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.weighty = 1;
        c.gridy = 0;
        this.add(labelTitre, c);
        c.ipady = 50;
        c.ipadx = 90;
        c.gridy = 1;
        this.add(buttonEleve, c);
        c.ipady = 0;
        c.ipadx = 0;
        c.gridy = 2;
        this.add(buttonProf, c);




    }

    public JButton getButtonEleve() {
        return buttonEleve;
    }

    public JButton getButtonProf() {
        return buttonProf;
    }
}
