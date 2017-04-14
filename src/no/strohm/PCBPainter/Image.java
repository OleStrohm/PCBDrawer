package no.strohm.PCBPainter;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

/**
 * Created by Elias F. Fyksen on 14.04.2017.
 */
public class Image {

    BufferedImage img;
    int[] pixels;

    File file;

    public Image(File m_file){
        file = m_file;
        init();
    }

    public Image(String path){
        file = new File(path);
        init();
    }

    public void init(){
        img = img;
    }

}
