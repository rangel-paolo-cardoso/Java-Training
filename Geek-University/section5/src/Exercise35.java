import java.util.Locale;
import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the inital value: ");
        int start = sc.nextInt();

        System.out.print("Enter the final value: ");
        int end = sc.nextInt();

        int sumOfOddNumbers = 0;

        if (start > end) {
            System.out.println("Invalid range of values!");
        } else {
            do {
                if (start % 2 != 0) {
                    sumOfOddNumbers += start;
                }
                start += 1;
            } while (start <= end);
            System.out.println("Sum of the odd numbers: " + sumOfOddNumbers);
        }

        sc.close();   
    }
}
