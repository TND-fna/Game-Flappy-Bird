package model;

public class SkyFactory {
	// public static Sky createSky() {
	// Random sc = new Random();
	// int random = sc.nextInt(3);
	// switch (random) {
	// case 1:
	// return new DaySky();
	// case 2:
	// return new NightSky();
	// default:
	// return new DefaultSky();
	// }
	// }
	private static Sky sky;

	public static Sky createSky(String type) {
		if (type.equals("morning"))
			sky = new DaySky();
		else if (type.equals("night"))
			sky = new NightSky();
		return sky;
	}

}
