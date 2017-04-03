package com.gp1.view;

import com.gp1.model.core.Eleve;
import com.gp1.model.core.Exercice;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ambie on 30/03/2017.
 */
public class JPExoToDo extends JPanel{

    private Exercice exercice;
    private Eleve eleve;
    private JButton buttonStart;


    public JPExoToDo(Exercice exercice, Eleve eleve) {
        buttonStart = new JButton("Commencer");
        this.exercice = exercice;
        this.eleve = eleve;
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(5,15,5,15);
        this.add(new JLabel(exercice.getName()), c);
        c.anchor = GridBagConstraints.EAST;
        if(null!=eleve.getAvancement(exercice) ){
            if(eleve.getAvancement(exercice).isReussi()){
                JLabel l = new JLabel("Reussi !");
                l.setForeground(Color.green);
                this.add(l, c);
            }else {
                this.add(buttonStart, c);
            }
        }
    }


}
