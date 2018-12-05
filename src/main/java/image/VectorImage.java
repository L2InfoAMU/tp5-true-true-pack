package image;

import java.util.List;
import javafx.scene.paint.Color;

public class VectorImage implements Image {
    private List<Shape> shapes;
    private int width;
    private int height;
    public VectorImage(List<Shape> shapes, int width, int height){
        setWidth(width);
        setHeight(height);
        this.shapes=shapes;
    }

    public Color getPixelColor(int x, int y){
        for(Shape shape : shapes){
            if(shape.contains(new Point(x,y)))
                return shape.getColor();
        }
        return Color.WHITE;
    }

    public int getWidth(){return width;}

    public int getHeight(){return height;}

    protected int setWidth(int width){
        return this.width=width;
    }

    protected int setHeight(int height){
        return this.height=height;
    }
}
