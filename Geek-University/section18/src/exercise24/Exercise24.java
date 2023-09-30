package exercise24;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here contain fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise24 {

    private static StringBuilder productInfoContainer = new StringBuilder();
    private static Scanner sc = getScanner();
    private static byte aux = 0;

    public static void main(String[] args) {

        boolean finishExecution = false;
        do {
            printMenu();
            executeOption();
            System.out.println("Do you want to finish now? (Attention: If you did not save, the information will be lost)");
            System.out.print("Enter Y (Yes) or any another key to continue: ");
            finishExecution = sc.nextLine().toLowerCase().charAt(0) == 'y' ? true : false;
            if (finishExecution) {
                break;
            }
        } while (true);
    }

    private static void saveInfoToTheFile() {
        String fileNameAndPath = "./src/exercise24/grocery-store.bin";
        try (PrintStream fileWriter = new PrintStream(fileNameAndPath)) {
            fileWriter.print(productInfoContainer.toString());
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to write info to the file.");
            e.printStackTrace();
        }
    }

    private static void addProductInformation() {
        if (aux == 1) {
            productInfoContainer.append("\n");
        }
        System.out.print("Enter the product's code: ");
        int productCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the product's descritpion: ");
        String productDescription = sc.nextLine();

        System.out.print("Enter the product's quantity: ");
        int productQuantity = sc.nextInt();
        sc.nextLine();

        productInfoContainer.append("Code: " + productCode);
        productInfoContainer.append(", description: " + productDescription);
        productInfoContainer.append(", quantity: " + productQuantity);
        if (aux == 0) {
            aux += 1;
        }
    }

    private static void executeOption() {
        systemLoop: {
            while (true) {
                char option = sc.nextLine().toLowerCase().charAt(0);

                switch (option) {
                    case '1':
                        addProductInformation();
                        break systemLoop;
                    case '2':
                        System.out.println();
                        break systemLoop;
                    case '3':
                        saveInfoToTheFile();
                        break systemLoop;
                    case '4':
                        System.out.println();
                        break systemLoop;
                    case '5':
                        System.out.println();
                        break systemLoop;
                    default:
                        System.out.println("\nInvalid option! Try again.");
                        printMenu();
                }
            }
        }
    }

    private static void printMenu() {
        System.out.print(
                "---------- Menu ----------\n"
                        + "1 - Enter product information\n"
                        + "2 - Remove a product certain product from the stock\n"
                        + "3 - Save last updates\n"
                        + "4 - Print general report\n"
                        + "5 - Print report of non-available products\n"
                        + "Choose your option: ");
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
