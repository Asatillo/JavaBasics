// Create a separate test class for the three operations. Make sure that each test class tests only the corresponding logic (method).

// Make sure that exceptions are only handled in those test cases which were prepared for this case. In any other cases, ensure that successfuly opened files are properly closed (hint (Links to an external site.)).

// Try to test as many possibilities as you can, and pay attention to corner cases (empty file, empty line, line containing one item etc.).

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

class MainTask2 {
    static ArrayList<String> read(File input){
        ArrayList<String> lines = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(input));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (FileNotFoundException e)  {
            System.out.println("Unable to access file");
        } catch (IOException e) {
            System.out.println(" IO Exception!");
        } 
        System.out.println(lines);
        return lines;
    }

    static ArrayList<Integer> add(ArrayList<String> lines){
        ArrayList<Integer> sums = new ArrayList<>();
        for(String line: lines){
            String[] nums = line.split(",");
            int sum = 0;
            for(String num: nums){
                sum += Integer.parseInt(num);
            }
            sums.add(sum);
        }
        return sums;
    }

    static void write(File output, ArrayList<Integer> sums){
        try{
            PrintWriter pw = new PrintWriter(output);
            for(Integer sum: sums){
                pw.println(sum);
            }

            pw.close();
        } catch (FileNotFoundException e)  {
            System.out.println("Unable to access file:");
        }
    }
    public static void main(String[] args) {
        File input = new File(args[0]);
        File output = new File(args[1]);

        ArrayList<String> lines = read(input);
        ArrayList<Integer> sums = add(lines);
        write(output, sums);  
   }
}