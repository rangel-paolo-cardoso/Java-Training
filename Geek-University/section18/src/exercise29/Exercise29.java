package exercise29;

import java.util.Scanner;

public class Exercise29 {

    private static final String path = "./src/exercise29/";
    private static final Scanner sc = getScanner();

    public static void main(String[] args) {
        do {
            printMenu();
            break;
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

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
