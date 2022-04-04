package file_io;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * controller class
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "src/file_io/text.txt";
        try {
            System.out.println("Total sum: " + MyFileReader.readFileGetTotalSum(fileName));
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot read the file");
            e.printStackTrace();
        }
        finally {
            System.out.println("Execution finished");
        }


        ArrayList<Double> lineSums = MyFileReader.readFileGetLineSums(fileName);
        System.out.println(lineSums);
        double sum = 0;
        for(double d : lineSums){
            sum += d;
        }
        System.out.println("Sum oof lines: " + sum);
    }


}
