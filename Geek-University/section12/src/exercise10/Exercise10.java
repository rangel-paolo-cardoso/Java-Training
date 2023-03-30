package exercise10;

import java.util.Locale;
import java.util.Scanner;

import exercise10.overload.Person;

public class Exercise10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Person person = new Person();
        System.out.print("Enter the person's code: ");
        person.setCode(sc.nextInt());

        System.out.print("Enter the person's name: ");
        person.setName(sc.next());

        System.out.print("Enter the person's age: ");
        person.setAge(sc.nextInt());

        Person person2 = new Person(sc.nextInt(), sc.next(), sc.nextInt());

        System.out.println(person.showData());
        System.out.println(person2.showData());

        System.out.print("Enter 1 to show the data with the age: ");
        System.out.println(person.showData(sc.nextInt()));

        System.out.print("Enter a number different than 1 to ommit the age: ");
        System.out.println(person.showData(sc.nextInt()));

        sc.close();
    }
}
