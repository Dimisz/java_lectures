public class ForLoop {

    public static void main(String[] args) {
//        for (int i = 9; i > 2; i--){
//            System.out.print("10,000 at " + i + "% interest ");
//            System.out.println("= " + String.format("%.2f", calculateInterest(10000, i)));
//        }

        int primeCount = 0;
        for(int i = 1; i < 100; i++){
            if(isPrime(i)){
                System.out.println(i + " is a prime number.");
                primeCount++;
                if(primeCount >= 3){
                    System.out.println("Three primes found.");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
