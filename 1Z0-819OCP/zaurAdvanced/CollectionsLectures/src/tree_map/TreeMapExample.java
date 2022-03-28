package tree_map;

import hashmaps.Student;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Vladimir", "Solovyov", 3);
        Student st2 = new Student("John", "Doe", 4);
        Student st3 = new Student("Kate", "Morgan", 2);
        Student st4 = new Student("Vladimir", "Ivanof", 3);
        Student st5 = new Student("Chris", "Doe", 4);
        Student st6 = new Student("Jane", "Morgan", 2);
        Student st7 = new Student("Stan", "Morgan", 2);

        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(9.1, st7);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st6);
        treeMap.put(8.2, st5);
        //get()
//        System.out.println(treeMap);
//        System.out.println(treeMap.get(5.8));


        // remove
//        treeMap.remove(6.4);
//        System.out.println(treeMap);

        //descendingMa()
//        System.out.println(treeMap.descendingMap());

        //tailMap() >= value
//        System.out.println(treeMap.tailMap(7.5));

        // headMap() <= val
//        System.out.println(treeMap.headMap(7.9));

        // lastEntry()
//        System.out.println(treeMap.lastEntry());

        // firstEntry()
//        System.out.println(treeMap.firstEntry());


        TreeMap<Student, Double> treeMap1 = new TreeMap<>(); //requires Comparable
        treeMap1.put(st1, 1.1);
        treeMap1.put(st2, 2.2);
        treeMap1.put(st4, 4.4);
        treeMap1.put(st6, 6.6);
        treeMap1.put(st3, 3.3);
        treeMap1.put(st5, 5.5);
        treeMap1.put(st7, 7.7);
        System.out.println(treeMap1);
    }
}
