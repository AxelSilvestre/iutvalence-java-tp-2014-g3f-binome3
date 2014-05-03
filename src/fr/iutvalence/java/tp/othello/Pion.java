package fr.iutvalence.java.tp.othello;

/**
 * Représente un pion sur une Case.
 */

public class Pion
{

	private Couleur couleur;

	public Pion(Couleur uneCouleur)
	{
		this.couleur = uneCouleur;
	}

	public Couleur obtenirCouleur()
	{
		return this.couleur;
	}

	public void inverserCouleur()
	{
		this.couleur = this.couleur.obtenirCouleurInverse();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return this.couleur.toString();
	}

}
