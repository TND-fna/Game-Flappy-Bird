package model;

import java.awt.Image;

public class DaySky extends Sky {

	@Override
	public Image createSky() {
		// TODO Auto-generated method stub
		return Loader.loadImage("sky.png");
	}

}
