package file_io;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * utility class for reading particular types of files
 */
public class MyFileReader {
    /**
     *
     * calculates total sum of all nums in a file
     * @param fileName to read
     * @return 0.0 if there no numerical values found, or there's an exception
     */
    public static double readFileGetTotalSum(String fileName) throws FileNotFoundException {
        double sum = 0.0; // default value to return
        File file = new File(fileName);

        Scanner scanner = new Scanner(file).useLocale(Locale.US);
        while(scanner.hasNext()){
            if(scanner.hasNextDouble()) { // if next token is a double
                double numDouble = scanner.nextDouble();

                sum += numDouble;
                //System.out.println("Adding: " + numDouble + " Sum: " + sum);
            }
            else{
                System.out.println("Not a double: " + scanner.next()); // skip if not double
            }
        }
        scanner.close();
        return sum;
    }

    public static ArrayList<Double> readFileGetLineSums(String fileName) {
        ArrayList<Double> lineSums = new ArrayList<Double>();

        File file = new File(fileName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null){
                String[] numStringArray = line.trim().split("\\s+");
                double sum = 0.0;
                for(int i = 0; i < numStringArray.length; i++){
                    String numString = numStringArray[i];
                    try {
                        double numDouble = Double.parseDouble(numString);
                        sum += numDouble;
                    }
                    catch(NumberFormatException e){

                    }
                }
                lineSums.add(sum);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Sorry, " + file.getName() + " not found.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                fileReader.close();
                bufferedReader.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return lineSums;
    }
}
