package src.chess_board;

import src.basic_features.Position;
import src.basic_features.Size;

public class BoardSquare
{
    Position position;
    Size size;
    boolean isTherePiece;

    public BoardSquare(Position position)
    {
        this.position = position;
        isTherePiece = false;
    }
}
