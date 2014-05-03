package fr.iutvalence.java.tp.othello;

public class AffichageConsole implements Affichage
{

	@Override
	public void afficherDemandeCoordonnees(Joueur joueur)
	{
		System.out.println(joueur.obtenirNom() + " : saisir les coordonnées");

	}

	@Override
	public void afficherPositionInvalide(Position position)
	{
		System.out.println("La position " + position + " n'est pas jouable");

	}

	@Override
	public void afficherPlateau(Plateau plateau)
	{
		System.out.println(plateau);
		
	}

}
