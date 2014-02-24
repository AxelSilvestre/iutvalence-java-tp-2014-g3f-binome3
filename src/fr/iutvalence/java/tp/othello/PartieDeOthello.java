package fr.iutvalence.java.tp.othello;

// TODO écrire le commentaire
public class PartieDeOthello
{

	// TODO écrire le commentaire
	// TODO respecter les conditions d'écriture
	private final static boolean blanc = true;

	// TODO écrire le commentaire
	// TODO respecter les conditions d'écriture
	private final static boolean noir = false;

	// TODO écrire le commentaire
	private Plateau monPlateau;

	// TODO écrire le commentaire
	private Joueur joueurBlanc;

	// TODO écrire le commentaire
	private Joueur joueurNoir;

	// TODO écrire le commentaire
	public PartieDeOthello()
	{
		// TODO manipuler l'attribut via this
		monPlateau = new Plateau();
		// TODO manipuler l'attribut via this
		joueurBlanc = new Joueur(blanc);
		// TODO manipuler l'attribut via this
		joueurNoir = new Joueur(noir);

	}

	// TODO écrire le commentaire
	public void jouer()
	{
	}
}
