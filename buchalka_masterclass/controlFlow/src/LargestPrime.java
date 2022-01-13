public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(217)); //31
        System.out.println(getLargestPrime(0)); // -1
        System.out.println(getLargestPrime(45)); // 5
        System.out.println(getLargestPrime(-1)); // -1
        System.out.println(getLargestPrime(7)); // 7
    }

    public static int getLargestPrime(int number){
        int prime = -1;
        if(number <= 1){
            return -1;
        }
        else{
            // find divisor
            for(int i = 2; i <= number; i++){
                if(number % i == 0) {
                    // check if divisor is prime
                    int count = 0;
                    for(int j = 2; j < i; j++){
                        if(i % j == 0){ //not prime
                            count++;
                            break;
                        }
                    }
                    if(count == 0) prime = i;
                }

            }
        }
        return prime;
    }
}
