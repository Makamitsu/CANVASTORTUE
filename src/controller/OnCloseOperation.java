package com.gp1.controller;

import com.gp1.controller.persistance.DatabaseManager;
import com.gp1.model.core.Ecole;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by ambie on 29/03/2017.
 */
public class OnCloseOperation implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        DatabaseManager.save(new Ecole());
        //TODO: uncoment when the connexion is done.
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
