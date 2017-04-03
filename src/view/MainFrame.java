package com.gp1.view;

import com.gp1.controller.OnCloseOperation;

import javax.swing.*;

/**
 * Created by ambie on 29/03/2017.
 */
public class MainFrame {
    private static JFrame window;

    public static void init(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException e) {}
        window = new JFrame("LOGO Tortue");
        window.addWindowListener(new OnCloseOperation());
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(600,400);
        window.setVisible(true);
    }

    public static void setMainPane(JPanel jp){
        window.getContentPane().removeAll();
        window.getContentPane().add(jp);
        jp.updateUI();
    }

    public static void main(String[] args){
        init();
    }
}
