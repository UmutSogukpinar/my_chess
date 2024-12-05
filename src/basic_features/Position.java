package src.basic_features;

public class Position
{
     double x_axis;
     double y_axis;

    public Position(double x_axis, double y_axis)
    {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
    }

    public double getX_axis() {
        return x_axis;
    }

    public double getY_axis() {
        return y_axis;
    }
}
