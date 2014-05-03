package fr.iutvalence.java.tp.othello;

public abstract class JoueurAbstrait implements Joueur
{

	protected final Couleur couleur;
	
	protected final String nom;

	public JoueurAbstrait(Couleur couleur, String nom)
	{
		this.couleur = couleur;
		this.nom = nom;
	}

	@Override
	public Couleur obtenirCouleur()
	{
		return this.couleur;
	}

	@Override
	public String obtenirNom()
	{
		return this.nom;
	}

}