import utils.Colors;

public class Car {
    private String licencePlate;
    private Colors color;
    private int maxSpeed;
    private int cnt = 0;

    public Car(String licencePlate, Colors color, int maxSpeed){
        this.licencePlate = licencePlate;
        this.color = color;
        this.maxSpeed = maxSpeed;
        cnt++;
    }

    public Car(){
        licencePlate = "AAA-000";
        color = Colors.BLUE;
        maxSpeed = 120;
        cnt++;
    }

    public boolean compareTo(Car car2){
        return this.maxSpeed>car2.maxSpeed;
    }

    static boolean compare(Car car1, Car car2){
        return car1.compareTo(car2);
    }

    @Override
    public String toString(){
        return color.toString() + " " + licencePlate + " with speed " + maxSpeed;
    }
}
