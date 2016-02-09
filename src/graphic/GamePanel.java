package graphic;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import listener.ButtonListener;
import bean.Cellule;
import bean.Game;
import constantes.Constantes;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	public GamePanel(Game game) {
		this.setLayout(new GridLayout(Constantes.TAILLE, Constantes.TAILLE));
		Cellule[][] tab = game.getGrille();
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				Button button = new Button();
				button.setBackground(Color.white);
				button.addActionListener(new ButtonListener(tab[i][j], button));
				this.add(button);
			}
		}
	}
	
}
