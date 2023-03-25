package exercise1;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        System.out.print("Enter an address: ");
        String address = sc.nextLine();

        System.out.print("Enter a telephone number: ");
        String telephone = sc.nextLine();

        Person person = new Person(name, address, telephone);

        System.out.println(person);        

        sc.close();
    }
}
