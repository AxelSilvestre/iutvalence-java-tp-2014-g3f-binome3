package fr.iutvalence.java.tp.othello;

// TODO (fait) écrire le commentaire
/**
 * Crée un Plateau.
 */
public class Plateau
{
	private final static int NOMBRE_LIGNES = 8;
	private final static int NOMBRE_COLONNES = 8;
	private static int cases[][];
	
	public Plateau()
	{
		this.cases = new int[NOMBRE_LIGNES][NOMBRE_COLONNES];
	}

	public static int[][] getCases()
	{
		return cases;
	}

	public static void setCases(int[][] cases)
	{
		Plateau.cases = cases;
	}	
}
