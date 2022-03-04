package Lesson8;

public class Student {

    String name;
    int year;
    static int count;

    public Student(String name, int year){
        this.name = name;
        this.year = year;
        count++;
        System.out.println("Student no: " + count + " was created.");
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student("John", 1);
        Student student2 = new Student("Mary", 3);
        Student student3 = new Student("Peter", 4);
    }
}
