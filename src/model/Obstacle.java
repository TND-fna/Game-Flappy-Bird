package model;
/**
 * Tạo trở ngại cho con chim:
 * 	+ Sử dụng 2 Column (Top, Bottom) là trở ngại.
 * 	+ Khoảng cách 2 Column: 150l;
 * 	+ KHoảng cách các trở ngại: 200;
 * 	+ 
 */
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

import view.Main;
/**
 * Object: Obstacle;
 * Properties: Column top, bottom;
 * @author phamdinhhoc
 *
 */
public class Obstacle {
	public static final int SPACE_BOT_TOP = 150, SPACE_TWO_OBSTACLE = 200;
	private Column columnBottom;
	private Column columnTop;
	private int distance;
	private final int[] y_Values = { 0, -50, -100, -150, -200 };

	/**
	 * KHởi tảo 2 Column Top, Bottom;
	 * @param x
	 * @param y
	 */
	public Obstacle(int x, int y) {
		columnTop = new Column(x, y, 2);
		columnBottom = new Column(x, y + columnTop.getHeight() + SPACE_BOT_TOP, 1);

	}

	/**
	 * 
	 */
	public Obstacle() {
	}

	/**
	 * 
	 * @param g2d
	 */
	public void draw(Graphics2D g2d) {
		columnTop.draw(g2d);
		columnBottom.draw(g2d);
	}

	/**
	 * 
	 */
	public void update() {
		columnTop.update();
		columnBottom.update();
	}

	/**
	 * 
	 * @return
	 */
	public int getWidth() {
		return columnTop.getWidth();
	}

	/**
	 * 
	 * @return
	 */
	public int getX() {
		return columnTop.getX();
	}

	/**
	 * 
	 * @param bird
	 * @return
	 */
	public boolean isHit(Bird bird) {
		int xHv = bird.getX() + 5;
		int yHv = bird.getY();
		int height = bird.getHeight();
		if ((xHv + height >= getX()) && (xHv <= getX() + getWidth())) {
			if ((yHv <= this.columnTop.getY() + this.columnTop.getHeight()) ||
					(yHv + height >= this.columnBottom.getY())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Thêm trở ngại mới.
	 * @param obstacles
	 */
	public void addObstacle(ArrayList<Obstacle> obstacles) {

		if (distance < Obstacle.SPACE_TWO_OBSTACLE) {
			distance += BackGround.SPEED;
		} else {
			obstacles.add(new Obstacle(Main.WIDTH, y_Values[new Random().nextInt(5)]));

			distance -= Obstacle.SPACE_TWO_OBSTACLE;
		}
	}
}
