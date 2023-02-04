import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[20];
        // boolean repeatedNumber = false;

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the" + (pos + 1) + "° value: ");
            int value = sc.nextInt();
            while (true) {
                boolean repeatedNumber = false;
                for (int i = 0; i < numbers.length; i += 1) {
                    if (value == numbers[i]) {
                        repeatedNumber = true;
                        break;
                    }
                }
                if (repeatedNumber) {
                    System.out.println("Number already exists!");
                    System.out.print("Renter the" + (pos + 1) + "° value: ");
                    value = sc.nextInt();
                } else {
                    break;
                }
            }
            numbers[pos] = value;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
