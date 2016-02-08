package main;
import graphic.GamePanel;

import javax.swing.JFrame;

import bean.Cellule;
import bean.GameSettings;


public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		GameSettings gs = new GameSettings();
		
		f.setTitle("Jeu De La Vie");
		f.pack();
		f.setVisible(true); 
	}
}
