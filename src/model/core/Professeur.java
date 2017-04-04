package model.core;

/**
 * Created by ambie on 29/03/2017.
 */
public class Professeur extends Individu{

    private String login;
    private String password;

    public Professeur(String firstName, String lastName, Classe classe, String login, String password) {
        super(firstName, lastName, classe);
        this.login = login;
        this.password = password;
    }



    public boolean compareLogin(String login){
        return this.login.equals(login);
    }
    public boolean comparePassword(String password){
        return this.password.equals(password);
    }


}
