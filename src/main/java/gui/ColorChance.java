package gui;

import java.awt.*;

public final class ColorChance extends Color {

    private ColorChance(int r, int g, int b) {
        super(r, g, b);
    }

    /*
     * Метод, который по заданному числу с определённым шансом возвращает цвет
     * Для Красного шанс составляет 50%
     * Для Голубого 35%(85 - 50)
     * Для Магнеты 15%(100 - 85)
     */
    public static Color getColor(int colorChance) {
        if (colorChance < 50 && colorChance >= 0) {
            return Color.RED;
        } else if (colorChance >= 50 && colorChance < 85) {
            return Color.BLUE;
        } else {
            return Color.MAGENTA;
        }
    }
}
