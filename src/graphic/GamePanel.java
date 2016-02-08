package graphic;

import java.awt.Button;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import listener.ButtonListener;
import bean.Cellule;
import constantes.Constantes;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	
	private ArrayList<Cellule> list;

	public GamePanel(ArrayList<Cellule> list) {
		this.setLayout(new GridLayout(Constantes.TAILLE, Constantes.TAILLE));
		this.setList(list);
		for (int i = 0; i < list.size(); i++) {
			Button button = new Button();
			button.addActionListener(new ButtonListener(list.get(i), button));
			this.add(button);
		}
	}

	public ArrayList<Cellule> getList() {
		return list;
	}

	public void setList(ArrayList<Cellule> list) {
		this.list = list;
	}
	
	
}
