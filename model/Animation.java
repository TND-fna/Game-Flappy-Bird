package model;

import java.awt.Image;
import java.util.ArrayList;

public class Animation {
	private ArrayList<FrameView> frames;
	private long trackTime;
	private long totalTimeShow;
	private int currentFrame;

	public Animation() {

		this.frames = new ArrayList<>();
		this.trackTime = 0;
		this.totalTimeShow = 0;
		this.currentFrame = 0;
	}

	public void addFrame(String filename, long duration) {
		totalTimeShow += duration;
		frames.add(new FrameView(Loader.loadImage(filename), totalTimeShow));
	}

	public FrameView getCurrentFrame() {
		return frames.get(currentFrame);
	}

	public Image getCurrentImage() {
		return getCurrentFrame().getImage();
	}

	public void update(long elapsetime) {
		if (frames.size() > 1) {
			trackTime += elapsetime;
			if (trackTime >= totalTimeShow) {
				trackTime -= totalTimeShow;
				currentFrame = 0;
			}
		}
		if (trackTime > getCurrentFrame().getTime()) {
			currentFrame++;

		}

	}

}
