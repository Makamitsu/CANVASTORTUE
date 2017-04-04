package model.core;

import java.util.HashMap;

/**
 * Created by ambie on 29/03/2017.
 */
public class Eleve extends Individu {

    private Sexe sexe;

    private int age;

    private HashMap<Exercice, Avancement> avancements;

    public Eleve(String firstName, String lastName, Classe classe, Sexe sexe, int age) {
        super(firstName, lastName, classe);
        this.sexe = sexe;
        this.age = age;
        avancements = new HashMap<>();
    }

    public Eleve() {
        super("","",null);
    }

    public Sexe getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public void startExercice(Exercice e){
        if (!avancements.containsKey(e)){
            avancements.put(e, new Avancement(e));
        }
    }

    public Avancement getAvancement(Exercice e){
        if(classe.getEcole().exercicesContains(e)){
            return avancements.get(e);
        }
        else
        {
            return null;
        }

    }





}
