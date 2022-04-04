package file_io;

import java.io.File;
import java.io.FileNotFoundException;
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
}
