import java.util.Locale;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        String multiples = "";
        
        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the" + (pos + 1) + "° value: ");
            numbers[pos] = sc.nextInt();
        }

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % x == 0) {
                multiples += numbers[i] + " ";
            }
        }

        System.out.println("The multiples of " + x + " are " + multiples);

        sc.close();
    }
}
