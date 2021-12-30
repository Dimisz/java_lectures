public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        String message = "Invalid Value";
        if (kiloBytes >= 0){
                message = kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB";
            }

        System.out.println(message);
    }

}
