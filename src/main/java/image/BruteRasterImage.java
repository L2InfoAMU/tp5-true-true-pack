package image;

import javafx.scene.paint.Color;

import static util.Matrices.requiresNonNull;
import static util.Matrices.requiresNonZeroDimensions;
import static util.Matrices.requiresRectangularMatrix;

public class BruteRasterImage implements Image{
    private Color [][] pixels;
    private int width;
    private int height;

    public BruteRasterImage(Color color, int width, int height) {
        this.width=width;
        this.height=height;
        createRepresentation();
        for (int index=0; index<this.width; index++){
            for (int index2=0; index2 < this.height; index2 ++){
                pixels[index][index2]=color;
            }
        }

    }

    public BruteRasterImage(Color[][] colors) {
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
        this.pixels = colors.clone();

    }

    public void createRepresentation(){
        pixels= new Color[width][height];
    }

    public void setPixelColor(Color color, int x, int y){
        pixels[x][y]=color;
    }

    public Color getPixelColor(int x, int y){ return pixels[x][y];}

    private void setPixelsColor(Color[][] pixels){
        this.pixels=pixels.clone();
    }


    private void setPixelsColor(Color color){
        /*for (int index=0; index<width; index++){
            for (int index2=0; index2 < height; index2 ++){
                pixels[index][index2]=color;
            }
        }*/
        new BruteRasterImage(color,width,height);
    }

    public int getWidth(){ return pixels.length; }

    public int getHeight(){return pixels[0].length;}

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}