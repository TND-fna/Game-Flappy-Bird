package model;

/**
 * Cần đối tượng khởi tạo: Bức ảnh chỉ xuấn hiện trong một khoảng thời gian.
 */
import java.awt.Image;

/**
 * Object: FrameView;
 * Properties: Bức ảnh (Image), Khoảng thời xuấn hiện (time);
 * 
 * @author phamdinhhoc
 *
 */
public class FrameView {
	private Image image;
	private long time;

	/**
	 * Khởi tạo Bức ảnh chỉ xuấn hiện trong một khoảng thời gian.
	 * 
	 * @param image
	 * @param time
	 */
	public FrameView(Image image, long time) {
		super();
		this.image = image;
		this.time = time;
	}

	/**
	 * Getter/Setter
	 * 
	 * @return
	 */
	public Image getImage() {
		return image;
	}

	public long getTime() {
		return time;
	}

}
