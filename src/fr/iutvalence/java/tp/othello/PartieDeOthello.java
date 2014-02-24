package fr.iutvalence.java.tp.othello;

// TODO (fait) écrire le commentaire
/**
 * Débute une partie de Othello.
 */
public class PartieDeOthello
{

	// TODO (fait) écrire le commentaire
	// TODO (fait) respecter les conditions d'écriture
	/** la constante BLANC. */
	private final static boolean BLANC = true;

	// TODO (fait) écrire le commentaire
	// TODO (fait) respecter les conditions d'écriture
	/** la constante NOIR. */
	private final static boolean NOIR = false;

	// TODO (fait) écrire le commentaire
	/** Le plateau utilisé. */
	private Plateau monPlateau;

	// TODO (fait) écrire le commentaire
	/** Le joueur blanc. */
	private Joueur joueurBlanc;

	// TODO (fait) écrire le commentaire
	/** Le joueur noir. */
	private Joueur joueurNoir;

	// TODO (fait) écrire le commentaire

	/**
	 * Instancie une nouvelle partie de Othello.
	 */
	public PartieDeOthello()
	{
		// TODO (fait) manipuler l'attribut via this
		this.monPlateau = new Plateau();
		// TODO (fait) manipuler l'attribut via this
		this.joueurBlanc = new Joueur(blanc);
		// TODO (fait) manipuler l'attribut via this
		this.joueurNoir = new Joueur(noir);

	}

	// TODO (fait) écrire le commentaire
	/**
	 * La méthode permettant de jouer.
	 */
	public void jouer()
	{
	}
}
