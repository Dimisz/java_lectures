import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int counter = 0;

        while (true) {
            System.out.println("Enter a number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                break;
            }
            int userNum = scanner.nextInt();
            scanner.nextLine();


                if (userNum < min) {
                    min = userNum;
                }
                if (userNum > max) {
                    max = userNum;
                }


        }
        scanner.close();
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }
}
