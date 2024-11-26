package src.pieces;

import src.pieces.piece_movements.Position;

import java.awt.*;

public abstract class Piece
{
    protected boolean isWhite;
    protected Image img;
    protected Position position;

    public abstract void potentialMovements();

}
