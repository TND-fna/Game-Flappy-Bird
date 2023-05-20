package view;
/**
 * Bấm vào button Guide: Xuất hiện bản hưởng dẫn sử dụng sản phẩm.
 */
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Loader;
/**
 * add ảnh chứa bản hưởng dẫn sử dụng sản phẩm vào panel.
 * @author phamdinhhoc
 *
 */
public class Guide extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<ImageGame> listButton = new ArrayList<>();

	public Guide() {
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(Loader.loadImage("guide2.png")));
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
	//  public static void main(String[] args) {
	//  	new Guide();
	//  }

}
