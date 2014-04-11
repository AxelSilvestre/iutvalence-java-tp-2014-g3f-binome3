package fr.iutvalence.java.tp.othello;

/**
 * Crée un plateau constitué de 8X8 cases et pose 4 pions au centre.
 */

public class Plateau {
	// Nombre maximum de lignes du tableau.
	private final static int NOMBRE_DE_LIGNES = 8;

	// Nombre maximum de colonnes du plateau.
	private final static int NOMBRE_DE_COLONNES = 8;

	// Tableau de cases.
	private Case[][] cases;

	// Plateau constitué de cases vides ou non.
	public Plateau() {

		this.cases = new Case[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		// Creé les objets de type Case du tableau.
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				this.cases[numeroDeLigne][numeroDeColonne] = new Case(new Position(numeroDeLigne,  numeroDeColonne));
		this.installerPions();
	}
	
	// Pose les 4 premiers pions.
	private void installerPions()
	{
		this.cases[3][3].poserPion(new Pion(Couleur.BLANC));
		this.cases[4][4].poserPion(new Pion(Couleur.BLANC));
		this.cases[3][4].poserPion(new Pion(Couleur.NOIR));
		this.cases[4][3].poserPion(new Pion(Couleur.NOIR));
	}
	
	public Case obtenirCase(Position unePosition)
	{
		return this.cases[unePosition.obtenirCoordonneesEnX()][unePosition.obtenirCoordonneesEnY()];
	}
	
	public int obtenirNombreLignes()
	{
		return Plateau.NOMBRE_DE_LIGNES;
	}
	
	public int obtenirNombreColonnes()
	{
		return Plateau.NOMBRE_DE_COLONNES;
	}
	
	public boolean positionValide(Position unePosition)
	{
		if (unePosition.obtenirCoordonneesEnX() >= 0 && unePosition.obtenirCoordonneesEnX() < NOMBRE_DE_COLONNES)
			if (unePosition.obtenirCoordonneesEnY() >= 0 && unePosition.obtenirCoordonneesEnY() < NOMBRE_DE_LIGNES)
				return true;
		return false;
	}
	
	// Transforme un plateau en texte.
	public String toString() {
		String plateauAsciiArt = "";

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
				if (this.cases[numeroDeColonne][numeroDeLigne].obtenirPion() != null)
					plateauAsciiArt += this.cases[numeroDeColonne][numeroDeLigne].obtenirPion().obtenirCouleur().toString();
				else
					plateauAsciiArt += "+ ";
			}
			plateauAsciiArt += "\n";
		}
		return plateauAsciiArt;
	}
}
