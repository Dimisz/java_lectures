public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));//20
        System.out.println(getEvenDigitSum(getEvenDigitSum(252)));//4
        System.out.println(getEvenDigitSum(-22));//-1
    }


    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        else {
            int sum = 0;
            int temp = 0;
            while (number > 0){

                temp = number%10;
                sum += (temp % 2 == 0) ? temp : 0;
//                if (temp % 2 == 0){
//                    sum += temp;
//                }
                number /= 10;
            }
            return sum;
        }
    }
}
