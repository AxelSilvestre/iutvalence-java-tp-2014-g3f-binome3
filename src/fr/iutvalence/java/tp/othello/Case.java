package fr.iutvalence.java.tp.othello;

/**
 * Représente une case d'un Plateau. Elle peut contenir une référence nulle ou celle d'un Pion.
 */

public class Case {

	private Pion pion;

	public Case() {
		this.pion = null;
	}

	// Retourne le pion d'une case.
	public Pion obtenirPion() {
		return this.pion;
	}

	// Pose un pion sur la case.
	public void poserPion(Pion pion) {
		this.pion = pion;
	}

}
