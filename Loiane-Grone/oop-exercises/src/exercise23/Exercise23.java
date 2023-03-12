package exercise23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.print("Enter the course name: ");
        String courseName = sc.next();
        sc.nextLine();

        System.out.print("Enter the course schedule (dd/MM/yyyy hh:mm): ");
        Date schedule = sdf.parse(sc.nextLine());

        System.out.print("Enter the teacher's name: ");
        String name = sc.next();

        System.out.print("Enter the teacher's department: ");
        String department = sc.next();

        System.out.print("Enter the teacher's email: ");
        String email = sc.next();

        Teacher teacher = new Teacher(name, department, email);

        System.out.println("Now enter the students of this course.");
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i += 1) {
            System.out.print("Enter the " + (i + 1) + "° student's name: ");
            name = sc.next();

            System.out.print("Enter the " + (i + 1) + "° student's registrations: ");
            int registration = sc.nextInt();

            double[] grades = new double[4];
            double grade;
            for (int j = 0; j < grades.length; j += 1) {
                System.out.print("Enter grade " + (j + 1) + ": ");
                grade = sc.nextDouble();
                grades[j] = grade;
            }
            students[i] = new Student(name, registration, grades);
        }

        Course course = new Course(courseName, schedule, teacher, students);
        course.getTeacher();
        course.showStudentsReportCards();

        sc.close();
    }
}
