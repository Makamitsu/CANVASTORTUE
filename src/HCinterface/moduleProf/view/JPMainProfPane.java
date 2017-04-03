package com.gp1.HCinterface.moduleProf.view;

import com.gp1.model.core.Classe;
import com.gp1.model.core.Exercice;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by ambie on 30/03/2017.
 */
public class JPMainProfPane extends JPanel{

    private ArrayList<Classe> classes;
    private ArrayList<Exercice> exercices;
    private JTree tree;

    private JPanel leftPart;
    private JPanel rightPart;

    private JScrollPane left;
    private JScrollPane right;

    private JSplitPane horizontalSplitPane;

    public JPMainProfPane(ArrayList<Classe> classes, ArrayList<Exercice> exercices) {
        this.classes = classes;
        this.exercices = exercices;

        leftPart = new JPanel();
        rightPart = new JPanel();

        left = new JScrollPane(leftPart);
        right = new JScrollPane(rightPart);

        horizontalSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, left, right);
    }

    public void setMainContent(JPanel jp){
        this.rightPart.removeAll();
    }


}
