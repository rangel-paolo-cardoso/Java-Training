import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a user name: ");
        String username = sc.next();

        System.out.print("Enter a a password: ");
        String password = sc.next();

        while (username.equals(password)) {
            System.out.println("Username and password cannot be the same!");
            System.out.print("Reenter the username: ");
            username = sc.next();

            System.out.print("Reenter the password: ");
            password = sc.next();
        }

        System.out.println("Account successfully created!");

        sc.close();
    }
}
