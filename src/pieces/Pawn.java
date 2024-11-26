package src.pieces;

import src.pieces.piece_movements.Position;

import java.awt.*;

public class Pawn extends Piece
{
    Image whitePawnImg;
    Image blackPawnImg;

    public Pawn(boolean isWhite, Position position)
    {
        this.isWhite = isWhite;
        this.position = position;
        img = isWhite ? whitePawnImg : blackPawnImg;
    }

    @Override
    public void potentialMovements()
    {

    }
}
