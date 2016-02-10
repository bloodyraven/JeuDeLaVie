package bean;

import constantes.Constantes;

/**
 * Classe représentant une instance de jeu
 * @author y.dujardin
 *
 */
public class Game {

	private Cellule[][] grille = new Cellule[Constantes.TAILLE][Constantes.TAILLE];
	private Cellule[][] grilleSwap = new Cellule[Constantes.TAILLE][Constantes.TAILLE];
	private int vitesse;

	public Game() {
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[0].length; j++) {
				grille[i][j] = new Cellule(i, j);
				grilleSwap[i][j] = new Cellule(i, j);
			}
		}
		this.vitesse=50;
	}
	
	public void nextGen() {
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[0].length; j++) {
				if(recupVoisins(i, j) == 3) {
					grilleSwap[i][j].setEnVie(true);
				} else {
					grilleSwap[i][j].setEnVie(false);
				}
			}
		}
		grille = grilleSwap.clone();
		resetgrilleSwap();
	}
	
	private void resetgrilleSwap() {
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[0].length; j++) {
				grilleSwap[i][j] = new Cellule(i, j);
			}
		}
	}
	
	private int recupVoisins(int i, int j) {
		int voisins=0;
		for (int a = i-1; i < i+1 ; i++) {
			for (int b = j-1; j < j+1 ; j++) {
				try{
					if(grille[a][b].enVie) {
						voisins++;
					}
				} catch(Exception e) {}
			}
		}
		System.out.println(voisins);
		return voisins;
	}
	
	public Cellule[][] getGrille() {
		return grille;
	}

	public void setGrille(Cellule[][] grille) {
		this.grille = grille;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	
}
