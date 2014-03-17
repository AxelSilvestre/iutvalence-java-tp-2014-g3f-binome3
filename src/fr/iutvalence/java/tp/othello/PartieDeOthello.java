package fr.iutvalence.java.tp.othello;

// TODO corriger le commentaire
/**
 * Débute une partie de Othello.
 */
public class PartieDeOthello
{
	/** Le plateau utilisé. */
	private Plateau monPlateau;

	/** Le joueur blanc. */
	private Joueur joueurBlanc;

	/** Le joueur noir. */
	private Joueur joueurNoir;

	// TODO écrire un commentaire plus précis
	/**
	 * Instancie une nouvelle partie de Othello.
	 */
	public PartieDeOthello()
	{
		this.monPlateau = new Plateau();
		this.joueurBlanc = new Joueur(Couleur.BLANC);
		this.joueurNoir = new Joueur(Couleur.NOIR);
	}

	/**
	 * La méthode permettant de jouer.
	 */
	public void jouer()
	{

		// En cours de test

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Veuillez saisir les coordonnées :");
		// System.out.println("x = ?");
		// int x = sc.nextInt();
		// System.out.println("y = ?");
		// int y = sc.nextInt();
		//
		// monPlateau.occuperCase(x, y, couleur);

	}
}
