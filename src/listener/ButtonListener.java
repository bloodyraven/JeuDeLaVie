package listener;

import java.awt.Button;
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
		System.out.println(c.getColor().toString());
		this.b.setBackground(c.getColor());
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
