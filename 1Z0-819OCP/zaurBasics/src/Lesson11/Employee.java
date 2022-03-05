package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double multiplyByTwo(double num){
        return num * 2;
    }

    public double doubleSalary(){
        salary *= 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 100.55);
        double num1 = emp1.multiplyByTwo(emp1.salary);
        System.out.println(num1);
        System.out.println(emp1.salary);
        double newSalary = emp1.doubleSalary();
        System.out.println(newSalary);
        System.out.println(emp1.salary);

    }
}
