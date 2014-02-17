package fr.iutvalence.java.tp.othello;

public class LanceurDeOthello {

	/**
	 * Start a new game of Othello.
	 */

	public static void main(String[] args)
	{
		
		System.out.println("Création d'une partie de Othello");
		PartieDeOthello nouvellePartieDeOthello = new PartieDeOthello();
		System.out.println("Demarrage de la partie");
		nouvellePartieDeOthello.jouer();
		System.out.println("Fin de la partie");
	}
	
	
}
