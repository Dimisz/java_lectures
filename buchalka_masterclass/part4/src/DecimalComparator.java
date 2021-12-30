public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println("true: " + areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println("false: " + areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("true: " + areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("false: " + areEqualByThreeDecimalPlaces(-3.123, 3.123));


    }

//    public static double makeThreeDecimal(double num){
//        int tempNum = (int)(num * 1000);
//        return ((double)tempNum/1000.0);
//    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double num1Shaped = ((double)((int)(num1*1000))/1000.0);
        double num2Shaped = ((double)((int)(num2*1000))/1000.0);
        return num1Shaped == num2Shaped;
    }
}
