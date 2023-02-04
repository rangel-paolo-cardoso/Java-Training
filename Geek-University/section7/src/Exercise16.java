import java.util.Locale;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[5];
        int code;

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the" + (pos + 1) + "° value: ");
            numbers[pos] = sc.nextDouble();
        }

        while (true) {
            System.out.print("Enter the code: ");
            code = sc.nextInt();
            if (code == 0) {
                break;
            } else if (code == 1) {
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print(numbers[i] + " ");
                }
            } else if (code == 2) {
                for (int i = numbers.length - 1; i > -1; i--) {
                    System.out.print(numbers[i] + " ");
                }
            } else {
                System.out.println("Invalid code!");
            }
            System.out.println();
        }

        sc.close();
    }
}
