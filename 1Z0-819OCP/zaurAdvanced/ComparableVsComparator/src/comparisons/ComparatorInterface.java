package comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        Employee1 emp1 = new Employee1(100, "John", "Doe", 60000);
        Employee1 emp2 = new Employee1(101, "Jane", "Doe", 48000);
        Employee1 emp3 = new Employee1(23, "John", "Glass", 25000);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Before sorting: ");
        System.out.println(employees);

       // Collections.sort(employees);
        System.out.println("Sorted: ");
        System.out.println(employees);
    }
}


class Employee1{
    int id;
    String firstName;
    String secondName;
    int salary;

    public Employee1(int id, String firstName, String secondName, int salary) {
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
}

class IdComparator implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        if(emp1.id == emp2.id){
            return 0;
        }
        else if(emp1.id > emp2.id){
            return 1;
        }
        else{
            return -1;
        }
    }
}
