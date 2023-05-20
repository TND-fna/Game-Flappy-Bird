package view;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	GameView game;

	public static final int WIDTH = 800, HEIGHT = 512;

	public Main() {
		// TODO Auto-generated constructor stub
		game = new GameView();
		setTitle("Flappy Bird");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/images/icon.png")));
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(3);
		this.setResizable(false);
		getContentPane().add(game);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	public GameView getGame() {
		return game;
	}

}
