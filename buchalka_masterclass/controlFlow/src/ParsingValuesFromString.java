public class ParsingValuesFromString {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String doubleAsString = "2018.125";
        System.out.println("doubleAsString = " + doubleAsString);
        double num = Double.parseDouble(doubleAsString);
        System.out.println("num = " + num);
    }
}
