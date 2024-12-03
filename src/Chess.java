package src;

import src.chess_board.ChessBoard;

import javax.swing.*;
import java.awt.*;

import static src.App.appHeight;
import static src.App.appWidth;

public class Chess extends JPanel
{
    ChessBoard board;

    public Chess()
    {
        setPreferredSize(new Dimension(appWidth, appHeight));
        board = new ChessBoard();
    }

    @Override
    public void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        board.drawChessBoard(graphics);
    }
}
