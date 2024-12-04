package src;

import src.chess_board.BoardSquare;
import src.chess_board.ChessBoard;
import src.pieces.Pawn;

import javax.swing.*;
import java.awt.*;

import static src.App.appHeight;
import static src.App.appWidth;
import static src.chess_board.ChessBoard.getBoardSquareArray;

public class Chess extends JPanel
{
    ChessBoard board;
    Pawn pawn;

    public Chess()
    {
        setPreferredSize(new Dimension(appWidth, appHeight));
        board = new ChessBoard();
        pawn = new Pawn(true, getBoardSquareArray()[0][0]);
    }

    @Override
    public void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        board.drawChessBoard(graphics);
        pawn.drawPiece(graphics);
    }
}
