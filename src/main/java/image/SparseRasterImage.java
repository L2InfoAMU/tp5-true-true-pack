package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage implements Image{
  Map<Point,Color> pixelsMap;
  public SparseRasterImage(Color color, int width, int height){
        super(color,width,height);
    }

  public SparseRasterImage(Color[][] pixels){
      super(pixels);
      setPixelsColor(pixels);
  }

    @Override
    public void createRepresentation() {
      pixelsMap= new HashMap<>();
    }

  public void setPixelColor(Color color, int x, int y){
    pixelsMap.put(new Point(x,y), color);
    }

  public Color getPixelColor(int x, int y){
    Color result = pixelsMap.get(new Point(x,y));
    if(result == null)
      return Color.WHITE;
    return result;
  }

  private void setPixelsColor(Color[][] pixels){
    for(int index=0; index<pixels.length; index++){
      for(int index2=0; index2<pixels[0].length;index2++){
        setPixelColor(pixels[index][index2], index, index2);
      }
    }
  }

  public void setPixelsColor(Color color) {
    for (int index = 0; index < getWidth(); index++) {
      for (int index2 = 0; index2 < getHeight(); index2++) {
        setPixelColor(color, index, index2);
      }
    }
  }

  /*Les classes —
  public int getWidth(): retourne la largeur de l’image.
  public int getHeight(): retourne la hauteur de l’image.
  protected void setWidth(int width): fixe la largeur de l’image.
  protected void setHeight(int height): fixe la hauteur de l’image.
  sont définies dans RasterImage*/
}
