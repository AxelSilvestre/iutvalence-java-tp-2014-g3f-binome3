package fr.iutvalence.java.tp.othello;

/**
 * Représente un joueur d'Othello. Chaque joueur à une couleur (blanc ou noir).
 */
public class Joueur {

	private String nomJoueur;
	private final static String NOM_PAR_DEFAUT = "Nom par défaut";
	
	/**
	 * Crée un joueur.
	 * @param un nom : le nom du joueur.
	 */
	public Joueur(String unNom) {
		this.nomJoueur = unNom;;
	}
	
	public Joueur()
	{
		this.nomJoueur = NOM_PAR_DEFAUT;
	}
}