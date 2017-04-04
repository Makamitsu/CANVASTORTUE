package HCinterface.moduleEleve;

import javax.swing.JFrame;

import controller.persistance.DatabaseManager;
import model.ModuleEleve;
import model.core.Classe;
import model.core.Ecole;

public class Main {

	
	public static void main(String[] args){
		Ecole e = DatabaseManager.init();
		Classe c = e.getClasses().get(0);
		ModuleEleve el = new ModuleEleve(c.getEleves().get(0));
		JFrame jf = new JFrame();
		PremierePage p = new PremierePage(el);
		jf.add(p);
		jf.setVisible(true);
		jf.setSize(800, 500);
	}
}
