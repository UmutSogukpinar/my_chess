package src.pieces;

import java.awt.*;

import src.basic_features.Position;
import src.basic_features.Size;
import src.chess_board.BoardSquare;

import static src.chess_board.BoardSquare.SQUARE_SIDE;

public abstract class Piece
{
    protected boolean isWhite;
    Image img;
    Position position;
    static final Size size = new Size((4 * SQUARE_SIDE) / 5, (5 * SQUARE_SIDE) / 6);
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
        double squareCenterX = square.getPosition().getX_axis() + (square.getSize().getX_axis() / 2);
        double squareCenterY = square.getPosition().getY_axis() + (square.getSize().getY_axis() / 2);

        double piecePositionX = squareCenterX - (size.getX_axis() / 2);
        double piecePositionY = squareCenterY - (size.getY_axis() / 2);

        return (new Position(piecePositionX, piecePositionY));
    }

}
