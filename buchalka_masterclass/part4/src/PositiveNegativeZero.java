import java.sql.SQLOutput;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(-1);
        checkNumber(1);
    }

    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("Positive");
        }
        else if(number < 0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
