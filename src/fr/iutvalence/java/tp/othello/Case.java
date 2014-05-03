package fr.iutvalence.java.tp.othello;

/**
 * Représente une case d'un Plateau. Elle peut contenir une référence nulle ou
 * celle d'un Pion.
 */
public class Case
{

	/**
	 * Le pion posé sur la case
	 */
	private Pion pion;
	
	/**
	 * La position de la case
	 */
	private final Position position;

	/**
	 * Création d'un nouvelle case, vide, à une position donnée
	 * @param position la position
	 */
	public Case(Position position)
	{
		this.pion = null;
		this.position = position;
	}

	
	/**
	 * Obtention du pion 
	 * @return le pion
	 */
	public Pion obtenirPion()
	{
		return this.pion;
	}

	/**
	 * Obtention la position 
	 * @return la position
	 */
	public Position obtenirPosition()
	{
		return this.position;
	}

	/**
	 * Poser un pion
	 * @param pion le pion
	 */
	public void poserPion(Pion pion)
	{
		this.pion = pion;
	}


	/**
	 * Vérifier si la case est occupee
	 * @return l'état d'occupation de la case
	 */
	public boolean estOccupee()
	{
		return (this.obtenirPion() != null);
	}
}
