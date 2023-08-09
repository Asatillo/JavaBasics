enum Color{
    Red,
    Blue,
    Green;
}

class ColoredPoint extends Point {

    public Color color;

    public ColoredPoint(double init_x, double init_y, Color color){
        super(init_x, init_y);
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() + " [" + color + "]";
    }
}
