package Lesson6;

public class Student {
    int id;
    String name;
    String surname;
    String course;
    int age;

    Student(int id, String name, String surname, String course, int age){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.age = age;
    }

    Student(){
        this.id = 0;
        this.name = "Not specified";
        this.surname = "Not specified";
        this.course = "Not specified";
        this.age = 0;
    }

    Student(int id, String name, String surname, String course){
        this(id, name, surname, course, 0);
    }

    public String toString(){
        return "Student ID: " + id +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nCourse: " + course +
                "\nStudent age: " + age;
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("No params given...");
        System.out.println(student1);


        Student student2 = new Student(1, "John", "Doe", "Math", 33);
        System.out.println("All params given...");
        System.out.println(student2);

        Student student3 = new Student(2, "Janne", "Aire", "Physics");
        System.out.println("4 params given...");
        System.out.println(student3);

    }
}
