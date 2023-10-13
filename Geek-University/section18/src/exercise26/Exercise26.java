package exercise26;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise26 {

    private static String pathFileName = "./src/exercise26/students-info.txt";
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Inform how many students' information you want to enter: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();

        StringBuilder fileContent = new StringBuilder();
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

            fileContent.append(student);
            fileContent.append("\n");
        }

        saveInformationToThefile(fileContent);
    }

    private static void saveInformationToThefile(StringBuilder fileContent) {
        try (PrintStream fileWriter = new PrintStream(pathFileName)) {
            fileWriter.print(fileContent.toString());
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to write info to the file.");
            e.printStackTrace();
        }
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
