public class Main {
    public static void main(String[] args){
        Guest adult = new Adult("Asatillo", 15);
        Guest minor = new Minor("Can", 18);


        Beverage milk = new Beverage("milk", 0);
        Beverage wine = new Beverage("wine", 18); 
        
        Barista tsetsen = new Barista();
        tsetsen.order(milk, adult);
        tsetsen.order(milk, minor);
        tsetsen.order(wine, adult);
        tsetsen.order(wine, minor);
    }
}
