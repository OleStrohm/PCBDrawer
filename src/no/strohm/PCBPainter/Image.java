package no.strohm.PCBPainter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
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
        try{
            BufferedImage temp = ImageIO.read(file);
            img = new BufferedImage(temp.getWidth(), temp.getHeight(), BufferedImage.TYPE_INT_RGB);
            img.getGraphics().drawImage(temp,0,0,null);
            pixels = ((DataBufferInt)img.getRaster().getDataBuffer()).getData();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public int getPixel(int x, int y){
        if(x < 0 || y < 0 || x > getWidth() || y > getHeight()) return 0;
        return pixels[x + y * getWidth()];
    }

    public int getWidth(){
        return img.getWidth();
    }

    public int getHeight(){
        return img.getHeight();
    }
}
