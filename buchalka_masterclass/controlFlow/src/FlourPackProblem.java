public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0,5, 4)); // true
        System.out.println(canPack(2, 2, 11)); //true
        System.out.println(canPack(-3, 2, 12));// false
    }


    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if (goal <= ((bigCount * 5) + (smallCount))){
            if ((goal - (bigCount * 5)) >= 0 && (goal - (bigCount * 5)) <= smallCount){
                return true;
            }
            else {
                for(int i = 0; i <= bigCount; i++){
                    if ((goal - (i * 5)) >= 0 && (goal - (i * 5)) <= smallCount){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
