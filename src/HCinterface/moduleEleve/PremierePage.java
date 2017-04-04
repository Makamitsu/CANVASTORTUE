package HCinterface.moduleEleve;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

import model.core.Avancement;
import model.core.EchelleEval;

import model.core.Exercice;
import model.core.Tentative;
import model.ModuleEleve;

/**
 * Created by crousti on 01/04/2017.
 */


public class PremierePage extends JPanel{
	
	private ModuleEleve modE;
	
	public PremierePage(ModuleEleve e)
	{
		this.modE = e;
		this.setLayout(new BorderLayout());
		JLabel l = new JLabel(modE.getEleve().getFirstName());
		this.add(l, BorderLayout.NORTH);
		JScrollPane scr = new JScrollPane();
		scr.setLayout(new GridLayout(0,3));
		JButton b = new JButton();
		JLabel nomex;
		ImageIcon etat;
		ImageIcon icon;
		for(Exercice ex : modE.getEleve().getClasse().getEcole().getExercices())
		{
			nomex = new JLabel(ex.getName());
			Avancement av = modE.getEleve().getAvancement(ex);
			if(null == av.getLastTentative())
			{
				etat = new ImageIcon("images/paseffectue.jpg");
				icon = new ImageIcon("images/pascorrige.jpg");
			}
			else
			{
				etat = new ImageIcon("images/valide.jpg");
				Tentative res = modE.getEleve().getAvancement(ex).getLastTentativeCorigee();
				if(null == res)
				{
					icon = new ImageIcon("images/pascorrige.jpg");
				}
				else
				{
					if(res.getCorrection().getNote().equals("ACQUIS"))
					{
						icon = new ImageIcon("images/sourire.jpg");
					}
					else if(res.getCorrection().getNote().equals("EN_COURS_AQUISITION"))
					{
						icon = new ImageIcon("images/moyen.jpg");
					}
					else
					{
						icon = new ImageIcon("images/pleure.jpg");
					}
				}
			}
			
			
			
			
		}
		
	}
	
}
