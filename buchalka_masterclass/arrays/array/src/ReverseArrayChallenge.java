import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("Initial array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("After calling the function: " + Arrays.toString(array));
    }

    private static void reverse(int[] array){
        int size = array.length / 2;
        int temp;
        for(int i = 0; i < size; i++){
            temp = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = array[i];
            array[i] = temp;
        }
    }

    private static void teachersReverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

}
