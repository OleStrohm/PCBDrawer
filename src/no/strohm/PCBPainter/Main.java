package no.strohm.PCBPainter;

import no.strohm.PCBPainter.graphics.Window;

/**
 * Created by Ole on 13.04.2017.
 */
public class Main implements Runnable {

	public static final String TITLE = "Let's make a PCB";

	private Window window;

	public Main() {
		window = new Window(TITLE, 800, 600);
	}

	public void run() {
		long lastTime = System.nanoTime();
		long timer = System.currentTimeMillis();

		double upsNS = 1000000000.0 / 60.0; // something / refreshRate
		double unprocessedUPS = 0;
		int ticks = 0;

		double fpsNS = 1000000000.0 / 60.0; // something / fps
		double unprocessedFPS = 0;
		int frames = 0;

		window.requestFocus();
		while (!window.isClosed()) {
			long now = System.nanoTime();
			unprocessedUPS += (now - lastTime) / upsNS;
			unprocessedFPS += (now - lastTime) / fpsNS;
			lastTime = now;

			while (unprocessedUPS >= 1) {
				//TODO: update();
				ticks++;
				unprocessedUPS--;
			}

			if(unprocessedFPS >= 1) {
				window.render();
				frames++;
				unprocessedFPS--;
			}

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				window.setTitle(TITLE + " | " + ticks + " ups | " + frames + " fps");
				ticks = 0;
				frames = 0;
			}
		}
	}

	public static void main(String[] args) {
		Main main = new Main();

		main.start();
	}
	private void start() {
		new Thread(this).start();
	}

	public void stop() {
		window.close();
	}

}
