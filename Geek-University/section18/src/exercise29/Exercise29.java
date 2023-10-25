package exercise29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercise29 {

    private static String fileName = null;
    private static final String path = "./src/exercise29/";
    private static final Scanner sc = getScanner();
    private static final StringBuilder fileContent = new StringBuilder();

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
                        + "1 - Create data file\n"
                        + "2 - Insert a record to the file\n"
                        + "3 - Delete a seller from the file\n"
                        + "4 - Change the value of a sale on the file\n"
                        + "5 - Print records to the default output\n"
                        + "6 - Delete the data file\n"
                        + "7 - Exit system\n"
                        + "Choose your option: ");
    }

    private static boolean executeOption() {
        boolean exit = false;
        systemLoop: {
            while (true) {
                char option = sc.nextLine().toLowerCase().charAt(0);
                switch (option) {
                    case 1:
                        createDataFile();
                        break systemLoop;
                    case 2:
                        insertRecordToTheFile(true);
                        break systemLoop;
                    case 3:
                        break systemLoop;
                    case 4:
                        break systemLoop;
                    case 5:
                        break systemLoop;
                    case 6:
                        break systemLoop;
                    case 7:
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

    private static void createDataFile() {
        fileContent.setLength(0);
        System.out.print("Enter the file name: ");
        fileName = sc.nextLine();
        writeContentToTheFile(false, path + fileName);
    }

    private static void insertRecordToTheFile(boolean append) {
        System.out.print("Enter the seller code: ");
        int sellerCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the seller name: ");
        String sellerName = sc.nextLine();

        System.out.print("Enter the sale value: ");
        float saleValue = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter the sale month: ");
        byte saleMonth = sc.nextByte();
        sc.nextLine();
    }

    private static void writeContentToTheFile(boolean append, String filePathAndName) {
        try (PrintStream fileWriter = new PrintStream(new FileOutputStream(filePathAndName + ".txt", append))) {
            fileWriter.println(fileContent.toString());
            if (append) {
                System.out.println("Data saved successfully!");
            } else {
                System.out.println("File created successfully!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to save data to the disk.");
            e.printStackTrace();
        }
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
