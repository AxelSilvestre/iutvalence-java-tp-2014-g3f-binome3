package fr.iutvalence.java.tp.othello;

public enum Direction {

	EN_HAUT(0,-1),
	EN_BAS(0,1),
	A_DROITE(1,0),
	A_GAUCHE(-1,0),
	EN_HAUT_A_GAUCHE(-1,-1),
	EN_HAUT_A_DROITE(1,-1),
	EN_BAS_A_DROITE(1,1),
	EN_BAS_A_GAUCHE(-1,1);

	private final int decalageEnX;
	
	private final int decalageEnY;
	
	private Direction(int decalageEnX, int decalageEnY)
	{
		this.decalageEnX = decalageEnX;
		this.decalageEnY = decalageEnY;
	}
	
	public int obtenirDecalageX() {
		return this.decalageEnX;
	}
	
	public int obtenirDecalageY() {
		return this.decalageEnY;
	}
}
