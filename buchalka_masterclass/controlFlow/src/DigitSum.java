public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(11111));
        System.out.println(sumDigits(32123));
    }
    public static int sumDigits(int num){
        if(num < 10){
            return -1;
        }
        int n = num;
        int sum = 0;
        while(n >= 10){
            sum += n % 10;
            n /= 10;
        }
        sum += n;
        return sum;
    }
}
