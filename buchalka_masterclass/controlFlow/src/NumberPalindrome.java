public class NumberPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int num){
        if(num >= -9 && num <= 9){
            return true;
        }
        else{
            int user_num = num;
            int reverse_num = 0;
            while(num >= 10 || num <= -10){
//                System.out.println("num: " + num);
                int last_digit = num%10;
                reverse_num += last_digit;
                reverse_num *= 10;
                num /= 10;

//                System.out.println("last digit: " + last_digit);
//                System.out.println("reverse num: " + reverse_num);

            }
            reverse_num += num;
            //System.out.println(reverse_num);
            return (user_num == reverse_num);
        }
    }

}
