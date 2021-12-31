public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }


    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int totalSeconds = seconds + minutes * 60;
            int hrs = totalSeconds / (60*60);
            int remainingSeconds = totalSeconds % (60*60);
            int mins = remainingSeconds / 60;
            remainingSeconds = remainingSeconds % 60;

            String hrsString = String.valueOf(hrs);
            if (hrs < 10){
                hrsString = "0" + hrsString;
            }
            String minsString = String.valueOf(mins);
            if (mins < 10){
                minsString = "0" + minsString;
            }
            String secsString = String.valueOf(remainingSeconds);
            if (remainingSeconds < 10){
                secsString = "0" + secsString;
            }
            String result = hrsString + "h " + minsString + "m " + secsString + "s";
            return result;
        }
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int mins = seconds / 60;
            int secs = seconds % 60;
            return getDurationString(mins, secs);
        }
    }
}
