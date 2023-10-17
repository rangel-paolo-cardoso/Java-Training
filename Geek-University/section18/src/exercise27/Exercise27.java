package exercise27;

import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here contain fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise27 {

    private static StringBuilder studentInfo = new StringBuilder();
    private static Scanner sc = getScanner();
    private static String path = "./src/exefcise27/class-grades.txt";

    public static void main(String[] args) {
        boolean exitSystem = false;
        do {
            printMenu();
            exitSystem = executeOption();
            if (exitSystem) {
                break;
            }
        } while (true);
    }

    private static void printMenu() {
        System.out.print(
                "---------- Menu ----------\n"
                        + "a) - Define class infromation\n"
                        + "b) - Insert student and grades\n"
                        + "c) - Show students and averages\n"
                        + "d) - Show approved students\n"
                        + "e) - Show failed students\n"
                        + "f) - Save data to the disk\n"
                        + "g) - Exit system\n"
                        + "Choose your option: ");
    }

    private static boolean executeOption() {
        boolean exit;
        systemLoop: {
            while (true) {
                exit = false;
                char option = sc.nextLine().toLowerCase().charAt(0);
                switch (option) {
                    case 'a':
                        break systemLoop;
                    case 'b':
                        insertStudentAndGrades();
                        break systemLoop;
                    case 'c':
                        break systemLoop;
                    case 'd':
                        break systemLoop;
                    case 'e':
                        break systemLoop;
                    case 'f':
                        break systemLoop;
                    case 'g':
                        exit = true;
                        break systemLoop;
                    default:
                        System.out.println("\nInvalid option! Try again.");
                        printMenu();
                }
            }
        }
        return exit;
    }

    private static void insertStudentAndGrades() {
        System.out.print("Enter the name of the student: ");
        studentInfo.append("Name: " + sc.nextLine());

        for (byte i = 0; i < 4; i++) {
            System.out.printf("Enter the student's %dº grade: ", (i + 1));
            studentInfo.append(String.format(", Grade %d: ", (i + 1)) + sc.nextInt());
            sc.nextLine();
        }
        studentInfo.append("\n");
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
