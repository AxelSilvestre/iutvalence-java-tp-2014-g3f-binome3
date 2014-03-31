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
	
	/**
	 * Obtenir le la position voisine
	 * @param direction la direction vers la case voisine
	 * @return la position voisine
	 */
	public Position obtenirVoisine(Direction direction)
	{
		return new Position(this.numeroDeLigne+direction.obtenirDecalageY(), this.numeroDeColonne+direction.obtenirDecalageX());
	}
}
