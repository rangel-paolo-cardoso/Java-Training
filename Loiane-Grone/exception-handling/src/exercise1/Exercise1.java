package exercise1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

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

        Schedule schedule = new Schedule(amount);

        int id;
        String name;
        String phone;
        for (int i = 0; i < amount; i += 1) {
            System.out.print("Enter the contact name: ");
            name = sc.next();

            System.out.print("Enter the contact phone: ");
            phone = sc.next();

            schedule.addContact(new Contact(name, phone));
        }

        while (true) {
            System.out.println("------Enter an option------");
            System.out.println("1 - Enter a new contact.");
            System.out.println("2 - Show a contact.");
            System.out.print("3 - Exit.");
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

            if (option == 1) {
                System.out.print("Enter the contact name: ");
                name = sc.next();

                System.out.print("Enter the contact phone: ");
                phone = sc.next();

                try {
                    schedule.addContact(new Contact(name, phone));
                } catch (FullScheduleException e) {
                    System.out.println(e.getMessage());
                }
            } else if (option == 2) {
                System.out.print("Enter the contact id to be found: ");
                try {
                    id = sc.nextInt();
                    System.out.println(schedule.showContact(id));
                } catch (ContactDoesNotExistException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }

        System.out.println("See you next time! :-)");

        sc.close();
    }
}
