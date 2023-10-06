package exercise25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim paolorangel1996@outlook.com
 * @apiNote 
 * <p>All the files here contain fake names and numbers, 
 * except the author's name of course.
 * </p>
 */
public class Exercise25 {

    private static StringBuilder contacts = new StringBuilder();
    private static Scanner sc = getScanner();
    private static String path = "./src/exercise25/contacts.txt";
    private static byte aux = 0;

    public static void main(String[] args) {

        do {
            printMenu();
            executeOption();
            break;
        } while (true);

        sc.close();
    }

    private static void executeOption() {
        systemLoop: {
            while (true) {
                char option = sc.nextLine().toLowerCase().charAt(0);
                switch (option) {
                    case '1':
                        insertContactInfo();
                        break systemLoop;
                    case '2':
                        removeContactInfo();
                        break systemLoop;
                    case '3':
                        searchContactByName();
                        break systemLoop;
                    case '4':
                        listAllContacts();
                        break systemLoop;
                    case '5':
                        listContactsByFirstLetterName();
                        break systemLoop;
                    case '6':
                        listContactsByBirthdaysOfCurrentMonth();
                        break systemLoop;
                    default:
                        System.out.println("\nInvalid option! Try again.");
                        printMenu();
                }
            }
        }
    }

    private static void flushCachedContats() {
        contacts.setLength(0);
    }

    private static void saveInfoToTheFile(boolean edit) {
        try (PrintStream fileWriter = new PrintStream(new FileOutputStream(path, edit))) {
            fileWriter.print(contacts.toString());
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while trying to write info to the file.");
            e.printStackTrace();
        }
    }

    private static boolean validateBirthday(String birthday) {
        return birthday.matches("^\\d{2}/\\d{2}$");
    }

    private static void insertContactInfo() {
        System.out.print("Enter the name of the contact: ");
        String name = sc.nextLine();

        System.out.print("Enter the contact's phone: ");
        String phone = sc.nextLine();

        boolean isValidBirthday = false;
        String birthday;
        while (true) {
            System.out.print("Enter the contact's birthday (day and month like dd/mm): ");
            birthday = sc.nextLine();
            isValidBirthday = validateBirthday(birthday);
            if (isValidBirthday) {
                break;
            }
            System.out.println("Invalid date format! Please, try again.");
        }
        contacts.append("Name: " + name);
        contacts.append(", phone: " + phone);
        contacts.append(", birthday: " + birthday);
        contacts.append("\n");
        saveInfoToTheFile(true);
        flushCachedContats();
    }

    private static void removeContactInfo() {
    }

    private static void searchContactByName() {
    }

    private static void listAllContacts() {
    }

    private static void listContactsByFirstLetterName() {
    }

    private static void listContactsByBirthdaysOfCurrentMonth() {
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
                        + "Enter your option: ");
    }

    private static Scanner getScannerFileReader() throws FileNotFoundException {
        return new Scanner(new FileInputStream(path));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
