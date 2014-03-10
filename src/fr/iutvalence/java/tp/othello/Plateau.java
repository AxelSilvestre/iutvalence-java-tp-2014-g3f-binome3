package fr.iutvalence.java.tp.othello;

// TODO (fait) écrire le commentaire
/**
 * Crée un Plateau.
 */

public class Plateau
{
	private final static int NOMBRE_DE_LIGNES = 8;
	private final static int NOMBRE_DE_COLONNES = 8;
	private Couleur[][] cases;
	
	public Plateau() {
		
		this.cases = new Couleur[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
						this.cases[numeroDeLigne][numeroDeColonne] = null;
		
		this.cases[3][3] = Couleur.BLANC;
		this.cases[4][4] = Couleur.BLANC;
		this.cases[3][4] = Couleur.NOIR;
		this.cases[4][3] = Couleur.NOIR;
	}

	public String toString() {
		
		String plateauAsciiArt = "";

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
				if (this.cases[numeroDeLigne][numeroDeColonne] == Couleur.BLANC)
					plateauAsciiArt += "B ";
				else if(this.cases[numeroDeLigne][numeroDeColonne] == Couleur.NOIR)
					plateauAsciiArt += "N ";
				else
					plateauAsciiArt += "O ";
			}
			plateauAsciiArt += "\n";
		}

		return plateauAsciiArt;
	}
	
}
