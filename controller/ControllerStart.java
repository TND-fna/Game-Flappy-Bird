package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.Loader;
import model.Sound;
import view.ImageGame;
import view.MenuGame;

public class ControllerStart {
	MenuGame view;

	public ControllerStart() {
		// TODO Auto-generated constructor stub
		super();
		this.view = new MenuGame();
		action();
		Sound.THEME.play();
	}

	private void action() {
		// TODO Auto-generated method stub
		for (ImageGame button : view.getListBtn()) {
			setButtonAction(button);
		}

	}

	private void setButtonAction(ImageGame button) {
		// TODO Auto-generated method stub
		switch (button.getNumButton()) {
			case 1:

				button.getBtn().addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						button.setBounds(405, 265, 198, 68);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("play11.png")));
					}

					public void mouseExited(MouseEvent e) {

						button.setBounds(410, 270, 170, 60);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("play1.png")));

					}

					public void mouseClicked(MouseEvent e) {
						// ControllerGame.getInstance().startGame();
						new ControllerSky(view);
						view.setVisible(false);
						Sound.THEME.stop();

					}

				});
				break;
			case 2:

				button.getBtn().addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						button.setBounds(405, 325, 198, 68);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("rank1.png")));
					}

					public void mouseExited(MouseEvent e) {

						button.setBounds(410, 330, 170, 60);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("rank.png")));

					}

					public void mouseClicked(MouseEvent e) {

					}

				});
				break;
			case 3:

				button.getBtn().addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						button.setBounds(405, 385, 198, 68);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("guide1.png")));
					}

					public void mouseExited(MouseEvent e) {

						button.setBounds(410, 380, 180, 70);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("guide.png")));

					}

					public void mouseClicked(MouseEvent e) {
						new ControllerGuide(view);
						view.setVisible(false);
					}

				});
				break;
			case 4:

				button.getBtn().addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						button.setBounds(405, 445, 198, 68);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("about1.png")));
					}

					public void mouseExited(MouseEvent e) {

						button.setBounds(410, 450, 170, 60);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("about.png")));

					}

					public void mouseClicked(MouseEvent e) {
						new ControllerAbout(view);
						view.setVisible(false);
					}

				});
				break;

			case 5:
				button.getBtn().addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						button.setBounds(405, 505, 198, 68);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("exit1.png")));
					}

					public void mouseExited(MouseEvent e) {

						button.setBounds(410, 510, 175, 60);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("exit.png")));

					}

					public void mouseClicked(MouseEvent e) {

						if (button.getBtn() == e.getSource()) {

							int kq = JOptionPane.showConfirmDialog(null, "Do you want to exit the game?", "Confirm",
									JOptionPane.YES_NO_OPTION);
							if (kq == 0) {
								System.exit(0);
							}
						}

					}

				});
				break;
		}
	}

}
