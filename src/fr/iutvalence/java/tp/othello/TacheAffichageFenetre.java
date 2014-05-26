package fr.iutvalence.java.tp.othello;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class TacheAffichageFenetre implements Runnable, Affichage, ActionListener {
	
	private JFrame fenetre;
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
		// Création de la fenêtre
		fenetre = new JFrame();
		fenetre.setTitle("Othello");
		fenetre.setSize(800, 400);
		fenetre.setResizable(false);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setJMenuBar(new BarreDeMenuDuJeu(this.fenetre));
		
		// Création du splitpane de la grille de jeu
		splitPaneHorizontal = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPaneHorizontal.setBorder(null);
		splitPaneHorizontal.setResizeWeight(0.0);
		splitPaneHorizontal.setEnabled(false);
	
		// Création du splitpane du score et des indications de jeu
		splitPaneVertical = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		splitPaneVertical.setBorder(null);
		splitPaneVertical.setResizeWeight(0.5);
		splitPaneVertical.setEnabled(false);
		
		// Création du panneau de la grille de jeu
		grilleDeJBouttonCases = new JPanel();
		grilleDeJBouttonCases.setLayout(new GridLayout(8,8));
		
		// Création du panneau du score
		panneauScore = new JPanel();
		
		// Création du panneau des indications de jeu
		panneauIndications = new JPanel();
		
		// Création des labels
		labelScoreJoueurBlanc = new JLabel();
		labelScoreJoueurNoir = new JLabel();
		labelIndications = new JLabel();
		
		// Assemblage du splitpane vertical	
		panneauIndications.add(new JLabel("Indications de jeu"));
		panneauIndications.add(labelIndications);
		panneauScore.add(new JLabel("Score"));
		panneauScore.add(labelScoreJoueurBlanc);
		panneauScore.add(labelScoreJoueurNoir);
		
		splitPaneVertical.add(panneauIndications);
		splitPaneVertical.add(panneauScore);
		
		// Initialisation des boutons de la grille de jeu
		this.cases = new JButtonCase[8][8];
		
		for (int numeroDeLigne = 0; numeroDeLigne < 8; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < 8; numeroDeColonne++)
			{
				this.cases[numeroDeLigne][numeroDeColonne] = new JButtonCase(
						new Position(numeroDeLigne, numeroDeColonne));
				grilleDeJBouttonCases.add(cases[numeroDeLigne][numeroDeColonne]);
			}
		this.cases[3][3].mettreCouleur(Couleur.BLANC);
		this.cases[4][4].mettreCouleur(Couleur.BLANC);
		this.cases[3][4].mettreCouleur(Couleur.NOIR);
		this.cases[4][3].mettreCouleur(Couleur.NOIR);
		
		// Assemblage du splitpane horizontal
		splitPaneHorizontal.add(grilleDeJBouttonCases);	
		splitPaneHorizontal.add(splitPaneVertical);
		
		// Assemblage du panneau principal
		fenetre.setContentPane(splitPaneHorizontal);

		// Affichage de la fenêtre
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
