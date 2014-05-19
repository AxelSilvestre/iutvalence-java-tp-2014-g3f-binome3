package fr.iutvalence.java.tp.othello;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class TacheAffichageFenetre implements Runnable, Affichage, ActionListener {
	
	private JFrame fenetre;
	private JPanel panneauPrincipal;
	private JSplitPane splitPaneHorizontal;
	private JPanel grilleDeJBouttonCases;
	private JSplitPane splitPaneVertical;
	private JPanel panneauScore;
	private JPanel panneauIndications;
	private BarreDeMenuDuJeu menu;
	
	private JLabel labelIndications;
	private JLabel labelScoreJoueurBlanc;
	private JLabel labelScoreJoueurNoir;
	
	private GridLayout dispositionCases = new GridLayout(8,8);
	private JButtonCase[][] cases;
	
	private void initialiserInterfaceGraphique()
	{
		
		fenetre = new JFrame();
		fenetre.setTitle("Othello");
		fenetre.setSize(500,500);
		fenetre.setResizable(false);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setJMenuBar(new BarreDeMenuDuJeu(this.fenetre));
		
		panneauPrincipal = new JPanel();
		
		splitPaneHorizontal = new JSplitPane();
		splitPaneHorizontal.setBorder(null);
	
		splitPaneVertical = new JSplitPane();
		splitPaneVertical.setBorder(null);
		
		fenetre.setContentPane(panneauPrincipal);
		panneauPrincipal.add(splitPaneHorizontal);
		
		splitPaneHorizontal.add(grilleDeJBouttonCases);
		grilleDeJBouttonCases.setLayout(dispositionCases);
		splitPaneHorizontal.add(splitPaneVertical);
		
		splitPaneVertical.add(panneauIndications);
		splitPaneVertical.add(panneauScore);
		
		panneauIndications.add(labelIndications);
		panneauScore.add(labelScoreJoueurBlanc);
		panneauScore.add(labelScoreJoueurNoir);
				
		// Initialisation des boutons de la grille
		for (int numeroDeLigne = 0; numeroDeLigne < 8; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < 8; numeroDeColonne++)
			{
				this.cases[numeroDeLigne][numeroDeColonne] = new JButtonCase(
						new Position(numeroDeLigne, numeroDeColonne));
				grilleDeJBouttonCases.add(cases[numeroDeLigne][numeroDeColonne]);
			}
		

		fenetre.setVisible(true);
	}
	
	
	
	public void run()
	{
		this.initialiserInterfaceGraphique();
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void afficherDemandeCoordonnees(Joueur joueurBlanc) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void afficherPositionInvalide(Position positionDesiree) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void afficherPlateau(Plateau plateau) {
		// TODO Auto-generated method stub
		
	}
}
