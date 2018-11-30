package image;

/**
 * Created by Arnaud Labourel on 09/11/2018.
 */
public interface Image {
    Object getPixelColor(int x, int y);
    int getWidth();
    int getHeight();
}
