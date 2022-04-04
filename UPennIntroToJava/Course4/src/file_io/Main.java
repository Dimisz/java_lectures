package file_io;

import java.io.FileNotFoundException;

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
    }
}
