package fr.iutvalence.java.tp.othello;

// TODO écrire un commentaire plus précis
/**
 * Crée un Joueur.
 */

public class Joueur
{
	// TODO écrire un commentaire
	private final static int NOMBRE_PIONS_INITIAL = 2;
	
	// TODO écrire un commentaire
	private boolean aQuiLeTour;
	
	// TODO écrire un commentaire
	private int nombrePions;
	
	// TODO écrire un commentaire
	private final Couleur couleurJoueur;
	
	// TODO écrire un commentaire
	public Joueur(Couleur couleur)
	{
		this.couleurJoueur = couleur;
		this.nombrePions = NOMBRE_PIONS_INITIAL;
		if (this.couleurJoueur == Couleur.BLANC)
				this.aQuiLeTour = true;
	}
	
	// TODO écrire un commentaire
	public int getNombrePions()
	{
		return nombrePions;
	}
	
	// TODO écrire un commentaire
	public void setNombrePions(int nombrePions)
	{
		this.nombrePions = nombrePions;
	}
}