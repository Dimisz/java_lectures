package Lesson8;

public class Student {

    String name;
    int year;
    static int count;
    static final String universityName = "GATech";

    public Student(String name, int year){
        this.name = name;
        this.year = year;
        count++;
        System.out.println("Student no: " + count + " was created.");
    }

    public static void showUni(){
        System.out.println("University: " + universityName);
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student("John", 1);
        Student student2 = new Student("Mary", 3);
        Student student3 = new Student("Peter", 4);
        Student.showUni();
    }
}
