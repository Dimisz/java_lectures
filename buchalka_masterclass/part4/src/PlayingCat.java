public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        int lowerLimit = 25;
        int upperLimit = 35;
        if (summer) upperLimit = 45;

        if (temperature >= lowerLimit && temperature <= upperLimit){
            return true;
        }
        else{
            return false;
        }
    }
}
