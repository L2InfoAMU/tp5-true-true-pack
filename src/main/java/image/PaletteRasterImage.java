package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image {

    Color [][] pixels;
    int index;
    int width;
    int height;


    public PaletteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
        createRepresentation();
        for (int index=0; index<this.width; index++){
            for (int index2=0; index2 < this.height; index2 ++){
                pixels[index][index2]=color;
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        this.pixels = pixels.clone();

    }
    public void createRepresentation(){
        pixels = new Color[width][height];
    }


    public void setPixelColor(Color color, int x, int y){
        if(x > width && y <= height)
            pixels = new Color[x][height];
        if (y > height && x <= width)
            pixels = new Color[width][y];
        if (x > width && y > height)
            pixels = new Color[x][y];
        pixels[x][y]=color;
    }

    public Color getPixelColor(int x, int y){return pixels[x][y];}

    public void setPixelsColor(Color[][] pixels){
        this.pixels=pixels.clone();
    }

    private void setPixelsColor(Color color){
        new PaletteRasterImage(color,width,height);
    }

    public int getWidth(){return width;}


    public int getHeight(){return height;}


    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}
