package generics;

import java.util.ArrayList;

public class ParameterizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Mike");
        al2.add("Pete");
        al2.add("Bob");
        String name = GenMethod.getSecondElement(al2);
        System.out.println(name);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
