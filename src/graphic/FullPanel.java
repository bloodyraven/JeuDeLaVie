package graphic;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import bean.Game;

/**
 * Panel principal contenant le panel jeu et controleur 
 * @author y.dujardin
 *
 */
public @SuppressWarnings("serial")
class FullPanel extends JPanel {

	public FullPanel() {
		Game gs = new Game();
		this.setLayout(new BorderLayout());
		this.add(new GamePanel(gs), BorderLayout.CENTER);
		this.add(new ControlPanel(), BorderLayout.SOUTH);
	}
}
