import java.util.Scanner;

public class SortingArraysChallenge {

    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        int[] sortedArray = sortArray(myArray);

        for(int i = 0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i] + " ");
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

    public static int[] sortArray(int[] arr){
        int arraySize = arr.length;
        int[] resultArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            int max = findMax(arr);
            resultArray[i] = max;
        }
        return resultArray;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        int indexOfMax = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                indexOfMax = i;
            }
        }
        arr[indexOfMax] = 0;
        return max;
    }

}
