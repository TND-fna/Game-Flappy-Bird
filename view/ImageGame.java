package view;

import java.awt.Insets;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import model.Loader;

public class ImageGame extends DecorateButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numButton;
	public static final int IMG_PLAY = 1;
	public static final int IMG_RANK = 2;
	public static final int IMG_GUIDE = 3;
	public static final int IMG_ABOUT = 4;
	public static final int IMG_EXIT = 5;
	public static final int IMG_START1 = 6;
	public static final int IMG_START2 = 7;
	public static final int IMG_BACK = 8;
	public static final int IMG_MORNING = 9;
	public static final int IMG_NIGHT = 10;

	public ImageGame(AbstractButton c, int numButton) {
		super(c);

		this.numButton = numButton;
		setImage();
	}

	private void setImage() {
		switch (numButton) {
			case 1:
				button.setIcon(new ImageIcon(Loader.loadImage("play1.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

				setBounds(410, 270, 170, 60);
				break;
			case 2:
				button.setIcon(new ImageIcon(Loader.loadImage("rank.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

				setBounds(410, 330, 170, 60);
				break;
			case 3:
				button.setIcon(new ImageIcon(Loader.loadImage("guide.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

				setBounds(410, 390, 170, 60);
				break;
			case 4:
				button.setIcon(new ImageIcon(Loader.loadImage("about.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

				setBounds(410, 450, 190, 75);
				break;

			case 5:
				button.setIcon(new ImageIcon(Loader.loadImage("exit.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
				setBounds(410, 510, 175, 60);

				break;
			case 6:
				button.setIcon(new ImageIcon(Loader.loadImage("play1.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
				setBounds(100, 400, 175, 60);

				break;
			case 7:
				button.setIcon(new ImageIcon(Loader.loadImage("play1.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
				setBounds(710, 400, 175, 60);

				break;
			case 8:
				button.setIcon(new ImageIcon(Loader.loadImage("back.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
				setBounds(420, 520, 175, 60);

				break;
			case 9:
				button.setIcon(new ImageIcon(Loader.loadImage("sky.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
				setBounds(70, 130, 250, 250);

				break;
			case 10:
				button.setIcon(new ImageIcon(Loader.loadImage("nightOption.png")));
				button.setMargin(new Insets(0, 0, 0, 0));
				button.setBorderPainted(false);
				button.setContentAreaFilled(false);
				button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
				setBounds(670, 130, 250, 250);

				break;
		}

	}

	public int getNumButton() {
		return numButton;
	}

}
