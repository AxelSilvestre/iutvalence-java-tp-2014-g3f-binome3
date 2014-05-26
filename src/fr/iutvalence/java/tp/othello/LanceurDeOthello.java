package fr.iutvalence.java.tp.othello;
import javax.swing.SwingUtilities;

/**
 * Lance l'application Othello.
 */

public class LanceurDeOthello
{

	/**
	 * Crée une partie de Othello. Lance la partie. Ferme la partie quand elle
	 * est terminée.
	 * 
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception
	{
		Joueur joueurBlanc = new JoueurClavier(Couleur.BLANC, "Joueur1");
		Joueur joueurNoir = new JoueurClavier(Couleur.NOIR, "Joueur2");
		PartieDeOthello nouvellePartieDeOthello = new PartieDeOthello(
				joueurBlanc, joueurNoir, new AffichageConsole()); 
		// On crée une nouvelle partie d'Othello.
		SwingUtilities.invokeLater(new TacheAffichageFenetre());
		nouvellePartieDeOthello.jouer();
	}
}
