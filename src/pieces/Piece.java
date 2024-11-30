package src.pieces;

import src.chess_board.BoardSquare;

import java.awt.*;

public abstract class Piece
{
    protected boolean isWhite;
    Image img;
    BoardSquare square;

    public abstract void showPotentialMovement();
}
