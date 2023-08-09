

public class Point
{
    private double x, y;

    public Point(double init_x, double init_y)
    {
        x = init_x;
        y = init_y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString(){
        return "(x: " + x + ", y: " + y + ")";
    }
}

