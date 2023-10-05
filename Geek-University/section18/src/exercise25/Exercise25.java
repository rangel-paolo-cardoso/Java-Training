package exercise25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here contain fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise25 {

    private static Scanner sc = getScanner();
    private static String path = "./src/exercise25/contacts.txt";
    
    public static void main(String[] args) {

        do {
            printMenu();
            break;
        } while (true);
        
        sc.close();
    }

    private static void printMenu() {
        System.out.print(
            "=============== MENU ===============\n"
            + "1 - Insert contact info\n"
            + "2 - Remove contact info\n"
            + "3 - Seacrh a contact by name\n"
            + "4 - List all contacts"
            + "5 - List all contact starting with a given letter"
            + "6 - List everyone who have a birtday in the current month\n"
            + "Enter your option: "
        );
    }

    private static Scanner getScannerFileReader() throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
