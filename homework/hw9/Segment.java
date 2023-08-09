// Create a method line() which returns a Line object representing the line that covers the segment.

public class Segment{
    double x1, x2, y1, y2;

    public Segment(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line line(){
        Line line = new Line(); 
        line.a = this.y1 - this.y2;
        line.b = this.x2 - this.x1;
        line.c = (line.a)*this.x1*(-1) - line.b*this.y1;
        return line;
    }

    public boolean contains(Point p){
        return this.line().contains(p);
    }

    public static int orientationAux(double x1, double y1, double x2, double y2, double x3, double y3){
        //  0  point is colinear
        //  1  orientation is clockwise
        // -1  orientation is counter-clockwise.
        double alfa = (y2-y1)/(x2-x1);
        double beta = (y3-y2)/(x3-x2);
        if (alfa>beta){
            return 1;
        } else if (alfa<beta){
            return -1;
        } else {
            return 0;
        }
    }

    public int oreintation(Point p){
        return orientationAux(x1, y1, x2, y2, p.x, p.y);
    }

    public boolean intersects(Segment s){
        // (p1,q1,p2) and (p1,q1,q2) have different orientations &&
        // (p2,q2,p1) and (p2,q2,q1) have different orientations
        int or1 = orientationAux(this.x1, this.y1, this.x2, this.y2, s.x2, s.y2);
        int or2 = orientationAux(this.x1, this.y1, this.x2, this.y2, s.x1, s.y1);
        int or3 = orientationAux(s.x1, s.y1, s.x2, s.y2, this.x1, this.y1);
        int or4 = orientationAux(s.x1, s.y1, s.x2, s.y2, this.x2, this.y2);
        return (or1 != or2 && or3 != or4);
    }
    
}
