import java.util.Locale;
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter: ");
        int n = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;
        int sum = 0;

        while (n < 0 || n > 1000) {
            System.out.print("Reenter the amount of numbers: ");
            n = sc.nextInt();
        }

        for (int count = 1; count < n + 1; count += 1) {
            System.out.print("Enter the " + count + "º number: ");
            int number = sc.nextInt();
            if (number > biggest) {
                biggest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
            sum += number;
        }

        System.out.println("The biggest one is " + biggest);
        System.out.println("The smallest one is " + smallest);
        System.out.println("The sum is " + sum);

        sc.close();
    }
}
