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
<<<<<<< HEAD
    public void showPotentialMovement()
=======
    public void potentialMovements()
>>>>>>> c321fc0d9d19b2ffa4a04c3277e5b49fc5d56a79
    {

    }
}
