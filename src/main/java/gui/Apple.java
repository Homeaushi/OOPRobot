package gui;

import java.awt.*;

public class Apple extends Point{
    private final Color color;

    public Apple(int x, int y, int color){
        this.x = x;
        this.y = y;
        this.color = getColor(color);
    }

    private Color getColor(int color){
        if (color < 50 && color >= 0){
            return Color.RED;
        }
        else if (color >= 50 && color <85){
            return Color.BLUE;
        }else{
            return Color.MAGENTA;
        }
    }

    public Point getAsPoint(){
        return new Point(this.x, this.y);
    }

    public Color getColor(){
        return this.color;
    }
}
