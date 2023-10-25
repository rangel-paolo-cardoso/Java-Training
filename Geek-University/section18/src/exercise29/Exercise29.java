package exercise29;

import java.util.Locale;
import java.util.Scanner;

public class Exercise29 {

    private static final String path = "./src/exercise29/";
    private static final Scanner sc = getScanner();

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
                        break systemLoop;
                    case 2:
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

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
