package model;

import java.awt.Graphics2D;
import java.awt.Image;

public abstract class Sky {
	private int x, y, x1, y1;

	public abstract Image createSky();

	public Sky() {
		// TODO Auto-generated constructor stub
		x = 0;
		y = 0;
		x1 = x + 1023;
		y1 = 1;
		createSky();
	}

	public void draw(Graphics2D g2) {
		g2.drawImage(createSky(), x, y, null);
		g2.drawImage(createSky(), x1, y1, null);
	}

	public void update() {
		x -= 2;
		x1 -= 2;
		if (x1 < 0) {
			x = x1 + 1023;
		}
		if (x < 0) {
			x1 = x + 1023;
		}
	}

	public int getYGround() {
		return y;
	}

}
