public class Line{
    double a, b, c;

    public Line(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public boolean contains(Point p){
        return this.a*p.x + this.b*p.y == c;
    }

    public boolean isParallelWith(Line l){
        return (-(this.a)/this.b == -(l.a)/l.b);
    }

    public boolean isOrthogonalTo(Line l){
        return (((this.a)/this.b)*(l.a/l.b) == -1);
    }

    @Override
    public String toString() {
        return "a" + this.a + " + b" + this.b + " = " + c;
    }
}