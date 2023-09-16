package exercise14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise14 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        System.out.print("Enter the path to the file: ");
        String path = sc.nextLine();

        System.out.print("Enter the name of the new file: ");
        String fileName = sc.nextLine();

        try {
            sc = getScanner(path);
            String fileContent = readAndGetFileContent(sc);
            writeNewFile(fileName, fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("It was not possible to read the file.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static void writeNewFile(String fileName, String fileContent) {
        try (PrintStream fileWriter = new PrintStream(fileName)) {
            fileWriter.print(fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occured while trying to write to the file.");
        }
    }

    private static String readAndGetFileContent(Scanner sc) {
        StringBuilder text = new StringBuilder();
        String name;
        String birthDate;
        LocalDate currentDate = getCurrentDate();
        short age;
        while (true) {
            String[] lineContent = sc.nextLine().split(",");
            name = lineContent[0];
            birthDate = lineContent[1];
            age = calculateAge(birthDate, currentDate);
            text.append("Name: " + name + ", ");
            text.append("Age: " + age);
            if (!sc.hasNextLine()) {
                break;
            }
            text.append("\n");
        }
        return text.toString();
    }

    private static short calculateAge(String birthDate, LocalDate currentDate) {
        LocalDate convertedBirthDate = convertBirthDate(birthDate);
        return (short) Period.between(convertedBirthDate, currentDate).getYears();
    }

    private static LocalDate convertBirthDate(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        return LocalDate.parse(birthDate, formatter);
    }

    private static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    private static Scanner getScanner(String path) throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
