package fr.iutvalence.java.tp.othello;

// TODO (fait) : Auto-generated Javadoc
// TODO (fait) écrire le commentaire

/**
 * Lance l'application Othello
 */
public class LanceurDeOthello {

	// TODO (fait) compléter le commentaire
	/**
	 * Crée une partie de Othello.
	 * Lance la partie
	 * Ferme la partie quand elle est terminée
	 */
	public static void main(String[] args)
	{
		// TODO (fait) corriger les accents
		System.out.println("Création d'une partie de Othello\n");
		PartieDeOthello nouvellePartieDeOthello = new PartieDeOthello();
		System.out.println("Démarrage de la partie\n");
		System.out.println(new Plateau()); // Test affichage du plateau.
		nouvellePartieDeOthello.jouer();
		System.out.println("Fin de la partie");
	}
}
