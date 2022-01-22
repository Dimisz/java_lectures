import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Specify length of the array: ");
        int howMany = scanner.nextInt();
        int[] arr = readIntegers(howMany);
        System.out.println(Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println("The smallest number is: " + min);
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static int[] readIntegers(int howMany){
        //Scanner scanner = new Scanner(System.in);
        int[] array = new int[howMany];
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter integer #" + (i + 1) + ": ");
            int num = scanner.nextInt();
            array[i] = num;
        }
        return array;
    }
}
