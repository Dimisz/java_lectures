package set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Mike");
        set.add("Mary");
        set.add("Craig");
        set.add("Kate");
        set.add("John");
        set.add(null);
        System.out.println(set);

//        for(String s : set){
//            System.out.println(s);
//        }

        // remove()
        set.remove("John");
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        // contains()
        System.out.println(set.contains("John"));
        System.out.println(set.contains("Mary"));

        // no get() method
    }
}
