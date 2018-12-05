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
      //setPixelsColor(pixels);
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

}
