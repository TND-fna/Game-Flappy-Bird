package model;

public class RedBird extends Bird {

	@Override
	public void addFrame() {
		// TODO Auto-generated method stub
		animation.addFrame("bird1.png", 15);
		animation.addFrame("bird2.png", 15);
		animation.addFrame("bird3.png", 15);
	}

}
