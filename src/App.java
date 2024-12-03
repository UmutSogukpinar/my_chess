package src;

import javax.swing.*;

public class App
{
    public static final int appHeight = 1000;
    public static final int appWidth = (appHeight * 4) / 3;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Chess");

        frame.setSize(appWidth, appHeight);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);  // Board will be centered of the screen
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // When the window is closed, jvm stops

        Chess chess = new Chess();
        frame.add(chess);
        frame.pack();
        chess.requestFocus();
        frame.setVisible(true);
    }
}
