package fr.iutvalence.java.tp.othello;

public interface Joueur
{

	// Donne la couleur du joueur.
	public abstract Couleur obtenirCouleur();

	public abstract String obtenirNom();

	public abstract Position obtenirPositionProposee() throws Exception;

}