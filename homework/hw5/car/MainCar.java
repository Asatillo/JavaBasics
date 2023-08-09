import java.io.*;
import utils.Colors;

public class MainCar {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            Car cars[] = new Car[3]; 
            int cnt = 0;
            while((line = br.readLine()) != null){
                String[] parts = line.split(",");
                cars[cnt] = new Car(parts[0], Colors.valueOf((parts[1].trim())), Integer.parseInt(parts[2].trim()));
                System.out.println(cars[cnt]);
                cnt++;
            }
            br.close(); 
        }
        catch(IOException e){
                System.out.println("Unable to access file!");
        }
    }
}

