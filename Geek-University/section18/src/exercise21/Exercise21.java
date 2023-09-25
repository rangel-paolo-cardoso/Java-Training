package exercise21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercise21 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        try {
            System.out.print("Enter the number of students: ");
            byte numberOfStudents = sc.nextByte();
            sc.nextLine();

            System.out.print("Enter the path and name of the new file: ");
            String fileName = sc.nextLine();

            String[] studentsNames = new String[numberOfStudents];
            byte[] studentsGrades = new byte[numberOfStudents];

            for (int i = 0; i < numberOfStudents; i++) {
                System.out.printf("Enter the name of the %dº student: ", (i + 1));
                studentsNames[i] = validateAndFormatName(sc.nextLine());

                System.out.printf("Enter the grade of the %dº student: ", (i + 1));
                studentsGrades[i] = sc.nextByte();
                sc.nextLine();
            }

            String fileContent = generateFileContent(studentsNames, studentsGrades);
            writeContentToTheFile(fileName, fileContent);
        } catch (Exception e) {
            System.out.println("There was a mistake with the data provided.");
        }
    }

    private static void writeContentToTheFile(String fileName, String fileContent) {
        try (PrintStream fileWriter = new PrintStream(fileName)) {
            fileWriter.print(fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to write to the file.");
            e.printStackTrace();
        }
    }

    private static String generateFileContent(String[] studentsNames, byte[] studentsGrades) {
        StringBuilder fileContent = new StringBuilder();
        int iterationLimit = (studentsGrades.length + studentsNames.length) / 2;
        for (int i = 0; i < iterationLimit; i++) {
            fileContent.append(String.format("Name: %s Final grade: %d", studentsNames[i], studentsGrades[i]));
            if (i < iterationLimit - 1) {
                fileContent.append("\n");
            }
        }
        return fileContent.toString();
    }

    private static String validateAndFormatName(String studentName) {
        StringBuilder whiteSpaces = new StringBuilder();
        String nameSlice;
        byte nameLength = (byte) studentName.length();
        while (nameLength + whiteSpaces.length() < 40) {
            whiteSpaces.append(" ");
        }
        if (nameLength > 40) {
            nameSlice = studentName.substring(0, 41);
            return nameSlice;
        }
        return studentName + whiteSpaces.toString();
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
