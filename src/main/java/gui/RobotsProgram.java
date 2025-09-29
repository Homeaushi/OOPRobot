package gui;


import java.awt.Frame;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class RobotsProgram {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("Ошибка при запуске прилдожения:" + e);
            return;
        }
        SwingUtilities.invokeLater(() -> {
            MainApplicationFrame frame = new MainApplicationFrame();
            frame.pack();
            frame.setVisible(true);
            frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        });
    }
}