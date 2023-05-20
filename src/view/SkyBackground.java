package view;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Loader;

public class SkyBackground extends JFrame{

    private static final long serialVersionUID = 1L;
	ArrayList<ImageGame> listButton = new ArrayList<>();

	public SkyBackground() {
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(Loader.loadImage("mode.png")));
		ImageGame btnStart1, btnStart2, btnBack, imgMorning, imgNight;

		label.add(btnStart1 = new ImageGame(new JButton(), ImageGame.IMG_START1));
		label.add(btnStart2 = new ImageGame(new JButton(), ImageGame.IMG_START2));
		label.add(btnBack = new ImageGame(new JButton(), ImageGame.IMG_BACK));
		label.add(imgMorning = new ImageGame(new JButton(), ImageGame.IMG_MORNING));
		label.add(imgNight = new ImageGame(new JButton(), ImageGame.IMG_NIGHT));

		listButton.add(btnStart1);
		listButton.add(btnStart2);
		listButton.add(btnBack);
		listButton.add(imgMorning);
		listButton.add(imgNight);

		add(label);
		setSize(1024, 610);
		setTitle("Settings");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

	}

	public ArrayList<ImageGame> getListBtn() {
		return listButton;
	}

	//  public static void main(String[] args) {
	//  	// TODO Auto-generated method stub
	//  	new SkyBackground();
	//  }
}
