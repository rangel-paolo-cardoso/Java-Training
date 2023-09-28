package exercise22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here contain fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise22 {

    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        System.out.print("Enter the path and file name of the output file: ");
        String fileName = sc.nextLine();

        try {
            sc = getScanner(path);
            String fileContent = getFileContent(sc);
            String studentData = getStudentNameAndGradesInAscendingOrder(fileContent);
            writeContentToANewFile(fileName, studentData);
        } catch (FileNotFoundException e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static void writeContentToANewFile(String fileName, String studentData) {
        try (PrintStream fileWriter = new PrintStream(fileName)) {
            fileWriter.print(studentData);
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to write to the file.");
            e.printStackTrace();
        }
    }

    private static String getStudentNameAndGradesInAscendingOrder(String fileContent) {
        String[] studentDataArray = fileContent.split(" ");
        String studentName = studentDataArray[0];
        String[] stringGrades = Arrays.copyOfRange(studentDataArray, 1, studentDataArray.length);
        int[] intGrades = new int[stringGrades.length];
        for (int i = 0; i < intGrades.length; i++) {
            intGrades[i] = Integer.parseInt(stringGrades[i]);
        }
        Arrays.sort(intGrades);
        return String
                .format("Student name: %s, grades: %d, %d, %d",
                        studentName,
                        intGrades[0],
                        intGrades[1],
                        intGrades[2]);
    }

    private static String getFileContent(Scanner sc) {
        String lineContent = "";
        while (sc.hasNextLine()) {
            lineContent = sc.nextLine();
        }
        return lineContent.replaceAll("\\s+", " ");
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
