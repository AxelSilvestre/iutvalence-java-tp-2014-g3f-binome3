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
	public void inverserCouleur() {
		if (this.couleur == Couleur.BLANC)
			this.couleur = Couleur.NOIR;
		else
			this.couleur = Couleur.BLANC;
	}

	// Teste si un pion peut être posé ou pas.
	public boolean peutEtrePose(Position unePosition)
	{
		return true;
	}
	
	// Convertit le pion en chaine de caractères.
	public String toString() 
	{
		if (this.couleur == Couleur.BLANC)
			return "B ";
		else
			return "N ";
	}
	
}
