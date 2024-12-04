package src.chess_board;

import src.basic_features.Position;
import src.basic_features.Size;

import static src.chess_board.BoardSquare.squareSide;
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
    private final BoardSquare[][] boardSquareArray = new BoardSquare[8][8];

    private static final int BOARD_START_X = appWidth / 4;
    private static final int BOARD_START_Y = 0;
    static final int SIDE_LENGTH = appHeight;

    public ChessBoard()
    {
        URL resource = ChessBoard.class.getResource("../images/board/board.png");
        if (resource == null)
            throw new RuntimeException("Image cannot be found: /images/board/board.png");

        boardImg = new ImageIcon(resource).getImage();
        position = new Position(BOARD_START_X, BOARD_START_Y);
        size = new Size(SIDE_LENGTH, SIDE_LENGTH);
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
                                                BOARD_START_X + (letterIndex * squareSide),
                                                BOARD_START_Y + (numberIndex * squareSide)
                                        ),
                                new ChessboardAxes(ch, i)
                        );
            }
        }
    }
    public void drawChessBoard(Graphics graphics)
    {
        graphics.drawImage(boardImg, position.getX_axis(), position.getY_axis(),
                size.getX_axis(), size.getY_axis(), null);
    }
}
