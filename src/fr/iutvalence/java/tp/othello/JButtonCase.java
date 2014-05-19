package fr.iutvalence.java.tp.othello;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonCase extends JButton implements ActionListener {

private final Position laPosition;
private Couleur laCouleur;

public JButtonCase(Position unePosition, Couleur uneCouleur) 
{
	super();
	this.laPosition = unePosition;
	if (uneCouleur == Couleur.NOIR)
		this.setIcon(new ImageIcon("images/pion_noir.png"));
	else
		this.setIcon(new ImageIcon("images/pion_blanc.png"));	
}

public JButtonCase(Position unePosition) 
{
	super();
	this.laPosition = unePosition;
}

public void actionPerformed(ActionEvent e) {
	
}

}
