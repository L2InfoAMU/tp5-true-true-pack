package image;

import javafx.scene.paint.Color;
import java.util.List;

import static java.util.Collections.fill;

public class PaletteRasterImage implements Image {


    private List <Color> palette;
    int [][] indexOfColors;
    int width;
    int height;


    public PaletteRasterImage(Color color, int width, int height) {
        this.width=width;
        this.height=height;
        createRepresentation();
        fill(palette, color);

    }

    public PaletteRasterImage(Color[][] colors) {
        for (int index = 0; index < colors.length; index++) {
            for (int index2 = 0; index2 < colors[0].length; index2++) {
                palette.set(indexOfColors[index][index2],colors[index][index2]);
            }
        }
    }
    //todo
    public void createRepresentation(){
        indexOfColors = new int[width][height];

    }

    public void setPixelColor(Color color, int x, int y){
        if (palette.contains(color)==true){
            palette.set(indexOfColors[x][y],color);
        }
        palette.set(indexOfColors[x][y],color);
    }

    public Color getPixelColor(int x, int y){ return palette.get(indexOfColors[x][y]);}

    private void setPixelsColor(Color[][] pixels){
        for (int index=0; index<width; index++){
            for (int index2=0; index2 < height; index2 ++){
                palette.set(indexOfColors[index][index2],pixels[index][index2]);
            }
        }
    }


    public void setPixelsColor(Color color) {
        for (int index = 0; index < width; index++) {
            for (int index2 = 0; index2 < height; index2++) {
                palette.set(indexOfColors[index][index2], color);
            }
        }
    }


    public int getWidth(){ return indexOfColors.length; }

    public int getHeight(){return indexOfColors[0].length;}

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}
