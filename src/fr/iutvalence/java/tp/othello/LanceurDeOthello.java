package fr.iutvalence.java.tp.othello;

public class LanceurDeOthello {

	/**
	 * Start a new game of Othello.
	 */

	public static void main(String[] args)
	{
		
		System.out.println("Création d'une partie de Othello");
		Partie partieDeOthello = new Partie();
		System.out.println("Demarrage de la partie");
		partieDeOthello.jouer();
		System.out.println("Fin de la partie");
	}
	
	
}
