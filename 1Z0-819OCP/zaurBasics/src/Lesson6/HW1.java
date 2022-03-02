package Lesson6;

public class HW1 {
    int sum(){
        return 0;
    }

    int sum(int num1){
        return num1;
    }

    int sum(int num1, int num2){
        return num1 + num2;
    }

    int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    int sum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
}

class HW1Test{
    public static void main(String[] args) {
        HW1 hw1 = new HW1();
        System.out.println("Testing sum 0: " + hw1.sum());
        System.out.println("Testing sum 1: " + hw1.sum(1));
        System.out.println("Testing sum 2: " + hw1.sum(1, 2));
        System.out.println("Testing sum 3: " + hw1.sum(1, 2, 3));
        System.out.println("Testing sum 4: " + hw1.sum(1, 2, 3, 4));




    }
}
