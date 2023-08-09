package circle;
import circle.utils.Point;

class Main {
    public static void main() {
        Circle circ = new Circle();
        circ.x = 2;
        circ.y = 3;
        circ.radius = 4;
        
        Point cent = new Point();
        cent = circ.getCenter();
        System.out.println("The center of the circle is (" + cent.x + ", " + cent.y + ")");
    }
}
