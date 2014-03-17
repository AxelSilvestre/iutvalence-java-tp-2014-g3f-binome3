package fr.iutvalence.java.tp.othello;

/**
 * Définit une partie de Othello. Une partie est constitué de deux joueurs et d'un plateau.
 */

public class PartieDeOthello {
	/** Le plateau utilisé. */
	private Plateau monPlateau;

	/** Le joueur blanc. */
	private Joueur joueurBlanc;

	/** Le joueur noir. */
	private Joueur joueurNoir;

	/**
	 * Instancie une nouvelle partie de Othello. Crée un nouveau Plateau. 
	 * Crée un joueur noir et un joueur blanc.
	 */

	public PartieDeOthello() {
		this.monPlateau = new Plateau();
		this.joueurBlanc = new Joueur(Couleur.BLANC);
		this.joueurNoir = new Joueur(Couleur.NOIR);
	}

	/**
	 * La méthode permettant de jouer.
	 */

	public void jouer() {

		// En cours de test
//
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Veuillez saisir les coordonnées :");
//		 System.out.println("x = ?");
//		 int x = sc.nextInt();
//		 System.out.println("y = ?");
//		 int y = sc.nextInt();
//		
//		 monPlateau.occuperCase(x, y, couleur);

	}
}
