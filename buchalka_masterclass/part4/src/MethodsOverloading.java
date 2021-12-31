public class MethodsOverloading {

    public static void main(String[] args) {
//        calculateScore("Dimi", 30);
//        calculateScore(6, 0);

        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0){
            return -1;
        }
        else if (inches < 0 || inches > 12) {
            return -1;
        }
        else{
            return ((feet * 12)+inches) * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) {
            return -1;
        }
        else{
            int feet = (int)inches / 12;
            int in = (int)inches%12;
            return calcFeetAndInchesToCentimeters((double)feet, (double)in);
        }
    }




}
