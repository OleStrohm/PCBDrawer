package no.strohm.PCBPainter;

import no.strohm.PCBPainter.graphics.Window;

/**
 * Created by Ole on 13.04.2017.
 */
public class Main implements Runnable {

    private Window window;
    private boolean running = true;

    public Main() {
        window = new Window("Let's make a PCB", 800, 600);
    }

    public void run() {


        while (running) {

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
