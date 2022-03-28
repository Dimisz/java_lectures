package hash_table;

import hashmaps.Student;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Vladimir", "Solovyov", 3);
        Student st2 = new Student("John", "Doe", 4);
        Student st3 = new Student("Kate", "Morgan", 2);
        Student st4 = new Student("Vladimir", "Ivanof", 3);

        ht.put(7.2, st1);
        ht.put(9.3, st2);
        ht.put(5.8, st3);
        ht.put(6.0, st4);

        System.out.println(ht);
    }
}
