public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println("hasTeen: ");
        System.out.println("true: " + hasTeen(9, 99, 19));
        System.out.println("true: " + hasTeen(23, 15, 42));
        System.out.println("false: " + hasTeen(22, 23, 34));

        System.out.println("isTeen:");
        System.out.println("false: " + isTeen(9));
        System.out.println("true: " + isTeen(13));
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static boolean isTeen(int num){
        return (num >= 13 && num <= 19);
    }
}
