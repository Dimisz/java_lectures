package Lesson8;

public class HW1 {

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static void divide(int num1, int num2){
        System.out.println(num1 + " divided by " + num2 + " equals " + (double)num1/num2);
    }
}

class HW1Test {
    public static void main(String[] args) {
        HW1.divide(10, 2);
        System.out.println(HW1.multiply(5, 10));
    }
}
