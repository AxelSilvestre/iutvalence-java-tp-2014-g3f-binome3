package fr.iutvalence.java.tp.othello;


public class PartieDeOthello
{

	private Plateau monPlateau;
	private Joueur joueurBlanc;
	private Joueur joueurNoir;
	private final static boolean blanc = true;
	private final static boolean noir = false;
	
	
	
	public PartieDeOthello()
	{
		monPlateau = new Plateau();
		joueurBlanc = new Joueur(blanc);
		joueurNoir = new Joueur(noir);
		
	}
	
	public void jouer() 
	{

		
		
	}
	

	public Plateau getMonPlateau() {
		return this.monPlateau;
	}

	public void setMonPlateau(Plateau monPlateau) {
		this.monPlateau = monPlateau;
	}

	public Joueur getJoueurBlanc() {
		return this.joueurBlanc;
	}

	public void setJoueurBlanc(Joueur joueurBlanc) {
		this.joueurBlanc = joueurBlanc;
	}

	public Joueur getJoueurNoir() {
		return this.joueurNoir;
	}

	public void setJoueurNoir(Joueur joueurNoir) {
		this.joueurNoir = joueurNoir;
	}

	
}

