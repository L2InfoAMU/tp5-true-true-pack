package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.color=color;
    }

    public boolean contains(Point point){
        if(x<point.x && point.x<=x+width && y<point.y && point.y<=y+height)
            return true;
        return false;
    }

    public Color getColor(){return color;}
}
