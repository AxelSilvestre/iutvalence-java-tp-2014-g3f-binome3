package fr.iutvalence.java.tp.othello;

public interface Affichage
{
	public void afficherDemandeCoordonnees(Joueur joueurBlanc);

	public void afficherPositionInvalide(Position positionDesiree);

	public void afficherPlateau(Plateau plateau);

}
