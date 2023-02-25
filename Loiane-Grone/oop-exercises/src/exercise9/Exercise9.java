package exercise9;

import java.util.Locale;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();
        System.out.print("Enter the student's registration: ");
        student1.registration = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the student's name: ");
        student1.name = sc.nextLine();

        System.out.print("Enter the student's course: ");
        student1.course = sc.nextLine();

        for (int i = 0; i < student1.subjects.length; i++) {
            Subject subject = new Subject();
            System.out.print("Enter the" + (i + 1) + "º student's course title: ");
            subject.title = sc.nextLine();
            System.out.print("Enter the" + (i + 1) + "º student's course grade: ");
            subject.grade = sc.nextDouble();
            sc.nextLine();
            student1.subjects[i] = subject;
        }

        System.out.print("Type the name of a subject to check is the student is approved: ");
        String subject = sc.nextLine();
        System.out.println("Registration: " + student1.registration);
        System.out.println("Name: " + student1.name);
        System.out.println("Course: " + student1.course);
        System.out.println("Is the student approved in " + subject + "? " + student1.checkIfApprovedInASubject(subject));

        sc.close();
    }
}
