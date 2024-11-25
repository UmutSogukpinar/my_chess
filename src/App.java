package src;

import javax.swing.*;

public class App
{
    private static final int appSize = 1000;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Chess");

        frame.setSize(appSize, appSize);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);  // Board will be centered of the screen
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // When the window is closed, jvm stops

        frame.setVisible(true);
    }
}
