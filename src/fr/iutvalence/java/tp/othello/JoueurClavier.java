package fr.iutvalence.java.tp.othello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Représente un joueur d'Othello. Chaque joueur à une couleur (blanc ou noir).
 */
public class JoueurClavier extends JoueurAbstrait 
{

	private final BufferedReader lecteurDeLignesDeTexteSurLEntreeStandard;
	/**
	 * Crée un joueur.
	 * 
	 * @param un
	 *            nom : le nom du joueur.
	 */
	public JoueurClavier(Couleur couleur, String nom)
	{
		super(couleur, nom);
		this.lecteurDeLignesDeTexteSurLEntreeStandard = new BufferedReader(
				new InputStreamReader(System.in));
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.java.tp.othello.Joueur#obtenirPositionProposee()
	 */
	@Override
	public Position obtenirPositionProposee() throws Exception
	{
		String ligneDeTexteLue = null;
		try
		{
			ligneDeTexteLue = this.lecteurDeLignesDeTexteSurLEntreeStandard
					.readLine();
			if (ligneDeTexteLue == null)
				throw new IOException();
			if (ligneDeTexteLue.length() == 0)
				throw new IOException();
			int codeZeroASCII = Integer.parseInt("0");
			return new Position(Character.getNumericValue(ligneDeTexteLue
					.charAt(0)) - codeZeroASCII,
					Character.getNumericValue(ligneDeTexteLue.charAt(2))
							- codeZeroASCII);
		}
		catch (IOException e)
		{
			throw new Exception();
		}
	}

}