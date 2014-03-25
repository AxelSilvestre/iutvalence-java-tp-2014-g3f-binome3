package fr.iutvalence.java.tp.othello;

/**
 * Représente un joueur d'Othello. Chaque joueur à une couleur (blanc ou noir).
 */
public class Joueur {

	// Définit si le joueur peut jouer ou non.
	private boolean aQuiLeTour;

	// Couleur du Joueur.
	private final Couleur couleurJoueur;

	/**
	 * Crée un joueur.
	 * @params une couleur : la couleur du joueur.
	 */
	public Joueur(Couleur couleur) {
		this.couleurJoueur = couleur;
		if (this.couleurJoueur == Couleur.BLANC)
			this.aQuiLeTour = true;
		else
			this.aQuiLeTour = false;
	}
}