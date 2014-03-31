package fr.iutvalence.java.tp.othello;

/**
 * Enumération des couleurs disponibles (Blanc/Noir).
 */

public enum Couleur {
	// La couleur blanche.
	BLANC,
	// La couleur noir.
	NOIR;
	
	public Couleur obtenirCouleurInverse()
	{
		if (this == BLANC) return NOIR;
		return BLANC;
	}
	
	// Convertit le pion en chaine de caractères.
		public String toString() 
		{
			if (this == Couleur.BLANC)
				return "B ";
			return "N ";
		}
}
