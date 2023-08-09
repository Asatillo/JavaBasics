class ColoredCircle extends Circle{
    Color color;

    public ColoredCircle(double x, double y, double radius, Color color){
        super(x, y, radius);
        this.color = color;
    }

    public ColoredCircle(Point point, double radius, Color color){
        super(point.getX(), point.getY(), radius);
        this.color = color;
    }

    public ColoredCircle(ColoredPoint point, double radius){
        super(point.getX(), point.getY(), radius);
        this.color = point.color;
    }

    @Override
    public String toString(){
        return super.toString() + "[" + color + "]";
    }
}