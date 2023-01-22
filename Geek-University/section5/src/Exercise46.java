import java.util.Locale;
import java.util.Scanner;

public class Exercise46 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = (int) (Math.random() * 1000) + 1;

        System.out.println("Try to guess a number between 1 and 1000 (including both).");

        do {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("You got it!");
                System.out.println("The number was " + number);
                break;
            } else {
                System.out.println("That's wrong! Try again");
            }
        } while (true);

        sc.close();
    }
}
