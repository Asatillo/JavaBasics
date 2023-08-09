package polyhedra;

public abstract class Prism{
    double height;

    abstract double baseArea();
    abstract double volume();
}

class Cylinder extends Prism{
    

    public Cylinder(double height, double r){
        height = super(height);
    }
    public double baseArea(){
        return height*height;
    }

    public int volume(double r){
        return this.baseArea()*3.14*r;
    }

}