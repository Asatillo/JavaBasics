class Point {
    protected int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

interface Reversable {
    void reverse();
}

class ReversablePoint extends Point implements Reversable {
    private int prev_x, prev_y;

    public ReversablePoint(int x, int y) {
        super(x,y);
        prev_x = x;
        prev_y = y;
    }

    @Override
    public void setX(int x) {
        prev_x = this.x;
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        prev_y = this.y;
        super.setY(y);
    }

    public void reverse() {
        x = prev_x;
        y = prev_y;
    }
}

interface Printable {
    void print();
}

class PrintablePoint extends Point implements Printable {

    public PrintablePoint(int x, int y) {
        super(x,y);
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class Book implements Printable {
    private String author, title;
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void print() {
        System.out.println(author + ": " + title);
    }
}

class PrintableAndReversablePoint extends Point implements Printable, Reversable {
    private int prev_x, prev_y;

    public PrintableAndReversablePoint(int x, int y) {
        super(x,y);
        prev_x = x;
        prev_y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

     @Override
    public void setX(int x)
    {
        prev_x = this.x;
        super.setX(x);
    }

    @Override
    public void setY(int y)
    {
        prev_y = this.y;
        super.setY(y);
    }

    public void reverse() {
        x = prev_x;
        y = prev_y;
    }
}

class Main2 {
    public static void foo(Printable obj) {
        obj.print();
    }

    public static void main(String[] args) {
        ReversablePoint p1 = new ReversablePoint(2,3);
        System.out.println("x = " + p1.getX()); //2
        p1.setX(-90);
        System.out.println("x = " + p1.getX()); //-90
        p1.reverse();
        System.out.println("x = " + p1.getX()); //2

        System.out.println();

        PrintableAndReversablePoint p2 = new PrintableAndReversablePoint(10, 20);
        p2.print(); //10,20
        p2.setX(4);
        p2.print();
        p2.setX(5);
        p2.setY(5);
        p2.print();
        p2.reverse();
        p2.print();

        foo(new Book("author", "title"));
        foo(new PrintablePoint(3,3));
        foo(p2);

    }
}

