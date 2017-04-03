package com.gp1.model.core;

import java.util.ArrayList;

/**
 * Created by ambie on 29/03/2017.
 */
public class Tentative {
    private ArrayList<Commandes> commandes;
    private Boolean over = false;
    private Avancement avancement;
    private Correction correction;

    public Correction getCorrection() {
        return correction;
    }

    public void setCorrection(Correction correction) {
        this.correction = correction;
    }

    public Tentative(Avancement avancement) {
        this.avancement = avancement;
        commandes = new ArrayList<>();
    }

    public Avancement getAvancement() {
        return avancement;
    }

    public void addCommande(Commandes c){
        if (!over){
            commandes.add(c);
        }
    }

    public void finirTentative(){
        this.over = true;
    }
}
