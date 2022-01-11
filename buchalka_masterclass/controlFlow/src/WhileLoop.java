import java.sql.SQLOutput;

public class WhileLoop {
    public static void main(String[] args) {
//        int count = 0;
//        while(count < 5) {
//            System.out.println("Count: " + count);
//            count++;
//        }
//        System.out.println(isEvenNumber(2));
//        System.out.println(isEvenNumber(7));
        findFiveEvens(3, 30);
        findFiveEvens(4, 3);
        findFiveEvens(1, 5);
        findFiveEvens(0, 0);
        findFiveEvens(10, 30);
    }

    public static boolean isEvenNumber(int num){
        return (num % 2 == 0);
    }

    public static void findFiveEvens(int start, int finish){
        int count = 0;
        if(start < finish){
            int i = start;
            while(i <= finish){
                if(isEvenNumber(i)){
                    System.out.println(i + " is even...");
                    count++;
                }
                if(count == 5) {
                    System.out.println("5 evens found...");
                    break;
                }
                i++;
            }
        }
        else {
            System.out.println("Start value should be less than finish.");
        }

    }
}
