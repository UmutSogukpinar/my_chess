package src.chess_board;

import src.basic_features.Position;
import src.basic_features.Size;

import static src.chess_board.ChessBoard.APP_SIDE;

public class BoardSquare
{
    Position position;
    ChessboardAxes axes;
    Size size;
    boolean isTherePiece;

    public static double SQUARE_SIDE = APP_SIDE / 8;

    public BoardSquare(Position position, ChessboardAxes axes)
    {
        this.position = position;
        this.axes = axes;
        size = new Size(SQUARE_SIDE, SQUARE_SIDE);
        isTherePiece = false;
    }

    public Position getPosition() {
        return position;
    }

    public Size getSize() {
        return size;
    }

    public void setTherePiece(boolean therePiece) {
        isTherePiece = therePiece;
    }

    public ChessboardAxes getAxes() {
        return axes;
    }

    public boolean isTherePiece() {
        return isTherePiece;
    }

    public void  displaySquareFeatures()
    {
        System.out.printf("Coordinates are %.2f %.2f\n", position.getX_axis(), position.getY_axis());
        System.out.printf("Sizes are %.2f %.2f\n", size.getX_axis(), size.getY_axis());
        System.out.printf("Is there any piece on the square: %b\n", isTherePiece);
        System.out.printf("Board axis is %c%d\n\n", axes.getX_axis(), axes.getY_axis());
    }
}
