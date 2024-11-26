package src.pieces;

import src.pieces.piece_movements.Position;

import java.awt.*;

public abstract class Piece
{
    protected boolean isWhite;
    Image img;
    Position position;

    public abstract void movement();

}
