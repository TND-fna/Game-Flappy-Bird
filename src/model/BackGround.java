package model;

import java.awt.Graphics2D;
import java.awt.Image;

import view.Main;

public class BackGround {
	public static final int SPEED = 2;
	private int x, y;
	private Image image;
	private int speedX;

	public BackGround(int x) {
		this.x = x;
		image = Loader.loadImage("ground.png");
		y = Main.HEIGHT - image.getHeight(null);
		this.speedX = SPEED;

	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(image, x, y, null);
	}

	public void update() {
		if (x + getWidth() < 0) {
			this.x += 2 * getWidth();

		}
		x -= speedX;
	}

	public int getWidth() {
		// trả v�? chi�?u rộng của hình ảnh
		return image.getWidth(null);
	}

}
