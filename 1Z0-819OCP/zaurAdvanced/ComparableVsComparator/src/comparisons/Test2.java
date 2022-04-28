package comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(100, "John", "Doe", 60000);
        Employee emp2 = new Employee(101, "Jane", "Doe", 48000);
        Employee emp3 = new Employee(23, "John", "Glass", 25000);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Before sorting: ");
        System.out.println(employees);

        Collections.sort(employees);
        System.out.println("Sorted: ");
        System.out.println(employees);
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String firstName;
    String secondName;
    int salary;

    public Employee(int id, String firstName, String secondName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        int result = this.firstName.compareTo(otherEmployee.firstName);
        if(result == 0){
            return this.secondName.compareTo(otherEmployee.secondName);
        }
        return result;
    }
}
