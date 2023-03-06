package exercise13;

import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();
        System.out.print("Enter the student's registration: ");
        student1.setRegistration(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter the student's name: ");
        student1.setName(sc.nextLine());

        System.out.print("Enter the student's course: ");
        student1.setCourse(sc.nextLine());

        for (int i = 0; i < student1.getSubjects().length; i++) {
            Subject subject = new Subject();
            System.out.print("Enter the course subject name the " + (i + 1) + "º student is attending to: ");
            subject.setTitle(sc.nextLine());
            System.out.print("Enter the course subject grade the " + (i + 1) + "º student is attending to: ");
            subject.setGrade(sc.nextDouble());
            sc.nextLine();
            student1.getSubjects()[i] = subject;
        }

        System.out.print("Type the name of a subject to check is the student is approved: ");
        String subject = sc.nextLine();
        System.out.println("Registration: " + student1.getRegistration());
        System.out.println("Name: " + student1.getName());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Is the student approved in " + subject + "? " + student1.checkIfApprovedInASubject(subject));

        sc.close();
    }
}
