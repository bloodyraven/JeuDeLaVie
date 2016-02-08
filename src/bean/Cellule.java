package bean;
import java.awt.Color;
import java.util.Random;


public class Cellule {

	private int x, y;
	boolean enVie;
	Color color;
	
	public Cellule(int x, int y) {
		this.x=x;
		this.y=y;
		enVie=false;
		int R = (int)(Math.random()*256);
		int G = (int)(Math.random()*256);
		int B= (int)(Math.random()*256);
		this.color = new Color(R, G, B); //random color, but can be bright or dull

		//to get rainbow, pastel colors
		Random random = new Random();
		final float hue = random.nextFloat();
		final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
		final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
		this.color = Color.getHSBColor(hue, saturation, luminance);
	}
	
	public Cellule(int x, int y, boolean enVie) {
		this(x,y);
		this.enVie=enVie;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isEnVie() {
		return enVie;
	}

	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
