package gui;

import java.awt.*;

public class Apple extends Point {
    private final Color color;

    public Apple(int x, int y, int color_chance) {
        this.x = x;
        this.y = y;
        this.color = getColor(color_chance);
    }

    private Color getColor(int color_chance) {
        if (color_chance < 50 && color_chance >= 0) {
            return Color.RED;
        } else if (color_chance >= 50 && color_chance < 85) {
            return Color.BLUE;
        } else {
            return Color.MAGENTA;
        }
    }

    public Color getColor() {
        return this.color;
    }
}
