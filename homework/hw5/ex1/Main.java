import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            throw new IllegalArgumentException("Specify number of characters to be skipped!");
        }
        int skipLines = 0;
        try{
            skipLines = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Specify the number!");
        }
        try{
            Scanner ns = new Scanner(System.in);
            System.out.println("Enter number of characters to read: ");
            int toRead = ns.nextInt();
            try{
                File file = new File("in.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                int cnt = 0;
                while(br.ready()){
                    System.out.println((char)br.read());
                    cnt++;
                    if(cnt == toRead){
                        br.skip(skipLines);
                        cnt = 0;
                    }
                }
    
                br.close();
            }catch(IOException e){
                System.out.println("File not found!");
            }
        }
    catch(InputMismatchException e){
        System.out.println("Specify an integer");
    }
    catch(NoSuchElementException e){
        System.out.println("Specify an integer");
    }

    }
}