package Lesson6;

public class Employee {
    int id;
    String name;
    int age;
    double salary;
    String department;

    Employee(int id, String name, int age){

        this(name, age);
        this.id = id;
    }

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nID: " + id;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Vladimir Solovyov", 34);
        System.out.println(emp);
    }
}
