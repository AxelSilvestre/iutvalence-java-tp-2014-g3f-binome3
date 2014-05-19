package fr.iutvalence.java.tp.othello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BarreDeMenuDuJeu extends JMenuBar implements ActionListener {

	private JFrame fenetre;
	private JMenuItem MenuItemAPropos;
	private JMenuItem MenuItemFermer;

	public BarreDeMenuDuJeu(JFrame fenetre)
	{
	this.fenetre = fenetre;
	JMenu menu = new JMenu("Menu");
	this.MenuItemAPropos = new JMenuItem("A propos");
	this.MenuItemFermer = new JMenuItem("Fermer");
	menu.add(this.MenuItemAPropos);
	menu.add(this.MenuItemFermer);
	this.MenuItemAPropos.addActionListener(this);
	this.MenuItemFermer.addActionListener(this);
	this.add(menu);
	}

	public void actionPerformed(ActionEvent event)
	{
	JMenuItem itemSelectionne = (JMenuItem) event.getSource();

	if (itemSelectionne == this.MenuItemAPropos)
	{
		JOptionPane.showMessageDialog(this.fenetre, "Une application de jeu Othello codée par DUROT et SILVESTRE", "A propos", JOptionPane.INFORMATION_MESSAGE);
		return;
	}

	if (itemSelectionne == this.MenuItemFermer)
		{
		if (JOptionPane.showConfirmDialog(this.fenetre, "Fermer l'application ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
				this.fenetre.dispose();
				return;
		}
	}
}
