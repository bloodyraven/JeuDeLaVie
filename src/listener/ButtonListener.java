package listener;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bean.Cellule;

public class ButtonListener implements ActionListener  {
	
	private Cellule c;
	private Button b;
	
	public ButtonListener(Cellule c, Button b) {
		this.setC(c);
		this.setB(b);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(c.isEnVie()) {
			this.b.setBackground(Color.white);
			c.setEnVie(false);
			c.colorShuffle();
		} else {
			this.b.setBackground(c.getColor());
			c.setEnVie(true);
		}
	}

	public Cellule getC() {
		return c;
	}

	public void setC(Cellule c) {
		this.c = c;
	}

	public Button getB() {
		return b;
	}

	public void setB(Button b) {
		this.b = b;
	}

}
