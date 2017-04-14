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
        drawRectangle(0, 0, getWidth(), getHeight(), 0xFF00FF);
        //drawImage(nirvana, (getWidth() - nirvana.getWidth()) / 2, (getHeight() - nirvana.getHeight()) / 2);
    }

    public void drawRectangle(Vector2f pos, Vector2f bounds, int color) {
        drawRectangle(pos.getX(), pos.getY(), bounds.getX(), bounds.getY(), color);
    }

    public void drawRectangle(float xs, float ys, float w, float h, int color) {
        for (int yp = (int) ys; yp < (int) ys + h; yp++) {
            for (int xp = (int) xs; xp < (int) xs + w; xp++) {
                if (yp < 0 || yp >= getHeight() || xp < 0 || xp >= getWidth())
                    continue;
                pixels[xp + yp * getWidth()] = color;
            }
        }
    }

}
