import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your sex: ");
        char sex = sc.next().toLowerCase().charAt(0);

        System.out.print("Enter your marital status: ");
        char maritalStatus = sc.next().toLowerCase().charAt(0);

        while (true) {
            if (name.length() < 3) {
                System.out.println("\nInvalid name!");
                System.out.print("Reenter the name: ");
                name = sc.next();
            }
            else if (age < 0 || age > 150) {
                System.out.println("Invalid age!");
                System.out.print("Reenter the age: ");
                age = sc.nextInt();
            }
            else if (salary < 0) {
                System.out.println("Invalid salary!");
                System.out.print("Reenter the salary: ");
                salary = sc.nextDouble();
            }
            else if ((sex != 'm' && sex != 'f')) {
                System.out.println("Invalid sex!");
                System.out.print("Reenter the sex: ");
                sex = sc.next().toLowerCase().charAt(0);
            }
            else if (
                maritalStatus != 's'
                && maritalStatus != 'c'
                && maritalStatus != 'v'
                && maritalStatus != 'd'
            ) {
                System.out.println("Invalid marital status!");
                System.out.print("Reenter the marital status: ");
                maritalStatus = sc.next().toLowerCase().charAt(0);
            }
            else {
                break;
            }
        }

        sc.close();
    }
}
