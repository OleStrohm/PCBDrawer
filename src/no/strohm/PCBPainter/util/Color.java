package no.strohm.PCBPainter.util;

/**
 * Created by Ole on 14.04.2017.
 */
public class Color {

	private Color() {}

	public static int toInt(float r, float g, float b) {
		return ((int) (r * 255) << 16) + ((int) (g * 255) << 8) + (int) (b * 0xFF);
	}

}
