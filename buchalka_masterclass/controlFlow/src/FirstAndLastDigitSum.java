public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));//4
        System.out.println(sumFirstAndLastDigit(257));//9
        System.out.println(sumFirstAndLastDigit(0));//0
        System.out.println(sumFirstAndLastDigit(5));//10
        System.out.println(sumFirstAndLastDigit(-10));//-1
    }
    public static int sumFirstAndLastDigit(int number){
        int res = 0;
        if (number < 0){
            return -1;
        }
        else{
            res += number%10;
            while(number > 9){
                number /= 10;
            }
            res += number;
            return res;
        }
    }
}
