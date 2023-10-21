package exercise27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;
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
    private static String path = "./src/exercise27/class-grades.txt";

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        boolean exitSystem = false;
        do {
            printMenu();
            exitSystem = executeOption();
            if (exitSystem) {
                break;
            }
        } while (true);
        sc.close();
    }

    private static void printMenu() {
        System.out.print(
                "\n---------- Menu ----------\n"
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
        boolean exit = false;
        systemLoop: {
            while (true) {
                char option = sc.nextLine().toLowerCase().charAt(0);
                switch (option) {
                    case 'a':
                        defineClassInformation();
                        break systemLoop;
                    case 'b':
                        insertStudentAndGrades();
                        break systemLoop;
                    case 'c':
                        showStudentsAndAverages();
                        break systemLoop;
                    case 'd':
                        showApprovedStudents();
                        break systemLoop;
                    case 'e':
                        showFailedStudents();
                        break systemLoop;
                    case 'f':
                        saveDataToTheDisk();
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

    private static void defineClassInformation() {
        String[] fileContent = readAndGetFileContent().split("\n");
        System.out.printf(
                "%n========== CLASS INFORMATION ==========%n"
                        + "%nNumber of students: %d",
                fileContent.length);
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

    private static void saveDataToTheDisk() {
        if (!studentInfo.isEmpty()) {
            try (PrintStream fileWriter = new PrintStream(new FileOutputStream(path, true))) {
                fileWriter.print(studentInfo.toString());
                flushInformation();
                System.out.println("Data saved successfully!");
            } catch (FileNotFoundException e) {
                System.out.println("An error occured while trying to save data to the disk.");
                e.printStackTrace();
            }
        } else {
            System.out.println("There is no data to be saved!");
        }
    }

    private static void showStudentsAndAverages() {
        String[] fileContent = readAndGetFileContent().split("\n");
        if (fileContent.length < 1) {
            System.out.println("There is no information to be shown");
        } else {
            String studentName;
            float average;
            System.out.println("\n========== Students' Averages ==========");
            for (int i = 0; i < fileContent.length; i++) {
                studentName = fileContent[i].split(",")[0].substring(6);
                average = calculateAverage(fileContent[i]);
                System.out.printf("Student name: %s, AVG = %.2f%n", studentName, average);
            }
        }
    }

    private static void showApprovedStudents() {
        String[] fileContent = readAndGetFileContent().split("\n");
        if (fileContent.length < 1) {
            System.out.println("There is no information to be shown");
        } else {
            String studentName;
            float average;
            System.out.println("\n========== Approved Students' ==========");
            for (int i = 0; i < fileContent.length; i++) {
                studentName = fileContent[i].split(",")[0].substring(6);
                average = calculateAverage(fileContent[i]);
                if (average >= 6.0f) {
                    System.out.printf("Student name: %s, AVG = %.2f%n", studentName, average);
                }
            }
        }
    }

    private static void showFailedStudents() {
        String[] fileContent = readAndGetFileContent().split("\n");
        if (fileContent.length < 1) {
            System.out.println("There is no information to be shown");
        } else {
            String studentName;
            float average;
            System.out.println("\n========== Failed Students' ==========");
            for (int i = 0; i < fileContent.length; i++) {
                studentName = fileContent[i].split(",")[0].substring(6);
                average = calculateAverage(fileContent[i]);
                if (average < 6.0f) {
                    System.out.printf("Student name: %s, AVG = %.2f%n", studentName, average);
                }
            }
        }
    }

    private static float calculateAverage(String student) {
        String aux;
        int auxIndex;
        int sum = 0;
        for (int j = 0; j < 4; j++) {
            aux = "Grade " + (j + 1) + ": ";
            auxIndex = student.indexOf(aux);
            sum += Integer.parseInt(
                    student.substring(
                            auxIndex + aux.length(),
                            auxIndex + aux.length() + 1));
        }
        return sum / 4.0f;
    }

    private static String readAndGetFileContent() {
        StringBuilder fileContent = new StringBuilder();
        try (Scanner fileScanner = getFileScanner()) {
            while (fileScanner.hasNextLine()) {
                fileContent.append(fileScanner.nextLine());
                fileContent.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        }
        return fileContent.toString();
    }

    private static void flushInformation() {
        studentInfo.setLength(0);
    }

    private static Scanner getFileScanner() throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
