package fr.iutvalence.java.tp.othello;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonCase extends JButton implements ActionListener {

private final Position laPosition;
private Couleur laCouleur;
private final static ImageIcon NOIR =  new ImageIcon("images/pion_noir.png");
private final static ImageIcon BLANC =  new ImageIcon("images/pion_blanc.png"); 

public JButtonCase(Position unePosition) 
{
	super();
	this.laPosition = unePosition;
}

public void mettreCouleur(Couleur uneCouleur) 
{
	if (uneCouleur == Couleur.NOIR)
		this.setIcon(NOIR);
	else
		this.setIcon(BLANC);	
}

public void actionPerformed(ActionEvent e) {
	
}

}
