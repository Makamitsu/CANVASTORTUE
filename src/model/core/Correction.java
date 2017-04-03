package com.gp1.model.core;

/**
 * Created by ambie on 01/04/2017.
 */
public class Correction {
    private Professeur professeur;
    private Tentative tentative;
    private EchelleEval note;
    private String Commentaire;

    public Correction(Professeur professeur, Tentative tentative, EchelleEval note, String commentaire) {
        this.professeur = professeur;
        this.tentative = tentative;
        this.note = note;
        Commentaire = commentaire;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public Tentative getTentative() {
        return tentative;
    }

    public EchelleEval getNote() {
        return note;
    }

    public String getCommentaire() {
        return Commentaire;
    }
}
