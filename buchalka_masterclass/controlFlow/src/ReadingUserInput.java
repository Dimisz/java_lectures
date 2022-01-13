import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();// check if user enters int
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt(); // interprets this Enter as input
            scanner.nextLine(); // consume nextline character
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
//        System.out.println("Enter your year of birth: ");
//        int yearOfBirth = scanner.nextInt();
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is: " + name);
                System.out.println("You were born in " + yearOfBirth);
                System.out.println("You should be around " + age + " years old");
            }
            else {
                System.out.println("Invalid year of birth");
            }
        }

        else { //year is not an int
            System.out.println("Year should be an int");
        }


        scanner.close();
    }
}
