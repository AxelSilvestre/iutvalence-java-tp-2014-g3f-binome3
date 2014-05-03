package fr.iutvalence.java.tp.othello;

/**
 * Enumération des couleurs disponibles (Blanc/Noir).
 */

public enum Couleur
{
	/**
	 *  La couleur blanche.
	 */
	BLANC,
	/**
	 *  La couleur noir.
	 */
	NOIR;

	/**
	 * Obtenir la couleur inverse 
	 * @return la couleur inverse 
	 */
	public Couleur obtenirCouleurInverse()
	{
		if (this == BLANC)
			return NOIR;
		return BLANC;
	}

	/**
	 * @see java.lang.Enum#toString()
	 */
	public String toString()
	{
		if (this == Couleur.BLANC)
			return "B ";
		return "N ";
	}
}
