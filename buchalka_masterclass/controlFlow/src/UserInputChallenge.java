import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        sum10UserNumbers();
    }

    public static void sum10UserNumbers(){
        Scanner scanner = new Scanner(System.in);
        int inputCounter = 0;
        int sum = 0;

        while(inputCounter < 10){
            System.out.println("Enter number #" + (inputCounter+1));
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int userNum = scanner.nextInt();
                scanner.nextLine();
                sum += userNum;
                System.out.println("Currently the sum is: " + sum);
                inputCounter++;
            }
            else{
                System.out.println("Invalid Number");
                scanner.nextLine();
            }
        }
        scanner.close();
        System.out.println("The numbers you've entered sum up to: " + sum);
    }
}
