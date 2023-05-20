package model;

/**
 * Cần 1 đối tượng để:
 * 	+ Khởi tạo đồng thời: Cột Trên + Cột Dưới;
 * 	+ Có 1 khoảng trống giữa cột trên và cột dưới; 
 */
import java.awt.Graphics2D;
import java.awt.Image;

/**
 * Object: Column;
 * Properties:
 * + Cần 2 tham sô để phân việt: cột trên + cột dưới;
 * + Cần 2 biến int để lưu trữ tọa độ của 1 cột;
 * 
 * @author phamdinhhoc
 *
 */
public class Column {
	public static final int BOT = 1;
	public static final int TOP = 2;
	private int x;
	private int y;
	private Image image;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param type
	 */
	public Column(int x, int y, int type) {
		this.x = x;
		this.y = y;
		if (type == 1) {
			image = Loader.loadImage("columnBot.png");
		} else if (type == 2) {
			image = Loader.loadImage("columnTop.png");
		}
	}

	/**
	 * 
	 * @param g2d
	 */
	public void draw(Graphics2D g2d) {
		g2d.drawImage(this.image, this.x, this.y, null);
	}

	/**
	 * 
	 */
	public void update() {
		this.x -= 2;
	}

	/**
	 * Getter/setter
	 * 
	 * @return
	 */
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getWidth() {
		return this.image.getWidth(null);
	}

	public int getHeight() {
		return this.image.getHeight(null);
	}

}
