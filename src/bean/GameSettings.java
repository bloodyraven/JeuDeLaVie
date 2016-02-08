package bean;

import constantes.Constantes;

public class GameSettings {

	private Cellule[][] grille = new Cellule[Constantes.TAILLE][Constantes.TAILLE];

	public GameSettings() {
		
	}
	
	public Cellule[][] getGrille() {
		return grille;
	}

	public void setGrille(Cellule[][] grille) {
		this.grille = grille;
	}
	
	
}
