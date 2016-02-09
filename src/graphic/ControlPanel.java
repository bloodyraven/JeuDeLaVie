package graphic;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel{

	public ControlPanel() {
		this.setLayout(new FlowLayout());
		this.add(new Button("Go"));
		this.add(new Button("Stop"));
		this.add(new Button("Clear"));
		this.add(new Label("Vitesse (ms) :"));
		TextField tf = new TextField();
		tf.setPreferredSize(new Dimension(50, 20));
		this.add(tf);
	}
}
