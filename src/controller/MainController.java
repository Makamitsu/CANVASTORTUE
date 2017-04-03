package com.gp1.controller;

import com.gp1.controller.persistance.DatabaseManager;
import com.gp1.model.core.Ecole;
import com.gp1.view.MainFrame;


/**
 * Created by ambie on 29/03/2017.
 */
public class MainController {

    private MainFrame view;
    private Ecole ecole;

    public MainController(){
        ecole = DatabaseManager.init();
        view = new MainFrame();
        new HandlerLogin(this);
    }

    public MainFrame getView() {
        return view;
    }

    public void goToEleveLogin(){
        new HandlerProfLogin(this);
    }

    public Ecole getEcole() {
        return ecole;
    }

    public static void main(String[] args) {
        new MainController();
    }


}
