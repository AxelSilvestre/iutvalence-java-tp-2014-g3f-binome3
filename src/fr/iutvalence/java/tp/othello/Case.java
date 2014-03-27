package fr.iutvalence.java.tp.othello;

/**
 * Représente une case d'un Plateau. Elle peut contenir une référence nulle ou celle d'un Pion.
 */

public class Case {

	private Pion pion;
	private final Position position;
	
	public Case(Position unePosition) {
		this.pion = null;
		this.position = unePosition;
	}

	// Retourne le pion d'une case.
	public Pion obtenirPion() {
		return this.pion;
	}

	// Retourne la position d'un pion sur un plateau de 8x8 cases.
	public Position obtenirPosition(Pion unPion)
	{
		return this.position;
	}
	
	// Pose un pion sur la case.
	public void poserPion(Pion pion) {
		this.pion = pion;
	}
	
	// Teste si une case est occupée.
	public boolean estOccupee()
	{
		return (this.obtenirPion() != null);
	}	
}
