import java.util.Locale;
import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option.");

        calculation: {
            do {
                System.out.print("Enter a number: ");
                int n1 = sc.nextInt();

                System.out.print("Enter a second number: ");
                int n2 = sc.nextInt();
                
                System.out.println(
                        "\nOption 1: addtion\n"
                                + "Option 2: subtraction\n"
                                + "Option 3: multiplication\n"
                                + "Option 4: division\n"
                                + "Option 5: exit\n");

                System.out.print("Enter your option: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Result: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Result: " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println("Result: " + (n1 * n2));
                        break;
                    case 4:
                        if (n2 == 0) {
                            System.out.println("A division by zero does not exist!");
                        } else {
                            System.out.println("Result: " + (n1 / (float)n2));
                        }
                        break;
                    case 5:
                        break calculation;
                }
            } while (true);
        }

        sc.close();
    }
}
