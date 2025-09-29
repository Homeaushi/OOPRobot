package gui;

import java.awt.*;

public class Apple extends Point {
    private final Color color;

    public Apple(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}
