import java.io.*;
public class ReadingCSV {

        private String file;
        private int[] data;

        public ReadingCSV(String f) {
            file = f;
            data = getData();
        }

        private int[] getData() {
            int[] intTokens = new int[0];
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();
                String[] stringTokens = line.split("\t");
                intTokens = convertToInts(stringTokens);
                reader.close();
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                System.out.println("Finished reading a file.");
                return intTokens;
            }
        }

        private int[] convertToInts(String[] strings) {
            int size = strings.length;
            int[] ints = new int[size];
            for (int i = 0; i < size; i++) {
                ints[i] = Integer.parseInt(strings[i]);
            }
            return ints;
        }

        public void summary() {
            printCount();
        }

        private void printCount() {
            System.out.println("There are " + data.length + " numbers.");
        }

        public static void main(String[] args) {

            //add code below this line
            //add code below this line

            String path = "/Users/mbpro/Amazon-fulfilled+Inventory+Report+12-30-2021.csv ";
            ReadingCSV myNumbers = new ReadingCSV(path);
            myNumbers.summary();

            //add code above this line


            //add code above this line
        }
    }

