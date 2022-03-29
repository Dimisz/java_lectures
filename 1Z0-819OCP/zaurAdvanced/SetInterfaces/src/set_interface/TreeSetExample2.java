package set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("John", 2);
        Student st2 = new Student("Mark", 1);
        Student st3 = new Student("Mary", 4);
        Student st4 = new Student("Kate", 5);
        Student st5 = new Student("Dimi", 3);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());


        // headSet and tailSet
        Student st6 = new Student("Zeta", 3);
        System.out.println("Headset: ");
        System.out.println(treeSet.headSet(st6));
        System.out.println("Tailset:");
        System.out.println(treeSet.tailSet(st6));

        // subSet
        Student st7 = new Student("Ivan", 1);
        //higher than Ivan but lower than Zeta
        System.out.println("\nSubset:");
        System.out.println(treeSet.subSet(st7, st6));

        // customized equals() and hashCode()
        System.out.println("\nChecking customized equals() and hashCode()");
        Student st8 = new Student("Dimi", 1);
        System.out.println(st5.equals(st8));
        System.out.println("st5 hashCode: " + st5.hashCode());
        System.out.println("st8 hashCode: " + st8.hashCode());
    }
}

class Student implements Comparable<Student>{
    String name;
    int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return "\nName: " + name + ", Year: " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}