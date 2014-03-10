package fr.iutvalence.java.tp.othello;

// TODO (fait) écrire le commentaire
/**
 * Crée un Joueur.
 */

public class Joueur
{
	private final static int NOMBRE_PIONS_INITIAL = 2;
	private boolean aQuiLeTour;
	private int nombrePions;
	private final Couleur couleurJoueur;
	
	public Joueur(Couleur couleur)
	{
		this.couleurJoueur = couleur;
		this.nombrePions = NOMBRE_PIONS_INITIAL;
		if (this.couleurJoueur == Couleur.BLANC)
				this.aQuiLeTour = true;
	}
	
	public int getNombrePions()
	{
		return nombrePions;
	}
	
	public void setNombrePions(int nombrePions)
	{
		this.nombrePions = nombrePions;
	}
}