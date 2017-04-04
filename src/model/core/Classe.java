package model.core;

import java.util.ArrayList;

/**
 * Created by ambie on 29/03/2017.
 */
public class Classe {
    private String name;
    private Professeur professeur;
    private ArrayList<Eleve> eleves;
    private Ecole ecole;

    public Ecole getEcole() {
        return ecole;
    }

    public Classe(String name, Ecole ecole) {
        this.name = name;
        this.ecole = ecole;
        eleves = new ArrayList<>();
    }

    public Classe(String name, Professeur professeur, Ecole ecole) {
        this.name = name;
        this.ecole = ecole;
        this.professeur = professeur;
        this.professeur.setClasse(this);
        eleves = new ArrayList<>();
    }

    public Eleve findEleve(String prenom, String nom){
        for (Eleve e: eleves) {
            if(e.getFirstName().equals(prenom) && e.getLastName().equals(nom))
                return e;
        }
        return null;
    }

    public void addEleve(Eleve e){
        eleves.add(e);
    }

    public String getName() {
        return name;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }




    public ArrayList<Eleve> getEleves() {
        return eleves;
    }
}
