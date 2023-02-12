import java.util.Locale;
import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        boolean sorted = true;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "º to the array: ");
            numbers[i] = sc.nextInt();
        }
        sc.close();

        while (true) {
            sorted = true;
            for (int i = 0; i < numbers.length; i++) {
                if (i < numbers.length - 1) {
                    if (numbers[i] > numbers[i + 1]) {
                        double next = numbers[i + 1];
                        numbers[i + 1] = numbers[i];
                        numbers[i] = next;
                    }
                } else {
                    break;
                }
            }
            for (int i = 0; i < numbers.length; i++) {
                if (i < numbers.length - 1) {
                    if (numbers[i] > numbers[i + 1]) {
                        sorted = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (sorted) {
                break;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
