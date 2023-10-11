package exercise25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Month;
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

    public static void main(String[] args) {

        do {
            printMenu();
            executeOption();
            System.out.print("\nDo you want to continue (Enter Y to continue) ? ");
            char systemBreak = sc.nextLine().toLowerCase().charAt(0);
            if (systemBreak != 'y') {
                break;
            }
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
        } finally {
            flushCachedContats();
            System.out.println("The changes have just gotten updated.");
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
    }

    private static void removeContactInfo() {
        System.out.print("Enter the phone number of the contact that will be removed: ");
        String phoneNumber = sc.nextLine();
        String[] fileContentArray = readAndGetFileContent().split("\n");
        for (String contact : fileContentArray) {
            if (!contact.contains(phoneNumber)) {
                contacts.append(contact);
                contacts.append("\n");
            } else {
                System.out.println("Contact successfully removed!");
            }
        }
        saveInfoToTheFile(false);
    }

    private static void searchContactByName() {
        System.out.print("Enter the contact name: ");
        String contactName = sc.nextLine();
        String[] fileContentArray = readAndGetFileContent().split("\n");
        for (String contact : fileContentArray) {
            if (contact.contains(contactName)) {
                System.out.println("======= Contact Information =======");
                System.out.println(contact);
                break;
            }
        }
    }

    private static void listAllContacts() {
        String fileContent = readAndGetFileContent();
        System.out.println("========== Contact List ==========");
        System.out.println(fileContent);
    }

    private static void listContactsByFirstLetterName() {
        System.out.print("Enter a letter to search contacts with a name starting with it: ");
        char firstLetter = sc.nextLine().toUpperCase().charAt(0);
        String[] fileContent = readAndGetFileContent().split("\n");
        System.out.printf("========== Contacts with a name starting with  ==========\n", firstLetter);
        for (String contact : fileContent) {
            String name = contact.split(",")[0].substring(6);
            if (name.toUpperCase().charAt(0) == firstLetter) {
                System.out.println(contact);
            }
        }
    }

    private static void listContactsByBirthdaysOfCurrentMonth() {
        String[] fileContent = readAndGetFileContent().split("\n");
        Month currentMonth = LocalDate.now().getMonth();
        String birthMonth;
        System.out.println("========== Birthdas of the Month ==========");
        for (String contact : fileContent) {
            birthMonth = contact.split("birthday: ")[1].split("/")[1];
            if (Integer.parseInt(birthMonth) == currentMonth.getValue()) {
                System.out.println(contact);
            }
        }
    }

    private static String readAndGetFileContent() {
        StringBuilder fileContent = new StringBuilder();
        try (Scanner scanner = getScannerFileReader()) {
            System.out.println("Test: " + scanner.toString());
            while (scanner.hasNextLine()) {
                fileContent.append(scanner.nextLine());
                fileContent.append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileContent.toString();
    }

    private static void printMenu() {
        System.out.print(
                "=============== MENU ===============\n"
                        + "1 - Insert contact info\n"
                        + "2 - Remove contact info\n"
                        + "3 - Seacrh a contact by name\n"
                        + "4 - List all contacts\n"
                        + "5 - List all contact starting with a given letter\n"
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
