package circle;
import circle.utils.Point;

public class Circle {
    double radius, x, y;

    public Point getCenter() {
        Point center = new Point();
        center.setX(x);
        center.y = y; //
        return center;
    }
}
