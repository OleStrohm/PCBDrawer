package no.strohm.PCBPainter.graphics;

import no.strohm.PCBPainter.util.Vector2f;

/**
 * Created by Ole on 14.04.2017.
 */
public class Window extends Screen {

	public Window(String title, int width, int height) {
		super(title, width, height);
	}

	public void render() {

	}

	public void drawRectangle(Vector2f pos, Vector2f bounds, ) {
		for(int yp = (int) pos.getY(); yp < (int) pos.getY() + bounds.getY(); yp++) {
			for(int xp = (int) pos.getX(); xp < (int) pos.getX() + bounds.getX(); xp++) {
				pixels[yp][xp] =
			}
		}
	}

}
