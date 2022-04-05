package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static String replaceAllWithPattern(String str, String pattern, String replacement){
        return str.replaceAll(pattern, replacement);
    }

    /**
     * Parses and returns various parts of a given phone number
     * @param phone - phone number to parse
     * @param part - part of phone number to return:
     *             1 - area code, 2 - prefix, 3 - number
     * @return part
     */
    public static String getPhoneNumber(String phone, int part){
        if(part < 1 || part > 3){
            throw new IllegalArgumentException("Part must be 1, 2, or 3.");
        }

        String regex = "\\b(\\d{3})[-.\\s]+(\\d{3})[-.\\s]+(\\d{4})\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);

        String phonePart = "";
        while(m.find()){
            phonePart = m.group(part);
        }
        return phonePart;
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

        String updatedStr = RegexClass.replaceAllWithPattern(str, "\\s+", " ");
        System.out.println("Replaced whitespaces: " + updatedStr + "\n");

        // get parts of phone number
        String areaCode = RegexClass.getPhoneNumber("123-982-6342", 1);
        String prefix = RegexClass.getPhoneNumber("800 787    2342", 2);
        String number = RegexClass.getPhoneNumber("  508.717.0989   ", 3);
        System.out.println("areaCode: " + areaCode);
        System.out.println("prefix: " + prefix);
        System.out.println("number: " + number);
    }
}
