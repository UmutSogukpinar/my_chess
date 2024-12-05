package src.chess_board;

public class ChessboardAxes
{
    private final char x_axis;
    private final int y_axis;

    public ChessboardAxes(char x_axis, int y_axis)
    {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
    }

    public char getX_axis() {
        return x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }
}
