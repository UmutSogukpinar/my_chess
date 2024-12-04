package src.chess_board;

import src.basic_features.Position;
import src.basic_features.Size;

import static src.chess_board.ChessBoard.SIDE_LENGTH;

public class BoardSquare
{
    Position position;
    ChessboardAxes axes;
    Size size;
    boolean isTherePiece;
    static final int squareSide = SIDE_LENGTH / 8;

    public BoardSquare(Position position, ChessboardAxes axes)
    {
        this.position = position;
        this.axes = axes;
        size = new Size(squareSide, squareSide);
        isTherePiece = false;
    }
}
