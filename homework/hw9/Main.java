public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(-2, 1, 1);
        Line line2 = new Line(-0.75, 1, 7);
        Line line3 = new Line(-0.75, 1, 1);
        Line line4 = new Line(2, 1, 5);
        Line line5 = new Line(-0.5, 1, 6);
        
        Point point1 = new Point(1, 3);
        Point point2 = new Point(1, 2);
        
        //contains
        System.out.println(line1.contains(point1));
        // doesn't contain
        System.out.println(line1.contains(point2));

        // parallel
        System.out.println(line2.isParallelWith(line3));
        // not parallel
        System.out.println(line1.isParallelWith(line3));


        // orthogonal
        System.out.println(line4.isOrthogonalTo(line5));
        // not orthogonal
        System.out.println(line4.isOrthogonalTo(line1));

        Segment segment1 = new Segment(1, 2, 3, 1);
        System.out.println(segment1.line());
    }
}
