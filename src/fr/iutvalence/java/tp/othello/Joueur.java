package fr.iutvalence.java.tp.othello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Représente un joueur d'Othello. Chaque joueur à une couleur (blanc ou noir).
 */
public class Joueur {

	private String nomJoueur;
	private final static String NOM_PAR_DEFAUT = "Joueur par défaut";
	private final BufferedReader lecteurDeLignesDeTexteSurLEntreeStandard;

	/**
	 * Crée un joueur.
	 * @param un nom : le nom du joueur.
	 */
	public Joueur(String unNom) {
		this.nomJoueur = unNom;
		this.lecteurDeLignesDeTexteSurLEntreeStandard = new BufferedReader(new InputStreamReader(System.in));
	}

	public Joueur()
	{
		this.nomJoueur = NOM_PAR_DEFAUT;
		this.lecteurDeLignesDeTexteSurLEntreeStandard = new BufferedReader(new InputStreamReader(System.in));
	}

	// Donne le nom du joueur.
	public String obtenirNomJoueur()
	{
		return this.nomJoueur;
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
			return new Position(ligneDeTexteLue.charAt(0), ligneDeTexteLue.charAt(2));
		}
		catch (IOException e)
		{
			throw new Exception();
		}	
	}
}