package exercise26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise26 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Inform how many students' information you want to enter: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();
        Student student;
        for (int i = 0; i < numberOfStudents; i++) {
            student = new Student();
            System.out.print("\nEnter the student's registration number: ");
            student.setRegistration(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter the student's last name: ");
            student.setLastName(sc.nextLine());

            System.out.print("Enter the student's year of birth: ");
            student.setYearOfBirth(sc.nextShort());
            sc.nextLine();

            students.add(student);
        }
    }

    private static void saveInformationToThefile() {}

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
