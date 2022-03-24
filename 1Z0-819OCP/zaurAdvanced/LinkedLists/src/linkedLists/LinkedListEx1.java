package linkedLists;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Cady", 5);
        Student st2 = new Student("Dimi", 3);
        Student st3 = new Student("Peter", 1);
        Student st4 = new Student("Mike", 3);
        Student st5 = new Student("Craig", 2);

        LinkedList<Student> stLinkedList = new LinkedList<>();
        stLinkedList.add(st1);
        stLinkedList.add(st2);
        stLinkedList.add(st3);
        stLinkedList.add(st4);
        stLinkedList.add(st5);
        System.out.println(stLinkedList);
        System.out.println(stLinkedList.get(2));

        Student st6 = new Student("Zaur", 3);
        Student st7 = new Student("George", 1);
        stLinkedList.add(st6);
        System.out.println(stLinkedList);
        stLinkedList.add(1, st7);
        System.out.println(stLinkedList);
        stLinkedList.remove(3);
        System.out.println(stLinkedList);



    }
}

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                "}";
    }
}
