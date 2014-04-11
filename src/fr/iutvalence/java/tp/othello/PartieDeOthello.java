package fr.iutvalence.java.tp.othello;

/**
 * Définit une partie de Othello. Une partie est constitué de deux joueurs et
 * d'un plateau.
 */

public class PartieDeOthello {

	/** Le plateau utilisé. */
	private Plateau monPlateau;

	/** Le joueur blanc. */
	private Joueur joueurBlanc;

	/** Le joueur noir. */
	private Joueur joueurNoir;

	/**
	 * Instancie une nouvelle partie de Othello. Crée un nouveau Plateau. Crée
	 * un joueur noir et un joueur blanc.
	 */
	public PartieDeOthello() {
		this.monPlateau = new Plateau();
		this.joueurBlanc = new Joueur();
		this.joueurNoir = new Joueur();
	}

	/**
	 * La méthode permettant de jouer.
	 */
	public void jouer(Position unePosition) {
		Case laCase = this.monPlateau.obtenirCase(unePosition);
		laCase.poserPion(new Pion(Couleur.NOIR));
	}

	public boolean positionJouable(Couleur uneCouleur, Position unePosition) {
		Case laCase = this.monPlateau.obtenirCase(unePosition);
		if (laCase.estOccupee())
			return false;

		for (Direction direction : Direction.values()) {
			if (encercleAdversaire(uneCouleur, laCase.obtenirPosition(),
					direction))
				return true;

		}
		return false;
	}

	public boolean encercleAdversaire(Couleur uneCouleur, Position unePosition,
			Direction uneDirection) {
		Position laPositionVoisine = unePosition.obtenirVoisine(uneDirection);

		if (!this.monPlateau.positionValide(laPositionVoisine))
			return false;
		
		Case laCaseVoisine = this.monPlateau.obtenirCase(laPositionVoisine);

		if (!laCaseVoisine.estOccupee())
			return false;

		if (laCaseVoisine.obtenirPion().obtenirCouleur() == uneCouleur)
			return false;
		
		Position positionSuivante = laPositionVoisine;
		while (true) {
			positionSuivante = positionSuivante.obtenirVoisine(uneDirection);

			if (!this.monPlateau.positionValide(positionSuivante))
				return false;
			
			Case caseSuivante = this.monPlateau.obtenirCase(positionSuivante);

			if (!caseSuivante.estOccupee())
				return false;

			if (caseSuivante.obtenirPion().obtenirCouleur() == uneCouleur)
				return true;
		}
	}

	public Plateau obtenirPlateau() {
		return this.monPlateau;
	}
}
