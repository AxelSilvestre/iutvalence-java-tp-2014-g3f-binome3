package fr.iutvalence.java.tp.othello;

/**
 * Lance l'application Othello.
 */

public class LanceurDeOthello {

	/**
	 * Crée une partie de Othello. Lance la partie. Ferme la partie quand elle
	 * est terminée.
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {
		System.out.println("Création d'une partie de Othello\n");
		Joueur joueurBlanc = new JoueurClavier(Couleur.BLANC, "Joueur1");
		Joueur joueurNoir = new JoueurClavier(Couleur.NOIR, "Joueur2");
		PartieDeOthello nouvellePartieDeOthello = new PartieDeOthello(joueurBlanc, joueurNoir); // On crée une nouvelle partie d'Othello.
		System.out.println("Démarrage de la partie\n");
		System.out.println(nouvellePartieDeOthello.obtenirPlateau()); // On affiche le plateau initialisé.
		nouvellePartieDeOthello.afficherJoueurs();
		nouvellePartieDeOthello.jouer();
		System.out.println(nouvellePartieDeOthello.obtenirPlateau()); // On affiche le plateau mis à jour.
		System.out.println("Fin de la partie");
	}
}
