package comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Vladimir", "Solovyov", 12345);
        Employee emp2 = new Employee(15, "John", "Doe", 12222);
        Employee emp3 = new Employee(1, "Pete", "Jordan", 3333);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting:");
        for(Employee e : list){
            System.out.println(e);
        }
//        Collections.sort(list); // with Comparable
        Collections.sort(list, new NameComparator());
        System.out.println("After sorting:");
        for(Employee e : list){
            System.out.println(e);
        }

    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee["+
                "name=" + name +
                " surname=" + surname +
                " id=" + id +
                " salary=" + salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        if(id > otherEmployee.id){
            return 1;
        }
        else if(id < otherEmployee.id){
            return -1;
        }
        return 0;

        // return this.id.compareTo(anotherEmp.id); - > works wth Integer
        // return this.id - anotherEmp.id;
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
//        if(emp1.id > emp2.id){
//            return 1;
//        }
//        else if(emp1.id < emp2.id){
//            return -1;
//        }
//        return 0;
        return emp1.name.compareTo(emp2.name);
    }
}
