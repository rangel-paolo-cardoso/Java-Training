package exercise24;

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
public class Exercise24 {

    public static void main(String[] args) {
        Scanner sc = getScanner();

        byte aux = 0;
        StringBuilder productInfoContainer = new StringBuilder();
        int productCode;
        String productDescription;
        int productQuantity;
        do {
            printMenu();
            char option = sc.nextLine().toLowerCase().charAt(0);
            if (option != 'y') {
                break;
            }
            if (aux > 0) {
                productInfoContainer.append("\n");
            }
            System.out.print("Enter the product's code: ");
            productCode = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the product's descritpion: ");
            productDescription = sc.nextLine();

            System.out.print("Enter the product's quantity: ");
            productQuantity = sc.nextInt();
            sc.nextLine();

            addPorductInfoToTheInfoContainer(
                    productInfoContainer,
                    productCode,
                    productDescription,
                    productQuantity);
            if (aux == 0) {
                aux += 1;
            }
        } while (true);

        saveInfoToTheFile(productInfoContainer, sc);
    }

    private static void saveInfoToTheFile(StringBuilder productInfoContainer, Scanner sc) {
        String fileNameAndPath = sc.nextLine();
        try (PrintStream fileWriter = new PrintStream(fileNameAndPath)) {
            fileWriter.print(productInfoContainer.toString());
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to write info to the file.");
            e.printStackTrace();
        }
    }

    private static void addPorductInfoToTheInfoContainer(
            StringBuilder productInfoContainer,
            int productCode,
            String productDescription, int productQuantity) {
        productInfoContainer.append("Code: " + productCode);
        productInfoContainer.append(", description: " + productDescription);
        productInfoContainer.append(", quantity: " + productQuantity);
    }

    private static void printMenu() {
        System.out.print("Do you want to enter a product information?\n"
                + "Enter Y (Yes) or press any other key to stop: ");
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
