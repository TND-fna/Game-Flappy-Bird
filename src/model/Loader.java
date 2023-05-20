package model;

/**
 * Cần một đối tượng làm nhiệm vụ tải ảnh lên từ src ảnh;
 */
import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * Object: Loader;
 * 
 * @author phamdinhhoc
 *
 */
public class Loader {
	private static Loader loader = new Loader();

	/**
	 * Tải ảnh lên từ src ảnh;
	 * 
	 * @param filename
	 * @return
	 */
	public static Image loadImage(String filename) {
		try {
			return new ImageIcon(loader.getClass().getResource("/images/" + filename)).getImage();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
