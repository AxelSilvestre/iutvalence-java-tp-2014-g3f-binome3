package fr.iutvalence.java.tp.othello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Représente un joueur d'Othello. Chaque joueur à une couleur (blanc ou noir).
 */
public class Joueur {

	private final BufferedReader lecteurDeLignesDeTexteSurLEntreeStandard;
	private final Couleur couleurJoueur;
	private final String nomDuJoueur;

	/**
	 * Crée un joueur.
	 * @param un nom : le nom du joueur.
	 */
	public Joueur(Couleur uneCouleur, String unNomJoueur) {
		this.couleurJoueur = uneCouleur;
		this.nomDuJoueur =unNomJoueur;
		this.lecteurDeLignesDeTexteSurLEntreeStandard = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// Donne la couleur du joueur.
	public Couleur obtenirCouleurJoueur()
	{
		return this.couleurJoueur;
	}
	
	public String obtenirNomJoueur()
	{
		return this.nomDuJoueur;
	}

	public Position obtenirPositionProposee() throws Exception
	{
		String ligneDeTexteLue = null;
		try
		{
			ligneDeTexteLue = this.lecteurDeLignesDeTexteSurLEntreeStandard.readLine();
			if (ligneDeTexteLue == null)
				throw new IOException();
			if (ligneDeTexteLue.length() == 0)
				throw new IOException();
			int codeZeroASCII = Integer.parseInt("0");
			return new Position(Character.getNumericValue(ligneDeTexteLue.charAt(0))-codeZeroASCII,
					Character.getNumericValue(ligneDeTexteLue.charAt(2))-codeZeroASCII);
		}
		catch (IOException e)
		{
			throw new Exception();
		}	
	}
	
}