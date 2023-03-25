package exercise1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {

    private static int id;
    private static String name;
    private static String phone;
    private static Schedule schedule;
    private static Scanner sc;

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        sc = new Scanner(System.in);

        int amount = validateAmount();
        schedule = new Schedule(amount);

        loop_while: {
            while (true) {
                printMenu();
                int option = validateOption();
                switch (option) {
                    case 1:
                        enterNewContact();
                        break;
                    case 2:
                        findContact();
                        break;
                    case 3:
                        break loop_while;
                    default:
                        System.out.println("Invalid option!");
                }
            }
        }

        System.out.println("See you next time! :-)");

        sc.close();
    }

    static void printMenu() {
        System.out.println("------Enter an option------");
        System.out.println("1 - Enter a new contact.");
        System.out.println("2 - Show a contact.");
        System.out.println("3 - Exit.");
    }

    static void enterNewContact() {
        System.out.print("Enter the contact name: ");
        name = sc.next();

        System.out.print("Enter the contact phone: ");
        phone = sc.next();

        try {
            schedule.addContact(new Contact(name, phone));
        } catch (FullScheduleException e) {
            System.out.println(e.getMessage());
        }
    }

    static void findContact() {
        System.out.print("Enter the contact id to be found: ");
        try {
            id = sc.nextInt();
            System.out.println(schedule.showContact(id));
        } catch (ContactDoesNotExistException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    static int validateAmount() {
        int amount = 0;
        while (true) {
            try {
                System.out.print("How many contacts do you want to enter? ");
                amount = sc.nextInt();
                if (amount > 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("You entered a text instead of an integer!");
                sc.next();
            }
        }
        return amount;
    }

    static int validateOption() {
        int option = 0;
        while (true) {
            try {
                option = sc.nextInt();
                if (option == 0 || option != 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("You entered a text instead of an integer!");
                sc.next();
            }
        }
        return option;
    }
}
