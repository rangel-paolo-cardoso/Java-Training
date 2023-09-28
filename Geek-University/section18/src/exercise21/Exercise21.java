package exercise21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here contain fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise21 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        try {
            System.out.print("Enter the number of students: ");
            byte numberOfStudents = sc.nextByte();
            sc.nextLine();

            System.out.print("Enter the path and name of the new file (save as a binary .bin): ");
            String filePathAndName = sc.nextLine();

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
            writeContentToTheFile(filePathAndName, fileContent);
            sc = getScanner(filePathAndName);
            String bestStudentsInfo = readFileContentAndGetTheBestStudentData(sc);
            System.out.println(bestStudentsInfo);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There was a mistake with the data provided.");
        } finally {
            sc.close();
        }
    }

    private static String readFileContentAndGetTheBestStudentData(Scanner sc) {
        String lineData;
        byte grade = 0;
        String studentName = "";
        while (sc.hasNextLine()) {
            lineData = sc.nextLine();
            byte nextGrade = Byte.parseByte(lineData.split("Final grade: ")[1]);
            if (nextGrade > grade) {
                grade = nextGrade;
                studentName = lineData.split("Final grade:")[0].substring(5).trim();
            }
        }
        return String.format("The best student is %s with the grade of %d", studentName, grade);
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
