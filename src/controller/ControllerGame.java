package controller;
/**
 * 
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.Bird;
import model.Model;
import model.Sound;
import view.Main;
/**
 * 
 * @author phamdinhhoc
 *
 */
public class ControllerGame implements Runnable, KeyListener, MouseListener {
	public Model model;
	public Main view;
	
	private static ControllerGame instance;

	/**
	 * 
	 */
	public ControllerGame() {
		// TODO Auto-generated constructor stub
		this.model = new Model();
		this.view = new Main();
		instance = this;
		view.addKeyListener(this);
		view.addMouseListener(this);
		view.setFocusable(true);
		view.requestFocusInWindow();
		view.getGame().setModel(this.model);
	}

	public void startGame() {
		new Thread(this).start();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (!model.isPlaying()) {
			model.setPlaying();
		}
		model.getBird().setFly(Bird.BOUNCE);
		Sound.FLAP.play();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		model.getBird().setFly(Bird.FALL);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 32) {
			if (!model.isPlaying()) {

				model.setPlaying();
			}
			model.getBird().setFly(Bird.BOUNCE);
			Sound.FLAP.play();
		}
		// Pause
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			model.changeState();
			if(model.isPause()==true) {
				// do
			}
			else {
				// do
				
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		model.getBird().setFly(Bird.FALL);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			view.repaint();
			model.update();

			died();

			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void died() {
		// TODO Auto-generated method stub
		model.died();

	}

	public static ControllerGame getInstance() {
		return instance;
	}
}
