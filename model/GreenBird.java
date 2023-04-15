package model;

public class GreenBird extends Bird {

	@Override
	public void addFrame() {
		// TODO Auto-generated method stub
		animation.addFrame("gr1.png", 15);
		animation.addFrame("gr2.png", 15);
		animation.addFrame("gr3.png", 15);
	}

}
