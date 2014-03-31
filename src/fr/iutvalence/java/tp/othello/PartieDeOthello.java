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
		this.joueurBlanc = new Joueur("Joueur1");
		this.joueurNoir = new Joueur("Joueur2");
	}

	/**
	 * La méthode permettant de jouer.
	 */

	public void jouer() 
	{

	}

	public boolean positionValide(Couleur uneCouleur, Position unePosition)
	{				
		for (Direction direction : Direction.values()) {
			
			Case laCase = this.monPlateau.obtenirCase(unePosition.obtenirVoisine(direction));
			
			if (this.monPlateau.obtenirCase(unePosition).estOccupee())
				do {
					
				} while (laCase.obtenirPion().obtenirCouleur() == uneCouleur.obtenirCouleurInverse());
		
				return false;
		}
	}
}
