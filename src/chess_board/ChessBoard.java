package src.chess_board;

import src.basic_features.Position;
import src.basic_features.Size;

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

    private static final int BOARD_START_X = appWidth / 4;
    private static final int BOARD_START_Y = 0;
    private static final int SIDE_LENGTH = appHeight;

    public ChessBoard()
    {
        URL resource = ChessBoard.class.getResource("../images/board/board.png");
        if (resource == null)
            throw new RuntimeException("Image cannot be found: /images/board/board.png");

        boardImg = new ImageIcon(resource).getImage();
        position = new Position(BOARD_START_X, BOARD_START_Y);
        size = new Size(SIDE_LENGTH, SIDE_LENGTH);
    }

    public void drawChessBoard(Graphics graphics)
    {
        graphics.drawImage(boardImg, position.getX_axis(), position.getY_axis(),
                size.getX_axis(), size.getY_axis(), null);
    }
}
