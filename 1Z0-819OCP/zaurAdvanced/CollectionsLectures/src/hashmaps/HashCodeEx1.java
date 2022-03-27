package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Vladimir", "Solovyov", 3);
        Student st2 = new Student("John", "Doe", 4);
        Student st3 = new Student("Kate", "Morgan", 2);

        Map<Student, Double> map = new HashMap<>();
        map.put(st1, 7.5);
        map.put(st2, 6.9);
        map.put(st3, 9.1);
        Student st4 = new Student("Vladimir", "Solovyov", 3);
//        boolean result = map.containsKey(st4);
//        System.out.println("result: " + result);
//        System.out.println(st1.equals(st4));
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());


    }
}

class Student{
    String firstName;
    String lastName;
    int course;

    public Student(String firstName, String lastName, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && firstName.equals(student.firstName) && lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, course);
    }
}
