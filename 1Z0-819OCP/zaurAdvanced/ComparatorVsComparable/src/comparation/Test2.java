package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 200);
        Employee emp2 = new Employee(15, "John", "Doe", 150);
        Employee emp3 = new Employee(2, "Mark", "Janes", 133);
        Employee emp4 = new Employee(12, "Mark", "Zanes", 134);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sorting:");
        System.out.println(list);

//        Collections.sort(list);
//        Collections.sort(list, new IdComparator());
        Collections.sort(list, new NameComparator());
        System.out.println("After sorting...");
        System.out.println(list);
    }
}

class Employee {
        //implements Comparable<Employee>{
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
        return "\nEmployee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                '}';
    }
/*
    @Override
    public int compareTo(Employee o) {
//        if(id > o.id) return 1;
//        else if(id == o.id) return 0;
//        else return -1;
//        return this.id - o.id;
        int res = this.firstName.compareTo(o.firstName);
        if(res == 0){
            return this.secondName.compareTo(o.secondName);
        }
        return res;
    }
    */

}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.id > o2.id) return 1;
        else if(o1.id == o2.id) return 0;
        else return -1;
    }
}

class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2){
        int nameComparison = emp1.firstName.compareTo(emp2.firstName);
        if(nameComparison == 0){
            return emp1.secondName.compareTo(emp2.secondName);
        }
        return nameComparison;
    }
}
