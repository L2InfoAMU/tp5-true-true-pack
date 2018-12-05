package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.fill;

public class PaletteRasterImage extends RasterImage implements Image {


    private List<Color> palette;
    int[][] indexOfColors;


    public PaletteRasterImage(Color color, int width, int height) {
        super(color, width, height);
        for (int index=0; index<width; index++){
            for(int index2=0; index2<height; index2++){
                palette.add(indexOfColors[index][index2],color);
            }
        }

    }

    public PaletteRasterImage(Color[][] colors) {
        super(colors);
        setPixelsColor(colors);
    }

    public void createRepresentation() {
        indexOfColors= new int[getWidth()][getHeight()];
        palette = new ArrayList<>();
    }

    public void setPixelColor(Color color, int x, int y) {
        int index;
        if (!palette.contains(color)) {
            palette.add(color);
        }
        index = palette.indexOf(color);
        indexOfColors[x][y] = index;
    }

    public Color getPixelColor(int x, int y) {
            return palette.get(indexOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {
        for (int index = 0; index < getWidth(); index++) {
            for (int index2 = 0; index2 < getHeight(); index2++) {
                setPixelColor(pixels[index][index2], index, index2);
            }
        }
    }


    public void setPixelsColor(Color color) {
        fill(palette, color);
    }

}

