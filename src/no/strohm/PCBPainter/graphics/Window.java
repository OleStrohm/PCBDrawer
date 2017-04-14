package no.strohm.PCBPainter.graphics;

import no.strohm.PCBPainter.util.Vector2f;

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
        drawRectangle(0, 0, getWidth(), getHeight(), 0xffffff);
        //drawImage(nirvana, (getWidth() - nirvana.getWidth()) / 2, (getHeight() - nirvana.getHeight()) / 2);
    }

}
