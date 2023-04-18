package view;
/**
 * Lúc bắt đầu vào game sẽ xuất hiện 1 menu, có các option:
 * 	+ Play
 * +Rank
 * 	+ Guide;
 * 	+ About
 * 	+ Exit;
 */
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Loader;
/**
 * Tạo list các button tương ứng các option trong menu;
 *
 */
public class MenuGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<ImageGame> listButton = new ArrayList<>();

	public MenuGame() {
		// TODO Auto-generated constructor stub
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(Loader.loadImage("startgame.png")));
		ImageGame btnPlay, btnExit, btnRank, btnGuide, btnAbout;

		label.add(btnPlay = new ImageGame(new JButton(), ImageGame.IMG_PLAY));
		label.add(btnRank = new ImageGame(new JButton(), ImageGame.IMG_RANK));
		label.add(btnGuide = new ImageGame(new JButton(), ImageGame.IMG_GUIDE));
		label.add(btnAbout = new ImageGame(new JButton(), ImageGame.IMG_ABOUT));
		label.add(btnExit = new ImageGame(new JButton(), ImageGame.IMG_EXIT));

		listButton.add(btnPlay);
		listButton.add(btnRank);
		listButton.add(btnGuide);
		listButton.add(btnAbout);
		listButton.add(btnExit);

		add(label);
		setSize(1024, 610);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	public ArrayList<ImageGame> getListBtn() {
		return listButton;
	}

	// public static void main(String[] args) {
	// 	// TODO Auto-generated method stub
	// 	new StartGame();
	// }

}
