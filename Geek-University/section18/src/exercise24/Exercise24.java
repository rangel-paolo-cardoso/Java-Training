package exercise24;

import java.io.FileInputStream;
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

    private static StringBuilder productInfoContainer = new StringBuilder();
    private static Scanner sc = getScanner();
    private static byte aux = 0;
    private static String path = "./src/exercise24/grocery-store.bin";

    public static void main(String[] args) {

        boolean finishExecution = false;
        do {
            printMenu();
            executeOption();
            System.out.println(
                    "Do you want to finish now? (Attention: If you did not save, the information will be lost)");
            System.out.print("Enter Y (Yes) or any another key to continue: ");
            finishExecution = sc.nextLine().toLowerCase().charAt(0) == 'y' ? true : false;
            if (finishExecution) {
                break;
            }
        } while (true);

        sc.close();
    }

    private static void saveInfoToTheFile() {
        try (PrintStream fileWriter = new PrintStream(path)) {
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
        saveInfoToTheFile();
    }

    private static void removeProductFromStock() {
        String[] fileContent = readAndGetFileContent().split("\n");
        System.out.print("Enter the code of the product to be removed: ");
        String productCodeToBeRemoved = sc.nextLine();

        System.out.print("How many products do you want to remove? ");
        int productQuantityToBeRemove = sc.nextInt();
        sc.nextLine();

        String flag = "Code: " + productCodeToBeRemoved;

        int index = 0;
        for (String productInfo : fileContent) {
            if (productInfo.contains(flag)) {
                int productQuantity = Integer.parseInt(productInfo.split("quantity: ")[1]);
                if (productQuantity > 0 && productQuantity >= productQuantityToBeRemove) {
                    fileContent[index] = fileContent[index].replace(
                            "quantity: " + productQuantity,
                            "quantity: " + (productQuantity - productQuantityToBeRemove));
                }
            }
            index += 1;
        }
        productInfoContainer.setLength(0);
        for (int i = 0; i < fileContent.length; i++) {
            productInfoContainer.append(fileContent[i]);
            if (i < fileContent.length - 1) {
                productInfoContainer.append("\n");
            }
        }
        saveInfoToTheFile();
    }

    private static String readAndGetFileContent() {
        StringBuilder fileContent = new StringBuilder();
        try (Scanner scanner = getScannerFileReader()) {
            while (scanner.hasNextLine()) {
                fileContent.append(scanner.nextLine());
                if (scanner.hasNextLine()) {
                    fileContent.append("\n");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to read the file.");
            e.printStackTrace();
        }
        return fileContent.toString();
    }

    private static void printGeneralReport() {
        String fileContent = readAndGetFileContent();
        System.out.println("---------- General Report ----------");
        System.out.println(fileContent);
    }

    private static void printNonAvailableProductsReport() {
        String[] fileContent = readAndGetFileContent().split("\n");
        int count = 0;
        System.out.println("---------- Report of Non-available Products ----------");
        for (String lineContent : fileContent) {
            if (Integer.parseInt(lineContent.split("quantity: ")[1]) == 0) {
                count += 1;
                System.out.println(lineContent);
            }
        }
        if (count == 0) {
            System.out.println("__________ There aren't any products missing __________");
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
                        removeProductFromStock();
                        break systemLoop;
                    case '3':
                        saveInfoToTheFile();
                        break systemLoop;
                    case '4':
                        printGeneralReport();
                        break systemLoop;
                    case '5':
                        printNonAvailableProductsReport();
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
                        + "3 - Print general report\n"
                        + "4 - Print report of non-available products\n"
                        + "Choose your option: ");
    }

    private static Scanner getScannerFileReader() throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
