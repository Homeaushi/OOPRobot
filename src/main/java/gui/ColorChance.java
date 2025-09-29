package gui;

import java.awt.*;

public final class ColorChance extends Color {
    // RA - RED APPLE
    // BA - BLUE APPLE
    private static final int UPPER_BORDER_RA = 50;
    private static final int LOWER_BORDER_RA = 0;
    private static final int UPPER_BORDER_BA = 85;

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
        if (colorChance < UPPER_BORDER_RA && colorChance >= LOWER_BORDER_RA) {
            return Color.RED;
        } else if (colorChance >= UPPER_BORDER_RA && colorChance < UPPER_BORDER_BA) {
            return Color.BLUE;
        } else {
            return Color.MAGENTA;
        }
    }
}
