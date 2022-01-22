import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayTeacherTake {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInts = getIntegers(5);
        System.out.println("Initial array: ");
        printArray(myInts);
        System.out.println("\nArray sorted: ");
        int[] sortedArray = sortIntegers(myInts);
        printArray(sortedArray);
    }

    public static int[] sortIntegers(int[] array){
//       int[] sortedArray = new int[array.length];
//       for(int i = 0; i < array.length; i++){
//           sortedArray[i] = array[i];
//     }
       int[] sortedArray = Arrays.copyOf(array, array.length);
       boolean flag = true;
       int temp;
       while(flag){
           flag = false;
           for(int i = 0; i < sortedArray.length-1; i++){
               if(sortedArray[i] < sortedArray[i+1]){
                  temp = sortedArray[i];
                  sortedArray[i] = sortedArray[i+1];
                  sortedArray[i+1] = temp;
                  flag = true;
               }
           }
       }
       return sortedArray;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

}
