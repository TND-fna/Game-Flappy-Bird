package model;
import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Sound {
	private Clip clip;

	public static final Sound HIT = new Sound("/sound/hit.wav");
	public static final Sound FLAP = new Sound("/sound/flap.wav");
	public static final Sound SCORE = new Sound("/sound/score.wav");
	public static final Sound THEME = new Sound("/sound/theme.wav");

	public Sound(String name) {
		try {
			URL url = Sound.class.getResource(name);
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
		} catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
			e.printStackTrace();
		}
	}

	public void play() {
		try {
			if (clip != null) {
				clip.setFramePosition(0);
				clip.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void stop() {
		try {
			if (clip != null && clip.isRunning()) {
				clip.stop();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
