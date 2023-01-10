import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate the table: ");
        int number = sc.nextInt();
        int count = 1;

        do {
            System.out.println(number + " x " + count + " = " + (number * count));
            count += 1;
        } while (count < 11);
        
        sc.close();
    }
}
