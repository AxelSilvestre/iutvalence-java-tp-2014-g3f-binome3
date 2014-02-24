package fr.iutvalence.java.tp.othello;

// TODO écrire le commentaire
public class LanceurDeOthello {

	// TODO compléter le commentaire
	/**
	 * Start a new game of Othello.
	 */
	public static void main(String[] args)
	{
		// TODO corriger les accents
		System.out.println("Cr�ation d'une partie de Othello");
		PartieDeOthello nouvellePartieDeOthello = new PartieDeOthello();
		System.out.println("Demarrage de la partie");
		nouvellePartieDeOthello.jouer();
		System.out.println("Fin de la partie");
	}
}
