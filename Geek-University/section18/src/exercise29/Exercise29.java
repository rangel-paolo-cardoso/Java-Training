package exercise29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Exercise29 {

    private static final String pathAndName = "./src/exercise29/sale-info.txt";
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
                byte option = sc.nextByte();
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
                        printRecords();
                        break systemLoop;
                    case 6:
                        deleteDataFile();
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
        writeContentToTheFile(false, pathAndName);
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

        fileContent.append("seller_code: " + sellerCode);
        fileContent.append(", selle name: " + sellerName);
        fileContent.append(", sale value: " + saleValue);
        fileContent.append(", sale month: " + saleMonth + "\n");
        boolean saleExists = checkSaleInfoExistence(sellerCode, saleMonth);
        if (saleExists) {
            System.out.printf(
                "The sale information already exists for seller code %d and sale month %d %n",
                sellerCode, saleMonth
            );
        } else {
            writeContentToTheFile(true, pathAndName);
        }
    }

    private static boolean checkSaleInfoExistence(int sellerCode, byte saleMonth) {
        try {
            String[] fileContent = readFileContent(getFileReader()).split("\n");
            if (fileContent.length == 0) {
                return false;
            }
            for (String saleInfo : fileContent) {
                int code = Integer.parseInt(saleInfo.split(",")[0].split("seller_code: ")[1]);
                byte month = Byte.parseByte(saleInfo.split(",")[3].split(" sale month: ")[1]);
                if (code == sellerCode && month == saleMonth) {
                    return false;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to read the file.");
            e.printStackTrace();
        }
        return true;
    }

    private static void printRecords() {
        try {
            String fileContent = readFileContent(getFileReader());
            System.out.println("\n========== Recods' information ==========");
            System.out.print(fileContent);
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to read the file.");
            e.printStackTrace();
        }
    }

    private static String readFileContent(Scanner sc) {
        StringBuilder fileContent = new StringBuilder();
        while (sc.hasNextLine()) {
            fileContent.append(sc.nextLine());
            fileContent.append("\n");
        }
        return fileContent.toString();
    }

    private static void writeContentToTheFile(boolean append, String filePathAndName) {
        try (PrintStream fileWriter = new PrintStream(new FileOutputStream(filePathAndName, append))) {
            fileWriter.print(fileContent.toString());
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

    private static void deleteDataFile() {
        try {
            File file = new File(pathAndName);
            if (file.delete()) {
                System.out.println("\nFile deleted successfully!");
            } else {
                System.out.println("\nFailed to delete the file.");
            }
        } catch (SecurityException e) {
            System.out.println("It was not possible to delete the file. Try again later.");
        }
    }

    private static Scanner getFileReader() throws FileNotFoundException {
        return new Scanner(new FileInputStream(pathAndName));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
