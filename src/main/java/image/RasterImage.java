package image;
import javafx.scene.paint.Color;

public abstract class RasterImage implements Image {
    private Object [][] pixels;
    private int width;
    private int height;

    public RasterImage(Color color, int width, int height) {
        /*this.width=width;
        this.height=height;
        createRepresentation();
        for (int index=0; index<this.width; index++){
            for (int index2=0; index2 < this.height; index2 ++){
                pixels[index][index2]=color;
            }
        }*/
        this.width=width;
        this.height=height;
        createRepresentation();
        setPixelsColor(color);

    }

    public RasterImage(Color[][] colors) {
        int width;
        int height;
        width=colors.length;
        height=colors[0].length;
        this.width=width;
        this.height=height;
    }

    public void createRepresentation(){
        pixels= new Object[width][height];
    }

    public void setPixelColor(Color color, int x, int y){
        pixels[x][y]=color;
    }


    public abstract void setPixelsColor(Color[][] pixels);


    public abstract void setPixelsColor(Color color);

    public int getWidth(){ return pixels.length; }

    public int getHeight(){return pixels[0].length;}

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}


