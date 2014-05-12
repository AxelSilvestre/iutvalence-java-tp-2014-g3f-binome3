package fr.iutvalence.java.tp.othello;

import java.util.ArrayList;

/**
 * Définit une partie de Othello. Une partie est constitué de deux joueurs et
 * d'un plateau.
 */

public class PartieDeOthello
{

	/** Le plateau utilisé. */
	private Plateau plateau;

	/** Le joueur blanc. */
	private Joueur joueurBlanc;

	/** Le joueur noir. */
	private Joueur joueurNoir;

	/**
	 * L'affichage
	 */
	private Affichage affichage;

	/**
	 * Instancie une nouvelle partie de Othello. Crée un nouveau Plateau. Crée
	 * un joueur noir et un joueur blanc.
	 */
	public PartieDeOthello(Joueur joueurBlanc, Joueur joueurNoir, Affichage affichage)
	{
		this.plateau = new Plateau();
		this.joueurBlanc = joueurBlanc;
		this.joueurNoir = joueurNoir;
		this.affichage  = affichage;
	}

	public PartieDeOthello(String nomJoueurBlanc, String nomJoueurNoir)
	{
		this.plateau = new Plateau();
		this.joueurBlanc = new JoueurClavier(Couleur.BLANC, nomJoueurBlanc);
		this.joueurNoir = new JoueurClavier(Couleur.NOIR, nomJoueurNoir);
	}

	public void jouer() throws Exception
	{
		while (true)
		{
			this.affichage.afficherPlateau(this.plateau);
			this.affichage.afficherDemandeCoordonnees(joueurBlanc);
			this.jouerUnCoup(this.joueurBlanc);

			this.affichage.afficherPlateau(this.plateau);			
			this.affichage.afficherDemandeCoordonnees(joueurNoir);
			this.jouerUnCoup(this.joueurNoir);
		}
	}

	/**
	 * La méthode permettant de jouer un pion.
	 * 
	 * @throws Exception
	 */
	private void jouerUnCoup(Joueur unJoueur) throws Exception
	{

		Position positionDesiree = unJoueur.obtenirPositionProposee();
		Case laCaseOuPoserLePion = this.plateau.obtenirCase(positionDesiree);
		Couleur couleurDuJoueur = unJoueur.obtenirCouleur();

		if (positionJouable(couleurDuJoueur, positionDesiree))
		{
			laCaseOuPoserLePion.poserPion(new Pion(couleurDuJoueur));
			// this.mettreAJourLePlateau(positionDesiree);
		}
		else
		{
			this.affichage.afficherPositionInvalide(positionDesiree);
			this.jouerUnCoup(unJoueur);
		}
	}

	private boolean positionJouable(Couleur uneCouleur, Position unePosition)
	{
		Case laCase = this.plateau.obtenirCase(unePosition);
		if (laCase.estOccupee())
			return false;

		for (Direction direction : Direction.values())
		{
			if (encercleAdversaire(uneCouleur, laCase.obtenirPosition(),
					direction))
				return true;

		}
		return false;
	}

	private boolean encercleAdversaire(Couleur uneCouleur,
			Position unePosition, Direction uneDirection)
	{

		Position laPositionVoisine = unePosition.obtenirVoisine(uneDirection);

		if (!this.plateau.estPositionValide(laPositionVoisine))
			return false;

		Case laCaseVoisine = this.plateau.obtenirCase(laPositionVoisine);

		if (!laCaseVoisine.estOccupee())
			return false;

		if (laCaseVoisine.obtenirPion().obtenirCouleur() == uneCouleur)
			return false;

		Position positionSuivante = laPositionVoisine;
		while (true)
		{
			positionSuivante = positionSuivante.obtenirVoisine(uneDirection);

			if (!this.plateau.estPositionValide(positionSuivante))
				return false;

			Case caseSuivante = this.plateau.obtenirCase(positionSuivante);

			if (!caseSuivante.estOccupee())
				return false;

			if (caseSuivante.obtenirPion().obtenirCouleur() == uneCouleur)
				return true;
		}
	}

	private void mettreAJourLePlateau(Position unePosition)
			throws AucunPionARetournerExeption
	{
		ArrayList<Position> positionsDesCasesDesPionsAInverser = this
				.obtenirPositionsDesCasesDesPionsAInverser(unePosition);

		for (Position positionCourante : positionsDesCasesDesPionsAInverser)
		{
			this.plateau.obtenirCase(positionCourante).obtenirPion()
					.inverserCouleur();
		}
	}

	/**
	 * Retourne la liste de toutes les positions des cases des pions à inverser.
	 * 
	 * @param unePosition
	 *            : la position à partir de laquelle on analyse les cases du
	 *            plateau.
	 * @return positionsDesCasesDesPionsAInverser : une liste de positions.
	 * @throws AucunPionARetournerExeption
	 */
	private ArrayList<Position> obtenirPositionsDesCasesDesPionsAInverser(
			Position unePosition) throws AucunPionARetournerExeption
	{
		ArrayList<Position> positionsDesCasesDesPionsAInverser = new ArrayList<Position>();
		Case laCase = this.plateau.obtenirCase(unePosition);
		Couleur laCouleurDuPionPose = this.plateau.obtenirCase(unePosition)
				.obtenirPion().obtenirCouleur();

		for (Direction direction : Direction.values())
		{

			Position laPositionVoisine = unePosition.obtenirVoisine(direction);

			if (!this.plateau.estPositionValide(laPositionVoisine))
				continue;

			Case laCaseVoisine = this.plateau.obtenirCase(laPositionVoisine);

			if (!laCaseVoisine.estOccupee())
				continue;

			if (laCaseVoisine.obtenirPion().obtenirCouleur() == laCouleurDuPionPose)
				continue;

			Position positionSuivante = laPositionVoisine;

			while (true)
			{
				ArrayList<Position> positionsTemporaires = new ArrayList<Position>();
				positionsTemporaires.add(positionSuivante);
				positionSuivante = positionSuivante.obtenirVoisine(direction);

				if (!this.plateau.estPositionValide(positionSuivante))
				{
					positionsTemporaires.clear();
					continue;
				}
				else
				{
					Case caseSuivante = this.plateau
							.obtenirCase(positionSuivante);
					if (!caseSuivante.estOccupee())
					{
						positionsTemporaires.clear();
						continue;
					}
					else
					{
						if (caseSuivante.obtenirPion().obtenirCouleur() == laCouleurDuPionPose)
							positionsDesCasesDesPionsAInverser
									.addAll(positionsTemporaires);
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

}
