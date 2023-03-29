import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double average = 0.0;

        int count = 1;
        while (true) {
            System.out.print("Enter the " + count + "º number: ");
            double number = sc.nextInt();
            average += number;
            if (count == 5) {
                average /= 5.0;
                break;
            }
            count += 1;
        }

        System.out.println("The average is " + String.format("%.2f", average));

        sc.close();
    }
}
