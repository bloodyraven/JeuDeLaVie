package bean;

import constantes.Constantes;

/**
 * Classe représentant une instance de jeu
 * @author y.dujardin
 *
 */
public class Game {

	private Cellule[][] grille = new Cellule[Constantes.TAILLE][Constantes.TAILLE];

	public Game() {
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[0].length; j++) {
				grille[i][j] = new Cellule(i, j);
			}
		}
	}
	
	public Cellule[][] getGrille() {
		return grille;
	}

	public void setGrille(Cellule[][] grille) {
		this.grille = grille;
	}
	
	
}
