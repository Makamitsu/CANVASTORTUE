package HCinterface.moduleEleve;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.net.URL;

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
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,4));
		JButton b = new JButton();
		JLabel nomex;
		JLabel avancemen;
		JLabel correctio;
		
		URL urlpasvalidee = getClass().getResource("paseffectue.png");
		URL urlvalide = getClass().getResource("valide.jpg");
		URL urlpleure = getClass().getResource("pleure.jpg");
		URL urlmoyen = getClass().getResource("moyen.jpg");
		URL urlsourire = getClass().getResource("sourire.jpg");
		
		ImageIcon etat;
		ImageIcon icon;
		for(int i = 0; i<modE.getEleve().getClasse().getEcole().getExercices().size();i++)
		{
			Exercice ex = modE.getEleve().getClasse().getEcole().getExercices().get(i);

			nomex = new JLabel(ex.getName());
			
			Avancement av = modE.getEleve().getAvancement(ex);
			if(null != av)
			{
				if(null == av.getLastTentative())
				{
					etat = new ImageIcon(urlvalide);
					avancemen = new JLabel(etat);
					icon = new ImageIcon(urlpasvalidee);
					correctio = new JLabel(icon);
				}
				else
				{
					etat = new ImageIcon(urlvalide);
					avancemen = new JLabel(etat);
					Tentative res = modE.getEleve().getAvancement(ex).getLastTentativeCorigee();
					if(null == res)
					{
						icon = new ImageIcon(urlpasvalidee);
						correctio = new JLabel(icon);
					}
					else
					{
						if(res.getCorrection().getNote().equals("ACQUIS"))
						{
							icon = new ImageIcon(urlsourire);
							correctio = new JLabel(icon);
						}
						else if(res.getCorrection().getNote().equals("EN_COURS_AQUISITION"))
						{
							icon = new ImageIcon(urlmoyen);
							correctio = new JLabel(icon);
						}
						else
						{
							icon = new ImageIcon(urlpleure);
							correctio = new JLabel(icon);
						}
					}
				}
				p.add(nomex);
				p.add(avancemen);
				p.add(correctio);
			}
		}
		this.add(p, BorderLayout.CENTER);
	}
}
