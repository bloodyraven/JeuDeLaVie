package graphic;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel{

	public ControlPanel() {
		this.setLayout(new FlowLayout());
		Button go = new Button("Go");
		Button ns = new Button("Next Step");
		ns.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Button stop = new Button("Stop");
		Button clear = new Button("Clear");
		this.add(go);
		this.add(ns);
		this.add(stop);
		this.add(clear);
		this.add(new Label("Vitesse (ms) :"));
		TextField tf = new TextField();
		tf.setPreferredSize(new Dimension(50, 20));
		this.add(tf);
	}
}
