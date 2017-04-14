package no.strohm.PCBPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 * Created by Ole on 13.04.2017.
 */
public class Screen extends Component {

	JFrame frame;

	BufferedImage img;
	int[] pixels;

	public Screen(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.add(this);

		while(getWidth() == 0);

		resized();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(getWidth() != img.getWidth() || getHeight() != img.getHeight()){
			resized();
		}
		render();
		g.drawImage(img, 0, 0, null);
	}

	public void render(){}

	public void resized(){
		img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt)img.getRaster().getDataBuffer()).getData();
	}

	public void update(){
		frame.repaint();
	}

	public void setPixel(int x, int y, int hex){
		if(x > img.getWidth() || x < 0 || y > img.getHeight() || y < 0) return;

		pixels[x + y * img.getWidth()] = hex;
	}
}
