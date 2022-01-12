public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15)); // 5
        System.out.println(getGreatestCommonDivisor(12, 30)); // 6
        System.out.println(getGreatestCommonDivisor(9, 18)); // -1
        System.out.println(getGreatestCommonDivisor(81, 153)); // 9
    }

    public static int getGreatestCommonDivisor(int num1, int num2){
        if(num1 < 10 || num2 < 10){
            return -1;
        }
        else{
            int smaller = num1 < num2 ? num1 : num2;
            int larger = num1 > num2 ? num1 : num2;
            for(int i = smaller; i > 0; i--) {
                if (smaller % i == 0 && larger % i == 0){
                    return i;
                }
            }
        }
        return 1;
    }
}
