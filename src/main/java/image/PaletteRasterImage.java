package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage extends RasterImage  implements Image {

    Color [][] pixels;
    int index;
    int width;
    int height;


    public PaletteRasterImage(Color color, int width, int height){
       super(color,width,height);
    }

    public PaletteRasterImage(Color[][] pixels){
        super(pixels);
    }



    public void setPixelColor(Color color, int x, int y){
        if(x > width && y <= height)
            pixels = new Color[x][height];
        if (y > height && x <= width)
            pixels = new Color[width][y];
        if (x > width && y > height)
            pixels = new Color[x][y];
        super.setPixelColor(color,x,y);
    }


    public void setPixelsColor(Color color){
        new PaletteRasterImage(color,width,height);
    }
;}
