package stack;

public class StackExample {
    static void firstMethod(){
        System.out.println("First method started...");
        System.out.println("First method finished");
    }

    static void secondMethod(){
        System.out.println("Second method started...");
        firstMethod();
        System.out.println("Second method finished");
    }

    static void thirdMethod(){
        System.out.println("Third method started");
        secondMethod();
        System.out.println("Third method finished");
    }


    public static void main(String[] args) {
        System.out.println("Main started...");
        thirdMethod();
        System.out.println("Main finished");
    }
}
