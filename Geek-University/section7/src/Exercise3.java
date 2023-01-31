import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] numbersSquared = new int[numbers.length];

        for (int pos = 0; pos < numbers.length; pos +=1 ) {
            System.out.print("Enter the " + (pos + 1) + "° value: ");
            int value = sc.nextInt();
            numbers[pos] = value;
            numbersSquared[pos] = value * value;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < numbersSquared.length; i++) {
            System.out.println(numbersSquared[i]);
        }

        sc.close();
    }
}
