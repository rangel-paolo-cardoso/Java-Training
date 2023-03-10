package exercise2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Schedule schedule = new Schedule();

        schedule.registerPerson(new Person("Rangel Cardoso", 26, 1.75));
        schedule.registerPerson(new Person("Mikołaja Kopernika", 70, 1.72));
        schedule.registerPerson(new Person("Isaac Newton", 84, 1.68));
        schedule.registerPerson(new Person("Stephen Hawking", 76, 1.70));
        schedule.registerPerson(new Person("Albert Einstein", 76, 1.73));
        schedule.registerPerson(new Person("Nikola Tesla", 86, 1.88));
        schedule.registerPerson(new Person("Leonardo da Vinci", 67, 1.73));
        schedule.registerPerson(new Person("Carl Gustav Jakob Jacobi", 46, 1.68));
        schedule.registerPerson(new Person("Steve Jobs", 56, 1.88));

        System.out.print("Enter a famous person's name: ");
        String name = sc.nextLine();

        System.out.print("Enter a famous person's age: ");
        int age = sc.nextInt();

        System.out.print("Enter a famous person's height: ");
        double height = sc.nextDouble();

        schedule.registerPerson(new Person(name, age, height));

        schedule.printSchedule();

        System.out.print("Now enter the name of a person to remove: ");
        name = sc.nextLine();

        schedule.removePerson(name);

        schedule.printSchedule();

        System.out.print("Enter the name of a person to find their position: ");
        name = sc.nextLine();

        int position = schedule.searchPerson(name);
        if (position > -1) {
            System.out.println("The position is " + position);
        } else {
            System.out.println("Position not found!");
        }

        schedule.printSchedule();

        System.out.print("Enter the index of a person to print their info: ");
        int index = sc.nextInt();

        schedule.printPerson(index);

        sc.close();
    }
}
