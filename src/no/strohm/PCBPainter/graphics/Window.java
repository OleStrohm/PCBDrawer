package no.strohm.PCBPainter.graphics;

/**
 * Created by Ole on 14.04.2017.
 */
public class Window extends Screen {

	public Window(String title, int width, int height) {
		super(title, width, height);
	}

	public void render() {
		drawRectangle(0, 0, getWidth(), getHeight(), 0xFF00FF);
	}

}
