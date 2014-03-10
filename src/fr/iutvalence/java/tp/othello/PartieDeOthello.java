package fr.iutvalence.java.tp.othello;
import java.util.Scanner;
// TODO (fait) écrire le commentaire
/**
 * Débute une partie de Othello.
 */
public class PartieDeOthello
{
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
		this.joueurBlanc = new Joueur(Couleur.BLANC);
		// TODO (fait) manipuler l'attribut via this
		this.joueurNoir = new Joueur(Couleur.NOIR);
	}

	// TODO (fait) écrire le commentaire
	/**
	 * La méthode permettant de jouer.
	 */
	public void jouer()
	{
		
		// En cours de test
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Veuillez saisir les coordonnées :");
//		System.out.println("x = ?");
//		int x = sc.nextInt();
//		System.out.println("y = ?");
//		int y = sc.nextInt();
//		
//		monPlateau.occuperCase(x, y, couleur);
		
	}
}
