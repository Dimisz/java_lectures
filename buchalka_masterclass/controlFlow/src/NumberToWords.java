/*
Takes one param of int type
Prints out the passed number using words
e.g.
 */
public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(777);
//        numberToWords(123);
//        System.out.println("============");
//        numberToWords(1010);
//        System.out.println("============");
//        numberToWords(1000);
//        System.out.println("============");
//        numberToWords(-12);

//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));


//        System.out.println(getDigitCount(0)); // 1
//        System.out.println(getDigitCount(123)); // 3
//        System.out.println(getDigitCount(-12)); // -1
//        System.out.println(getDigitCount(5200)); // 4

    }

    public static void numberToWords(int number){
        int originalDigits = getDigitCount(number);
        number = reverse(number);
        int reversedDigits = getDigitCount(number);

        if (number < 0){
            System.out.println("Invalid Value");
        }
        else if(number == 0){
            System.out.println("Zero");
        }
        else{
            while(number > 0){
               int digit = number % 10;
               number /= 10;
               String digitAsString = "";
               switch(digit){
                   case 0:
                       digitAsString = "Zero";
                       break;
                   case 1:
                       digitAsString = "One";
                       break;
                   case 2:
                       digitAsString = "Two";
                       break;
                   case 3:
                       digitAsString = "Three";
                       break;
                   case 4:
                       digitAsString = "Four";
                       break;
                   case 5:
                       digitAsString = "Five";
                       break;
                   case 6:
                       digitAsString = "Six";
                       break;
                   case 7:
                       digitAsString = "Seven";
                       break;
                   case 8:
                       digitAsString = "Eight";
                       break;
                   case 9:
                       digitAsString = "Nine";
                       break;
                   default:
                       digitAsString = "-";
                       break;
               }
                System.out.println(digitAsString);
            }
            for(int i = 0; i < (originalDigits - reversedDigits); i++){
                System.out.println("Zero");
            }
        }
    }


    public static int reverse(int number){
        int result = 0;
        while(number != 0){
            result *= 10;
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        else if(number == 0){
            return 1;
        }
        else {
            int count = 0;
            while(number > 0){
                count++;
                number /= 10;
            }
            return count;
        }
    }
}
