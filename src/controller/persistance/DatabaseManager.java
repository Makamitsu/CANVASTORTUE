package controller.persistance;

import model.core.*;

import javax.swing.*;

/**
 * Created by ambie on 29/03/2017.
 */
public class DatabaseManager {

    public static Ecole init() {

        //GENERATION DE VALEURS LE TEMPS DE FAIRE UNE VRAIE CONNEXION
        Ecole ecole = new Ecole();
        Classe classe1 = new Classe("CE2",ecole);
        Classe classe2 = new Classe("CM1",ecole);
        Professeur prof1 = new Professeur("George","Poutou",classe1,"toto","12345");
        Professeur prof2 = new Professeur("Isabelle","Charlinson",classe2,"titi","12345");
        Eleve e1 = new Eleve("Clément"  ,"Morisset" ,classe1,Sexe.GARCON,7);
        Eleve e2 = new Eleve("Caroline" ,"Bonnet"   ,classe1,Sexe.FILLE,8);
        Eleve e3 = new Eleve("Gael"     ,"Beaurin"  ,classe1,Sexe.GARCON,8);
        Eleve e4 = new Eleve("Hugo"     ,"Muller"   ,classe1,Sexe.GARCON,8);
        Eleve e5 = new Eleve("Pierre"   ,"Agostini" ,classe1,Sexe.GARCON,9);
        Eleve e6 = new Eleve("Augustin" ,"Ambiehl"  ,classe1,Sexe.GARCON,8);
        Eleve e7 = new Eleve("Alexia"   ,"Arruebo"  ,classe2,Sexe.FILLE,8);
        Eleve e8 = new Eleve("Paul"     ,"Gant"     ,classe2,Sexe.GARCON,9);
        Eleve e9 = new Eleve("Delphine" ,"Rousse"   ,classe2,Sexe.FILLE,8);
        Eleve e10 = new Eleve("Alexandre","Cailliaud",classe2,Sexe.GARCON,9);
        Eleve e11 = new Eleve("Aurélien","Courtillat",classe2,Sexe.GARCON,9);
        Eleve e12 = new Eleve("Yoline"  ,"Robichon"  ,classe2,Sexe.GARCON,9);
        classe1.addEleve(e1);
        classe1.addEleve(e2);
        classe1.addEleve(e3);
        classe1.addEleve(e4);
        classe1.addEleve(e5);
        classe1.addEleve(e6);
        classe2.addEleve(e7);
        classe2.addEleve(e8);
        classe2.addEleve(e9);
        classe2.addEleve(e10);
        classe2.addEleve(e11);
        classe2.addEleve(e12);
        classe1.setProfesseur(prof1);
        classe2.setProfesseur(prof2);
        ecole.getClasses().add(classe1);
        ecole.getClasses().add(classe2);
        ecole.getProfesseurs().add(prof1);
        ecole.getProfesseurs().add(prof2);
        ecole.addExercice(new Exercice("Exo1","png","a faire"));
        ecole.addExercice(new Exercice("Exo2","png","a refaire"));

        JFrame f = new JFrame("SIMULATION IMPORTATION BdD");
        f.getContentPane().add(new JTextArea("" +
                "        Ecole ecole = new Ecole();\n" +
                "        Classe classe1 = new Classe(\"CE2\");\n" +
                "        Classe classe2 = new Classe(\"CM1\");\n" +
                "        Professeur prof1 = new Professeur(\"George\",\"Poutou\",classe1,\"toto\",\"12345\");\n" +
                "        Professeur prof2 = new Professeur(\"Isabelle\",\"Charlinson\",classe2,\"titi\",\"12345\");\n" +
                "        Eleve e1 = new Eleve(\"Clément\"  ,\"Morisset\" ,classe1,Sexe.GARCON,7);\n" +
                "        Eleve e2 = new Eleve(\"Caroline\" ,\"Bonnet\"   ,classe1,Sexe.FILLE,8);\n" +
                "        Eleve e3 = new Eleve(\"Gael\"     ,\"Beaurin\"  ,classe1,Sexe.GARCON,8);\n" +
                "        Eleve e4 = new Eleve(\"Hugo\"     ,\"Muller\"   ,classe1,Sexe.GARCON,8);\n" +
                "        Eleve e5 = new Eleve(\"Pierre\"   ,\"Agostini\" ,classe1,Sexe.GARCON,9);\n" +
                "        Eleve e6 = new Eleve(\"Augustin\" ,\"Ambiehl\"  ,classe1,Sexe.GARCON,8);\n" +
                "        Eleve e7 = new Eleve(\"Alexia\"   ,\"Arruebo\"  ,classe2,Sexe.FILLE,8);\n" +
                "        Eleve e8 = new Eleve(\"Paul\"     ,\"Gant\"     ,classe2,Sexe.GARCON,9);\n" +
                "        Eleve e9 = new Eleve(\"Delphine\" ,\"Rousse\"   ,classe2,Sexe.FILLE,8);\n" +
                "        Eleve e10 = new Eleve(\"Alexandre\",\"Cailliaud\",classe2,Sexe.GARCON,9);\n" +
                "        Eleve e11 = new Eleve(\"Aurélien\",\"Courtillat\",classe2,Sexe.GARCON,9);\n" +
                "        Eleve e12 = new Eleve(\"Yoline\"  ,\"Robichon\"  ,classe2,Sexe.GARCON,9);\n" +
                "        classe1.addEleve(e1);\n" +
                "        classe1.addEleve(e2);\n" +
                "        classe1.addEleve(e3);\n" +
                "        classe1.addEleve(e4);\n" +
                "        classe1.addEleve(e5);\n" +
                "        classe1.addEleve(e6);\n" +
                "        classe2.addEleve(e7);\n" +
                "        classe2.addEleve(e8);\n" +
                "        classe2.addEleve(e9);\n" +
                "        classe2.addEleve(e10);\n" +
                "        classe2.addEleve(e11);\n" +
                "        classe2.addEleve(e12);\n" +
                "        classe1.setProfesseur(prof1);\n" +
                "        classe2.setProfesseur(prof2);\n" +
                "        ecole.getClasses().add(classe1);\n" +
                "        ecole.getClasses().add(classe2);\n" +
                "        ecole.getProfesseurs().add(prof1);\n" +
                "        ecole.getProfesseurs().add(prof2);\n" +
                "        classe1.addExercice(new Exercice(\"Exo1\",\"png\",\"a faire\"));\n" +
                "        classe1.addExercice(new Exercice(\"Exo2\",\"png\",\"a refaire\"));\n"));

        f.setSize(550,650);
//        f.setVisible(true);

        JOptionPane.showMessageDialog(null, "Importation des données", "Import", JOptionPane.INFORMATION_MESSAGE);
        //TODO: Connexion a la base de donnée pour l'importation
        return ecole;
    }

    public static void save(Ecole e) {
        JOptionPane.showMessageDialog(null, "Sauvegarde dans la base de données", "Export", JOptionPane.INFORMATION_MESSAGE);
        //TODO: Connexion a la base de donnée pour la sauvegarde de cette ecole
    }
}
