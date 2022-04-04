package file_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyFileWriter {
    /**
     *
     * @param fileName to write to
     * @param lineSums to write
     * @param append to end of file
     */
    public static void writeFileLineSums(String fileName, ArrayList<Double> lineSums, boolean append){
        File file = new File(fileName);
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            printWriter = new PrintWriter(fileWriter);

            for(double line : lineSums){
                printWriter.println(line);
            }
            printWriter.flush(); // flush the memory
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                fileWriter.close();
                printWriter.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
