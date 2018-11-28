package image;

import javafx.scene.paint.Color;

import static util.Matrices.requiresNonNull;
import static util.Matrices.requiresNonZeroDimensions;
import static util.Matrices.requiresRectangularMatrix;

public class BruteRasterImage extends RasterImage implements Image{
    private Color [][] pixels;
    private int width;
    private int height;

    public BruteRasterImage(Color color, int width, int height) {
        super(color,width,height);

    }

    public BruteRasterImage(Color[][] colors) {
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
        super(colors);
        }


    public void setPixelColor(Color color, int x, int y){
        super.setPixelColor(color,x,y);
    }




    public void setPixelsColor(Color color){
        /*for (int index=0; index<width; index++){
            for (int index2=0; index2 < height; index2 ++){
                pixels[index][index2]=color;
            }
        }*/
        new BruteRasterImage(color,width,height);
    }

}