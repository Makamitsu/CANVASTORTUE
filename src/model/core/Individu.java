package model.core;


/**
 * Created by ambie on 29/03/2017.
 */
public abstract class Individu {
    protected String firstName;
    protected String lastName;
    protected Classe classe;

    public Individu(String firstName, String lastName, Classe classe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classe = classe;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
