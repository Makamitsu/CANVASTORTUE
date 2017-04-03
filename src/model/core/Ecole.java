package com.gp1.model.core;

import java.util.ArrayList;

/**
 * Created by ambie on 30/03/2017.
 */
public class Ecole {
    private ArrayList<Classe> classes = new ArrayList<>();
    private ArrayList<Professeur> professeurs = new ArrayList<>();
    private ArrayList<Exercice> exercices = new ArrayList<>();

    public ArrayList<Professeur> getProfesseurs() {
        return professeurs;
    }

    public ArrayList<Classe> getClasses() {
        return classes;
    }

    public void addExercice(Exercice e){
        exercices.add(e);
    }

    public void removeExercice(Exercice e){
        if (exercices.contains(e)){ exercices.remove(e); }
    }
    public boolean exercicesContains(Exercice e){
        return exercices.contains(e);
    }
    public ArrayList<Exercice> getExercices() {
        return exercices;
    }

}
