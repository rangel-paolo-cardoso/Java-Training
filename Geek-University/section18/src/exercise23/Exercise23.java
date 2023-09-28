package exercise23;

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
public class Exercise23 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();

        String employeesData = getEmployeesPromptedData(sc);
        writeEmployeesDataToTheNewFile(employeesData);
    }

    private static void writeEmployeesDataToTheNewFile(String employeesData) {
        try (PrintStream fileWriter = new PrintStream("./src/exercise23/emp.txt")) {
            fileWriter.print(employeesData);
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to write to the file.");
            e.printStackTrace();
        }
    }

    private static String getEmployeesPromptedData(Scanner sc) {
        StringBuilder employeesData = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter the %dº employee's name: ", (i + 1));
            employeesData.append("Name: " + sc.nextLine() + ", ");

            System.out.printf("Enter the employee's years of service: ", (i + 1));
            employeesData.append("years of service: " + sc.nextByte());
            sc.nextLine();
            if (i < 4) {
                employeesData.append("\n");
            }
        }
        return employeesData.toString();
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
