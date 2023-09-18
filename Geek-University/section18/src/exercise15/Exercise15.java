package exercise15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here are fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise15 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the current year: ");
        short currentYear = sc.nextShort();
        sc.nextLine();

        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        System.out.print("Enter the path and name of the new file: ");
        String fileName = sc.nextLine();

        try {
            sc = getScanner(path);
            String fileContent = readAndGetFileContent(sc, currentYear);
            createFileAndWriteContent(fileName, fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        }
    }

    private static void createFileAndWriteContent(String fileName, String fileContent) {
        try (PrintStream fileWriter = new PrintStream(fileName)) {
            fileWriter.print(fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occured while trying to write to the file.");
        }
    }

    private static String readAndGetFileContent(Scanner sc, short currentYear) {
        StringBuilder text = new StringBuilder();
        short age;
        while (true) {
            String[] lineData = sc.nextLine().replaceAll("\\s+", " ").split(" ");
            text.append("Name: " + lineData[0]);
            age = calculateAge(lineData[1], currentYear);
            text.append(", age: " + age);
            text.append(", status: " + definestatus(age));
            if (!sc.hasNextLine()) {
                break;
            }
            text.append("\n");
        }
        return text.toString();
    }

    private static String definestatus(short age) {
        String status;
        if (age < 18) {
            status = "underage";
        } else if (age == 18) {
            status = "entering legal age";
        } else {
            status = "legal age";
        }
        return status;
    }

    private static short calculateAge(String birthDateString, short currentYear) {
        short birthDate = Short.parseShort(birthDateString);
        return (short)(currentYear - birthDate);
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
