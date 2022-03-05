package Lesson11;

public class Student {
    String name;
    int year;
    double grade;

    Student(String name, int year, double grade){
        this.name = name;
        this.year = year;
        this.grade = grade;
    }

    public String toString(){
        return "Name: " + name + "\tyear: " + year + "\tgrade: " + grade;
    }
    public static void swapStudents(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println("inside swap method...");
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void main(String[] args) {
        Student st1 = new Student("John", 3, 9.5);
        Student st2 = new Student("Mike", 1, 5.3);
        System.out.println(st1);
        System.out.println(st2);
        swapStudents(st1, st2);
        System.out.println("after method");
        System.out.println(st1);
        System.out.println(st2);
    }
}
