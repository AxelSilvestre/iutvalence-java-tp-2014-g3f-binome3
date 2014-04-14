package fr.iutvalence.java.tp.othello;
import java.util.ArrayList;

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
		this.joueurBlanc = new Joueur(Couleur.BLANC, "Joueur1");
		this.joueurNoir = new Joueur(Couleur.NOIR, "Joueur2");
	}
	
	public PartieDeOthello(String nomJoueurBlanc, String nomJoueurNoir) {
		this.monPlateau = new Plateau();
		this.joueurBlanc = new Joueur(Couleur.BLANC, nomJoueurBlanc);
		this.joueurNoir = new Joueur(Couleur.NOIR, nomJoueurNoir);
	}

	public void jouer() throws Exception
	{
		while (true)
		{
			System.out.println(this.joueurBlanc.obtenirNomJoueur() + " c'est votre tour ! \n");
			System.out.println("Saisir coordonnées (x,y) : ");
			this.jouerUnCoup(this.joueurBlanc);
			
			System.out.println(this.joueurNoir.obtenirNomJoueur() + " c'est votre tour ! \n");
			System.out.println("Saisir coordonnées (x,y) : ");
			this.jouerUnCoup(this.joueurNoir);
		}
	}

	/**
	 * La méthode permettant de jouer un pion.
	 * @throws Exception 
	 */
	private void jouerUnCoup(Joueur unJoueur) throws Exception {

		Position positionDesiree = unJoueur.obtenirPositionProposee();
		Case laCaseOuPoserLePion = this.monPlateau.obtenirCase(positionDesiree);
		Couleur couleurDuJoueur = unJoueur.obtenirCouleurJoueur();

		if (positionJouable(couleurDuJoueur, positionDesiree)) {
			laCaseOuPoserLePion.poserPion(new Pion(couleurDuJoueur));
			//	this.mettreAJourLePlateau(positionDesiree);
		}
		else {
			System.out.println("La position n'est pas jouable, saisissez en une autre.");
			this.jouerUnCoup(unJoueur); 
		}
	}

	private boolean positionJouable(Couleur uneCouleur, Position unePosition) {
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

	private boolean encercleAdversaire(Couleur uneCouleur, Position unePosition,
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

	private void mettreAJourLePlateau(Position unePosition) throws AucunPionARetournerExeption
	{		 
		ArrayList <Position> positionsDesCasesDesPionsAInverser = this.obtenirPositionsDesCasesDesPionsAInverser(unePosition);

		for (Position positionCourante : positionsDesCasesDesPionsAInverser) {
			this.monPlateau.obtenirCase(positionCourante).obtenirPion().inverserCouleur();
		} 
	}

	/**
	 * Retourne la liste de toutes les positions des cases des pions à inverser.
	 * @param unePosition : la position à partir de laquelle on analyse les cases du plateau.
	 * @return positionsDesCasesDesPionsAInverser : une liste de positions.
	 * @throws AucunPionARetournerExeption
	 */
	private ArrayList <Position> obtenirPositionsDesCasesDesPionsAInverser(Position unePosition) throws AucunPionARetournerExeption
	{
		ArrayList <Position> positionsDesCasesDesPionsAInverser = new ArrayList<Position>();
		Case laCase = this.monPlateau.obtenirCase(unePosition);
		Couleur laCouleurDuPionPose = this.monPlateau.obtenirCase(unePosition).obtenirPion().obtenirCouleur();


		for (Direction direction : Direction.values()) {

			Position laPositionVoisine = unePosition.obtenirVoisine(direction);

			if (!this.monPlateau.positionValide(laPositionVoisine))
				continue;

			Case laCaseVoisine = this.monPlateau.obtenirCase(laPositionVoisine);

			if (!laCaseVoisine.estOccupee())
				continue;

			if (laCaseVoisine.obtenirPion().obtenirCouleur() == laCouleurDuPionPose)
				continue;

			Position positionSuivante = laPositionVoisine;

			while (true) {
				ArrayList <Position> positionsTemporaires = new ArrayList<Position>();
				positionsTemporaires.add(positionSuivante);
				positionSuivante = positionSuivante.obtenirVoisine(direction);

				if (!this.monPlateau.positionValide(positionSuivante)) {
					positionsTemporaires.clear();
					continue; }
				else {
					Case caseSuivante = this.monPlateau.obtenirCase(positionSuivante);
					if (!caseSuivante.estOccupee()) {
						positionsTemporaires.clear();
						continue;
					}
					else {
						if (caseSuivante.obtenirPion().obtenirCouleur() == laCouleurDuPionPose)
							positionsDesCasesDesPionsAInverser.addAll(positionsTemporaires);
						continue;
					}
				}
			}
		} 

		if (positionsDesCasesDesPionsAInverser.isEmpty())
			return positionsDesCasesDesPionsAInverser;
		else
			throw new AucunPionARetournerExeption();
	}

	/**
	 * Retourne le plateau de la partie.
	 * @return Plateau : le plateau associé à la partie.
	 */
	public Plateau obtenirPlateau() {
		return this.monPlateau;
	}

	/**
	 * Affiche le nom des joueurs et la couleur de leur pions.
	 */
	public void afficherJoueurs()
	{
		System.out.println(this.joueurBlanc.obtenirNomJoueur() + " a les pions blancs.");
		System.out.println(this.joueurNoir.obtenirNomJoueur() + " a les pions noirs.  \n");
	}
}
