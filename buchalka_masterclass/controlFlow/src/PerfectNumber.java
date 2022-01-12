public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));//true
        System.out.println(isPerfectNumber(28));//true
        System.out.println(isPerfectNumber(5));//false
        System.out.println(isPerfectNumber(-1));//false
    }


    public static boolean isPerfectNumber(int num){
        if (num < 1){
            return false;
        }
        int sumOfDivisors = 0;
        for (int i = 1; i < num; i++){
            if(num % i == 0){
                sumOfDivisors += i;
            }
        }
        return (sumOfDivisors == num);
    }
}
