package main;
import graphic.FullPanel;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setContentPane(new FullPanel());
		f.setTitle("Jeu De La Vie");
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true); 
	}
}
