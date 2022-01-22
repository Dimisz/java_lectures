import java.util.Arrays;

public class ReferenceTypesVsValuesTypes {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("================");
        System.out.println("After change");
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{1,2,3,5,6};
        modifyArray(myIntArray);
        System.out.println("================");
        System.out.println("After change");
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }
}
