package exercise22;

import java.util.Locale;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the the name of the schedule: ");
        String scheduleName = sc.nextLine();

        System.out.println("Now enter the contacts of this schedule.");
        Contact[] contacts = new Contact[3];
        String name;
        String phoneNumber;
        String email;
        for (int i = 0; i < contacts.length; i += 1) {
            System.out.print("Enter the " + (i + 1) + "° contact's name: ");
            name = sc.next();

            System.out.print("Enter the " + (i + 1) + "° contact's phone: ");
            phoneNumber = sc.next();

            System.out.print("Enter the " + (i + 1) + "° contact's email: ");
            email = sc.next();
            Contact contact = new Contact(name, phoneNumber, email);
            contacts[i] = contact;
        }

        Schedule schedule = new Schedule(scheduleName, contacts);

        System.out.print("Enter a phone number to search a contact: ");
        phoneNumber = sc.next();

        schedule.showContact(phoneNumber);

        schedule.showAllContacts();

        sc.close();
    }
}
