package model;

public class YellowBird extends Bird {

	@Override
	public void addFrame() {
		// TODO Auto-generated method stub
		animation.addFrame("ye1.png", 15);
		animation.addFrame("ye2.png", 15);
		animation.addFrame("ye3.png", 15);
	}

}
