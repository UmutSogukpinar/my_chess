package src.pieces;

import src.chess_board.BoardSquare;

import java.awt.*;

public class Pawn extends Piece
{
    Image whitePawnImg;
    Image blackPawnImg;

    public Pawn(boolean isWhite, BoardSquare square)
    {
        this.isWhite = isWhite;
        this.square = square;
        img = isWhite ? whitePawnImg : blackPawnImg;
    }

    @Override
    public void showPotentialMovement()
    {

    }
}
