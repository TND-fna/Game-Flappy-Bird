package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import model.Loader;
import model.Model;
import view.ImageGame;
import view.MenuGame;
import view.SkyBackground;

public class ControllerSky {
	SkyBackground skyBackGround;
	Model model;
	MenuGame startGame;

	public ControllerSky(MenuGame startGame) {
		// TODO Auto-generated constructor stub
		super();
		this.skyBackGround = new SkyBackground();
		this.startGame = startGame;
		action();
	}

	private void action() {
		// TODO Auto-generated method stub
		for (ImageGame button : skyBackGround.getListBtn()) {
			setButtonAction(button);
		}

	}

	private void setButtonAction(ImageGame button) {
		// TODO Auto-generated method stub

		switch (button.getNumButton()) {
			case 6:

				button.getBtn().addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						button.setBounds(95, 395, 175, 60);

						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("play11.png")));
					}

					public void mouseExited(MouseEvent e) {

						button.setBounds(100, 400, 175, 60);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("play1.png")));

					}

					public void mouseClicked(MouseEvent e) {

						if (ControllerGame.getInstance() == null) {
							ControllerGame controllerGame = new ControllerGame();
							controllerGame.model.setStyleSky("morning");
							controllerGame.startGame();
						} else {
							ControllerGame.getInstance().model.setStyleSky("morning");
						}
						skyBackGround.setVisible(false);
						startGame.setVisible(false);

					}

				});
				break;
			case 7:

				button.getBtn().addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						button.setBounds(705, 395, 175, 60);

						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("play11.png")));
					}

					public void mouseExited(MouseEvent e) {

						button.setBounds(710, 400, 175, 60);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("play1.png")));

					}

					public void mouseClicked(MouseEvent e) {

						if (ControllerGame.getInstance() == null) {
							ControllerGame controllerGame = new ControllerGame();
							controllerGame.model.setStyleSky("night");
							controllerGame.startGame();
						} else {
							ControllerGame.getInstance().model.setStyleSky("night");
						}
						skyBackGround.setVisible(false);
						startGame.setVisible(false);

					}

				});
				break;
			case 8:

				button.getBtn().addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						button.setBounds(415,515, 200, 65);

						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("back1.png")));
					}

					public void mouseExited(MouseEvent e) {

						button.setBounds(420, 520, 175, 60);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("back.png")));

					}

					public void mouseClicked(MouseEvent e) {
						new ControllerStart();
						skyBackGround.setVisible(false);
						

					}

				});
				break;
		}
	}

}
