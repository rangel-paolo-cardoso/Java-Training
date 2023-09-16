package exercise13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 */
public class Exercise13 {
    
    public static void main(String[] args) {
        Scanner sc = getScanner();
        StringBuilder text = new StringBuilder();
        char option = '1';
        do {
            text.append("Name: ");
            printMessage("Enter the client's name to register: ");
            text.append(sc.nextLine() + ", ");

            text.append("Phone: ");
            printMessage("Enter the client's telephone to register: ");
            text.append(sc.nextLine());

            printMenu();
            option = sc.nextLine().charAt(0);
            if (option == '0') {
                break;
            }
            text.append("\n");
        } while (true);

        printMessage("Enter the path and the name of the new file to save the data: ");
        String filePathName = sc.nextLine();
        sc.close();

        writeToTheFile(filePathName, text.toString());
    }

    private static void writeToTheFile(String filePathName, String text) {
        try (PrintStream filrWriter = new PrintStream(filePathName)) {
            filrWriter.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occured while trying to write to the file.");
        }
    }

    private static void printMenu() {
        System.out.print("Options:\n- Enter '0' to stop\n- Enter any other value to continue > ");
    }

    private static void printMessage(String text) {
        System.out.print(text);
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
