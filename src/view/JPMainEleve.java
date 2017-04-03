package com.gp1.view;

import com.gp1.model.core.Eleve;
import com.gp1.model.core.Exercice;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by ambie on 30/03/2017.
 */
public class JPMainEleve extends JPanel{

    private Eleve eleve;

    private JButton buttonRetour;
    private JLabel infoConn;
    private JLabel titre;
    private JScrollPane scrollPane;
    private JPanel pane;
    private ArrayList<JPExoToDo> choixExercice;

    public JPMainEleve(Eleve eleve) {
        choixExercice = new ArrayList<>();
        pane = new JPanel();
        scrollPane = new JScrollPane(pane);
        buttonRetour = new JButton("Partir");
        infoConn = new JLabel("Je suis "+eleve.getFirstName()+" "+eleve.getLastName());

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.NORTHWEST;
        this.add(buttonRetour, c);
        c.anchor = GridBagConstraints.NORTH;
        this.add(infoConn, c);


        for (Exercice e:eleve.getClasse().getEcole().getExercices()) {
            choixExercice.add(new JPExoToDo(e, eleve));
        }

        pane.setLayout(new BoxLayout(pane,BoxLayout.PAGE_AXIS));
        for (JPExoToDo j: choixExercice) {
            pane.add(j);
        }
        c.gridy = 1;
        this.add(scrollPane, c);

    }
}
