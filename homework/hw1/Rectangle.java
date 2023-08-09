class Rectangle{
    double x, y, width, height;

    Point topLeft(){
        Point p = new Point();
        p.x = Double.min(x, x+width);
        p.y = Double.max(y, y+height);
        return p;
    }

    Point topRight(){
        Point p = new Point();
        p.x = Double.max(x, x+width);
        p.y = Double.max(y, y+height);
        return p;
    }

    Point bottomLeft(){
        Point p = new Point();
        p.x = Double.min(x, x+width);
        p.y = Double.min(y, y+height);
        return p;
    }

    void print(){
        System.out.println("The rectangle: " + x + " " + y + " " + width + " " + height);
    }
}