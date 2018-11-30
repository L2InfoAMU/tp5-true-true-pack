package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
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
        setPixelsColor(color);

    }

    public PaletteRasterImage(Color[][] colors) {
        int width;
        int height;
        width=colors.length;
        height=colors[0].length;
        this.width=width;
        this.height=height;
        createRepresentation();
        setPixelsColor(colors);
    }

    public void createRepresentation(){
        indexOfColors = new int[width][height];
        palette=new ArrayList<Color>();
    }

    public void setPixelColor(Color color, int x, int y){
        int index;
        if (!palette.contains(color)){
            palette.add(color);
        }
        index=palette.indexOf(color);
        indexOfColors[x][y]=index;
    }

    public Color getPixelColor(int x, int y){ return palette.get(indexOfColors[x][y]);}

    private void setPixelsColor(Color[][] pixels){
        for (int index=0; index<width; index++){
            for (int index2=0; index2 < height; index2 ++){
                setPixelColor(pixels[index][index2],index,index2);
            }
        }
    }


    public void setPixelsColor(Color color) {
        fill(palette, color);
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
