package no.strohm.PCBPainter.graphics;

import no.strohm.PCBPainter.util.Vector2f;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 * Created by Ole on 13.04.2017.
 */
public class Screen extends Component {

	private JFrame frame;
	private boolean isClosed = false;

	private BufferedImage img;
	protected int[] pixels;

	public Screen(String title, int width, int height) {
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.add(this);

		frame.addWindowListener(new WindowAdapter() {
			// WINDOW_CLOSING event handler
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				isClosed = true;
			}

			// WINDOW_CLOSED event handler
			@Override
			public void windowClosed(WindowEvent e) {
				super.windowClosed(e);
			}
		});

		while (getWidth() == 0) ;

		resized();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (getWidth() != img.getWidth() || getHeight() != img.getHeight()) {
			resized();
		}
		render();
		g.drawImage(img, 0, 0, null);
	}

	public void render() {}

	public void drawRectangle(Vector2f pos, Vector2f bounds, int color) {
		drawRectangle(pos.getX(), pos.getY(), bounds.getX(), bounds.getY(), color);
	}

	public void drawRectangle(float xs, float ys, float w, float h, int color) {
		for (int yp = (int) ys; yp < (int) ys + h; yp++) {
			for (int xp = (int) xs; xp < (int) xs + w; xp++) {
				setPixel(xp, yp, color);
			}
		}
	}

	public void drawLine(float x1, float y1, float x2, float y2, int color) {
		int dx = (int) (x2 - x1);
		int dy = (int) (y2 - y1);

		int xp = (int) x1;
		int yp = (int) y1;

//		while(xp != (int) x2 && yp != (int) y2) {
//			TODO: make this shit
//		}
	}

	public void resized() {
		img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt) img.getRaster().getDataBuffer()).getData();
	}

	public void update() {
		frame.repaint();
	}

	public void setPixel(int x, int y, int hex) {
		if (x > img.getWidth() || x < 0 || y > img.getHeight() || y < 0) return;

		pixels[x + y * img.getWidth()] = hex;
	}

	public void setTitle(String title) {
		frame.setTitle(title);
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void close() {
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}

}
