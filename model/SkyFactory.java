package model;

public class SkyFactory {
	private static Sky sky;

	public static Sky createSky(String type) {
		if (type.equals("morning"))
			sky = new DaySky();
		else if (type.equals("night"))
			sky = new NightSky();
		return sky;
	}

}
