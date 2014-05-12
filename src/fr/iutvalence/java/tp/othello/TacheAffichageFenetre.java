package fr.iutvalence.java.tp.othello;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JPanel;

public class TacheAffichageFenetre implements Runnable {
	public void run()
	{
		JFrame maFenetre = new JFrame();
		maFenetre.setTitle("Othello");
		maFenetre.setSize(500,500);
		
		JPanel monPanel = new JPanel();
		
		GridLayout grilleDeBouttons = new GridLayout(8,8);
		monPanel.setLayout(grilleDeBouttons);
		
		ImageIcon imagePionNoir = new ImageIcon("images/pion_noir.png");
		ImageIcon imagePionBlanc = new ImageIcon("images/pion_blanc.png");
		
		for (int numeroDeLigne = 0; numeroDeLigne < 8; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < 8; numeroDeColonne++)
				JButton jButtonCase = new JButtonCase(numeroDeColonne, numeroDeLigne); // pb nom var
				jButton.setIcon(imagePionBlanc);
				monPanel.add(jButton);
	}
		
		maFenetre.setContentPane(monPanel);
		maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    maFenetre.setVisible(true);
	}
}
