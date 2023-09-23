package exercise19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here contain fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise19 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path and the file name: ");
        String path = sc.nextLine();

        try {
            sc = getScanner(path);
            String studentData = readFileContentAndTheStudentData(sc);
            System.out.println(studentData);
        } catch (FileNotFoundException e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static String readFileContentAndTheStudentData(Scanner sc) {
        String studentName = null;
        byte studentGrade = 0;
        String[] lineData;
        byte auxiliar = 0;
        while (sc.hasNextLine()) {
            lineData = sc.nextLine().substring(5).split("GRADE:");
            auxiliar = Byte.parseByte(lineData[1].trim());
            if (studentGrade < auxiliar) {
                studentGrade = auxiliar;
                studentName = lineData[0].trim();
            }
        }
        return String.format("The student with the best grade is %s, grade: %s", studentName, studentGrade) ;
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
