package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;

import view.Main;

public class Model {
	private BackGround ground1;
	private BackGround ground2;
	private Sky sky;
	private String styleSky = "default";
	private SkyFactory factory;
	private Image playButton = new ImageIcon("src/images/play-button.png").getImage();
	boolean pause = false;

	public Sky getSky() {
		return sky;
	}

	public void setSky(Sky sky) {
		this.sky = sky;
	}

	private Bird bird;
	private Score score;
	private Obstacle ob;
	private StateGame stateGame; // trang thai game

	int scoreD = 0;
	int bestScore;
	boolean playing;
	ArrayList<Obstacle> obstacles;

	public Model() {
		ground1 = new BackGround(0);
		ground2 = new BackGround(ground1.getWidth());
		sky = factory.createSky(styleSky);
		new BirdFactory();
		bird = BirdFactory.createBird();
		score = new Score();
		ob = new Obstacle();
		obstacles = new ArrayList<>();
		stateGame = new StateStart();

	}

	public void update() {
		stateGame.update(this);

	}

	public Obstacle getOb() {
		return ob;
	}

	public void setOb(Obstacle ob) {
		this.ob = ob;
	}

	public StateGame getStateGame() {
		return stateGame;
	}

	public void setStateGame(StateGame stateGame) {
		this.stateGame = stateGame;
	}

	public int getScoreD() {
		return scoreD;
	}

	public void setScoreD(int scoreD) {
		this.scoreD = scoreD;
	}

	public int getBestScore() {
		return bestScore;
	}

	public void setBestScore(int bestScore) {
		this.bestScore = bestScore;
	}

	public ArrayList<Obstacle> getObstacles() {
		return obstacles;
	}

	public void setObstacles(ArrayList<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}

	public void setGround1(BackGround ground1) {
		this.ground1 = ground1;
	}

	public void setGround2(BackGround ground2) {
		this.ground2 = ground2;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	public void draw(Graphics2D g) {
		sky.draw(g);
		for (int i = 0; i < obstacles.size(); i++) {
			obstacles.get(i).draw(g);

		}

		ground1.draw(g);
		ground2.draw(g);

		g.setColor(Color.WHITE);
		g.setFont(new Font("", Font.BOLD, 28));
		g.drawString("High score: " + Score.read(), 20, 40);

//		g.setFont(new Font("", Font.BOLD, 28));
//		g.drawString("Pause: " + pause, 20, 70);
		if (pause == true) {
			g.drawImage(playButton, 380, 236, null);
		} else {
			g.drawImage(null, Main.WIDTH / 2, Main.HEIGHT / 2, null);
		}

		g.setColor(Color.YELLOW);
		g.setFont(new Font("", Font.BOLD, 40));
		g.drawString("" + scoreD, Main.WIDTH / 2 - 15, 50);

		this.bird.draw(g);

	}

	public void died() {
		if (this.bird.died(obstacles)) {
			Sound.HIT.play();
			score.addScore(scoreD);
			String medal = score.medal(scoreD);
			ImageIcon image = new ImageIcon(Loader.loadImage(medal));
			int op = JOptionPane.showConfirmDialog(null,
					"YOUR SCORE: " + scoreD + "\n" + "BEST: " + Score.read() + "\n" + "AGAIN?", "menu",
					JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, image);

			if (op == JOptionPane.YES_NO_OPTION) {
				replay();
			} else {
				System.exit(0);
				// new ControllerStart();
			}
		}
	}

	private void replay() {
		ground1 = new BackGround(0);
		ground2 = new BackGround(ground1.getWidth());
		this.sky = factory.createSky(styleSky);

		new BirdFactory();
		this.bird = BirdFactory.createBird();
		score = new Score();
		scoreD = 0;
		setPlaying();
		stateGame = new StateStart();

		obstacles.clear();

	}

	public BackGround getGround1() {
		return ground1;
	}

	public BackGround getGround2() {
		return ground2;
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public Score getScore() {
		return score;
	}

	public void setPlaying() {
		if (playing) {
			this.playing = false;

		} else {
			this.playing = true;
			this.setStateGame(new StatePlay());

		}
	}

	public boolean isPlaying() {
		return playing;
	}

	// Pause game
	public void changeState() {
		if (!pause) {
			this.setStateGame(new StatePause());
			pause = true;
		} else {
			this.setStateGame(new StatePlay());
			pause = false;
		}
	}

	public String getStyleSky() {
		return styleSky;
	}

	public void setStyleSky(String styleSky) {
		this.styleSky = styleSky;
		sky = factory.createSky(styleSky);
	}

	public boolean isPause() {
		return pause;
	}

}
