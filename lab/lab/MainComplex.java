class MainComplex {
    public static void main(String[] args) {
        Complex num1 = new Complex();
        num1.re = 3;
        num1.im = -2;
        Complex num2 = new Complex();
        num2.re = 1;
        num2.im = 4;

        System.out.println("abs(3 - 2i) = " + num1.abs());

        num1.add(num2);
        
        Complex num3 = new Complex();
        num3.re = 3;
        num3.im = 1;
        
        num1.add(num3);
        System.out.println("num3 added to num1 is " + num1.re + " " + num1.im);

        num2.sub(num1);
        System.out.println("The addition of num1 with num2 = " +num1.add(num3)); //like thisre + " " + num.im);
    }
}