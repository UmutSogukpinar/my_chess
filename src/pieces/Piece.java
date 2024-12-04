package src.pieces;

import java.awt.*;

import src.basic_features.Position;
import src.basic_features.Size;
import src.chess_board.BoardSquare;

import static src.chess_board.BoardSquare.squareSide;

public abstract class Piece
{
    protected boolean isWhite;
    Image img;
    Position position;
    static final Size size = new Size((4 * squareSide) / 5, (5 * squareSide) / 6);
    BoardSquare square;

    public Piece(boolean isWhite, BoardSquare square)
    {
        this.isWhite = isWhite;
        this.square = square;
        this.position = centerThePieceBySquare();
        square.setTherePiece(true);
    }

    // abstract methods
    public abstract void showPotentialMovement();
    public abstract Image getPieceImg(boolean isWhite);

    // non-abstract methods
    public Position centerThePieceBySquare()
    {
        int squareCenterX = square.getPosition().getX_axis() + (square.getSize().getX_axis() / 2);
        int squareCenterY = square.getPosition().getY_axis() + (square.getSize().getY_axis() / 2);

        int piecePositionX = squareCenterX - (size.getX_axis() / 2);
        int piecePositionY = squareCenterY - (size.getY_axis() / 2);

        return (new Position(piecePositionX, piecePositionY));
    }

}
