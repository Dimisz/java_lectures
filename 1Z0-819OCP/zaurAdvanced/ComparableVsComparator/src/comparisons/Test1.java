package comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("John");
        list.add("Mary");
        list.add("Andrew");
        System.out.println("Unsorted: ");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Sorted: ");
        System.out.println(list);
    }
}
