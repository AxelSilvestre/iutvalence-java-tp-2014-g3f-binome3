package fr.iutvalence.java.tp.othello;

/**
 * Représente une position, à l'intersection d'une ligne et d'une colonne.
 */

public class Position
{
	// Le numéro de ligne
	private final int numeroDeLigne;
	// Le numéro de colonne
	private final int numeroDeColonne;

	/**
	 * Construit une nouvelle position, à l'intersection ligne/colonne donnée
	 * @param numeroDeLigne le nuémro de ligne
	 * @param numeroDeColonne le numéro de colonne
	 */
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		this.numeroDeLigne = numeroDeLigne;
		this.numeroDeColonne = numeroDeColonne;
	}

	/**
	 * Obtenir le numéro de ligne
	 * @return le numéro de ligne
	 */
	public int obtenirNumeroDeLigne()
	{
		return this.numeroDeLigne;
	}

	/**
	 * Obtenir le numéro de colonne
	 * @return le numéro de colonne
	 */
	public int obtenirNumeroDeColonne()
	{
		return this.numeroDeColonne;
	}
	
	// Retourne les positions adjacentes d'une position relative sous forme de tableau.
	public Position[]  obtenirPositionsVoisines (Position unePosition)
	{
		Position[] positionsVoisines = new Position[7];;
		
		positionsVoisines[0] = new Position(unePosition.numeroDeLigne - 1, unePosition.numeroDeColonne + 1);
		positionsVoisines[1] = new Position(unePosition.numeroDeLigne, unePosition.numeroDeColonne + 1);
		positionsVoisines[2] = new Position(unePosition.numeroDeLigne + 1, unePosition.numeroDeColonne + 1);
		positionsVoisines[3] = new Position(unePosition.numeroDeLigne - 1, unePosition.numeroDeColonne);
		positionsVoisines[4] = new Position(unePosition.numeroDeLigne + 1, unePosition.numeroDeColonne);
		positionsVoisines[5] = new Position(unePosition.numeroDeLigne - 1, unePosition.numeroDeColonne - 1);
		positionsVoisines[6] = new Position(unePosition.numeroDeLigne, unePosition.numeroDeColonne - 1);
		positionsVoisines[7] = new Position(unePosition.numeroDeLigne + 1, unePosition.numeroDeColonne - 1);
		
		return  positionsVoisines;
	}
}
