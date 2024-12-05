package src.pieces;

import src.chess_board.BoardSquare;
import src.chess_board.ChessBoard;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Pawn extends Piece
{
    public Pawn(boolean isWhite, BoardSquare square)
    {
        super(isWhite, square);
        img = getPieceImg(isWhite);
    }

    @Override
    public Image getPieceImg(boolean isWhite)
    {
        URL pawnResource = isWhite ? ChessBoard.class.getResource("../images/pieces/white/pawn.png")
                : ChessBoard.class.getResource("../images/pieces/black/pawn.png");
        if (pawnResource == null)
           throw new RuntimeException(isWhite ? "Image cannot be found ../images/pieces/white/pawn.png"
                   : "Image cannot be found ../images/pieces/black/pawn.png");

        return (new ImageIcon(pawnResource).getImage());
    }

    @Override
    public void showPotentialMovement() {}

    public void drawPiece(Graphics graphics)
    {
        graphics.drawImage(img, (int) position.getX_axis(), (int) position.getY_axis(),
                (int) size.getX_axis(), (int) size.getY_axis(), null);
    }
}
