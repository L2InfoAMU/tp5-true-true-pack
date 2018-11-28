package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image {

    Color [][] colors;
    int index;
    int width;
    int height;


    public PaletteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
        createRepresentation();
        for (int index=0; index<this.width; index++){
            for (int index2=0; index2 < this.height; index2 ++){
                colors[index][index2]=color;
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        this.colors = pixels.clone();

    }
    public void createRepresentation(){
        colors= new Color[width][height];
    }


    public void setPixelColor(Color color, int x, int y){
        if(x > width && y <= height)
            colors = new Color[x][height];
        if (y > height && x <= width)
            colors = new Color[width][y];
        if (x > width && y > height)
            colors = new Color[x][y];
        colors[x][y]=color;
    }

    public Color getPixelColor(int x, int y)
: retourne la couleur d’un pixel.
            —
    public void setPixelsColor(Color[][] pixels)
: met à jour les valeurs de couleurs de l’image
    en utilisant les valeurs de la matrice donnée en paramètre.
            —
    private void setPixelsColor(Color color)
: change les valeurs de tous les pixels pour qu’ils
    soient tous de la couleur donnée en paramètre.
            —
    public int getWidth()
: retourne la largeur de l’image.
—
    public int getHeight()
: retourne la hauteur de l’image.
—
    protected void setWidth(int width)
: fixe la largeur de l’image.
—
    protected void setHeight(int height)
: fixe la hauteur de l’image.

}
