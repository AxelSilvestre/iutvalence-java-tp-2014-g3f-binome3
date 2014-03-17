package fr.iutvalence.java.tp.othello;

/**
 * Crée un plateau constitué de 8X8 cases et pose 4 pions au centre.
 */

public class Plateau {
	// Nombre maximum de lignes du tableau
	private final static int NOMBRE_DE_LIGNES = 8;

	// Nombre maximum de colonnes du plateau
	private final static int NOMBRE_DE_COLONNES = 8;

	// Tableau de cases
	private Case[][] cases;

	// Plateau constitué de cases vides ou non
	public Plateau() {

		this.cases = new Case[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		// Creé les objets de type Case du tableau
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				this.cases[numeroDeLigne][numeroDeColonne] = new Case();

		// Pose les 4 premiers pions
		this.cases[3][3].poserPion(new Pion(Couleur.BLANC));
		this.cases[4][4].poserPion(new Pion(Couleur.BLANC));
		this.cases[3][4].poserPion(new Pion(Couleur.NOIR));
		this.cases[4][3].poserPion(new Pion(Couleur.NOIR));
	}

	// Transforme un plateau en texte
	public String toString() {
		String plateauAsciiArt = "";

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
				if (this.cases[numeroDeLigne][numeroDeColonne].obtenirPion() != null
						&& this.cases[numeroDeLigne][numeroDeColonne].obtenirPion().obtenirCouleur() == Couleur.BLANC)
					plateauAsciiArt += "B ";
				else if (this.cases[numeroDeLigne][numeroDeColonne].obtenirPion() != null
						&& this.cases[numeroDeLigne][numeroDeColonne].obtenirPion().obtenirCouleur() == Couleur.NOIR)
					plateauAsciiArt += "N ";
				else
					plateauAsciiArt += "O ";
			}
			plateauAsciiArt += "\n";
		}

		return plateauAsciiArt;
	}
	
	
	public void occuperCase(int x, int y, Couleur couleur)
	{
		this.cases[x][y].poserPion(new Pion(couleur));
	}
	
//	public Pion estOccupee(int x, int y)
//	{
//		if (this.cases[x][y] != null)
//		tis.cases[x][y].obtenirPion();	
//	}
}
