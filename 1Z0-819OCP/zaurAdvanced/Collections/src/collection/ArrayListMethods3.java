package collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Cady");
        arrayList1.add("Vladimir");
        arrayList1.add("John");
        arrayList1.add("Cady");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("????");

        // ADD ALL METHOD
        System.out.println(arrayList2);
        arrayList2.addAll(1, arrayList1);
        System.out.println(arrayList2);

        // CLEAR METHOD
        arrayList1.clear();
        System.out.println(arrayList1);


        // indexOf
        System.out.println(arrayList2.indexOf("Cady"));

        // lastIndexOf
        System.out.println(arrayList2.lastIndexOf("Cady"));

        //isEmpty
        System.out.println(arrayList2.isEmpty());

        //contains
        System.out.println(arrayList2.contains("Vladimmir"));
        System.out.println(arrayList2.contains("Cady"));

    }
}
