import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int oddNumbers = 0;
        int evenNumbers = 0;

        for (int count = 1; count < 11; count += 1) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                evenNumbers += 1;
            } else {
                oddNumbers += 1;
            }
        }

        System.out.println("Even numbers: " +  evenNumbers);
        System.out.println("Odd numbers: " +  oddNumbers);
        
        sc.close();
    }
}
