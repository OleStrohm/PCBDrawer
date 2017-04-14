package no.strohm.PCBPainter.graphics;

import no.strohm.PCBPainter.util.Color;

/**
 * Created by Ole on 14.04.2017.
 */
public class Window extends Screen {

    Image nirvana;

    public Window(String title, int width, int height) {
        super(title, width, height);
        //nirvana = new Image("imgs/Nirvabna-Wallpaper.jpg");
    }

    public void render() {
        drawRectangle(0, 0, getWidth(), getHeight(), Color.toInt(0.15f, 0.3f, 0.8f));
        //drawImage(nirvana, (getWidth() - nirvana.getWidth()) / 2, (getHeight() - nirvana.getHeight()) / 2);
    }

}
