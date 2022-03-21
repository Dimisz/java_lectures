package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Cady");
        arrayList1.add("Vladimir");
        arrayList1.add("John");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Michael");
        arrayList2.add("Peter");


        //best practice is to mention initial capacity
        ArrayList<String> arrayList3 = new ArrayList<>(200);
        arrayList3.add("AAA");
        arrayList3.add("BBB");
        System.out.println(arrayList3.size());//capacity is NOT size
        List<String> arrayList4 = new ArrayList<>();

        ArrayList<String> arrayList5 = new ArrayList<>(arrayList1);
        System.out.println(arrayList1 == arrayList5);
        System.out.println(arrayList5);
        arrayList1.add("Pete");
        System.out.println(arrayList1);
        System.out.println(arrayList5);


    }
}
