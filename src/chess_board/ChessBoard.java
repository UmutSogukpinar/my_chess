package src.chess_board;

import src.basic_features.Position;
import src.basic_features.Size;

import static src.chess_board.BoardSquare.SQUARE_SIDE;
import static src.App.appHeight;
import static src.App.appWidth;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ChessBoard
{
    private final Image boardImg;
    private final Position position;
    private final Size size;
    private static final BoardSquare[][] boardSquareArray = new BoardSquare[8][8];

    private static final double BOARD_START_X = appWidth / 4;
    private static final double BOARD_START_Y = 0;
    static final double APP_SIDE = appHeight;

    public ChessBoard()
    {
        URL resource = ChessBoard.class.getResource("../images/board/board.png");
        if (resource == null)
            throw new RuntimeException("Image cannot be found: /images/board/board.png");

        boardImg = new ImageIcon(resource).getImage();
        position = new Position(BOARD_START_X, BOARD_START_Y);
        size = new Size(APP_SIDE, APP_SIDE);
        for (int i = 8; i >= 1; i--)
        {
            for (char ch = 'A'; ch <= 'H'; ch++)
            {
                int letterIndex = ch - 'A';
                int numberIndex = 8 - i;
                int numberIndexForArray = i - 1;
                boardSquareArray[numberIndexForArray][letterIndex] = new BoardSquare
                        (
                                new Position
                                        (
                                                BOARD_START_X + (letterIndex * SQUARE_SIDE),
                                                BOARD_START_Y + (numberIndex * SQUARE_SIDE)
                                        ),
                                new ChessboardAxes(ch, i)
                        );
            }
        }
        System.out.println("BOARD_START_X: " + BOARD_START_X);
        System.out.println("BOARD_START_Y: " + BOARD_START_Y);
        System.out.println("SQUARE_SIDE: " + SQUARE_SIDE);
        System.out.println("App height: " + appHeight);
        System.out.println();
    }
    public void drawChessBoard(Graphics graphics)
    {
        graphics.drawImage(boardImg, (int) position.getX_axis(), (int) position.getY_axis(),
                (int) size.getX_axis(), (int) size.getY_axis(), null);
    }

    public static BoardSquare[][] getBoardSquareArray() {
        return boardSquareArray;
    }
}
