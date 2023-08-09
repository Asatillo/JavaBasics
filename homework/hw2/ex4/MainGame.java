import game.Player;
import game.utils.Vehicle;

class MainGame{
    public static void main(String args[]) {
        Vehicle car1 = new Vehicle(1, "ABC123", 8, 20);
        Vehicle car2 = new Vehicle(2, "DEF456", 5, 15);
        Vehicle car3 = new Vehicle(3, "GHI789", 2, 2);
        Player player = new Player("Player1", "192.168.0.1", 100, car2);
        Player player2 = new Player("Player2", "127.0.0.1", 98, null);
        System.out.println(player);
        System.out.println(player2);
    }
}