package fr.iutvalence.java.tp.othello;

/**
 * Lance l'application Othello.
 */

public class LanceurDeOthello {

	/**
	 * Crée une partie de Othello. Lance la partie. Ferme la partie quand elle
	 * est terminée.
	 */

	public static void main(String[] args) {
		System.out.println("Création d'une partie de Othello\n");
		PartieDeOthello nouvellePartieDeOthello = new PartieDeOthello();
		System.out.println("Démarrage de la partie\n");
		System.out.println(new Plateau()); // Test l'affichage d'un plateau.
		nouvellePartieDeOthello.jouer();
		System.out.println("Fin de la partie");
	}
}
