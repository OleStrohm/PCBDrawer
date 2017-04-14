package no.strohm.PCBPainter;

import no.strohm.PCBPainter.graphics.Screen;

/**
 * Created by Ole on 13.04.2017.
 */
public class Main implements Runnable {



	private boolean running = true;

	public void run() {
		new Screen();

		while(running) {

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
		running = false;
	}

}
