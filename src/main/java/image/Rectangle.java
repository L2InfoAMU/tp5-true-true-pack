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
        if(Math.abs(point.x)>Math.abs(width-x) && Math.abs(point.x)<x)
            return false;
        if (Math.abs(point.y)>Math.abs(height-y) && Math.abs(point.y)<y)
            return false;
        return true;
    }

    public Color getColor(){return color;}
}
