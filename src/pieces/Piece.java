package src.pieces;

import src.chess_board.BoardSquare;

import java.awt.*;

public abstract class Piece
{
    protected boolean isWhite;
<<<<<<< HEAD
    Image img;
    BoardSquare square;

    public abstract void showPotentialMovement();
=======
    protected Image img;
    protected Position position;

    public abstract void potentialMovements();
>>>>>>> c321fc0d9d19b2ffa4a04c3277e5b49fc5d56a79

}
