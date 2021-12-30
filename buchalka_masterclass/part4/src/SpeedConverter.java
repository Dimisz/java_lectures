public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }


    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        long mph = toMilesPerHour(kilometersPerHour);
        String message = "Invalid Value";
        if (mph != -1){
            message = kilometersPerHour + " km/h = " + mph + " mi/h";
        }
        System.out.println(message);
    }

}
