package Lesson4;

public class Student {
    int studentID;
    int averageMathGrade;
    int averageEconomicsGrade;
    int averageForeignLanguageGrade;
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentID = 1;
        student1.averageMathGrade = 4;
        student1.averageEconomicsGrade = 3;
        student1.averageForeignLanguageGrade = 5;
        System.out.println("Student No." + student1.studentID + " has the following average grade " +
                ((double)student1.averageMathGrade +
                        (double)student1.averageEconomicsGrade +
                        (double)student1.averageForeignLanguageGrade)/3);

        Student student2 = new Student();
        student2.studentID = 2;
        student2.averageMathGrade = 2;
        student2.averageEconomicsGrade = 3;
        student2.averageForeignLanguageGrade = 5;
        System.out.println("Student No." + student2.studentID + " has the following average grade " +
                ((double)student2.averageMathGrade +
                        (double)student2.averageEconomicsGrade +
                        (double)student2.averageForeignLanguageGrade)/3);


        Student student3 = new Student();
        student3.studentID = 3;
        student3.averageMathGrade = 3;
        student3.averageEconomicsGrade = 3;
        student3.averageForeignLanguageGrade = 5;
        System.out.println("Student No." + student3.studentID + " has the following average grade " +
                ((double)student3.averageMathGrade +
                        (double)student3.averageEconomicsGrade +
                        (double)student3.averageForeignLanguageGrade)/3);


        
    }

}
