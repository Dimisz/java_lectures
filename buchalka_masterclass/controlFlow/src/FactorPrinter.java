public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6); // 1 2 3 6
        System.out.println("======Test 2======");
        printFactors(32); //1 2 4 8 16 32
        System.out.println("======Test 3======");
        printFactors(10); // 1 2 5 10
        System.out.println("======Test 4======");
        printFactors(-1); // Invalid Value
    }

    public static void printFactors(int num){
        if (num < 1){
            System.out.println("Invalid Value");
        }
        else{
            for (int i = 1; i <= num; i++){
                if(num%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
