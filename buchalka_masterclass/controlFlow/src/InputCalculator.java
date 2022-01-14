import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if(!hasNextInt){
                break;
            }

            int userNum = scanner.nextInt();
            scanner.nextLine();
            sum += userNum;
            count++;
        }
        scanner.close();
        long avg = (count == 0) ? 0 : Math.round((double)sum/count);

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
