package com.gp1.model;

import com.gp1.model.core.*;

/**
 * Created by ambie on 01/04/2017.
 */
public class ModuleProf {

    private Professeur professeur;

    public ModuleProf(Professeur professeur) {
        this.professeur = professeur;
    }

    public void creationExercice(){

    }

    public void corrigerExercice(Correction c, Tentative t){
        t.setCorrection(c);
    }

    /**
     * method removeExo supprime l'exercice donné si aucun eleve n'a commencé a faire de tentative sur cet
     * exercice.
     * @param exo L'exercice qui doit être retirer.
     * @return Retourne un boolean qui indique si cet exercice a pu être retirer.
     */
    public boolean removeExo(Exercice exo){
        if(!exo.isStarted()){
            Ecole ecole = professeur.getClasse().getEcole();
            ecole.removeExercice(exo);
            return true;
        }else
            return false;
    }

    public void modifierExercice(Exercice exo){

    }

    public Professeur getProfesseur() {
        return professeur;
    }
}
