package no.strohm.PCBPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 * Created by Ole on 13.04.2017.
 */
public class Screen extends Canvas {

	private JFrame frame;

	private boolean initialized = false;

	private BufferedImage image;
	private int[] pixels;
	private int width, height;

	public Screen(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
		this.width = width;
		this.height = height;

		init();
	}

	private void init() {
		if(initialized)
			return;

		Dimension d = new Dimension(width, height);
		setPreferredSize(d);
		setMaximumSize(d);
		setMinimumSize(d);

		frame = new JFrame("PCB Creator");

		initialized = true;
	}

	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(2);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, width, height, null);
		g.dispose();
		bs.show();
	}

	public int[] getPixels() {
		return pixels;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
