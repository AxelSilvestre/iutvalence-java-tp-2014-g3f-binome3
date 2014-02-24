package fr.iutvalence.java.tp.othello;

// TODO (fait) écrire le commentaire
/**
 * Crée un Joueur.
 */

public class Joueur
{
	private final static int nombreDePionsInital = 2;
	private final boolean commenceLePremier;
	private int nombrePions;
	private final Couleur couleurJoueur;
	
	public Joueur(boolean initiative, Couleur couleur)
	{
		this.commenceLePremier = initiative;
		this.couleurJoueur = couleur;
		this.nombrePions = nombreDePionsInital;		
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