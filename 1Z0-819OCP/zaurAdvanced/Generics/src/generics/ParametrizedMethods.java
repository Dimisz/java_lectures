package generics;

import java.util.ArrayList;

public class ParametrizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("First");
        al2.add("Second");
        al2.add("Third");
        System.out.println(GenMethod.getSecondElement(al2));
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
