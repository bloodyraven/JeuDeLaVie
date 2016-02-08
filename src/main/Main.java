package main;
import graphic.GamePanel;

import javax.swing.JFrame;

import bean.Game;


public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		Game gs = new Game();
		f.setContentPane(new GamePanel(gs));
		f.setTitle("Jeu De La Vie");
		f.pack();
		f.setVisible(true); 
	}
}
