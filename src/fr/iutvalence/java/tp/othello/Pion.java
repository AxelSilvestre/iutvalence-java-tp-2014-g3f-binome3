package fr.iutvalence.java.tp.othello;

/**
 * Représente un pion sur une Case.
 */

public class Pion {

	// Couleur d'un pion.
	private Couleur couleur;

	public Pion(Couleur uneCouleur) {
		this.couleur = uneCouleur;
	}

	// Donne la couleur d'un pion.
	public Couleur obtenirCouleur() {
		return this.couleur;
	}

	// Inverse la couleur d'un pion.
	/**
	 * 
	 */
	public void inverserCouleur() {
		this.couleur = this.couleur.obtenirCouleurInverse();
	}
	
	// Convertit le pion en chaine de caractères.
	public String toString() 
	{
		return this.couleur.toString();
	}
	
}
