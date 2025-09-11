package gui;

import java.awt.*;

public class Apple extends Point {
    private final Color color;

    public Apple(int x, int y, int colorChance) {
        this.x = x;
        this.y = y;
        this.color = ColorChance.getColor(colorChance);
    }

    public Color getColor() {
        return this.color;
    }
}
