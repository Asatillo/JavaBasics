class MainTask2 {
    public static void main(String[] args) {
        System.out.println("Enter number of Points: ");
        int num = Integer.parseInt(System.console().readLine());
        Point[] arr= new Point[num];

        for (int i=0;i<num;++i) {
            System.out.println("Enter x value: ");
            double x = Double.parseDouble(System.console().readLine());
            System.out.println("Enter y value: ");
            double y = Double.parseDouble(System.console().readLine());

            arr[i] = new Point(x,y);
            System.out.println(arr[i]);
        }
       

        Point center = Point.centerOfMass(arr);
        System.out.println("the center of the mass is: "+center);
    }
}