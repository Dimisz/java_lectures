import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        int index = Collections.binarySearch(arrayList, 12);
        System.out.println(index);

        Collections.sort(arrayList);
        index = Collections.binarySearch(arrayList, 12);
        System.out.println(index);
        index = Collections.binarySearch(arrayList, 121);
        System.out.println(index);
        */
        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(15, "Ivan", 6542);
        Employee emp3 = new Employee(123, "Peter", 8542);
        Employee emp4 = new Employee(15, "Mary", 5678);
        Employee emp5 = new Employee(182, "Nicholas", 125);
        Employee emp6 = new Employee(15, "Alex", 9874);
        Employee emp7 = new Employee(250, "Helen", 1579);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
        int index2 = Collections.binarySearch(employees, new Employee(123, "Peter", 8542));
        System.out.println(index2);

    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee otherEmp) {
        int result = this.id - otherEmp.id;
        if(result == 0){
            result = this.name.compareTo(otherEmp.name);
        };
        return result;
    }
}
