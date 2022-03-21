package generics.game;

public class Test {
    public static void main(String[] args) {
        Schooler schooler1 = new Schooler("John", 13);
        Schooler schooler2 = new Schooler("Mike", 15);

        Student student1 = new Student("Peter", 20);
        Student student2 = new Student("Jeff", 19);

        Employee emp1 = new Employee("Jane", 25);
        Employee emp2 = new Employee("Mary", 27);

        Team<Schooler> scholarTeam = new Team<>("Dragons");
        scholarTeam.addNewParticipant(schooler1);
        scholarTeam.addNewParticipant(schooler2);
//        scholarTeam.addNewParticipant(student1); // non-scholars can be added
//        scholarTeam.addNewParticipant(emp1); // if not using generics

        Team<Student> studentsTeam = new Team<>("Alma mater");
        studentsTeam.addNewParticipant(student1);
        studentsTeam.addNewParticipant(student2);

        Team<Employee> employeesTeam = new Team<>("Proletarians");
        employeesTeam.addNewParticipant(emp1);
        employeesTeam.addNewParticipant(emp2);

        Team<Schooler> scholars = new Team<>("Sages");
        Schooler scholar3 = new Schooler("Stef", 12);
        Schooler scholar4 = new Schooler("Craig", 14);
        scholars.addNewParticipant(scholar3);
        scholars.addNewParticipant(scholar4);

        scholars.playWith(scholarTeam);


    }
}
