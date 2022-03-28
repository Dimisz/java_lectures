package linked_hashmap;

import hashmaps.Student;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHash
                = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Vladimir", "Solovyov", 3);
        Student st2 = new Student("John", "Doe", 4);
        Student st3 = new Student("Kate", "Morgan", 2);
        Student st4 = new Student("Vladimir", "Ivanof", 3);

        linkedHash.put(7.2, st3);
        linkedHash.put(7.5, st4);
        linkedHash.put(5.8, st1);
        linkedHash.put(6.4, st2);

        System.out.println(linkedHash.get(7.2));
        System.out.println(linkedHash.get(7.5));
        System.out.println(linkedHash);

    }
}
