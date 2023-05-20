package model;

import java.util.Random;

public class BirdFactory {
	public static Bird createBird() {
		Random sc = new Random();
		int random = sc.nextInt(4);
		switch (random) {
			case 1:
				return new BlueBird();
			case 2:
				return new GreenBird();
			case 3:
				return new YellowBird();
			default:
				return new RedBird();
		}
	}

}
