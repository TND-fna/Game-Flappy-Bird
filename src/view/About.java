package view;
/**
 * Bấm vào button about: sẽ xuất hiện danh sách các thành viên phát triển sản phẩm.
 */
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Loader;
/**
 * add ảnh chứa danh sách các thành viên phát triển sản phẩm vào panel.
 * @author phamdinhhoc
 *
 */
public class About extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<ImageGame> listButton = new ArrayList<>();

	public About() {
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(Loader.loadImage("about2.png")));
		ImageGame btnBack;

		label.add(btnBack = new ImageGame(new JButton(), ImageGame.IMG_BACK));

		listButton.add(btnBack);

		add(label);
		setSize(1024, 610);
		setTitle("About");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

	}

	public ArrayList<ImageGame> getListBtn() {
		return listButton;
	}
	// public static void main(String[] args) {
	// 	new About();
	// }

}
