package regex;

public class RegexClass {


    public static void printTokens(String[] arr){
        System.out.println("Printing tokens...");
        String finalS = "";
        for(String s : arr){
            finalS += (s + ", ");
        }
        finalS = finalS.substring(0, finalS.length()-2);
        System.out.println(finalS);
    }

    public static String[] splitString(String str, String regex){

        return str.split(regex);
    }

    public static void main(String[] args) {
        String str = "The cow jumped over the moon";
        String[] tokens = RegexClass.splitString(str, " ");
        RegexClass.printTokens(tokens);

        tokens = RegexClass.splitString(str, "the");
        RegexClass.printTokens(tokens);

        str = "the    cow    jumped      over    the\n        moon";
        tokens = RegexClass.splitString(str, "\\s+");
        RegexClass.printTokens(tokens);
    }
}
